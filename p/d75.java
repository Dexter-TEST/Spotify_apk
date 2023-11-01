package p.d75;
import p.lv1;
import java.lang.reflect.Method;
import p.su0;
import p.gv5;
import java.lang.Object;
import p.fv5;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Exception;
import java.lang.IllegalArgumentException;
import p.do5;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.tp2;

public final class d75 extends lv1	// class@0001ad from classes2.dex
{
    public final int P;
    public final Method Q;
    public final int R;
    public final su0 S;

    public void d75(Method p0,int p1,su0 p2,int p3){
       this.P = p3;
       super();
       this.Q = p0;
       this.R = p1;
       this.S = p2;
    }
    public final void a(gv5 p0,Object p1){
       String key;
       Object value;
       d75 tS = this.S;
       d75 tQ = this.Q;
       d75 tR = this.R;
       switch (this.P){
           case 0:
             break;
           default:
             if (p1 != null) {
                p1 = p1.entrySet().iterator();
                while (true) {
                   if (!p1.hasNext()) {
                      return;
                   }
                   Map$Entry uEntry = p1.next();
                   if ((key = uEntry.getKey()) != null) {
                      if ((value = uEntry.getValue()) != null) {
                         p0.b(key, tS.a(value));
                      }else {
                         break ;
                      }
                   }else {
                      p1 = new Object[0];
                      throw do5.W(tQ, tR, "Header map contained null key.", p1);
                   }
                }
                p1 = new Object[0];
                throw do5.W(tQ, tR, tp2.m("Header map contained null value for key \'", key, "\'."), p1);
             }else {
                p1 = new Object[0];
                throw do5.W(tQ, tR, "Header map was null.", p1);
             }
       }
       if (p1 != null) {
          try{
             p0.k = tS.a(p1);
             return;
          }catch(java.io.IOException e7){
             Object[] objArray = new Object[v4];
             throw do5.X(tQ, e7, tR, "Unable to convert "+p1+" to RequestBody", objArray);
          }
       }else {
          p1 = new Object[0];
          throw do5.W(tQ, tR, "Body parameter value must not be null.", p1);
       }
    }
}
