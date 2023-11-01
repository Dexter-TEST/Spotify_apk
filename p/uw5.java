package p.uw5;
import p.w54;
import p.ry1;
import p.c65;
import p.ps3;
import p.am6;
import p.bm6;
import p.yy6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Number;
import java.lang.IllegalArgumentException;
import p.tp2;
import java.lang.StringBuilder;
import p.en6;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;
import p.uf0;
import p.ye7;
import p.ah3;
import java.lang.reflect.AccessibleObject;
import p.qs5;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import java.lang.IllegalStateException;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import p.v83;
import p.t83;
import java.lang.System;
import java.util.Map;
import p.q14;
import java.util.Iterator;
import java.util.Map$Entry;
import org.json.JSONObject;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p.ow;
import p.r44;
import io.reactivex.rxjava3.core.Observable;
import p.y06;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.r45;
import p.c13;
import p.fo1;
import p.c0;
import android.widget.TextView;
import p.vv7;
import android.view.ViewGroup;
import android.os.Build$VERSION;
import p.jy6;
import p.fl6;
import android.os.Handler;
import android.os.Looper;
import p.tw5;
import java.lang.Runnable;
import android.graphics.Typeface;
import p.ij;

public abstract class uw5 implements w54	// class@002935 from classes.dex
{
    public static final ry1 a;
    public static final c65 b;
    public static final int[] c;
    public static final ps3 t;
    public static final int[] v;
    public static final am6 w;
    public static final bm6 x;
    public static boolean y;
    public static final yy6 z;

