package com.oldigital.crpv2.web.cadastre;

import com.haulmont.charts.gui.components.map.MapViewer;
import com.haulmont.charts.gui.map.model.GeoPoint;
import com.haulmont.charts.gui.map.model.Polygon;
import com.haulmont.charts.gui.map.model.drawing.*;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.components.Button;
import com.oldigital.crpv2.MapViewerHelper;
import com.oldigital.crpv2.entity.Cadastre;

import javax.inject.Inject;
import java.util.Collections;

public class CadastreEdit extends AbstractEditor<Cadastre> {

    private final static String POLYGON_COLOR = "#ffe133";
    private final static Double POLYGON_OPACITY = 0.5;

    @Inject
    private MapViewer map;
    @Inject
    private Button removePolygonButton;

    private Polygon existingPolygon;

    @Override
    public void ready() {
        initTerritoryChangeListener();
        addExistingPolygonOverlay();
        addDrawingMode();
        setMapCenter();
        super.ready();
    }

    private void addDrawingMode() {
        if (existingPolygon == null) {
            initDrawingMode();
        }
    }

    private void initTerritoryChangeListener() {
        getItem().addListener((item, property, prevValue, value) -> {
            if ("polygonGeometry".equals(property)) {
                if (value == null) {
                    removePolygonButton.setEnabled(false);
                } else {
                    removePolygonButton.setEnabled(true);
                }
            }
        });
    }

    public void removePolygon() {
        getItem().setPolygonGeometry(null);
        map.removePolygonOverlay(existingPolygon);
        existingPolygon = null;
        initDrawingMode();
    }

    private void addExistingPolygonOverlay() {
        existingPolygon = MapViewerHelper.WKTPolygonToMapPolygon(map, getItem().getPolygonGeometry());
        if (existingPolygon != null) {
            existingPolygon.setFillColor(POLYGON_COLOR);
            existingPolygon.setFillOpacity(POLYGON_OPACITY);
            existingPolygon.setEditable(true);
            map.addPolygonOverlay(existingPolygon);
            double bounds[] = MapViewerHelper.findBoundingBoxForGivenLocations(existingPolygon);
            GeoPoint NE = map.createGeoPoint(bounds[0], bounds[1]);
            GeoPoint SW = map.createGeoPoint(bounds[2], bounds[3]);
            map.fitToBounds(NE,SW);
            addPolygonEditListener();
            removePolygonButton.setEnabled(true);
        }
    }

    private void setMapCenter() {
        if (getItem().getPolygonGeometry() != null) {
            Polygon polygon = MapViewerHelper.WKTPolygonToMapPolygon(map, getItem().getPolygonGeometry());
            double[] center = MapViewerHelper.getCenter(polygon);
            GeoPoint centerPoint = map.createGeoPoint(center[0], center[1]);
            map.setCenter(centerPoint);
        }
        else{
            //1.2669074,36.8064828,16.75z
            GeoPoint centerPoint = map.createGeoPoint(1.2669074,36.8064828);
            map.setCenter(centerPoint);
            map.setZoom(16);
        }
    }

    private void initDrawingMode() {
        DrawingOptions drawingOptions = new DrawingOptions();
        PolygonOptions polygonOptions = new PolygonOptions(false, true, POLYGON_COLOR, POLYGON_OPACITY);
        polygonOptions.setStrokeWeight(1);
        CircleOptions circleOptions = new CircleOptions();
        ControlOptions controlOptions = new ControlOptions(Position.TOP_CENTER, Collections.singletonList(OverlayType.POLYGON));
        drawingOptions.setPolygonOptions(polygonOptions);
        drawingOptions.setCircleOptions(circleOptions);
        drawingOptions.setEnableDrawingControl(true);
        drawingOptions.setDrawingControlOptions(controlOptions);
        map.setDrawingOptions(drawingOptions);
        map.addPolygonCompleteListener(event -> {
            getItem().setPolygonGeometry(MapViewerHelper.mapPolygonToWKTPolygon(event.getPolygon()));
            existingPolygon = event.getPolygon();
            map.setDrawingOptions(null);
        });
        addPolygonEditListener();
    }

    private void addPolygonEditListener() {
        map.addPolygonEditListener(polygonEditEvent -> {
            getItem().setPolygonGeometry(MapViewerHelper.mapPolygonToWKTPolygon(polygonEditEvent.getPolygon()));
            existingPolygon = polygonEditEvent.getPolygon();
        });
    }

}