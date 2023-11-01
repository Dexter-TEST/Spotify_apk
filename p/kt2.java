package p.kt2;
import p.er5;
import p.lt2;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p.vr5;
import android.view.ViewGroup$LayoutParams;
import p.ut2;
import java.lang.Class;
import java.lang.Object;
import p.zr5;
import p.hr5;

public final class kt2 extends er5	// class@001c7b from classes.dex
{
    public final int a;
    public final boolean b;
    public final int c;
    public final lt2 d;

    public void kt2(lt2 p0,int p1,boolean p2){
       this.a = 0;
       this.d = p0;
       this.c = p1;
       this.b = p2;
       super();
    }
    public void kt2(lt2 p0,boolean p1,int p2){
       this.a = 1;
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void f(Rect p0,View p1,RecyclerView p2,vr5 p3){
       ViewGroup$LayoutParams layoutParams;
       zr5 ozr5;
       int i1;
       int i2;
       kt2 okt2;
       kt2 okt21;
       kt2 tb = this.b;
       int i = -2;
       kt2 tc = this.c;
       kt2 td = this.d;
       switch (this.a){
           case 0:
             if ((layoutParams = p1.getLayoutParams()) != null && (layoutParams.width == -1 && layoutParams.height == i)) {
                layoutParams.width = i;
                layoutParams.height = -1;
             }
             td.a.getClass();
             i1 = ((ozr5 = RecyclerView.M(p1)) != null)? ozr5.e(): -1;
             i2 = td.c.O() - 1;
             okt2 = (!i1)? tc: tc / 2;
             if (i1 != i2) {
                tc = tc / 2;
             }
             okt21 = (tb != null)? tc: okt2;
             if (tb == null) {
                okt2 = tc;
             }
             break;
           default:
             if ((layoutParams = p1.getLayoutParams()) != null && (layoutParams.width == -1 && layoutParams.height == i)) {
                layoutParams.width = i;
                layoutParams.height = -1;
             }
             td.a.getClass();
             i1 = ((ozr5 = RecyclerView.M(p1)) != null)? ozr5.e(): -1;
             lt2 c = td.c;
             okt2 = (tb != null)? 0: c.O() - 1;
             i2 = (tb != null)? c.O() - 1: 0;
             kt2 okt22 = (i1 == i2)? tc: tc / 2;
             if (i1 != okt2) {
                tc = tc / 2;
             }
             p0.set(okt22, 0, tc, 0);
             return;
       }
       p0.set(okt21, 0, okt2, 0);
       return;
    }
}
