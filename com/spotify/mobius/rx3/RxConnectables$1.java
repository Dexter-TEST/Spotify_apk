package com.spotify.mobius.rx3.RxConnectables$1;
import p.xo0;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.lang.Object;
import p.hr0;
import p.ap0;
import p.an5;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.mobius.rx3.RxConnectables$1$1;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import com.spotify.mobius.rx3.RxConnectables$1$2;

class RxConnectables$1 implements xo0	// class@000a86 from classes.dex
{
    public final ObservableTransformer a;

    public void RxConnectables$1(ObservableTransformer p0){
       this.a = p0;
       super();
    }
    public final ap0 d(hr0 p0){
       an5 uoan5 = new an5();
       return new RxConnectables$1$2(uoan5, uoan5.compose(this.a).subscribe(new RxConnectables$1$1(p0)));
    }
}
