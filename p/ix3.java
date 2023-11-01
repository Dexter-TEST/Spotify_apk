package p.ix3;
import android.view.View$OnClickListener;
import p.lx3;
import java.lang.Object;
import android.view.View;
import p.x55;
import java.lang.Class;
import p.an4;
import p.mn4;
import p.sm4;
import p.dn4;
import p.cn4;
import p.qm4;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import p.xx3;
import com.spotify.liteplayer.player.npv.NowPlayingActivity;
import p.o11;
import p.an5;
import p.jc7;
import p.vf;
import p.ac;
import p.ab3;
import p.wo3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInteraction;
import java.lang.String;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import androidx.fragment.app.f;
import p.nm4;

public final class ix3 implements View$OnClickListener	// class@001a21 from classes.dex
{
    public final int a;
    public final lx3 b;

    public void ix3(lx3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       x55 p = x55.P;
       ix3 tb = this.b;
       switch (this.a){
           case 0:
             vf b = tb.M.b;
             b.getClass();
             wo3 owo3 = LiteInteraction.l();
             owo3.f("lite/now-playing-view/lyrics-fullscreen");
             owo3.h("spotify:undefined");
             owo3.g("spotify:undefined");
             owo3.d("hit");
             owo3.c("close-dialog");
             owo3.e("lyrics_full_screen_close");
             b.a.a(owo3.build());
             tb.v(false, false);
             return;
           case 1:
             tb.requireActivity().g0.w.onNext(jc7.a);
             return;
           case 2:
             tb.getClass();
             tb.D(new qm4(p));
             return;
           case 3:
             tb.getClass();
             tb.D(new cn4(p));
             return;
           case 4:
             tb.getClass();
             tb.D(new dn4(p));
             return;
           case 5:
             tb.getClass();
             tb.D(new sm4(p));
             return;
           case 6:
             tb.getClass();
             tb.D(new an4(p));
             return;
           default:
             tb.getClass();
             tb.D(new nm4(p));
             return;
       }
    }
}
