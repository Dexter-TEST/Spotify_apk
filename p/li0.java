package p.li0;
import p.o63;
import p.g63;
import p.l63;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.wp5;
import p.a81;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import android.widget.ImageView;
import coil.target.ImageViewTarget;
import com.spotify.imageloader.coilloaderbase.NoClearImageTarget;
import java.lang.Boolean;
import p.fi0;
import p.m63;
import p.n63;
import p.wc1;
import p.q77;
import p.ki0;
import java.util.List;
import p.ye7;
import java.lang.Class;
import p.vv7;

public final class li0 implements o63	// class@001d59 from classes.dex
{
    public final g63 a;
    public final l63 b;
    public final m63 c;
    public wc1 d;
    public boolean e;
    public boolean f;

    public void li0(g63 p0,l63 p1){
       co5.o(p0, "coilImageLoader");
       super();
       this.a = p0;
       this.b = p1;
       this.c = null;
       this.e = true;
       this.f = p0.a.h;
    }
    public final li0 a(Drawable p0){
       li0 tb = this.b;
       tb.G = p0;
       tb.F = Integer.valueOf(0);
       return this;
    }
    public final void b(ImageView p0){
       ImageViewTarget imageViewTar = (this.e != null)? new ImageViewTarget(p0): new NoClearImageTarget(p0);
       li0 tb = this.b;
       tb.d = imageViewTar;
       tb.M = null;
       tb.N = null;
       tb.O = 0;
       tb.r = Boolean.valueOf(this.f);
       tb.e = new fi0(this.c);
       this.d = this.a.b(tb.a());
       return;
    }
    public final li0 c(Drawable p0){
       li0 tb = this.b;
       tb.E = p0;
       tb.D = Integer.valueOf(0);
       this.a(p0);
       return this;
    }
    public final li0 d(q77 p0){
       co5.o(p0, "transformation");
       li0 tb = this.b;
       tb.getClass();
       tb.m = vv7.U(ye7.J(new ki0(p0)));
       return this;
    }
}
