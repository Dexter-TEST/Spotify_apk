package p.n6;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import p.w51;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.gk4;
import android.os.Build$VERSION;
import android.app.NotificationManager;
import p.k11;
import android.app.AppOpsManager;
import android.content.pm.ApplicationInfo;
import java.lang.Class;
import java.lang.Integer;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import android.os.Process;
import java.lang.NullPointerException;
import p.ps0;
import android.content.res.Resources;
import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import p.sw5;
import p.xw5;
import java.util.WeakHashMap;
import android.util.SparseArray;
import p.rw5;
import android.content.res.Configuration;
import java.lang.ThreadLocal;
import android.util.TypedValue;
import android.content.res.XmlResourceParser;
import p.jj0;
import p.qw5;
import android.app.Activity;
import android.net.Uri;
import p.i6;
import android.content.Intent;
import android.os.Parcelable;
import p.ss0;
import java.util.HashMap;
import android.view.View;
import p.k6;
import java.lang.IllegalArgumentException;
import android.content.ComponentName;
import p.rs0;

public abstract class n6	// class@001f7b from classes.dex
{
    public static final Object a;

    static {
       n6.a = new Object();
    }
    public static int a(Context p0,String p1){
       int i;
       boolean b;
       if (p1 == null) {
          throw new NullPointerException("permission must be non-null");
       }
       if (w51.D() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", p1)) {
          return p0.checkPermission(p1, Process.myPid(), Process.myUid());
       }
       try{
          gk4 ogk4 = new gk4(p0);
          i = 0;
          if (Build$VERSION.SDK_INT >= 24) {
             b = k11.z(ogk4.b);
          }else {
             AppOpsManager systemServic = p0.getSystemService("appops");
             String packageName = p0.getApplicationContext().getPackageName();
             ApplicationInfo uid = p0.getApplicationInfo().uid;
             int i1 = 1;
             Class uClass = Class.forName(AppOpsManager.class.getName());
             Class[] uClassArray = new Class[3];
             Class tYPE = Integer.TYPE;
             uClassArray[0] = tYPE;
             uClassArray[i1] = tYPE;
             uClassArray[2] = String.class;
             Method method = uClass.getMethod("checkOpNoThrow", uClassArray);
             Object[] objArray = new Object[3];
             objArray[0] = Integer.valueOf(uClass.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class).intValue());
             objArray[i1] = Integer.valueOf(uid);
             objArray[2] = packageName;
             if (method.invoke(systemServic, objArray).intValue()) {
                b = false;
             }
             b = true;
          }
       }catch(java.lang.ClassNotFoundException e0){
       }catch(java.lang.NoSuchMethodException e0){
       }catch(java.lang.NoSuchFieldException e0){
       }catch(java.lang.reflect.InvocationTargetException e0){
       }catch(java.lang.IllegalAccessException e0){
       }catch(java.lang.RuntimeException e0){
       }
       if (!b) {
          i = -1;
       }
       return i;
    }
    public static int b(Context p0,int p1){
       if (Build$VERSION.SDK_INT >= 23) {
          return ps0.a(p0, p1);
       }
       return p0.getResources().getColor(p1);
    }
    public static ColorStateList c(Context p0,int p1){
       rw5 orw5;
       rw5 a;
       TypedValue typedValue;
       Resources resources = p0.getResources();
       Resources$Theme theme = p0.getTheme();
       sw5 osw5 = new sw5(resources, theme);
       ThreadLocal c = xw5.c;
       _monitor_enter(c);
       SparseArray sparseArray = xw5.b.get(osw5);
       ColorStateList uColorStateL = null;
       if (sparseArray != null && (sparseArray.size() > 0 && (orw5 = sparseArray.get(p1)) != null)) {
          if (orw5.b.equals(resources.getConfiguration()) && (theme == null && (orw5.c == null || (theme != null && orw5.c == theme.hashCode())))) {
             a = orw5.a;
             _monitor_exit(c);
          label_004e :
             if (a == null) {
                c = xw5.a;
                if ((typedValue = c.get()) == null) {
                   typedValue = new TypedValue();
                   c.set(typedValue);
                }
                boolean b = true;
                resources.getValue(p1, typedValue, b);
                if ((typedValue = typedValue.type) < 28 || typedValue > 31) {
                   b = false;
                }
                if (!b) {
                   XmlResourceParser xml = resources.getXml(p1);
                   try{
                      uColorStateL = jj0.a(resources, xml, theme);
                   }catch(java.lang.Exception e0){
                   }
                }
                if (uColorStateL != null) {
                   xw5.a(osw5, p1, uColorStateL, theme);
                   a = uColorStateL;
                }else if(Build$VERSION.SDK_INT >= 23){
                   a = qw5.b(resources, p1, theme);
                }else {
                   a = resources.getColorStateList(p1);
                }
             }
             return a;
          }else {
             sparseArray.remove(p1);
          }
       }
       _monitor_exit(c);
       a = uColorStateL;
       goto label_004e ;
    }
    public static Uri d(Activity p0){
       Uri parcelableEx;
       String stringExtra;
       if (Build$VERSION.SDK_INT >= 22) {
          return i6.a(p0);
       }
       Intent intent = p0.getIntent();
       if ((parcelableEx = intent.getParcelableExtra("android.intent.extra.REFERRER")) != null) {
          return parcelableEx;
       }
       if ((stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME")) != null) {
          return Uri.parse(stringExtra);
       }
       return null;
    }
    public static Object e(Context p0,Class p1){
       int sDK_INT;
       if ((sDK_INT = Build$VERSION.SDK_INT) >= 23) {
          return ps0.b(p0, p1);
       }
       String str = (sDK_INT >= 23)? ps0.c(p0, p1): ss0.a.get(p1);
       p0 = (str != null)? p0.getSystemService(str): null;
       return p0;
    }
    public static View f(Activity p0,int p1){
       View view;
       if (Build$VERSION.SDK_INT >= 28) {
          return k6.a(p0, p1);
       }
       if ((view = p0.findViewById(p1)) != null) {
          return view;
       }
       throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }
    public static void g(Context p0,Intent p1){
       if (Build$VERSION.SDK_INT >= 26) {
          rs0.b(p0, p1);
       }else {
          p0.startService(p1);
       }
       return;
    }
}
