package org.vaadin.addon.leaflet.demoandtestapp;

import com.vaadin.ui.Component;
import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.LTileLayer;
import org.vaadin.addon.leaflet.esri.LEsriBasemapLayer;
import org.vaadin.addon.leaflet.esri.LEsriTiledMapLayer;
import org.vaadin.addonhelpers.AbstractTest;

public class BasemapLayerTest extends AbstractTest {

    private LMap leafletMap;

    @Override
    public String getDescription() {
        return "Test ESRI Basemaps";
    }

    @Override
    public Component getTestComponent() {

        leafletMap = new LMap();
        leafletMap.setCenter(60.4525, 22.301);
        leafletMap.setZoomLevel(15);

        LEsriBasemapLayer streetsBasemap = new LEsriBasemapLayer(LEsriBasemapLayer.Type.Streets);
        LEsriBasemapLayer imageryBasemap = new LEsriBasemapLayer(LEsriBasemapLayer.Type.Imagery);

        LTileLayer tileLayer = new LTileLayer("https://services.arcgisonline.com/ArcGIS/rest/services/World_Street_Map/MapServer/tile/{z}/{y}/{x}");
        LEsriTiledMapLayer tiledMapLayer = new LEsriTiledMapLayer("http://server.arcgisonline.com/ArcGIS/rest/services/World_Imagery/MapServer/tile/{z}/{y}/{x}");

        leafletMap.addBaseLayer(tiledMapLayer, "World Imagery Map");
        leafletMap.addBaseLayer(streetsBasemap, "Streets");


        return leafletMap;
    }
}