    static {
       uw5.a = new ry1(1);
       uw5.b = new c65(25);
       uw5.c = new int[3]{0x1010199,0x10101e1,0x101014f};
       uw5.t = new ps3(23);
       uw5.v = new int[9]{0x7f03029e,0x7f03029f,0x7f0302a0,0x7f0302a1,0x7f0302a2,0x7f0302a3,0x7f0302a4,0x7f0302a5,0x7f0302a6};
       uw5.w = new am6();
       uw5.x = new bm6();
       uw5.z = new yy6(1);
    }
    public void uw5(){
       super();
    }
    public void uw5(int p0){
       super();
    }
    public static String e(Object p0,String p1){
       co5.o(p1, "name");
       if (p0 instanceof String) {
          return p0;
       }
       if (p0 instanceof Number) {
          return p0.toString();
       }
       if (p0 == null) {
          throw new IllegalArgumentException(tp2.m("@Header argument ", p1, " is null"));
       }
       throw new IllegalArgumentException(en6.t("@Header argument ", p1, " has unsupported type: ")+p0.getClass().getName());
    }
    public static String f(Object p0,String p1){
       co5.o(p1, "name");
       co5.o(p0, "arg");
       if (p0 instanceof String) {
          return p0;
       }
       if (p0 instanceof Number) {
          return p0.toString();
       }
       if (p0 instanceof Boolean) {
          return p0.toString();
       }
       throw new IllegalArgumentException(en6.t("@Query argument ", p1, " has unsupported type: ")+p0.getClass().getName());
    }
    public static String g(Method p0){
       co5.o(p0, "method");
       return ye7.z(ye7.y(uw5.h(p0))).getSimpleName();
    }
    public static Annotation h(Method p0){
       object oobject;
       co5.o(p0, "method");
       Annotation[] annotations = p0.getAnnotations();
       co5.l(annotations, "annotations");
       int len = annotations.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             throw new IllegalArgumentException(p0.toString()+" does not declare one of "+qs5.a+", found "+Arrays.toString(annotations));
          }
          oobject = annotations[i];
          if (qs5.a.contains(ye7.z(ye7.y(oobject)))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static Annotation i(Annotation[] p0,Class p1){
       object oobject;
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = p0[i];
          if (p1.isAssignableFrom(ye7.z(ye7.y(oobject)))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static Type j(Type p0){
       if (!p0 instanceof ParameterizedType) {
          throw new IllegalStateException("Check failed.".toString());
       }
       Type[] actualTypeAr = p0.getActualTypeArguments();
       int i = 1;
       if (actualTypeAr.length != i) {
          i = 0;
       }
       if (i) {
          object oobject = actualTypeAr[0];
          co5.l(oobject, "actualTypeArguments[0]");
          return oobject;
       }else {
          throw new IllegalStateException("Check failed.".toString());
       }
    }
    public static int k(Context p0,int p1){
       int[] ointArray = new int[]{p1};
       TypedArray typedArray = p0.obtainStyledAttributes(ointArray);
       typedArray.recycle();
       return typedArray.getColor(0, 0);
    }
    public static ColorStateList l(Context p0,int p1){
       int[] ointArray = new int[]{p1};
       TypedArray typedArray = p0.obtainStyledAttributes(ointArray);
       typedArray.recycle();
       return typedArray.getColorStateList(0);
    }
    public static Drawable m(Context p0,int p1){
       int[] ointArray = new int[]{p1};
       TypedArray typedArray = p0.obtainStyledAttributes(ointArray);
       typedArray.recycle();
       return typedArray.getDrawable(0);
    }
    public static int n(Context p0,int p1){
       int[] ointArray = new int[]{p1};
       TypedArray typedArray = p0.obtainStyledAttributes(ointArray);
       typedArray.recycle();
       return typedArray.getDimensionPixelSize(0, 0);
    }
    public static void o(){
       JSONObject value;
       String str1;
       SharedPreferences a;
       ConcurrentHashMap w = t83.w;
       ConcurrentHashMap x = t83.x;
       co5.o(w, "purchaseDetailsMap");
       co5.o(x, "skuDetailsMap");
       v83.a();
       String str = "purchaseToken";
       long l = System.currentTimeMillis() / 1000;
       Iterator iterator = q14.r0(w).entrySet().iterator();
       while (true) {
          CopyOnWriteArraySet b = v83.b;
          if (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             value = uEntry.getValue();
             try{
                if (value.has(str)) {
                   str1 = value.getString(str);
                   if (v83.c.containsKey(str1)) {
                      w.remove(key);
                   }else {
                      b.add("".append(str1).append(';').append(l).toString());
                   }
                }
             }catch(java.lang.Exception e0){
             }
          }else if((a = v83.a) != null){
             a.edit().putStringSet("PURCHASE_DETAILS_SET", b).apply();
             l = System.currentTimeMillis() / 1000;
             LinkedHashMap linkedHashMa = new LinkedHashMap();
             Iterator iterator1 = new HashMap(w).entrySet().iterator();
             while (iterator1.hasNext()) {
                Map$Entry uEntry1 = iterator1.next();
                str1 = uEntry1.getKey();
                JSONObject value1 = uEntry1.getValue();
                value = x.get(str1);
                if (value1 != null) {
                   String str2 = "purchaseTime";
                   if (value1.has(str2)) {
                      try{
                         long l1 = value1.getLong(str2) / 1000;
                         l1 = l - l1;
                         if ((l1 - 0x15180) > 0 || value == null) {
                            continue ;
                         }else {
                            String str3 = value1.toString();
                            co5.l(str3, "purchaseDetail.toString\(\)");
                            str1 = value.toString();
                            co5.l(str1, "skuDetail.toString\(\)");
                            linkedHashMa.put(str3, str1);
                         }
                      }catch(java.lang.Exception e0){
                      }
                   }
                }
             }
             Iterator iterator2 = linkedHashMa.entrySet().iterator();
             while (iterator2.hasNext()) {
                Map$Entry uEntry2 = iterator2.next();
                str = uEntry2.getKey();
                String value2 = uEntry2.getValue();
                if (str != null && value2 != null) {
                   ow.a(str, value2, false);
                }
             }
             t83.w.clear();
             return;
          }else {
             co5.N("sharedPreferences");
             throw null;
          }
       }
    }
    public static Observable r(r44 p0){
       return Observable.create(new y06(p0, 0)).subscribeOn(id.a());
    }
    public static r45 s(String p0){
       r45 or45;
       fo1 a = c13.a;
       if (p0 != null) {
          or45 = a.b(p0);
       }else {
          a.getClass();
          or45 = c0.a;
       }
       return or45;
    }
    public static void t(Context p0,TextView p1,int p2){
       int[] ointArray = new int[]{p2};
       TypedArray typedArray = p0.obtainStyledAttributes(ointArray);
       typedArray.recycle();
       vv7.Q(p1, typedArray.getResourceId(0, 0));
    }
    public static void u(ViewGroup p0,boolean p1){
       if (Build$VERSION.SDK_INT >= 29) {
          jy6.p(p0, p1);
       }else if(uw5.y){
          try{
             jy6.p(p0, p1);
          }catch(java.lang.NoSuchMethodError e0){
             uw5.y = false;
          }
       }
       return;
    }
    public abstract boolean a(fl6 p0);
    public abstract boolean b();
    public void c(int p0){
       new Handler(Looper.getMainLooper()).post(new tw5(p0, 0, this));
    }
    public void d(Typeface p0){
       new Handler(Looper.getMainLooper()).post(new ij(this, 1, p0));
    }
    public abstract void p(int p0);
    public abstract void q(Typeface p0);
}
