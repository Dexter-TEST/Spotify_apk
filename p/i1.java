package p.i1;
import java.io.Serializable;
import p.w1;
import p.dk0;
import p.ap5;
import p.l1;
import java.util.Map;
import java.lang.Object;

public abstract class i1 extends w1 implements Serializable	// class@001909 from classes.dex
{
    public Map c;
    public int t;

    public void i1(dk0 p0){
       super();
       ap5.e(p0.isEmpty());
       this.c = p0;
    }
    public final l1 a(){
       w1 tb;
       if ((tb = this.b) == null) {
          tb = new l1(this, this.c);
          this.b = tb;
       }
       return tb;
    }
    public final boolean equals(Object p0){
       return super.equals(p0);
    }
}
