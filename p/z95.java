package p.z95;
import p.wf2;
import p.gi3;
import com.spotify.liteplayer.player.npv.view.PeekScrollView;
import java.lang.Object;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.liteplayer.player.npv.view.FullScreenLayout;
import android.widget.LinearLayout;

public final class z95 extends gi3 implements wf2	// class@002eb2 from classes.dex
{
    public final int a;
    public final PeekScrollView b;

    public void z95(PeekScrollView p0,int p1){
       this.a = p1;
       this.b = p0;
       super(0);
    }
    public final Object invoke(){
       z95 tb = this.b;
       switch (this.a){
           case 0:
             return tb.findViewById(R.id.fullscreen_container);
           case 1:
             return tb.findViewById(R.id.peeking_widget_container);
           default:
             return tb.findViewById(R.id.root_container);
       }
    }
}
