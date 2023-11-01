package p.en7;
import p.ir0;
import com.spotify.lite.welcome.WelcomeActivity;
import java.lang.Object;
import java.lang.Long;
import p.p25;
import androidx.viewpager2.widget.ViewPager2;
import p.yq5;
import p.jc7;
import p.io7;
import p.xo7;
import p.gc7;
import p.go7;
import android.content.Intent;
import android.app.Activity;

public final class en7 implements ir0	// class@0014c2 from classes.dex
{
    public final int a;
    public final WelcomeActivity b;

    public void en7(WelcomeActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       en7 tb = this.b;
       switch (this.a){
           case 0:
             tb.W.A.onNext(new go7());
             return;
           case 1:
             tb.W.A.onNext(new io7());
             return;
           case 2:
             if ((p0 = tb.Z.m.getAdapter()) != null && p0.d()) {
                p25 m = tb.Z.m;
                m.setCurrentItem(((m.getCurrentItem() + 1) % p0.d()));
             }
             return;
             break;
           default:
             tb.startActivity(p0);
             return;
       }
    }
}
