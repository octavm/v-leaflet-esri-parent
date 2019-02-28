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

    public enum ResponseFormat {json, image}

    public enum ImageResponseFormat {png, png8, png24, jpg, pdf, bmp, gif, svg, svgz, emf, ps, png32}

    /**
     * @param url URL of the Map Service
     */
    public LEsriDynamicMapLayer(String url) {
        this.url = url;
    }

    public ImageResponseFormat getImageResponseFormat() {
        return getState().format != null ? ImageResponseFormat.valueOf(getState().format) : null;
    }

    /**
     * Sets the output format of the image
     * @param format Default is "png24"
     */
    public void setImageResponseFormat(ImageResponseFormat format) {
        getState().format = format.toString();
    }

    /**
     * Allow the server to produce transparent images.
     * @param transparent Default is {@code true}
     */
    public void setTransparent(Boolean transparent) {
        getState().transparent = transparent;
    }

    public ResponseFormat getResponseFormat() {
        return getState().f != null ? ResponseFormat.valueOf(getState().f) : null;
    }

    /**
     * Sets the server response content type "json"|"image"
     * @param f Default is "json"
     */
    public void setResponseFormat(ResponseFormat f) {
        getState().f = f.toString();
    }

    public String getAttribution() {
        return getState().attribution;
    }

    /**
     * Set a custom attribution to override the one from service metadata which is automaticaly displayed.
     * @return
     */
    public void setAttribution(String attribution) {
        getState().attribution = attribution;
    }

    public int[] getLayers() {
        return getState().layers;
    }

    /**
     * Set an array of Layer IDs to show from the service.
     * @param layers array of Layer IDs
     */
    public void setLayers(int[] layers) {
        getState().layers = layers;
    }

    public Double getOpacity() {
        return getState().opacity;
    }

    /**
     * Set the opacity of the layer.
     * @param opacity should be a value between 0 (completely transparent) and 1 (completely opaque)
     */
    public void setOpacity(Double opacity) {
        getState().opacity = opacity;
    }

    public String getPane() {
        return getState().pane;
    }

    /**
     * The <a href="https://leafletjs.com/reference.html#map-pane">map pane</a> to render on
     * This is the preferred technique to control draw order in Leaflet 1.x.
     * @param pane Default is "overlayPane"
     */
    public void setPane(String pane) {
        getState().pane = pane;
    }

    public Integer getZIndex() {
        return getState().zIndex;
    }

    /**
     * Used to refine draw order further (within a <a href="https://leafletjs.com/reference.html#map-pane">map pane</a>)
     * @param zIndex Integer
     */
    public void setZIndex(Integer zIndex) {
        getState().zIndex = zIndex;
    }

    public Integer getMaxZoom() {
        return getState().maxZoom;
    }

    /**
     * Sets the closest zoom level the layer will be displayed on the map
     * @param maxZoom Integer
     */
    public void setMaxZoom(Integer maxZoom) {
        getState().maxZoom = maxZoom;
    }

    public Integer getMinZoom() {
        return getState().minZoom;
    }

    /**
     * Sets the furthest zoom level the layer will be displayed on the map
     * @param minZoom Integer
     */
    public void setMinZoom(Integer minZoom) {
        getState().minZoom = minZoom;
    }

    public Boolean getDisableCache() {
        return getState().disableCache;
    }

    /**
     * If enabled, appends a timestamp to each request to ensure a fresh image is created server-side
     * @param disableCache Boolean
     */
    public void setDisableCache(Boolean disableCache) {
        getState().disableCache = disableCache;
    }

    public String getToken() {
        return getState().token;
    }

    /**
     * Set a token to be included in all requests to the service
     * @param token String token
     */
    public void setToken(String token) {
        getState().token = token;
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
     * If this service should use CORS when making GET requests.
     * @param useCors Boolean
     */
    public void setUseCors(Boolean useCors) {
        getState().useCors = useCors;
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
