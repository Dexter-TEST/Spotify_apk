package com.spotify.lite.about.AboutActivity;
import p.w53;
import androidx.appcompat.app.a;
import java.lang.String;
import android.net.Uri;
import p.fn0;
import android.widget.TextView;
import android.view.View;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.lang.Object;
import java.util.Collections;
import p.vk7;
import p.wk7;
import p.v55;
import p.x55;
import android.content.Intent;
import androidx.fragment.app.k;
import java.lang.Integer;
import com.spotify.base.java.logging.Logger;
import android.os.Bundle;
import android.app.Activity;
import p.eo5;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import p.ry7;
import android.widget.Button;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import p.ej5;
import android.widget.LinearLayout;
import p.x;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import java.lang.CharSequence;
import android.widget.ImageView;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import android.content.res.Resources;
import java.lang.NullPointerException;
import p.kz6;
import p.v;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.nm3;
import p.kq3;
import p.vv7;
import p.f54;
import p.a70;
import android.content.Context;
import p.t67;
import p.ly7;
import p.yz7;
import p.m18;
import p.jd;
import p.ll;
import p.vj1;
import java.lang.Exception;
import p.l08;
import p.v08;
import p.bw7;
import p.ow7;
import p.zh0;
import p.n07;
import p.l18;
import p.zw7;
import java.util.concurrent.Executor;
import p.m25;

public class AboutActivity extends a implements w53	// class@00090c from classes.dex
{
    public g54 Q;
    public ej5 R;
    public x S;
    public ImageView T;
    public final fn0 U;
    public static final Uri V;
    public static final Uri W;
    public static final Uri X;

    static {
       AboutActivity.V = Uri.parse("https://www.spotify.com/legal/privacy-policy/plain/");
       AboutActivity.W = Uri.parse("https://www.spotify.com/legal/end-user-agreement/plain/");
       AboutActivity.X = Uri.parse("file:///android_asset/licenses.xhtml");
    }
    public void AboutActivity(){
       super();
       this.U = new fn0();
    }
    public static void C(TextView p0){
       mj5 omj5 = oj5.c(p0);
       View[] viewArray = new View[]{p0};
       Collections.addAll(omj5.c, viewArray);
       omj5.a();
    }
    public final vk7 b(){
       return wk7.H;
    }
    public final v55 h(){
       return x55.V;
    }
    public final void onActivityResult(int p0,int p1,Intent p2){
       if (p0 != 1) {
          super.onActivityResult(p0, p1, p2);
       }else if(p1 != -1){
          Object[] objArray = new Object[]{Integer.valueOf(p1)};
          Logger.i("Update flow failed! Result code: %d", objArray);
       }
       return;
    }
    public final void onCreate(Bundle p0){
       View view1;
       View view2;
       View view3;
       View view4;
       View view5;
       View view6;
       View view7;
       eo5.q(this);
       super.onCreate(p0);
       boolean b = false;
       View view = this.getLayoutInflater().inflate(R.layout.about_activity, null, b);
       int i = 0x7f0a0088;
       if ((view1 = ry7.q(view, i)) != null) {
          i = 0x7f0a00c4;
          if ((view2 = ry7.q(view, i)) != null) {
             i = 0x7f0a00d5;
             if ((view3 = ry7.q(view, i)) != null) {
                i = 0x7f0a04de;
                if ((view4 = ry7.q(view, i)) != null) {
                   i = 0x7f0a051b;
                   if ((view5 = ry7.q(view, i)) != null) {
                      i = 0x7f0a060d;
                      if ((view6 = ry7.q(view, i)) != null) {
                         i = 0x7f0a0636;
                         if ((view7 = ry7.q(view, i)) != null) {
                            ej5 i1 = new ej5(view, view1, view2, view3, view4, view5, view6, view7);
                            this.R = i;
                            this.setContentView(i.b);
                            this.S = this.Q.r(this, x.class);
                            GlueToolbar glueToolbar = GlueToolbars.createGlueToolbar(this.R.h);
                            glueToolbar.setTitle(this.getTitle());
                            ImageView imageView = this.getLayoutInflater().inflate(R.layout.up_button, this.R.h, b);
                            this.T = imageView;
                            glueToolbar.addView(ToolbarSide.START, imageView, R.id.action_close);
                            return;
                         }
                      }
                   }
                }
             }
          }
       }
       throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
    public final void onStart(){
       Context applicationC;
       m18 a1;
       vj1 ovj1;
       super.onStart();
       int i = 0;
       this.U.c(ry7.e(this.T).subscribe(new v(this, i)));
       ej5 g = this.R.g;
       AboutActivity.C(g);
       int i1 = 1;
       this.U.c(ry7.e(g).observeOn(id.a()).subscribe(new v(this, i1)));
       g = this.R.f;
       AboutActivity.C(g);
       this.U.c(ry7.e(g).observeOn(id.a()).subscribe(new v(this, 2)));
       g = this.R.a;
       AboutActivity.C(g);
       this.U.c(ry7.e(g).observeOn(id.a()).subscribe(new v(this, 3)));
       this.S.t.getClass();
       this.R.c.setText("1.9.0.49155");
       vv7 ovv7 = vv7.class;
       _monitor_enter(ovv7);
       if (vv7.a == null) {
          g54 og54 = new g54(null);
          if ((applicationC = this.getApplicationContext()) == null) {
             applicationC = this;
          }
          a70 uoa70 = new a70(applicationC);
          og54.a = uoa70;
          vv7.a = new t67(uoa70);
       }
       _monitor_exit(ovv7);
       yz7 oyz7 = vv7.a.y.c();
       String packageName = oyz7.b.getPackageName();
       jd e = m18.e;
       yz7 a = oyz7.a;
       if ((a1 = a.a) == null) {
          Object[] objArray = new Object[i1];
          objArray[i] = Integer.valueOf(-9);
          e.c("onError\(%d\)", objArray);
          ovj1 = new vj1();
          ovj1.f(new ll(-9, i1));
       }else {
          Object[] objArray1 = new Object[i1];
          objArray1[i] = packageName;
          e.e("requestUpdateInfo\(%s\)", objArray1);
          l08 ol08 = new l08();
          v08 i2 = new v08(a, ol08, packageName, ol08, 0);
          a1.b(i, ol08);
          ovj1 = ol08.a;
       }
       ovj1.getClass();
       ovj1.c.b(new zw7(n07.a, new zh0(this, 3, oyz7)));
       ovj1.g();
       return;
    }
    public final void onStop(){
       this.U.e();
       super.onStop();
    }
}
