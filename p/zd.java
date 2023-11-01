package p.zd;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup;
import android.animation.LayoutTransition;

public final class zd	// class@002ed9 from classes.dex
{
    public static final ViewGroup$MarginLayoutParams a;

    static {
       ViewGroup$MarginLayoutParams marginLayout = new ViewGroup$MarginLayoutParams(-1, -1);
       zd.a = marginLayout;
       marginLayout.setMargins(0, 0, 0, 0);
    }
    public void zd(LinearLayoutManager p0){
       super();
    }
    public static boolean a(View p0){
       LayoutTransition layoutTransi;
       if (p0 instanceof ViewGroup) {
          if ((layoutTransi = p0.getLayoutTransition()) != null && layoutTransi.isChangingLayout()) {
             return true;
          }else {
             int childCount = p0.getChildCount();
             int i = 0;
             while (i < childCount) {
                if (zd.a(p0.getChildAt(i))) {
                   return true;
                }
                i = i + 1;
             }
          }
       }
       return false;
    }
}
