package p.yk7;
import p.j15;
import p.e67;
import p.zn;
import java.lang.Object;
import android.view.View;
import p.xp7;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p.wh7;
import p.eh7;
import p.aa3;
import p.vp7;

public final class yk7 implements j15	// class@002dd9 from classes.dex
{
    public final e67 a;
    public final zn b;

    public void yk7(e67 p0,zn p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final xp7 m(View p0,xp7 p1){
       yk7 tb = this.b;
       zn a = tb.a;
       zn c = tb.c;
       zn d = tb.d;
       yk7 ta = this.a;
       ta.c.s = p1.d();
       int i = 1;
       if (eh7.d(p0) == i) {
       }else {
          i = 0;
       }
       int paddingBotto = p0.getPaddingBottom();
       int paddingLeft = p0.getPaddingLeft();
       int paddingRight = p0.getPaddingRight();
       e67 c1 = ta.c;
       if (c1.n != null) {
          c1.r = p1.a();
          paddingBotto = ta.c.r + d;
       }
       if (ta.c.o != null) {
          d = (i)? c: a;
          paddingLeft = p1.b() + d;
       }
       if (ta.c.p != null) {
          if (!i) {
             a = c;
          }
          paddingRight = p1.c() + a;
       }
       p0.setPadding(paddingLeft, p0.getPaddingTop(), paddingRight, paddingBotto);
       if (ta.b != null) {
          p0.l = p1.a.g().d;
       }
       e67 c2 = ta.c;
       if (c2.n != null || ta.b != null) {
          c2.N();
       }
       return p1;
    }
}
