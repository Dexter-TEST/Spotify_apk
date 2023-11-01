package p.ux0;
import java.lang.Thread$UncaughtExceptionHandler;
import p.mj7;
import java.lang.Object;
import java.lang.Thread;
import java.lang.Throwable;
import java.lang.String;
import p.co5;
import java.lang.StackTraceElement;
import p.av6;
import p.vv7;
import java.util.HashSet;
import p.v12;
import java.util.HashMap;
import p.t12;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import android.content.Context;
import p.sz1;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import p.me7;
import org.json.JSONArray;
import java.util.Collection;
import p.ya3;

public final class ux0 implements Thread$UncaughtExceptionHandler	// class@002939 from classes.dex
{
    public final Thread$UncaughtExceptionHandler a;
    public static final mj7 b;
    public static ux0 c;

    static {
       ux0.b = new mj7(19, 0);
    }
    public void ux0(Thread$UncaughtExceptionHandler p0){
       super();
       this.a = p0;
    }
    public final void uncaughtException(Thread p0,Throwable p1){
       HashSet hashSet;
       t12 key;
       ux0 a1;
       Object obj = p0;
       Object obj1 = p1;
       co5.o(obj, "t");
       co5.o(obj1, "e");
       int i = 0;
       Throwable throwable = obj1;
       while (true) {
          if (throwable != null && throwable != i) {
             StackTraceElement[] stackTrace = throwable.getStackTrace();
             co5.l(stackTrace, "t.stackTrace");
             int len = stackTrace.length;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   i1 = i1 + 1;
                   String className = stackTrace[i1].getClassName();
                   co5.l(className, "element.className");
                   if (av6.D0(className, "com.facebook", false)) {
                      throwable = 1;
                   label_0044 :
                      if (throwable) {
                         if (vv7.c) {
                            hashSet = new HashSet();
                            stackTrace = p1.getStackTrace();
                            co5.l(stackTrace, "e.stackTrace");
                            len = stackTrace.length;
                            i1 = 0;
                            while (i1 < len) {
                               className = stackTrace[i1].getClassName();
                               co5.l(className, "it.className");
                               v12 a = v12.a;
                               _monitor_enter(a);
                               HashMap b = v12.b;
                               if (!b.isEmpty()) {
                                  _monitor_exit(a);
                               }else {
                                  String[] stringArray = new String[]{"com.facebook.appevents.aam."};
                                  b.put(t12.y, stringArray);
                                  stringArray = new String[]{"com.facebook.appevents.codeless."};
                                  b.put(t12.v, stringArray);
                                  stringArray = new String[]{"com.facebook.appevents.cloudbridge."};
                                  b.put(t12.w, stringArray);
                                  stringArray = new String[]{"com.facebook.internal.instrument.errorreport."};
                                  b.put(t12.M, stringArray);
                                  stringArray = new String[]{"com.facebook.internal.instrument.anrreport."};
                                  b.put(t12.N, stringArray);
                                  stringArray = new String[]{"com.facebook.appevents.ml."};
                                  b.put(t12.z, stringArray);
                                  stringArray = new String[]{"com.facebook.appevents.suggestedevents."};
                                  b.put(t12.A, stringArray);
                                  stringArray = new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"};
                                  b.put(t12.x, stringArray);
                                  stringArray = new String[]{"com.facebook.appevents.integrity.IntegrityManager"};
                                  b.put(t12.B, stringArray);
                                  stringArray = new String[]{"com.facebook.appevents.eventdeactivation."};
                                  b.put(t12.D, stringArray);
                                  stringArray = new String[]{"com.facebook.appevents.ondeviceprocessing."};
                                  b.put(t12.E, stringArray);
                                  stringArray = new String[]{"com.facebook.appevents.iap."};
                                  b.put(t12.G, stringArray);
                                  stringArray = new String[]{"com.facebook.internal.logging.monitor"};
                                  b.put(t12.O, stringArray);
                                  _monitor_exit(a);
                               }
                               Iterator iterator = b.entrySet().iterator();
                               while (true) {
                                  if (iterator.hasNext()) {
                                     Map$Entry uEntry = iterator.next();
                                     key = uEntry.getKey();
                                     String[] value = uEntry.getValue();
                                     int len1 = value.length;
                                     int i2 = 0;
                                     do {
                                        if (i2 < len1) {
                                           i2 = i2 + 1;
                                           if (!av6.D0(className, value[i2], false)) {
                                              continue ;
                                           }
                                        }else {
                                           continue ;
                                        }
                                     } while (av6.D0(className, value[i2], false));
                                  }else {
                                     key = t12.b;
                                  }
                                  if (key != t12.b) {
                                     co5.o(key, "feature");
                                     sz1.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", false).edit().putString(co5.K(key, "FBSDKFeature"), "15.0.1").apply();
                                     hashSet.add(key.toString());
                                  }
                                  i1 = i1 + 1;
                               }
                            }
                            if (me7.a() && ((hashSet.isEmpty() ^ 1))) {
                               new ya3(new JSONArray(hashSet)).c();
                            }
                         }
                         new ya3(obj1).c();
                      }
                      if ((a1 = this.a) != null) {
                         a1.uncaughtException(obj, obj1);
                         break ;
                      }
                      break ;
                   }
                }else {
                   i = throwable;
                   throwable = throwable.getCause();
                }
             }
             return;
          }else {
             hashSet = 0;
             goto label_0044 ;
          }
       }
    }
}
