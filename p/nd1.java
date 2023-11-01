package p.nd1;
import p.tm5;
import p.ti3;
import java.lang.Object;
import java.lang.Class;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;

public final class nd1 implements tm5, ti3	// class@001fb4 from classes.dex
{
    public tm5 a;
    public Object b;
    public static final Object c;

    static {
       nd1.c = new Object();
    }
    public void nd1(tm5 p0){
       super();
       this.b = nd1.c;
       this.a = p0;
    }
    public static ti3 a(tm5 p0){
       if (p0 instanceof ti3) {
          return p0;
       }
       p0.getClass();
       return new nd1(p0);
    }
    public static tm5 b(tm5 p0){
       p0.getClass();
       if (p0 instanceof nd1) {
          return p0;
       }
       return new nd1(p0);
    }
    public final Object get(){
       nd1 tb1;
       nd1 tb = this.b;
       Object c = nd1.c;
       if (tb == c) {
          _monitor_enter(this);
          if ((tb = this.b) == c) {
             tb = this.a.get();
             c = ((tb1 = this.b) != c)? 1: 0;
             if (c && tb1 != tb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: "+tb1+" & "+tb+". This is likely due to a circular dependency.");
             }else {
                this.b = tb;
                this.a = null;
             }
          }
          _monitor_exit(this);
       }
       return tb;
    }
}
