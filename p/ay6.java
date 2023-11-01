package p.ay6;
import p.ui3;
import java.io.Serializable;
import p.wf2;
import java.lang.Object;
import p.i70;
import p.l93;
import p.co5;
import java.lang.String;

public final class ay6 implements ui3, Serializable	// class@00101a from classes.dex
{
    public wf2 a;
    public Object b;
    public final Object c;

    public void ay6(wf2 p0){
       super();
       this.a = p0;
       this.b = i70.E;
       this.c = this;
    }
    private final Object writeReplace(){
       return new l93(this.getValue());
    }
    public final Object getValue(){
       ay6 tb1;
       ay6 tb = this.b;
       i70 e = i70.E;
       if (tb != e) {
          return tb;
       }
       tb = this.c;
       _monitor_enter(tb);
       if ((tb1 = this.b) == e) {
          ay6 ta = this.a;
          co5.i(ta);
          tb1 = ta.invoke();
          this.b = tb1;
          this.a = null;
       }
       _monitor_exit(tb);
       return tb1;
    }
    public final String toString(){
       int i = (this.b != i70.E)? 1: 0;
       String str = (i)? String.valueOf(this.getValue()): "Lazy value not initialized yet.";
       return str;
    }
}
