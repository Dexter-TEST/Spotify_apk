package p.yf0;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.reflect.AccessibleObject;
import java.lang.String;

public final class yf0	// class@002da5 from classes.dex
{
    public final int a;
    public final Method b;

    public void yf0(int p0,Method p1){
       super();
       this.a = p0;
       this.b = p1;
       p1.setAccessible(true);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof yf0) {
          return false;
       }
       if (this.a != p0.a || !this.b.getName().equals(p0.b.getName())) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.b.getName().hashCode() + (this.a * 31));
    }
}
