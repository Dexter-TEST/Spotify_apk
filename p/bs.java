package p.bs;
import p.iz0;
import java.lang.String;
import java.lang.Long;
import p.uy0;
import p.hz0;
import p.gz0;
import p.vy0;
import p.i73;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class bs extends iz0	// class@00112b from classes.dex
{
    public final String a;
    public final String b;
    public final long c;
    public final Long d;
    public final boolean e;
    public final uy0 f;
    public final hz0 g;
    public final gz0 h;
    public final vy0 i;
    public final i73 j;
    public final int k;

    public void bs(String p0,String p1,long p2,Long p3,boolean p4,uy0 p5,hz0 p6,gz0 p7,vy0 p8,i73 p9,int p10){
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
    }
    public final boolean equals(Object p0){
       bs td;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof iz0) {
          return false;
       }
       if (this.a.equals(p0.a) && (this.b.equals(p0.b) && !(this.c - p0.c))) {
          bs d = p0.d;
          if ((td = this.d) == null) {
             if (d != null) {
             label_008b :
                b = false;
             label_008c :
                return b;
             }
          }else if(td.equals(d)){
          }
          if (this.e == p0.e && this.f.equals(p0.f)) {
             d = p0.g;
             if ((td = this.g) == null) {
                if (d != null) {
                }
             }else if(td.equals(d)){
             }
             d = p0.h;
             if ((td = this.h) == null) {
                if (d != null) {
                }
             }else if(td.equals(d)){
             }
             d = p0.i;
             if ((td = this.i) == null) {
                if (d != null) {
                }
             }else if(td.equals(d)){
             }
             d = p0.j;
             if ((td = this.j) == null) {
                if (d != null) {
                }
             }else if(td.equals(d)){
             }
             if (this.k == p0.k) {
                goto label_008c ;
             }else {
                goto label_008b ;
             }
          }else {
             goto label_008b ;
          }
       }else {
          goto label_008b ;
       }
    }
    public final int hashCode(){
       bs td;
       int i = 0xf4243;
       bs tc = this.c;
       int i1 = (((((this.a.hashCode() ^ i) * i) ^ this.b.hashCode()) * i) ^ (int)(tc ^ (tc >> 32))) * i;
       int i2 = 0;
       int i3 = ((td = this.d) == null)? 0: td.hashCode();
       i1 = (i1 ^ i3) * i;
       i3 = (this.e != null)? 1231: 1237;
       i1 = (((i1 ^ i3) * i) ^ this.f.hashCode()) * i;
       i3 = ((td = this.g) == null)? 0: td.hashCode();
       i1 = (i1 ^ i3) * i;
       i3 = ((td = this.h) == null)? 0: td.hashCode();
       i1 = (i1 ^ i3) * i;
       i3 = ((td = this.i) == null)? 0: td.hashCode();
       i1 = (i1 ^ i3) * i;
       if ((td = this.j) != null) {
          i2 = td.hashCode();
       }
       return (((i1 ^ i2) * i) ^ this.k);
    }
    public final String toString(){
       return en6.o("Session{generator="+this.a+", identifier="+this.b+", startedAt="+this.c+", endedAt="+this.d+", crashed="+this.e+", app="+this.f+", user="+this.g+", os="+this.h+", device="+this.i+", events="+this.j+", generatorType=", this.k, "}");
    }
}
