package p.v46;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class v46	// class@00297f from classes.dex
{
    public final int a;
    public final int b;

    public void v46(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof v46) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return ((this.a * 31) + this.b);
    }
    public final String toString(){
       return tp2.n("ScrollEvent\(y="+this.a+", oldY=", this.b, ')');
    }
}
