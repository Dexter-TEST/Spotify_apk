package com.spotify.mobius.rx3.MergedTransformer;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.util.ArrayList;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import com.spotify.mobius.rx3.MergedTransformer$1;
import p.yf2;

class MergedTransformer implements ObservableTransformer	// class@000a7f from classes.dex
{
    public final Iterable a;

    public void MergedTransformer(ArrayList p0){
       super();
       this.a = p0;
    }
    public final ObservableSource apply(Observable p0){
       return p0.publish(new MergedTransformer$1(this));
    }
}
