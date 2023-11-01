package p.d8;
import java.lang.String;
import java.lang.Object;
import p.io2;
import java.util.Arrays;

public final class d8	// class@0012fe from classes.dex
{
    public final String a;
    public final String b;

    public void d8(String p0,String p1){
       super();
       this.b = p1;
       this.a = p0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof d8) {
          return false;
       }
       if (!io2.j(this.a, p0.a) || !io2.j(this.b, p0.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b};
       return Arrays.hashCode(objArray);
    }
}
