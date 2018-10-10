package org.peimari.gleaflet.esri.client;

import com.google.gwt.core.client.JavaScriptObject;

public class DynamicMapLayerOptions extends JavaScriptObject {

    protected DynamicMapLayerOptions() {
    }

    public static native DynamicMapLayerOptions create(String url)
    /*-{
        return {
            url: url
        };
    }-*/;

    public native final void setFormat(String format)
    /*-{
        this.format = format;
    }-*/;

    public native final void setTransparent(boolean transparent)
    /*-{
        this.transparent = transparent;
    }-*/;

    public native final void setF(String f)
    /*-{
        this.f = f;
    }-*/;

    public native final void setPane(String pane)
    /*-{
        this.pane = pane;
    }-*/;

    public native final void setZIndex(int zIndex)
    /*-{
        this.zIndex = zIndex;
    }-*/;

    public native final void setMaxZoom(int maxZoom)
    /*-{
        this.maxZoom = maxZoom;
    }-*/;

    public native final void setMinZoom(int minZoom)
    /*-{
        this.minZoom = minZoom;
    }-*/;

    public native final void setDisableCache(boolean disableCache)
    /*-{
        this.disableCache = disableCache;
    }-*/;

    public native final void setToken(String token)
    /*-{
        this.token = token;
    }-*/;

    public native final void setProxy(String proxy)
    /*-{
        this.proxy = proxy;
    }-*/;

    public native final void setUseCors(boolean useCors)
    /*-{
        this.useCors = useCors;
    }-*/;

}
