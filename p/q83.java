package p.q83;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.String;
import org.json.JSONObject;
import p.co5;
import java.lang.Throwable;
import android.util.Log;
import p.u83;
import java.util.LinkedHashMap;
import java.lang.System;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import java.util.List;
import p.av6;
import java.lang.Long;
import java.util.Map;
import android.os.Bundle;
import java.lang.Integer;
import android.os.BaseBundle;
import android.content.SharedPreferences$Editor;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import p.ow;

public final class q83	// class@00234f from classes.dex
{
    public static final AtomicBoolean a;
    public static Boolean b;
    public static Boolean c;
    public static o83 d;
    public static p83 e;
    public static Intent f;
    public static Object g;

    static {
       q83.a = new AtomicBoolean(false);
    }
    public void q83(){
       super();
    }
    public static final void a(Context p0,ArrayList p1,boolean p2){
       String str;
       String str2;
       SharedPreferences d;
       int i;
       int i1;
       String str4;
       List list;
       ArrayList obj;
       int i3;
       Map$Entry obj1;
       boolean b = p2;
       if (p1.isEmpty()) {
       }else {
          HashMap hashMap = new HashMap();
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p1.iterator();
          while (true) {
             str = "sku";
             if (iterator.hasNext()) {
                String str1 = iterator.next();
                try{
                   str2 = new JSONObject(str1).getString("productId");
                   co5.l(str2, str);
                   co5.l(str1, "purchase");
                   hashMap.put(str2, str1);
                   uArrayList.add(str2);
                }catch(org.json.JSONException e0){
                   Log.e("p.q83", "Error parsing in-app purchase data.", e0);
                }
             }else {
                break ;
             }
          }
          Iterator g = q83.g;
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          long l = System.currentTimeMillis() / 1000;
          Iterator iterator1 = uArrayList.iterator();
          while (true) {
             d = u83.d;
             i = 2;
             i1 = 0;
             if (iterator1.hasNext()) {
                String str3 = iterator1.next();
                if ((str4 = d.getString(str3, null)) != null) {
                   String[] stringArray = new String[]{";"};
                   list = av6.B0(str4, stringArray, i, i);
                   long l1 = l - Long.parseLong(list.get(i1));
                   if ((l1 - 0xa8c0) < 0) {
                      co5.l(str3, str);
                      linkedHashMa.put(str3, list.get(1));
                   }
                }
                list = 1000;
             }else {
                break ;
             }
          }
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator2 = uArrayList.iterator();
          while (iterator2.hasNext()) {
             str2 = iterator2.next();
             if (!linkedHashMa.containsKey(str2)) {
                uArrayList1.add(str2);
             }
          }
          LinkedHashMap linkedHashMa1 = new LinkedHashMap();
          if (g != null && !uArrayList1.isEmpty()) {
             Bundle uBundle = new Bundle();
             uBundle.putStringArrayList("ITEM_ID_LIST", uArrayList1);
             Object[] objArray = new Object[4];
             int i2 = 3;
             objArray[0] = Integer.valueOf(i2);
             objArray[1] = u83.c;
             String str5 = (b)? "subs": "inapp";
             objArray[i] = str5;
             objArray[i2] = uBundle;
             if ((obj = u83.e(p0, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", g, objArray)) != null && !obj.getInt("RESPONSE_CODE")) {
                if ((obj = obj.getStringArrayList("DETAILS_LIST")) != null && (uArrayList1.size() == obj.size() && (i3 = uArrayList1.size() - 1) >= 0)) {
                   while (true) {
                      int i4 = i1 + 1;
                      obj1 = uArrayList1.get(i1);
                      co5.l(obj1, "skuList[i]");
                      Object obj2 = obj.get(i1);
                      co5.l(obj2, "skuDetailsList[i]");
                      linkedHashMa1.put(obj1, obj2);
                      if (i4 <= i3) {
                         i1 = i4;
                      }
                   }
                }
                long l2 = System.currentTimeMillis() / 1000;
                SharedPreferences$Editor uEditor = d.edit();
                Iterator iterator3 = linkedHashMa1.entrySet().iterator();
                while (iterator3.hasNext()) {
                   obj1 = iterator3.next();
                   str5 = obj1.getKey();
                   uEditor.putString(str5, "".append(l2).append(';').append(obj1.getValue()).toString());
                }
                uEditor.apply();
             }
          }
          linkedHashMa.putAll(linkedHashMa1);
          g = linkedHashMa.entrySet().iterator();
          while (g.hasNext()) {
             Map$Entry uEntry = g.next();
             String key = uEntry.getKey();
             String value = uEntry.getValue();
             if ((key = hashMap.get(key)) == null) {
                continue ;
             }
             ow.a(key, value, b);
          }
       }
       return;
    }
}
