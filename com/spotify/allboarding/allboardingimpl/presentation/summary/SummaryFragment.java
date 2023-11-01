package com.spotify.allboarding.allboardingimpl.presentation.summary.SummaryFragment;
import androidx.fragment.app.Fragment;
import p.sc;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.Context;
import com.spotify.allboarding.greatpicksloadingview.GreatPicksLoadingView;
import com.spotify.allboarding.uiusecases.contentstack.ContentStackView;
import android.view.View;
import android.os.Bundle;
import android.os.Parcelable;
import p.n46;
import p.l46;
import p.q46;
import p.eb3;
import androidx.fragment.app.k;
import androidx.activity.a;
import p.ek3;
import p.qo1;
import p.k15;
import androidx.activity.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import p.b63;
import p.vk;
import p.gs0;
import p.iq6;
import p.tc;
import java.lang.CharSequence;
import android.widget.TextView;
import p.r61;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;
import p.aj0;
import p.ey1;
import p.fy1;
import com.spotify.encoremobile.facepile.FacePileView;
import android.view.ViewGroup;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;

public final class SummaryFragment extends Fragment	// class@00050b from classes.dex
{
    public final sc a;
    public r61 b;
    public Scheduler c;
    public tc t;
    public GreatPicksLoadingView v;
    public l46 w;

    public void SummaryFragment(sc p0){
       co5.o(p0, "injector");
       super(0x7f0d0169);
       this.a = p0;
    }
    public final void onAttach(Context p0){
       co5.o(p0, "context");
       this.a.a(this);
       super.onAttach(p0);
    }
    public final void onDestroyView(){
       SummaryFragment tv;
       super.onDestroyView();
       if ((tv = this.v) != null) {
          tv.I.a();
          return;
       }else {
          co5.N("greatPicksLoadingView");
          throw null;
       }
    }
    public final void onViewCreated(View p0,Bundle p1){
       SummaryFragment tw;
       SummaryFragment tv;
       SummaryFragment tc;
       SummaryFragment tb;
       b63 obj;
       int i;
       gs0 ogs0;
       SummaryFragment tt;
       GreatPicksLoadingView i3;
       co5.o(p0, "view");
       super.onViewCreated(p0, p1);
       p1 = this.getArguments();
       void ovoid = null;
       n46 parcelable = (p1 != null)? p1.getParcelable("allboarding-screen-arg"): ovoid;
       if (parcelable instanceof l46) {
       }else {
          parcelable = ovoid;
       }
       if (parcelable == null) {
          Bundle uBundle = new Bundle();
          uBundle.putParcelable("ALLBOARDING_SCREEN_RESPONSE", q46.a);
          eb3.y(uBundle, this);
          return;
       }else {
          this.w = parcelable;
          p0 = p0.findViewById(R.id.great_picks_loading_view);
          co5.l(p0, "view.findViewById\(R.id.great_picks_loading_view\)");
          this.v = p0;
          ek3 viewLifecycl = this.getViewLifecycleOwner();
          co5.l(viewLifecycl, "viewLifecycleOwner");
          this.requireActivity().x.a(viewLifecycl, new qo1(1));
          if ((tw = this.w) != null) {
             if ((tv = this.v) != null) {
                if ((tc = this.c) != null) {
                   if ((tb = this.b) != null) {
                      l46 b = tw.b;
                      co5.o(b, "<this>");
                      ArrayList uArrayList = new ArrayList();
                      Iterator iterator = b.iterator();
                      while (iterator.hasNext()) {
                         obj = iterator.next();
                         if (obj instanceof b63) {
                            uArrayList.add(obj);
                         }
                      }
                      ArrayList uArrayList1 = new ArrayList();
                      Iterator iterator1 = uArrayList.iterator();
                      while (true) {
                         i = 0;
                         if (iterator1.hasNext()) {
                            obj = iterator1.next();
                            if (obj.F().length() > 0) {
                               i = 1;
                            }
                            if (i) {
                               uArrayList1.add(obj);
                            }
                         }else {
                            break ;
                         }
                      }
                      uArrayList = new ArrayList();
                      iterator = uArrayList1.iterator();
                      while (true) {
                         int i1 = 2;
                         if (iterator.hasNext()) {
                            obj = iterator.next();
                            if (obj instanceof vk) {
                               ogs0 = new gs0(obj.F(), 1);
                            }else if(obj instanceof iq6){
                               ogs0 = new gs0(obj.F(), i1);
                            }else {
                               ogs0 = ovoid;
                            }
                            if (ogs0 != null) {
                               uArrayList.add(ogs0);
                            }
                         }else if((tt = this.t) != null){
                            boolean b1 = tt.a();
                            l46 a = tw.a;
                            co5.o(a, "loadingText");
                            Context context = tv.getContext();
                            int i2 = (uArrayList.size() > 1)? 0x7f120031: 0x7f120030;
                            GreatPicksLoadingView k = tv.K;
                            k.setText(context.getString(i2));
                            GreatPicksLoadingView l = tv.L;
                            l.setText(a);
                            l.setAlpha(0);
                            if (b1) {
                               i3 = tv.I;
                               i3.setVisibility(i);
                               i3.d(tb, tc, uArrayList);
                            }else {
                               i3 = tv.J;
                               i3.setVisibility(i);
                               ArrayList uArrayList2 = new ArrayList(aj0.b0(uArrayList));
                               Iterator iterator2 = uArrayList.iterator();
                               while (iterator2.hasNext()) {
                                  uArrayList2.add(new ey1(iterator2.next().a, ""));
                               }
                               i3.a(tb, new fy1(uArrayList2));
                            }
                            ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(i3, ViewGroup.ALPHA, new float[i1]{0x3f800000,0}).setDuration(1000);
                            co5.l(objectAnimat, "ofFloat\(viewToAnimate, A…ALPHA_ANIMATION_DURATION\)");
                            ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(tv.H, ViewGroup.ALPHA, new float[i1]{0,0x3f800000}).setDuration(1000);
                            co5.l(objectAnimat1, "ofFloat\(animationView, A…ALPHA_ANIMATION_DURATION\)");
                            ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(k, ViewGroup.ALPHA, new float[i1]{0x3f800000,0});
                            objectAnimat2.setDuration(500);
                            ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(l, ViewGroup.ALPHA, new float[i1]{0,0x3f800000});
                            objectAnimat3.setDuration(500);
                            AnimatorSet uAnimatorSet = new AnimatorSet();
                            Animator[] uAnimatorArr = new Animator[i1];
                            uAnimatorArr[i] = objectAnimat2;
                            uAnimatorArr[1] = objectAnimat3;
                            uAnimatorSet.playSequentially(uAnimatorArr);
                            GreatPicksLoadingView m = tv.M;
                            m.setStartDelay(2000);
                            Animator[] uAnimatorArr1 = new Animator[]{objectAnimat,objectAnimat1,uAnimatorSet};
                            m.playTogether(uAnimatorArr1);
                            m.start();
                            return;
                         }else {
                            co5.N("properties");
                            throw ovoid;
                         }
                      }
                   }else {
                      co5.N("imageLoader");
                      throw ovoid;
                   }
                }else {
                   co5.N("scheduler");
                   throw ovoid;
                }
             }else {
                co5.N("greatPicksLoadingView");
                throw ovoid;
             }
          }else {
             co5.N("screen");
             throw ovoid;
          }
       }
    }
}
