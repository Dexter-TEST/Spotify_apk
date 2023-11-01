package p.jh4;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.hh4;
import p.zf2;
import java.lang.Boolean;
import p.ih4;
import p.xu0;
import p.gq;
import p.n26;
import p.kh4;

public final class jh4 extends AppBarLayout$ScrollingViewBehavior	// class@001ad8 from classes.dex
{
    public final int[] g;
    public View h;

    public void jh4(){
       super();
       int[] ointArray = new int[2];
       this.g = ointArray;
    }
    public final void j(CoordinatorLayout p0,View p1,View p2){
       co5.o(p0, "coordinatorLayout");
       co5.o(p2, "target");
    }
    public final boolean k(CoordinatorLayout p0,View p1,View p2,float p3,float p4){
       co5.o(p0, "coordinatorLayout");
       co5.o(p2, "target");
       return this.y(p0, p2, new hh4(p3, p4)).booleanValue();
    }
    public final void l(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int[] p5,int p6){
       co5.o(p0, "coordinatorLayout");
       co5.o(p2, "target");
       co5.o(p5, "consumed");
       this.y(p0, p2, new ih4(this, p5, p3, p4));
    }
    public final void n(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int p5,int p6,int p7,int[] p8){
       co5.o(p0, "coordinatorLayout");
       co5.o(p2, "target");
       co5.o(p8, "consumed");
       super.n(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }
    public final boolean r(CoordinatorLayout p0,View p1,View p2,View p3,int p4,int p5){
       co5.o(p0, "coordinatorLayout");
       co5.o(p2, "directTargetChild");
       co5.o(p3, "target");
       return this.y(p0, p3, new gq(p4, 1)).booleanValue();
    }
    public final void s(CoordinatorLayout p0,View p1,View p2,int p3){
       co5.o(p0, "coordinatorLayout");
       co5.o(p2, "target");
       this.y(p0, p2, n26.N);
    }
    public final Object y(CoordinatorLayout p0,View p1,zf2 p2){
       this.h = p1;
       co5.j(p0, "null cannot be cast to non-null type com.spotify.musicappplatform.coordinatorlayout.NestedCoordinatorLayout");
       return p2.invoke(p0);
    }
}
