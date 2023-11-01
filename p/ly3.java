package p.ly3;
import p.er5;
import com.spotify.lyrics.core.ui.LyricsRecyclerView;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p.vr5;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.zr5;
import java.lang.Class;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public final class ly3 extends er5	// class@001de9 from classes.dex
{
    public final LyricsRecyclerView a;
    public final Context b;

    public void ly3(LyricsRecyclerView p0,Context p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void f(Rect p0,View p1,RecyclerView p2,vr5 p3){
       zr5 ozr5;
       co5.o(p0, "outRect");
       co5.o(p1, "view");
       co5.o(p2, "parent");
       co5.o(p3, "state");
       super.f(p0, p1, p2, p3);
       int i = ((ozr5 = RecyclerView.M(p1)) != null)? ozr5.c(): -1;
       if (i > 0) {
          this.a.getClass();
          p0.top = (int)((float)16 * this.b.getResources().getDisplayMetrics().density);
       }
       return;
    }
}
