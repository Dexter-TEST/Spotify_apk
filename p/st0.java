package p.st0;
import p.xz4;
import com.spotify.allboarding.contextualaudio.presentation.ContextualAudioFragment;
import java.lang.Object;
import p.s46;
import p.o46;
import java.lang.String;
import p.co5;
import p.i77;
import com.spotify.allboarding.uiusecases.contentstack.ContentStackView;
import android.view.View;
import com.spotify.encoremobile.facepile.FacePileView;
import p.r61;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;
import java.util.ArrayList;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import p.gs0;
import p.ey1;
import p.fy1;
import com.spotify.encoremobile.buttons.PrimaryButtonView;
import p.qt0;
import p.l5;
import com.spotify.encoremobile.buttons.TertiaryButtonView;
import p.fc1;
import android.os.Bundle;
import p.p46;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import p.eb3;

public final class st0 implements xz4	// class@002693 from classes.dex
{
    public final ContextualAudioFragment a;

    public void st0(ContextualAudioFragment p0){
       this.a = p0;
       super();
    }
    public final void b(Object p0){
       i77 b;
       ContextualAudioFragment t;
       ContextualAudioFragment c;
       int i = 0;
       st0 ta = this.a;
       if (p0 instanceof o46) {
          co5.l(p0, "state");
          ContextualAudioFragment x = ta.x;
          co5.i(x);
          String str = "imageLoader";
          void ovoid = null;
          o46 a = p0.a;
          if (p0.b != null) {
             x.b.setVisibility(i);
             x.d.setVisibility(4);
             b = x.b;
             if ((t = ta.t) != null) {
                if ((c = ta.c) != null) {
                   b.d(t, c, a);
                }else {
                   co5.N("scheduler");
                   throw ovoid;
                }
             }else {
                co5.N(str);
                throw ovoid;
             }
          }else {
             x.d.setVisibility(i);
             x.b.setVisibility(4);
             b = x.d;
             if ((t = ta.t) != null) {
                ArrayList uArrayList = new ArrayList(aj0.b0(a));
                Iterator iterator = a.iterator();
                while (iterator.hasNext()) {
                   uArrayList.add(new ey1(iterator.next().a, ""));
                }
                b.a(t, new fy1(uArrayList));
             }else {
                co5.N(str);
                throw ovoid;
             }
          }
          if (p0.c != null) {
             p0 = ta.x;
             co5.i(p0);
             p0 = p0.e;
             co5.l(p0, "binding.primaryButton");
             co5.a(p0, new qt0(ta, i));
             p0 = ta.x;
             co5.i(p0);
             p0 = p0.f;
             co5.l(p0, "binding.secondaryButton");
             co5.a(p0, new qt0(ta, 1));
          }else {
             x.e.setVisibility(4);
             x.f.setVisibility(4);
          }
       }else if(co5.c(p0, fc1.a)){
          p0 = new Bundle();
          p0.putParcelable("ALLBOARDING_SCREEN_RESPONSE", new p46(i, 3));
          eb3.y(p0, ta);
       }
       return;
    }
}
