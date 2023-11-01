package com.spotify.lite.welcome.SelectLoginActivity;
import androidx.appcompat.app.a;
import p.fn0;
import p.f7;
import p.z96;
import p.c7;
import p.z6;
import p.h7;
import androidx.activity.a;
import p.i7;
import android.os.Bundle;
import androidx.fragment.app.k;
import android.view.LayoutInflater;
import android.app.Activity;
import android.view.ViewGroup;
import android.view.View;
import p.ry7;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import p.ej5;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import p.sp6;
import p.xj0;
import android.content.res.Resources;
import java.lang.String;
import java.lang.NullPointerException;
import p.kz6;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import io.reactivex.rxjava3.core.Observable;
import p.aa6;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;

public class SelectLoginActivity extends a	// class@000920 from classes.dex
{
    public final fn0 Q;
    public ej5 R;
    public View S;
    public final i7 T;
    public final i7 U;
    public static final int V;

    public void SelectLoginActivity(){
       super();
       this.Q = new fn0();
       this.T = this.registerForActivityResult(new f7(), new z96(this, 0));
       this.U = this.registerForActivityResult(new f7(), new z96(this, 1));
    }
    public final void onCreate(Bundle p0){
       View view1;
       View view2;
       View view3;
       View view4;
       View view5;
       View view6;
       View view7;
       super.onCreate(p0);
       boolean b = false;
       View view = this.getLayoutInflater().inflate(R.layout.select_login_activity, null, b);
       int i = 0x7f0a00bf;
       if ((view1 = ry7.q(view, i)) != null) {
          i = 0x7f0a00c0;
          if ((view2 = ry7.q(view, i)) != null) {
             if ((view3 = ry7.q(view, R.id.button_phone_number)) != null) {
                int i1 = 0x7f0a00c9;
                if ((view4 = ry7.q(view, i1)) != null) {
                   if ((view5 = ry7.q(view, R.id.end_barrier)) != null) {
                      if ((view6 = ry7.q(view, R.id.start_barrier)) != null) {
                         if ((view7 = ry7.q(view, R.id.toolbar)) != null) {
                            ej5 v12 = new ej5(view, view1, view2, view3, view4, view5, view6, view7);
                            this.R = v12;
                            this.setContentView(v12.b);
                            ej5 h = this.R.h;
                            View view8 = LayoutInflater.from(h.getContext()).inflate(R.layout.up_button, h, b);
                            GlueToolbars.createGlueToolbar(h).addView(ToolbarSide.START, view8, R.id.action_close);
                            this.S = view8;
                            h = this.R.e;
                            xj0.O0(h, h.findViewById(i1), sp6.I);
                            h = this.R.c;
                            xj0.O0(h, h.findViewById(i), sp6.N);
                            return;
                         }else {
                            i = 0x7f0a0636;
                         }
                      }else {
                         i = 0x7f0a05e0;
                      }
                   }else {
                      i = 0x7f0a01ac;
                   }
                }else {
                   i = 0x7f0a00c9;
                }
             }else {
                i = 0x7f0a00c8;
             }
          }
       }
       throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
    public final void onStart(){
       super.onStart();
       SelectLoginActivity tQ = this.Q;
       tQ.c(ry7.e(this.R.e).observeOn(id.a()).subscribe(new aa6(this, 0)));
       tQ.c(ry7.e(this.R.c).observeOn(id.a()).subscribe(new aa6(this, 1)));
       tQ.c(ry7.e(this.S).observeOn(id.a()).subscribe(new aa6(this, 2)));
    }
    public final void onStop(){
       super.onStop();
       this.Q.e();
    }
}
