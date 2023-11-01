package com.spotify.allboarding.contextualaudio.presentation.ContextualAudioFragment;
import p.bo5;
import androidx.fragment.app.Fragment;
import p.ir2;
import p.sc;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.qt0;
import p.vt0;
import java.lang.Class;
import p.uf0;
import p.ns5;
import p.if2;
import p.wf2;
import p.yi7;
import p.eb3;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import p.ry7;
import com.spotify.allboarding.uiusecases.contentstack.ContentStackView;
import android.widget.FrameLayout;
import com.spotify.encoremobile.facepile.FacePileView;
import com.spotify.encoremobile.buttons.PrimaryButtonView;
import com.spotify.encoremobile.buttons.TertiaryButtonView;
import p.i77;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Parcelable;
import p.n46;
import p.f46;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import p.b63;
import p.vk;
import p.gs0;
import p.iq6;
import p.m26;
import p.o46;
import p.x12;
import java.util.List;
import p.ne4;
import p.rt0;
import android.view.View$OnClickListener;
import androidx.fragment.app.k;
import androidx.activity.a;
import p.ek3;
import p.qo1;
import p.k15;
import androidx.activity.b;
import android.content.res.Resources;
import java.lang.NullPointerException;
import p.st0;
import p.xz4;
import androidx.lifecycle.b;

public final class ContextualAudioFragment extends Fragment implements bo5	// class@000510 from classes.dex
{
    public final sc a;
    public aj7 b;
    public Scheduler c;
    public r61 t;
    public za7 v;
    public final yi7 w;
    public i77 x;

    public void ContextualAudioFragment(){
       super(ir2.v);
    }
    public void ContextualAudioFragment(sc p0){
       co5.o(p0, "injector");
       super();
       this.a = p0;
       this.w = eb3.i(this, ns5.a(vt0.class), new if2(this, 4), new qt0(this, 2));
    }
    public final void onAttach(Context p0){
       co5.o(p0, "context");
       this.a.a(this);
       super.onAttach(p0);
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view1;
       View view2;
       View view3;
       View view4;
       View view5;
       b63 obj;
       gs0 ogs0;
       String str;
       ContextualAudioFragment tx;
       co5.o(p0, "inflater");
       View view = p0.inflate(R.layout.fragment_contextual_audio, p1, false);
       int i = 0x7f0a013d;
       if ((view1 = ry7.q(view, i)) != null) {
          i = 0x7f0a013e;
          if ((view2 = ry7.q(view, i)) != null) {
             i = 0x7f0a01c1;
             if ((view3 = ry7.q(view, i)) != null) {
                i = 0x7f0a0519;
                if ((view4 = ry7.q(view, i)) != null) {
                   i = 0x7f0a057a;
                   if ((view5 = ry7.q(view, i)) != null) {
                      i77 i1 = new i77(view, view1, view2, view3, view4, view5);
                      this.x = i;
                      int i2 = 2;
                      i = 1;
                      if (p2 == null) {
                         p2 = this.getArguments();
                         boolean i3 = 0;
                         n46 parcelable = (p2 != null)? p2.getParcelable("allboarding-screen-arg"): i3;
                         if (parcelable instanceof f46) {
                            f46 uof46 = this.u();
                            co5.o(parcelable, "screen");
                            ArrayList uArrayList = new ArrayList();
                            Iterator iterator = parcelable.b.iterator();
                            while (iterator.hasNext()) {
                               obj = iterator.next();
                               if (obj instanceof b63) {
                                  uArrayList.add(obj);
                               }
                            }
                            ArrayList uArrayList1 = new ArrayList();
                            Iterator iterator1 = uArrayList.iterator();
                            while (iterator1.hasNext()) {
                               obj = iterator1.next();
                               view3 = (obj.F().length() > 0)? 1: 0;
                               if (view3) {
                                  uArrayList1.add(obj);
                               }
                            }
                            uArrayList = new ArrayList();
                            iterator = uArrayList1.iterator();
                            while (iterator.hasNext()) {
                               obj = iterator.next();
                               if (obj instanceof vk) {
                                  ogs0 = new gs0(obj.F(), i);
                               }else if(obj instanceof iq6){
                                  ogs0 = new gs0(obj.F(), i2);
                               }else {
                                  ogs0 = i3;
                               }
                               if (ogs0 != null) {
                                  uArrayList.add(ogs0);
                               }
                            }
                            vt0 t = uof46.t;
                            if ((str = t.b("MIX_ID")) == null) {
                               str = parcelable.a;
                            }
                            t.e(str, "MIX_ID");
                            vt0 x = uof46.x;
                            x12 a = uof46.w.a;
                            i3 = (t.b("MIX_ID") != null)? true: false;
                            x.l(new o46(uArrayList, a, i3));
                         }
                      }else if(p2.getBoolean("BUTTONS_VISIBLE", false)){
                         tx = this.x;
                         co5.i(tx);
                         tx.e.setVisibility(false);
                         tx = this.x;
                         co5.i(tx);
                         tx.f.setVisibility(false);
                      }
                      tx = this.x;
                      co5.i(tx);
                      tx.e.setOnClickListener(new rt0(this, false));
                      tx = this.x;
                      co5.i(tx);
                      tx.f.setOnClickListener(new rt0(this, i));
                      ek3 viewLifecycl = this.getViewLifecycleOwner();
                      co5.l(viewLifecycl, "viewLifecycleOwner");
                      this.requireActivity().x.a(viewLifecycl, new qo1(i2));
                      ContextualAudioFragment tx1 = this.x;
                      co5.i(tx1);
                      i77 a1 = tx1.a;
                      co5.l(a1, "binding.root");
                      return a1;
                   }
                }
             }
          }
       }
       throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
    public final void onDestroyView(){
       super.onDestroyView();
       ContextualAudioFragment tx = this.x;
       co5.i(tx);
       tx.b.a();
       this.x = null;
    }
    public final void onSaveInstanceState(Bundle p0){
       co5.o(p0, "outState");
       ContextualAudioFragment tx = this.x;
       co5.i(tx);
       boolean b = (!tx.e.getVisibility())? true: false;
       p0.putBoolean("BUTTONS_VISIBLE", b);
       return;
    }
    public final void onViewCreated(View p0,Bundle p1){
       co5.o(p0, "view");
       super.onViewCreated(p0, p1);
       this.u().y.f(this.getViewLifecycleOwner(), new st0(this));
    }
    public final vt0 u(){
       return this.w.getValue();
    }
}
