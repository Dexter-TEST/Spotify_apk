package com.spotify.lite.about.WebViewActivity;
import p.w53;
import androidx.appcompat.app.a;
import p.fn0;
import p.vk7;
import android.content.Intent;
import android.app.Activity;
import java.lang.String;
import p.tk7;
import java.lang.IllegalStateException;
import p.v55;
import p.x55;
import android.os.Bundle;
import p.eo5;
import androidx.fragment.app.k;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.ry7;
import android.widget.ProgressBar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import android.webkit.WebView;
import p.j8;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Object;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import android.widget.ImageView;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import p.kz6;
import p.vs3;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observable;
import java.lang.CharSequence;
import android.webkit.WebSettings;
import p.um7;
import android.webkit.WebViewClient;
import android.content.res.Resources;
import java.lang.NullPointerException;

public class WebViewActivity extends a implements w53	// class@00090d from classes.dex
{
    public final fn0 Q;
    public GlueToolbar R;
    public static final int S;

    public void WebViewActivity(){
       super();
       this.Q = new fn0();
    }
    public final vk7 b(){
       Intent intent;
       String str = ((intent = this.getIntent()) == null)? null: intent.getDataString();
       if (str != null) {
          return new tk7(str);
       }else {
          throw new IllegalStateException();
       }
    }
    public final v55 h(){
       return x55.g0;
    }
    public final void onCreate(Bundle p0){
       View view1;
       View view2;
       View view3;
       Intent intent;
       eo5.q(this);
       super.onCreate(p0);
       boolean b = false;
       View view = this.getLayoutInflater().inflate(R.layout.web_view_activity, null, b);
       int i = 0x7f0a051d;
       if ((view1 = ry7.q(view, i)) != null) {
          i = 0x7f0a0636;
          if ((view2 = ry7.q(view, i)) != null) {
             i = 0x7f0a066a;
             if ((view3 = ry7.q(view, i)) != null) {
                j8 i1 = new j8(view, view1, view2, view3, 9);
                this.setContentView(i.b);
                this.R = GlueToolbars.createGlueToolbar(i.t);
                ImageView imageView = this.getLayoutInflater().inflate(R.layout.up_button, i.t, b);
                this.R.addView(ToolbarSide.START, imageView, R.id.action_close);
                this.Q.c(ry7.e(imageView).subscribe(new vs3(4, this)));
                if ((intent = this.getIntent()) != null) {
                   String stringExtra = intent.getStringExtra("android.intent.extra.TITLE");
                   this.R.setTitle(stringExtra);
                   j8 v = i.v;
                   v.getSettings().setJavaScriptEnabled(true);
                   v.loadUrl(intent.getDataString());
                   v.setWebViewClient(new um7(this, i.c, stringExtra));
                }else {
                   this.finish();
                }
                return;
             }
          }
       }
       throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
    public final void onDestroy(){
       this.Q.dispose();
       super.onDestroy();
    }
}
