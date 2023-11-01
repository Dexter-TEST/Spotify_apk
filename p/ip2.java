package p.ip2;
import android.widget.ImageView;
import java.lang.Object;
import android.view.View;

public final class ip2	// class@0019da from classes.dex
{
    public final ImageView a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public void ip2(ImageView p0){
       super();
       this.a = p0;
    }
    public final int a(int p0){
       if (this.d != null) {
          return 0;
       }
       if (this.e == null) {
          return (- (int)((0x3f800000 - ((float)p0 / (float)this.b)) * (float)(this.a.getMeasuredHeight() - this.b)));
       }
       float f = (float)p0;
       return (int)((0x3fb33333 * f) - f);
    }
}
