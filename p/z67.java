package p.z67;
import java.lang.String;
import java.lang.Object;
import p.io2;
import java.util.Arrays;

public final class z67	// class@002e9b from classes.dex
{
    public final String a;
    public final String b;

    public void z67(String p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof z67) {
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
