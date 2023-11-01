package p.tp;
import p.wp;
import java.lang.Object;
import p.up;
import p.dq;
import p.vg0;
import p.xs3;
import p.os2;
import p.ps2;
import java.lang.String;
import p.ds7;
import p.nm5;
import p.qu0;
import p.v06;
import p.u90;
import p.cy5;
import p.zs3;
import java.lang.Class;
import p.np;

public final class tp implements wp	// class@0027bb from classes.dex
{
    public final int a;
    public final Object b;

    public void tp(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object a(up p0,dq p1){
       tp tb = this.b;
       switch (this.a){
           case 0:
           case 1:
             String str = "https://login5.spotify.com";
             ps2 ops2 = null;
             try{
                os2 oos2 = new os2();
                oos2.f(ops2, str);
                ops2 = oos2.b();
                ds7 str1 = new ds7();
                str1.d = p0;
                str1.d(ops2);
                str1.b(new nm5());
                str1.a(v06.b());
                cy5 uocy5 = str1.e();
                return new xs3(p1, uocy5.b(zs3.class), tb);
             }catch(java.lang.IllegalArgumentException e0){
             }
             break;
           default:
             return tb.a(new up(2, p0), p1);
       }
       return tb;
    }
}
