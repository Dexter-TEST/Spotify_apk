package p.ja7;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import p.he3;
import java.lang.StringBuilder;

public final class ja7	// class@001a9d from classes.dex
{
    public final int a;
    public final Class b;
    public final he3 c;
    public final boolean d;

    public void ja7(Class p0,boolean p1){
       super();
       this.b = p0;
       this.c = null;
       this.d = p1;
       int i = (p1)? p0.getName().hashCode() + 1: p0.getName().hashCode();
       this.a = i;
       return;
    }
    public void ja7(he3 p0,boolean p1){
       super();
       this.c = p0;
       this.b = null;
       this.d = p1;
       int i = (p1)? p0.b - 2: p0.b - 1;
       this.a = i;
       return;
    }
    public final boolean equals(Object p0){
       ja7 tb;
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0 == this) {
          return true;
       }
       if (p0.getClass() != ja7.class) {
          return b;
       }
       if (p0.d != this.d) {
          return b;
       }
       if ((tb = this.b) == null) {
          return this.c.equals(p0.c);
       }
       if (p0.b == tb) {
          b = true;
       }
       return b;
    }
    public final int hashCode(){
       return this.a;
    }
    public final String toString(){
       ja7 tb;
       String str = "}";
       ja7 td = this.d;
       if ((tb = this.b) != null) {
          return "{class: "+tb.getName()+", typed? "+td+str;
       }
       return "{type: "+this.c+", typed? "+td+str;
    }
}
