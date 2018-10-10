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
        if (s.zoomOffsetAllowance != null) {
            o.setZoomOffsetAllowance(s.zoomOffsetAllowance);
        }
        if (s.proxy != null) {
            o.setProxy(s.proxy);
        }
        if (s.useCors != null) {
            o.setUseCors(s.useCors);
        }
        if (s.token != null) {
            o.setToken(s.token);
        }
        return o;
    }

    @Override
    protected TiledMapLayer createGridLayer(GridLayerOptions o) {
        return TiledMapLayer.create((TiledMapLayerOptions) o);
    }
}
