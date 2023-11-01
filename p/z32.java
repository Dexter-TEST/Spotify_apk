package p.z32;
import p.is0;
import android.content.Context;
import p.cv5;
import java.lang.String;
import android.net.Uri;
import java.lang.Object;
import p.dm5;
import java.io.InputStream;
import p.on;
import p.xe7;
import p.ud5;
import p.gx1;
import android.graphics.Bitmap;
import p.nn6;

public final class z32 extends is0	// class@002e7b from classes.dex
{

    public void z32(Context p0){
       super(p0, 0);
    }
    public final boolean b(cv5 p0){
       return "file".equals(p0.c.getScheme());
    }
    public final dm5 e(cv5 p0,int p1){
       return new dm5(null, xe7.d0(this.g(p0)), ud5.c, new gx1(p0.c.getPath()).c());
    }
}
