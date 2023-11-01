package p.hj7;
import p.xu0;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import p.av0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.content.Context;
import android.content.res.Resources;
import java.lang.String;
import java.lang.Object;
import com.spotify.base.java.logging.Logger;
import p.jj7;

public abstract class hj7 extends xu0	// class@001866 from classes.dex
{
    public jj7 a;
    public int b;

    public void hj7(){
       super();
    }
    public void hj7(int p0){
       super(0);
    }
    public static xu0 v(View p0){
       xu0 oxu0;
       av0 layoutParams = ((layoutParams = p0.getLayoutParams()) != null)? layoutParams.a: null;
       return layoutParams;
    }
    public boolean h(CoordinatorLayout p0,View p1,int p2){
       boolean b = true;
       try{
          p0.t(p1, p2);
          this.u(p1);
          return b;
       }catch(java.lang.ArrayIndexOutOfBoundsException e8){
          Resources resources = p1.getContext().getResources();
          String str = "no_id";
          String str1 = (p1.getId() == -1)? str: resources.getResourceEntryName(p1.getId());
          if (p0.getId() != -1) {
             str = resources.getResourceEntryName(p0.getId());
          }
          Object[] objArray = new Object[2];
          objArray[0] = str1;
          objArray[b] = str;
          Logger.i("child id is %1$s and parent id is %2$s", objArray);
          throw e8;
       }
    }
    public final void u(View p0){
       if (this.a == null) {
          this.a = new jj7(p0);
       }
       hj7 ta = this.a;
       jj7 a = ta.a;
       ta.b = a.getTop();
       ta.c = a.getLeft();
       ta.a();
       if ((ta = this.b) != null) {
          hj7 ta1 = this.a;
          if (ta1.d != ta) {
             ta1.d = ta;
             ta1.a();
          }
          this.b = 0;
       }
       return;
    }
    public final int w(){
       hj7 ta;
       jj7 d = ((ta = this.a) != null)? ta.d: 0;
       return d;
    }
    public final boolean x(int p0){
       hj7 ta = this.a;
       boolean b = false;
       if (ta != null) {
          if (ta.d != p0) {
             ta.d = p0;
             ta.a();
             b = true;
          }
          return b;
       }else {
          this.b = p0;
          return b;
       }
    }
}
