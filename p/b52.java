package p.b52;
import java.lang.Object;
import p.z42;
import p.pk;
import android.content.Context;
import p.i52;
import java.lang.String;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.CopyOnWriteArrayList;
import p.w51;
import p.g54;
import com.google.firebase.components.ComponentDiscoveryService;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import java.lang.Class;
import android.content.pm.ServiceInfo;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Set;
import android.os.BaseBundle;
import java.util.Iterator;
import p.ym0;
import java.lang.reflect.Constructor;
import p.yh3;
import p.en0;
import p.zl0;
import p.tu6;
import p.q81;
import p.kq0;
import p.k91;
import p.qt;
import p.i70;
import p.h71;
import p.fv1;
import p.vi3;
import p.x42;
import p.um5;
import p.wh6;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import p.ej4;
import p.y42;
import android.app.Application;
import java.util.concurrent.atomic.AtomicReference;
import p.vw;
import p.uw;
import java.nio.charset.Charset;
import android.util.Base64;
import android.os.Build$VERSION;
import p.ie7;
import p.a52;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map$Entry;
import p.bu1;
import java.util.Collection;
import p.tp2;
import p.j51;
import p.fh5;
import p.ye7;

public final class b52	// class@001057 from classes.dex
{
    public final Context a;
    public final String b;
    public final i52 c;
    public final en0 d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final vi3 g;
    public final CopyOnWriteArrayList h;
    public static final Object i;
    public static final pk j;

