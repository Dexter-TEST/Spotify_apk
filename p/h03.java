package p.h03;
import p.i03;
import p.c33;
import p.zk2;
import p.ju2;
import p.uu2;
import p.bt2;
import p.qz5;
import p.k03;
import android.content.Context;
import android.view.ViewGroup;
import p.xz5;
import p.tu2;
import java.lang.String;
import p.au2;
import java.lang.CharSequence;
import p.eo5;
import android.text.TextUtils;
import p.b06;
import android.widget.TextView;
import p.o85;
import p.xj0;

public final class h03 extends i03	// class@0017b4 from classes.dex
{

    public void h03(c33 p0){
       super(p0, false, false);
    }
    public final void e(zk2 p0,ju2 p1,uu2 p2,bt2 p3){
       this.h(p0, p1, p2);
    }
    public final zk2 f(Context p0,ViewGroup p1,uu2 p2){
       return this.j(p0, p1);
    }
    public final void g(qz5 p0,ju2 p1){
       this.i(p0, p1);
    }
    public final void i(xz5 p0,ju2 p1){
       super.i(p0, p1);
       CharSequence uCharSequenc = eo5.y(p1.y().j(), p1.b().y("glue:accessoryAsHtml", false));
       if (!TextUtils.isEmpty(uCharSequenc)) {
          p0.w.setText(uCharSequenc);
       }
       return;
    }
    public final qz5 j(Context p0,ViewGroup p1){
       return this.k(p0, p1);
    }
    public final xz5 k(Context p0,ViewGroup p1){
       b06 uob06 = new b06(xj0.x0(p0, p1, R.layout.glue_listtile_2_landscape_image));
       eo5.P(uob06);
       return uob06;
    }
}
