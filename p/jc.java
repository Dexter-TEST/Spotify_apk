package p.jc;
import p.mi0;
import p.ld;
import p.fv1;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.md;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Integer;
import java.lang.Number;
import p.is7;
import p.jy6;
import android.os.Trace;
import java.lang.Class;
import java.lang.Long;
import java.lang.reflect.Method;
import java.lang.Exception;
import java.util.Collection;

public final class jc implements mi0	// class@001ab0 from classes.dex
{
    public final y37 a;
    public Long b;
    public final md c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;
    public final Set f;
    public final Set g;
    public final AtomicInteger h;
    public final ConcurrentHashMap i;

    public void jc(ld p0,fv1 p1){
       co5.o(p0, "timeKeeper");
       super();
       this.a = p0;
       this.c = p0.a("cold_startup");
       this.d = new ConcurrentHashMap();
       this.e = new ConcurrentHashMap();
       CopyOnWriteArraySet uCopyOnWrite = new CopyOnWriteArraySet();
       Set set = Collections.newSetFromMap(new ConcurrentHashMap());
       co5.l(set, "newSetFromMap\(ConcurrentHashMap\(\)\)");
       this.f = set;
       set = Collections.newSetFromMap(new ConcurrentHashMap());
       co5.l(set, "newSetFromMap\(ConcurrentHashMap\(\)\)");
       this.g = set;
       this.h = new AtomicInteger();
       this.i = new ConcurrentHashMap();
    }
    public final void a(String p0){
       Integer integer;
       Object obj;
       jc tc;
       jc tg = this.g;
       int i = 0;
       if (tg.contains(p0)) {
          tg = this.e;
          if ((integer = tg.get(p0)) == null) {
             integer = Integer.valueOf(i);
             if ((obj = tg.putIfAbsent(p0, integer)) != null) {
                integer = obj;
             }
          }
          tg.put(p0, Integer.valueOf((integer.intValue() + 1)));
          return;
       }else if(!this.f.contains(p0)){
          return;
       }else if((integer = this.i.get(p0)) == null){
          int i1 = integer.intValue();
          try{
             if (is7.v == null) {
                jy6.h(i1, p0);
             }else {
                String str = "asyncTraceEnd";
                int i2 = 3;
                if (is7.v == null) {
                   Class[] uClassArray = new Class[i2];
                   uClassArray[i] = Long.TYPE;
                   uClassArray[1] = String.class;
                   uClassArray[2] = Integer.TYPE;
                   is7.v = Trace.class.getMethod(str, uClassArray);
                }
                Object[] objArray = new Object[i2];
                objArray[i] = Long.valueOf(is7.b);
                objArray[1] = p0;
                objArray[2] = Integer.valueOf(i1);
                is7.v.invoke(null, objArray);
             }
          }catch(java.lang.NoSuchMethodError e0){
          }catch(java.lang.NoClassDefFoundError e0){
          }catch(java.lang.Exception e1){
             is7.s(e1);
          }
       }
       if ((tc = this.c) != null) {
          tc.c(p0);
       }
       tg.add(p0);
       return;
    }
    public final void b(String p0){
       Integer integer;
       Object obj;
       Integer integer1;
       Object obj1;
       jc tf = this.f;
       int i = 0;
       if (tf.contains(p0)) {
          tf = this.d;
          if ((integer = tf.get(p0)) == null) {
             integer = Integer.valueOf(i);
             if ((obj = tf.putIfAbsent(p0, integer)) != null) {
                integer = obj;
             }
          }
          tf.put(p0, Integer.valueOf((integer.intValue() + 1)));
          return;
       }else {
          jc ti = this.i;
          if ((integer1 = ti.get(p0)) == null) {
             integer1 = Integer.valueOf(this.h.incrementAndGet());
             if ((obj1 = ti.putIfAbsent(p0, integer1)) != null) {
                integer1 = obj1;
             }
          }
          co5.l(integer1, "traceId");
          int i1 = integer1.intValue();
          try{
             integer1 = 0;
             if (is7.t == null) {
                jy6.u(i1, p0);
             }else {
                String str = "asyncTraceBegin";
                int i2 = 3;
                if (is7.t == null) {
                   Class[] uClassArray = new Class[i2];
                   uClassArray[i] = Long.TYPE;
                   uClassArray[1] = String.class;
                   uClassArray[2] = Integer.TYPE;
                   is7.t = Trace.class.getMethod(str, uClassArray);
                }
                Object[] objArray = new Object[i2];
                objArray[i] = Long.valueOf(is7.b);
                objArray[1] = p0;
                objArray[2] = Integer.valueOf(i1);
                is7.t.invoke(integer1, objArray);
             }
          }catch(java.lang.NoSuchMethodError e0){
          }catch(java.lang.NoClassDefFoundError e0){
          }catch(java.lang.Exception e1){
             is7.s(e1);
          }
          if ((ti = this.c) != null) {
             ti.i(p0, integer1, i);
          }
          e0.add(p0);
          return;
       }
    }
}
