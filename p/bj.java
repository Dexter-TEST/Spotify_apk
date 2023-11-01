package p.bj;
import p.b3;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import p.ej4;
import p.eo5;
import p.a3;
import p.az5;
import java.util.Date;
import p.co5;
import p.d3;
import p.sz1;
import java.lang.Double;
import android.os.Bundle;
import java.util.UUID;
import p.e22;
import p.ns3;
import p.fs3;
import p.ki;
import p.t6;
import p.ny1;

public final class bj	// class@0010db from classes.dex
{
    public final String a;
    public final d3 b;
    public static final b3 c;
    public static ScheduledThreadPoolExecutor d;
    public static final Object e;
    public static String f;
    public static boolean g;

    static {
       bj.c = new b3(5, 0);
       bj.e = new Object();
    }
    public void bj(Context p0,String p1){
       super(ej4.v(p0), p1);
    }
    public void bj(String p0,String p1){
       a3 uoa3;
       super();
       eo5.Q();
       this.a = p0;
       if ((uoa3 = az5.D()) != null && (!new Date().after(uoa3.a) && (p1 == null && !co5.c(p1, uoa3.y)))) {
          this.b = new d3(uoa3.v, sz1.b());
       }else if(p1 == null){
          p1 = ej4.F(sz1.a());
       }
       this.b = new d3(null, p1);
       b3.t();
       return;
    }
    public final void a(String p0,Double p1,Bundle p2,boolean p3,UUID p4){
       ns3 t;
       bj uobj = this;
       if (p0 != null) {
          boolean b = false;
          int i = (!p0.length())? 1: 0;
          if (!i) {
             try{
                t = ns3.t;
                if (e22.b("app_events_killswitch", sz1.b(), b)) {
                   sz1.i(t);
                   return;
                }else {
                   bj a = uobj.a;
                   boolean b1 = (!t6.j)? true: false;
                   ki i1 = new ki(a, p0, p1, p2, p3, b1, p4);
                   b3.b(i, uobj.b);
                }
             }catch(org.json.JSONException e0){
                e0.toString();
                sz1.i(t);
             }catch(p.ny1 e0){
                e0.toString();
                sz1.i(t);
             }
          }
       }
       return;
    }
    public final void b(String p0,Bundle p1){
       this.a(p0, null, p1, true, t6.a());
    }
}
