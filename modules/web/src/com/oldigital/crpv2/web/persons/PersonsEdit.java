package com.oldigital.crpv2.web.persons;

import com.haulmont.cuba.core.app.FileStorageService;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.global.FileStorageException;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.components.Embedded;
import com.haulmont.cuba.gui.components.FileUploadField;
import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.data.Datasource;
import com.oldigital.crpv2.entity.Persons;
import org.slf4j.Logger;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.ByteArrayInputStream;
import java.util.Map;

public class PersonsEdit extends AbstractEditor<Persons> {

    @Inject
    private Embedded personPhoto;

    @Named("fieldGroup.photo")
    private FileUploadField photoField;

    @Inject
    private Datasource<Persons> personsDs;
    @Inject
    private FileStorageService fileStorageService;
    @Inject
    private Logger log;


    /**
     * Called by the framework after creation of all components and before showing the screen.
     * <br> Override this method and put initialization logic here.
     *
     * @param params parameters passed from caller's code, usually from
     *               {@link #openWindow(String, WindowManager.OpenType)} and similar methods, or set in
     *               {@code screens.xml} for this registered screen
     */
    @Override
    public void init(Map<String, Object> params) {
        super.init(params);
    }

    /**
     * Hook to be implemented in subclasses. <br>
     * Called by the framework after the screen is fully initialized and opened. <br>
     * Override this method and put custom initialization logic here.
     */
    @Override
    public void ready() {
        addPhotoChangeListener();
        displayPhoto();
        super.ready();
    }

    private void addPhotoChangeListener() {
        photoField.addFileUploadSucceedListener(e -> {
            getItem().setPhoto(photoField.getValue());
            displayPhoto();
        });
        personsDs.addItemPropertyChangeListener(e -> {
            if ("photo".equals(e.getProperty())) {
                if (e.getValue() == null) {
                    personPhoto.setVisible(false);
                }
            }
        });
    }
    private void displayPhoto() {
        byte[] bytes = null;
        FileDescriptor photo = getItem().getPhoto();
        if (photo != null) {
            try {
                bytes = fileStorageService.loadFile(photo);
            } catch (FileStorageException e) {
                log.error("Unable to load image file", e);
                showNotification("Unable to load image file", NotificationType.HUMANIZED);
            }
        }
        if (bytes != null) {
            personPhoto.setSource(photo.getName(), new ByteArrayInputStream(bytes));
            personPhoto.setType(Embedded.Type.IMAGE);
            personPhoto.setVisible(false);
            personPhoto.setVisible(true);
        } else {
            personPhoto.setVisible(false);
        }
    }
}