package p.dz6;
import android.view.View$OnLayoutChangeListener;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import p.cl;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import p.co5;
import p.oi;
import p.ez6;
import android.view.Choreographer;
import p.rl5;
import android.view.Choreographer$FrameCallback;

public final class dz6 implements View$OnLayoutChangeListener	// class@0013ea from classes.dex
{
    public final int a;
    public final View b;
    public final Object c;

    public void dz6(ArtworkView p0,cl p1){
       this.a = 1;
       this.b = p0;
       this.c = p1;
       super();
    }
    public void dz6(Object p0,View p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       dz6 tc = this.c;
       dz6 tb = this.b;
       switch (this.a){
           case 0:
             if (!tb.getVisibility()) {
                tc.d(tb);
             }
             return;
             break;
           case 1:
           default:
             tb.removeOnLayoutChangeListener(this);
             Choreographer.getInstance().postFrameCallback(new rl5(2, this));
             return;
       }
       co5.o(p0, "view");
       p0.removeOnLayoutChangeListener(this);
       tb.d(tc);
       return;
    }
}
