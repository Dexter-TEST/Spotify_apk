package p.lm7;
import android.webkit.WebViewClient;
import p.rm7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.t01;
import android.webkit.WebView;
import java.lang.Class;
import android.app.Dialog;
import android.view.View;
import android.widget.ImageView;
import android.graphics.Bitmap;
import p.sz1;
import p.jy1;
import java.lang.Exception;
import android.webkit.SslErrorHandler;
import android.net.http.SslError;
import android.net.Uri;
import java.lang.CharSequence;
import java.util.regex.Pattern;
import p.av6;
import android.os.Bundle;
import android.os.BaseBundle;
import p.ej4;
import java.lang.Integer;
import p.ny1;
import p.mm7;
import p.oz1;
import p.tz1;
import android.content.Context;
import android.content.Intent;

public final class lm7 extends WebViewClient	// class@001d83 from classes.dex
{
    public final int a;
    public final View$OnCreateContextMenuListener b;

    public void lm7(rm7 p0){
       this.a = 0;
       co5.o(p0, "this$0");
       this.b = p0;
       super();
    }
    public void lm7(t01 p0){
       this.a = 1;
       this.b = p0;
       super();
    }
    public final void doUpdateVisitedHistory(WebView p0,String p1,boolean p2){
       switch (this.a){
           case 1:
             if (p1 == null) {
                super.doUpdateVisitedHistory(p0, p1, p2);
                return;
             }else {
                this.b.getClass();
                co5.N("eventDelegate");
                throw null;
             }
             break;
       }
       super.doUpdateVisitedHistory(p0, p1, p2);
       return;
    }
    public final void onPageFinished(WebView p0,String p1){
       lm7 tb;
       rm7 v;
       switch (this.a){
           case 0:
             co5.o(p0, "view");
             co5.o(p1, "url");
             super.onPageFinished(p0, p1);
             tb = this.b;
             if (tb.A == null && (v = tb.v) != null) {
                v.dismiss();
             }
             if ((v = tb.x) != null) {
                v.setBackgroundColor(0);
             }
             if ((v = tb.t) != null) {
                v.setVisibility(0);
             }
             if ((v = tb.w) != null) {
                v.setVisibility(0);
             }
             break;
           default:
             super.onPageFinished(p0, p1);
             return;
       }
       tb.B = true;
       return;
    }
    public final void onPageStarted(WebView p0,String p1,Bitmap p2){
       rm7 v;
       switch (this.a){
           case 0:
             co5.o(p0, "view");
             co5.o(p1, "url");
             co5.K(p1, "Webview loading URL: ");
             super.onPageStarted(p0, p1, p2);
             lm7 tb = this.b;
             if (tb.A == null && (v = tb.v) != null) {
                v.show();
             }
             break;
           default:
             super.onPageStarted(p0, p1, p2);
             return;
       }
       return;
    }
    public final void onReceivedError(WebView p0,int p1,String p2,String p3){
       switch (this.a){
           case 0:
           default:
             super.onReceivedError(p0, p1, p2, p3);
             return;
       }
       co5.o(p0, "view");
       co5.o(p2, "description");
       co5.o(p3, "failingUrl");
       super.onReceivedError(p0, p1, p2, p3);
       this.b.e(new jy1(p2, p1, p3));
       return;
    }
    public final void onReceivedSslError(WebView p0,SslErrorHandler p1,SslError p2){
       switch (this.a){
           case 0:
           default:
             super.onReceivedSslError(p0, p1, p2);
             return;
       }
       co5.o(p0, "view");
       co5.o(p1, "handler");
       co5.o(p2, "error");
       super.onReceivedSslError(p0, p1, p2);
       p1.cancel();
       this.b.e(new jy1(null, -11, null));
       return;
    }
    public final boolean shouldOverrideUrlLoading(WebView p0,String p1){
       String str;
       String str1;
       rm7 c;
       lm7 tb = this.b;
       ny1 ony1 = null;
       int b = false;
       switch (this.a){
           case 0:
             break;
           default:
             if (p1 == null) {
                return b;
             }
             tb.getClass();
             co5.N("dismissUriSuffix");
             throw ony1;
       }
       co5.o(p0, "view");
       co5.o(p1, "url");
       co5.K(p1, "Redirect URL: ");
       Uri uri = Uri.parse(p1);
       uri = (uri.getPath() != null && Pattern.matches("^/\(v\\d+\\.\\d+/\)??dialog/.*", uri.getPath()))? 1: 0;
       try{
          lm7 olm7 = tb;
          if (av6.D0(p1, olm7.b, b)) {
             Bundle uBundle = olm7.c(p1);
             if ((p1 = uBundle.getString("error")) == null) {
                p1 = uBundle.getString("error_type");
             }
             if ((str = uBundle.getString("error_msg")) == null) {
                str = uBundle.getString("error_message");
             }
             if (str == null) {
                str = uBundle.getString("error_description");
             }
             if ((str1 = uBundle.getString("error_code")) != null && !ej4.Z(str1)) {
                try{
                   b = Integer.parseInt(str1);
                label_007f :
                   if (ej4.Z(p1) && (ej4.Z(str) && b == -1)) {
                      if ((c = e0.c) != null && e0.z == null) {
                         e0.z = true;
                         c.a(uBundle, ony1);
                         e0.dismiss();
                      }
                   }else if(p1 != null && (co5.c(p1, "access_denied") && !co5.c(p1, "OAuthAccessDeniedException"))){
                      e0.cancel();
                   }else if(b == 4201){
                      e0.cancel();
                   }else {
                      e0.e(new tz1(new oz1(b, p1, str), str));
                   }
                }catch(java.lang.NumberFormatException e0){
                }
             label_007e :
                b = -1;
                goto label_007f ;
             }else {
                goto label_007e ;
             }
          }else if(av6.D0(p1, "fbconnect://cancel", b)){
             olm7.cancel();
          }else if(!uri && !av6.f0(p1, "touch")){
             tb.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(p1)));
          }else {
          label_00f6 :
             return b;
          }
          b = true;
          goto label_00f6 ;
       }catch(android.content.ActivityNotFoundException e0){
       }
    }
}
