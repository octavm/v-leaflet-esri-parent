package org.vaadin.addon.leaflet.esri.shared;

import org.vaadin.addon.leaflet.shared.AbstractLeafletComponentState;

import java.util.Map;

public class EsriLeafletDynamicLayerState extends AbstractLeafletComponentState {

    public String url;
    public String format;
    public Boolean transparent;
    public String f;
    public String attribution;
    public int[] layers;
    public Map<Integer, String> layerDefs;
    public Double opacity;
    public String pane;
    public Integer zIndex;
    public String position;
    public Integer maxZoom;
    public Integer minZoom;
    public Boolean disableCache;
    public String token;
    public String proxy;
    public Boolean useCors;
}
