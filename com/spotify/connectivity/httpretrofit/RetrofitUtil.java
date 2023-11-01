package com.spotify.connectivity.httpretrofit.RetrofitUtil;
import java.lang.Object;
import p.so4;
import p.ro4;
import p.g15;
import p.cd4;
import io.reactivex.rxjava3.core.Scheduler;
import p.cy5;
import java.lang.String;
import p.os2;
import p.ps2;
import p.ds7;
import java.util.Objects;
import p.v06;
import p.u90;
import p.d36;
import p.qu0;
import p.nm5;
import p.be3;
import java.lang.NullPointerException;

public final class RetrofitUtil	// class@000744 from classes.dex
{

    private void RetrofitUtil(){
       super();
    }
    private static ro4 makeObjectMapper(so4 p0){
       throw null;
    }
    public static cy5 prepareRetrofit(g15 p0,cd4 p1,Scheduler p2){
       return RetrofitUtil.prepareRetrofit(p0, null, p1, "spclient.wg.spotify.com", p2);
    }
    private static cy5 prepareRetrofit(g15 p0,ro4 p1,cd4 p2,String p3,Scheduler p4){
       os2 oos2 = new os2();
       oos2.g("https");
       oos2.e(p3);
       ps2 ops2 = oos2.b();
       ds7 uods7 = new ds7();
       uods7.d(ops2);
       Objects.requireNonNull(p0, "client == null");
       uods7.d = p0;
       if (p4 == null) {
          throw new NullPointerException("scheduler == null");
       }
       uods7.a(new v06(p4, false));
       uods7.b(new d36());
       uods7.b(new nm5());
       uods7.b(p2);
       if (p1 != null) {
          uods7.b(new be3(p1));
       }
       return uods7.e();
    }
    public static cy5 prepareRetrofit(g15 p0,so4 p1,cd4 p2,Scheduler p3){
       return RetrofitUtil.prepareRetrofit(p0, RetrofitUtil.makeObjectMapper(p1), p2, "spclient.wg.spotify.com", p3);
    }
}
