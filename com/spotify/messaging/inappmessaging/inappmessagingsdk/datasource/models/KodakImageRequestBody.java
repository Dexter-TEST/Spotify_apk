package com.spotify.messaging.inappmessaging.inappmessagingsdk.datasource.models.KodakImageRequestBody;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class KodakImageRequestBody	// class@000a24 from classes.dex
{
    public final long a;
    public final int b;
    public final int c;
    public final boolean d;

    public void KodakImageRequestBody(long p0,int p1,int p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final KodakImageRequestBody copy(long p0,int p1,int p2,boolean p3){
       KodakImageRequestBody v6 = new KodakImageRequestBody(p0, p1, p2, p3);
       return v6;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof KodakImageRequestBody) {
          return false;
       }
       if (this.a - p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       KodakImageRequestBody td;
       KodakImageRequestBody ta = this.a;
       int i = (((((int)(ta ^ (ta >> 32)) * 31) + this.b) * 31) + this.c) * 31;
       if ((td = this.d) != null) {
          td = 1;
       }
       return (i + td);
    }
    public final String toString(){
       return kg4.p("KodakImageRequestBody\(creativeId="+this.a+", width="+this.b+", height="+this.c+", isDev=", this.d, ')');
    }
}
