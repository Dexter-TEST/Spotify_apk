package p.zo6;
import p.wf2;
import p.gi3;
import p.ap6;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import p.t50;
import p.yo6;
import p.lb6;
import android.content.Context;
import p.ib6;
import p.r8;
import org.json.JSONObject;
import p.r50;
import p.ji5;
import java.lang.Throwable;
import p.jc7;

public final class zo6 extends gi3 implements wf2	// class@002f3a from classes.dex
{
    public final ap6 a;
    public final String b;

    public void zo6(ap6 p0,String p1){
       this.a = p0;
       this.b = p1;
       super(0);
    }
    public final Object invoke(){
       t50 ot50;
       lb6 j;
       String str1;
       t50 c1;
       lb6 j1;
       zo6 ta = this.a;
       ta.a.getClass();
       if ((ot50 = t50.i()) == null) {
       }else {
          ta = this.b;
          t50.F = ta;
          t50 d = ot50.d;
          lb6 olb6 = new lb6(d, new yo6(ta, ot50), ta);
          String str = "bnc_identity";
          int i = 1;
          ib6 c = olb6.c;
          if (olb6.g == null) {
             ta = (!d.checkCallingOrSelfPermission("android.permission.INTERNET"))? 1: 0;
             if (!ta) {
                if ((j = olb6.j) != null) {
                   j.a(null, new r8("Trouble setting the user alias.", -102));
                }
             }else if((str1 = olb6.a.getString("identity")) != null && (str1.length() && !str1.equals(c.p(str)))){
                c1 = 0;
                if (!j) {
                   ot50.k(olb6);
                }
             }
          }
          try{
             if ((str1 = olb6.a.getString("identity")) == null || !str1.equals(c.p(str))) {
                i = 0;
             }
             int i1 = i;
          }catch(org.json.JSONException e0){
             e0.printStackTrace();
          }
          if (0) {
             c1 = t50.C;
             if ((j1 = olb6.j) != null) {
                j1.a(t50.g(c1.b.p("bnc_install_params")), null);
             }
          }
       }
       return jc7.a;
    }
}
