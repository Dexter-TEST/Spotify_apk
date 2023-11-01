package p.nl;
import p.i22;
import java.lang.Object;
import p.u45;
import p.g63;
import p.j22;
import java.io.File;
import p.i32;
import android.graphics.drawable.Drawable;
import p.b20;
import android.net.Uri;
import java.nio.ByteBuffer;
import android.graphics.Bitmap;
import p.ol;
import p.r;
import java.lang.String;
import p.co5;
import java.util.List;
import p.dj0;
import p.ow5;

public final class nl implements i22	// class@002003 from classes.dex
{
    public final int a;

    public void nl(int p0){
       this.a = p0;
       super();
    }
    public final j22 a(Object p0,u45 p1,g63 p2){
       switch (this.a){
           case 0:
             return this.b(p0, p1);
           case 1:
             return new b20(p0, p1, 0);
           case 2:
             return new b20(p0, p1, 1);
           case 3:
             return this.b(p0, p1);
           case 4:
             return new b20(p0, p1, 2);
           case 5:
             return new i32(p0);
           default:
             return this.b(p0, p1);
       }
    }
    public final j22 b(Uri p0,u45 p1){
       int i = 1;
       j22 oj22 = null;
       switch (this.a){
           case 0:
             if (!co5.c(p0.getScheme(), "file") || !co5.c(dj0.l0(p0.getPathSegments()), "android_asset")) {
                i = 0;
             }
             if (i) {
                oj22 = new ol(p0, p1, 0);
             }
             break;
           case 3:
             if (this.c(p0)) {
                oj22 = new ol(p0, p1, i);
             }
             return oj22;
             break;
           default:
             if (this.c(p0)) {
                oj22 = new ow5(p0, p1);
             }
             return oj22;
       }
       return oj22;
    }
    public final boolean c(Uri p0){
       switch (this.a){
           case 3:
           default:
             return co5.c(p0.getScheme(), "android.resource");
       }
       return co5.c(p0.getScheme(), "content");
    }
}
