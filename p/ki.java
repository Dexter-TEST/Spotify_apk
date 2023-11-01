package p.ki;
import java.io.Serializable;
import p.b3;
import java.util.HashSet;
import java.lang.String;
import java.lang.Double;
import android.os.Bundle;
import java.util.UUID;
import java.lang.Object;
import p.co5;
import org.json.JSONObject;
import p.sx5;
import java.util.concurrent.CopyOnWriteArraySet;
import java.lang.System;
import java.util.HashMap;
import java.util.Set;
import android.os.BaseBundle;
import java.util.Iterator;
import java.lang.Number;
import p.ny1;
import p.kg4;
import p.is7;
import java.lang.Iterable;
import java.util.List;
import p.dj0;
import java.lang.IllegalStateException;
import java.util.ArrayList;
import java.util.Collection;
import p.rx5;
import java.util.Map;
import java.util.Map$Entry;
import p.eu1;
import p.du1;
import p.fs3;
import p.ns3;
import p.sz1;
import p.ji;
import java.lang.Boolean;

public final class ki implements Serializable	// class@001c20 from classes.dex
{
    public final JSONObject a;
    public final boolean b;
    public final boolean c;
    public final String t;
    public final String v;
    public static final HashSet w;

    static {
       b3 uob3 = new b3(1, 0);
       ki.w = new HashSet();
    }
    public void ki(String p0,String p1,Double p2,Bundle p3,boolean p4,boolean p5,UUID p6){
       String str1;
       String obj;
       ki tt;
       ArrayList uArrayList;
       Iterator iterator1;
       du1 uodu1;
       Iterator iterator2;
       HashMap hashMap1;
       Iterator iterator3;
       rx5 orx5;
       Iterator iterator4;
       String str2;
       JSONObject jSONObject1;
       Iterator iterator5;
       Map$Entry uEntry;
       co5.o(p0, "contextName");
       String str = "eventName";
       co5.o(p1, str);
       super();
       this.b = p4;
       this.c = p5;
       this.t = p1;
       b3.e(p1);
       JSONObject jSONObject = new JSONObject();
       if (sx5.a && sx5.c.contains(p1)) {
          p1 = "_removed_";
       }
       jSONObject.put("_eventName", p1);
       jSONObject.put("_eventName_md5", b3.c(p1));
       jSONObject.put("_logTime", (System.currentTimeMillis() / (long)1000));
       jSONObject.put("_ui", p0);
       if (p6 != null) {
          jSONObject.put("_session_id", p6);
       }
       if (p3 != null) {
          HashMap hashMap = new HashMap();
          Iterator iterator = p3.keySet().iterator();
          while (true) {
             int i = 1;
             if (iterator.hasNext()) {
                str1 = iterator.next();
                co5.l(str1, "key");
                b3.e(str1);
                obj = p3.get(str1);
                if (!obj instanceof String && !obj instanceof Number) {
                   Object[] objArray = new Object[]{obj,str1};
                   throw new ny1(kg4.q(objArray, 2, "Parameter value \'%s\' for key \'%s\' should be a string or a numeric type.", "java.lang.String.format\(format, *args\)"));
                }else {
                   hashMap.put(str1, obj.toString());
                }
             }else if(is7.y && !hashMap.isEmpty()){
                JSONObject jSONObject2 = new JSONObject();
                iterator = dj0.B0(hashMap.keySet()).iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      str1 = iterator.next();
                      if ((obj = hashMap.get(str1)) != null) {
                         if (!is7.z(str1) && !is7.z(obj)) {
                            continue ;
                         }else {
                            hashMap.remove(str1);
                            if (!is7.z) {
                               obj = "";
                            }
                            jSONObject2.put(str1, obj);
                         }
                      }else {
                         throw new IllegalStateException("Required value was null.".toString());
                      }
                   }else if(jSONObject2.length()){
                      String str3 = jSONObject2.toString();
                      co5.l(str3, "restrictiveParamJson.toString\(\)");
                      hashMap.put("_onDeviceParams", str3);
                   }
                }
             }
          }
       }
    }
    public void ki(String p0,boolean p1,boolean p2,String p3){
       super();
       JSONObject jSONObject = new JSONObject(p0);
       this.a = jSONObject;
       this.b = p1;
       p0 = jSONObject.optString("_eventName");
       co5.l(p0, "jsonObject.optString\(Constants.EVENT_NAME_EVENT_KEY\)");
       this.t = p0;
       this.v = p3;
       this.c = p2;
    }
    private final Object writeReplace(){
       String str = this.a.toString();
       co5.l(str, "jsonObject.toString\(\)");
       return new ji(str, this.b, this.c, this.v);
    }
    public final String toString(){
       ki ta;
       Object[] objArray = new Object[]{ta.optString("_eventName"),Boolean.valueOf(this.b),ta.toString()};
       ta = this.a;
       return kg4.q(objArray, 3, "\"%s\", implicit: %b, json: %s", "java.lang.String.format\(format, *args\)");
    }
}
