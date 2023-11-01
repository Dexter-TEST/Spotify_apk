package com.spotify.playerlimited.player.models.ConnectDevice;
import java.lang.Object;
import p.co5;
import java.lang.Boolean;
import java.util.Arrays;
import java.lang.String;
import java.lang.StringBuilder;

public final class ConnectDevice	// class@000b66 from classes.dex
{
    public boolean a;
    public boolean b;
    public String c;
    public String d;
    public String e;
    public String f;

    public void ConnectDevice(){
       super();
    }
    public static void getIdentifier$annotations(){
    }
    public static void getName$annotations(){
    }
    public static void getPhysicalIdentifier$annotations(){
    }
    public static void getType$annotations(){
    }
    public static void isActive$annotations(){
    }
    public static void isSelf$annotations(){
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof ConnectDevice) {
          return false;
       }
       if (this.a != p0.a || (this.b != p0.b || (!co5.c(this.c, p0.c) || (!co5.c(this.e, p0.e) || (!co5.c(this.d, p0.d) || !co5.c(this.f, p0.f)))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{Boolean.valueOf(this.a),Boolean.valueOf(this.b),this.c,this.e,this.d,this.f};
       return Arrays.hashCode(objArray);
    }
    public final String toString(){
       return "{isActive="+this.a+", isSelf="+this.b+", name="+this.c+", identifier="+this.e+", physicalIdentifier="+this.d+"}, type="+this.f;
    }
}
