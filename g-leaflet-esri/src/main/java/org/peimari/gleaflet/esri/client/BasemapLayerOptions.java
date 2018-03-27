package org.peimari.gleaflet.esri.client;

import org.peimari.gleaflet.client.TileLayerOptions;

public class BasemapLayerOptions extends TileLayerOptions {

    protected BasemapLayerOptions() {
    }

    public static native BasemapLayerOptions create()
    /*-{
		return {};
	}-*/;

	public native final void setToken(String token)
    /*-{
        this.token = token;
    }-*/;


}
