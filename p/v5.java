package p.v5;
import p.x5;
import androidx.appcompat.widget.AppCompatImageView;
import p.w5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.CharSequence;
import p.eb3;
import p.u5;
import java.lang.Object;
import android.view.View$OnTouchListener;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import java.lang.Math;
import p.ce1;

public final class v5 extends AppCompatImageView implements x5	// class@00298a from classes.dex
{
    public final w5 t;

    public void v5(w5 p0,Context p1){
       this.t = p0;
       super(p1, null, 0x7f030023);
       this.setClickable(true);
       this.setFocusable(true);
       this.setVisibility(0);
       this.setEnabled(true);
       eb3.D(this, this.getContentDescription());
       this.setOnTouchListener(new u5(this, this, p0, 0));
    }
    public final boolean a(){
       return false;
    }
    public final boolean c(){
       return false;
    }
    public final boolean performClick(){
       if (super.performClick()) {
          return true;
       }
       this.playSoundEffect(0);
       this.t.l();
       return true;
    }
    public final boolean setFrame(int p0,int p1,int p2,int p3){
       boolean b = super.setFrame(p0, p1, p2, p3);
       Drawable background = this.getBackground();
       if (this.getDrawable() != null && background != null) {
          p1 = this.getWidth();
          p3 = this.getHeight();
          int i = Math.max(p1, p3) / 2;
          p1 = (p1 + (this.getPaddingLeft() - this.getPaddingRight())) / 2;
          p3 = (p3 + (this.getPaddingTop() - this.getPaddingBottom())) / 2;
          int i1 = p1 - i;
          int i2 = p3 - i;
          ce1.f(background, i1, i2, (p1 + i), (p3 + i));
       }
       return b;
    }
}
