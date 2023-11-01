package com.spotify.connectivity.httpwebgate.WebgateAuthorizer;
import p.pb3;
import com.spotify.connectivity.httpwebgate.WebgateAuthorizer$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.connectivity.httpwebgate.WebgateHelper;
import p.tm5;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ob3;
import p.bv5;
import p.cx5;
import java.lang.Class;
import p.zu5;
import java.lang.StringBuilder;
import p.yp5;
import p.mp2;
import java.util.LinkedHashMap;
import java.util.Map;
import p.q14;
import p.sm2;
import p.we7;
import p.ml1;
import java.util.Collections;
import p.ps2;
import p.fv5;
import java.lang.IllegalStateException;
import p.c90;
import com.spotify.connectivity.httpwebgate.WebgateTokenProvider;
import p.fx5;
import java.lang.Throwable;
import com.spotify.base.java.logging.Logger;
import p.ax5;
import p.sm5;
import p.u54;
import p.gg1;
import p.ex5;

public final class WebgateAuthorizer implements pb3	// class@000748 from classes.dex
{
    private final tm5 tokenManager;
    private final WebgateHelper webgateHelper;
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String AUTHORIZATION_PREFIX = "Bearer ";
    public static final int COSMOS_TIMEOUT_MS = 10000;
    public static final WebgateAuthorizer$Companion Companion;

    static {
       WebgateAuthorizer.Companion = new WebgateAuthorizer$Companion(null);
    }
    public void WebgateAuthorizer(WebgateHelper p0,tm5 p1){
       co5.o(p0, "webgateHelper");
       co5.o(p1, "tokenManager");
       super();
       this.webgateHelper = p0;
       this.tokenManager = p1;
    }
    private final cx5 authenticatedRequest(ob3 p0,bv5 p1,String p2){
       p1.getClass();
       zu5 ozu5 = new zu5(p1);
       ozu5.a("Authorization", "Bearer "+p2);
       return p0.b(ozu5.b());
    }
    public cx5 intercept(ob3 p0){
       ml1 a1;
       bv5 a1;
       co5.o(p0, "chain");
       yp5 oyp5 = p0;
       yp5 e = oyp5.e;
       String str = "No-Webgate-Authentication";
       bv5 c = e.c;
       bv5 a = e.a;
       if (e.c.a(str) != null) {
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          bv5 b = e.b;
          bv5 d = e.d;
          bv5 e1 = e.e;
          linkedHashMa = (e1.isEmpty())? new LinkedHashMap(): q14.t0(e1);
          sm2 osm2 = c.d();
          osm2.g(str);
          if (a != null) {
             mp2 omp2 = osm2.e();
             if (linkedHashMa.isEmpty()) {
                a1 = ml1.a;
             }else {
                a1 = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMa));
                co5.l(a1, "{\n    Collections.unmodi…(LinkedHashMap\(this\)\)\n  }");
             }
             a1 = new bv5(a, b, omp2, d, a1);
             return oyp5.b(a1);
          }else {
             throw new IllegalStateException("url == null".toString());
          }
       }else if(e.a().j != null){
          return oyp5.b(e);
       }else if(this.webgateHelper.isWebgateRequest(e) && !this.webgateHelper.hasNoAuthTag(e)){
          String str1 = ((str1 = c.a("Authorization")) != null && str1.length())? 0: 1;
          if (str1) {
             try{
                cx5 uocx5 = this.authenticatedRequest(p0, e, this.tokenManager.get().requestAccessToken(0x2710));
                if (uocx5.t == 401 && cx5.f(uocx5, "client-token-error") == null) {
                   if ((uocx5 = uocx5.x) != null) {
                      uocx5.close();
                   }
                   uocx5 = this.authenticatedRequest(p0, e, this.tokenManager.get().requestAccessToken(0x2710, true));
                }
                return uocx5;
             }catch(com.spotify.connectivity.httpwebgate.WebgateTokenProvider$WebgateTokenException e12){
                String str2 = "Could not retrieve access token for a webgate request: "+a+" with error: "+e12.getMessage();
                Object[] objArray = new Object[]{str2,e.b,a};
                Logger.b("%s: %s %s", objArray);
                ax5 uoax5 = new ax5();
                uoax5.a = e;
                uoax5.c = 503;
                uoax5.b = sm5.c;
                uoax5.g = gg1.s(str2, gg1.C("plain/text"));
                uoax5.d = str2;
                return uoax5.a();
             }
          }
       }
       return oyp5.b(e);
    }
}
