package p.sh1;
import p.ty0;
import java.lang.Object;
import p.tp2;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class sh1 extends ty0	// class@002629 from classes.dex
{
    public final boolean m;

    public void sh1(boolean p0){
       super();
       this.m = p0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof sh1) {
          return false;
       }
       if (p0.m != this.m) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return tp2.h(this.m, 0);
    }
    public final String toString(){
       return kg4.p("SetFavorite{enabled=", this.m, '}');
    }
}
