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
public class IpJsonResponse 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -6393844874178213400L;
    private String ip;
    private String type;
    private String continentCode;
    private String continentName;
    private String countryCode;
    private String countryName;
    private Boolean isEu;
    private Integer geonameId;
    private String city;
    private String region;
    private Double lat;
    private Double lon;
    private String tzId;
    private Integer localtimeEpoch;
    private String localtime;
    /** GETTER
     * IP address
     */
    @JsonGetter("ip")
    public String getIp ( ) { 
        return this.ip;
    }
    
    /** SETTER
     * IP address
     */
    @JsonSetter("ip")
    public void setIp (String value) { 
        this.ip = value;
        notifyObservers(this.ip);
    }
 
    /** GETTER
     * ipv4 or ipv6
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * ipv4 or ipv6
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
        notifyObservers(this.type);
    }
 
    /** GETTER
     * Continent code
     */
    @JsonGetter("continent_code")
    public String getContinentCode ( ) { 
        return this.continentCode;
    }
    
    /** SETTER
     * Continent code
     */
    @JsonSetter("continent_code")
    public void setContinentCode (String value) { 
        this.continentCode = value;
        notifyObservers(this.continentCode);
    }
 
    /** GETTER
     * Continent name
     */
    @JsonGetter("continent_name")
    public String getContinentName ( ) { 
        return this.continentName;
    }
    
    /** SETTER
     * Continent name
     */
    @JsonSetter("continent_name")
    public void setContinentName (String value) { 
        this.continentName = value;
        notifyObservers(this.continentName);
    }
 
    /** GETTER
     * Country code
     */
    @JsonGetter("country_code")
    public String getCountryCode ( ) { 
        return this.countryCode;
    }
    
    /** SETTER
     * Country code
     */
    @JsonSetter("country_code")
    public void setCountryCode (String value) { 
        this.countryCode = value;
        notifyObservers(this.countryCode);
    }
 
    /** GETTER
     * Name of country
     */
    @JsonGetter("country_name")
    public String getCountryName ( ) { 
        return this.countryName;
    }
    
    /** SETTER
     * Name of country
     */
    @JsonSetter("country_name")
    public void setCountryName (String value) { 
        this.countryName = value;
        notifyObservers(this.countryName);
    }
 
    /** GETTER
     * true or false
     */
    @JsonGetter("is_eu")
    public Boolean getIsEu ( ) { 
        return this.isEu;
    }
    
    /** SETTER
     * true or false
     */
    @JsonSetter("is_eu")
    public void setIsEu (Boolean value) { 
        this.isEu = value;
        notifyObservers(this.isEu);
    }
 
    /** GETTER
     * Geoname ID
     */
    @JsonGetter("geoname_id")
    public Integer getGeonameId ( ) { 
        return this.geonameId;
    }
    
    /** SETTER
     * Geoname ID
     */
    @JsonSetter("geoname_id")
    public void setGeonameId (Integer value) { 
        this.geonameId = value;
        notifyObservers(this.geonameId);
    }
 
    /** GETTER
     * City name
     */
    @JsonGetter("city")
    public String getCity ( ) { 
        return this.city;
    }
    
    /** SETTER
     * City name
     */
    @JsonSetter("city")
    public void setCity (String value) { 
        this.city = value;
        notifyObservers(this.city);
    }
 
    /** GETTER
     * Region name
     */
    @JsonGetter("region")
    public String getRegion ( ) { 
        return this.region;
    }
    
    /** SETTER
     * Region name
     */
    @JsonSetter("region")
    public void setRegion (String value) { 
        this.region = value;
        notifyObservers(this.region);
    }
 
    /** GETTER
     * Latitude in decimal degree
     */
    @JsonGetter("lat")
    public Double getLat ( ) { 
        return this.lat;
    }
    
    /** SETTER
     * Latitude in decimal degree
     */
    @JsonSetter("lat")
    public void setLat (Double value) { 
        this.lat = value;
        notifyObservers(this.lat);
    }
 
    /** GETTER
     * Longitude in decimal degree
     */
    @JsonGetter("lon")
    public Double getLon ( ) { 
        return this.lon;
    }
    
    /** SETTER
     * Longitude in decimal degree
     */
    @JsonSetter("lon")
    public void setLon (Double value) { 
        this.lon = value;
        notifyObservers(this.lon);
    }
 
    /** GETTER
     * Time zone
     */
    @JsonGetter("tz_id")
    public String getTzId ( ) { 
        return this.tzId;
    }
    
    /** SETTER
     * Time zone
     */
    @JsonSetter("tz_id")
    public void setTzId (String value) { 
        this.tzId = value;
        notifyObservers(this.tzId);
    }
 
    /** GETTER
     * Local time as epoch
     */
    @JsonGetter("localtime_epoch")
    public Integer getLocaltimeEpoch ( ) { 
        return this.localtimeEpoch;
    }
    
    /** SETTER
     * Local time as epoch
     */
    @JsonSetter("localtime_epoch")
    public void setLocaltimeEpoch (Integer value) { 
        this.localtimeEpoch = value;
        notifyObservers(this.localtimeEpoch);
    }
 
    /** GETTER
     * Date and time
     */
    @JsonGetter("localtime")
    public String getLocaltime ( ) { 
        return this.localtime;
    }
    
    /** SETTER
     * Date and time
     */
    @JsonSetter("localtime")
    public void setLocaltime (String value) { 
        this.localtime = value;
        notifyObservers(this.localtime);
    }
 
}
