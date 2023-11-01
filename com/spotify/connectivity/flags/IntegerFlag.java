package com.spotify.connectivity.flags.IntegerFlag;
import com.spotify.connectivity.flags.Flag;
import java.lang.String;
import com.spotify.connectivity.flags.Source;
import com.spotify.connectivity.flags.Overridable;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Integer;
import java.lang.Class;
import java.io.Serializable;
import java.lang.Number;
import p.av6;
import com.spotify.connectivity.flags.UnmappableValueException;
import java.lang.Throwable;

public final class IntegerFlag extends Flag	// class@00070c from classes.dex
{

    public void IntegerFlag(String p0,Source p1,Overridable p2){
       co5.o(p0, "identifier");
       co5.o(p1, "source");
       co5.o(p2, "overridable");
       super(p0, p1, p2, 0, 8, null);
    }
    public void IntegerFlag(String p0,Source p1,Overridable p2,int p3){
       co5.o(p0, "identifier");
       co5.o(p1, "source");
       co5.o(p2, "overridable");
       super(Integer.TYPE, p0, p1, p2, String.valueOf(p3));
    }
    public void IntegerFlag(String p0,Source p1,Overridable p2,int p3,int p4,DefaultConstructorMarker p5){
       if ((p4 & 0x08)) {
          p3 = 0;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public Serializable getDisabledValue(){
       return this.getDisabledValue();
    }
    public Integer getDisabledValue(){
       return Integer.valueOf(0);
    }
    public Serializable getEnabledValue(){
       return this.getEnabledValue();
    }
    public Integer getEnabledValue(){
       return Integer.valueOf(1);
    }
    public boolean isEnabled(int p0){
       boolean b = (p0)? true: false;
       return b;
    }
    public boolean isEnabled(Serializable p0){
       return this.isEnabled(p0.intValue());
    }
    public Serializable mapValue(String p0){
       return this.mapValue(p0);
    }
    public Integer mapValue(String p0){
       Integer integer;
       int i;
       co5.o(p0, "value");
       if (av6.i0("control", p0, true)) {
          integer = Integer.valueOf(this.getDefaultValue());
          co5.l(integer, "{\n            Integer.va…f\(defaultValue\)\n        }");
          i = integer.intValue();
       }else {
          try{
             integer = Integer.valueOf(p0);
             co5.l(integer, "{\n            try {\n    …)\n            }\n        }");
             i = integer.intValue();
          }catch(java.lang.NumberFormatException e0){
             throw new UnmappableValueException(this, i, e0);
          }
       }
       return Integer.valueOf(i);
    }
}
