package p.m60;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.View;
import p.ob2;
import android.content.Context;
import p.l60;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.graphics.Paint;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.j60;
import android.webkit.WebViewClient;
import p.om7;
import java.lang.Void;
import android.os.AsyncTask;
import p.t50;

public final class m60	// class@001e30 from classes.dex
{
    public boolean a;
    public boolean b;
    public ob2 c;
    public boolean d;
    public String e;
    public boolean f;
    public Dialog g;
    public static m60 h;

    public void m60(){
       super();
       this.c = null;
       this.d = false;
    }
    public static m60 b(){
       if (m60.h == null) {
          m60.h = new m60();
       }
       return m60.h;
    }
    public static void d(ViewGroup p0){
       AlphaAnimation uAlphaAnimat = new AlphaAnimation(0.10f, 0x3f800000);
       uAlphaAnimat.setDuration(500);
       uAlphaAnimat.setStartOffset(10);
       uAlphaAnimat.setInterpolator(new AccelerateInterpolator());
       uAlphaAnimat.setFillAfter(true);
       p0.setVisibility(0);
       p0.startAnimation(uAlphaAnimat);
    }
    public final void a(ob2 p0,Context p1,l60 p2){
       if (p1 != null && p0 != null) {
          WebView webView = new WebView(p1);
          webView.getSettings().setJavaScriptEnabled(true);
          webView.setLayerType(2, null);
          this.f = false;
          if (!TextUtils.isEmpty(p0.w)) {
             webView.loadDataWithBaseURL(null, p0.w, "text/html", "utf-8", null);
             webView.setWebViewClient(new j60(this, p0, p2, webView));
          }
       }
       return;
    }
    public final boolean c(ob2 p0,Context p1,l60 p2){
       if (this.a == null && this.d == null) {
          this.a = false;
          this.b = false;
          if (p1 != null && p0 != null) {
             if (ob2.a(p1, p0)) {
                if (!TextUtils.isEmpty(p0.w)) {
                   this.a(p0, p1, p2);
                }else {
                   this.d = true;
                   Void[] voidArray = new Void[false];
                   new om7(this, p0, p1, p2).execute(voidArray);
                }
                return true;
             }else if(p2 != null){
                p2.n(p0.t);
             }
          }
          return false;
       }else if(p2 != null){
          p2.n(p0.t);
       }
       return false;
    }
}
