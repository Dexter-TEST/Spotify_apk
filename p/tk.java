package p.tk;
import p.ca7;
import p.he3;
import p.fa7;
import java.lang.Object;
import java.lang.Class;
import java.lang.StringBuilder;
import java.lang.String;

public final class tk extends ca7	// class@00278f from classes.dex
{
    public final he3 A;
    public final Object B;
    public static final int C;

    public void tk(he3 p0,fa7 p1,Object p2,Object p3,Object p4,boolean p5){
       super(p2.getClass(), p1, null, null, p0.b, p3, p4, p5);
       this.A = p0;
       this.B = p2;
    }
    public final he3 d(){
       return this.A;
    }
    public final StringBuilder e(StringBuilder p0){
       return this.A.e(p0+'[');
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.getClass() != tk.class) {
          return b;
       }
       return this.A.equals(p0.A);
    }
    public final StringBuilder f(StringBuilder p0){
       return this.A.f(p0+'[');
    }
    public final boolean h(){
       boolean b = (!super.h() && !this.A.h())? false: true;
       return b;
    }
    public final boolean j(){
       return true;
    }
    public final he3 m(Class p0,fa7 p1,he3 p2,he3[] p3){
       return null;
    }
    public final he3 n(){
       he3 ohe3;
       if (this.v != null) {
          ohe3 = this;
       }else {
          tk v0 = new tk(this.A.n(), this.y, this.B, this.c, this.t, true);
       }
       return ohe3;
    }
    public final String toString(){
       return "[array type, component type: "+this.A+"]";
    }
}
