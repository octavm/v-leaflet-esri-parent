package org.peimari.gleaflet.esri.client;

import org.peimari.gleaflet.client.Layer;
import org.peimari.gleaflet.esri.client.resources.EsriLeafletResourceInjector;

public class DynamicMapLayer extends Layer {

    static {
        EsriLeafletResourceInjector.ensureInjected();
    }

    protected DynamicMapLayer() {
    }

    public static native DynamicMapLayer create(DynamicMapLayerOptions options) /*-{
        return new $wnd.L.esri.dynamicMapLayer(options);
    }-*/;
}
