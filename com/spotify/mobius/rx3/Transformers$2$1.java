package com.spotify.mobius.rx3.Transformers$2$1;
import p.yf2;
import com.spotify.mobius.rx3.Transformers$2;
import java.lang.Object;
import com.spotify.mobius.rx3.Transformers$2$1$1;
import p.b5;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import p.rk0;

class Transformers$2$1 implements yf2	// class@000a91 from classes.dex
{
    public final Transformers$2 a;

    public void Transformers$2$1(Transformers$2 p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       Transformers$2 b;
       p0 = Completable.i(new Transformers$2$1$1(this, p0));
       if ((b = this.a.b) == null) {
       }else {
          p0 = p0.p(b);
       }
       return p0;
    }
}
