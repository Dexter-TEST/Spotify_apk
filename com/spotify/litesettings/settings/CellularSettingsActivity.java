package com.spotify.litesettings.settings.CellularSettingsActivity;
import p.w53;
import androidx.appcompat.app.a;
import p.fn0;
import p.vk7;
import p.wk7;
import p.v55;
import p.x55;
import android.os.Bundle;
import android.app.Activity;
import p.eo5;
import androidx.fragment.app.k;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.ry7;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import android.widget.ProgressBar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import p.yt;
import android.widget.LinearLayout;
import p.vc0;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import java.lang.CharSequence;
import android.widget.ImageView;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import io.reactivex.rxjava3.core.Observable;
import p.ti4;
import p.ox7;
import p.wp3;
import p.tn6;
import p.ko1;
import p.bm;
import io.reactivex.rxjava3.core.ObservableSource;
import p.w00;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.uc0;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.kz6;
import android.content.res.Resources;
import java.lang.String;
import java.lang.NullPointerException;

public class CellularSettingsActivity extends a implements w53	// class@00095e from classes.dex
{
    public g54 Q;
    public yt R;
    public vc0 S;
    public final fn0 T;
    public static final int U;

    public void CellularSettingsActivity(){
       super();
       this.T = new fn0();
    }
    public final vk7 b(){
       return wk7.K;
    }
    public final v55 h(){
       return x55.Y;
    }
    public final void onCreate(Bundle p0){
       View view1;
       View view2;
       View view3;
       View view4;
       View view5;
       View view6;
       View view7;
       View view8;
       View view9;
       View view10;
       View view11;
       View view12;
       View view13;
       View view14;
       View view15;
       View view16;
       a uoa = this;
       eo5.q(this);
       super.onCreate(p0);
       boolean b = false;
       View view = this.getLayoutInflater().inflate(R.layout.cellular_settings_activity, null, b);
       int i = 0x7f0a00ea;
       if ((view1 = ry7.q(view, i)) != null) {
          i = 0x7f0a00eb;
          if ((view2 = ry7.q(view, i)) != null) {
             i = 0x7f0a00ec;
             if ((view3 = ry7.q(view, i)) != null) {
                i = 0x7f0a00ed;
                if ((view4 = ry7.q(view, i)) != null) {
                   i = 0x7f0a00ee;
                   if ((view5 = ry7.q(view, i)) != null) {
                      i = 0x7f0a00ef;
                      if ((view6 = ry7.q(view, i)) != null) {
                         i = 0x7f0a00f0;
                         if ((view7 = ry7.q(view, i)) != null) {
                            i = 0x7f0a01f8;
                            if ((view8 = ry7.q(view, i)) != null) {
                               i = 0x7f0a04cf;
                               if ((view9 = ry7.q(view, i)) != null) {
                                  i = 0x7f0a04d0;
                                  if ((view10 = ry7.q(view, i)) != null) {
                                     i = 0x7f0a051d;
                                     if ((view11 = ry7.q(view, i)) != null) {
                                        i = 0x7f0a051e;
                                        if ((view12 = ry7.q(view, i)) != null) {
                                           i = 0x7f0a051f;
                                           if ((view13 = ry7.q(view, i)) != null) {
                                              i = 0x7f0a0520;
                                              if ((view14 = ry7.q(view, i)) != null) {
                                                 i = 0x7f0a0521;
                                                 if ((view15 = ry7.q(view, i)) != null) {
                                                    i = 0x7f0a0636;
                                                    if ((view16 = ry7.q(view, i)) != null) {
                                                       yt i1 = new yt(view, view1, view2, view3, view4, view5, view6, view7, view8, view9, view10, view11, view12, view13, view14, view15, view16);
                                                       uoa.R = i;
                                                       uoa.setContentView(i.a);
                                                       uoa.R.j.setVisibility(8);
                                                       uoa.S = uoa.Q.r(uoa, vc0.class);
                                                       yt q = uoa.R.q;
                                                       GlueToolbar glueToolbar = GlueToolbars.createGlueToolbar(q);
                                                       glueToolbar.setTitle(this.getTitle());
                                                       ImageView imageView = this.getLayoutInflater().inflate(R.layout.up_button, q, b);
                                                       glueToolbar.addView(ToolbarSide.START, imageView, R.id.action_close);
                                                       vc0 v = uoa.S.v;
                                                       CellularSettingsActivity t = uoa.T;
                                                       t.c(Observable.combineLatest(ox7.C(uoa.S.t.a()), ox7.C(v.c.r(v.a)), new bm(17)).observeOn(id.a()).subscribe(new uc0(uoa, b)));
                                                       t.c(ry7.e(imageView).subscribe(new uc0(uoa, 1)));
                                                       return;
                                                    }
                                                 }
                                              }
                                           }
                                        }
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
    public final void onDestroy(){
       this.T.dispose();
       super.onDestroy();
    }
}
