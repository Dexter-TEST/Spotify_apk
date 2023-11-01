package p.d61;
import p.b90;
import p.e61;
import p.aq6;
import java.lang.Object;
import p.dt5;
import io.reactivex.rxjava3.core.Single;
import java.lang.Class;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.Map;
import p.lq3;

public final class d61 implements b90	// class@0012e6 from classes.dex
{
    public final int a;
    public final e61 b;
    public final aq6 c;

    public void d61(e61 p0,aq6 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final Single a(dt5 p0){
       d61 tc = this.c;
       d61 tb = this.b;
       switch (this.a){
           case 0:
             return tb.a.h("albumURI:"+tc, p0);
           case 1:
             return tb.a.j("artistURI:"+tc, p0);
           case 2:
             tb.getClass();
             return tb.a.l("playlistURI:"+tc, p0);
           default:
             tb.getClass();
             return tb.a.f("trackURI:"+tc, p0);
       }
    }
}
