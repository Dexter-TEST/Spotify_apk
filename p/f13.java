package p.f13;
import p.qg2;
import p.b43;
import java.lang.Object;
import p.bg5;
import p.a43;
import p.au2;
import java.lang.String;
import java.util.List;
import java.lang.Iterable;
import p.ab2;
import p.g13;
import p.jg2;
import com.google.common.collect.c;
import p.z23;
import p.cg5;
import p.cc4;

public final class f13 implements qg2	// class@00153a from classes.dex
{
    public final int a;
    public final b43 b;

    public void f13(b43 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       f13 tb = this.b;
       switch (this.a){
           case 0:
             return tb;
           case 1:
             bg5 a = p0.a;
             return tb.a().e(ab2.b(tb.m()).m(new g13(a, p0.b, a.equals(tb.b().u("highlight:contextUri")))).d()).g();
           default:
             return tb;
       }
    }
}
