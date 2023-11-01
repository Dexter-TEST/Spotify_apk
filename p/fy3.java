package p.fy3;
import p.ir0;
import p.dx3;
import java.lang.Object;
import p.kw3;
import com.spotify.lyrics.core.ui.LyricsRecyclerView;
import p.dq2;
import java.lang.String;
import p.co5;
import p.z46;
import java.lang.Class;
import p.b56;
import p.q87;

public final class fy3 implements ir0	// class@001660 from classes.dex
{
    public final int a;
    public final dx3 b;

    public void fy3(dx3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       LyricsRecyclerView c1;
       String str = "p0";
       fy3 tb = this.b;
       switch (this.a){
           case 0:
             co5.o(p0, str);
             tb.getClass();
             if ((c1 = tb.c1) != null) {
                boolean b = false;
                z46 a = p0.a;
                if ((p0 = p0.b) == true) {
                   c1.e(a, b);
                }else if(p0 == null){
                   if (c1.c == null || (c1.f == null || !c1.d(a))) {
                      b = true;
                   }
                   if (b) {
                      c1.e(a, true);
                   }
                }
                return;
             }else {
                co5.N("scroller");
                throw null;
             }
             break;
           case 1:
             co5.o(p0, str);
             tb.t0(p0);
             return;
           case 2:
             tb.r0(p0.c, p0.b);
             return;
           default:
             co5.o(p0, str);
             tb.s0(p0);
             return;
       }
    }
}
