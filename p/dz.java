package p.dz;
import p.yf2;
import p.ez;
import java.lang.Object;
import p.vt;
import java.lang.Class;
import p.r45;
import p.vx6;
import p.tx6;
import java.io.IOException;
import java.lang.String;
import java.lang.Throwable;
import io.reactivex.rxjava3.core.Single;
import p.sx6;
import p.a43;
import p.ty0;
import p.aq6;
import p.b43;
import java.util.List;
import p.au2;
import p.h13;
import java.io.Serializable;
import p.zt2;
import p.a23;
import p.z23;
import java.lang.IllegalArgumentException;

public final class dz implements yf2	// class@0013ec from classes.dex
{
    public final int a;
    public final ez b;

    public void dz(ez p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       vx6 ovx6;
       dz tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             if ((ovx6 = p0.i.f()) != null && p0.a()) {
                if (ovx6 instanceof tx6) {
                   p0 = Single.error(new IOException("Could not sync body"));
                }else if(ovx6 instanceof sx6){
                   p0 = Single.error(ovx6.a);
                }else {
                label_003a :
                   p0 = Single.just(p0);
                }
             }else {
                goto label_003a ;
             }
             break;
           default:
             tb.getClass();
             if (!p0.b.c()) {
                throw new IllegalArgumentException();
             }
             Object obj = p0.b.b();
             vt a = p0.a;
             vt c = p0.c;
             a43 uoa43 = tb.b(p0, obj, c, ty0.B().j(a.toString()));
             vt d = p0.d;
             int i = (d.c() && (!p0.a() && p0.j != null))? 1: 0;
             if (i) {
                uoa43 = uoa43.a(d.b().m());
             }
             String str = a.toString();
             uoa43 = uoa43.d(h13.b(str)).c("context_uri", str);
             if ((p0 = tb.a(p0, obj, c)) != null) {
                uoa43 = uoa43.d(ty0.b().e("toolbarmenu", p0).d());
             }
             return uoa43.g();
       }
       return p0;
    }
}
