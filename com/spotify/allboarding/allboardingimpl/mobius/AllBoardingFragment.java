package com.spotify.allboarding.allboardingimpl.mobius.AllBoardingFragment;
import androidx.fragment.app.Fragment;
import p.ir2;
import p.sc;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.o26;
import p.eb;
import java.lang.Class;
import p.uf0;
import p.ns5;
import p.if2;
import p.wf2;
import p.yi7;
import p.eb3;
import p.nb;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.ub4;
import p.rb4;
import p.m26;
import androidx.fragment.app.k;
import p.t55;
import p.zq7;
import p.tm5;
import p.bb7;
import p.r61;
import p.am1;
import p.i77;
import p.p55;
import p.zj6;
import p.r55;
import p.s55;
import p.es0;
import java.util.Set;
import p.ek3;
import p.na;
import p.xz4;
import androidx.lifecycle.b;
import p.lg4;
import p.tu6;
import p.gk;
import p.qf4;
import p.ay6;
import p.ne4;
import p.oa;
import p.pa;
import androidx.activity.a;
import p.sd2;
import p.k15;
import androidx.activity.b;

public final class AllBoardingFragment extends Fragment	// class@000507 from classes.dex
{
    public final sc a;
    public gj4 b;
    public ub c;
    public final yi7 t;
    public b65 v;
    public t55 w;
    public Set x;
    public boolean y;
    public static final int z;

    public void AllBoardingFragment(){
       super(ir2.b);
    }
    public void AllBoardingFragment(sc p0){
       co5.o(p0, "injector");
       super(0x7f0d0029);
       this.a = p0;
       this.t = eb3.i(this, ns5.a(eb.class), new if2(this, 2), new o26(6, this));
       this.y = true;
       co5.i(nb.c.b);
    }
    public final void onAttach(Context p0){
       co5.o(p0, "context");
       this.a.a(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       this.u();
       super.onCreate(p0);
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       co5.o(p0, "inflater");
       this.u();
       this.u();
       return super.onCreateView(p0, p1, p2);
    }
    public final void onPause(){
       this.u();
       super.onPause();
    }
    public final void onSaveInstanceState(Bundle p0){
       rb4 z;
       co5.o(p0, "outState");
       eb uoeb = this.v();
       if ((z = uoeb.w.z) != null) {
       }else {
          z = uoeb.x;
       }
       uoeb.z.e(z, "VIEW_STATE");
       return;
    }
    public final void onViewCreated(View p0,Bundle p1){
       AllBoardingFragment w;
       qf4 oqf4;
       AllBoardingFragment uAllBoarding = this;
       co5.o(p0, "view");
       this.u();
       super.onViewCreated(p0, p1);
       if ((w = uAllBoarding.w) != null) {
          k ok = this.requireActivity();
          co5.l(ok, "requireActivity\(\)");
          t55 a = w.a;
          i77 a1 = new i77(a.a.get(), a.b.get(), a.c.get(), a.t.get(), this.v(), ok);
          p55[] op55Array = new p55[2];
          op55Array[0] = new zj6(a.d, new r55(a, 3), new s55(a, 4));
          r55 or55 = new r55(a, 0);
          r55 or551 = new r55(a, 1);
          s55 os55 = new s55(a, 0);
          s55 os551 = new s55(a, 1);
          s55 os552 = new s55(a, 3);
          r55 or552 = new r55(a, 2);
          es0 v5 = new es0(a.a, a.c, a.b, or55, or551, os55, os551, new s55(a, 2), os552, or552);
          op55Array[1] = v5;
          uAllBoarding.x = co5.I(op55Array);
          this.v().t.f(this.getViewLifecycleOwner(), new na(uAllBoarding));
          ek3 obj = ((oqf4 = tu6.p(this).g.k()) != null)? oqf4.B.getValue(): null;
          if (obj != null) {
             obj.c("skipDialogResult").f(uAllBoarding, new oa(uAllBoarding));
          }
          if (obj != null) {
             obj.c("searchResult_mobius").f(uAllBoarding, new pa(obj, uAllBoarding));
          }
          obj = this.getViewLifecycleOwner();
          co5.l(obj, "viewLifecycleOwner");
          this.requireActivity().x.a(obj, new sd2(uAllBoarding, 2));
          this.u();
          return;
       }else {
          co5.N("pageFactoryFactory");
          throw null;
       }
    }
    public final void u(){
       if (this.b != null) {
          return;
       }
       co5.N("pageLoadTimeKeeper");
       throw null;
    }
    public final eb v(){
       return this.t.getValue();
    }
}
