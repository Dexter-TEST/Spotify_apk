package p.g50;
import p.b50;
import android.widget.FrameLayout;
import p.xp7;
import android.os.Build$VERSION;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p.q24;
import p.p24;
import p.wh7;
import android.content.res.ColorStateList;
import p.jh7;
import p.lj0;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import p.h50;

public final class g50 extends b50	// class@00169f from classes.dex
{
    public final boolean a;
    public final boolean b;
    public final xp7 c;

    public void g50(FrameLayout p0,xp7 p1){
       BottomSheetBehavior i;
       int defaultColor;
       super();
       this.c = p1;
       boolean b = true;
       boolean b1 = (Build$VERSION.SDK_INT >= 23 && ((p0.getSystemUiVisibility() & 0x2000)))? true: false;
       this.b = b1;
       p24 c = ((i = BottomSheetBehavior.z(p0).i) != null)? i.a.c: jh7.g(p0);
       if (c != null) {
          if (!(defaultColor = c.getDefaultColor()) || (0x3fe0000000000000 - lj0.d(defaultColor)) <= 0) {
             b = false;
          }
          this.a = b;
       }else if(p0.getBackground() instanceof ColorDrawable){
          if (!(defaultColor = p0.getBackground().getColor()) || (0x3fe0000000000000 - lj0.d(defaultColor)) <= 0) {
             b = false;
          }
          this.a = b;
       }else {
          this.a = b1;
       }
       return;
    }
    public final void a(View p0){
       this.c(p0);
    }
    public final void b(View p0,int p1){
       this.c(p0);
    }
    public final void c(View p0){
       int systemUiVisi;
       g50 tc = this.c;
       int i = 23;
       if (p0.getTop() < tc.d()) {
          if (Build$VERSION.SDK_INT >= i) {
             systemUiVisi = p0.getSystemUiVisibility();
             systemUiVisi = (this.a != null)? systemUiVisi | 0x2000: systemUiVisi & 0xdfff;
             p0.setSystemUiVisibility(systemUiVisi);
          }
          p0.setPadding(p0.getPaddingLeft(), (tc.d() - p0.getTop()), p0.getPaddingRight(), p0.getPaddingBottom());
       }else if(p0.getTop()){
          if (Build$VERSION.SDK_INT >= i) {
             systemUiVisi = p0.getSystemUiVisibility();
             systemUiVisi = (this.b != null)? systemUiVisi | 0x2000: systemUiVisi & 0xdfff;
             p0.setSystemUiVisibility(systemUiVisi);
          }
          p0.setPadding(p0.getPaddingLeft(), 0, p0.getPaddingRight(), p0.getPaddingBottom());
       }
       return;
    }
}
