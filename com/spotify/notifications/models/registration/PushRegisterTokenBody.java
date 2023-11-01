package com.spotify.notifications.models.registration.PushRegisterTokenBody;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;

public final class PushRegisterTokenBody	// class@000aae from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public void PushRegisterTokenBody(String p0,String p1,String p2,String p3,String p4,String p5){
       co5.o(p0, "platform");
       co5.o(p1, "token");
       co5.o(p2, "environment");
       co5.o(p3, "appId");
       co5.o(p4, "osVersion");
       co5.o(p5, "appVersion");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final PushRegisterTokenBody copy(String p0,String p1,String p2,String p3,String p4,String p5){
       co5.o(p0, "platform");
       co5.o(p1, "token");
       co5.o(p2, "environment");
       co5.o(p3, "appId");
       co5.o(p4, "osVersion");
       co5.o(p5, "appVersion");
       PushRegisterTokenBody v0 = new PushRegisterTokenBody(p0, p1, p2, p3, p4, p5);
       return v0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof PushRegisterTokenBody) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       if (!co5.c(this.e, p0.e)) {
          return false;
       }
       if (!co5.c(this.f, p0.f)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.f.hashCode() + tp2.g(this.e, tp2.g(this.d, tp2.g(this.c, tp2.g(this.b, (this.a.hashCode() * 31), 31), 31), 31), 31));
    }
    public final String toString(){
       return hr7.a("PushRegisterTokenBody\(platform="+this.a+", token="+this.b+", environment="+this.c+", appId="+this.d+", osVersion="+this.e+", appVersion=", this.f, ')');
    }
}
