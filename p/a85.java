package p.a85;
import p.c85;
import p.d85;
import java.lang.Object;
import p.tp2;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class a85 extends c85	// class@000f33 from classes.dex
{
    public final boolean a;

    public void a85(boolean p0){
       super();
       this.a = p0;
    }
    public final Object a(d85 p0,d85 p1,d85 p2){
       return p1.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof a85) {
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
       return kg4.p("PasswordFocusChanged{hasFocus=", this.a, '}');
    }
}
