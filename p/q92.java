package p.q92;
import p.s92;
import p.eb6;
import p.g92;
import p.r92;
import java.lang.Integer;
import java.lang.Object;
import p.kv6;
import p.iv6;
import java.lang.Throwable;

public final class q92 extends s92	// class@002357 from classes.dex
{
    public final int D;

    public void q92(eb6 p0,g92 p1,r92 p2,int p3){
       this.D = p3;
       super(p0, p1, p2);
    }
    public final void onComplete(){
       switch (this.D){
           case 0:
           default:
             this.B.cancel();
             this.z.onComplete();
             return;
       }
       this.f(Integer.valueOf(0));
       return;
    }
    public final void onError(Throwable p0){
       switch (this.D){
           case 0:
           default:
             this.f(p0);
             return;
       }
       this.B.cancel();
       this.z.onError(p0);
       return;
    }
}
