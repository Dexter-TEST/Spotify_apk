package com.spotify.connectivity.httpconnection.HttpConnectionImpl;
import com.spotify.core.http.HttpConnectionDelegate;
import p.g15;
import java.lang.Object;
import java.util.Map;
import java.lang.String;
import com.spotify.core.http.HttpConnection;
import com.spotify.core.http.HttpOptions;
import p.f15;
import java.util.concurrent.TimeUnit;
import p.co5;
import p.we7;
import p.lp5;
import com.spotify.core.http.HttpRequest;
import p.zu5;
import com.spotify.clientfoundations.jvm.jni.NativeHelpers;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.is7;
import com.spotify.base.java.logging.Logger;
import p.u54;
import p.gg1;
import p.ev5;
import p.fv5;
import p.bv5;
import p.sm2;
import p.t90;
import com.spotify.connectivity.httpconnection.HttpConnectionImpl$1;
import p.da0;
import java.lang.Throwable;

public class HttpConnectionImpl implements HttpConnectionDelegate	// class@00073c from classes.dex
{
    private t90 mCall;
    private final g15 mHttpClient;
    private boolean mIsAborted;
    private bv5 mRequest;
    private static final int BUFFER_SIZE = 8192;

    public void HttpConnectionImpl(g15 p0){
       super();
       this.mHttpClient = p0;
    }
    public static boolean access$000(HttpConnectionImpl p0){
       return p0.mIsAborted;
    }
    private static String getMediaType(Map p0){
       String str;
       if ((str = p0.get("Content-Type")) != null) {
       }else {
          str = HttpConnection.kDefaultContentType;
       }
       return str;
    }
    private g15 mutateHttpClient(HttpOptions p0){
       f15 uof15;
       TimeUnit mILLISECONDS;
       HttpConnectionImpl tmHttpClient = this.mHttpClient;
       if (((long)tmHttpClient.Q - p0.getTimeout()) && ((long)tmHttpClient.R - p0.getTimeout())) {
          uof15 = new f15(tmHttpClient);
          mILLISECONDS = TimeUnit.MILLISECONDS;
          co5.o(mILLISECONDS, "unit");
          uof15.z = we7.b(p0.getTimeout(), mILLISECONDS);
          uof15.A = we7.b(p0.getTimeout(), mILLISECONDS);
          tmHttpClient = new g15(uof15);
       }
       if ((long)tmHttpClient.P - p0.getConnectTimeout()) {
          uof15 = new f15(tmHttpClient);
          mILLISECONDS = TimeUnit.MILLISECONDS;
          co5.o(mILLISECONDS, "unit");
          uof15.y = we7.b(p0.getConnectTimeout(), mILLISECONDS);
          tmHttpClient = new g15(uof15);
       }
       if (tmHttpClient.y != p0.isFollowRedirects()) {
          uof15 = new f15(tmHttpClient);
          uof15.h = p0.isFollowRedirects();
          tmHttpClient = new g15(uof15);
       }
       return tmHttpClient;
    }
    public void abort(){
       this.mIsAborted = true;
       if (this.mCall != null) {
          this.mCall.cancel();
       }
       return;
    }
    public boolean isRequestStarted(){
       boolean b = (this.mRequest != null)? true: false;
       return b;
    }
    public void send(HttpConnection p0,HttpRequest p1,HttpOptions p2){
       Object[] objArray;
       ev5 uoev5;
       int i = 2;
       int i1 = 0;
       try{
          zu5 ozu5 = new zu5();
          ozu5.g(p1.getUrl());
          Map map = NativeHelpers.byteArrayToMap(p1.getHeaders());
          Iterator iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             ozu5.d(key, uEntry.getValue());
          }
          if (is7.v(p1.getMethod())) {
             if (is7.y(p1.getMethod()) && p1.getBody() == null) {
                Object[] objArray1 = new Object[i];
                objArray1[i1] = p1.getMethod();
                objArray1[1] = p1.getUrl();
                Logger.i("%s %s must have a request body", objArray1);
                p0.onError(HttpConnection.kErrorHttpFail);
                return;
             }else {
                String mediaType = HttpConnectionImpl.getMediaType(map);
                if (p1.getBody() != null) {
                   uoev5 = fv5.c(gg1.P(mediaType), p1.getBody());
                label_0088 :
                   ozu5.e(p1.getMethod(), uoev5);
                   this.mRequest = ozu5.b();
                   String str = "client-token";
                   if (map.containsKey(str)) {
                      ozu5.c.g(str);
                      ozu5.a(str, "<redacted>");
                   }
                   str = "Authorization";
                   if (map.containsKey(str)) {
                      ozu5.c.g(str);
                      ozu5.a(str, "<redacted>");
                   }
                   objArray = new Object[]{ozu5.b()};
                   Logger.e("Starting request: %s", objArray);
                   this.mCall = this.mutateHttpClient(p2).a(this.mRequest);
                   this.mCall.e(new HttpConnectionImpl$1(this, p0));
                   return;
                }
             }
          }
          uoev5 = null;
          goto label_0088 ;
       }catch(java.lang.IllegalArgumentException e11){
          objArray = new Object[i];
          objArray[i1] = p1.getMethod();
          objArray[1] = p1.getUrl();
          Logger.j(e11, "Error when trying to create request %s \(%s\).", objArray);
          p0.onError(HttpConnection.kErrorHttpInvalidUrl);
          return;
       }
    }
}
