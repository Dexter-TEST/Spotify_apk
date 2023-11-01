package p.j60;
import android.webkit.WebViewClient;
import p.m60;
import p.ob2;
import p.l60;
import android.webkit.WebView;
import java.lang.String;
import p.t50;
import java.lang.Object;
import java.lang.ref.Reference;
import android.app.Activity;
import android.content.Context;
import p.ji5;
import java.lang.Class;
import java.lang.StringBuilder;
import android.content.SharedPreferences$Editor;
import android.widget.RelativeLayout;
import android.view.View;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.app.Dialog;
import p.k60;
import android.content.DialogInterface$OnDismissListener;
import android.graphics.Bitmap;
import java.net.URI;

public final class j60 extends WebViewClient	// class@001a72 from classes.dex
{
    public final ob2 a;
    public final l60 b;
    public final WebView c;
    public final m60 d;

    public void j60(m60 p0,ob2 p1,l60 p2,WebView p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public final void onPageFinished(WebView p0,String p1){
       Activity uActivity;
       m60 g;
       super.onPageFinished(p0, p1);
       j60 td = this.d;
       j60 ta = this.a;
       j60 tb = this.b;
       int i = 0;
       if (td.f == null && (t50.i() != null && t50.i().l != null)) {
          if ((uActivity = t50.i().l.get()) != null) {
             ob2 c = ta.c;
             ji5 oji5 = ji5.g(uActivity.getApplicationContext());
             oji5.getClass();
             oji5.b.putInt("bnc_branch_view_use_"+c, (oji5.h(i, "bnc_branch_view_use_"+c) + 1)).apply();
             td.e = uActivity.getClass().getName();
             RelativeLayout relativeLayo = new RelativeLayout(uActivity);
             relativeLayo.setVisibility(8);
             j60 tc = this.c;
             relativeLayo.addView(tc, new RelativeLayout$LayoutParams(-1, -1));
             relativeLayo.setBackgroundColor(i);
             if ((g = td.g) != null && g.isShowing()) {
                if (tb != null) {
                   tb.n(ta.t);
                }
             }else {
                Dialog uDialog = new Dialog(uActivity, 0x103000a);
                td.g = uDialog;
                uDialog.setContentView(relativeLayo);
                relativeLayo.setVisibility(i);
                tc.setVisibility(i);
                td.g.show();
                m60.d(relativeLayo);
                m60.d(tc);
                td.a = true;
                td.g.setOnDismissListener(new k60(td, tb, ta));
             }
          }
       }else {
          td.a = i;
          if (tb != null) {
             tb.n(ta.t);
          }
       }
       return;
    }
    public final void onPageStarted(WebView p0,String p1,Bitmap p2){
       super.onPageStarted(p0, p1, p2);
    }
    public final void onReceivedError(WebView p0,int p1,String p2,String p3){
       super.onReceivedError(p0, p1, p2, p3);
       p0.f = true;
    }
    public final boolean shouldOverrideUrlLoading(WebView p0,String p1){
       m60 g;
       j60 td = this.d;
       td.getClass();
       try{
          boolean i = 0;
          URI uRI = new URI(p1);
          if (uRI.getScheme().equalsIgnoreCase("branch-cta")) {
             if (uRI.getHost().equalsIgnoreCase("accept")) {
                td.b = true;
             }else if(uRI.getHost().equalsIgnoreCase("cancel")){
                td.b = i;
             }
             i = true;
          }
          if (!i) {
             p0.loadUrl(p1);
          }else if((g = e0.g) != null){
             g.dismiss();
          }
          return i;
       }catch(java.net.URISyntaxException e0){
       }
    }
}
