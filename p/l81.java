package p.l81;
import androidx.fragment.app.d;
import androidx.fragment.app.v;
import p.ac0;
import p.mo6;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import p.af2;
import p.te2;
import android.transition.Transition;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class l81 extends d	// class@001d00 from classes.dex
{
    public final Object c;
    public final boolean d;
    public final Object e;

    public void l81(v p0,ac0 p1,boolean p2,boolean p3){
       super(p0, p1);
       p0 = p0.c;
       if (p0.a == mo6.b) {
          p1 = (p2)? p0.getReenterTransition(): p0.getEnterTransition();
          this.c = p1;
          boolean allowReturnT = (p2)? p0.getAllowReturnTransitionOverlap(): p0.getAllowEnterTransitionOverlap();
          this.d = allowReturnT;
       }else if(p2){
          p1 = p0.getReturnTransition();
       }else {
          p1 = p0.getExitTransition();
       }
       this.c = p1;
       this.d = true;
       if (p3) {
          this.e = (p2)? p0.getSharedElementReturnTransition(): p0.getSharedElementEnterTransition();
       }else {
          this.e = null;
       }
       return;
    }
    public final af2 c(Object p0){
       af2 b;
       if (p0 == null) {
          return null;
       }
       ye2 a = te2.a;
       if (p0 instanceof Transition) {
          return a;
       }
       if ((b = te2.b) != null && b.e(p0)) {
          return b;
       }
       throw new IllegalArgumentException("Transition "+p0+" for fragment "+this.a.c+" is not a valid framework Transition or AndroidX Transition");
    }
}
