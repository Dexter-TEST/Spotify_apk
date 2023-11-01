package p.c35;
import p.d35;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;

public final class c35 extends d35	// class@00118c from classes.dex
{
    public final String a;
    public final boolean b;

    public void c35(String p0,boolean p1){
       super();
       p0.getClass();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof c35) {
          return false;
       }
       if (p0.b != this.b || !p0.a.equals(this.a)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return tp2.h(this.b, tp2.g(this.a, 0, 31));
    }
    public final String toString(){
       return kg4.p("UpdateCode{code="+this.a+", completed=", this.b, '}');
    }
}
