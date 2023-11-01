package p.ro;
import p.dt5;
import java.lang.Object;
import java.lang.Class;
import p.io2;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Arrays;

public final class ro	// class@00252d from classes.dex
{
    public final Map a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public void ro(dt5 p0,boolean p1,int p2,boolean p3,boolean p4,boolean p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || ro.class != p0.getClass()) {
          return false;
       }
       if (!io2.j(this.a, p0.a) || (this.b != p0.b || (this.c != p0.c || (this.d != p0.d || (this.e != p0.e || this.f != p0.f))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,Boolean.valueOf(this.b),Integer.valueOf(this.c),Boolean.valueOf(this.d),Boolean.valueOf(this.e),Boolean.valueOf(this.f)};
       return Arrays.hashCode(objArray);
    }
}
