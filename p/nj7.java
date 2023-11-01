package p.nj7;
import android.view.View$OnClickListener;
import java.util.HashSet;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import p.gi7;
import java.lang.ref.WeakReference;
import p.co5;
import p.av6;
import java.lang.ref.Reference;
import p.rv6;
import p.ii5;
import java.util.Map;
import java.util.LinkedHashMap;
import p.de7;
import java.util.concurrent.Executor;
import p.sz1;
import java.lang.Runnable;
import org.json.JSONObject;
import p.lj7;

public final class nj7 implements View$OnClickListener	// class@001ff0 from classes.dex
{
    public final View$OnClickListener a;
    public final WeakReference b;
    public final WeakReference c;
    public final String t;
    public static final HashSet v;

    static {
       nj7.v = new HashSet();
    }
    public void nj7(View p0,View p1,String p2){
       super();
       this.a = gi7.e(p0);
       this.b = new WeakReference(p1);
       this.c = new WeakReference(p0);
       String str = p2.toLowerCase();
       co5.l(str, "\(this as java.lang.String\).toLowerCase\(\)");
       this.t = av6.x0(str, "activity", "");
    }
    public final void onClick(View p0){
       nj7 ta;
       View view;
       String str2;
       String str = "view";
       co5.o(p0, str);
       if ((ta = this.a) == null) {
       }else {
          ta.onClick(p0);
       }
       try{
          p0 = this.b.get();
          view = this.c.get();
          if (p0 != null && view != null) {
             String str1 = rv6.d(view);
             if ((str2 = ii5.b(view, str1)) != null) {
                LinkedHashMap a = ii5.a;
                String str3 = (a.containsKey(str2))? a.get(str2): null;
                if (str3 == null) {
                   str3 = 0;
                }else if(!co5.c(str3, "other")){
                   try{
                      de7 uode7 = new de7(1, str3, str1);
                      sz1.c().execute(uode7);
                   }catch(java.lang.Exception e0){
                   }
                }
                JSONObject jSONObject = 1;
                if (!str3) {
                   jSONObject = new JSONObject();
                   jSONObject.put(str, rv6.b(p0, view));
                   jSONObject.put("screenname", this.t);
                   sz1.c().execute(new lj7(jSONObject, str1, this, str2));
                }
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
