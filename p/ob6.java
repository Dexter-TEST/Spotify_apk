package p.ob6;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import org.json.JSONArray;
import java.lang.Math;
import org.json.JSONObject;
import p.ib6;
import p.mb6;
import java.util.Iterator;
import java.lang.Throwable;
import p.ji5;
import p.hb6;
import java.util.HashSet;

public final class ob6	// class@0020eb from classes.dex
{
    public final SharedPreferences$Editor a;
    public final List b;
    public static ob6 c;
    public static final Object d;

    static {
       ob6.d = new Object();
    }
    public void ob6(Context p0){
       ib6 oib6;
       super();
       int i = 0;
       SharedPreferences sharedPrefer = p0.getSharedPreferences("BNC_Server_Request_Queue", i);
       this.a = sharedPrefer.edit();
       String str = sharedPrefer.getString("BNCServerRequestQueue", null);
       List list = Collections.synchronizedList(new LinkedList());
       Object d = ob6.d;
       _monitor_enter(d);
       if (str != null) {
          try{
             JSONArray jSONArray = new JSONArray(str);
             int i1 = Math.min(jSONArray.length(), 25);
             while (i < i1) {
                if ((oib6 = ib6.c(p0, jSONArray.getJSONObject(i))) != null) {
                   list.add(oib6);
                }
                i = i + 1;
             }
          }catch(org.json.JSONException e0){
          }
       }
       _monitor_exit(d);
       this.b = list;
       return;
    }
    public final int a(){
       Object d = ob6.d;
       _monitor_enter(d);
       _monitor_exit(d);
       return this.b.size();
    }
    public final void b(mb6 p0,int p1){
       Object d = ob6.d;
       _monitor_enter(d);
       try{
          if (this.b.size() < p1) {
             p1 = this.b.size();
          }
          this.b.add(p1, p0);
          this.c();
          _monitor_exit(e0);
          return;
       }catch(java.lang.IndexOutOfBoundsException e0){
       }
    }
    public final void c(){
       String message;
       JSONObject jSONObject;
       try{
          JSONArray jSONArray = new JSONArray();
          Object d = ob6.d;
          _monitor_enter(d);
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             ib6 oib6 = iterator.next();
             if (oib6.h() && (jSONObject = oib6.o()) != null) {
                jSONArray.put(jSONObject);
             }
          }
          _monitor_exit(d);
          this.a.putString("BNCServerRequestQueue", jSONArray.toString()).apply();
       }catch(java.lang.Exception e0){
          if ((message = e0.getMessage()) == null) {
             message = "";
          }
          ji5.a("Failed to persist queue".concat(message));
       }
       return;
    }
    public final void d(ib6 p0){
       Object d = ob6.d;
       _monitor_enter(d);
       try{
          this.b.remove(p0);
          this.c();
          _monitor_exit(e0);
          return;
       }catch(java.lang.UnsupportedOperationException e0){
       }
    }
    public final void e(hb6 p0){
       ib6 oib6;
       Object d = ob6.d;
       _monitor_enter(d);
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          if ((oib6 = iterator.next()) != null) {
             oib6.f.remove(p0);
          }
       }
       _monitor_exit(d);
       return;
    }
}
