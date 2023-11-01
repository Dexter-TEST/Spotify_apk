package p.x95;
import android.view.View$OnLayoutChangeListener;
import com.spotify.liteplayer.player.npv.view.PeekScrollView;
import java.lang.Object;
import android.view.View;
import android.widget.FrameLayout;

public final class x95 implements View$OnLayoutChangeListener	// class@002c34 from classes.dex
{
    public final int a;
    public final PeekScrollView b;

    public void x95(PeekScrollView p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       x95 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.w = p4;
             tb.c(PeekScrollView.a(tb), tb.w);
             return;
       }
       tb.w = p4;
       tb.c(PeekScrollView.a(tb), tb.w);
       return;
    }
}
