package p.ih7;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.View;
import p.j15;
import java.lang.Object;
import android.view.WindowInsets;
import p.xp7;
import android.os.Build$VERSION;
import p.jh7;
import p.wh7;
import p.hh7;

public final class ih7 implements View$OnApplyWindowInsetsListener	// class@001997 from classes.dex
{
    public xp7 a;
    public final View b;
    public final j15 c;

    public void ih7(View p0,j15 p1){
       this.b = p0;
       this.c = p1;
       super();
       this.a = null;
    }
    public WindowInsets onApplyWindowInsets(View p0,WindowInsets p1){
       xp7 oxp7 = xp7.g(p1, p0);
       int sDK_INT = Build$VERSION.SDK_INT;
       ih7 tc = this.c;
       if (sDK_INT < 30) {
          jh7.a(p1, this.b);
          if (oxp7.equals(this.a)) {
             return tc.m(p0, oxp7).f();
          }
       }
       this.a = oxp7;
       xp7 oxp71 = tc.m(p0, oxp7);
       if (sDK_INT >= 30) {
          return oxp71.f();
       }else {
          hh7.c(p0);
          return oxp71.f();
       }
    }
}
