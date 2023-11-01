package p.w1;
import p.fe4;
import java.lang.Object;
import p.l1;
import p.i1;
import java.lang.String;

public abstract class w1 implements fe4	// class@002aad from classes.dex
{
    public m1 a;
    public l1 b;

    public void w1(){
       super();
    }
    public abstract l1 a();
    public boolean equals(Object p0){
       boolean b;
       if (p0 == this) {
          b = true;
       }else if(p0 instanceof fe4){
          b = this.a().equals(p0.a());
       }else {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return this.a().hashCode();
    }
    public final String toString(){
       return this.a().toString();
    }
}
