package p.j33;
import p.qg2;
import java.lang.Object;
import p.jn4;
import p.jj5;
import p.r45;
import p.ln4;
import p.dn4;
import p.in4;
import p.hn4;
import p.gn4;
import p.fn4;
import p.en4;
import p.zm4;
import p.ym4;
import p.pm4;
import p.hm4;
import p.gm4;
import p.qm4;
import p.vs1;
import java.lang.String;
import p.uh1;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.xt;
import p.z07;
import p.fr6;
import p.y07;
import p.yq6;
import p.eo7;
import p.ry7;
import p.nn7;
import p.op;
import p.rt3;
import p.rn7;
import p.yn7;
import p.co7;
import p.xn7;
import p.av2;
import p.so3;
import p.xu2;
import p.wu2;
import p.vu2;
import p.bv2;
import java.lang.Boolean;
import p.zu2;
import p.yu2;
import p.kn4;

public final class j33 implements qg2	// class@001a5a from classes.dex
{
    public final int a;

    public void j33(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       int i = 1;
       int i1 = 0;
       switch (this.a){
           case 0:
             return Boolean.FALSE;
           case 1:
             return Boolean.FALSE;
           case 2:
             return Boolean.TRUE;
           case 3:
             return Boolean.TRUE;
           case 4:
             return Boolean.FALSE;
           case 5:
             return Boolean.FALSE;
           case 6:
             return Boolean.TRUE;
           case 7:
             return so3.g;
           case 8:
             return so3.g;
           case 9:
             return so3.g;
           case 10:
             return so3.g;
           case 11:
             ry7[] ory7Array = new ry7[i];
             ory7Array[i1] = new nn7();
             HashSet hashSet = vv7.p(ory7Array);
             eo7 c = p0.c;
             if (!c instanceof op || c.a != rt3.c) {
                i = 0;
             }
             if (i) {
                hashSet.add(new rn7());
                hashSet.add(new yn7());
             }else {
                hashSet.add(new xn7(new co7(p0.a, p0.b)));
             }
             return xt.a(hashSet);
             break;
           case 12:
             return new yq6();
           case 13:
             return new fr6();
           case 14:
             if ("interrupt_playback_restricted".equals(p0.a)) {
                p0 = new Object[i];
                p0[i1] = new uh1();
                p0 = xt.a(vv7.p(p0));
             }else {
                p0 = xt.e();
             }
             return p0;
             break;
           case 15:
             return r45.d(p0.a);
           case 16:
             return r45.d(p0.a);
           case 17:
             return r45.d(p0.a);
           case 18:
             return r45.d(p0.a);
           case 19:
             return r45.d(p0.a);
           case 20:
             return r45.d(p0.a);
           case 21:
             return r45.d(p0.a);
           case 22:
             return r45.d(p0.a);
           case 23:
             return r45.d(p0.a);
           case 24:
             return r45.d(p0.a);
           case 25:
             return r45.d(p0.a);
           case 26:
             return r45.d(p0.a);
           case 27:
             return r45.d(p0.a);
           case 28:
             return r45.d(p0.a);
           default:
             return r45.d(p0.a);
       }
    }
}
