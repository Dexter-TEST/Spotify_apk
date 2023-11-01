package p.m85;
import p.gr0;
import com.spotify.signup.signup.view.PasswordView;
import java.lang.Object;
import p.g85;
import p.h85;
import android.widget.TextView;
import com.spotify.signup.signup.util.TextFormUiUtil;
import p.wh7;
import android.view.View;
import android.graphics.drawable.Drawable;
import p.dh7;
import p.e85;
import p.f85;

public final class m85 implements gr0	// class@001e46 from classes.dex
{
    public final int a;
    public final PasswordView b;

    public void m85(PasswordView p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       m85 tb = this.b;
       switch (this.a){
           case 0:
             TextFormUiUtil.clearAllDrawables(tb.a);
             dh7.q(tb.a, tb.c);
             tb.t.setVisibility(0);
             tb.t.setText(R.string.password_message);
             return;
           case 1:
             TextFormUiUtil.clearAllDrawables(tb.a);
             dh7.q(tb.a, tb.c);
             tb.t.setVisibility(4);
             return;
           case 2:
             PasswordView.a(tb);
             return;
           default:
             PasswordView.b(tb, p0);
             return;
       }
    }
}
