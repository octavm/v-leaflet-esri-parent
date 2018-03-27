package org.vaadin.addon.leaflet.esri;


import com.vividsolutions.jts.geom.Geometry;
import org.vaadin.addon.leaflet.AbstractLeafletLayer;
import org.vaadin.addon.leaflet.esri.shared.EsriLeafletDynamicLayerState;

/**
 * Allows you to work with a dynamic map service resource exposed by the ArcGIS Server REST API.
 * A dynamic map service generates images on the fly. For cached map services, use LTileLayer.
 */
public class LEsriDynamicMapLayer extends AbstractLeafletLayer {

    private String url;

    /**
     * @param url URL of the Map Service
     */
    public LEsriDynamicMapLayer(String url) {
        this.url = url;
    }

    @Override
    public void beforeClientResponse(boolean initial) {
        getState().url = url;
        super.beforeClientResponse(initial);
    }

    @Override
    protected EsriLeafletDynamicLayerState getState() {
        return (EsriLeafletDynamicLayerState) super.getState();
    }

    @Override
    public Geometry getGeometry() {
        return null;
    }
}
