package p.yg;
import android.widget.RatingBar;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p.n37;
import p.wg;
import android.widget.ProgressBar;
import android.graphics.Bitmap;

public final class yg extends RatingBar	// class@002db6 from classes.dex
{
    private final wg a;

    public void yg(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f03052e);
       n37.a(this.getContext(), this);
       wg owg = new wg(this);
       this.a = owg;
       owg.a(p1, R.attr.ratingBarStyle);
    }
    public synchronized final void onMeasure(int p0,int p1){
       wg b;
       super.onMeasure(p0, p1);
       if ((b = this.a.b) != null) {
          this.setMeasuredDimension(View.resolveSizeAndState((b.getWidth() * this.getNumStars()), p0, 0), this.getMeasuredHeight());
       }
       return;
    }
}
