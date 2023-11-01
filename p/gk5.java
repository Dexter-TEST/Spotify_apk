package p.gk5;
import p.gr0;
import p.hk5;
import java.lang.Object;
import p.tc1;
import p.ik5;
import android.view.View;
import com.spotify.messaging.inappmessagingsdk.preview.views.PreviewSubmissionView;
import android.content.Context;
import java.lang.String;
import android.view.inputmethod.InputMethodManager;
import p.sc1;
import p.rc1;

public final class gk5 implements gr0	// class@001727 from classes.dex
{
    public final int a;
    public final hk5 b;

    public void gk5(hk5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       int i = 0;
       gk5 tb = this.b;
       switch (this.a){
           case 0:
             p0 = tb.t;
             p0.a.setVisibility(8);
             p0.c.setVisibility(8);
             p0.b.setVisibility(i);
             p0.c.a();
             return;
           case 1:
             p0 = tb.t;
             p0.a.setVisibility(8);
             p0.b.setVisibility(8);
             p0.c.setVisibility(i);
             p0 = p0.c;
             p0.a.requestFocus();
             p0.getContext().getSystemService("input_method").showSoftInput(p0.a, 1);
             return;
           default:
             p0 = tb.t;
             p0.b.setVisibility(8);
             p0.c.setVisibility(8);
             p0.a.setVisibility(i);
             p0.c.a();
             return;
       }
    }
}
