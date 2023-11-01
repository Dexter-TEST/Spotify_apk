package com.spotify.mobius.rx3.MergedTransformer$1;
import p.yf2;
import com.spotify.mobius.rx3.MergedTransformer;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import io.reactivex.rxjava3.core.ObservableTransformer;

class MergedTransformer$1 implements yf2	// class@000a7e from classes.dex
{
    public final MergedTransformer a;

    public void MergedTransformer$1(MergedTransformer p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.a.a.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(p0.compose(iterator.next()));
       }
       return Observable.merge(uArrayList);
    }
}
