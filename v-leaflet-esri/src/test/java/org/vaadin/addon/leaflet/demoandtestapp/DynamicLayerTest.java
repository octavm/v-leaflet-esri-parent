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
        leafletMap.setCenter(38.259504, -85.749664);
        leafletMap.setZoomLevel(13);

        LEsriBasemapLayer streets = new LEsriBasemapLayer(LEsriBasemapLayer.Type.Streets);
        streets.setActive(true);
        leafletMap.addBaseLayer(streets, "Streets");

        String kgsOilUrl = "https://sampleserver1.arcgisonline.com/ArcGIS/rest/services/Petroleum/KGS_OilGasFields_Kansas/MapServer";
        LEsriDynamicMapLayer kgsOilLayer = new LEsriDynamicMapLayer(kgsOilUrl);
        kgsOilLayer.setUseCors(false);
        kgsOilLayer.setOpacity(0.6);
        kgsOilLayer.setResponseFormat(LEsriDynamicMapLayer.ResponseFormat.image);
        kgsOilLayer.setActive(false);
        leafletMap.addOverlay(kgsOilLayer, "KGS_OilGasFields_Kansas");

        String lojicUrl = "https://sampleserver1.arcgisonline.com/ArcGIS/rest/services/Louisville/LOJIC_LandRecords_Louisville/MapServer";
        LEsriDynamicMapLayer lojicLayer = new LEsriDynamicMapLayer(lojicUrl);
        lojicLayer.setLayers(new int[]{0,1,2});
        lojicLayer.setOpacity(0.3);
        lojicLayer.setResponseFormat(LEsriDynamicMapLayer.ResponseFormat.image);
        lojicLayer.setActive(false);
        leafletMap.addOverlay(lojicLayer, "LOJIC_LandRecords_Louisville");

        return leafletMap;
    }
}
