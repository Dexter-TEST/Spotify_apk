package p.hf7;
import java.lang.reflect.WildcardType;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.Class;
import p.do5;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.StringBuilder;

public final class hf7 implements WildcardType	// class@000225 from classes2.dex
{
    public final Type a;
    public final Type b;

    public void hf7(Type[] p0,Type[] p1){
       super();
       if (p1.length > 1) {
          throw new IllegalArgumentException();
       }
       if (p0.length != 1) {
          throw new IllegalArgumentException();
       }
       if (p1.length == 1) {
          object oobject = p1[0];
          oobject.getClass();
          do5.h(oobject);
          if (p0[0] == Object.class) {
             this.b = p1[0];
             this.a = Object.class;
          }else {
             throw new IllegalArgumentException();
          }
       }else {
          object oobject1 = p0[0];
          oobject1.getClass();
          do5.h(oobject1);
          this.b = null;
          this.a = p0[0];
       }
       return;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof WildcardType && do5.r(this, p0))? true: false;
       return b;
    }
    public final Type[] getLowerBounds(){
       hf7 tb;
       Type[] typeArray = ((tb = this.b) != null)? new Type[]{tb}: do5.C;
       return typeArray;
    }
    public final Type[] getUpperBounds(){
       Type[] typeArray = new Type[]{this.a};
       return typeArray;
    }
    public final int hashCode(){
       hf7 tb;
       int i = ((tb = this.b) != null)? tb.hashCode() + 31: 1;
       return (i ^ (this.a.hashCode() + 31));
    }
    public final String toString(){
       hf7 tb;
       hf7 ta;
       if ((tb = this.b) != null) {
          return "? super "+do5.w0(tb);
       }
       if ((ta = this.a) == Object.class) {
          return "?";
       }
       return "? extends "+do5.w0(ta);
    }
}
