package org.vaadin.addon.leaflet.demoandtestapp;

import com.vaadin.ui.Component;
import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.esri.LEsriBasemapLayer;
import org.vaadin.addon.leaflet.esri.LEsriTiledMapLayer;
import org.vaadin.addonhelpers.AbstractTest;

public class TiledLayerTest extends AbstractTest {

    private LMap leafletMap;

    @Override
    public String getDescription() {
        return "Test ESRI Tiled Layer";
    }

    @Override
    public Component getTestComponent() {

        leafletMap = new LMap();
        leafletMap.setCenter(27.3176, -80.4731);
        leafletMap.setZoomLevel(13);

        LEsriBasemapLayer streets = new LEsriBasemapLayer(LEsriBasemapLayer.Type.Streets);
        streets.setActive(true);
        leafletMap.addBaseLayer(streets, "Streets");

        String url = "https://sampleserver1.arcgisonline.com/ArcGIS/rest/services/WaterTemplate/WaterDistributionNetwork/MapServer";
        LEsriTiledMapLayer tiledMapLayer = new LEsriTiledMapLayer(url);
        tiledMapLayer.setActive(false);
        leafletMap.addOverlay(tiledMapLayer, "WaterDistributionNetwork");

        return leafletMap;
    }
}
