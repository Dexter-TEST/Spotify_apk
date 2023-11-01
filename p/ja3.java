package p.ja3;
import java.lang.Runnable;
import java.lang.Object;
import com.spotify.mobius.android.a;
import java.util.Queue;
import p.xz4;
import p.s01;
import p.dg6;
import p.hm6;
import java.lang.Class;
import java.lang.String;
import p.co5;
import java.lang.Boolean;
import p.an5;
import p.cg6;
import p.fj3;
import android.view.View;
import p.ob1;
import p.hr0;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import p.mb4;
import java.lang.Exception;
import p.is3;
import android.view.ViewGroup;
import p.ik5;
import p.gv3;
import p.nt3;
import com.spotify.liteui.login.LoginActivity;
import p.f;
import p.ou3;
import p.es;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import p.lh5;
import java.lang.CharSequence;
import p.uu2;
import p.cu2;
import p.dt5;
import p.ju2;
import p.m73;
import p.du2;
import android.content.ClipboardManager;
import android.content.ClipboardManager$OnPrimaryClipChangedListener;
import p.cm;
import java.util.HashSet;
import p.t00;
import p.wm;
import p.f66;
import p.x56;
import p.r45;
import io.reactivex.rxjava3.core.Observer;
import p.km;
import p.ar5;
import p.yq5;
import android.database.Observable;
import p.c1;
import p.x7;
import p.jj5;
import p.ql4;
import android.content.Context;
import android.content.Intent;
import p.xj0;
import p.rl4;
import p.a25;
import p.rn6;
import p.tn6;
import p.wn6;
import java.util.Set;
import p.y15;
import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import java.lang.Iterable;
import p.ma3;
import p.ot;
import p.bz1;
import p.xy1;

public final class ja3 implements Runnable	// class@001a99 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void ja3(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    private final void a(){
       a e;
       ja3 tb = this.b;
       ja3 tc = this.c;
       a a = tb.a;
       _monitor_enter(a);
       if ((e = tb.e) != null) {
          e.b(tc);
       }
       _monitor_exit(a);
       return;
    }
    private final void b(){
       a d;
       ja3 tb = this.b;
       ja3 tc = this.c;
       a a = tb.a;
       _monitor_enter(a);
       if ((d = tb.d) != null) {
          d.b(tc);
       }
       _monitor_exit(a);
       return;
    }
    public final void run(){
       wn6 own6;
       ja3 tc;
       int i1;
       ja3 tb;
       String str;
       ja3 tc1;
       km b2;
       int i = 0;
       switch (this.a){
           case 0:
             own6 = this.b.b.edit();
             own6.c(ma3.c, this.c.a);
             own6.f();
             return;
           case 1:
             tc = this.c;
             own6 = this.b.edit();
             own6.getClass();
             rn6 b = y15.b;
             co5.o(b, "key");
             own6.a.putStringSet(b.a, tc);
             if (tc != null) {
                Iterator iterator = tc.iterator();
                while (iterator.hasNext()) {
                   i1 = iterator.next().length() * 2;
                   i = i + i1;
                }
             }
             own6.g(i);
             own6.f();
             return;
             break;
           case 2:
             tb = this.b;
             tb.getClass();
             if ((str = this.c.f()) != null) {
                rn6 c = a25.c;
                a25 b1 = tb.b;
                String str1 = b1.g(c, null);
                if (str.equals("active") || (str.equals("expired") || !"active".equals(str1))) {
                   own6 = b1.edit();
                   own6.c(c, str);
                   own6.f();
                }
             }
             return;
             break;
           case 3:
             tb = this.b;
             tb.startActivity(xj0.s(tb, "spotify:internal:add-to-playlist:"+this.c.P));
             return;
           case 4:
             tb = this.b;
             tb.startActivity(xj0.s(tb, this.c.P));
             return;
           case 5:
             tb = this.b;
             tb.y.onNext(Boolean.TRUE);
             tb.v.onNext(new jj5(new x7(tb.B, this.c, tb.C)));
             return;
           case 6:
             tc1 = this.c;
             if ((b2 = this.b.B) != null) {
                b2.a.unregisterObserver(tc1);
             }
             return;
             break;
           case 7:
             this.b.z.onNext(this.c);
             return;
           case 8:
             this.b.D.onNext(this.c);
             return;
           case 9:
             this.b.E.onNext(this.c);
             return;
           case 10:
             tb = this.b;
             tb.t.add(this.c);
             tb.v.onNext(new Object());
             return;
           case 11:
             this.b.removePrimaryClipChangedListener(this.c);
             return;
           case 12:
             tb = this.b;
             tb.b.setText(this.c);
             tb.c.c.a(new cu2("layoutChange", tb.f, dt5.x));
             return;
           case 13:
             tb = this.b;
             tc = this.c;
             tb.getClass();
             f a = tc.a;
             ou3 a1 = ou3.a;
             int i2 = 1;
             int b3 = (a == a1 && tc.t != null)? true: false;
             i1 = (a == ou3.b)? 1: 0;
             i1 = i1 ^ i2;
             tb.T.d.setEnabled(i1);
             tb.T.e.setEnabled(i1);
             tb.T.b.setEnabled(b3);
             if ((a = tc.a) != a1 || tc.v == null) {
                i2 = 0;
             }
             es g = tb.T.g;
             if (!i2) {
                i = 8;
             }
             g.setVisibility(i);
             es e = tb.T.e;
             int i3 = 0x7f070081;
             b3 = (i2)? 0x7f070080: 0x7f070081;
             e.setBackgroundResource(b3);
             e = tb.T.d;
             if (i2) {
                i3 = 0x7f070080;
             }
             e.setBackgroundResource(i3);
             if (a == ou3.c) {
                tb.setResult(-1);
                tb.finish();
             }
             return;
             break;
           case 14:
             tc1 = this.c;
             this.b.R.c(tc1.A, tc1.B);
             return;
           case 15:
             this.b.addView(this.c);
             return;
           case 16:
             tb = this.b;
             tb.getClass();
             tb.b.accept(this.c);
             return;
             break;
           case 17:
             this.a();
             return;
           case 18:
             this.b();
             return;
           case 19:
             this.b.l(this.c);
             return;
           case 20:
             tc1 = this.c;
             this.b.c(tc1.A, tc1.B);
             return;
           case 21:
             tb = this.b;
             tb.getClass();
             co5.o(this.c.A, "username");
             tb.d.onNext(Boolean.FALSE);
             return;
           default:
             tb = this.b;
             tb.getClass();
             bz1 b4 = tb.b;
             b4.getClass();
             co5.o(this.c.H, "username");
             b4.d.onNext(Boolean.FALSE);
             return;
       }
    }
}
