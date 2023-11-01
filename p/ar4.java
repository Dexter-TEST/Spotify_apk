package p.ar4;
import p.z1;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import p.zq4;
import p.wu4;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.CompletableObserver;

public final class ar4 extends z1	// class@000fdb from classes.dex
{
    public final int b;
    public final CompletableSource c;

    public void ar4(Observable p0,CompletableSource p1,int p2){
       this.b = p2;
       this.c = p1;
    }
    public final void subscribeActual(Observer p0){
       z1 ta = this.a;
       ar4 tc = this.c;
       switch (this.b){
           case 0:
           default:
             wu4 owu4 = new wu4(p0);
             p0.onSubscribe(owu4);
             ta.subscribe(owu4);
             tc.subscribe(owu4.c);
             return;
       }
       ta.subscribe(new zq4(p0, tc));
       return;
    }
}
