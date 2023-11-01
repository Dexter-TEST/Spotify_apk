package p.fj;
import java.lang.Object;
import android.content.Context;
import java.util.HashSet;
import java.util.HashMap;
import android.os.Bundle;
import java.lang.String;
import java.util.Set;
import android.os.BaseBundle;
import java.util.Iterator;
import java.lang.Class;
import p.m93;
import p.cd2;
import java.lang.Throwable;
import p.is7;
import android.os.Trace;
import java.lang.reflect.Constructor;
import java.util.List;
import java.lang.IllegalStateException;

public final class fj	// class@0015df from classes.dex
{
    public final HashMap a;
    public final HashSet b;
    public final Context c;
    public static fj d;
    public static final Object e;

    static {
       fj.e = new Object();
    }
    public void fj(Context p0){
       super();
       this.c = p0.getApplicationContext();
       this.b = new HashSet();
       this.a = new HashMap();
    }
    public static fj c(Context p0){
       if (fj.d == null) {
          Object e = fj.e;
          _monitor_enter(e);
          if (fj.d == null) {
             fj.d = new fj(p0);
          }
          _monitor_exit(e);
       }
       return fj.d;
    }
    public final void a(Bundle p0){
       fj tb;
       String str = this.c.getString(R.string.androidx_startup);
       if (p0 != null) {
          try{
             HashSet hashSet = new HashSet();
             Iterator iterator = p0.keySet().iterator();
             while (true) {
                tb = this.b;
                if (iterator.hasNext()) {
                   String str1 = iterator.next();
                   if (str.equals(p0.getString(str1, null))) {
                      Class uClass = Class.forName(str1);
                      if (m93.class.isAssignableFrom(uClass)) {
                         tb.add(uClass);
                      }
                   }
                }else {
                   break ;
                }
             }
             Iterator iterator1 = tb.iterator();
             while (iterator1.hasNext()) {
                this.b(iterator1.next(), hashSet);
             }
          }catch(java.lang.ClassNotFoundException e7){
             throw new cd2(1, e7);
          }
       }
       return;
    }
    public final Object b(Class p0,HashSet p1){
       Object obj;
       if (is7.t()) {
          Trace.beginSection(p0.getSimpleName());
       }
       int i = 0;
       if (!p1.contains(p0)) {
          fj ta = this.a;
          if (!ta.containsKey(p0)) {
             p1.add(p0);
             Class[] uClassArray = new Class[i];
             Object[] objArray = new Object[i];
             m93 om93 = p0.getDeclaredConstructor(uClassArray).newInstance(objArray);
             List list = om93.a();
             if (!list.isEmpty()) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   Class uClass = iterator.next();
                   if (!ta.containsKey(uClass)) {
                      this.b(uClass, p1);
                   }
                }
             }
             obj = om93.b(this.c);
             p1.remove(p0);
             ta.put(p0, obj);
          }else {
             obj = ta.get(p0);
          }
          Trace.endSection();
          return obj;
       }else {
          Object[] objArray1 = new Object[]{p0.getName()};
          throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", objArray1));
       }
    }
}
