package org.peimari.gleaflet.esri.client;

import org.peimari.gleaflet.client.TileLayer;
import org.peimari.gleaflet.esri.client.resources.EsriLeafletResourceInjector;

public class TiledMapLayer extends TileLayer {

    static {
        EsriLeafletResourceInjector.ensureInjected();
    }

    protected TiledMapLayer() {
    }

    public static native TiledMapLayer create(TiledMapLayerOptions options)
    /*-{
        return new $wnd.L.esri.tiledMapLayer(options);
    }-*/;
}
