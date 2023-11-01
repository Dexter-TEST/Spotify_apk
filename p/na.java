package p.na;
import p.xz4;
import p.eh2;
import com.spotify.allboarding.allboardingimpl.mobius.AllBoardingFragment;
import java.lang.Object;
import p.gh2;
import java.lang.Class;
import java.lang.String;
import p.wa;
import p.co5;
import p.ls6;
import p.l46;
import p.nb;
import p.b65;
import java.util.Iterator;
import java.lang.Iterable;
import p.p55;
import p.n46;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.view.ViewGroup;
import p.e46;

public final class na implements xz4, eh2	// class@001fa0 from classes.dex
{
    public final AllBoardingFragment a;

    public void na(AllBoardingFragment p0){
       this.a = p0;
       super();
    }
    public final gh2 a(){
       gh2 v6 = new gh2(1, this.a, AllBoardingFragment.class, "render", "render\(Lcom/spotify/allboarding/allboardingimpl/mobius/models/AllBoardingState;\)V");
       return v6;
    }
    public final void b(Object p0){
       AllBoardingFragment v;
       wa c;
       co5.o(p0, "p0");
       na ta = this.a;
       ta.u();
       void ovoid = null;
       if (p0.b.c instanceof l46) {
          if ((v = ta.v) != null) {
             v.a(nb.v);
          }else {
             co5.N("pageViewEventDispatcher");
             throw ovoid;
          }
       }
       if ((v = ta.x) != null) {
          Iterator iterator = v.iterator();
          while (true) {
             c = p0.c;
             if (iterator.hasNext()) {
                p55 op55 = iterator.next();
                if (op55.c(c)) {
                   View view = ta.getView();
                   co5.j(view, "null cannot be cast to non-null type android.view.ViewGroup");
                   op55.d(c, op55.a(view));
                }else {
                   op55.remove();
                }
             }else {
                break ;
             }
          }
          ta.u();
          if (ta.y != null && c instanceof e46) {
             ta.u();
             ta.y = false;
          }
          return;
       }else {
          co5.N("pages");
          throw ovoid;
       }
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof xz4 && p0 instanceof eh2)? co5.c(this.a(), p0.a()): false;
       return b;
    }
    public final int hashCode(){
       return this.a().e();
    }
}
