package p.qy5;
import java.io.Serializable;
import p.v45;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class qy5 extends v45 implements Serializable	// class@00243d from classes.dex
{
    public final v45 a;

    public void qy5(v45 p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final v45 a(){
       return this.a;
    }
    public final int compare(Object p0,Object p1){
       return this.a.compare(p1, p0);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof qy5) {
          return this.a.equals(p0.a);
       }
       return false;
    }
    public final int hashCode(){
       return (- this.a.hashCode());
    }
    public final String toString(){
       return this.a+".reverse\(\)";
    }
}
