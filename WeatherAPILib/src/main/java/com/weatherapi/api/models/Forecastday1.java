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
public class Forecastday1 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -2843791909295019823L;
    private String date;
    private Integer dateEpoch;
    private Day day;
    private Astro astro;
    private List<Hour> hour;
    /** GETTER
     * Forecast date
     */
    @JsonGetter("date")
    public String getDate ( ) { 
        return this.date;
    }
    
    /** SETTER
     * Forecast date
     */
    @JsonSetter("date")
    public void setDate (String value) { 
        this.date = value;
        notifyObservers(this.date);
    }
 
    /** GETTER
     * Forecast date as unix time.
     */
    @JsonGetter("date_epoch")
    public Integer getDateEpoch ( ) { 
        return this.dateEpoch;
    }
    
    /** SETTER
     * Forecast date as unix time.
     */
    @JsonSetter("date_epoch")
    public void setDateEpoch (Integer value) { 
        this.dateEpoch = value;
        notifyObservers(this.dateEpoch);
    }
 
    /** GETTER
     * See day element
     */
    @JsonGetter("day")
    public Day getDay ( ) { 
        return this.day;
    }
    
    /** SETTER
     * See day element
     */
    @JsonSetter("day")
    public void setDay (Day value) { 
        this.day = value;
        notifyObservers(this.day);
    }
 
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("hour")
    public List<Hour> getHour ( ) { 
        return this.hour;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("hour")
    public void setHour (List<Hour> value) { 
        this.hour = value;
        notifyObservers(this.hour);
    }
 
}
