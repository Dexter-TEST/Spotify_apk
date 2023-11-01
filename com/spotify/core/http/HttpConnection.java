package com.spotify.core.http.HttpConnection;
import com.spotify.core.http.HttpConnection$Companion;
import com.spotify.core.http.HttpResponse;
import com.spotify.core.http.HttpRequest;
import com.spotify.core.http.HttpOptions;

public interface abstract HttpConnection	// class@000871 from classes.dex
{
    public static final HttpConnection$Companion Companion;
    public static final String kDefaultContentType;
    public static final int kErrorClassHttp;
    public static final int kErrorHttpAborted;
    public static final int kErrorHttpBadRange;
    public static final int kErrorHttpBadReply;
    public static final int kErrorHttpBadTransferEncoding;
    public static final int kErrorHttpConnectFail;
    public static final int kErrorHttpConnectTimeout;
    public static final int kErrorHttpFail;
    public static final int kErrorHttpGzipDecode;
    public static final int kErrorHttpInvalidUrl;
    public static final int kErrorHttpTimeout;
    public static final int kErrorHttpTooManyRedirects;
    public static final int kErrorSuccess;

    static {
       HttpConnection.Companion = HttpConnection$Companion.$$INSTANCE;
       HttpConnection.kErrorClassHttp = 300;
       HttpConnection.kErrorHttpConnectTimeout = 300 + 1;
       HttpConnection.kErrorHttpConnectFail = 300 + 2;
       HttpConnection.kErrorHttpInvalidUrl = 300 + 3;
       HttpConnection.kErrorHttpBadReply = 300 + 4;
       HttpConnection.kErrorHttpBadRange = 300 + 5;
       HttpConnection.kErrorHttpTooManyRedirects = 300 + 6;
       HttpConnection.kErrorHttpBadTransferEncoding = 300 + 7;
       HttpConnection.kErrorHttpTimeout = 300 + 8;
       HttpConnection.kErrorHttpFail = 300 + 9;
       HttpConnection.kErrorHttpGzipDecode = 300 + 10;
       HttpConnection.kErrorHttpAborted = 300 + 11;
       HttpConnection.kDefaultContentType = "text/plain";
    }
    void abort();
    boolean isRequestStarted();
    void onBytesAvailable(byte[] p0,int p1);
    void onComplete();
    void onError(int p0);
    void onHeaders(HttpResponse p0);
    void onRedirect();
    void send(HttpRequest p0,HttpOptions p1);
}
