package org.vaadin.addon.leaflet.esri.client;

import com.google.gwt.core.client.JsArrayUtils;
import com.vaadin.shared.ui.Connect;
import org.peimari.gleaflet.client.Layer;
import org.peimari.gleaflet.esri.client.DynamicMapLayer;
import org.peimari.gleaflet.esri.client.DynamicMapLayerOptions;
import org.peimari.gleaflet.esri.client.LayerDefs;
import org.vaadin.addon.leaflet.client.AbstractLeafletLayerConnector;
import org.vaadin.addon.leaflet.esri.LEsriDynamicMapLayer;
import org.vaadin.addon.leaflet.esri.shared.EsriLeafletDynamicLayerState;

import java.util.Map;

@Connect(LEsriDynamicMapLayer.class)
public class EsriLeafletDynamicLayerConnector extends AbstractLeafletLayerConnector<DynamicMapLayerOptions> {

    public Layer layer;

    @Override
    public EsriLeafletDynamicLayerState getState() {
        return (EsriLeafletDynamicLayerState)super.getState();
    }

    @Override
    protected DynamicMapLayerOptions createOptions() {
        EsriLeafletDynamicLayerState state = getState();
        DynamicMapLayerOptions options =  DynamicMapLayerOptions.create(getState().url);

        if (state.format != null) {
            options.setFormat(state.format);
        }
        if (state.transparent != null) {
            options.setTransparent(state.transparent);
        }
        if (state.f != null) {
            options.setF(state.f);
        }
        if (state.attribution != null) {
            options.setAttribution(state.attribution);
        }
        if (state.layers != null) {
            options.setLayers(JsArrayUtils.readOnlyJsArray(state.layers));
        }
        if (state.layerDefs != null) {
            LayerDefs layerDefs = LayerDefs.create();
            for (Map.Entry<Integer, String> entry : state.layerDefs.entrySet()) {
                layerDefs.addDef(entry.getKey(), entry.getValue());
            }
            options.setLayerDefs(layerDefs);
        }
        if (state.opacity != null) {
            options.setOpacity(state.opacity);
        }
        if (state.pane != null) {
            options.setPane(state.pane);
        }
        if (state.zIndex != null) {
            options.setZIndex(state.zIndex);
        }
        if (state.position != null) {
            options.setPosition(state.position);
        }
        if (state.maxZoom != null) {
            options.setMaxZoom(state.maxZoom);
        }
        if (state.minZoom != null) {
            options.setMinZoom(state.minZoom);
        }
        if (state.disableCache != null) {
            options.setDisableCache(state.disableCache);
        }
        if (state.token != null) {
            options.setToken(state.token);
        }
        if (state.proxy != null) {
            options.setProxy(state.proxy);
        }
        if (state.useCors != null) {
            options.setUseCors(state.useCors);
        }
        return options;
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
