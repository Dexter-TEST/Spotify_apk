package p.hm;
import p.b90;
import p.im;
import p.aq6;
import java.lang.Object;
import p.dt5;
import io.reactivex.rxjava3.core.Single;
import java.lang.Class;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.Map;
import p.m73;
import p.xj0;
import p.lq3;

public final class hm implements b90	// class@001882 from classes.dex
{
    public final int a;
    public final im b;
    public final aq6 c;
    public final boolean t;

    public void hm(im p0,aq6 p1,boolean p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super();
    }
    public final Single a(dt5 p0){
       hm tt = this.t;
       hm tc = this.c;
       hm tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.getClass();
             return tb.t.e("albumURI:"+tc, xj0.h(p0, tt));
       }
       tb.getClass();
       return tb.t.a("artistURI:"+tc, xj0.h(p0, tt));
    }
}
