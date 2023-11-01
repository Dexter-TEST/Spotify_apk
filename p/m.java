package p.m;
import java.lang.reflect.WildcardType;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import p.mi;
import java.lang.String;
import java.lang.StringBuilder;

public final class m implements WildcardType, Serializable	// class@001e53 from classes.dex
{
    public final Type a;
    public final Type b;

    public void m(Type[] p0,Type[] p1){
       super();
       boolean b = true;
       boolean b1 = (p1.length <= b)? true: false;
       co5.g(b1);
       b1 = (p0.length == b)? true: false;
       co5.g(b1);
       if (p1.length == b) {
          p1[0].getClass();
          mi.f(p1[0]);
          if (p0[0] != Object.class) {
             b = false;
          }
          co5.g(b);
          this.b = mi.e(p1[0]);
          this.a = Object.class;
       }else {
          p0[0].getClass();
          mi.f(p0[0]);
          this.b = null;
          this.a = mi.e(p0[0]);
       }
       return;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof WildcardType && mi.o(this, p0))? true: false;
       return b;
    }
    public final Type[] getLowerBounds(){
       m tb;
       Type[] typeArray = ((tb = this.b) != null)? new Type[]{tb}: mi.a;
       return typeArray;
    }
    public final Type[] getUpperBounds(){
       Type[] typeArray = new Type[]{this.a};
       return typeArray;
    }
    public final int hashCode(){
       m tb;
       int i = ((tb = this.b) != null)? tb.hashCode() + 31: 1;
       return (i ^ (this.a.hashCode() + 31));
    }
    public final String toString(){
       m tb;
       m ta;
       if ((tb = this.b) != null) {
          return "? super "+mi.P(tb);
       }
       if ((ta = this.a) == Object.class) {
          return "?";
       }
       return "? extends "+mi.P(ta);
    }
}
