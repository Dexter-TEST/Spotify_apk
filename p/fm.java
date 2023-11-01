package p.fm;
import p.b90;
import java.lang.Object;
import java.lang.String;
import java.io.Serializable;
import p.dt5;
import io.reactivex.rxjava3.core.Single;
import p.gm;
import java.lang.Class;
import java.util.Map;
import p.m73;
import p.xj0;
import p.lq3;
import p.g96;
import p.j96;

public final class fm implements b90	// class@0015fa from classes.dex
{
    public final int a;
    public final String b;
    public final boolean c;
    public final Object t;
    public final Object v;

    public void fm(Object p0,String p1,Serializable p2,boolean p3,int p4){
       this.a = p4;
       this.t = p0;
       this.b = p1;
       this.v = p2;
       this.c = p3;
       super();
    }
    public final Single a(dt5 p0){
       fm tb = this.b;
       fm tc = this.c;
       fm tv = this.v;
       fm tt = this.t;
       switch (this.a){
           case 0:
           default:
             tt.getClass();
             return tt.b.a(tb, tv, xj0.h(p0, tc));
       }
       tt.getClass();
       return tt.t.i(tb, tv, xj0.h(p0, tc));
    }
}
