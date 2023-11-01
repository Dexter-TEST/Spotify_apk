package p.oj0;
import p.xw0;
import java.io.Serializable;
import p.vw0;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.is5;
import p.jc7;
import p.nj0;
import p.ng2;
import p.mj0;
import java.lang.IllegalStateException;
import p.vv7;
import p.ww0;
import java.lang.StringBuilder;
import p.bo6;
import p.hr7;
import p.il1;

public final class oj0 implements xw0, Serializable	// class@00212d from classes.dex
{
    public final xw0 a;
    public final vw0 b;

    public void oj0(vw0 p0,xw0 p1){
       co5.o(p1, "left");
       co5.o(p0, "element");
       super();
       this.a = p1;
       this.b = p0;
    }
    private final Object writeReplace(){
       int i = this.a();
       xw0[] oxw0Array = new xw0[i];
       is5 ois5 = new is5();
       this.J(jc7.a, new nj0(oxw0Array, ois5));
       i = (ois5.a == i)? 1: 0;
       if (i) {
          return new mj0(oxw0Array);
       }else {
          throw new IllegalStateException("Check failed.".toString());
       }
    }
    public final Object J(Object p0,ng2 p1){
       return p1.b(this.a.J(p0, p1), this.b);
    }
    public final xw0 T(xw0 p0){
       return vv7.G(this, p0);
    }
    public final int a(){
       int i = 2;
       oj0 ooj0 = this;
       while (true) {
          ooj0 = ooj0.a;
          if (ooj0 instanceof oj0) {
          label_000c :
             if (ooj0 == null) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             ooj0 = null;
             goto label_000c ;
          }
       }
       return i;
    }
    public final boolean equals(Object p0){
       boolean b;
       oj0 b1;
       int i;
       if (this != p0) {
          b = false;
          if (p0 instanceof oj0 && p0.a() == this.a()) {
             oj0 ooj0 = this;
             while (true) {
                if (!(b1 = ooj0.b)) {
                   i = 0;
                   break ;
                }else {
                   ooj0 = ooj0.a;
                   if (ooj0 instanceof oj0) {
                   }else {
                      co5.j(ooj0, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                      i = co5.c(p0.f(ooj0.getKey()), ooj0);
                      break ;
                   }
                }
             }
             if (i) {
             label_0044 :
                b = true;
             }
          }
       }else {
          goto label_0044 ;
       }
       return b;
    }
    public final vw0 f(ww0 p0){
       vw0 ovw0;
       co5.o(p0, "key");
       oj0 ooj0 = this;
       while (true) {
          if ((ovw0 = ooj0.b.f(p0)) != null) {
             return ovw0;
          }
          ooj0 = ooj0.a;
          if (ooj0 instanceof oj0) {
          }else {
             break ;
          }
       }
       return ooj0.f(p0);
    }
    public final int hashCode(){
       return (this.b.hashCode() + this.a.hashCode());
    }
    public final String toString(){
       return hr7.a("[", this.J("", bo6.t), ']');
    }
    public final xw0 y(ww0 p0){
       xw0 oxw0;
       co5.o(p0, "key");
       oj0 tb = this.b;
       oj0 ta = this.a;
       if (tb.f(p0) != null) {
          return ta;
       }
       if ((oxw0 = ta.y(p0)) == ta) {
          tb = this;
       }else if(oxw0 == il1.a){
          tb = new oj0(tb, oxw0);
       }
       return tb;
    }
}
