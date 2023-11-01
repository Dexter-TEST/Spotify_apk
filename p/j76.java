package p.j76;
import p.yf2;
import p.u76;
import java.lang.Object;
import p.jc7;
import com.spotify.litecomponents.widgets.view.LiteSearchView;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.Boolean;
import java.lang.CharSequence;
import androidx.appcompat.widget.SearchView;
import java.lang.String;
import p.p66;
import p.vu2;
import java.lang.Class;
import p.zg0;
import p.mq5;
import p.w51;
import p.o66;

public final class j76 implements yf2	// class@001a80 from classes.dex
{
    public final int a;
    public final u76 b;

    public void j76(u76 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       j76 tb = this.b;
       switch (this.a){
           case 0:
           case 1:
             p0 = tb.z;
             boolean b = (p0.B0.getDrawable() == p0.C0)? true: false;
             return Boolean.valueOf(b);
             break;
           default:
             tb.getClass();
             return new o66(p0.a, w51.t(tb.c, p0));
       }
       return new p66(tb.z.getQuery().toString());
    }
}
