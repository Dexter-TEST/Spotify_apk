package p.xm7;
import android.webkit.WebViewClient;
import p.ym7;
import android.net.Uri;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import com.spotify.base.java.logging.Logger;
import java.lang.Boolean;
import p.t00;
import android.webkit.WebView;
import java.lang.Class;
import android.graphics.Bitmap;
import java.lang.Integer;
import android.webkit.SslErrorHandler;
import android.net.http.SslError;
import android.webkit.WebResourceRequest;

public final class xm7 extends WebViewClient	// class@002caa from classes.dex
{
    public final ym7 a;

    public void xm7(ym7 p0){
       this.a = p0;
       super();
    }
    public final boolean a(Uri p0){
       Object[] objArray = new Object[0];
       Logger.e("shouldOverrideUrlLoading\("+p0.toString()+"\)", objArray);
       xm7 ta = this.a;
       if (ta.w()) {
          return true;
       }
       ta.E.onNext(Boolean.TRUE);
       if (ta.C == null) {
          ta.B = true;
       }
       ta.C = false;
       return 0;
    }
    public final void onPageFinished(WebView p0,String p1){
       int i = 1;
       Object[] objArray = new Object[i];
       objArray[0] = p1;
       Logger.e("Page finished loading: %s", objArray);
       xm7 ta = this.a;
       ta.E.onNext(Boolean.FALSE);
       if (ta.B != null) {
          ta.B = false;
       }else {
          ta.C = i;
          if (ta.z == 3 && ta.A == null) {
             ta.y(2);
          }
       }
       ta.getClass();
       return;
    }
    public final void onPageStarted(WebView p0,String p1,Bitmap p2){
       int i = 2;
       Object[] objArray = new Object[i];
       int i1 = 0;
       objArray[i1] = p1;
       xm7 ta = this.a;
       String str = (ta.A != null)? " \(error\)": "";
       objArray[1] = str;
       Logger.e("Page started loading: %s%s", objArray);
       ta.A = i1;
       ta.C = i1;
       if (ta.z != 3) {
          ta.y(i);
       }
       ta.getClass();
       ta.E.onNext(Boolean.TRUE);
       return;
    }
    public final void onReceivedError(WebView p0,int p1,String p2,String p3){
       Object[] objArray = new Object[]{Integer.valueOf(p1),p2,p3};
       Logger.i("Error %d %s when loading: %s", objArray);
       xm7 ta = this.a;
       ta.y(3);
       ta.A = true;
       ta.getClass();
    }
    public final void onReceivedSslError(WebView p0,SslErrorHandler p1,SslError p2){
       Object[] objArray = new Object[]{p2};
       Logger.i("SSL error: %s", objArray);
       xm7 ta = this.a;
       ta.getClass();
       ta.y(3);
       ta.A = true;
       p1.cancel();
    }
    public final boolean shouldOverrideUrlLoading(WebView p0,WebResourceRequest p1){
       return this.a(p1.getUrl());
    }
    public final boolean shouldOverrideUrlLoading(WebView p0,String p1){
       return this.a(Uri.parse(p1));
    }
}
