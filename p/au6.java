package p.au6;
import java.util.TimerTask;
import p.iu6;
import p.fu6;
import p.t50;
import p.hb6;
import p.ob6;
import p.cu6;
import p.ku6;

public final class au6 extends TimerTask	// class@000ff6 from classes.dex
{
    public final int a;

    public void au6(int p0){
       this.a = p0;
       super();
    }
    public final void run(){
       eu6 f;
       switch (this.a){
           case 0:
             cu6.V();
             return;
           case 1:
             if ((f = fu6.F) != null) {
                f.f.e(hb6.w);
                f.o = false;
                f.s();
                fu6.F = null;
             }
             return;
             break;
           case 2:
             iu6.V();
             return;
           default:
             ku6.V();
             return;
       }
    }
}
