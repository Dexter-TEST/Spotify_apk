package p.rm7;
import android.app.Dialog;
import android.content.Context;
import java.lang.String;
import android.os.Bundle;
import p.bv3;
import p.mm7;
import p.eo5;
import p.ej4;
import android.os.BaseBundle;
import p.sz1;
import java.util.Locale;
import java.lang.Object;
import java.util.Arrays;
import p.co5;
import p.om7;
import p.pm7;
import java.lang.Enum;
import p.eb3;
import android.net.Uri;
import java.lang.StringBuilder;
import androidx.fragment.app.k;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import p.mz1;
import java.lang.Exception;
import android.view.WindowManager;
import android.view.Display;
import android.util.DisplayMetrics;
import java.lang.Math;
import android.view.Window;
import java.lang.NullPointerException;
import android.webkit.WebView;
import p.ny1;
import java.lang.Throwable;
import android.widget.LinearLayout;
import p.qm7;
import android.view.View;
import p.lm7;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import p.im7;
import android.view.View$OnTouchListener;
import android.view.ViewGroup;
import java.lang.IllegalStateException;
import android.os.Build$VERSION;
import android.view.autofill.AutofillManager;
import java.lang.Class;
import p.eh;
import p.z27;
import android.view.WindowManager$LayoutParams;
import android.app.Activity;
import android.app.ProgressDialog;
import java.lang.CharSequence;
import p.hm7;
import android.view.View$OnCreateContextMenuListener;
import android.content.DialogInterface$OnCancelListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import p.jm7;
import android.view.View$OnClickListener;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import java.lang.Boolean;
import android.os.AsyncTask$Status;
import android.os.AsyncTask;
import java.lang.Void;

public class rm7 extends Dialog	// class@00251a from classes.dex
{
    public boolean A;
    public boolean B;
    public WindowManager$LayoutParams C;
    public String a;
    public String b;
    public mm7 c;
    public qm7 t;
    public ProgressDialog v;
    public ImageView w;
    public FrameLayout x;
    public final om7 y;
    public boolean z;
    public static int D;

