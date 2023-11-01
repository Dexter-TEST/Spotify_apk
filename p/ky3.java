package p.ky3;
import p.q71;
import com.spotify.lyrics.core.ui.LyricsRecyclerView;
import p.zr5;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.hy3;
import p.by3;
import java.lang.Class;
import p.jl7;
import p.t00;

public final class ky3 extends q71	// class@001ca7 from classes.dex
{
    public final LyricsRecyclerView t;

    public void ky3(LyricsRecyclerView p0){
       this.t = p0;
       super();
    }
    public final void g(zr5 p0){
       LyricsRecyclerView b1;
       co5.o(p0, "viewHolder");
       if ((b1 = this.t.b1) != null) {
          hy3 b = b1.b;
          b.getClass();
          b.c.onNext(new jl7(0x3f800000));
          return;
       }else {
          co5.N("presenter");
          throw null;
       }
    }
}
