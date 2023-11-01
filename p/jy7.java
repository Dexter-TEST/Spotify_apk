package p.jy7;
import p.ly7;
import p.hy7;
import java.lang.Object;
import java.lang.Class;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.StringBuilder;

public final class jy7 implements ly7, hy7	// class@001b6f from classes.dex
{
    public ly7 a;
    public Object b;
    public static final Object c;

    static {
       jy7.c = new Object();
    }
    public void jy7(ly7 p0){
       super();
       this.b = jy7.c;
       this.a = p0;
    }
    public static hy7 a(ly7 p0){
       if (p0 instanceof hy7) {
          return p0;
       }
       p0.getClass();
       return new jy7(p0);
    }
    public static ly7 b(ly7 p0){
       if (p0 instanceof jy7) {
          return p0;
       }
       return new jy7(p0);
    }
    public final Object c(){
       jy7 tb1;
       jy7 tb = this.b;
       Object c = jy7.c;
       if (tb == c) {
          _monitor_enter(this);
          if ((tb = this.b) == c) {
             tb = this.a.c();
             if ((tb1 = this.b) != c && tb1 != tb) {
                String str = String.valueOf(tb1);
                String str1 = String.valueOf(tb);
                StringBuilder str2 = new StringBuilder(((str.length() + 118) + str1.length()))+"Scoped provider was invoked recursively returning different results: "+str;
                str2 = str2+" & "+str1;
                throw new IllegalStateException(str2+". This is likely due to a circular dependency.");
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
