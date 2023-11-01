package p.wc0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;

public abstract class wc0	// class@002b08 from classes.dex
{

    public void wc0(){
       super();
    }
    public abstract int a();
    public abstract long b();
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.a() != p0.a()) {
          return false;
       }
       if (this.b() - p0.b()) {
          return false;
       }
       return true;
    }
    public final String toString(){
       return "P\("+this.a()+"|"+this.b()+"\)";
    }
}
