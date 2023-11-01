package p.tv2;
import p.uv2;
import p.c33;
import android.content.Context;
import android.view.ViewGroup;
import p.uu2;
import p.zk2;
import p.ic0;
import p.kc0;
import java.lang.Class;
import java.lang.Object;
import p.jc0;
import p.hc0;
import p.gc0;
import p.eo5;
import p.fv2;
import p.cc0;

public final class tv2 extends uv2	// class@0027eb from classes.dex
{
    public final int e;

    public void tv2(c33 p0,int p1){
       this.e = p1;
       super(p0);
    }
    public final zk2 f(Context p0,ViewGroup p1,uu2 p2){
       switch (this.e){
           case 0:
             return this.n(p0, p1);
           case 1:
             return this.n(p0, p1);
           default:
             return this.n(p0, p1);
       }
    }
    public final ic0 n(Context p0,ViewGroup p1){
       hc0 ohc0;
       switch (this.e){
           case 0:
             kc0.b.a.getClass();
             jc0 ojc0 = new jc0(p0);
             ohc0 = new hc0(ojc0, gc0.y);
             eo5.P(ohc0);
             fv2.g(ohc0);
             ojc0.setTextLayout(cc0.c);
             return ohc0;
           case 1:
             kc0.b.a.getClass();
             ohc0 = new hc0(new jc0(p0), gc0.t);
             eo5.P(ohc0);
             fv2.g(ohc0);
             return ohc0;
           default:
             kc0.b.a.getClass();
             ohc0 = new hc0(new jc0(p0), gc0.c);
             eo5.P(ohc0);
             fv2.g(ohc0);
             return ohc0;
       }
    }
}
