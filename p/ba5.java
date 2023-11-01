package p.ba5;
import java.lang.String;
import java.lang.System;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;
import p.av6;
import java.lang.StringBuilder;
import p.tp2;

public final class ba5	// class@001088 from classes.dex
{
    public final String a;
    public final byte[] b;
    public final String c;
    public final boolean d;
    public final String e;
    public final long f;

    public void ba5(String p0,byte[] p1,String p2,boolean p3,String p4){
       co5.o(p1, "payload");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = System.currentTimeMillis();
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       Class class = (p0 != null)? p0.getClass(): null;
       if (!co5.c(ba5.class, class)) {
          return false;
       }else {
          co5.j(p0, "null cannot be cast to non-null type com.spotify.eventsender.eventsender.PendingEvent");
          if (!co5.c(this.a, p0.a)) {
             return false;
          }else if(!Arrays.equals(this.b, p0.b)){
             return false;
          }else if(!av6.i0(this.c, p0.c, false)){
             return false;
          }else if(this.d != p0.d){
             return false;
          }else if(!av6.i0(this.e, p0.e, false)){
             return false;
          }else if(this.f - p0.f){
             return false;
          }else {
             return true;
          }
       }
    }
    public final int hashCode(){
       ba5 tc;
       int i = (Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31;
       int i1 = 0;
       int i2 = ((tc = this.c) != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       i2 = (this.d != null)? 1231: 1237;
       i = (i + i2) * 31;
       if ((tc = this.e) != null) {
          i1 = tc.hashCode();
       }
       tc = this.f;
       return (((i + i1) * 31) + (int)(tc ^ (tc >> 32)));
    }
    public final String toString(){
       return tp2.o("PendingEvent\(eventName="+this.a+", payload="+Arrays.toString(this.b)+", overrideOwner="+this.c+", authenticated="+this.d+", clientContextId="+this.e+", timestamp=", this.f, ')');
    }
}
