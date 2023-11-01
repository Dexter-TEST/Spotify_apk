package p.aw2;
import p.bw2;
import p.c33;
import p.ix;
import p.vz5;
import java.lang.Class;
import p.yz5;
import p.zk2;
import p.ju2;
import p.uu2;
import p.bt2;
import p.e06;
import android.content.Context;
import android.view.ViewGroup;

public final class aw2 extends bw2	// class@001004 from classes.dex
{
    public final int f;

    public void aw2(c33 p0,ix p1,int p2){
       this.f = p2;
       if (p2 != 1) {
          super(p0, p1, vz5.class);
          return;
       }else {
          super(p0, p1, yz5.class);
          return;
       }
    }
    public final void e(zk2 p0,ju2 p1,uu2 p2,bt2 p3){
       switch (this.f){
           case 0:
           default:
             this.g(p0, p1, p2);
             return;
       }
       this.g(p0, p1, p2);
       return;
    }
    public final zk2 f(Context p0,ViewGroup p1,uu2 p2){
       switch (this.f){
           case 0:
           default:
             return this.h(p0, p1);
       }
       return this.h(p0, p1);
    }
}
