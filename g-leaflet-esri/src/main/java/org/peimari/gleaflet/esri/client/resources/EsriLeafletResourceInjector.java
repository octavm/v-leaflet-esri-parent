package org.peimari.gleaflet.esri.client.resources;

import com.google.gwt.core.client.GWT;
import org.peimari.gleaflet.client.resources.LeafletResourceInjector;

public class EsriLeafletResourceInjector {

    protected static EsriLeafletClientBundle bundle;

    public static void ensureInjected() {
        if (bundle == null) {
            LeafletResourceInjector.ensureInjected();
            bundle = GWT.create(EsriLeafletClientBundle.class);
            EsriLeafletResourceInjector injector = GWT.create(EsriLeafletResourceInjector.class);
            injector.injectResources();
        }
    }

    /**
     * Override this with deferred binding to customize injected stuff
     */
    protected void injectResources() {
        injectScript(bundle.esri().getText());
    }

    private static native void injectScript(String script)
	/*-{
	    $wnd.eval(script);
	}-*/;

}
