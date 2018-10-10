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

    public Double getZoomOffsetAllowance() {
        return getState().zoomOffsetAllowance;
    }

    /**
     * If correctZoomLevels is enabled this controls the amount of tolerance for the difference at each scale level
     * for remapping tile levels.
     * @param zoomOffsetAllowance Default is 0.1
     */
    public void setZoomOffsetAllowance(Double zoomOffsetAllowance) {
        getState().zoomOffsetAllowance = zoomOffsetAllowance;
    }

    public String getProxy() {
        return getState().proxy;
    }

    /**
     * Sets a URL for an ArcGIS API for JavaScript proxy or ArcGIS Resource Proxy to use for proxying requests
     * @param proxy String
     */
    public void setProxy(String proxy) {
        getState().proxy = proxy;
    }

    public Boolean getUseCors() {
        return getState().useCors;
    }

    /**
     * Dictates if the service should use CORS when making GET requests.
     * @param useCors Boolean
     */
    public void setUseCors(Boolean useCors) {
        getState().useCors = useCors;
    }

    public String getToken() {
        return getState().token;
    }

    /**
     * Set a token to be included in all requests to the service.
     * @param token String token
     */
    public void setToken(String token) {
        getState().token = token;
    }

    @Override
    protected EsriLeafletTiledLayerState getState() {
        return (EsriLeafletTiledLayerState) super.getState();
    }

}
