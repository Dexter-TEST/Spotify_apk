package p.i75;
import p.lv1;
import java.lang.reflect.Method;
import p.mp2;
import p.su0;
import java.lang.String;
import p.gv5;
import java.lang.Object;
import p.fv5;
import java.lang.Class;
import p.co5;
import p.ie4;
import p.gg1;
import p.he4;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import p.do5;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.tp2;

public final class i75 extends lv1	// class@00023b from classes2.dex
{
    public final int P;
    public final Method Q;
    public final int R;
    public final su0 S;
    public final Object T;

    public void i75(Method p0,int p1,mp2 p2,su0 p3){
       this.P = 0;
       super();
       this.Q = p0;
       this.R = p1;
       this.T = p2;
       this.S = p3;
    }
    public void i75(Method p0,int p1,su0 p2,String p3){
       this.P = 1;
       super();
       this.Q = p0;
       this.R = p1;
       this.S = p2;
       this.T = p3;
    }
    public final void a(gv5 p0,Object p1){
       fv5 uofv5;
       String key;
       Object value;
       String str = "body";
       p0 = p0.i;
       i75 tT = this.T;
       i75 tR = this.R;
       i75 tQ = this.Q;
       i75 tS = this.S;
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
                         String[] stringArray = new String[]{"Content-Disposition",tp2.m("form-data; name=\"", key, "\""),"Content-Transfer-Encoding",tT};
                         uofv5 = tS.a(value);
                         p0.getClass();
                         co5.o(uofv5, str);
                         p0.c.add(gg1.o(gg1.O(stringArray), uofv5));
                      }else {
                         break ;
                      }
                   }else {
                      p1 = new Object[0];
                      throw do5.W(tQ, tR, "Part map contained null key.", p1);
                   }
                }
                p1 = new Object[0];
                throw do5.W(tQ, tR, tp2.m("Part map contained null value for key \'", key, "\'."), p1);
             }else {
                p1 = new Object[0];
                throw do5.W(tQ, tR, "Part map was null.", p1);
             }
       }
       if (p1 != null) {
          try{
             uofv5 = tS.a(p1);
             p0.getClass();
             co5.o(uofv5, str);
             p0.c.add(gg1.o(tT, uofv5));
          }catch(java.io.IOException e13){
             Object[] objArray = new Object[]{e13};
             throw do5.W(tQ, tR, "Unable to convert "+gg1.o(tT, uofv5)+" to RequestBody", objArray);
          }
       }
       return;
    }
}
