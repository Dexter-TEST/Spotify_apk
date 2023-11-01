package com.spotify.connectivity.productstateesperanto.RxProductStateImpl;
import com.spotify.connectivity.productstate.RxProductState;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import p.r45;
import p.d16;
import p.yf2;
import p.c16;
import p.xy;
import p.bi5;
import p.hl5;

public class RxProductStateImpl implements RxProductState	// class@0007fd from classes.dex
{
    private final Observable mProductState;

    public void RxProductStateImpl(Observable p0){
       super();
       this.mProductState = p0;
    }
    public static r45 a(String p0,Map p1){
       return RxProductStateImpl.lambda$productStateKeyV2$1(p0, p1);
    }
    public static String b(String p0,String p1,Map p2){
       return RxProductStateImpl.lambda$productStateKeyOr$2(p0, p1, p2);
    }
    public static r45 c(String p0,Map p1){
       return RxProductStateImpl.lambda$productStateKey$0(p0, p1);
    }
    private static r45 lambda$productStateKey$0(String p0,Map p1){
       return r45.a(p1.get(p0));
    }
    private static String lambda$productStateKeyOr$2(String p0,String p1,Map p2){
       if ((p0 = p2.get(p0)) == null) {
       }else {
          p1 = p0;
       }
       return p1;
    }
    private static r45 lambda$productStateKeyV2$1(String p0,Map p1){
       return r45.a(p1.get(p0));
    }
    public Observable productState(){
       return this.mProductState;
    }
    public Observable productStateKey(String p0){
       return this.mProductState.map(new d16(p0, 1)).distinctUntilChanged();
    }
    public Observable productStateKeyOr(String p0,String p1){
       return this.mProductState.map(new c16(p0, 0, p1)).distinctUntilChanged();
    }
    public Observable productStateKeyV2(String p0){
       return this.mProductState.map(new d16(p0, 0)).filter(new xy()).map(new hl5(3)).distinctUntilChanged();
    }
}
