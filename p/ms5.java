package p.ms5;
import p.bi6;
import java.lang.Class;
import p.fa7;
import p.he3;
import java.lang.Object;
import java.util.Objects;
import java.lang.StringBuilder;
import p.ca7;
import java.lang.String;

public final class ms5 extends bi6	// class@001ef8 from classes.dex
{
    public final he3 A;
    public final he3 B;

    public void ms5(Class p0,fa7 p1,he3 p2,he3[] p3,he3 p4,he3 p5,Object p6,Object p7,boolean p8){
       int i = this;
       super(p0, p1, p2, p3, Objects.hashCode(p4), p6, p7, p8);
       i.A = p4;
       he3 ohe3 = (p5 == null)? i: p5;
       i.B = ohe3;
       return;
    }
    public final he3 a(){
       return this.A;
    }
    public final boolean b(){
       return true;
    }
    public final he3 d(){
       return this.A;
    }
    public final StringBuilder e(StringBuilder p0){
       ca7.o(this.a, p0, true);
       return p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.getClass() != ms5.class) {
          return b;
       }
       if (p0.a != this.a) {
          return b;
       }
       return this.A.equals(p0.A);
    }
    public final StringBuilder f(StringBuilder p0){
       ca7.o(this.a, p0, false);
       return this.A.f(p0+'<')+">;";
    }
    public final he3 g(){
       return this.A;
    }
    public final he3 m(Class p0,fa7 p1,he3 p2,he3[] p3){
       ms5 p1 = new ms5(p0, this.y, p2, p3, this.A, this.B, this.c, this.t, this.v);
       return p1;
    }
    public final he3 n(){
       return this.s();
    }
    public final String q(){
       ms5 tA;
       StringBuilder str = this.a.getName();
       if ((tA = this.A) != null && this.p(1)) {
          str = str+'<'+tA.q()+'>';
       }
       return str;
    }
    public final bi6 r(){
       return this.s();
    }
    public final ms5 s(){
       if (this.v != null) {
          return this;
       }
       ms5 v0 = new ms5(this.a, this.y, this.w, this.x, this.A.n(), this.B, this.c, this.t, true);
       return v0;
    }
    public final String toString(){
       return new StringBuilder(40)+"[reference type, class "+this.q()+'<'+this.A+">]";
    }
}
