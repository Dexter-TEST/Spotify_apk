package com.spotify.connectivity.productstateesperanto.ProductStateValuesResponse;
import java.lang.Object;
import java.util.HashMap;
import p.r45;
import java.util.Map;
import p.jj5;
import p.m73;
import java.lang.String;

public class ProductStateValuesResponse	// class@0007fb from classes.dex
{
    private final Map mProperties;

    public void ProductStateValuesResponse(){
       super();
       this.mProperties = new HashMap();
    }
    public static r45 asOptionalMap(ProductStateValuesResponse p0){
       return r45.d(p0.getProperties());
    }
    public Map getProperties(){
       return m73.b(this.mProperties);
    }
    public void setProperty(String p0,String p1){
       this.mProperties.put(p0, p1);
    }
}
