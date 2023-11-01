package p.qh;
import java.lang.Runnable;
import p.md7;
import p.fw;
import java.lang.Object;
import p.t50;
import java.util.concurrent.CountDownLatch;
import p.q50;
import p.wh;
import android.widget.TextView;
import android.graphics.Typeface;
import java.lang.Class;
import p.b7;
import p.u16;
import p.yx6;
import java.lang.String;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import p.xl0;
import p.qe3;

public final class qh implements Runnable	// class@0023a5 from classes.dex
{
    public final int a;
    public final int b;
    public final Object c;
    public final Object t;
    public final Object v;

    public void qh(md7 p0,fw p1,int p2,Runnable p3){
       this.a = 1;
       super();
       this.c = p0;
       this.t = p1;
       this.b = p2;
       this.v = p3;
    }
    public void qh(t50 p0,CountDownLatch p1,int p2,q50 p3){
       this.a = 2;
       this.v = p0;
       this.c = p1;
       this.b = p2;
       this.t = p3;
       super();
    }
    public void qh(wh p0,TextView p1,Typeface p2,int p3){
       this.a = 0;
       this.v = p0;
       this.c = p1;
       this.t = p2;
       this.b = p3;
       super();
    }
    public final void run(){
       NetworkInfo activeNetwor;
       qh tv = this.v;
       qh tb = this.b;
       qh tt = this.t;
       qh tc = this.c;
       switch (this.a){
           case 0:
           case 1:
             int i = 1;
             try{
                md7 c = tc.c;
                c.getClass();
                tc.f.y(new b7(10, c));
                if ((activeNetwor = tc.a.getSystemService("connectivity").getActiveNetworkInfo()) != null && activeNetwor.isConnected()) {
                   activeNetwor = 1;
                label_0041 :
                   if (!activeNetwor) {
                      tc.f.y(new xl0(tc, tt, tb, 3));
                   }else {
                      tc.a(tt, tb);
                   }
                }else {
                   activeNetwor = 0;
                   goto label_0041 ;
                }
             }catch(p.xx6 e0){
                tc.d.a(tt, (tb + e0));
             }
             tv.run();
             return;
             break;
           default:
             tv.getClass();
             t50.b(tc, tb, tt);
             return;
       }
       tc.setTypeface(tt, tb);
       return;
    }
}
