package p.pk2;
import p.j15;
import p.rk2;
import androidx.fragment.app.k;
import java.lang.Object;
import android.view.View;
import p.xp7;
import java.lang.Class;
import android.content.res.Resources;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import p.vp7;

public final class pk2 implements j15	// class@00227a from classes.dex
{
    public final rk2 a;
    public final Context b;

    public void pk2(rk2 p0,k p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final xp7 m(View p0,xp7 p1){
       rk2 w;
       pk2 ta = this.a;
       ta.getClass();
       p0.setPadding(p0.getPaddingLeft(), (p1.d() + p0.getPaddingTop()), p0.getPaddingRight(), p0.getPaddingBottom());
       if ((w = ta.w) != null) {
          w.topMargin = p1.d() + this.b.getResources().getDimensionPixelSize(R.dimen.context_menu_landscape_exit_button_margin_top);
       }
       return p1.a.c();
    }
}
