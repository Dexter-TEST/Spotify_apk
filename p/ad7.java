package p.ad7;
import p.ui3;
import java.io.Serializable;
import p.h90;
import java.lang.Object;
import p.i70;
import p.l93;
import p.co5;
import p.wf2;
import java.lang.String;

public final class ad7 implements ui3, Serializable	// class@000f62 from classes.dex
{
    public wf2 a;
    public Object b;

    public void ad7(h90 p0){
       super();
       this.a = p0;
       this.b = i70.E;
    }
    private final Object writeReplace(){
       return new l93(this.getValue());
    }
    public final Object getValue(){
       if (this.b == i70.E) {
          ad7 ta = this.a;
          co5.i(ta);
          this.b = ta.invoke();
          this.a = null;
       }
       return this.b;
    }
    public final String toString(){
       int i = (this.b != i70.E)? 1: 0;
       String str = (i)? String.valueOf(this.getValue()): "Lazy value not initialized yet.";
       return str;
    }
}
