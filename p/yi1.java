package p.yi1;
import p.gr0;
import com.spotify.signup.signup.view.EmailView;
import java.lang.Object;
import p.qi1;
import p.si1;
import p.wh7;
import android.view.View;
import android.graphics.drawable.Drawable;
import p.dh7;
import android.content.Context;
import android.widget.TextView;
import com.spotify.signup.signup.util.TextFormUiUtil;
import p.pi1;
import p.ri1;

public final class yi1 implements gr0	// class@002dc1 from classes.dex
{
    public final int a;
    public final EmailView b;

    public void yi1(EmailView p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       yi1 tb = this.b;
       switch (this.a){
           case 0:
             TextFormUiUtil.clearAllDrawables(tb.a);
             dh7.q(tb.a, tb.c);
             tb.t.setText(R.string.email_message);
             return;
           case 1:
             dh7.q(tb.a, tb.c);
             TextFormUiUtil.addCheckboxTextDrawableRight(tb.getContext(), tb.a);
             tb.t.setText(R.string.email_message);
             return;
           case 2:
             EmailView.b(tb);
             return;
           default:
             EmailView.a(tb, p0);
             return;
       }
    }
}
