package p.jm7;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import p.lh5;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import p.uu2;
import p.cu2;
import p.dt5;
import java.lang.String;
import p.ju2;
import p.m73;
import p.du2;
import p.gb0;
import p.o11;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import p.rk2;
import p.ym7;
import java.lang.Class;
import android.webkit.WebView;
import p.ea1;
import p.co5;
import p.rm7;
import p.a84;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class jm7 implements View$OnClickListener	// class@001b08 from classes.dex
{
    public final int a;
    public final Object b;

    public void jm7(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onClick(View p0){
       String str = "this$0";
       jm7 tb = this.b;
       switch (this.a){
           case 0:
             co5.o(tb, str);
             tb.cancel();
             return;
           case 1:
             co5.o(tb, str);
             tb.F();
             return;
           case 2:
             tb.getClass();
             p0.setEnabled(false);
             tb.c.reload();
             return;
           case 3:
             tb.a();
             return;
           case 4:
             GlueToolbarLayout.a(tb, p0);
             return;
           case 5:
             tb.I.onCancel();
             return;
           case 6:
             lh5 a = tb.a;
             lh5 d = tb.d;
             if (a.getMaxLines() == d) {
                d = Integer.MAX_VALUE;
             }
             lh5 e = (a.getEllipsize() == null)? tb.e: null;
             a.setMaxLines(d);
             a.setEllipsize(e);
             tb.c.c.a(new cu2("layoutChange", tb.f, dt5.x));
             return;
             break;
           default:
             tb.getActivity().finish();
             return;
       }
    }
}
