package p.rm6;
import p.z;
import p.ac;
import p.ym6;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.ArrayList;
import p.w53;
import p.v55;
import p.vk7;
import p.ab3;
import p.jj4;
import java.lang.Class;
import p.kp3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LitePageViewNonAuth;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import p.cc1;
import java.lang.StackTraceElement;
import p.xm6;
import p.zf2;
import p.rv;
import java.lang.Runnable;

public final class rm6 extends z	// class@002519 from classes.dex
{
    public final int a;
    public final Object b;

    public void rm6(ac p0){
       this.a = 1;
       super();
       this.b = p0;
    }
    public void rm6(ym6 p0){
       this.a = 0;
       this.b = p0;
       super();
    }
    public final void onActivityPaused(Activity p0){
       rm6 tb = this.b;
       switch (this.a){
           case 0:
           default:
             if (p0 instanceof w53) {
                w53 ow53 = p0;
                v55 ov55 = ow53.h();
                tb.c(ov55, ow53.b());
             }
             if (p0 instanceof jj4) {
                p0.getClass();
                tb.getClass();
                kp3 okp3 = LitePageViewNonAuth.i();
                okp3.d("exit");
                okp3.c("lite/welcome");
                okp3.e("spotify:welcome");
                tb.a.a(okp3.build());
             }
             return;
       }
       co5.o(p0, "activity");
       tb.g.remove(p0);
       return;
    }
    public final void onActivityResumed(Activity p0){
       ym6 e;
       rm6 tb = this.b;
       switch (this.a){
           case 0:
             co5.o(p0, "activity");
             tb.g.add(p0);
             if ((e = tb.e) != null) {
                p0.runOnUiThread(new xm6(tb, new cc1(4, tb), e, ym6.a()));
             }
             break;
           default:
             if (p0 instanceof w53) {
                w53 ow53 = p0;
                v55 ov55 = ow53.h();
                tb.b(ov55, ow53.b());
             }
             if (p0 instanceof jj4) {
                p0.getClass();
                tb.getClass();
                kp3 okp3 = LitePageViewNonAuth.i();
                okp3.d("enter");
                okp3.c("lite/welcome");
                okp3.e("spotify:welcome");
                tb.a.a(okp3.build());
             }
             return;
       }
       tb.e = null;
       return;
    }
}
