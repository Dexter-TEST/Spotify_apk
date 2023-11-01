package p.f75;
import p.lv1;
import java.lang.reflect.Method;
import p.gv5;
import java.util.Map;
import p.i70;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import p.do5;
import p.tp2;

public final class f75 extends lv1	// class@0001ec from classes2.dex
{
    public final int P;
    public final Method Q;
    public final int R;
    public final boolean S;

    public void f75(Method p0,int p1,boolean p2,int p3){
       this.P = p3;
       super();
       this.Q = p0;
       this.R = p1;
       this.S = p2;
    }
    public final void I(gv5 p0,Map p1){
       Iterator iterator;
       Map$Entry uEntry;
       String key;
       Object value;
       String str;
       Object[] objArray;
       f75 tS = this.S;
       f75 tQ = this.Q;
       f75 tR = this.R;
       switch (this.P){
           case 0:
             break;
           default:
             if (p1 != null) {
                iterator = p1.entrySet().iterator();
                while (true) {
                   if (!iterator.hasNext()) {
                      return;
                   }
                   uEntry = iterator.next();
                   if ((key = uEntry.getKey()) != null) {
                      if ((value = uEntry.getValue()) != null) {
                         if ((str = value.toString()) != null) {
                            p0.c(key, str, tS);
                         }else {
                            break ;
                         }
                      }else {
                         objArray = new Object[0];
                         throw do5.W(tQ, tR, tp2.m("Query map contained null value for key \'", key, "\'."), objArray);
                      }
                   }else {
                      objArray = new Object[0];
                      throw do5.W(tQ, tR, "Query map contained null key.", objArray);
                   }
                }
                objArray = new Object[0];
                throw do5.W(tQ, tR, "Query map value \'"+value+"\' converted to null by "+i70.class.getName()+" for key \'"+key+"\'.", objArray);
             }else {
                objArray = new Object[0];
                throw do5.W(tQ, tR, "Query map was null", objArray);
             }
       }
       if (p1 != null) {
          iterator = p1.entrySet().iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return;
             }
             uEntry = iterator.next();
             if ((key = uEntry.getKey()) != null) {
                if ((value = uEntry.getValue()) != null) {
                   if ((str = value.toString()) != null) {
                      p0.a(key, str, tS);
                   }else {
                      break ;
                   }
                }else {
                   objArray = new Object[0];
                   throw do5.W(tQ, tR, tp2.m("Field map contained null value for key \'", key, "\'."), objArray);
                }
             }else {
                objArray = new Object[0];
                throw do5.W(tQ, tR, "Field map contained null key.", objArray);
             }
          }
          objArray = new Object[0];
          throw do5.W(tQ, tR, "Field map value \'"+value+"\' converted to null by "+i70.class.getName()+" for key \'"+key+"\'.", objArray);
       }else {
          objArray = new Object[0];
          throw do5.W(tQ, tR, "Field map was null.", objArray);
       }
    }
    public final void a(gv5 p0,Object p1){
       switch (this.P){
           case 0:
           default:
             this.I(p0, p1);
             return;
       }
       this.I(p0, p1);
       return;
    }
}
