package p.lf0;
import p.he1;
import java.lang.Object;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import p.mf0;
import java.lang.String;
import p.co5;
import p.lz5;

public final class lf0 implements he1	// class@001d3e from classes.dex
{
    public final int a;
    public final float b;

    public void lf0(float p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Drawable a(Bitmap p0){
       lf0 tb = this.b;
       switch (this.a){
           case 0:
           default:
             co5.l(p0, "bitmap");
             return new lz5(p0, tb);
       }
       co5.l(p0, "bitmap");
       return new mf0(p0, tb);
    }
}
