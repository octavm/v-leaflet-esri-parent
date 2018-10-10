package org.peimari.gleaflet.esri.client;

import org.peimari.gleaflet.client.TileLayerOptions;

public class TiledMapLayerOptions extends TileLayerOptions {

    protected TiledMapLayerOptions() {
    }

    public static native TiledMapLayerOptions create()
	/*-{
		return {};
	}-*/;

    public native final void setUrl(String url)
    /*-{
        this.url = url;
    }-*/;

    public native final void setZoomOffsetAllowance(double zoomOffsetAllowance)
    /*-{
        this.zoomOffsetAllowance = zoomOffsetAllowance;
    }-*/;

    public native final void setProxy(String proxy)
    /*-{
        this.proxy = proxy;
    }-*/;

    public native final void setUseCors(boolean useCors)
    /*-{
        this.useCors = useCors;
    }-*/;

    public native final void setToken(String token)
    /*-{
        this.token = token;
    }-*/;

}
