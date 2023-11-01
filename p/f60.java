package p.f60;
import android.content.ServiceConnection;
import p.h60;
import java.lang.reflect.Method;
import android.net.Uri;
import p.ji5;
import p.w40;
import java.lang.Object;
import java.lang.Class;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.lang.System;
import android.content.ComponentName;
import android.os.IBinder;
import java.lang.reflect.Constructor;
import java.lang.reflect.AccessibleObject;
import p.p43;

public final class f60 implements ServiceConnection	// class@001566 from classes.dex
{
    public final h60 a;
    public final Method b;
    public final Method c;
    public final Uri d;
    public final Method e;
    public final ji5 f;
    public final w40 g;
    public final h60 h;

    public void f60(h60 p0,Method p1,Method p2,Uri p3,Method p4,ji5 p5,w40 p6){
       this.h = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.a = p0;
       super();
    }
    public final void a(Object p0){
       f60 td = this.d;
       f60 th = this.h;
       p0 = th.e.cast(p0);
       th.a = p0;
       if (p0 != null) {
          object oobject = null;
          try{
             Object[] objArray = new Object[]{Integer.valueOf(0)};
             this.b.invoke(p0, objArray);
             objArray = new Object[]{oobject};
             if ((p0 = this.c.invoke(th.a, objArray)) != null) {
                Objects.toString(td);
                objArray = new Object[]{td,oobject,oobject};
                this.e.invoke(p0, objArray);
                this.f.t("bnc_branch_strong_match_time", System.currentTimeMillis());
                th.d = true;
             }
          }catch(java.lang.Exception e0){
             th.a = oobject;
             th.b(this.g, th.d);
          }
       }
       return;
    }
    public final void b(ComponentName p0,IBinder p1){
       Object[] objArray1;
       Object obj = null;
       try{
          f60 ta = this.a;
          Class[] uClassArray = new Class[]{ta.h,ComponentName.class};
          Constructor declaredCons = ta.e.getDeclaredConstructor(uClassArray);
          declaredCons.setAccessible(1);
          Class[] uClassArray1 = new Class[]{IBinder.class};
          Object[] objArray = new Object[]{p43.class.getMethod("asInterface", uClassArray1).invoke(obj, objArray1),p0};
          objArray1 = new Object[]{p1};
          this.a(declaredCons.newInstance(objArray));
       }catch(java.lang.Exception e0){
          this.a(e0);
       }
       return;
    }
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       this.b(p0, p1);
    }
    public final void onServiceDisconnected(ComponentName p0){
       f60 th = this.h;
       th.a = null;
       th.b(this.g, th.d);
    }
}
