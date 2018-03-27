package org.peimari.gleaflet.esri.client;

import com.google.gwt.core.client.JavaScriptObject;

public class DynamicMapLayerOptions extends JavaScriptObject {

    protected DynamicMapLayerOptions() {
    }

    public static native DynamicMapLayerOptions create(String url)
    /*-{
        return {
            url: url,
            bboxSR: 4326,
            imageSR: 102100,
            f: 'image'
        };
    }-*/;
}
