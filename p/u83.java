package p.u83;
import java.util.HashMap;
import android.content.Context;
import p.sz1;
import java.lang.String;
import android.content.SharedPreferences;
import java.util.ArrayList;
import android.content.SharedPreferences$Editor;
import java.lang.System;
import java.util.Iterator;
import java.lang.Object;
import org.json.JSONObject;
import p.co5;
import java.lang.Class;
import java.lang.ClassLoader;
import java.lang.reflect.Method;
import android.os.Bundle;
import java.lang.Integer;
import android.os.IBinder;
import p.tu6;
import java.util.Arrays;
import android.os.BaseBundle;
import java.util.Collection;

public abstract class u83	// class@002860 from classes.dex
{
    public static final HashMap a;
    public static final HashMap b;
    public static final String c;
    public static final SharedPreferences d;
    public static final SharedPreferences e;

    static {
       u83.a = new HashMap();
       u83.b = new HashMap();
       u83.c = sz1.a().getPackageName();
       u83.d = sz1.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
       u83.e = sz1.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
    }
    public static ArrayList a(ArrayList p0){
       ArrayList uArrayList = new ArrayList();
       SharedPreferences e = u83.e;
       SharedPreferences$Editor uEditor = e.edit();
       long l = System.currentTimeMillis() / 1000;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          try{
             JSONObject jSONObject = new JSONObject(str);
             String str1 = jSONObject.getString("productId");
             long longx = jSONObject.getLong("purchaseTime");
             String str2 = jSONObject.getString("purchaseToken");
             longx = longx / 1000;
             longx = l - longx;
             if ((longx - 0x15180) > 0 || co5.c(e.getString(str1, ""), str2)) {
                continue ;
             }else {
                uEditor.putString(str1, str2);
                uArrayList.add(str);
             }
          }catch(org.json.JSONException e0){
          }
       }
       uEditor.apply();
       return uArrayList;
    }
    public static Class b(Context p0,String p1){
       Class uClass;
       Class uClass1;
       HashMap b = u83.b;
       if ((uClass = b.get(p1)) != null) {
          return uClass;
       }
       try{
          uClass1 = p0.getClassLoader().loadClass(p1);
       }catch(java.lang.ClassNotFoundException e0){
          uClass1 = null;
       }
       if (uClass1 != null) {
          e0.put(p1, uClass1);
       }
       return uClass1;
    }
    public static Method c(Class p0,String p1){
       Method method;
       Class[] uClassArray;
       Method method1;
       Class tYPE;
       Class tYPE1;
       HashMap a = u83.a;
       if ((method = a.get(p1)) != null) {
          return method;
       }
       Bundle uBundle = Bundle.class;
       int i = 4;
       switch (p1.hashCode()){
           case 0x94a50cdc:
             if (!p1.equals("getPurchases")) {
             label_0096 :
                uClassArray = null;
             }else {
                uClassArray = new Class[i];
                tYPE = Integer.TYPE;
                co5.l(tYPE, "TYPE");
                uClassArray[0] = tYPE;
                uClassArray[1] = String.class;
                uClassArray[2] = String.class;
                uClassArray[3] = String.class;
             }
             break;
           case 0xa98829bd:
             if (!p1.equals("isBillingSupported")) {
                goto label_0096 ;
             }else {
                uClassArray = new Class[]{tYPE,String.class,String.class};
                tYPE = Integer.TYPE;
                co5.l(tYPE, "TYPE");
             }
             break;
           case 0xbd0d1927:
             if (!p1.equals("asInterface")) {
                goto label_0096 ;
             }else {
                uClassArray = new Class[]{IBinder.class};
             }
             break;
           case 0xdc92d61d:
             if (!p1.equals("getPurchaseHistory")) {
                goto label_0096 ;
             }else {
                uClassArray = new Class[]{tYPE1,String.class,String.class,String.class,uBundle};
                tYPE1 = Integer.TYPE;
                co5.l(tYPE1, "TYPE");
             }
             break;
           case 0xddd3fa5b:
             if (!p1.equals("getSkuDetails")) {
                goto label_0096 ;
             }else {
                uClassArray = new Class[i];
                Class tYPE2 = Integer.TYPE;
                co5.l(tYPE2, "TYPE");
                uClassArray[0] = tYPE2;
                uClassArray[1] = String.class;
                uClassArray[2] = String.class;
                uClassArray[3] = uBundle;
             }
             break;
           default:
             goto label_0096 ;
       }
       if (uClassArray == null) {
          uClassArray = new Class[]{null};
          method1 = tu6.t(p0, p1, uClassArray);
       }else {
          method1 = tu6.t(p0, p1, Arrays.copyOf(uClassArray, uClassArray.length));
       }
       if (method1 != null) {
          a.put(p1, method1);
       }
       return method1;
    }
    public static ArrayList d(Context p0,Object p1,String p2){
       String obj;
       ArrayList stringArrayL;
       ArrayList uArrayList = new ArrayList();
       if (p1 == null) {
          return uArrayList;
       }
       if (u83.f(p0, p1, p2)) {
          object oobject = null;
          int i = 0;
          do {
             Object[] objArray = new Object[]{Integer.valueOf(3),u83.c,p2,oobject};
             if ((obj = u83.e(p0, "com.android.vending.billing.IInAppBillingService", "getPurchases", p1, objArray)) != null && !obj.getInt("RESPONSE_CODE")) {
                if ((stringArrayL = obj.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                   i = i + stringArrayL.size();
                   uArrayList.addAll(stringArrayL);
                   obj = obj.getString("INAPP_CONTINUATION_TOKEN");
                }
             }else {
                obj = null;
             }
          } while (i < 30 && obj != null);
       }
       return uArrayList;
    }
    public static Object e(Context p0,String p1,String p2,Object p3,Object[] p4){
       Method method;
       Class uClass = u83.b(p0, p1);
       p1 = null;
       if (uClass == null) {
          return p1;
       }
       if ((method = u83.c(uClass, p2)) == null) {
          return p1;
       }
       return tu6.y(uClass, p3, method, Arrays.copyOf(p4, p4.length));
    }
    public static boolean f(Context p0,Object p1,String p2){
       boolean b = false;
       if (p1 == null) {
          return b;
       }
       Object[] objArray = new Object[]{Integer.valueOf(3),u83.c,p2};
       if ((p0 = u83.e(p0, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", p1, objArray)) != null && !p0.intValue()) {
          b = true;
       }
       return b;
    }
}
