package p.ld4;
import android.animation.TimeInterpolator;
import java.lang.Object;
import p.je;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;
import p.en6;

public final class ld4	// class@001d31 from classes.dex
{
    public final long a;
    public final long b;
    public final TimeInterpolator c;
    public int d;
    public int e;

    public void ld4(long p0,long p1,TimeInterpolator p2){
       super();
       this.a = 0;
       this.b = 300;
       this.c = null;
       this.d = 0;
       this.e = 1;
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final TimeInterpolator a(){
       ld4 tc;
       if ((tc = this.c) != null) {
       }else {
          tc = je.b;
       }
       return tc;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ld4) {
          return false;
       }
       if (this.a - p0.a) {
          return false;
       }
       if (this.b - p0.b) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (this.e != p0.e) {
          return false;
       }
       return this.a().getClass().equals(p0.a().getClass());
    }
    public final int hashCode(){
       ld4 ta = this.a;
       ld4 tb = this.b;
       return (((((this.a().getClass().hashCode() + ((((int)(ta ^ (ta >> 32)) * 31) + (int)(tb ^ (tb >> 32))) * 31)) * 31) + this.d) * 31) + this.e);
    }
    public final String toString(){
       return en6.o("\n"+ld4.class.getName()+'{'+Integer.toHexString(System.identityHashCode(this))+" delay: "+this.a+" duration: "+this.b+" interpolator: "+this.a().getClass()+" repeatCount: "+this.d+" repeatMode: ", this.e, "}\n");
    }
}
