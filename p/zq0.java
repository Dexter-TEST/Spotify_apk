package p.zq0;
import p.pl1;
import java.util.Set;
import java.lang.String;
import p.kg4;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import p.en6;

public final class zq0	// class@002f45 from classes.dex
{
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final Set h;
    public static final zq0 i;

    static {
       zq0 v11 = new zq0(1, false, false, false, false, -1, -1, pl1.a);
       zq0.i = v11;
    }
    public void zq0(int p0,boolean p1,boolean p2,boolean p3,boolean p4,long p5,long p6,Set p7){
       kg4.t(p0, "requiredNetworkType");
       co5.o(p7, "contentUriTriggers");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       boolean b = false;
       if (p0 != null && co5.c(zq0.class, p0.getClass())) {
          if (this.b != p0.b) {
             return b;
          }else if(this.c != p0.c){
             return b;
          }else if(this.d != p0.d){
             return b;
          }else if(this.e != p0.e){
             return b;
          }else if(this.f - p0.f){
             return b;
          }else if(this.g - p0.g){
             return b;
          }else if(this.a != p0.a){
             b = co5.c(this.h, p0.h);
          }
       }
       return b;
    }
    public final int hashCode(){
       zq0 tf = this.f;
       tf = this.g;
       return (this.h.hashCode() + (((((((((((((en6.A(this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + (int)(tf ^ (tf >> 32))) * 31) + (int)(tf ^ (tf >> 32))) * 31));
    }
}
