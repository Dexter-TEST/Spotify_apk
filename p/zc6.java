package p.zc6;
import java.lang.Object;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import p.lj0;

public final class zc6	// class@002ece from classes.dex
{
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public int d;
    public int e;
    public int f;
    public final Path g;
    public final Paint h;
    public static final int[] i;
    public static final float[] j;
    public static final int[] k;
    public static final float[] l;

    static {
       int[] ointArray = new int[3];
       zc6.i = ointArray;
       zc6.j = new float[3]{0,0x3f000000,0x3f800000};
       ointArray = new int[4];
       zc6.k = ointArray;
       zc6.l = new float[4]{0,0,0x3f000000,0x3f800000};
    }
    public void zc6(){
       super();
       this.g = new Path();
       Paint paint = new Paint();
       this.h = paint;
       this.a = new Paint();
       this.a(0xff000000);
       paint.setColor(0);
       paint = new Paint(4);
       this.b = paint;
       paint.setStyle(Paint$Style.FILL);
       this.c = new Paint(paint);
    }
    public final void a(int p0){
       this.d = lj0.h(p0, 68);
       this.e = lj0.h(p0, 20);
       this.f = lj0.h(p0, 0);
       this.a.setColor(this.d);
    }
}
