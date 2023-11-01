package p.cu2;
import java.lang.String;
import p.ju2;
import p.m73;
import java.lang.Object;
import java.lang.Class;
import java.util.Map;
import p.io2;
import java.util.Arrays;

public final class cu2	// class@00127a from classes.dex
{
    public final String a;
    public final ju2 b;
    public final m73 c;

    public void cu2(String p0,ju2 p1,m73 p2){
       super();
       p0.getClass();
       this.a = p0;
       p1.getClass();
       this.b = p1;
       this.c = m73.b(p2);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof cu2) {
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
