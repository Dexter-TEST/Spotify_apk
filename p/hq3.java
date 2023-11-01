package p.hq3;
import p.e07;
import p.gk2;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import p.ud5;
import p.ap5;
import p.uv1;
import p.gq3;
import p.c26;

public final class hq3 implements e07	// class@0018a1 from classes.dex
{
    public final gk2 a;

    public void hq3(gk2 p0){
       super();
       this.a = p0;
    }
    public final void a(Drawable p0){
       this.a.setColor(0);
    }
    public final void b(Drawable p0){
    }
    public final void c(Bitmap p0,ud5 p1){
       ap5.e((p0.isRecycled() ^ 0x01));
       new uv1(p0).g(new gq3(this));
       ap5.e((p0.isRecycled() ^ 0x01));
    }
}
