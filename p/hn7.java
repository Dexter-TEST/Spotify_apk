package p.hn7;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import com.spotify.litesignup.phonesignup.PhoneNumberSignupActivity;
import java.lang.String;
import p.n35;
import p.jc5;
import p.q35;
import p.an5;
import io.reactivex.rxjava3.core.Observer;
import p.mm0;
import p.lx3;
import p.rx3;
import androidx.fragment.app.o;
import androidx.fragment.app.Fragment;
import p.tk7;
import p.qw3;
import p.mw3;
import java.lang.Class;
import p.co5;
import p.dz3;
import p.g54;
import p.fz3;
import android.os.Bundle;
import android.os.BaseBundle;
import androidx.fragment.app.a;
import com.spotify.lite.welcome.WelcomeActivity;
import p.no7;
import p.xo7;
import p.gc7;
import p.ik5;
import p.hr0;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import com.spotify.messaging.inappmessagingsdk.preview.views.PreviewSubmissionView;
import p.dk5;

public final class hn7 implements View$OnClickListener	// class@00188a from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void hn7(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public final void onClick(View p0){
       hn7 tc = this.c;
       hn7 tb = this.b;
       switch (this.a){
           case 0:
             tb.W.A.onNext(tc);
             return;
           case 1:
             lx3 n = tb.N;
             o parentFragme = tb.getParentFragmentManager();
             tk7 a = tb.U.a;
             rx3 a1 = tc.a;
             qw3 w = a1.w;
             mw3 b = w.b;
             boolean b1 = (a1.b != 1)? true: false;
             n.getClass();
             co5.o(parentFragme, "fragmentManager");
             co5.o(a, "trackUri");
             co5.o(b, "provider");
             mw3 a2 = w.a;
             co5.o(a2, "providerLyricsId");
             g54 a3 = n.a;
             co5.o(a3, "fragmentProvider");
             Bundle uBundle = new Bundle();
             uBundle.putString("lyrics_track_report_uri", a);
             uBundle.putString("lyrics_track_report_provider", b);
             uBundle.putString("lyrics_track_report_provider_lyrics_id", a2);
             uBundle.putBoolean("lyrics_track_report_provider_synced_value", b1);
             dz3 uodz3 = a3.a();
             uodz3.setArguments(uBundle);
             a uoa = new a(parentFragme);
             uoa.g(0, uodz3, dz3.class.getSimpleName(), 1);
             uoa.e(0);
             return;
             break;
           case 2:
             tb.onNext(tc);
             return;
           case 3:
             tb.Y.onNext(new jc5(new n35(tc)));
             return;
           default:
             tc.accept(new dk5(tb.c.getTriggerType(), tb.c.getCreativeId()));
             return;
       }
    }
}
