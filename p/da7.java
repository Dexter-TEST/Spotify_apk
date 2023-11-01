package p.da7;
import java.lang.Class;
import p.he3;
import java.lang.Object;
import java.lang.String;

public final class da7	// class@001310 from classes.dex
{
    public final Class a;
    public final he3[] b;
    public final int c;

    public void da7(Class p0,he3[] p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 == null) {
          return false;
       }
       if (p0.getClass() != da7.class) {
          return false;
       }
       if (this.c == p0.c && this.a == p0.a) {
          da7 tb = this.b;
          int len = tb.length;
          p0 = p0.b;
          if (len == p0.length) {
             int i = 0;
             while (true) {
                if (i >= len) {
                   return true;
                }
                if (!tb[i].equals(p0[i])) {
                   break ;
                }else {
                   i = i + 1;
                }
             }
             return false;
          }
       }
       return false;
    }
    public final int hashCode(){
       return this.c;
    }
    public final String toString(){
       return this.a.getName().concat("<>");
    }
}
