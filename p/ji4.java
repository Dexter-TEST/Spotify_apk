package p.ji4;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class ji4	// class@001ae1 from classes.dex
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public void ji4(boolean p0,boolean p1,boolean p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ji4) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       ji4 ta;
       ji4 tb;
       int i2;
       int i = 1;
       if ((ta = this.a) != null) {
          ta = 1;
       }
       int i1 = ta * 31;
       if ((tb = this.b) != null) {
          tb = 1;
       }
       i1 = (i1 + tb) * 31;
       if ((tb = this.c) != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       if ((tb = this.d) == null) {
          i = tb;
       }
       return (i1 + i);
    }
    public final String toString(){
       return kg4.p("NetworkState\(isConnected="+this.a+", isValidated="+this.b+", isMetered="+this.c+", isNotRoaming=", this.d, ')');
    }
}
