package com.spotify.mobius.rx3.MobiusEffectRouter$1;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.util.HashSet;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import com.spotify.mobius.rx3.MobiusEffectRouter$1$2;
import p.bi5;
import com.spotify.mobius.rx3.MobiusEffectRouter$1$1;
import p.yf2;

class MobiusEffectRouter$1 implements ObservableTransformer	// class@000a82 from classes.dex
{
    public final Set a;

    public void MobiusEffectRouter$1(HashSet p0){
       this.a = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       return p0.filter(new MobiusEffectRouter$1$2(this)).map(new MobiusEffectRouter$1$1());
    }
}
