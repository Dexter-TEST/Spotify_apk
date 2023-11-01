package com.spotify.connectivity.httpretrofit.RetrofitMaker;
import p.cy5;
import com.spotify.connectivity.httpretrofit.RetrofitMaker$Assertion;
import java.lang.Object;
import java.lang.Class;
import com.spotify.connectivity.httpretrofit.BuildConfig;
import p.cn7;
import java.lang.annotation.Annotation;
import p.tm7;
import java.lang.String;
import p.ps2;
import p.ds7;
import p.os2;

public class RetrofitMaker	// class@000743 from classes.dex
{
    private final RetrofitMaker$Assertion mAssertion;
    private final cy5 mRetrofitWebgate;

    public void RetrofitMaker(cy5 p0,RetrofitMaker$Assertion p1){
       super();
       this.mRetrofitWebgate = p0;
       this.mAssertion = p1;
    }
    private static Object doCreateService(cy5 p0,Class p1,RetrofitMaker$Assertion p2){
       if (BuildConfig.DEBUG) {
          int i = 0;
          boolean b = (p1.getAnnotation(cn7.class) == null && p1.getAnnotation(tm7.class) == null)? false: true;
          Object[] objArray = new Object[i];
          p2.assertTrue(b, "Retrofit interface should have @WebgateService or @WebService", objArray);
       }
       return p0.b(p1);
    }
    public Object createCustomHostService(Class p0,ps2 p1){
       RetrofitMaker tmRetrofitWe = this.mRetrofitWebgate;
       tmRetrofitWe.getClass();
       ds7 uods7 = new ds7(tmRetrofitWe);
       uods7.d(p1);
       return RetrofitMaker.doCreateService(uods7.e(), p0, this.mAssertion);
    }
    public Object createExperimentalWebgateService(Class p0){
       os2 oos2 = this.mRetrofitWebgate.c.f();
       oos2.e("exp.wg.spotify.com");
       return this.createCustomHostService(p0, oos2.b());
    }
    public Object createWebgateService(Class p0){
       return RetrofitMaker.doCreateService(this.mRetrofitWebgate, p0, this.mAssertion);
    }
}
