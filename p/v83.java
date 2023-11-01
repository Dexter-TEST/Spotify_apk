package p.v83;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ConcurrentHashMap;
import android.content.Context;
import p.sz1;
import java.lang.String;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import java.lang.Object;
import p.co5;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.lang.CharSequence;
import java.util.List;
import p.av6;
import java.lang.Long;
import java.lang.System;
import java.util.Map;
import p.q14;
import java.util.Map$Entry;
import java.lang.Number;
import java.lang.StringBuilder;

public abstract class v83	// class@0029a0 from classes.dex
{
    public static SharedPreferences a;
    public static final CopyOnWriteArraySet b;
    public static final ConcurrentHashMap c;

    static {
       v83.b = new CopyOnWriteArraySet();
       v83.c = new ConcurrentHashMap();
    }
    public static void a(){
       Set stringSet;
       ConcurrentHashMap c;
       int i = 0;
       SharedPreferences sharedPrefer = sz1.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", i);
       SharedPreferences sharedPrefer1 = sz1.a().getSharedPreferences("com.facebook.internal.PURCHASE", i);
       if (sharedPrefer.contains("LAST_CLEARED_TIME")) {
          sharedPrefer.edit().clear().apply();
          sharedPrefer1.edit().clear().apply();
       }
       sharedPrefer = sz1.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", i);
       co5.l(sharedPrefer, "getApplicationContext\(\).getSharedPreferences\(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE\)");
       v83.a = sharedPrefer;
       CopyOnWriteArraySet b = v83.b;
       if ((stringSet = sharedPrefer.getStringSet("PURCHASE_DETAILS_SET", new HashSet())) == null) {
          stringSet = new HashSet();
       }
       b.addAll(stringSet);
       Iterator iterator = b.iterator();
       while (true) {
          c = v83.c;
          if (iterator.hasNext()) {
             String[] stringArray = new String[]{";"};
             List list = av6.B0(iterator.next(), stringArray, 2, 2);
             Object obj = list.get(i);
             c.put(obj, Long.valueOf(Long.parseLong(list.get(1))));
          }else {
             break ;
          }
       }
       long l = System.currentTimeMillis() / 1000;
       if ((sharedPrefer = v83.a) != null) {
          long l1 = 0;
          long longx = sharedPrefer.getLong("LAST_CLEARED_TIME", l1);
          if (!(longx - l1)) {
             if ((sharedPrefer = v83.a) != null) {
                sharedPrefer.edit().putLong("LAST_CLEARED_TIME", l).apply();
             }else {
                co5.N("sharedPreferences");
                throw null;
             }
          }else if(((l - longx) - 0x93a80) > 0){
             iterator = q14.r0(c).entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                String key = uEntry.getKey();
                longx = uEntry.getValue().longValue();
                long l2 = l - longx;
                if ((l2 - 0x15180) > 0) {
                   b.remove("".append(key).append(';').append(longx).toString());
                   c.remove(key);
                }
             }
             if ((sharedPrefer = v83.a) != null) {
                sharedPrefer.edit().putStringSet("PURCHASE_DETAILS_SET", b).putLong("LAST_CLEARED_TIME", l).apply();
             }else {
                co5.N("sharedPreferences");
                throw null;
             }
          }
          return;
       }else {
          co5.N("sharedPreferences");
          throw null;
       }
    }
}
