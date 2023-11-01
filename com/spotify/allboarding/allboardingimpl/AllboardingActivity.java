package com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import p.ao2;
import androidx.appcompat.app.a;
import p.gb;
import p.yi7;
import p.eb;
import java.lang.Class;
import p.uf0;
import p.ns5;
import p.o26;
import java.lang.Object;
import p.kb;
import p.wf2;
import p.ay6;
import p.sc;
import java.lang.String;
import p.co5;
import android.os.Bundle;
import android.app.Activity;
import p.eo5;
import p.ae2;
import androidx.fragment.app.k;
import androidx.fragment.app.o;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import p.lg4;
import p.mg4;
import p.ig4;
import p.hb;
import java.util.concurrent.CopyOnWriteArrayList;
import p.gk;
import p.qf4;
import p.gg4;
import p.aw1;
import p.cc1;
import p.ek3;
import p.ib;
import p.ub4;
import com.spotify.mobius.android.a;
import p.jb;
import p.xz4;
import androidx.lifecycle.b;
import com.spotify.allboarding.entrypoint.EntryPoint;
import p.ja;
import p.ma;
import java.lang.IllegalStateException;
import androidx.activity.a;

public class AllboardingActivity extends a implements ao2	// class@000506 from classes.dex
{
    public ub Q;
    public final yi7 R;
    public nc1 S;
    public md2 T;
    public b65 U;
    public b07 V;
    public lg4 W;
    public final ay6 X;
    public aw1 Y;
    public static final int Z;

    public void AllboardingActivity(){
       super();
       this.R = new yi7(ns5.a(eb.class), new o26(5, this), new gb(this, 1), new kb(null, 0, this));
       this.X = new ay6(new gb(this, 0));
    }
    public final sc d(){
       AllboardingActivity tS;
       if ((tS = this.S) != null) {
          return tS;
       }
       co5.N("androidInjector");
       throw null;
    }
    public final void onCreate(Bundle p0){
       NavHostFragment a;
       AllboardingActivity tW;
       eo5.q(this);
       ae2 uoae2 = this.y();
       AllboardingActivity tT = this.T;
       Bundle uBundle = null;
       if (tT != null) {
          uoae2.y = tT;
          super.onCreate(p0);
          this.setContentView(R.layout.activity_allboarding_mobius);
          Fragment uFragment = this.y().C(R.id.nav_host_fragment_mobius);
          co5.j(uFragment, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
          if ((a = uFragment.a) == null) {
             throw new IllegalStateException("NavController is not available before onCreate\(\)".toString());
          }
          this.W = a;
          a.q(a.B.getValue().b(R.navigation.onboarding_mobius), uBundle);
          tT = this.W;
          String str = "navController";
          if (tT != null) {
             hb ohb = new hb(this);
             tT.p.add(ohb);
             lg4 g = tT.g;
             if ((g.isEmpty() ^ 1)) {
                ohb.a(tT, g.last().b);
             }
             if ((tW = this.W) != null) {
                o childFragmen = uFragment.getChildFragmentManager();
                co5.l(childFragmen, "navHostFragment.childFragmentManager");
                this.Y = new aw1(this, tW, childFragmen, new cc1(1, this));
                AllboardingActivity tR = this.R;
                tR.getValue().v.c(this, new ib(this));
                tR.getValue().t.f(this, new jb(this));
                if (p0 == null) {
                   if (this.V != null) {
                      AllboardingActivity tX = this.X;
                      co5.o(tX.getValue(), "entryPoint");
                      tR.getValue().e(new ja(tX.getValue()));
                   }else {
                      co5.N("allBoardingStatusLogger");
                      throw uBundle;
                   }
                }
                return;
             }else {
                co5.N(str);
                throw uBundle;
             }
          }else {
             co5.N(str);
             throw uBundle;
          }
       }else {
          co5.N("fragmentFactory");
          throw uBundle;
       }
    }
    public final void onSaveInstanceState(Bundle p0){
       co5.o(p0, "outState");
       super.onSaveInstanceState(p0);
       if (this.V != null) {
          co5.o(this.X.getValue(), "entryPoint");
          return;
       }else {
          co5.N("allBoardingStatusLogger");
          throw null;
       }
    }
}
