package p.m76;
import p.rt2;
import p.u76;
import java.lang.Object;
import p.tt2;
import p.cu2;
import java.lang.Class;
import p.au2;
import java.lang.String;
import p.an5;

public final class m76 implements rt2	// class@001e3e from classes.dex
{
    public final int b;
    public final u76 c;

    public void m76(u76 p0,int p1){
       this.b = p1;
       this.c = p0;
       super();
    }
    public final void a(tt2 p0,cu2 p1){
       String str;
       m76 tc = this.c;
       switch (this.b){
           case 0:
             break;
           default:
             tc.v.onNext(p0);
             return;
       }
       tc.getClass();
       if ((str = p0.b().q("uri")) != null) {
          tc.t.onNext(str);
       }
       return;
    }
}
