package org.peimari.gleaflet.esri.client;

import com.google.gwt.core.client.JavaScriptObject;

public class LayerDefs extends JavaScriptObject {

    protected LayerDefs() {
    }

    public static native LayerDefs create()
	/*-{
		return {};
	}-*/;

    public native final void addDef(int layerId, String query)
    /*-{
        this[layerId] = query;
    }-*/;
}
