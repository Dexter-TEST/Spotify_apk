package p.h90;
import p.wf2;
import p.gi3;
import p.i90;
import java.lang.Object;
import p.c90;
import p.mp2;
import p.fv1;
import java.lang.String;
import p.u54;
import p.gg1;

public final class h90 extends gi3 implements wf2	// class@001804 from classes.dex
{
    public final int a;
    public final i90 b;

    public void h90(i90 p0,int p1){
       this.a = p1;
       this.b = p0;
       super(0);
    }
    public final Object invoke(){
       String str;
       h90 tb = this.b;
       switch (this.a){
           case 0:
           default:
             u54 ou54 = ((str = tb.f.a("Content-Type")) != null)? gg1.P(str): null;
             return ou54;
       }
       return fv1.z(tb.f);
    }
}
