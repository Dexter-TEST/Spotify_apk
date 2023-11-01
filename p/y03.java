package p.y03;
import p.cy2;
import p.k96;
import java.lang.Class;
import p.zk2;
import p.ju2;
import p.uu2;
import p.bt2;
import android.content.Context;
import android.view.ViewGroup;
import p.l96;
import p.o96;
import java.lang.Object;
import android.view.LayoutInflater;
import android.view.View;
import p.eo5;

public final class y03 extends cy2	// class@002d22 from classes.dex
{
    public final int e;

    public void y03(int p0){
       this.e = p0;
       if (p0 != 1) {
          super(k96.class);
          return;
       }else {
          super(k96.class);
          return;
       }
    }
    public final void e(zk2 p0,ju2 p1,uu2 p2,bt2 p3){
       switch (this.e){
           case 0:
           default:
             this.h(p0, p1, p2, p3);
             return;
       }
       this.h(p0, p1, p2, p3);
       return;
    }
    public final zk2 f(Context p0,ViewGroup p1,uu2 p2){
       switch (this.e){
           case 0:
           default:
             return this.i(p0, p1);
       }
       return this.i(p0, p1);
    }
    public final l96 i(Context p0,ViewGroup p1){
       l96 ol96;
       cy2 td = this.d;
       switch (this.e){
           case 0:
           default:
             td.a.getClass();
             ol96 = new l96(LayoutInflater.from(p0).inflate(R.layout.glue_sectionheader_small, p1, false));
             eo5.P(ol96);
             return ol96;
       }
       td.a.getClass();
       ol96 = new l96(LayoutInflater.from(p0).inflate(R.layout.glue_sectionheader_large, p1, false));
       eo5.P(ol96);
       return ol96;
    }
}
