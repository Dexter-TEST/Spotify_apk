package p.q70;
import java.util.HashMap;
import p.o70;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Double;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;
import android.os.Bundle;
import p.co5;
import java.util.Iterator;
import java.lang.Class;
import p.p70;
import java.lang.IllegalArgumentException;
import android.os.BaseBundle;
import java.util.ArrayList;

public abstract class q70	// class@002343 from classes.dex
{
    public static final HashMap a;

    static {
       HashMap hashMap = new HashMap();
       q70.a = hashMap;
       hashMap.put(Boolean.class, new o70(0));
       hashMap.put(Integer.class, new o70(1));
       hashMap.put(Long.class, new o70(2));
       hashMap.put(Double.class, new o70(3));
       hashMap.put(String.class, new o70(4));
       hashMap.put(String[].class, new o70(5));
       hashMap.put(JSONArray.class, new o70(6));
    }
    public static final Bundle a(JSONObject p0){
       Object obj;
       p70 op70;
       int i;
       co5.o(p0, "jsonObject");
       Bundle uBundle = new Bundle();
       Iterator iterator = p0.keys();
       while (true) {
          if (!iterator.hasNext()) {
             return uBundle;
          }
          String str = iterator.next();
          if ((obj = p0.get(str)) == JSONObject.NULL) {
             continue ;
          }else if(obj instanceof JSONObject){
             uBundle.putBundle(str, q70.a(obj));
          }else if((op70 = q70.a.get(obj.getClass())) != null){
             co5.l(str, "key");
             switch (op70.a){
                 case 0:
                   uBundle.putBoolean(str, obj.booleanValue());
                   break;
                 case 1:
                   uBundle.putInt(str, obj.intValue());
                   break;
                 case 2:
                   uBundle.putLong(str, obj.longValue());
                   break;
                 case 3:
                   uBundle.putDouble(str, obj.doubleValue());
                   break;
                 case 4:
                   uBundle.putString(str, obj);
                   break;
                 case 5:
                   throw new IllegalArgumentException("Unexpected type from JSON");
                 default:
                   ArrayList uArrayList = new ArrayList();
                   if (!obj.length()) {
                      uBundle.putStringArrayList(str, uArrayList);
                   }else if((i = obj.length()) > 0){
                      int i1 = 0;
                      while (true) {
                         int i2 = i1 + 1;
                         Object obj1 = obj.get(i1);
                         if (!obj1 instanceof String) {
                            throw new IllegalArgumentException(co5.K(obj1.getClass(), "Unexpected type in an array: "));
                         }
                         uArrayList.add(obj1);
                         if (i2 < i) {
                            i1 = i2;
                         }
                      }
                   }
                   uBundle.putStringArrayList(str, uArrayList);
             }
          }else {
             throw new IllegalArgumentException(co5.K(obj.getClass(), "Unsupported type: "));
          }
       }
    }
}
