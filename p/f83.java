package p.f83;
import p.ir0;
import p.j83;
import java.lang.Object;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragmentBuilder;
import java.lang.Class;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.FormatType;
import androidx.fragment.app.a;
import androidx.fragment.app.o;
import android.view.View;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment;
import androidx.fragment.app.Fragment;
import java.lang.String;
import java.util.Set;
import java.util.Collections;
import java.lang.Boolean;
import p.ik5;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import p.ja3;
import java.lang.Runnable;
import p.tj5;
import p.sb4;
import p.xo0;
import p.bv;
import p.zq7;

public final class f83 implements ir0	// class@00157a from classes.dex
{
    public final int a;
    public final j83 b;

    public void f83(j83 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       a uoa;
       f83 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             j83 h = tb.h;
             j83 f = tb.f;
             f.getClass();
             ik5 oik5 = new ik5(h.getContext());
             new Handler(h.getContext().getMainLooper()).post(new ja3(h, 15, oik5));
             tj5 a = f.a;
             a.a(oik5);
             bv uobv = a.c();
             uobv.getClass();
             zq7 ozq7 = new zq7(uobv);
             ozq7.a = Boolean.valueOf(p0.booleanValue());
             a.e(ozq7.i());
             a.f();
             return;
       }
       tb.getClass();
       j83 e = tb.e;
       if (FormatType.FULLSCREEN == p0.getFormat() && tb.h != null) {
          e.getClass();
          uoa = new a(e);
          uoa.k(tb.h.getId(), p0.build(), "IN_APP_MESSAGING_FULLSCREEN_FRAGMENT_TAG");
          uoa.e(false);
       }else if(FormatType.BANNERS == p0.getFormat() && tb.i != null){
          e.getClass();
          uoa = new a(e);
          uoa.k(tb.i.getId(), p0.build(), "IN_APP_MESSAGING_BANNER_FRAGMENT_TAG");
          uoa.e(false);
       }else {
          p0.build().discardMessage(Collections.singleton("FORMAT NOT AVAILABLE"));
       }
       return;
    }
}
