package p.xf0;
import java.util.HashMap;
import java.lang.Object;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.kj3;
import java.util.List;
import java.util.ArrayList;
import p.yf0;
import p.ek3;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import java.lang.String;

public final class xf0	// class@002c64 from classes.dex
{
    public final HashMap a;
    public final Map b;

    public void xf0(HashMap p0){
       List list;
       super();
       this.b = p0;
       this.a = new HashMap();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          kj3 value = uEntry.getValue();
          if ((list = this.a.get(value)) == null) {
             list = new ArrayList();
             this.a.put(value, list);
          }
          list.add(uEntry.getKey());
       }
       return;
    }
    public static void a(List p0,ek3 p1,kj3 p2,Object p3){
       Object[] objArray;
       if (p0 != null) {
          int i = p0.size() - 1;
          while (i >= 0) {
             yf0 oyf0 = p0.get(i);
             try{
                oyf0.getClass();
                yf0 a = oyf0.a;
                oyf0 = oyf0.b;
                if (a != null) {
                   if (a != 1) {
                      if (a == 2) {
                         objArray = new Object[]{p1,p2};
                         oyf0.invoke(p3, objArray);
                      }
                   }else {
                      objArray = new Object[]{p1};
                      oyf0.invoke(p3, objArray);
                   }
                }else {
                   objArray = new Object[0];
                   oyf0.invoke(p3, objArray);
                }
                i = i - 1;
             }catch(java.lang.reflect.InvocationTargetException e6){
                throw new RuntimeException("Failed to call observer method", e6.getCause());
             }catch(java.lang.IllegalAccessException e6){
                throw new RuntimeException(e6);
             }
          }
       }
       return;
    }
}
