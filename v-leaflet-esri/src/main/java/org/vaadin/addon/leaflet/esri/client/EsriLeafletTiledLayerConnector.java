package org.vaadin.addon.leaflet.esri.client;

import com.vaadin.shared.ui.Connect;
import org.peimari.gleaflet.client.*;
import org.peimari.gleaflet.esri.client.TiledMapLayer;
import org.peimari.gleaflet.esri.client.TiledMapLayerOptions;
import org.vaadin.addon.leaflet.client.LeafletTileLayerConnector;
import org.vaadin.addon.leaflet.esri.LEsriTiledMapLayer;
import org.vaadin.addon.leaflet.esri.shared.EsriLeafletTiledLayerState;


@Connect(LEsriTiledMapLayer.class)
public class EsriLeafletTiledLayerConnector extends LeafletTileLayerConnector {

    @Override
    public EsriLeafletTiledLayerState getState() {
        return (EsriLeafletTiledLayerState) super.getState();
    }

    @Override
    protected TiledMapLayerOptions createOptions() {
        TiledMapLayerOptions o = super.createOptions().cast();
        EsriLeafletTiledLayerState s = getState();
        if (s.url != null) {
            o.setUrl(s.url);
        }
        return o;
    }

    protected TiledMapLayer createTileLayer(TileLayerOptions o) {
        return TiledMapLayer.create((TiledMapLayerOptions) o);
    }

}
