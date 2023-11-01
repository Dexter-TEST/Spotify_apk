package p.jb6;
import p.ib6;
import org.json.JSONObject;
import android.content.Context;
import p.x50;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.ArrayList;
import org.json.JSONArray;
import p.i60;
import java.lang.Throwable;
import p.sb6;
import p.t50;
import android.app.Activity;
import p.m60;
import p.l60;
import java.lang.Class;
import p.ob2;
import p.ji5;

public final class jb6 extends ib6	// class@001aa5 from classes.dex
{
    public final int j;
    public final x50 k;

    public void jb6(JSONObject p0,Context p1){
       this.j = 0;
       super(9, p0, p1);
       this.k = null;
    }
    public void jb6(x50 p0,Context p1,int p2){
       this.j = 1;
       this.k = p0;
       super(p1, p2);
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("name", p0.a);
          x50 e = p0.e;
          if (e.length() > 0) {
             jSONObject.put("custom_data", e);
          }
          e = p0.d;
          if (e.length() > 0) {
             jSONObject.put("event_data", e);
          }
          e = p0.c;
          try{
             if (e.size() > 0) {
                Iterator iterator = e.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   String key = uEntry.getKey();
                   jSONObject.put(key, uEntry.getValue());
                }
             }
             p0 = p0.f;
             if (p0.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("content_items", jSONArray);
                Iterator iterator1 = p0.iterator();
                while (iterator1.hasNext()) {
                   jSONArray.put(iterator1.next().a());
                }
             }
             this.l(jSONObject);
          }catch(org.json.JSONException e3){
             e3.printStackTrace();
          }
          this.p(jSONObject);
          return;
       }catch(org.json.JSONException e3){
       }
    }
    public final void b(){
    }
    public final int d(){
       switch (this.j){
           case 1:
           default:
             return 1;
       }
       return 4;
    }
    public final void f(int p0,String p1){
    }
    public final void g(){
    }
    public final void j(sb6 p0,t50 p1){
       ib6 ta;
       switch (this.j){
           case 0:
             String str = "event";
             jb6 tk = this.k;
             if (p0.a() != null) {
                String str1 = "branch_view_data";
                if (p0.a().has(str1) && t50.i().h() != null) {
                   String str2 = "";
                   try{
                      if ((ta = this.a) != null && ta.has(str)) {
                         str2 = ta.getString(str);
                      }
                      m60 om60 = m60.b();
                      om60.getClass();
                      om60.c(new ob2(om60, p0.a().getJSONObject(str1), str2, 0), t50.i().h(), tk);
                   }catch(org.json.JSONException e0){
                      if (e0) {
                         e0.n(str2);
                      }
                   }
                }
             }
             break;
           default:
             return;
       }
       return;
    }
    public final void l(JSONObject p0){
       switch (this.j){
           case 1:
           default:
             super.l(p0);
             return;
       }
       super.l(p0);
       this.c.q(p0);
       return;
    }
    public final boolean m(){
       return true;
    }
    public final boolean n(){
       switch (this.j){
           case 1:
           default:
             return false;
       }
       return true;
    }
}
