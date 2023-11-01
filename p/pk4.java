package p.pk4;
import p.ir0;
import p.t67;
import java.lang.Object;
import p.jc7;
import com.spotify.liteplayer.player.npv.NowPlayingActivity;
import com.spotify.liteplayer.player.npv.view.PeekScrollView;
import java.lang.Boolean;
import p.az5;
import android.widget.ScrollView;

public final class pk4 implements ir0	// class@00227c from classes.dex
{
    public final int a;
    public final t67 b;

    public void pk4(t67 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       pk4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             p0 = tb.y;
             p0.x.t(p0, 0);
             return;
       }
       tb.y.d();
       return;
    }
}
