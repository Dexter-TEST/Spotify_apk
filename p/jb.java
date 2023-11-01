package p.jb;
import p.xz4;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import java.lang.Object;
import p.wa;
import java.lang.String;
import p.co5;
import android.os.Bundle;
import p.g46;
import java.lang.Integer;
import p.e46;
import p.f46;
import p.aw1;
import androidx.fragment.app.o;
import p.bo5;
import com.spotify.allboarding.contextualaudio.presentation.ContextualAudioFragment;
import p.vt0;
import p.m26;
import androidx.lifecycle.b;
import p.s46;
import p.o46;
import p.ll1;
import p.x12;
import java.util.List;
import p.ne4;
import android.os.Parcelable;
import p.h46;
import p.i46;
import p.k46;
import p.l46;
import p.m46;
import p.lg4;
import p.gg4;
import p.zf2;
import p.q46;
import p.cd2;

public final class jb implements xz4	// class@001aa7 from classes.dex
{
    public final AllboardingActivity a;

    public void jb(AllboardingActivity p0){
       this.a = p0;
       super();
    }
    public final void b(Object p0){
       gg4 ogg4;
       f46 a;
       AllboardingActivity y = this.a.Y;
       Integer integer = null;
       if (y != null) {
          p0 = p0.c;
          co5.o(p0, "screen");
          Bundle uBundle = new Bundle();
          if (p0 instanceof g46) {
             p0 = Integer.valueOf(R.id.error);
          }else if(p0 instanceof e46){
             p0 = Integer.valueOf(R.id.allboarding_fragment);
          }else {
             String str = "allboarding-screen-arg";
             if (p0 instanceof f46) {
                o x = y.b.x;
                if (x instanceof bo5) {
                }else {
                   x = integer;
                }
                if (x != null) {
                   if ((a = p0.a) == null) {
                      a = "";
                   }
                   vt0 ovt0 = x.u();
                   vt0 t = ovt0.t;
                   t.e(a, "MIX_ID");
                   vt0 x1 = ovt0.x;
                   s46 os46 = x1.e();
                   o46 a1 = (os46 instanceof o46)? os46.a: ll1.a;
                   x12 a2 = ovt0.w.a;
                   boolean b = (t.b("MIX_ID") != null)? true: false;
                   x1.l(new o46(a1, a2, b));
                }
                uBundle.putParcelable(str, p0);
                p0 = Integer.valueOf(R.id.contextual_audio);
             }else if(co5.c(p0, h46.a)){
                p0 = Integer.valueOf(R.id.loading);
             }else if(co5.c(p0, i46.a)){
                p0 = Integer.valueOf(R.id.notification_permission);
             }else if(p0 instanceof k46){
                if (p0 instanceof l46) {
                   uBundle.putParcelable(str, p0);
                   p0 = Integer.valueOf(R.id.summary);
                }else if(co5.c(p0, m46.a)){
                   throw new cd2(10);
                }
             }
             p0 = integer;
          }
          if (p0 != null) {
             Integer integer1 = ((ogg4 = y.a.e()) != null)? Integer.valueOf(ogg4.y): integer;
             if (integer1 == null || (integer1.intValue() != 0x7f0a05bc && (integer1 == null || integer1.intValue() != 0x7f0a0561))) {
                if ((ogg4 = y.a.e()) != null) {
                   integer = Integer.valueOf(ogg4.y);
                }
                if (!co5.c(integer, p0)) {
                   y.a.i(p0.intValue(), uBundle);
                }
             }
          }else {
             y.c.invoke(q46.a);
          }
          return;
       }else {
          co5.N("stepNavigator");
          throw integer;
       }
    }
}
