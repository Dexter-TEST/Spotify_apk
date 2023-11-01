package p.ee1;
import android.graphics.drawable.Drawable$Callback;
import java.lang.Object;
import p.ie;
import android.graphics.drawable.Drawable;
import java.lang.Runnable;

public final class ee1 implements Drawable$Callback	// class@00146b from classes.dex
{
    public final int a;
    public Object b;

    public void ee1(){
       this.a = 0;
       super();
    }
    public void ee1(ie p0){
       this.a = 1;
       this.b = p0;
       super();
    }
    public final void invalidateDrawable(Drawable p0){
       switch (this.a){
           case 0:
           default:
             this.b.invalidateSelf();
             return;
       }
       return;
    }
    public final void scheduleDrawable(Drawable p0,Runnable p1,long p2){
       ee1 tb;
       switch (this.a){
           case 0:
             break;
           default:
             this.b.scheduleSelf(p1, p2);
             return;
       }
       if ((tb = this.b) != null) {
          tb.scheduleDrawable(p0, p1, p2);
       }
       return;
    }
    public final void unscheduleDrawable(Drawable p0,Runnable p1){
       ee1 tb;
       switch (this.a){
           case 0:
             break;
           default:
             this.b.unscheduleSelf(p1);
             return;
       }
       if ((tb = this.b) != null) {
          tb.unscheduleDrawable(p0, p1);
       }
       return;
    }
}
