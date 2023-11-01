package p.qm;
import p.yf2;
import p.sm;
import java.lang.Object;
import p.jc7;
import com.spotify.litecomponents.widgets.view.LiteSearchView;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.Boolean;
import p.vu2;
import java.lang.Class;
import java.lang.String;
import p.y66;
import p.zg0;
import p.mq5;
import p.w51;
import p.n66;

public final class qm implements yf2	// class@0023d2 from classes.dex
{
    public final int a;
    public final sm b;

    public void qm(sm p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       boolean b;
       qm tb = this.b;
       switch (this.a){
           case 0:
             p0 = tb.A;
             b = (p0.B0.getDrawable() == p0.C0)? true: false;
             break;
           default:
             tb.getClass();
             vu2 a = p0.a;
             p0 = (p0.a.startsWith("spotify:search:"))? new y66(a): new n66(a, w51.s(tb.t, p0));
             return p0;
       }
       return Boolean.valueOf(b);
    }
}
