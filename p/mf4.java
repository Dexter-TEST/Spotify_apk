package p.mf4;
import p.vg4;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.Class;
import p.co5;

public final class mf4	// class@001e85 from classes.dex
{
    public final vg4 a;
    public final boolean b;
    public final boolean c;
    public final Object d;

    public void mf4(vg4 p0,boolean p1,Object p2,boolean p3){
       super();
       int i = 1;
       int i1 = (p0.a == null && p1)? 0: 1;
       if (i1) {
          if (!p1 && (p3 && p2 == null)) {
             i = 0;
          }
          if (i) {
             this.a = p0;
             this.b = p1;
             this.d = p2;
             this.c = p3;
             return;
          }else {
             throw new IllegalArgumentException("Argument with type "+p0.b()+" has null value but is not nullable.".toString());
          }
       }else {
          throw new IllegalArgumentException(p0.b()+" does not allow nullable values".toString());
       }
    }
    public final boolean equals(Object p0){
       mf4 td;
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || !co5.c(mf4.class, p0.getClass())) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       p0 = p0.d;
       if ((td = this.d) != null) {
          b = co5.c(td, p0);
       }else if(p0 == null){
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       mf4 td;
       int i = ((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31;
       int i1 = ((td = this.d) != null)? td.hashCode(): 0;
       return (i + i1);
    }
    public final String toString(){
       String str = mf4.class.getSimpleName()+" Type: "+this.a+" Nullable: "+this.b;
       if (this.c != null) {
          str = str+" DefaultValue: "+this.d;
       }
       str = str;
       co5.l(str, "sb.toString\(\)");
       return str;
    }
}