    public void rm7(Context p0,String p1,Bundle p2,bv3 p3,mm7 p4){
       Uri uri;
       eo5.Q();
       super(p0, rm7.D);
       String str = "fbconnect://success";
       this.b = str;
       if (p2 == null) {
          p2 = new Bundle();
       }
       if (ej4.W(p0)) {
          str = "fbconnect://chrome_os_success";
       }
       this.b = str;
       p2.putString("redirect_uri", str);
       p2.putString("display", "touch");
       p2.putString("client_id", sz1.b());
       Object[] objArray = new Object[]{"15.0.1"};
       String str1 = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(objArray, 1));
       co5.l(str1, "java.lang.String.format\(locale, format, *args\)");
       p2.putString("sdk", str1);
       this.c = p4;
       if (co5.c(p1, "share") && p2.containsKey("media")) {
          this.y = new om7(this, p1, p2);
       }else if(pm7.a[p3.ordinal()] == 1){
          uri = ej4.e(p2, eb3.n(), "oauth/authorize");
       }else {
          uri = ej4.e(p2, eb3.l(), sz1.d()+"/dialog/"+p1);
       }
       this.a = uri.toString();
       return;
    }
    public void rm7(k p0,String p1){
       int d;
       eo5.Q();
       if (!(d = rm7.D)) {
          eo5.Q();
          d = rm7.D;
       }
       super(p0, d);
       this.b = "fbconnect://success";
       this.a = p1;
       return;
    }
    public static int a(float p0,int p1,int p2,int p3){
       int i;
       double d;
       if ((i = (int)((float)p1 / p0)) <= p2) {
          d = 0x3ff0000000000000;
       }else if(i >= p3){
          d = 0x3fe0000000000000;
       }else {
          d = (((double)(p3 - i) / (double)(p3 - p2)) * 0x3fe0000000000000) + 0x3fe0000000000000;
       }
       return (int)((double)p1 * d);
    }
    public static final void b(Context p0){
       ApplicationInfo applicationI;
       int intx;
       try{
          int i = ((applicationI = p0.getPackageManager().getApplicationInfo(p0.getPackageName(), 128)) == null)? 0: applicationI.metaData;
          if (i != null && !rm7.D) {
             if (!(intx = applicationI.metaData.getInt("com.facebook.sdk.WebDialogTheme"))) {
                intx = 0x7f1305ae;
             }
             rm7.D = intx;
          }
          return;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
       }
    }
    public Bundle c(String p0){
       Uri uri = Uri.parse(p0);
       Bundle uBundle = ej4.B0(uri.getQuery());
       uBundle.putAll(ej4.B0(uri.getFragment()));
       return uBundle;
    }
    public void cancel(){
       if (this.c != null && this.z == null) {
          this.e(new mz1());
       }
       return;
    }
    public final void d(){
       DisplayMetrics systemServic;
       Window window;
       if ((systemServic = this.getContext().getSystemService("window")) == null) {
          throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
       }
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       systemServic.getDefaultDisplay().getMetrics(uDisplayMetr);
       systemServic = uDisplayMetr.widthPixels;
       DisplayMetrics heightPixels = uDisplayMetr.heightPixels;
       DisplayMetrics uDisplayMetr1 = (systemServic < heightPixels)? systemServic: heightPixels;
       if (systemServic < heightPixels) {
          systemServic = heightPixels;
       }
       int i = Math.min(rm7.a(uDisplayMetr.density, uDisplayMetr1, 480, 800), uDisplayMetr.widthPixels);
       int i1 = Math.min(rm7.a(uDisplayMetr.density, systemServic, 800, 1280), uDisplayMetr.heightPixels);
       if ((window = this.getWindow()) != null) {
          window.setLayout(i, i1);
       }
       return;
    }
    public final void dismiss(){
       rm7 tt;
       if ((tt = this.t) == null) {
       }else {
          tt.stopLoading();
       }
       if (this.A == null && ((tt = this.v) != null && tt.isShowing())) {
          tt.dismiss();
       }
       super.dismiss();
       return;
    }
    public final void e(Exception p0){
       rm7 tc;
       if (this.c != null && this.z == null) {
          this.z = true;
          if (p0 instanceof ny1) {
          }else {
             ny1 ony1 = new ny1(p0);
          }
          if ((tc = this.c) != null) {
             tc.a(null, p0);
          }
          this.dismiss();
       }
       return;
    }
    public final void f(int p0){
       rm7 tt;
       rm7 tt1;
       rm7 tx;
       rm7 ta;
       LinearLayout linearLayout = new LinearLayout(this.getContext());
       qm7 oqm7 = new qm7(this.getContext());
       this.t = oqm7;
       boolean b = false;
       oqm7.setVerticalScrollBarEnabled(b);
       if ((tt = this.t) == null) {
       }else {
          tt.setHorizontalScrollBarEnabled(b);
       }
       if ((tt = this.t) != null) {
          tt.setWebViewClient(new lm7(this));
       }
       tt = this.t;
       WebSettings webSettings = null;
       WebSettings webSettings1 = (tt == null)? webSettings: tt.getSettings();
       if (webSettings1 != null) {
          webSettings1.setJavaScriptEnabled(true);
       }
       if ((tt = this.t) != null) {
          if ((ta = this.a) != null) {
             tt.loadUrl(ta);
          }else {
             throw new IllegalStateException("Required value was null.".toString());
          }
       }
       if ((tt = this.t) != null) {
          tt.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       }
       if ((tt = this.t) != null) {
          tt.setVisibility(4);
       }
       webSettings1 = ((tt = this.t) == null)? webSettings: tt.getSettings();
       if (webSettings1 != null) {
          webSettings1.setSavePassword(b);
       }
       if ((tt = this.t) != null) {
          webSettings = tt.getSettings();
       }
       if (webSettings != null) {
          webSettings.setSaveFormData(b);
       }
       if ((tt1 = this.t) != null) {
          tt1.setFocusable(true);
       }
       if ((tt1 = this.t) != null) {
          tt1.setFocusableInTouchMode(true);
       }
       if ((tt1 = this.t) != null) {
          tt1.setOnTouchListener(new im7());
       }
       linearLayout.setPadding(p0, p0, p0, p0);
       linearLayout.addView(this.t);
       linearLayout.setBackgroundColor(0xcc000000);
       if ((tx = this.x) != null) {
          tx.addView(linearLayout);
       }
       return;
    }
    public final void onAttachedToWindow(){
       rm7 tC;
       Activity ownerActivit;
       AutofillManager uAutofillMan;
       boolean b = false;
       this.A = b;
       Context context = this.getContext();
       co5.l(context, "context");
       if (Build$VERSION.SDK_INT < 26) {
       }else if((uAutofillMan = eh.q(context, AutofillManager.class)) != null && (z27.l(uAutofillMan) && z27.s(uAutofillMan))){
          b = true;
       }
       if (b && (tC = this.C) != null) {
          WindowManager$LayoutParams layoutParams = null;
          int i = (tC == null)? layoutParams: tC.token;
          if (i == null) {
             if (tC != null) {
                Window window = ((ownerActivit = this.getOwnerActivity()) == null)? layoutParams: ownerActivit.getWindow();
                WindowManager$LayoutParams layoutParams1 = (window == null || (layoutParams1 = window.getAttributes()) == null)? layoutParams: layoutParams1.token;
                tC.token = layoutParams1;
             }
             if ((tC = this.C) != null) {
                layoutParams = tC.token;
             }
             co5.K(layoutParams, "Set token on onAttachedToWindow\(\): ");
             HashSet a = sz1.a;
          }
       }
       super.onAttachedToWindow();
       return;
    }
    public final void onCreate(Bundle p0){
       rm7 tv;
       Window window;
       rm7 tw;
       super.onCreate(p0);
       ProgressDialog progressDial = new ProgressDialog(this.getContext());
       this.v = progressDial;
       int i = 1;
       progressDial.requestWindowFeature(i);
       if ((tv = this.v) == null) {
       }else {
          tv.setMessage(this.getContext().getString(R.string.com_facebook_loading));
       }
       tv = this.v;
       int i1 = 0;
       if (tv != null) {
          tv.setCanceledOnTouchOutside(i1);
       }
       if ((tv = this.v) != null) {
          tv.setOnCancelListener(new hm7(this, i1));
       }
       this.requestWindowFeature(i);
       this.x = new FrameLayout(this.getContext());
       this.d();
       if ((window = this.getWindow()) != null) {
          window.setGravity(17);
       }
       if ((window = this.getWindow()) != null) {
          window.setSoftInputMode(16);
       }
       ImageView imageView = new ImageView(this.getContext());
       this.w = imageView;
       imageView.setOnClickListener(new jm7(i1, this));
       Drawable drawable = this.getContext().getResources().getDrawable(R.drawable.com_facebook_close);
       if ((tw = this.w) != null) {
          tw.setImageDrawable(drawable);
       }
       if ((tv = this.w) != null) {
          tv.setVisibility(4);
       }
       if (this.a != null) {
          if ((tv = this.w) != null) {
             this.f(((tv.getDrawable().getIntrinsicWidth() / 2) + i));
          }else {
             throw new IllegalStateException("Required value was null.".toString());
          }
       }
       if ((tv = this.x) != null) {
          tv.addView(this.w, new ViewGroup$LayoutParams(-2, -2));
       }
       if ((tv = this.x) != null) {
          this.setContentView(tv);
          return;
       }else {
          throw new IllegalStateException("Required value was null.".toString());
       }
    }
    public final void onDetachedFromWindow(){
       this.A = true;
       super.onDetachedFromWindow();
    }
    public final boolean onKeyDown(int p0,KeyEvent p1){
       rm7 tt;
       rm7 tt1;
       co5.o(p1, "event");
       if (p0 == 4) {
          if ((tt = this.t) != null && co5.c(Boolean.valueOf(tt.canGoBack()), Boolean.TRUE)) {
             if ((tt1 = this.t) != null) {
                tt1.goBack();
             }
             return true;
          }else {
             this.cancel();
          }
       }
       return super.onKeyDown(p0, p1);
    }
    public final void onStart(){
       rm7 ty;
       super.onStart();
       if ((ty = this.y) != null) {
          int i = (ty == null)? 0: ty.getStatus();
          if (i == AsyncTask$Status.PENDING) {
             if (ty != null) {
                Void[] voidArray = new Void[0];
                ty.execute(voidArray);
             }
             if ((ty = this.v) != null) {
                ty.show();
             }
          }else {
          label_0025 :
             this.d();
          }
       }else {
          goto label_0025 ;
       }
       return;
    }
    public final void onStop(){
       rm7 ty;
       if ((ty = this.y) == null) {
       }else {
          ty.cancel(true);
          if ((ty = this.v) != null) {
             ty.dismiss();
          }
       }
       super.onStop();
       return;
    }
    public final void onWindowAttributesChanged(WindowManager$LayoutParams p0){
       co5.o(p0, "params");
       if (p0.token == null) {
          this.C = p0;
       }
       super.onWindowAttributesChanged(p0);
       return;
    }
}
