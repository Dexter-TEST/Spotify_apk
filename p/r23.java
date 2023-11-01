package p.r23;
import p.i13;
import p.s23;
import java.lang.String;
import p.a23;
import java.lang.Object;
import p.co5;
import java.lang.Integer;
import p.eb3;
import p.q23;
import p.au2;
import java.util.Set;
import p.oi;
import p.io2;
import java.util.Arrays;

public final class r23 extends i13	// class@002461 from classes.dex
{
    public final String a;
    public final String b;
    public final a23 c;
    public final s23 d;

    public void r23(s23 p0,String p1,String p2,a23 p3){
       co5.o(p3, "custom");
       this.d = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
    }
    public final i13 a(Integer p0){
       i13 oi13;
       if (eb3.g(this.c, "imageRes", p0)) {
          oi13 = this;
       }else {
          oi13 = new q23(this);
          oi13.a(p0);
       }
       return oi13;
    }
    public final i13 b(au2 p0){
       i13 oi13;
       co5.o(p0, "custom");
       if (p0.keySet().isEmpty()) {
          oi13 = this;
       }else {
          oi13 = new q23(this);
          oi13.b(p0);
       }
       return oi13;
    }
    public final s23 c(){
       return this.d;
    }
    public final i13 d(au2 p0){
       i13 oi13;
       if (oi.k(this.c, p0)) {
          oi13 = this;
       }else {
          oi13 = new q23(this);
          oi13.d(p0);
       }
       return oi13;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof r23) {
          return false;
       }
       if (!io2.j(this.a, p0.a) || (!io2.j(this.b, p0.b) || !io2.j(this.c, p0.c))) {
          b = false;
       }
       return b;
    }
    public final i13 f(String p0){
       i13 oi13;
       if (io2.j(this.b, p0)) {
          oi13 = this;
       }else {
          oi13 = new q23(this);
          oi13.b = p0;
       }
       return oi13;
    }
    public final i13 g(String p0){
       i13 oi13;
       if (io2.j(this.a, p0)) {
          oi13 = this;
       }else {
          oi13 = new q23(this);
          oi13.a = p0;
       }
       return oi13;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b,this.c};
       return Arrays.hashCode(objArray);
    }
}
