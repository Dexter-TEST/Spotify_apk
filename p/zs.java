package p.zs;
import java.lang.String;
import java.lang.Object;
import p.ys;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.StringBuilder;
import p.en6;

public final class zs	// class@002f5c from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final long k;
    public final String l;
    public final String m;

    public void zs(String p0,String p1,String p2,String p3,String p4,String p5,String p6,int p7,boolean p8,boolean p9,long p10,String p11,String p12){
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
       this.m = p12;
    }
    public static zs a(int p0,long p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,String p9,String p10,boolean p11,boolean p12){
       ys oys = new ys();
       oys.g(p2);
       oys.e(p3);
       oys.c(p4);
       oys.b(p5);
       oys.d(p6);
       oys.f(p7);
       oys.l = p8;
       oys.m = p9;
       oys.a = p10;
       oys.h = Integer.valueOf(p0);
       oys.i = Boolean.valueOf(p11);
       oys.j = Boolean.valueOf(p12);
       oys.k = Long.valueOf(p1);
       return oys.a();
    }
    public final boolean equals(Object p0){
       zs ta;
       zs tl;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof zs) {
          return false;
       }
       if ((ta = this.a) == null) {
          if (p0.a == null) {
          label_001c :
             if (this.b.equals(p0.b) && (this.c.equals(p0.c) && (this.d.equals(p0.d) && (this.e.equals(p0.e) && (this.f.equals(p0.f) && (this.g.equals(p0.g) && (this.h == p0.h && (this.i == p0.i && (this.j == p0.j && !(this.k - p0.k)))))))))) {
                ta = p0.l;
                if ((tl = this.l) == null) {
                   if (ta != null) {
                   label_0091 :
                      b = false;
                   label_0092 :
                      return b;
                   }
                }else if(tl.equals(ta)){
                }
                p0 = p0.m;
                if ((ta = this.m) == null) {
                   if (p0 == null) {
                      goto label_0092 ;
                   }else {
                      goto label_0091 ;
                   }
                }else if(ta.equals(p0)){
                   goto label_0092 ;
                }else {
                   goto label_0091 ;
                }
             }else {
                goto label_0091 ;
             }
          }else {
             goto label_0091 ;
          }
       }else if(ta.equals(p0.a)){
          goto label_001c ;
       }else {
          goto label_0091 ;
       }
    }
    public final int hashCode(){
       zs ta;
       zs tl;
       zs tm;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       int i2 = 0xf4243;
       i1 = (((((((((((((((i1 ^ i2) * i2) ^ this.b.hashCode()) * i2) ^ this.c.hashCode()) * i2) ^ this.d.hashCode()) * i2) ^ this.e.hashCode()) * i2) ^ this.f.hashCode()) * i2) ^ this.g.hashCode()) * i2) ^ this.h) * i2;
       int i3 = 1231;
       int i4 = (this.i != null)? 1231: 1237;
       i1 = (i1 ^ i4) * i2;
       if (this.j == null) {
          i3 = 1237;
       }
       zs tk = this.k;
       i1 = (((i1 ^ i3) * i2) ^ (int)((tk >> 32) ^ tk)) * i2;
       i4 = ((tl = this.l) == null)? 0: tl.hashCode();
       i1 = (i1 ^ i4) * i2;
       if ((tm = this.m) != null) {
          i = tm.hashCode();
       }
       return (i ^ i1);
    }
    public final String toString(){
       return en6.p("EpisodeEntity{tag="+this.a+", uri="+this.b+", podcastUri="+this.c+", name="+this.d+", description="+this.e+", podcastName="+this.f+", releaseDate="+this.g+", duration="+this.h+", playable="+this.i+", explicit="+this.j+", created="+this.k+", previewId="+this.l+", image=", this.m, "}");
    }
}
