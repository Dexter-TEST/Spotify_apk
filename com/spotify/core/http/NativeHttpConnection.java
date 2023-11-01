package com.spotify.core.http.NativeHttpConnection;
import com.spotify.core.http.HttpConnection;
import com.spotify.core.http.NativeHttpConnection$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import com.spotify.core.http.HttpConnectionDelegate;
import com.spotify.core.http.HttpConnectionFactory;
import java.lang.String;
import p.co5;
import com.spotify.core.http.HttpResponse;
import com.spotify.core.http.HttpRequest;
import com.spotify.core.http.HttpOptions;

public class NativeHttpConnection implements HttpConnection	// class@000878 from classes.dex
{
    private final HttpConnectionDelegate delegate;
    private long nThis;
    public static final NativeHttpConnection$Companion Companion;
    private static HttpConnectionFactory sFactory;

    static {
       NativeHttpConnection.Companion = new NativeHttpConnection$Companion(null);
    }
    public void NativeHttpConnection(){
       HttpConnectionFactory sFactory;
       super();
       if ((sFactory = NativeHttpConnection.sFactory) != null) {
          this.delegate = sFactory.createDelegate();
          return;
       }else {
          co5.N("sFactory");
          throw null;
       }
    }
    public static final void access$setSFactory$cp(HttpConnectionFactory p0){
       NativeHttpConnection.sFactory = p0;
    }
    public static final void initialize(HttpConnectionFactory p0){
       NativeHttpConnection.Companion.initialize(p0);
    }
    public void abort(){
       this.delegate.abort();
    }
    public boolean isRequestStarted(){
       return this.delegate.isRequestStarted();
    }
    public native void onBytesAvailable(byte[] p0,int p1);
    public native void onComplete();
    public native void onError(int p0);
    public native void onHeaders(HttpResponse p0);
    public native void onRedirect();
    public void send(HttpRequest p0,HttpOptions p1){
       co5.o(p0, "request");
       co5.o(p1, "options");
       this.delegate.send(this, p0, p1);
    }
}
