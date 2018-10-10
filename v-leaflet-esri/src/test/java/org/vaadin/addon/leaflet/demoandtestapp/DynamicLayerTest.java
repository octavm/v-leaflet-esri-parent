package org.vaadin.addon.leaflet.demoandtestapp;

import com.vaadin.ui.Component;
import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.esri.LEsriBasemapLayer;
import org.vaadin.addon.leaflet.esri.LEsriDynamicMapLayer;
import org.vaadin.addonhelpers.AbstractTest;

public class DynamicLayerTest extends AbstractTest {

    private LMap leafletMap;

    @Override
    public String getDescription() {
        return "Test ESRI Dynamic Layer";
    }

    @Override
    public Component getTestComponent() {

        leafletMap = new LMap();
        leafletMap.setCenter(40.39754, -104.7099);
        leafletMap.setZoomLevel(13);

        LEsriBasemapLayer streets = new LEsriBasemapLayer(LEsriBasemapLayer.Type.Streets);
        streets.setActive(true);
        leafletMap.addBaseLayer(streets, "Streets");

        String url = "https://sampleserver1.arcgisonline.com/ArcGIS/rest/services/Petroleum/KGS_OilGasFields_Kansas/MapServer";
        LEsriDynamicMapLayer dynamicLayer = new LEsriDynamicMapLayer(url);
        dynamicLayer.setUseCors(false);
//        dynamicLayer.setResponseFormat(LEsriDynamicMapLayer.ResponseFormat.image);
        dynamicLayer.setActive(false);
        leafletMap.addOverlay(dynamicLayer, "KGS_OilGasFields_Kansas");

        return leafletMap;
    }
}
