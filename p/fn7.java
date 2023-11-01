package p.fn7;
import p.z6;
import com.spotify.lite.welcome.WelcomeActivity;
import java.lang.Object;
import p.no7;
import p.xo7;
import p.gc7;
import java.lang.Class;
import p.y6;
import p.bo7;
import java.lang.String;
import android.content.Intent;
import p.mo7;
import p.ko7;
import android.content.Context;
import p.jo7;

public final class fn7 implements z6	// class@001602 from classes.dex
{
    public final int a;
    public final WelcomeActivity b;

    public void fn7(WelcomeActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void b(Object p0){
       fn7 tb = this.b;
       switch (this.a){
           case 0:
           case 1:
             if (p0 != null) {
                tb.W.A.onNext(p0);
             }else {
                tb.getClass();
             }
             return;
             break;
           default:
             tb.getClass();
             y6 b = p0.b;
             if ((p0 = p0.a) != 3 && b != null) {
                if (p0 == -1) {
                   if (b.getBooleanExtra("RESULT_FROM_SIGNUP", false)) {
                      tb.W.A.onNext(new mo7(2));
                   }else {
                      tb.W.A.onNext(new ko7(2));
                   }
                }
             }else {
                tb.W.A.onNext(new jo7(tb.getString(R.string.login_facebook_error)));
             }
             return;
       }
       tb.W.A.onNext(new bo7());
       return;
    }
}
