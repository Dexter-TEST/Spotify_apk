package com.spotify.remoteconfig.fetcher.worker.FetchPropertiesWorker;
import androidx.work.rxjava3.RxWorker;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.lang.Object;
import java.lang.String;
import p.co5;
import io.reactivex.rxjava3.core.Single;
import p.fm3;
import p.d22;
import p.h51;
import java.util.HashMap;
import java.lang.Integer;
import p.ao2;
import p.sc;
import p.ti3;
import p.tt5;
import p.ge6;
import p.t37;
import java.lang.Class;
import p.bm3;
import p.hs0;
import p.ir0;
import p.mf1;
import p.yf2;

public class FetchPropertiesWorker extends RxWorker	// class@000bfa from classes.dex
{
    public ti3 x;

    public void FetchPropertiesWorker(Context p0,WorkerParameters p1){
       co5.o(p0, "context");
       co5.o(p1, "workerParams");
       super(p0, p1);
    }
    public final Single h(){
       Single single1;
       d22 a = d22.a;
       String obj = this.b.b.a.get("FETCH_TYPE");
       int i = 0;
       int i1 = (obj instanceof Integer)? obj.intValue(): 0;
       if (i1) {
          if (i1 != 1) {
             if (i1 != 2) {
                if (i1 != 3) {
                   if (i1 != 4) {
                      a = (i1 != 5)? d22.x: d22.w;
                   }else {
                      a = d22.v;
                   }
                }else {
                   a = d22.t;
                }
             }else {
                a = d22.c;
             }
          }else {
             a = d22.b;
          }
       }
       obj = "applicationContext";
       fm3 ta = this.a;
       try{
          co5.l(ta, obj);
          if (ta instanceof ao2) {
             ta.d().a(this);
          }
       }catch(java.lang.IllegalArgumentException e0){
       }
       FetchPropertiesWorker tx = this.x;
       Single single = null;
       if (tx != null) {
          if (tx != null) {
             if (tx.get() != null) {
                if ((tx = this.x) != null) {
                   single = tx.get();
                }else {
                   co5.N("remoteConfigurationFetcher");
                   throw single;
                }
             }
          }else {
             co5.N("remoteConfigurationFetcher");
             throw single;
          }
       }
       if (single == null) {
          Object[] objArray = new Object[i];
          t37.a().getClass();
          ge6.f(objArray);
          single1 = Single.just(new bm3());
          co5.l(single1, "just\(Result.failure\(\)\)");
          return single1;
       }else {
          single1 = single.a(a).doOnSubscribe(new hs0(12, a)).map(new mf1(10, a));
          co5.l(single1, "fetchType = inputData.ge…          }\n            }");
          return single1;
       }
    }
}
