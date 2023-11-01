package p.bi6;
import p.ca7;
import java.lang.Class;
import p.fa7;
import p.he3;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;

public class bi6 extends ca7	// class@0010d0 from classes.dex
{

    public void bi6(Class p0){
       super(p0, fa7.x, null, null);
    }
    public void bi6(Class p0,fa7 p1,he3 p2,he3[] p3){
       super(p0, p1, p2, p3, null, null, false);
    }
    public void bi6(Class p0,fa7 p1,he3 p2,he3[] p3,int p4,Object p5,Object p6,boolean p7){
       super(p0, p1, p2, p3, p4, p5, p6, p7);
    }
    public void bi6(Class p0,fa7 p1,he3 p2,he3[] p3,Object p4,Object p5,boolean p6){
       super(p0, p1, p2, p3, 0, p4, p5, p6);
    }
    public StringBuilder e(StringBuilder p0){
       ca7.o(this.a, p0, true);
       return p0;
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.getClass() != this.getClass()) {
          return b;
       }
       if (p0.a != this.a) {
          return b;
       }
       return this.y.equals(p0.y);
    }
    public StringBuilder f(StringBuilder p0){
       int len;
       he3 ohe3;
       boolean b = false;
       ca7.o(this.a, p0, b);
       ca7 ty = this.y;
       if ((len = ty.b.length) > 0) {
          p0 = p0+'<';
          for (; b < len; b = b + 1) {
             if (b >= 0) {
                fa7 b1 = ty.b;
                if (b < b1.length) {
                   ohe3 = b1[b];
                label_0023 :
                   p0 = ohe3.f(p0);
                }
             }else {
                ty.getClass();
             }
             ohe3 = null;
             goto label_0023 ;
          }
          p0 = p0+'>';
       }
       return p0+';';
    }
    public final boolean j(){
       return false;
    }
    public he3 m(Class p0,fa7 p1,he3 p2,he3[] p3){
       return null;
    }
    public he3 n(){
       return this.r();
    }
    public String q(){
       int len;
       ca7 uoca7;
       StringBuilder str = this.a.getName();
       ca7 ty = this.y;
       if ((len = ty.b.length) > 0 && this.p(len)) {
          str = str+'<';
          for (int i = 0; i < len; i = i + 1) {
             if (i >= 0) {
                fa7 b = ty.b;
                if (i < b.length) {
                   uoca7 = b[i];
                label_0032 :
                   if (i > 0) {
                      str = str.append(',');
                   }
                   str = str.append(uoca7.q());
                }
             }else {
                ty.getClass();
             }
             uoca7 = null;
             goto label_0032 ;
          }
          str = str+'>';
       }
       return str;
    }
    public bi6 r(){
       bi6 uobi6;
       if (this.v != null) {
          uobi6 = this;
       }else {
          bi6 v0 = new bi6(this.a, this.y, this.w, this.x, this.c, this.t, true);
       }
       return uobi6;
    }
    public String toString(){
       return new StringBuilder(40)+"[simple type, class "+this.q()+']';
    }
}
