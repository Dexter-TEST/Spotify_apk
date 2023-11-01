package p.h96;
import p.b90;
import p.i96;
import java.lang.String;
import java.util.HashMap;
import java.lang.Object;
import p.dt5;
import io.reactivex.rxjava3.core.Single;
import java.lang.Class;
import java.util.Map;
import p.m73;
import p.xj0;
import p.j96;

public final class h96 implements b90	// class@00180a from classes.dex
{
    public final i96 a;
    public final String b;
    public final String c;
    public final Map t;
    public final boolean v;

    public void h96(i96 p0,String p1,String p2,HashMap p3,boolean p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final Single a(dt5 p0){
       h96 ta = this.a;
       ta.getClass();
       return ta.b.b(this.b, this.c, this.t, xj0.h(p0, this.v));
    }
}
