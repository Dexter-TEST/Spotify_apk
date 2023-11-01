package p.f65;
import p.uk3;
import java.lang.Object;
import android.content.Context;
import android.graphics.PointF;
import p.ur5;
import com.spotify.encoremobile.recyclerviewutil.SmoothScrollingGridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import p.vr5;
import p.sr5;
import p.g65;
import p.hr5;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Math;
import android.util.DisplayMetrics;
import java.lang.Class;

public final class f65 extends uk3	// class@00156b from classes.dex
{
    public final int p;
    public final Object q;

    public void f65(Object p0,Context p1,int p2){
       this.p = p2;
       this.q = p0;
       super(p1);
    }
    public final PointF a(int p0){
       switch (this.p){
           case 2:
             return this.q.d(p0);
           case 3:
             return new PointF(0, (float)p0);
           default:
             return super.a(p0);
       }
    }
    public final void c(View p0,vr5 p1,sr5 p2){
       int i2;
       switch (this.p){
           case 0:
             f65 tq = this.q;
             int[] ointArray = tq.b(tq.a.getLayoutManager(), p0);
             int i = ointArray[0];
             int i1 = ointArray[1];
             if ((i2 = (int)Math.ceil(((double)this.g(Math.max(Math.abs(i), Math.abs(i1))) / 0x3fd57a786c22680a))) > 0) {
                p2.a = i;
                p2.b = i1;
                p2.c = i2;
                p2.e = this.i;
                p2.f = true;
             }
             break;
           default:
             super.c(p0, p1, p2);
             return;
       }
       return;
    }
    public final float f(DisplayMetrics p0){
       float f1;
       float f2;
       float f = 100.00f;
       switch (this.p){
           case 0:
             p0 = p0.densityDpi;
          label_0017 :
             return (f / (float)p0);
             break;
           case 1:
             p0 = p0.densityDpi;
             goto label_0017 ;
             break;
           case 2:
             this.q.getClass();
             f1 = (float)p0.densityDpi;
             f2 = 0;
          label_0013 :
             return (f2 / f1);
             break;
           default:
             f1 = (float)p0.densityDpi;
             f2 = 50.00f;
             goto label_0013 ;
       }
    }
    public final int g(int p0){
       switch (this.p){
           case 0:
           default:
             return super.g(p0);
       }
       return Math.min(100, super.g(p0));
    }
}
