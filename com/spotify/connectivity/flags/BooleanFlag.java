package com.spotify.connectivity.flags.BooleanFlag;
import com.spotify.connectivity.flags.Flag;
import java.lang.String;
import com.spotify.connectivity.flags.Source;
import com.spotify.connectivity.flags.Overridable;
import java.lang.Object;
import p.co5;
import java.lang.Boolean;
import java.lang.Class;
import java.io.Serializable;
import p.te5;
import p.av6;
import java.lang.Integer;
import com.spotify.connectivity.flags.UnmappableValueException;
import java.lang.Throwable;

public class BooleanFlag extends Flag	// class@000705 from classes.dex
{

    public void BooleanFlag(String p0,Source p1,Overridable p2){
       co5.o(p0, "identifier");
       co5.o(p1, "source");
       co5.o(p2, "overridable");
       super(Boolean.TYPE, p0, p1, p2, "false");
    }
    public Serializable getDisabledValue(){
       return this.getDisabledValue();
    }
    public Boolean getDisabledValue(){
       return Boolean.FALSE;
    }
    public Serializable getEnabledValue(){
       return this.getEnabledValue();
    }
    public Boolean getEnabledValue(){
       return Boolean.TRUE;
    }
    public boolean isEnabled(Serializable p0){
       return this.isEnabled(p0.booleanValue());
    }
    public boolean isEnabled(boolean p0){
       return p0;
    }
    public boolean mapToBoolean(int p0){
       boolean b = (p0)? true: false;
       return b;
    }
    public Serializable mapValue(String p0){
       return this.mapValue(p0);
    }
    public Boolean mapValue(String p0){
       boolean b;
       try{
          co5.o(p0, "value");
          b = false;
          if (te5.a(p0)) {
             co5.l(Boolean.FALSE, "{\n            /* The rec…g.Boolean.FALSE\n        }");
          }else if(co5.c("true", p0)){
             co5.l(Boolean.TRUE, "{\n            java.lang.Boolean.TRUE\n        }");
          }else if(co5.c("false", p0)){
             co5.l(Boolean.FALSE, "{\n            java.lang.Boolean.FALSE\n        }");
          }else if(av6.i0(p0, "control", true)){
             co5.l(Boolean.FALSE, "{\n            java.lang.Boolean.FALSE\n        }");
          }else if(av6.i0(p0, "enabled", true)){
             co5.l(Boolean.TRUE, "{\n            java.lang.Boolean.TRUE\n        }");
          }else {
             b = this.mapToBoolean(Integer.parseInt(p0));
          }
          b = true;
       }catch(java.lang.NumberFormatException e0){
          throw new UnmappableValueException(this, p0, e0);
       }
          return Boolean.valueOf(b);
    }
}
