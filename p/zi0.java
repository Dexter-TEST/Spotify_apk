package p.zi0;
import p.ca7;
import java.lang.Class;
import p.fa7;
import p.he3;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import p.dw5;

public final class zi0 extends ca7	// class@002efe from classes.dex
{
    public final he3 A;

    public void zi0(Class p0,fa7 p1,he3 p2,he3[] p3,he3 p4,Object p5,Object p6,boolean p7){
       he3 ohe3 = p4;
       this.A = ohe3;
    }
    public final he3 d(){
       return this.A;
    }
    public final StringBuilder e(StringBuilder p0){
       ca7.o(this.a, p0, true);
       return p0;
    }
    public final boolean equals(Object p0){
       return this.r(p0);
    }
    public final StringBuilder f(StringBuilder p0){
       ca7.o(this.a, p0, false);
       p0 = p0+'<';
       this.A.f(p0);
       return p0+">;";
    }
    public final boolean h(){
       boolean b = (!super.h() && !this.A.h())? false: true;
       return b;
    }
    public final boolean j(){
       return true;
    }
    public final he3 m(Class p0,fa7 p1,he3 p2,he3[] p3){
       zi0 v9 = new zi0(p0, p1, p2, p3, this.A, this.c, this.t, this.v);
       return v9;
    }
    public final he3 n(){
       he3 ohe3;
       if (this.v != null) {
          ohe3 = this;
       }else {
          zi0 v0 = new zi0(this.a, this.y, this.w, this.x, this.A.n(), this.c, this.t, true);
       }
       return ohe3;
    }
    public final String q(){
       zi0 tA;
       StringBuilder str = this.a.getName();
       if ((tA = this.A) != null && this.p(1)) {
          str = str+'<'+tA.c()+'>';
       }
       return str;
    }
    public final boolean r(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (p0 == null) {
          return false;
       }
       if (p0.getClass() != zi0.class) {
          return false;
       }
       if (this.a != p0.a || !this.A.equals(p0.A)) {
          b = false;
       }
       return b;
    }
    public final String toString(){
       return "[collection type; class "+this.a.getName()+", contains "+this.A+"]";
    }
}
