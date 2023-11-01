package p.g24;
import androidx.recyclerview.widget.LinearLayoutManager;
import p.k24;
import androidx.recyclerview.widget.RecyclerView;
import p.f65;
import android.content.Context;
import android.view.View;
import java.lang.Object;
import p.ur5;
import p.hr5;
import p.vr5;

public final class g24 extends LinearLayoutManager	// class@001687 from classes.dex
{
    public final int W;
    public final k24 X;

    public void g24(k24 p0,int p1,int p2){
       this.X = p0;
       this.W = p2;
       super(p1);
    }
    public final void N0(RecyclerView p0,int p1){
       f65 uof65 = new f65(this, p0.getContext(), 1);
       uof65.a = p1;
       this.O0(uof65);
    }
    public final void Q0(vr5 p0,int[] p1){
       g24 tX = this.X;
       if (this.W == null) {
          p1[0] = tX.y.getWidth();
          p1[1] = tX.y.getWidth();
       }else {
          p1[0] = tX.y.getHeight();
          p1[1] = tX.y.getHeight();
       }
       return;
    }
}
