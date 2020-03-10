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
public class Astronomy 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 108827870968607446L;
    private Astro astro;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("astro")
    public Astro getAstro ( ) { 
        return this.astro;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("astro")
    public void setAstro (Astro value) { 
        this.astro = value;
        notifyObservers(this.astro);
    }
 
}
