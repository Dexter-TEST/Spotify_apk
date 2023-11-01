package p.r33;
import p.y46;
import com.spotify.hubs.liteintegration.HubsView;
import android.view.View;
import java.lang.Object;
import java.lang.Math;

public final class r33 implements y46	// class@00246a from classes.dex
{
    public final HubsView a;
    public final View b;

    public void r33(HubsView p0,View p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(float p0){
       HubsView w;
       if ((w = this.a.w) != null) {
          w.a(p0);
       }
       this.b.setAlpha(Math.max(0x3f333333, (0x3f800000 - p0)));
       return;
    }
}
