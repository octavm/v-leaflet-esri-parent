package org.peimari.gleaflet.esri.client;

import org.peimari.gleaflet.client.TileLayer;
import org.peimari.gleaflet.esri.client.resources.EsriLeafletResourceInjector;

public class BasemapLayer extends TileLayer {

    static {
        EsriLeafletResourceInjector.ensureInjected();
    }

    protected BasemapLayer() {
    }

    public static native BasemapLayer create(String key, BasemapLayerOptions options)
    /*-{
        return new $wnd.L.esri.basemapLayer(key, options);
    }-*/;
}
