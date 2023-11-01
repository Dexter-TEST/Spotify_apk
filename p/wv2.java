package p.wv2;
import p.xv2;
import p.xj2;
import java.lang.Class;
import p.zj2;
import p.zk2;
import p.ju2;
import p.uu2;
import p.bt2;
import p.tu2;
import java.lang.String;
import p.yj2;
import java.lang.CharSequence;
import p.au2;
import android.widget.TextView;
import android.view.View;
import p.co5;
import p.wj2;
import android.content.Context;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import p.eo5;

public final class wv2 extends xv2	// class@002bb2 from classes.dex
{
    public final int d;

    public void wv2(int p0){
       this.d = p0;
       if (p0 != 1) {
          super(xj2.class);
          return;
       }else {
          super(zj2.class);
          return;
       }
    }
    public final void e(zk2 p0,ju2 p1,uu2 p2,bt2 p3){
       switch (this.d){
           case 0:
           default:
             p0.setTitle(p1.y().d());
             p0.setSubtitle(p1.y().m());
             return;
       }
       p0.setTitle(p1.y().d());
       p0.setSubtitle(p1.y().m());
       yj2 t = p0.t;
       t.setText(p1.b().q("buttonTitle"));
       co5.e(t, p1, p2);
       return;
    }
    public final zk2 f(Context p0,ViewGroup p1,uu2 p2){
       switch (this.d){
           case 0:
           default:
             zj2 ozj2 = new zj2(LayoutInflater.from(p0).inflate(R.layout.glue_empty_state, p1, false));
             eo5.P(ozj2);
             return ozj2;
       }
       yj2 oyj2 = new yj2(LayoutInflater.from(p0).inflate(R.layout.glue_empty_state_button, p1, false));
       eo5.P(oyj2);
       return oyj2;
    }
}
