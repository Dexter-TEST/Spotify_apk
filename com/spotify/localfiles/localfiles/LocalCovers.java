package com.spotify.localfiles.localfiles.LocalCovers;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;

public final class LocalCovers	// class@00097b from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public void LocalCovers(String p0,String p1,String p2,String p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final LocalCovers copy(String p0,String p1,String p2,String p3){
       return new LocalCovers(p0, p1, p2, p3);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof LocalCovers) {
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
       return true;
    }
    public final int hashCode(){
       LocalCovers ta;
       LocalCovers tb;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       i1 = i1 * 31;
       int i2 = ((tb = this.b) == null)? 0: tb.hashCode();
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.c) == null)? 0: tb.hashCode();
       i1 = (i1 + i2) * 31;
       if ((tb = this.d) != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public final String toString(){
       return hr7.a("LocalCovers\(default="+this.a+", small="+this.b+", large="+this.c+", extraLarge=", this.d, ')');
    }
}
