package p.x7;
import java.lang.String;
import java.lang.Object;
import p.io2;
import java.util.Arrays;

public final class x7	// class@002c26 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;

    public void x7(String p0,String p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof x7) {
          return false;
       }
       if (!io2.j(this.a, p0.a) || (!io2.j(this.b, p0.b) || !io2.j(this.c, p0.c))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b,this.c};
       return Arrays.hashCode(objArray);
    }
}
