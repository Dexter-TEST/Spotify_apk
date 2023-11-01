package p.x11;
import java.lang.Class;
import java.lang.Object;
import java.lang.Boolean;

public final class x11	// class@002be8 from classes.dex
{
    public final Class a;
    public final boolean b;

    public void x11(Class p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof x11 && (p0.a.equals(this.a) && p0.b == this.b)) {
          b = true;
       }
       return b;
    }
    public final int hashCode(){
       return (((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ Boolean.valueOf(this.b).hashCode());
    }
}
