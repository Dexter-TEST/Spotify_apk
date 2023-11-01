package p.mf;
import android.widget.CheckedTextView;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import p.eb3;
import android.content.res.ColorStateList;
import p.ce1;
import android.graphics.PorterDuff$Mode;
import android.view.View;

public final class mf	// class@001e89 from classes.dex
{
    public final CheckedTextView a;
    public ColorStateList b;
    public PorterDuff$Mode c;
    public boolean d;
    public boolean e;
    public boolean f;

    public void mf(CheckedTextView p0){
       super();
       this.b = null;
       this.c = null;
       this.d = false;
       this.e = false;
       this.a = p0;
    }
    public final void a(){
       Drawable checkMarkDra;
       mf ta = this.a;
       if ((checkMarkDra = ta.getCheckMarkDrawable()) != null && (this.d != null && this.e == null)) {
          checkMarkDra = eb3.L(checkMarkDra).mutate();
          if (this.d != null) {
             ce1.h(checkMarkDra, this.b);
          }
          if (this.e != null) {
             ce1.i(checkMarkDra, this.c);
          }
          if (checkMarkDra.isStateful()) {
             checkMarkDra.setState(ta.getDrawableState());
          }
          ta.setCheckMarkDrawable(checkMarkDra);
       }
       return;
    }
}
