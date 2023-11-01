package p.j74;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class j74	// class@001a7f from classes.dex
{
    public final int a;
    public final int b;

    public void j74(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof j74) {
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
       return tp2.n("Message\(notificationTitle="+this.a+", notificationText=", this.b, ')');
    }
}
