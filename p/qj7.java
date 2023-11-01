package p.qj7;
import p.jr5;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import p.ir5;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.IllegalStateException;
import java.lang.String;

public final class qj7 implements jr5	// class@0023b6 from classes.dex
{

    public void qj7(){
       super();
    }
    public final void a(View p0){
       ir5 layoutParams = p0.getLayoutParams();
       if (layoutParams.width == -1 && layoutParams.height == -1) {
          return;
       }
       throw new IllegalStateException("Pages must fill the whole ViewPager2 \(use match_parent\)");
    }
    public final void d(View p0){
    }
}
