package p.ve7$c;
import java.lang.reflect.WildcardType;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.Class;
import p.ve7;
import java.lang.IllegalArgumentException;
import p.ya7;
import java.lang.String;
import java.lang.StringBuilder;

public final class ve7$c implements WildcardType	// class@0029dd from classes.dex
{
    private final Type a;
    private final Type b;

    public void ve7$c(Type[] p0,Type[] p1){
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
          ve7.b(oobject);
          if (p0[0] == Object.class) {
             this.b = ve7.a(p1[0]);
             this.a = Object.class;
          }else {
             throw new IllegalArgumentException();
          }
       }else {
          object oobject1 = p0[0];
          oobject1.getClass();
          ve7.b(oobject1);
          this.b = null;
          this.a = ve7.a(p0[0]);
       }
       return;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof WildcardType && ya7.d(this, p0))? true: false;
       return b;
    }
    public Type[] getLowerBounds(){
       ve7$c tb;
       Type[] typeArray = ((tb = this.b) != null)? new Type[]{tb}: ve7.b;
       return typeArray;
    }
    public Type[] getUpperBounds(){
       Type[] typeArray = new Type[]{this.a};
       return typeArray;
    }
    public int hashCode(){
       ve7$c tb;
       int i = ((tb = this.b) != null)? tb.hashCode() + 31: 1;
       return (i ^ (this.a.hashCode() + 31));
    }
    public String toString(){
       if (this.b != null) {
          return "? super "+ve7.v(this.b);
       }
       if (this.a == Object.class) {
          return "?";
       }
       return "? extends "+ve7.v(this.a);
    }
}
