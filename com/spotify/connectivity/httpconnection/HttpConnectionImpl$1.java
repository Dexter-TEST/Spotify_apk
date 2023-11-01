package com.spotify.connectivity.httpconnection.HttpConnectionImpl$1;
import p.da0;
import com.spotify.connectivity.httpconnection.HttpConnectionImpl;
import com.spotify.core.http.HttpConnection;
import java.lang.Object;
import java.io.IOException;
import java.lang.Throwable;
import java.lang.String;
import com.spotify.base.java.logging.Logger;
import java.net.SocketTimeoutException;
import p.t90;
import p.cx5;
import p.sm2;
import p.mp2;
import p.sm5;
import com.spotify.core.http.HttpResponse;
import p.bv5;
import p.ps2;
import p.g70;
import p.fx5;

class HttpConnectionImpl$1 implements da0	// class@00073b from classes.dex
{
    final HttpConnectionImpl this$0;
    final HttpConnection val$httpConnection;

    public void HttpConnectionImpl$1(HttpConnectionImpl p0,HttpConnection p1){
       this.this$0 = p0;
       this.val$httpConnection = p1;
       super();
    }
    private void reportException(IOException p0){
       Object[] objArray = new Object[0];
       Logger.c(p0, "Exception on getting result data", objArray);
       if (p0 instanceof SocketTimeoutException) {
          this.val$httpConnection.onError(HttpConnection.kErrorHttpTimeout);
       }else if(HttpConnectionImpl.access$000(this.this$0)){
          this.val$httpConnection.onError(HttpConnection.kErrorHttpAborted);
       }else {
          this.val$httpConnection.onError(HttpConnection.kErrorHttpFail);
       }
       return;
    }
    public void onFailure(t90 p0,IOException p1){
       this.reportException(p1);
    }
    public void onResponse(t90 p0,cx5 p1){
       cx5 t;
       sm2 osm2;
       int i;
       try{
          if ((t = p1.t) != 307 && t != 308) {
             switch (t){
                 case 300:
                 case 302:
                 case 303:
                 case 301:
                   break;
                 default:
                   osm2 = 0;
             }
             if (t) {
                this.val$httpConnection.onRedirect();
             }
             osm2 = p1.w.d();
             osm2.b("SPT-Protocol", p1.b.a);
             this.val$httpConnection.onHeaders(new HttpResponse(p1.t, p1.a.a.i, osm2.e().toString()));
             if ((t = p1.x) != null) {
                byte[] uobyteArray = new byte[8192];
                while ((i = t.y().read(uobyteArray)) != -1) {
                   this.val$httpConnection.onBytesAvailable(uobyteArray, i);
                }
             }
             this.val$httpConnection.onComplete();
          }
          t = 1;
       }catch(java.io.IOException e5){
          this.reportException(e5);
       }
       p1.close();
       return;
    }
}
