package p.yz4;
import rxdogtag2.ObserverHandler;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.Flowable;
import p.iv6;

public abstract class yz4	// class@0003e8 from classes2.dex
{

    public static CompletableObserver a(ObserverHandler p0,Completable p1,CompletableObserver p2){
       return p2;
    }
    public static MaybeObserver b(ObserverHandler p0,Maybe p1,MaybeObserver p2){
       return p2;
    }
    public static Observer c(ObserverHandler p0,Observable p1,Observer p2){
       return p2;
    }
    public static SingleObserver d(ObserverHandler p0,Single p1,SingleObserver p2){
       return p2;
    }
    public static iv6 e(ObserverHandler p0,Flowable p1,iv6 p2){
       return p2;
    }
}