    static {
       b52.i = new Object();
       z42 oz42 = new z42();
       b52.j = new pk();
    }
    public void b52(Context p0,i52 p1,String p2){
       PackageManager packageManag;
       ServiceInfo serviceInfo;
       List list;
       int i;
       Object[] objArray;
       zl0 ozl0;
       ServiceInfo serviceInfo1;
       super();
       boolean b = false;
       this.e = new AtomicBoolean(b);
       this.f = new AtomicBoolean();
       this.h = new CopyOnWriteArrayList();
       CopyOnWriteArrayList uCopyOnWrite = new CopyOnWriteArrayList();
       this.a = p0;
       w51.i(p2);
       this.b = p2;
       this.c = p1;
       g54 og54 = new g54(ComponentDiscoveryService.class);
       try{
          uCopyOnWrite = 0;
          if ((packageManag = p0.getPackageManager()) != null) {
             if ((serviceInfo1 = packageManag.getServiceInfo(new ComponentName(p0, og54.a), 128)) == null) {
                Objects.toString(og54.a);
             }else {
                serviceInfo = serviceInfo1.metaData;
             label_0054 :
                String str = "com.google.firebase.components.ComponentRegistrar";
                if (serviceInfo == null) {
                   list = Collections.emptyList();
                }else {
                   ArrayList uArrayList1 = new ArrayList();
                   Iterator iterator1 = serviceInfo.keySet().iterator();
                   while (iterator1.hasNext()) {
                      String str2 = iterator1.next();
                      if (str.equals(serviceInfo.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                         uArrayList1.add(str2.substring(31));
                      }
                   }
                   list = uArrayList1;
                }
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = list.iterator();
                while (true) {
                   i = 2;
                   if (iterator.hasNext()) {
                      String str1 = iterator.next();
                      try{
                         Class uClass = Class.forName(str1);
                         if (!ym0.class.isAssignableFrom(uClass)) {
                            objArray = new Object[i];
                            objArray[b] = str1;
                            objArray[1] = str;
                            String.format("Class %s is not an instance of %s", objArray);
                         }else {
                            Class[] uClassArray = new Class[b];
                            Object[] objArray1 = new Object[b];
                            uArrayList.add(uClass.getDeclaredConstructor(uClassArray).newInstance(objArray1));
                         }
                      }catch(java.lang.ClassNotFoundException e0){
                         objArray = new Object[1];
                         objArray[b] = str1;
                         String.format("Class %s is not an found.", objArray);
                      }catch(java.lang.IllegalAccessException e0){
                         objArray = new Object[1];
                         objArray[b] = str1;
                         String.format("Could not instantiate %s.", objArray);
                      }catch(java.lang.InstantiationException e0){
                         objArray = new Object[1];
                         objArray[b] = str1;
                         String.format("Could not instantiate %s.", objArray);
                      }catch(java.lang.NoSuchMethodException e0){
                         objArray = new Object[1];
                         objArray[b] = str1;
                         String.format("Could not instantiate %s", objArray);
                      }catch(java.lang.reflect.InvocationTargetException e0){
                         objArray = new Object[1];
                         objArray[b] = str1;
                         String.format("Could not instantiate %s", objArray);
                      }
                   }else {
                      break ;
                   }
                }
                try{
                   yh3.b.getClass();
                   iterator = "1.8.22";
                }catch(java.lang.NoClassDefFoundError e0){
                   iterator = e0;
                }
                zl0[] ozl0Array = new zl0[8];
                Class[] uClassArray1 = new Class[b];
                ozl0Array[0] = zl0.b(p0, Context.class, uClassArray1);
                Class[] uClassArray2 = new Class[b];
                ozl0Array[1] = zl0.b(this, b52.class, uClassArray2);
                Class[] uClassArray3 = new Class[b];
                ozl0Array[2] = zl0.b(p1, i52.class, uClassArray3);
                ozl0Array[3] = tu6.l("fire-android", "");
                ozl0Array[4] = tu6.l("fire-core", "19.3.1");
                if (iterator != null) {
                   ozl0 = tu6.l("kotlin", iterator);
                }
                ozl0Array[5] = ozl0;
                kq0 okq0 = zl0.a(q81.class);
                okq0.a(new k91(i, qt.class));
                okq0.e = i70.x;
                ozl0Array[6] = okq0.c();
                okq0 = zl0.a(h71.class);
                okq0.a(new k91(1, Context.class));
                okq0.e = fv1.w;
                ozl0Array[7] = okq0.c();
                this.d = new en0(uArrayList, ozl0Array);
                this.g = new vi3(new x42(this, p0));
                return;
             }
          }
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
       }
       serviceInfo = e0;
       goto label_0054 ;
    }
    public static b52 b(){
       b52 orDefault;
       String str = "Default FirebaseApp is not initialized in this process ";
       Object i = b52.i;
       _monitor_enter(i);
       if ((orDefault = b52.j.getOrDefault("[DEFAULT]", null)) == null) {
          throw new IllegalStateException(str+ej4.I()+". Make sure to call FirebaseApp.initializeApp\(Context\) first.");
       }
       _monitor_exit(i);
       return orDefault;
    }
    public static b52 e(Context p0,i52 p1){
       AtomicReference i1;
       int i = 1;
       if (!p0.getApplicationContext() instanceof Application) {
       }else {
          Application applicationC = p0.getApplicationContext();
          i1 = y42.a;
          if (i1.get() == null) {
             y42 oy42 = new y42();
             while (true) {
                if (i1.compareAndSet(null, oy42)) {
                   i1 = 1;
                }else {
                   if (i1.get() != null) {
                      i1 = 0;
                   }
                }
                if (i1) {
                   vw.b(applicationC);
                   vw.v.a(oy42);
                }
             }
          }
       }
       if (p0.getApplicationContext() != null) {
          p0 = p0.getApplicationContext();
       }
       i1 = b52.i;
       _monitor_enter(i1);
       pk j = b52.j;
       w51.m("FirebaseApp name "+"[DEFAULT]"+" already exists!", (i ^ j.containsKey("[DEFAULT]")));
       w51.l(p0, "Application context cannot be null.");
       b52 uob52 = new b52(p0, p1, "[DEFAULT]");
       j.put("[DEFAULT]", uob52);
       _monitor_exit(i1);
       uob52.d();
       return uob52;
    }
    public final void a(){
       w51.m("FirebaseApp was deleted", (this.f.get() ^ 0x01));
    }
    public final String c(){
       StringBuilder str = "";
       this.a();
       byte[] bytes = this.b.getBytes(Charset.defaultCharset());
       String str1 = null;
       String str2 = (bytes == null)? str1: Base64.encodeToString(bytes, 11);
       str = str+str2+"+";
       this.a();
       if ((bytes = this.c.b.getBytes(Charset.defaultCharset())) != null) {
          str1 = Base64.encodeToString(bytes, 11);
       }
       return str+str1;
    }
    public final void d(){
       bu1 a;
       b52 ta = this.a;
       int i = 1;
       boolean b = (Build$VERSION.SDK_INT >= 24)? ie7.a(ta): 1;
       Object obj = null;
       if ((b ^ i)) {
          this.a();
          ta = this.a;
          AtomicReference b1 = a52.b;
          if (b1.get() == null) {
             a52 uoa52 = new a52(ta);
             while (true) {
                if (!b1.compareAndSet(obj, uoa52)) {
                   if (b1.get() != null) {
                      i = 0;
                   }
                }
                if (i) {
                   ta.registerReceiver(uoa52, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                   break ;
                }
             }
          }
       }else {
          this.a();
          ta = this.d;
          this.a();
          boolean b2 = "[DEFAULT]".equals(this.b);
          Iterator iterator = ta.H.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             zl0 key = uEntry.getKey();
             vi3 value = uEntry.getValue();
             int i1 = ((key = key.c) == i)? 1: 0;
             if (!i1) {
                key = (key == 2)? 1: 0;
                if (!key || !b2) {
                }
             }
             value.get();
          }
          en0 k = ta.K;
          _monitor_enter(k);
          if ((a = k.a) != null) {
             k.a = obj;
          }else {
             a = obj;
          }
          _monitor_exit(k);
          if (a != null) {
             Iterator iterator1 = a.iterator();
             if (iterator1.hasNext()) {
                tp2.v(iterator1.next());
                throw obj;
             }
          }
       }
       return;
    }
    public final boolean equals(Object p0){
       if (!p0 instanceof b52) {
          return false;
       }
       p0.a();
       return this.b.equals(p0.b);
    }
    public final boolean f(){
       this.a();
       j51 oj51 = this.g.get();
       _monitor_enter(oj51);
       _monitor_exit(oj51);
       return oj51.a;
    }
    public final int hashCode(){
       return this.b.hashCode();
    }
    public final String toString(){
       fh5 uofh5 = ye7.X(this);
       uofh5.b(this.b, "name");
       uofh5.b(this.c, "options");
       return uofh5.toString();
    }
}
