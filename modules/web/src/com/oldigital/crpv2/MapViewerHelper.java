package com.oldigital.crpv2;

import com.haulmont.charts.gui.components.map.MapViewer;
import com.haulmont.charts.gui.map.model.GeoPoint;
import com.haulmont.charts.gui.map.model.Polygon;

import java.util.ArrayList;
import java.util.List;

public class MapViewerHelper {

    /**
     * Converts {@link Polygon} object to its <a href="https://en.wikipedia.org/wiki/Well-known_text">WKT</a> representation.
     *
     * @param polygon polygon object
     * @return WKT string
     */
    public static String mapPolygonToWKTPolygon(Polygon polygon) {
        String polygonString = "POLYGON ((";
        String firstVertex = "";
        List<GeoPoint> coordinates = polygon.getCoordinates();
        int count = 0;
        for (GeoPoint geoPoint : coordinates) {
            polygonString = polygonString + geoPoint.getLongitude().toString() + " " +
                    geoPoint.getLatitude().toString();
            if (count == 0) {
                firstVertex = geoPoint.getLongitude().toString() + " " +
                        geoPoint.getLatitude().toString();
            }
            count++;
            polygonString = polygonString + ", ";
        }
        polygonString = polygonString + firstVertex;
        polygonString = polygonString + "))";
        return polygonString;
    }

    /**
     * Converts <a href="https://en.wikipedia.org/wiki/Well-known_text">WKT</a> polygon representation to a {@link Polygon} object.
     *
     * @param map           map component
     * @param wktPolygon    WKT string
     * @return  polygon object
     */
    public static Polygon WKTPolygonToMapPolygon(MapViewer map, String wktPolygon) {
        if (wktPolygon == null || map == null) {
            return null;
        }
        String coordinateString = wktPolygon.substring(10, wktPolygon.length() - 2);
        String[] coordinatePairs = coordinateString.split(",");
        List<GeoPoint> geoPoints = new ArrayList<>(coordinatePairs.length);
        for (String pair : coordinatePairs) {
            String[] lonLat = pair.trim().split(" ");
            geoPoints.add(map.createGeoPoint(Double.valueOf(lonLat[1]), Double.valueOf(lonLat[0])));
        }
        return map.createPolygon(geoPoints);
    }

    /**
     * Get center of a polygon.
     *
     * @param polygon   polygon object
     * @return  double[2] containing center coordinates
     */
    public static double[] getCenter(Polygon polygon) {
        double lat = 0;
        double lon = 0;
        List<GeoPoint> geoPoints = polygon.getCoordinates();
        for (GeoPoint geoPoint : geoPoints) {
            lat = lat + geoPoint.getLatitude();
            lon = lon + geoPoint.getLongitude();
        }
        return new double[]{lat / geoPoints.size(), lon / geoPoints.size()};
    }
    public static double[] findBoundingBoxForGivenLocations(Polygon polygon)
    {
        double west = 0.0;
        double east = 0.0;
        double north = 0.0;
        double south = 0.0;
        int lc = 0;

        for (GeoPoint geoPoint:polygon.getCoordinates())
        {
            if (lc == 0)
            {
                north = geoPoint.getLatitude();
                south =geoPoint.getLatitude();
                west = geoPoint.getLongitude();
                east = geoPoint.getLongitude();
            }
            else
            {
                if (geoPoint.getLatitude() > north)
                {
                    north = geoPoint.getLatitude();
                }
                else if (geoPoint.getLatitude() < south)
                {
                    south = geoPoint.getLatitude();
                }
                if (geoPoint.getLongitude() < west)
                {
                    west = geoPoint.getLongitude();
                }
                else if (geoPoint.getLongitude() > east)
                {
                    east = geoPoint.getLongitude();
                }
            }
            lc++;
        }

        // OPTIONAL - Add some extra "padding" for better map display
        double padding = 0.00;
        north = north + padding;
        south = south - padding;
        west = west - padding;
        east = east + padding;
        double resp[] = {north, east, south, west};
        return resp;
    }
}
