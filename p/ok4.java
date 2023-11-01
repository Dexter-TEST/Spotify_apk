package p.ok4;
import p.yf2;
import p.ad6;
import java.lang.Object;
import p.v46;
import com.spotify.liteplayer.player.npv.NowPlayingActivity;
import com.spotify.lyrics.core.ui.LyricsRecyclerView;
import android.view.View;
import java.lang.Boolean;
import android.widget.LinearLayout;

public final class ok4 implements yf2	// class@00213a from classes.dex
{
    public final int a;
    public final ad6 b;

    public void ok4(ad6 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       boolean b = false;
       ok4 tb = this.b;
       switch (this.a){
           case 0:
             if (p0.a >= tb.c.getHeight()) {
                b = true;
             }
             break;
           default:
             if ((((float)tb.k.getHeight() * 0x3f000000) - (float)p0.a) >= 0) {
                b = true;
             }
             return Boolean.valueOf(b);
       }
       return Boolean.valueOf(b);
    }
}
