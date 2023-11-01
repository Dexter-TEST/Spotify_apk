package p.hi0;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import p.li0;
import java.lang.Object;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.lang.Boolean;
import p.l63;
import p.gi0;
import p.n63;
import p.wp5;
import p.wc1;

public final class hi0 implements SingleOnSubscribe	// class@001856 from classes.dex
{
    public final li0 a;

    public void hi0(li0 p0){
       this.a = p0;
       super();
    }
    public final void subscribe(SingleEmitter p0){
       hi0 ta = this.a;
       li0 b = ta.b;
       b.r = Boolean.valueOf(ta.f);
       b.d = new gi0(p0);
       b.M = null;
       b.N = null;
       b.O = 0;
       ta.d = ta.a.b(b.a());
    }
}
