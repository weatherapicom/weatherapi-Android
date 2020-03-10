/*
 * WeatherAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.weatherapi.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class CurrentJsonResponse 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 3346757744044920600L;
    private Location location;
    private Current current;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("location")
    public Location getLocation ( ) { 
        return this.location;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("location")
    public void setLocation (Location value) { 
        this.location = value;
        notifyObservers(this.location);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("current")
    public Current getCurrent ( ) { 
        return this.current;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("current")
    public void setCurrent (Current value) { 
        this.current = value;
        notifyObservers(this.current);
    }
 
}
