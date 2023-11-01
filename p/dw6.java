package p.dw6;
import p.aw6;
import p.cw6;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class dw6 implements aw6	// class@0013cf from classes.dex
{
    public aw6 a;
    public Object b;
    public static final cw6 c;

    static {
       dw6.c = new cw6();
    }
    public void dw6(aw6 p0){
       super();
       this.a = p0;
    }
    public final Object get(){
       cw6 c = dw6.c;
       if (this.a != c) {
          _monitor_enter(this);
          if (this.a != c) {
             Object obj = this.a.get();
             this.b = obj;
             this.a = c;
             _monitor_exit(this);
             return obj;
          }else {
             _monitor_exit(this);
          }
       }
       return this.b;
    }
    public final String toString(){
       dw6 ta = this.a;
       String str = "Suppliers.memoize\(";
       if (ta == dw6.c) {
          ta = "<supplier that returned "+this.b+">";
       }
       return str+ta+"\)";
    }
}
