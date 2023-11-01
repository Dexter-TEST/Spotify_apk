package p.nk4;
import p.yf2;
import com.spotify.liteplayer.player.npv.NowPlayingActivity;
import java.lang.Object;
import p.jc7;
import p.qk4;
import android.widget.SeekBar;
import android.widget.ProgressBar;
import p.vm4;
import p.um4;

public final class nk4 implements yf2	// class@001ff6 from classes.dex
{
    public final int a;
    public final NowPlayingActivity b;

    public void nk4(NowPlayingActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       nk4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return new um4(tb.j0.A.getProgress());
       }
       return new vm4(tb.j0.A.getProgress());
    }
}
