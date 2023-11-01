package p.wi2;
import p.a5;
import p.wd5;
import p.cv5;
import java.lang.Object;
import java.lang.String;
import android.graphics.drawable.Drawable;
import p.e07;
import android.graphics.Bitmap;
import p.ud5;
import java.lang.IllegalStateException;
import java.lang.AssertionError;
import java.lang.Exception;
import android.content.res.Resources;
import android.content.Context;

public final class wi2 extends a5	// class@002b40 from classes.dex
{
    public final int m;

    public void wi2(wd5 p0,cv5 p1,Object p2,String p3){
       this.m = 0;
       super(p0, null, p1, 0, null, p3, p2);
    }
    public void wi2(wd5 p0,e07 p1,cv5 p2,Drawable p3,String p4,Object p5,int p6){
       this.m = 1;
       super(p0, p1, p2, p6, p3, p4, p5);
    }
    public final void b(Bitmap p0,ud5 p1){
       e07 uoe07;
       switch (this.m){
           case 0:
           default:
             if (p0 != null) {
                if ((uoe07 = this.d()) != null) {
                   uoe07.c(p0, p1);
                   if (p0.isRecycled()) {
                      throw new IllegalStateException("Target callback must not recycle bitmap!");
                   }
                }
                return;
             }else {
                Object[] objArray = new Object[]{this};
                throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", objArray));
             }
       }
       return;
    }
    public final void c(Exception p0){
       e07 uoe07;
       a5 tg;
       switch (this.m){
           case 0:
           default:
             if ((uoe07 = this.d()) != null) {
                if ((tg = this.g) != null) {
                   uoe07.a(this.a.c.getResources().getDrawable(tg));
                }else {
                   uoe07.a(this.h);
                }
             }
             return;
       }
       return;
    }
}
