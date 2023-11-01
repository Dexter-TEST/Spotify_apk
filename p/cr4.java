package p.cr4;
import p.z1;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import p.br4;
import p.xu4;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.MaybeObserver;

public final class cr4 extends z1	// class@001262 from classes.dex
{
    public final int b;
    public final MaybeSource c;

    public void cr4(Observable p0,MaybeSource p1,int p2){
       this.b = p2;
       this.c = p1;
    }
    public final void subscribeActual(Observer p0){
       z1 ta = this.a;
       cr4 tc = this.c;
       switch (this.b){
           case 0:
           default:
             xu4 oxu4 = new xu4(p0);
             p0.onSubscribe(oxu4);
             ta.subscribe(oxu4);
             tc.subscribe(oxu4.c);
             return;
       }
       ta.subscribe(new br4(p0, tc));
       return;
    }
}
