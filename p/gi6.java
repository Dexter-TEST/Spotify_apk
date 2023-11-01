package p.gi6;
import p.tm5;
import java.lang.Object;
import p.j63;

public final class gi6 implements tm5	// class@001716 from classes.dex
{
    public tm5 a;
    public Object b;
    public static final Object c;

    static {
       gi6.c = new Object();
    }
    public void gi6(j63 p0){
       super();
       this.b = gi6.c;
       this.a = p0;
    }
    public final Object get(){
       gi6 tb;
       if ((tb = this.b) == gi6.c) {
          if ((tb = this.a) == null) {
             tb = this.b;
          }else {
             tb = tb.get();
             this.b = tb;
             this.a = null;
          }
       }
       return tb;
    }
}
