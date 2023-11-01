package com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder$2;
import p.ir0;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.lang.Object;
import java.lang.Throwable;
import com.spotify.mobius.rx3.EffectHandlerException;
import java.lang.StackTraceElement;
import java.lang.Class;
import java.lang.String;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

class RxMobius$SubtypeEffectHandlerBuilder$2 implements ir0	// class@000a8a from classes.dex
{
    public final ObservableTransformer a;

    public void RxMobius$SubtypeEffectHandlerBuilder$2(ObservableTransformer p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       EffectHandlerException uEffectHandl = new EffectHandlerException(p0);
       p0 = uEffectHandl.getStackTrace();
       p0[0] = new StackTraceElement(this.a.getClass().getName(), "apply", null, -1);
       uEffectHandl.setStackTrace(p0);
       RxJavaPlugins.c(uEffectHandl);
    }
}
