package p.bw6;
import p.aw6;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class bw6 implements aw6, Serializable	// class@00114d from classes.dex
{
    public final aw6 a;
    public boolean b;
    public Object c;

    public void bw6(aw6 p0){
       super();
       this.a = p0;
    }
    public final Object get(){
       if (this.b == null) {
          _monitor_enter(this);
          if (this.b == null) {
             Object obj = this.a.get();
             this.c = obj;
             this.b = true;
             _monitor_exit(this);
             return obj;
          }else {
             _monitor_exit(this);
          }
       }
       return this.c;
    }
    public final String toString(){
       String str = "Suppliers.memoize\(";
       String str1 = (this.b != null)? "<supplier that returned "+this.c+">": this.a;
       return str+str1+"\)";
    }
}
