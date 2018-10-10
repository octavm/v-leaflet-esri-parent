package org.vaadin.addon.leaflet.demoandtestapp;

import com.vaadin.ui.Component;
import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.esri.LEsriBasemapLayer;
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
        leafletMap.setCenter(40.39754, -104.7099);
        leafletMap.setZoomLevel(13);

        LEsriBasemapLayer streets = new LEsriBasemapLayer(LEsriBasemapLayer.Type.Streets);
        LEsriBasemapLayer topographic = new LEsriBasemapLayer(LEsriBasemapLayer.Type.Topographic);
        LEsriBasemapLayer oceans = new LEsriBasemapLayer(LEsriBasemapLayer.Type.Oceans);
        LEsriBasemapLayer oceansLabels = new LEsriBasemapLayer(LEsriBasemapLayer.Type.OceansLabels);
        LEsriBasemapLayer nationalGeographic = new LEsriBasemapLayer(LEsriBasemapLayer.Type.NationalGeographic);
        LEsriBasemapLayer gray = new LEsriBasemapLayer(LEsriBasemapLayer.Type.Gray);
        LEsriBasemapLayer grayLabels = new LEsriBasemapLayer(LEsriBasemapLayer.Type.GrayLabels);
        LEsriBasemapLayer darkGray = new LEsriBasemapLayer(LEsriBasemapLayer.Type.DarkGray);
        LEsriBasemapLayer darkGrayLabels = new LEsriBasemapLayer(LEsriBasemapLayer.Type.DarkGrayLabels);
        LEsriBasemapLayer imagery = new LEsriBasemapLayer(LEsriBasemapLayer.Type.Imagery);
        LEsriBasemapLayer imageryClarity = new LEsriBasemapLayer(LEsriBasemapLayer.Type.ImageryClarity);
        LEsriBasemapLayer imageryClarityFirefly = new LEsriBasemapLayer(LEsriBasemapLayer.Type.ImageryFirefly);
        LEsriBasemapLayer imageryTransportation = new LEsriBasemapLayer(LEsriBasemapLayer.Type.ImageryTransportation);
        LEsriBasemapLayer imageryLabels = new LEsriBasemapLayer(LEsriBasemapLayer.Type.ImageryLabels);
        LEsriBasemapLayer shadedRelief = new LEsriBasemapLayer(LEsriBasemapLayer.Type.ShadedRelief);
        LEsriBasemapLayer shadedReliefLabels = new LEsriBasemapLayer(LEsriBasemapLayer.Type.ShadedReliefLabels);
        LEsriBasemapLayer terrain = new LEsriBasemapLayer(LEsriBasemapLayer.Type.Terrain);
        LEsriBasemapLayer terrainLabels = new LEsriBasemapLayer(LEsriBasemapLayer.Type.TerrainLabels);
        LEsriBasemapLayer usaTopo = new LEsriBasemapLayer(LEsriBasemapLayer.Type.USATopo);
        LEsriBasemapLayer physical = new LEsriBasemapLayer(LEsriBasemapLayer.Type.Physical);

        streets.setActive(true);
        topographic.setActive(false);
        oceans.setActive(false);
        oceansLabels.setActive(false);
        nationalGeographic.setActive(false);
        gray.setActive(false);
        grayLabels.setActive(false);
        darkGray.setActive(false);
        darkGrayLabels.setActive(false);
        imagery.setActive(false);
        imageryClarity.setActive(false);
        imageryClarityFirefly.setActive(false);
        imageryTransportation.setActive(false);
        imageryLabels.setActive(false);
        shadedRelief.setActive(false);
        shadedReliefLabels.setActive(false);
        terrain.setActive(false);
        terrainLabels.setActive(false);
        usaTopo.setActive(false);
        physical.setActive(false);

        leafletMap.addBaseLayer(streets, "Streets");
        leafletMap.addBaseLayer(topographic, "Topographic");
        leafletMap.addBaseLayer(oceans, "Oceans");
        leafletMap.addBaseLayer(oceansLabels, "OceansLabels");
        leafletMap.addBaseLayer(nationalGeographic, "NationalGeographic");
        leafletMap.addBaseLayer(gray, "Gray");
        leafletMap.addBaseLayer(grayLabels, "GrayLabels");
        leafletMap.addBaseLayer(darkGray, "DarkGray");
        leafletMap.addBaseLayer(darkGrayLabels, "DarkGrayLabels");
        leafletMap.addBaseLayer(imagery, "Imagery");
        leafletMap.addBaseLayer(imageryClarity, "ImageryClarity");
        leafletMap.addBaseLayer(imageryClarityFirefly, "ImageryFirefly");
        leafletMap.addBaseLayer(imageryTransportation, "ImageryTransportation");
        leafletMap.addBaseLayer(imageryLabels, "ImageryLabels");
        leafletMap.addBaseLayer(shadedRelief, "ShadedRelief");
        leafletMap.addBaseLayer(shadedReliefLabels, "ShadedReliefLabels");
        leafletMap.addBaseLayer(terrain, "Terrain");
        leafletMap.addBaseLayer(terrainLabels, "TerrainLabels");
        leafletMap.addBaseLayer(usaTopo, "USATopo");
        leafletMap.addBaseLayer(physical, "Physical");

        return leafletMap;
    }
}
