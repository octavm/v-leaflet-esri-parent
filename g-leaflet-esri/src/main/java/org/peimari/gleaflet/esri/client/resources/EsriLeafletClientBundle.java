package org.peimari.gleaflet.esri.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.TextResource;

public interface EsriLeafletClientBundle extends ClientBundle {

    @DataResource.DoNotEmbed
    @Source("esri-leaflet.js")
    TextResource esri();
}
