package com.spotify.notifications.models.message.RichPushFields;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;

public final class RichPushFields	// class@000aa5 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public void RichPushFields(String p0,String p1,String p2,String p3,String p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final RichPushFields copy(String p0,String p1,String p2,String p3,String p4){
       RichPushFields v6 = new RichPushFields(p0, p1, p2, p3, p4);
       return v6;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof RichPushFields) {
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
       return true;
    }
    public final int hashCode(){
       RichPushFields ta;
       RichPushFields tb;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       i1 = i1 * 31;
       int i2 = ((tb = this.b) == null)? 0: tb.hashCode();
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.c) == null)? 0: tb.hashCode();
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.d) == null)? 0: tb.hashCode();
       i1 = (i1 + i2) * 31;
       if ((tb = this.e) != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public final String toString(){
       return hr7.a("RichPushFields\(imageUrl="+this.a+", title="+this.b+", subtitle="+this.c+", description="+this.d+", durationMs=", this.e, ')');
    }
}
