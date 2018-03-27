package org.vaadin.addon.leaflet.esri.client;

import com.vaadin.shared.ui.Connect;
import org.peimari.gleaflet.client.TileLayerOptions;
import org.peimari.gleaflet.esri.client.BasemapLayer;
import org.peimari.gleaflet.esri.client.BasemapLayerOptions;
import org.vaadin.addon.leaflet.client.LeafletTileLayerConnector;
import org.vaadin.addon.leaflet.esri.LEsriBasemapLayer;
import org.vaadin.addon.leaflet.esri.shared.EsriLeafletBasemapLayerState;

@Connect(LEsriBasemapLayer.class)
public class EsriLeafletBasemapConnector extends LeafletTileLayerConnector {

    @Override
    public EsriLeafletBasemapLayerState getState() {
        return (EsriLeafletBasemapLayerState) super.getState();
    }

    @Override
    protected BasemapLayerOptions createOptions() {
        BasemapLayerOptions o = super.createOptions().cast();
        EsriLeafletBasemapLayerState s = getState();
        if (s.token != null) {
            o.setToken(s.token);
        }
        return o;
    }

    @Override
    protected BasemapLayer createTileLayer(TileLayerOptions o) {
        return BasemapLayer.create(getState().layerType, (BasemapLayerOptions) o);
    }
}
