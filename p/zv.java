package p.zv;
import java.lang.String;
import java.lang.Object;
import p.yv;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.StringBuilder;
import p.en6;

public final class zv	// class@002f77 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public void zv(String p0,String p1,String p2,String p3,boolean p4,boolean p5,long p6,String p7,String p8,String p9,String p10,String p11){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       this.k = p10;
       this.l = p11;
    }
    public static zv a(long p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,String p9,boolean p10,boolean p11){
       yv oyv = new yv();
       oyv.d(p1);
       oyv.a(p2);
       oyv.c(p3);
       oyv.e = Boolean.valueOf(p10);
       oyv.f = Boolean.valueOf(p11);
       oyv.g = Long.valueOf(p0);
       oyv.h = p4;
       oyv.i = p5;
       oyv.j = p6;
       oyv.k = p7;
       oyv.l = p8;
       oyv.a = p9;
       return oyv.b();
    }
    public final boolean equals(Object p0){
       zv ta;
       zv th;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof zv) {
          return false;
       }
       if ((ta = this.a) == null) {
          if (p0.a == null) {
          label_001c :
             if (this.b.equals(p0.b) && (this.c.equals(p0.c) && (this.d.equals(p0.d) && (this.e == p0.e && (this.f == p0.f && !(this.g - p0.g)))))) {
                ta = p0.h;
                if ((th = this.h) == null) {
                   if (ta != null) {
                   label_009a :
                      b = false;
                   label_009b :
                      return b;
                   }
                }else if(th.equals(ta)){
                }
                ta = p0.i;
                if ((th = this.i) == null) {
                   if (ta != null) {
                   }
                }else if(th.equals(ta)){
                }
                ta = p0.j;
                if ((th = this.j) == null) {
                   if (ta != null) {
                   }
                }else if(th.equals(ta)){
                }
                ta = p0.k;
                if ((th = this.k) == null) {
                   if (ta != null) {
                   }
                }else if(th.equals(ta)){
                }
                p0 = p0.l;
                if ((ta = this.l) == null) {
                   if (p0 == null) {
                      goto label_009b ;
                   }else {
                      goto label_009a ;
                   }
                }else if(ta.equals(p0)){
                   goto label_009b ;
                }else {
                   goto label_009a ;
                }
             }else {
                goto label_009a ;
             }
          }else {
             goto label_009a ;
          }
       }else if(ta.equals(p0.a)){
          goto label_001c ;
       }else {
          goto label_009a ;
       }
    }
    public final int hashCode(){
       zv ta;
       zv th;
       zv tl;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       int i2 = 0xf4243;
       i1 = (((((((i1 ^ i2) * i2) ^ this.b.hashCode()) * i2) ^ this.c.hashCode()) * i2) ^ this.d.hashCode()) * i2;
       int i3 = 1231;
       int i4 = (this.e != null)? 1231: 1237;
       i1 = (i1 ^ i4) * i2;
       if (this.f == null) {
          i3 = 1237;
       }
       zv tg = this.g;
       i1 = (((i1 ^ i3) * i2) ^ (int)((tg >> 32) ^ tg)) * i2;
       i4 = ((th = this.h) == null)? 0: th.hashCode();
       i1 = (i1 ^ i4) * i2;
       i4 = ((th = this.i) == null)? 0: th.hashCode();
       i1 = (i1 ^ i4) * i2;
       i4 = ((th = this.j) == null)? 0: th.hashCode();
       i1 = (i1 ^ i4) * i2;
       i4 = ((th = this.k) == null)? 0: th.hashCode();
       i1 = (i1 ^ i4) * i2;
       if ((tl = this.l) != null) {
          i = tl.hashCode();
       }
       return (i ^ i1);
    }
    public final String toString(){
       return en6.p("TrackEntity{tag="+this.a+", uri="+this.b+", albumUri="+this.c+", name="+this.d+", explicit="+this.e+", playable="+this.f+", created="+this.g+", previewId="+this.h+", albumName="+this.i+", albumImage="+this.j+", artistNames="+this.k+", artistUri=", this.l, "}");
    }
}
