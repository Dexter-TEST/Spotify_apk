package p.me6;
import p.yf2;
import p.pe6;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import p.he6;
import java.lang.Class;
import android.content.Intent;
import android.os.Build$VERSION;
import p.ne6;
import java.lang.Runnable;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.oe6;

public final class me6 implements yf2	// class@001e7e from classes.dex
{
    public final pe6 a;
    public final Context b;
    public final String c;
    public final String t;
    public final String v;

    public void me6(pe6 p0,Context p1,String p2,String p3,String p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final Object apply(Object p0){
       ne6 v9;
       me6 tb = this.b;
       me6 tc = this.c;
       me6 tt = this.t;
       me6 tv = this.v;
       me6 ta = this.a;
       ta.getClass();
       Intent intent = new Intent("android.intent.action.SEND");
       intent.putExtra("android.intent.extra.TEXT", p0.a);
       intent.setType("text/plain");
       if (Build$VERSION.SDK_INT >= 22) {
          v9 = new ne6(tb, intent, tc, p0.b, tt, tv, p0.a);
          p0 = Completable.j(v9);
       }else {
          oe6 v91 = new oe6(ta, tc, p0.b, tt, tv, tb, p0.a, intent);
          p0 = Completable.j(v9);
       }
       return p0;
    }
}
