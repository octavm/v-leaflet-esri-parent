package org.vaadin.addon.leaflet.esri.client;

import com.vaadin.shared.ui.Connect;
import org.peimari.gleaflet.client.Layer;
import org.peimari.gleaflet.esri.client.DynamicMapLayer;
import org.peimari.gleaflet.esri.client.DynamicMapLayerOptions;
import org.vaadin.addon.leaflet.client.AbstractLeafletLayerConnector;
import org.vaadin.addon.leaflet.esri.LEsriDynamicMapLayer;
import org.vaadin.addon.leaflet.esri.shared.EsriLeafletDynamicLayerState;

@Connect(LEsriDynamicMapLayer.class)
public class EsriLeafletDynamicLayerConnector extends AbstractLeafletLayerConnector<DynamicMapLayerOptions> {

    public Layer layer;

    @Override
    public EsriLeafletDynamicLayerState getState() {
        return (EsriLeafletDynamicLayerState)super.getState();
    }

    @Override
    protected DynamicMapLayerOptions createOptions() {
        return DynamicMapLayerOptions.create(getState().url);
    }

    @Override
    protected void update() {
        if (layer != null) {
            removeLayerFromParent();
        } else {
            DynamicMapLayerOptions o = createOptions();
            layer = DynamicMapLayer.create(o);
        }

        addToParent(layer);
    }

    @Override
    public Layer getLayer() {
        return layer;
    }
}
