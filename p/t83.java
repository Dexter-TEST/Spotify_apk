package p.t83;
import p.b3;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ConcurrentHashMap;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.reflect.Method;
import p.x83;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.ArrayList;
import java.lang.Runnable;
import java.lang.ClassLoader;
import p.s83;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.String;
import p.co5;
import p.tu6;

public final class t83	// class@00271d from classes.dex
{
    public final Context a;
    public final Object b;
    public final Class c;
    public final Class d;
    public final Class e;
    public final Class f;
    public final Class g;
    public final Class h;
    public final Class i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;
    public final Method n;
    public final Method o;
    public final Method p;
    public final x83 q;
    public final CopyOnWriteArraySet r;
    public static final b3 s;
    public static final AtomicBoolean t;
    public static t83 u;
    public static final AtomicBoolean v;
    public static final ConcurrentHashMap w;
    public static final ConcurrentHashMap x;

    static {
       t83.s = new b3(22, 0);
       t83.t = new AtomicBoolean(0);
       t83.v = new AtomicBoolean(0);
       t83.w = new ConcurrentHashMap();
       t83.x = new ConcurrentHashMap();
    }
    public void t83(Context p0,Object p1,Class p2,Class p3,Class p4,Class p5,Class p6,Class p7,Class p8,Method p9,Method p10,Method p11,Method p12,Method p13,Method p14,Method p15,x83 p16){
       int i = this;
       super();
       i.a = p0;
       i.b = p1;
       i.c = p2;
       i.d = p3;
       i.e = p4;
       i.f = p5;
       i.g = p6;
       i.h = p7;
       i.i = p8;
       i.j = p9;
       i.k = p10;
       i.l = p11;
       i.m = p12;
       i.n = p13;
       i.o = p14;
       i.p = p15;
       i.q = p16;
       i.r = new CopyOnWriteArraySet();
    }
    public final void a(ArrayList p0,Runnable p1){
       Object obj1;
       t83 th = this.h;
       ClassLoader classLoader = th.getClassLoader();
       Class[] uClassArray = new Class[]{th};
       p1 = Proxy.newProxyInstance(classLoader, uClassArray, new s83(this, p1, 1));
       co5.l(p1, "newProxyInstance\(\n            skuDetailsResponseListenerClazz.classLoader,\n            arrayOf\(skuDetailsResponseListenerClazz\),\n            SkuDetailsResponseListenerWrapper\(runnable\)\)");
       Object[] objArray = new Object[0];
       t83 tq = this.q;
       Object obj = null;
       if ((obj1 = tu6.y(tq.a, obj, tq.c, objArray)) == null) {
       }else {
          Object[] objArray2 = new Object[]{"inapp"};
          x83 b = tq.b;
          if ((obj1 = tu6.y(b, obj1, tq.d, objArray2)) != null) {
             objArray2 = new Object[]{p0};
             if ((p0 = tu6.y(b, obj1, tq.e, objArray2)) != null) {
                Object[] objArray3 = new Object[0];
                obj = tu6.y(b, p0, tq.f, objArray3);
             }
          }
       }
       Object[] objArray1 = new Object[]{obj,p1};
       tu6.y(this.c, this.b, this.o, objArray1);
       return;
    }
}
