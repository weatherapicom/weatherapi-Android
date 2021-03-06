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
public class Condition 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 330043717074438001L;
    private String text;
    private String icon;
    private Integer code;
    /** GETTER
     * Weather condition text
     */
    @JsonGetter("text")
    public String getText ( ) { 
        return this.text;
    }
    
    /** SETTER
     * Weather condition text
     */
    @JsonSetter("text")
    public void setText (String value) { 
        this.text = value;
        notifyObservers(this.text);
    }
 
    /** GETTER
     * Weather icon url
     */
    @JsonGetter("icon")
    public String getIcon ( ) { 
        return this.icon;
    }
    
    /** SETTER
     * Weather icon url
     */
    @JsonSetter("icon")
    public void setIcon (String value) { 
        this.icon = value;
        notifyObservers(this.icon);
    }
 
    /** GETTER
     * Weather condition unique code.
     */
    @JsonGetter("code")
    public Integer getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * Weather condition unique code.
     */
    @JsonSetter("code")
    public void setCode (Integer value) { 
        this.code = value;
        notifyObservers(this.code);
    }
 
}
