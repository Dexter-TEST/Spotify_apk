package p.lj7;
import java.lang.Runnable;
import android.content.Context;
import p.tx;
import p.ev0;
import p.y37;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.String;
import p.nj7;
import p.co5;
import p.sz1;
import p.eo5;
import android.content.pm.ApplicationInfo;
import p.xj0;
import p.kc4;
import p.ic4;
import p.ii5;
import p.mj7;
import java.lang.NullPointerException;
import java.lang.Class;

public final class lj7 implements Runnable	// class@001d69 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object t;
    public final Object v;

    public void lj7(Context p0,tx p1,ev0 p2,y37 p3){
       this.a = 1;
       super();
       this.b = p1;
       this.c = p0;
       this.t = p2;
       this.v = p3;
    }
    public void lj7(JSONObject p0,String p1,nj7 p2,String p3){
       this.a = 0;
       super();
       this.b = p0;
       this.c = p1;
       this.v = p2;
       this.t = p3;
    }
    public final void run(){
       lj7 tb;
       lj7 tc;
       lj7 tv;
       lj7 tt;
       String d;
       ApplicationInfo labelRes;
       int i = 1;
       switch (this.a){
           case 0:
             tb = this.b;
             tc = this.c;
             tv = this.v;
             tt = this.t;
             co5.o(tb, "$viewData");
             co5.o(tc, "$buttonText");
             co5.o(tv, "this$0");
             String str = "$pathID";
             try{
                co5.o(tt, str);
                Context uContext = sz1.a();
                try{
                   eo5.Q();
                   if ((d = sz1.d) != null) {
                      if (d != null) {
                         str = d.toLowerCase();
                         co5.l(str, "\(this as java.lang.String\).toLowerCase\(\)");
                         float[] uofloatArray = xj0.k0(str, e0);
                         String str1 = xj0.p0(tc, tv.t, str);
                         if (uofloatArray != null) {
                            float[][] uofloatArray1 = new float[][i];
                            uofloatArray1[0] = uofloatArray;
                            String[] stringArray = new String[i];
                            stringArray[0] = str1;
                            if ((stringArray = kc4.c(ic4.b, uofloatArray1, stringArray)) != null) {
                               object oobject = stringArray[0];
                               ii5.a(tt, oobject);
                               if (!co5.c(oobject, "other")) {
                                  mj7.n(oobject, tc, uofloatArray);
                               }
                            }
                         }
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                      }
                   }else {
                      ApplicationInfo applicationI = uContext.getApplicationInfo();
                      if ((labelRes = applicationI.labelRes) == null) {
                         str = applicationI.nonLocalizedLabel.toString();
                      }else {
                         str = uContext.getString(labelRes);
                         co5.l(str, "context.getString\(stringId\)");
                      }
                   }
                }catch(java.lang.Exception e0){
                   str = "";
                }catch(java.lang.Exception e0){
                }
             }catch(java.lang.Exception e0){
             }
             break;
           default:
             tb = this.b;
             tc = this.c;
             tv = this.t;
             tt = this.v;
             tb.getClass();
             co5.o(tc, "context");
             co5.o(tv, "coreLibraryType");
             co5.o(tt, "timeKeeper");
             if (tb.c == null) {
                tb.c(tc, tv, tt, i);
                tb.c = i;
             }
             return;
       }
       return;
    }
}
