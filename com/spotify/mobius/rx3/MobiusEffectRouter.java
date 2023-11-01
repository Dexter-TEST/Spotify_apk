package com.spotify.mobius.rx3.MobiusEffectRouter;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.util.Set;
import java.util.Collection;
import java.lang.Object;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import com.spotify.mobius.rx3.MobiusEffectRouter$1;
import com.spotify.mobius.rx3.MergedTransformer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;

class MobiusEffectRouter implements ObservableTransformer	// class@000a83 from classes.dex
{
    public final MergedTransformer a;

    public void MobiusEffectRouter(Set p0,Collection p1){
       super();
       ArrayList uArrayList = new ArrayList(Collections.unmodifiableList(new ArrayList(p1)));
       uArrayList.add(new MobiusEffectRouter$1(new HashSet(p0)));
       this.a = new MergedTransformer(uArrayList);
    }
    public final ObservableSource apply(Observable p0){
       return p0.compose(this.a);
    }
}
