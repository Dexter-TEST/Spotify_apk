package p.sj7;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;
import p.vr5;
import p.pr5;
import p.y3;
import p.hr5;
import java.lang.Class;
import java.lang.Object;
import android.os.Bundle;

public final class sj7 extends LinearLayoutManager	// class@002641 from classes.dex
{
    public final ViewPager2 W;

    public void sj7(ViewPager2 p0){
       this.W = p0;
       super(1);
    }
    public final boolean A0(RecyclerView p0,View p1,Rect p2,boolean p3,boolean p4){
       return false;
    }
    public final void Q0(vr5 p0,int[] p1){
       int offscreenPag;
       sj7 tW = this.W;
       if ((offscreenPag = tW.getOffscreenPageLimit()) == -1) {
          super.Q0(p0, p1);
          return;
       }else {
          int i = tW.getPageSize() * offscreenPag;
          p1[0] = i;
          p1[1] = i;
          return;
       }
    }
    public final void h0(pr5 p0,vr5 p1,y3 p2){
       super.h0(p0, p1, p2);
       this.W.K.getClass();
    }
    public final boolean v0(pr5 p0,vr5 p1,int p2,Bundle p3){
       this.W.K.getClass();
       return super.v0(p0, p1, p2, p3);
    }
}
