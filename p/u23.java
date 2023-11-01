package p.u23;
import p.o33;
import java.lang.String;
import com.google.common.collect.c;
import java.lang.Object;
import p.co5;
import p.io2;
import java.util.Arrays;

public final class u23 implements o33	// class@00282b from classes.dex
{
    public final String a;
    public final c b;

    public void u23(String p0,c p1){
       co5.o(p1, "actions");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof u23) {
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
