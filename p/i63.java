package p.i63;
import p.aw6;
import java.lang.Object;
import p.we6;
import p.mt6;
import p.eq3;
import java.lang.Class;
import p.wp3;
import p.rn6;
import p.tn6;
import java.lang.Long;
import p.gv0;
import android.graphics.drawable.StateListDrawable;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

public final class i63 implements aw6	// class@001932 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void i63(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public final Object get(){
       i63 tc = this.c;
       i63 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.getClass();
             gv0 e = tb.e;
             Bitmap uBitmap = Bitmap.createBitmap(e, e, Bitmap$Config.ARGB_8888);
             tc.setBounds(0, 0, e, e);
             tc.draw(new Canvas(uBitmap));
             return uBitmap;
       }
       tc.getClass();
       return Long.valueOf(tb.a.b(wp3.y, (eq3.j / 4)));
    }
}
