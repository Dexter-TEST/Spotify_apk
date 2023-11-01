package p.th6;
import p.ap0;
import p.uh6;
import p.wy3;
import p.in7;
import java.lang.Object;
import p.nh6;
import p.mv;
import p.ks6;
import android.view.View;
import p.ry7;
import android.widget.TextView;
import p.ys5;
import android.view.View$OnClickListener;
import java.lang.Runnable;
import com.spotify.signup.signup.view.EmailView;

public final class th6 implements ap0	// class@002772 from classes.dex
{
    public final ap0 a;
    public final ap0 b;
    public final ap0 c;
    public final ap0 t;
    public final uh6 v;

    public void th6(uh6 p0,wy3 p1,wy3 p2,in7 p3,in7 p4){
       this.v = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.t = p4;
       super();
    }
    public final void accept(Object p0){
       uh6 a;
       th6 tv = this.v;
       uh6 x = tv.x;
       mv omv = p0;
       mv e = omv.e;
       int b = true;
       boolean b1 = false;
       if (x != e) {
          x = (x < e)? 1: 0;
          tv.x = e;
          if (p0.a() == omv.a) {
             a = tv.a;
          }else if(p0.a() == omv.b){
             a = tv.b;
          }else if(p0.a() == omv.d){
             a = tv.t;
          }else {
             a = tv.c;
          }
          if (x) {
             uh6.a(tv.y, b1, b);
             uh6.a(a, b, b1);
          }else {
             uh6.a(tv.y, b1, b1);
             uh6.a(a, b, b);
          }
          ry7.H(tv.y);
          tv.y = a;
       }
       a = tv.v;
       a.setEnabled(p0.a().b());
       mv omv1 = p0;
       if (omv1.e != (p0.b().t - b)) {
          b = false;
       }
       int i = (b)? 0x7f1203c4: 0x7f1203c7;
       a.setText(i);
       b = ((e = omv1.f) == null && (omv1.i == null && !p0.a().a()))? 0: 4;
       a.setVisibility(b);
       if (e == null && !p0.a().a()) {
          b1 = 8;
       }
       tv.w.setVisibility(b1);
       this.a.accept(omv1.a);
       this.b.accept(omv1.b);
       this.c.accept(omv1.c);
       this.t.accept(omv1.d);
       return;
    }
    public final void dispose(){
       this.a.dispose();
       this.b.dispose();
       this.c.dispose();
       this.t.dispose();
       th6 tv = this.v;
       tv.v.setOnClickListener(null);
       tv.c.setNextListener(null);
    }
}
