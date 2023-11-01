package com.spotify.connectivity.flags.StringFlag;
import com.spotify.connectivity.flags.Flag;
import java.lang.String;
import com.spotify.connectivity.flags.Source;
import com.spotify.connectivity.flags.Overridable;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.io.Serializable;
import p.av6;

public final class StringFlag extends Flag	// class@00071d from classes.dex
{
    private final String enabledValue;

    public void StringFlag(String p0,Source p1,Overridable p2){
       co5.o(p0, "identifier");
       co5.o(p1, "source");
       co5.o(p2, "overridable");
       super(p0, p1, p2, "", "Enabled");
    }
    public void StringFlag(String p0,Source p1,Overridable p2,String p3){
       co5.o(p0, "identifier");
       co5.o(p1, "source");
       co5.o(p2, "overridable");
       co5.o(p3, "enabledValue");
       super(p0, p1, p2, "", p3);
    }
    private void StringFlag(String p0,Source p1,Overridable p2,String p3,String p4){
       super(String.class, p0, p1, p2, p3);
       this.enabledValue = p4;
    }
    public Serializable getDisabledValue(){
       return this.getDisabledValue();
    }
    public String getDisabledValue(){
       return "";
    }
    public Serializable getEnabledValue(){
       return this.getEnabledValue();
    }
    public String getEnabledValue(){
       return this.enabledValue;
    }
    public boolean isEnabled(Serializable p0){
       return this.isEnabled(p0);
    }
    public boolean isEnabled(String p0){
       co5.o(p0, "value");
       return av6.i0(this.enabledValue, p0, true);
    }
    public Serializable mapValue(String p0){
       return this.mapValue(p0);
    }
    public String mapValue(String p0){
       co5.o(p0, "value");
       return p0;
    }
}
