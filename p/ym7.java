package p.ym7;
import androidx.fragment.app.Fragment;
import java.lang.String;
import p.rn6;
import android.os.Handler;
import java.lang.Boolean;
import java.lang.Object;
import p.t00;
import p.fn0;
import android.content.Intent;
import p.eq6;
import java.lang.Class;
import android.net.Uri;
import android.webkit.WebChromeClient$FileChooserParams;
import p.n91;
import android.content.Context;
import p.vx5;
import p.ao2;
import p.sc;
import p.tp2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import androidx.fragment.app.k;
import p.jm7;
import android.view.View$OnClickListener;
import android.webkit.WebView;
import android.webkit.WebSettings;
import p.vm7;
import android.webkit.WebChromeClient;
import p.xm7;
import android.webkit.WebViewClient;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Integer;
import p.n6;
import p.pp;
import p.yf2;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.vs3;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.am0;
import java.lang.Runnable;
import android.view.ViewParent;
import p.uv1;
import android.app.AlertDialog;
import android.app.Dialog;

public abstract class ym7 extends Fragment	// class@002deb from classes.dex
{
    public boolean A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public final t00 E;
    public final fn0 F;
    public final Handler a;
    public WebView b;
    public WebView c;
    public View t;
    public ConstraintLayout v;
    public ConstraintLayout w;
    public eq6 x;
    public am0 y;
    public int z;
    public static final int G;

    static {
       rn6.a("webview_debug_custom_spotify_host");
       rn6.a("webview_debug_ignore_ssl_errors");
    }
    public void ym7(){
       super();
       this.a = new Handler();
       this.z = 0;
       this.C = true;
       this.D = true;
       this.E = t00.b(Boolean.FALSE);
       this.F = new fn0();
    }
    public final void onActivityResult(int p0,int p1,Intent p2){
       eq6 c = this.x.c;
       c.getClass();
       if (p0 == 1780) {
          c.c(WebChromeClient$FileChooserParams.parseResult(p1, p2));
       }
       return;
    }
    public void onAttach(Context p0){
       vx5 ovx5 = new vx5(8);
       p0.getApplicationContext().d().a(ovx5);
       tp2.v(ovx5.b);
       super.onAttach(p0);
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       throw null;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       ym7 tb;
       Integer integer;
       int i = 1;
       Object[] objArray = new Object[i];
       String str = (this.b == null)? "": " \(using retained webview\)";
       objArray[0] = str;
       Logger.e("onCreateView\(\)%s", objArray);
       k activity = this.getActivity();
       View view = p0.inflate(this.u(), p1, 0);
       View view1 = view.findViewById(R.id.button_reload);
       view1.getClass();
       this.t = view1;
       view1.setOnClickListener(new jm7(2, this));
       if ((tb = this.b) != null) {
          this.c = tb;
          this.b = null;
       }else {
          this.c = new WebView(activity);
          WebView.setWebContentsDebuggingEnabled(0);
          WebSettings settings = this.c.getSettings();
          settings.setJavaScriptEnabled(i);
          settings.setDomStorageEnabled(i);
          eq6 uoeq6 = new eq6(new vm7(this), new vm7(this));
          this.x = uoeq6;
          this.c.setWebChromeClient(uoeq6);
          this.c.setWebViewClient(new xm7(this));
       }
       tb = view.findViewById(R.id.webview_placeholder);
       tb.getClass();
       tb.addView(this.c, -1, -1);
       ConstraintLayout uConstraintL = view.findViewById(R.id.error_container);
       uConstraintL.getClass();
       this.w = uConstraintL;
       uConstraintL = view.findViewById(R.id.loading_container);
       uConstraintL.getClass();
       this.v = uConstraintL;
       if ((integer = this.v()) != null) {
          this.v.setBackgroundColor(n6.b(this.requireContext(), integer.intValue()));
       }
       this.F.c(this.E.switchMap(new pp(3)).observeOn(id.a()).subscribe(new vs3(i, this)));
       this.y(this.z);
       if ((tb = this.z) == null || tb == i) {
          am0 uoam0 = new am0(17, this);
          this.y = uoam0;
          this.a.postDelayed(uoam0, 1000);
          this.x();
       }
       return view;
    }
    public final void onDestroy(){
       ym7 tc;
       super.onDestroy();
       if ((tc = this.c) != null) {
          tc.setWebChromeClient(null);
          this.c.setWebViewClient(null);
          this.c = null;
       }
       if ((tc = this.y) != null) {
          this.a.removeCallbacks(tc);
          this.y = null;
       }
       return;
    }
    public final void onDestroyView(){
       ViewParent parent;
       ym7 tx;
       uv1 b1;
       Object[] objArray = new Object[0];
       Logger.e("onDestroyView\(\)", objArray);
       super.onDestroyView();
       this.F.e();
       this.t = null;
       this.w = null;
       if (this.c != null) {
          if (this.getRetainInstance() && (parent = this.c.getParent()) != null) {
             parent.removeView(this.c);
             this.b = this.c;
          }
          this.c = null;
       }
       if ((tx = this.x) != null) {
          eq6 b = tx.b;
          if ((b1 = b.b) != null) {
             b1.cancel();
             b.b = null;
          }
          tx.c.c(null);
       }
       return;
    }
    public int u(){
       return 0x7f0d009a;
    }
    public Integer v(){
       return null;
    }
    public boolean w(){
       return false;
    }
    public abstract void x();
    public final void y(int p0){
       ym7 tc;
       int i2;
       Object[] objArray = new Object[2];
       int i = 0;
       objArray[0] = Integer.valueOf(this.z);
       int i1 = 1;
       objArray[1] = Integer.valueOf(p0);
       Logger.e("Changing state %d -> %d", objArray);
       this.z = p0;
       p0 = (p0 && (p0 == i1 && p0 != 3))? 0: 1;
       if ((tc = this.c) != null) {
          i2 = (p0)? 0: 8;
          tc.setVisibility(i2);
       }
       if ((tc = this.w) != null) {
          i2 = (p0)? 8: 0;
          tc.setVisibility(i2);
       }
       if ((tc = this.t) != null) {
          if (p0 || this.D == null) {
             i1 = 0;
          }
          if (!i1) {
             i = 8;
          }
          tc.setVisibility(i);
          this.t.setEnabled(i1);
       }
       return;
    }
}
