package org.vaadin.addon.leaflet.esri;

import org.vaadin.addon.leaflet.LTileLayer;
import org.vaadin.addon.leaflet.esri.shared.EsriLeafletTiledLayerState;

/**
 * Access tiles from ArcGIS Online and ArcGIS Server
 */
public class LEsriTiledMapLayer extends LTileLayer {

    /**
     * @param url of the MapService with a tile cache.
     */
    public LEsriTiledMapLayer(String url) {
        setUrl(url);
    }

    @Override
    protected EsriLeafletTiledLayerState getState() {
        return (EsriLeafletTiledLayerState) super.getState();
    }

}
