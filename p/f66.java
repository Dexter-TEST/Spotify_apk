package p.f66;
import p.ty0;
import java.lang.Object;
import p.tp2;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class f66 extends ty0	// class@00156c from classes.dex
{
    public final boolean m;

    public void f66(boolean p0){
       super();
       this.m = p0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof f66) {
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
       return kg4.p("ShowAddToPlaylistResult{successful=", this.m, '}');
    }
}
