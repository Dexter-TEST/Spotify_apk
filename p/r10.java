package p.r10;
import p.ap0;
import p.xo0;
import java.lang.Object;
import p.nd5;
import com.spotify.litesignup.phonesignup.view.BirthdayGenderContainerView;
import p.i;
import p.ks6;
import android.view.View;
import p.ry7;
import p.ys5;
import android.widget.TextView;
import p.rd5;
import p.g;
import io.reactivex.rxjava3.disposables.Disposable;
import android.view.View$OnClickListener;

public final class r10 implements ap0	// class@002454 from classes.dex
{
    public final int a;
    public final ap0 b;
    public final ap0 c;
    public final Object t;
    public final xo0 v;

    public void r10(xo0 p0,ap0 p1,ap0 p2,Object p3,int p4){
       this.a = p4;
       this.v = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       super();
    }
    public final void a(nd5 p0){
       i oi;
       i x;
       BirthdayGenderContainerView c;
       ks6 oks6;
       rd5 a2;
       r10 tc = this.c;
       r10 tb = this.b;
       int i = 8;
       r10 tv = this.v;
       int b = true;
       switch (this.a){
           case 0:
             BirthdayGenderContainerView t = tv.t;
             oi = p0;
             x = oi.x;
             if (t != x) {
                t = (t < x)? 1: 0;
                tv.t = x;
                BirthdayGenderContainerView a = (p0.a() == oi.c)? tv.a: tv.b;
                if (t) {
                   BirthdayGenderContainerView.a(tv.v, false, b);
                   BirthdayGenderContainerView.a(a, b, false);
                }else {
                   BirthdayGenderContainerView.a(tv.v, false, false);
                   BirthdayGenderContainerView.a(a, b, b);
                }
                ry7.H(tv.v);
                tv.v = a;
             }
             tv.c.setEnabled(p0.a().b());
             t = tv.c;
             oi = p0;
             if (oi.x != (p0.b().t - b)) {
                b = false;
             }
             b = (b)? 0x7f120295: 0x7f120296;
             t.setText(b);
             tv.c.setEnabled(p0.a().b());
             c = tv.c;
             if (oi.y == null && oi.w == null) {
                i = 0;
             }
             break;
           default:
             rd5 x1 = tv.x;
             oi = p0;
             x = oi.x;
             i a1 = oi.a;
             i b1 = oi.b;
             if (x1 != x) {
                x1 = (x1 < x)? 1: 0;
                tv.x = x;
                if ((oks6 = p0.a()) == a1) {
                   a2 = tv.a;
                }else if(oks6 == b1){
                   a2 = tv.b;
                }else {
                   a2 = tv.c;
                }
                if (x1) {
                   rd5.e(tv.y, false, b);
                   rd5.e(a2, b, false);
                }else {
                   rd5.e(tv.y, false, false);
                   rd5.e(a2, b, b);
                }
                if (tv.y != null) {
                   ry7.H(a2);
                }
                tv.y = a2;
             }
             if (oi.y != null || b1.x != null) {
                i = 0;
             }
             tv.w.setVisibility(i);
             tb.accept(a1);
             tc.accept(b1);
             this.t.accept(p0);
             return;
       }
       c.setVisibility(i);
       tb.accept(oi.c);
       tc.accept(oi.t);
       return;
    }
    public final void accept(Object p0){
       switch (this.a){
           case 0:
           default:
             this.a(p0);
             return;
       }
       this.a(p0);
       return;
    }
    public final void dispose(){
       r10 tt = this.t;
       r10 tc = this.c;
       r10 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.dispose();
             tc.dispose();
             tt.dispose();
             this.v.v.setOnClickListener(null);
             return;
       }
       tb.dispose();
       tc.dispose();
       tt.dispose();
       return;
    }
}
