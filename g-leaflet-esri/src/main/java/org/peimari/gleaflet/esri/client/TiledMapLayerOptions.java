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
}
