package p.fl2;
import android.content.Context;
import p.ko1;
import p.re;
import p.dt3;
import p.xq7;
import p.el2;
import java.lang.Object;
import java.lang.String;
import p.we;
import p.pt7;
import p.ol2;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.Message;
import android.os.Handler;
import java.lang.NullPointerException;
import com.spotify.litesignup.phonesignup.PhoneNumberSignupActivity;
import p.o01;
import android.os.Looper;
import p.w51;
import com.google.android.gms.common.api.GoogleApiActivity;
import p.px7;
import java.util.WeakHashMap;
import java.lang.ref.WeakReference;
import java.lang.ref.Reference;
import p.ae2;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import java.lang.Class;
import androidx.fragment.app.a;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import p.ak3;
import p.su7;
import p.sk;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import android.os.Build$VERSION;
import p.do5;
import java.lang.Boolean;
import android.os.Build;
import java.lang.Integer;
import java.lang.reflect.Method;
import p.ob2;
import java.util.Set;
import java.util.Collections;
import java.util.Collection;
import p.l07;
import p.a28;
import p.m07;
import p.az5;
import p.rt7;
import java.lang.System;
import p.mt7;
import p.nu7;
import p.sx7;
import p.r15;
import p.p18;
import p.l18;
import p.eu7;
import p.st7;
import p.lt7;
import p.jv7;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.lang.ThreadLocal;
import p.cu7;

public abstract class fl2	// class@0015eb from classes.dex
{
    public final Context a;
    public final String b;
    public final ko1 c;
    public final re d;
    public final we e;
    public final Looper f;
    public final int g;
    public final pt7 h;
    public final dt3 i;
    public final ol2 j;

