package p.sd2;
import p.k15;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import p.lg4;
import p.zm1;
import com.spotify.litesignup.phonesignup.PhoneNumberSignupActivity;
import p.vb5;
import p.an5;
import p.yk4;
import p.rj2;
import p.rk2;
import com.spotify.liteplayer.player.npv.NowPlayingActivity;
import p.j83;
import java.lang.String;
import androidx.fragment.app.o;
import p.pm4;
import p.tl6;
import p.mn6;
import p.td1;
import com.spotify.lite.appmain.MainActivity;
import p.kb3;
import android.app.Activity;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import p.x86;
import p.fh5;
import p.ds3;
import p.fb4;
import java.lang.Class;
import p.vx5;
import p.ob7;
import p.kb7;
import p.fb7;
import p.ib7;
import java.util.HashMap;
import p.gb7;
import p.pb7;
import p.nb3;
import p.tu6;
import com.spotify.allboarding.allboardingimpl.mobius.AllBoardingFragment;
import p.eb;
import p.z9;
import p.ma;
import p.ub4;
import androidx.activity.b;

public final class sd2 extends k15	// class@002607 from classes.dex
{
    public final int d;
    public final Object e;

    public void sd2(int p0,Object p1,boolean p2){
       this.d = p0;
       this.e = p1;
       super(p2);
    }
    public void sd2(Fragment p0,int p1){
       this.d = p1;
       this.e = p0;
       super(true);
    }
    public void sd2(lg4 p0){
       this.d = 1;
       this.e = p0;
       super(false);
    }
    public final void a(){
       String str = "IN_APP_MESSAGING_FULLSCREEN_FRAGMENT_TAG";
       boolean b = true;
       vx5 boolean b1 = false;
       sd2 te = this.e;
       switch (this.d){
           case 0:
             te.x(b);
             if (te.h.a != null) {
                te.O();
             }else {
                te.g.b();
             }
             return;
             break;
           case 1:
             te.k();
             return;
           case 2:
             te.v().e(z9.a);
             return;
           case 3:
             x86 t = te.v().t;
             fh5 c = t.c;
             c.getClass();
             b1 = new vx5(c);
             ob7 c1 = new ob7();
             c1.c(b1.b);
             c1.b = b1.c.a;
             c1.d = new ib7(b, "ui_hide", "hit", new HashMap());
             t.b.b(c1.a());
             tu6.p(te).k();
             return;
           case 4:
             MainActivity a0 = te.a0;
             if (a0.e.D(str) != null) {
                a0.d();
             }else {
                b = false;
             }
             if (!b && !te.g0.f()) {
                te.finish();
             }
             return;
             break;
           case 5:
             te.I.b.a();
             this.b(b1);
             return;
           case 6:
             te.I.b.a();
             this.b(b1);
             return;
           case 7:
             te.H.b.a();
             this.b(b1);
             return;
           case 8:
             NowPlayingActivity x = te.X;
             if (x.e.D(str) != null) {
                x.d();
             }else {
                b = false;
             }
             if (!b) {
                te.S.onNext(new pm4());
             }
             return;
             break;
           case 9:
             te.J.b.a();
             this.b(b1);
             return;
           case 10:
             te.Y.onNext(new vb5());
             return;
           default:
             zm1 h = te.H;
             h.b.a();
             this.b(b1);
             return;
       }
    }
}
