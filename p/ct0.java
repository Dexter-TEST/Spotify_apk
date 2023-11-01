package p.ct0;
import p.xs0;
import p.ws0;
import p.at0;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class ct0	// class@00126f from classes.dex
{
    public final int a;
    public final ap5 b;
    public final eo5 c;
    public final uw5 d;
    public final boolean e;
    public final eo5 f;
    public final boolean g;

    public void ct0(int p0,xs0 p1,ws0 p2,at0 p3,boolean p4,ws0 p5,boolean p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ct0) {
          return false;
       }
       if (this.a != p0.a) {
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
       if (this.e != p0.e) {
          return false;
       }
       if (!co5.c(this.f, p0.f)) {
          return false;
       }
       if (this.g != p0.g) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       ct0 tc;
       ct0 te;
       ct0 tg;
       int i = (this.b.hashCode() + (this.a * 31)) * 31;
       int i1 = 0;
       int i2 = ((tc = this.c) == null)? 0: tc.hashCode();
       i2 = (this.d.hashCode() + ((i + i2) * 31)) * 31;
       i = 1;
       if ((te = this.e) != null) {
          te = 1;
       }
       i2 = (i2 + te) * 31;
       if ((te = this.f) != null) {
          i1 = te.hashCode();
       }
       i2 = (i2 + i1) * 31;
       if ((tg = this.g) == null) {
          ct0 uoct0 = tg;
       }
       return (i2 + i);
    }
    public final String toString(){
       return kg4.p("ViewModel\(itemResId="+this.a+", title="+this.b+", icon="+this.c+", style="+this.d+", isEnabled="+this.e+", accessoryIcon="+this.f+", dismissMenuWhenItemClicked=", this.g, ')');
    }
}
