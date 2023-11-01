package p.j14;
import p.ca7;
import java.lang.Class;
import p.fa7;
import p.he3;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;

public abstract class j14 extends ca7	// class@001a47 from classes.dex
{
    public final he3 A;
    public final he3 B;

    public void j14(Class p0,fa7 p1,he3 p2,he3[] p3,he3 p4,he3 p5,Object p6,Object p7,boolean p8){
       int i = this;
       he3 ohe3 = p4;
       he3 ohe31 = p5;
       super(p0, p1, p2, p3, (ohe3.b ^ ohe31.b), p6, p7, p8);
       i.A = ohe3;
       i.B = ohe31;
    }
    public final he3 d(){
       return this.B;
    }
    public final StringBuilder e(StringBuilder p0){
       ca7.o(this.a, p0, true);
       return p0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (p0 == null) {
          return false;
       }
       if (p0.getClass() != this.getClass()) {
          return false;
       }
       if (this.a != p0.a || (!this.A.equals(p0.A) || !this.B.equals(p0.B))) {
          b = false;
       }
       return b;
    }
    public final StringBuilder f(StringBuilder p0){
       ca7.o(this.a, p0, false);
       p0 = p0+'<';
       this.A.f(p0);
       this.B.f(p0);
       return p0+">;";
    }
    public final boolean h(){
       boolean b = (!super.h() && (!this.B.h() && !this.A.h()))? false: true;
       return b;
    }
    public final boolean j(){
       return true;
    }
    public final String q(){
       j14 tA;
       StringBuilder str = this.a.getName();
       if ((tA = this.A) != null && this.p(2)) {
          str = str+'<'+tA.q()+','+this.B.q()+'>';
       }
       return str;
    }
}
