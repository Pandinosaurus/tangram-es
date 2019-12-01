package com.mapzen.tangram;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/**
 * {@code MarkerPickResult} represents labels that can be selected on the screen
 */
@Keep
public class MarkerPickResult {

    private Marker marker;
    private LngLat coordinates;

    MarkerPickResult(final Marker marker, final double longitude, final double latitude) {
        this.marker = marker;
        this.coordinates = new LngLat(longitude, latitude);
    }

    /**
     * @return The marker associated with the selection
     */
    public Marker getMarker() {
        return this.marker;
    }

    /**
     * @return The coordinate of the feature for which this label has been created
     */
    @NonNull
    public LngLat getCoordinates() {
        return this.coordinates;
    }

}
