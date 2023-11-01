package p.vt;
import p.aq6;
import p.r45;
import java.lang.Object;
import p.yp6;
import p.vx6;
import java.lang.Class;
import p.ux6;
import java.util.List;
import java.lang.Boolean;
import java.lang.String;
import java.lang.StringBuilder;
import p.en6;

public final class vt	// class@002a64 from classes.dex
{
    public final aq6 a;
    public final r45 b;
    public final r45 c;
    public final r45 d;
    public final r45 e;
    public final r45 f;
    public final r45 g;
    public final r45 h;
    public final r45 i;
    public final boolean j;
    public final boolean k;

    public void vt(aq6 p0,r45 p1,r45 p2,r45 p3,r45 p4,r45 p5,r45 p6,r45 p7,r45 p8,boolean p9,boolean p10){
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
    public final boolean a(){
       aq6 b;
       boolean b1;
       if ((b = this.a.b) != yp6.w && b != yp6.m0) {
          vt tc = this.c;
          b1 = this.j;
          if (!tc.c()) {
          label_004a :
             return b1;
          }else {
             vt ti = this.i;
             if (ti.c()) {
                vx6 ovx6 = ti.b();
                ovx6.getClass();
                if (ovx6 instanceof ux6 && ovx6.a > null) {
                   Object obj = tc.b();
                   if (obj instanceof List && (b1 != null && obj.isEmpty())) {
                      b1 = true;
                      goto label_004a ;
                   }
                }
             }
          }
       }
       b1 = false;
       goto label_004a ;
    }
    public final boolean b(){
       Boolean fALSE = Boolean.FALSE;
       boolean b = (!this.e.e(fALSE).booleanValue() && !this.g.e(fALSE).booleanValue())? false: true;
       return b;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof vt) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (!this.c.equals(p0.c) || (!this.d.equals(p0.d) || (!this.e.equals(p0.e) || (!this.f.equals(p0.f) || (!this.g.equals(p0.g) || (!this.h.equals(p0.h) || (!this.i.equals(p0.i) || (this.j != p0.j || this.k != p0.k)))))))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = 0xf4243;
       int i1 = (((((((((((((((((this.a.hashCode() ^ i) * i) ^ this.b.hashCode()) * i) ^ this.c.hashCode()) * i) ^ this.d.hashCode()) * i) ^ this.e.hashCode()) * i) ^ this.f.hashCode()) * i) ^ this.g.hashCode()) * i) ^ this.h.hashCode()) * i) ^ this.i.hashCode()) * i;
       int i2 = 1231;
       int i3 = (this.j != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       if (this.k == null) {
          i2 = 1237;
       }
       return (i1 ^ i2);
    }
    public final String toString(){
       return en6.q("Model{contextUri="+this.a+", entity="+this.b+", body="+this.c+", decoration="+this.d+", canPlayOnDemand="+this.e+", filterExplicitContent="+this.f+", isInOnDemandSet="+this.g+", isAvailableOffline="+this.h+", syncResult="+this.i+", timeoutReached="+this.j+", bodyLoadingStarted=", this.k, "}");
    }
}
