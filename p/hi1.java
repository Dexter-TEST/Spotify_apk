package p.hi1;
import p.ji1;
import p.ni1;
import java.lang.Object;
import p.tp2;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class hi1 extends ji1	// class@001857 from classes.dex
{
    public final boolean a;

    public void hi1(boolean p0){
       super();
       this.a = p0;
    }
    public final Object a(ni1 p0,ni1 p1,ni1 p2){
       return p1.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof hi1) {
          return false;
       }
       if (p0.a != this.a) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return tp2.h(this.a, 0);
    }
    public final String toString(){
       return kg4.p("EmailFocusChanged{hasFocus=", this.a, '}');
    }
}