    public void fl2(Context p0,ko1 p1,re p2,dt3 p3){
       xq7 oxq7 = new xq7(4);
       oxq7.b = p3;
       super(p0, p1, p2, oxq7.e());
    }
    public void fl2(Context p0,ko1 p1,re p2,el2 p3){
       super();
       if (p0 == null) {
          throw new NullPointerException("Null context is not permitted.");
       }
       if (p1 == null) {
          throw new NullPointerException("Api must not be null.");
       }
       if (p3 == null) {
          throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
       }
       Context applicationC = p0.getApplicationContext();
       this.a = applicationC;
       String str = fl2.b(p0);
       this.b = str;
       this.c = p1;
       this.d = p2;
       this.f = p3.b;
       this.e = new we(p1, p2, str);
       this.h = new pt7(this);
       ol2 ool2 = ol2.a(applicationC);
       this.j = ool2;
       this.g = ool2.h.getAndIncrement();
       this.i = p3.a;
       ool2 = ool2.n;
       ool2.sendMessage(ool2.obtainMessage(7, this));
       return;
    }
    public void fl2(PhoneNumberSignupActivity p0,ko1 p1,o01 p2,dt3 p3){
       WeakReference weakReferenc;
       px7 opx7;
       su7 osu7;
       xq7 oxq7 = new xq7(4);
       oxq7.b = p3;
       Looper mainLooper = p0.getMainLooper();
       w51.l(mainLooper, "Looper must not be null.");
       oxq7.c = mainLooper;
       el2 uoel2 = oxq7.e();
       super();
       if (p1 == null) {
          throw new NullPointerException("Api must not be null.");
       }
       Context applicationC = p0.getApplicationContext();
       this.a = applicationC;
       String str = fl2.b(p0);
       this.b = str;
       this.c = p1;
       this.d = p2;
       this.f = uoel2.b;
       we owe = new we(p1, p2, str);
       this.e = owe;
       this.h = new pt7(this);
       ol2 ool2 = ol2.a(applicationC);
       this.j = ool2;
       this.g = ool2.h.getAndIncrement();
       this.i = uoel2.a;
       if (!p0 instanceof GoogleApiActivity && Looper.myLooper() == Looper.getMainLooper()) {
          String str1 = "SupportLifecycleFragmentImpl";
          WeakHashMap t = px7.t;
          if ((weakReferenc = t.get(p0)) == null || (opx7 = weakReferenc.get()) == null) {
             try{
                if ((opx7 = p0.y().D(str1)) == null || opx7.isRemoving()) {
                   opx7 = new px7();
                   ae2 uoae2 = p0.y();
                   uoae2.getClass();
                   a uoa = new a(uoae2);
                   uoa.g(0, opx7, str1, 1);
                   uoa.e(1);
                }
                t.put(p0, new WeakReference(opx7));
             }catch(java.lang.ClassCastException e6){
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e6);
             }
          }
          if ((osu7 = opx7.l()) == null) {
             osu7 = new su7(opx7, ool2);
          }
          osu7.w.add(owe);
          ool2.b(osu7);
       }
       ol2 n = ool2.n;
       n.sendMessage(n.obtainMessage(7, this));
       return;
    }
    public static String b(Object p0){
       Boolean a;
       int sDK_INT = Build$VERSION.SDK_INT;
       boolean b = true;
       int i = (sDK_INT >= 29)? 1: 0;
       if (!i) {
       label_000d :
          b = 0;
       }else if(sDK_INT >= 30 && Build$VERSION.CODENAME.equals("REL")){
          String cODENAME = Build$VERSION.CODENAME;
          cODENAME = (cODENAME.length() == b && (cODENAME.charAt(0) >= 'R' && cODENAME.charAt(0) <= 'Z'))? 1: 0;
          if (!cODENAME) {
             goto label_000d ;
          }else if((a = do5.a) != null){
             b = a.booleanValue();
          }else if("google".equals(Build.BRAND) && (!Build.ID.startsWith("RPP1") && (!Build.ID.startsWith("RPP2") && Integer.parseInt(Build$VERSION.INCREMENTAL) >= 0x602711))){
             b = false;
          }
          do5.a = Boolean.valueOf(b);
       }
       if (b) {
          try{
             Class[] uClassArray = new Class[0];
             Object[] objArray = new Object[0];
             return Context.class.getMethod("getAttributionTag", uClassArray).invoke(p0, objArray);
          }catch(java.lang.NoSuchMethodException e0){
             return null;
          }catch(java.lang.IllegalAccessException e0){
          }catch(java.lang.reflect.InvocationTargetException e0){
          }
       }else {
       }
    }
    public final ob2 a(){
       ob2 oob2 = new ob2();
       oob2.v = null;
       Set set = Collections.emptySet();
       if (oob2.w == null) {
          oob2.w = new sk(0);
       }
       oob2.w.addAll(set);
       fl2 ta = this.a;
       oob2.t = ta.getClass().getName();
       oob2.c = ta.getPackageName();
       return oob2;
    }
    public final a28 c(int p0,l07 p1){
       r15 or15;
       m07 om07 = new m07();
       fl2 tj = this.j;
       tj.getClass();
       l07 c = p1.c;
       ol2 n = tj.n;
       m07 a = om07.a;
       if (c != null) {
          fl2 te = this.e;
          if (!tj.g()) {
             or15 = null;
          }else {
             az5.H().getClass();
             or15 = new rt7(tj, c, te, System.currentTimeMillis());
          }
          if (or15 != null) {
             n.getClass();
             a.getClass();
             a.b.c(new sx7(new mt7(n), or15));
             a.m();
          }
       }
       n.sendMessage(n.obtainMessage(4, new st7(new eu7(p0, p1, om07, this.i), tj.i.get(), this)));
       return a;
    }
    public final void d(int p0,jv7 p1){
       boolean b = (p1.u == null && !BasePendingResult.v.get().booleanValue())? false: true;
       p1.u = b;
       fl2 tj = this.j;
       tj.getClass();
       ol2 n = tj.n;
       n.sendMessage(n.obtainMessage(4, new st7(new cu7(p0, p1), tj.i.get(), this)));
       return;
    }
}
