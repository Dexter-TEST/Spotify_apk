package com.spotify.offline.NativeForegroundProvider;
import p.ze4;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.jl1;
import com.spotify.offline.NativeForegroundObserver;
import java.lang.Boolean;
import java.lang.Class;
import p.mg1;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;

public final class NativeForegroundProvider	// class@000ab3 from classes.dex
{
    private final Observable foreground;
    private Disposable subscription;
    public static final ze4 Companion;

    static {
       NativeForegroundProvider.Companion = new ze4();
    }
    public void NativeForegroundProvider(Observable p0){
       co5.o(p0, "foreground");
       super();
       this.foreground = p0;
       this.subscription = jl1.a;
    }
    public static void a(NativeForegroundObserver p0,Boolean p1){
       NativeForegroundProvider.observe$lambda-0(p0, p1);
    }
    public static final NativeForegroundProvider noop(){
       NativeForegroundProvider.Companion.getClass();
       Observable observable = Observable.empty();
       co5.l(observable, "empty<Boolean>\(\)");
       return new NativeForegroundProvider(observable);
    }
    private static final void observe$lambda-0(NativeForegroundObserver p0,Boolean p1){
       co5.o(p0, "$observer");
       co5.l(p1, "it");
       p0.onForeground(p1.booleanValue());
    }
    public final Observable getForeground(){
       return this.foreground;
    }
    public final void observe(NativeForegroundObserver p0){
       co5.o(p0, "observer");
       this.subscription = this.foreground.subscribe(new mg1(21, p0));
    }
    public final void stop(){
       this.subscription.dispose();
    }
}
