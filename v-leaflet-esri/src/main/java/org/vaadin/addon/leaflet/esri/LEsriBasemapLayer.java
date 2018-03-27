package org.vaadin.addon.leaflet.esri;

import org.vaadin.addon.leaflet.LTileLayer;
import org.vaadin.addon.leaflet.esri.shared.EsriLeafletBasemapLayerState;

/**
 * LEsriBasemapLayer is used to display Esri hosted basemaps and attributes data providers appropriately
 */
public class LEsriBasemapLayer extends LTileLayer {

    /**
     * Types of basemaps with worldwide coverage at a variety of zoom levels.
     */
    public enum Type {
        Streets, Topographic, Oceans, OceansLabels, NationalGeographic, Gray, GrayLabels, DarkGray, DarkGrayLabels,
        Imagery, ImageryLabels, ImageryTransportation, ImageryClarity, ShadedRelief, ShadedReliefLabels, Terrain,
        TerrainLabels, USATopo
    }

    /**
     * Create a new Esri basemap that can be added to a Leaflet Map
     * @param type refers to the specific basemap you'd like to add
     */
    public LEsriBasemapLayer(Type type) {
        this(type, null);
    }

    /**
     * Create a new Esri basemap that can be added to a Leaflet Map
     * @param type refers to the specific basemap you'd like to add
     * @param token to authenticate all calls to the service.
     */
    public LEsriBasemapLayer(Type type, String token) {
        getState().layerType = type.toString();
        getState().token = token;
    }

    @Override
    protected EsriLeafletBasemapLayerState getState() {
        return (EsriLeafletBasemapLayerState) super.getState();
    }
}
