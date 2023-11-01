package p.b20;
import p.j22;
import java.lang.Object;
import p.u45;
import p.au0;
import p.e70;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import p.qn6;
import p.pn6;
import p.r;
import java.io.File;
import android.content.Context;
import p.g70;
import p.co5;
import p.q63;
import java.lang.String;
import p.je1;
import android.graphics.Bitmap;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import p.og7;
import android.graphics.Bitmap$Config;
import p.fl6;
import p.lv1;

public final class b20 implements j22	// class@001039 from classes.dex
{
    public final int a;
    public final u45 b;
    public final Object c;

    public void b20(Object p0,u45 p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public final Object a(au0 p0){
       boolean b = false;
       b20 tb = this.b;
       b20 tc = this.c;
       switch (this.a){
           case 0:
             return new je1(new BitmapDrawable(tb.a.getResources(), tc), b, 2);
           case 1:
             e70 uoe70 = new e70();
             uoe70.write(tc);
             tc.position(b);
             File cacheDir = tb.a.getCacheDir();
             cacheDir.mkdirs();
             return new qn6(new pn6(uoe70, cacheDir, null), null, 2);
           default:
             if (tc instanceof VectorDrawable || tc instanceof og7) {
                b = true;
             }
             if (b) {
                tc = new BitmapDrawable(tb.a.getResources(), lv1.i(tc, tb.b, tb.d, tb.e, tb.f));
             }
             return new je1(tc, b, 2);
       }
    }
}
