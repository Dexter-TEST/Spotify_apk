package p.hb;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import java.lang.Object;
import p.lg4;
import p.gg4;
import java.lang.String;
import p.co5;
import p.nb;
import p.b65;

public final class hb	// class@00181f from classes.dex
{
    public final AllboardingActivity a;

    public void hb(AllboardingActivity p0){
       this.a = p0;
       super();
    }
    public final void a(lg4 p0,gg4 p1){
       co5.o(p0, "<anonymous parameter 0>");
       co5.o(p1, "destination");
       AllboardingActivity u = this.a.U;
       nb onb = null;
       if (u != null) {
          int i = ((p1 = p1.y) == 0x7f0a0405 || p1 == 0x7f0a05bc)? 1: 0;
          if (!i) {
             if (p1 == 0x7f0a0071) {
                onb = nb.c;
             }else if(p1 == 0x7f0a0561){
                onb = nb.t;
             }else if(p1 == 0x7f0a04c8){
                onb = nb.w;
             }else {
                onb = nb.x;
             }
          }
          if (onb != null) {
             u.a(onb);
          }
          return;
       }else {
          co5.N("pageViewEventDispatcher");
          throw onb;
       }
    }
}
