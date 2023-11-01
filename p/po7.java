package p.po7;
import p.ir0;
import p.ro7;
import java.lang.Object;
import p.ln7;
import com.spotify.lite.welcome.WelcomeActivity;
import android.content.Context;
import java.lang.String;
import android.content.Intent;
import p.xj0;
import p.i7;
import p.zn7;
import java.lang.Class;
import java.lang.CharSequence;
import android.widget.Toast;
import p.xn7;
import p.rz;
import android.view.View;
import androidx.appcompat.app.a;
import p.mm6;
import android.content.res.Resources;
import p.hn7;
import android.view.View$OnClickListener;
import p.gg1;
import p.un7;
import java.lang.Integer;

public final class po7 implements ir0	// class@0022a1 from classes.dex
{
    public final int a;
    public final ro7 b;

    public void po7(ro7 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       WelcomeActivity a0;
       int i = 0;
       po7 tb = this.b;
       switch (this.a){
           case 0:
             p0 = p0.M;
             if ((a0 = tb.a0) != null) {
                a0.a(3);
             }
             View view = tb.findViewById(R.id.content);
             mm6 omm6 = mm6.f(0xea60, view, view.getResources().getText(R.string.login_smartlock_failed));
             tb.a0 = omm6;
             omm6.g(omm6.b.getText(R.string.login_smartlock_failed_retry), new hn7(tb, i, p0));
             tb.U.getClass();
             gg1.g(tb.a0);
             tb.a0.i();
             return;
             break;
           case 1:
             tb.getClass();
             Toast.makeText(tb, p0.M, i).show();
             return;
           case 2:
             tb.d0.a(xj0.z0(tb, "spotify.intent.action.CONTINUE_WITH_FACEBOOK"));
             return;
           default:
             tb.c0.a(Integer.valueOf(4));
             return;
       }
    }
}
