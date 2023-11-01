package com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import androidx.fragment.app.Fragment;
import p.ts5;
import java.lang.String;
import p.ir2;
import p.sc;
import java.lang.Object;
import p.co5;
import p.o26;
import p.if2;
import p.x86;
import java.lang.Class;
import p.uf0;
import p.ns5;
import p.t76;
import p.wf2;
import p.yi7;
import p.eb3;
import p.r76;
import p.m02;
import p.nb;
import android.view.View;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import android.transition.TransitionInflater;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import p.yy;
import java.util.concurrent.CopyOnWriteArraySet;
import com.spotify.search.view.BackKeyEditText;
import p.h76;
import p.xk7;
import android.widget.EditText;
import java.lang.Runnable;
import com.spotify.search.view.ToolbarSearchFieldView;
import android.animation.Animator;
import p.l67;
import android.view.inputmethod.InputMethodManager;
import p.n6;
import android.os.IBinder;
import p.fh5;
import p.ds3;
import p.fb4;
import p.li5;
import p.nb7;
import android.widget.TextView;
import android.widget.Button;
import p.n76;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p.y14;
import p.x14;
import java.util.List;
import p.dj0;
import p.o76;
import androidx.fragment.app.k;
import androidx.activity.a;
import p.ek3;
import p.sd2;
import p.k15;
import androidx.activity.b;
import p.o56;
import p.p76;
import p.r61;
import p.q77;
import androidx.recyclerview.widget.RecyclerView;
import p.q71;
import p.dr5;
import p.yq5;
import p.mr5;
import p.q76;
import p.xz4;
import androidx.lifecycle.b;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import p.oi7;
import android.view.animation.Animation$AnimationListener;

public final class SearchFragment extends Fragment	// class@00050c from classes.dex
{
    public o56 A;
    public ViewGroup B;
    public ViewGroup C;
    public View D;
    public TextView E;
    public TextView F;
    public Button G;
    public boolean H;
    public h76 I;
    public final r76 J;
    public final m02 K;
    public boolean L;
    public final sc a;
    public SearchConfiguration b;
    public fh5 c;
    public gj4 t;
    public r61 v;
    public q77 w;
    public aj7 x;
    public final yi7 y;
    public RecyclerView z;
    public static final ts5 M;

    static {
       SearchFragment.M = new ts5("\(?<=step=\).*\(?=&\)");
    }
    public void SearchFragment(){
       super(ir2.c);
    }
    public void SearchFragment(sc p0){
       co5.o(p0, "injector");
       super(0x7f0d0143);
       this.a = p0;
       this.y = eb3.i(this, ns5.a(x86.class), new t76(new if2(this, 3), 0), new o26(7, this));
       this.J = new r76(this);
       this.K = new m02(1, this);
       this.L = true;
       co5.i(nb.t.b);
    }
    public final void A(boolean p0){
       SearchFragment tz;
       if ((tz = this.z) != null) {
          int i = (p0)? 0: 8;
          tz.setVisibility(i);
          return;
       }else {
          co5.N("searchRecyclerView");
          throw null;
       }
    }
    public final void onAttach(Context p0){
       co5.o(p0, "context");
       this.a.a(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       p0 = this.requireArguments();
       co5.l(p0, "requireArguments\(\)");
       Parcelable parcelable = p0.getParcelable("allboarding-search-arg");
       co5.i(parcelable);
       this.b = parcelable;
       this.setSharedElementEnterTransition(TransitionInflater.from(this.requireContext()).inflateTransition(0x10f0001));
       this.u();
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
    public final void onStart(){
       super.onStart();
       SearchFragment tI = this.I;
       void ovoid = null;
       String str = "searchField";
       if (tI != null) {
          SearchFragment tJ = this.J;
          tJ.getClass();
          tI.a.add(tJ);
          if ((tI = this.I) != null) {
             BackKeyEditText uBackKeyEdit = tI.a();
             uBackKeyEdit.requestFocus();
             uBackKeyEdit.postDelayed(new xk7(uBackKeyEdit, 1), (long)250);
             ToolbarSearchFieldView c = tI.d.C;
             Animator[] uAnimatorArr = new Animator[]{c.d,c.c};
             c.b(uAnimatorArr);
             return;
          }else {
             co5.N(str);
             throw ovoid;
          }
       }else {
          co5.N(str);
          throw ovoid;
       }
    }
    public final void onStop(){
       SearchFragment tI;
       InputMethodManager inputMethodM;
       super.onStop();
       if ((tI = this.I) != null) {
          SearchFragment tJ = this.J;
          tJ.getClass();
          tI.a.remove(tJ);
          Context uContext = this.requireContext();
          co5.l(uContext, "requireContext\(\)");
          View view = this.requireView();
          co5.l(view, "requireView\(\)");
          if ((inputMethodM = n6.e(uContext, InputMethodManager.class)) != null) {
             inputMethodM.hideSoftInputFromWindow(view.getWindowToken(), 0);
          }
          return;
       }else {
          co5.N("searchField");
          throw null;
       }
    }
    public final void onViewCreated(View p0,Bundle p1){
       View view;
       SearchFragment tb;
       SearchFragment tv;
       co5.o(p0, "view");
       this.u();
       super.onViewCreated(p0, p1);
       fh5 uofh5 = this.w();
       uofh5 = uofh5.c;
       uofh5.getClass();
       uofh5.b.a(new li5(uofh5).f());
       view = p0.findViewById(R.id.empty_state_view);
       Context uContext = this.requireContext();
       String str = "requireContext\(\)";
       co5.l(uContext, str);
       view.setBackgroundColor(n6.b(uContext, R.color.allboarding_stockholm_black_bg));
       co5.l(view, "view.findViewById<ViewGr…)\n            \)\n        }");
       this.C = view;
       view = p0.findViewById(R.id.empty_state_container);
       co5.l(view, "view.findViewById\(R.id.empty_state_container\)");
       this.D = view;
       SearchFragment tC = this.C;
       String str1 = "emptyState";
       if (tC != null) {
          view = tC.findViewById(0x1020014);
          co5.l(view, "emptyState.findViewById\(android.R.id.text1\)");
          this.E = view;
          if ((tC = this.C) != null) {
             view = tC.findViewById(0x1020015);
             co5.l(view, "emptyState.findViewById\(android.R.id.text2\)");
             this.F = view;
             if ((tC = this.C) != null) {
                view = tC.findViewById(R.id.empty_view_button);
                co5.l(view, "emptyState.findViewById\(…s.R.id.empty_view_button\)");
                this.G = view;
                view.setOnClickListener(new n76(this));
                tC = this.b;
                str1 = "searchConfig";
                if (tC != null) {
                   String url = tC.getUrl();
                   ts5 m = SearchFragment.M;
                   m.getClass();
                   co5.o(url, "input");
                   Matcher matcher = m.a.matcher(url);
                   co5.l(matcher, "nativePattern.matcher\(input\)");
                   y14 oy14 = (!matcher.find(0))? null: new y14(matcher, url);
                   if (oy14 != null) {
                      if (oy14.b == null) {
                         oy14.b = new x14(oy14);
                      }
                      y14 b = oy14.b;
                      co5.i(b);
                      url = dj0.k0(b);
                   }else {
                      void ovoid = null;
                   }
                   if (co5.c(url, "SHOW_CATEGORY")) {
                      view = p0.findViewById(R.id.loading_view_podcasts);
                      co5.l(view, "view.findViewById\(R.id.loading_view_podcasts\)");
                   }else {
                      String str2 = "view.findViewById\(R.id.loading_view_artists\)";
                      int i = 0x7f0a0445;
                      if (co5.c(url, "ARTIST")) {
                         view = p0.findViewById(i);
                         co5.l(view, str2);
                      }else {
                         view = p0.findViewById(i);
                         co5.l(view, str2);
                      }
                   }
                   this.B = view;
                   ToolbarSearchFieldView toolbarSearc = p0.findViewById(R.id.search_toolbar);
                   Context uContext1 = this.requireContext();
                   co5.l(uContext1, str);
                   co5.l(toolbarSearc, "searchFieldView");
                   this.I = new h76(uContext1, toolbarSearc, true);
                   Button searchPlaceH = toolbarSearc.getSearchPlaceHolder();
                   if ((tb = this.b) != null) {
                      searchPlaceH.setText(tb.getPlaceholder());
                      tC = this.I;
                      str1 = "searchField";
                      if (tC != null) {
                         tC.d.getSearchPlaceHolder().setVisibility(8);
                         if ((tC = this.I) != null) {
                            if ((tC.b = new o76(this)) != null) {
                               tC.b();
                               ek3 viewLifecycl = this.getViewLifecycleOwner();
                               co5.l(viewLifecycl, "viewLifecycleOwner");
                               this.requireActivity().x.a(viewLifecycl, new sd2(this, 3));
                               if ((tv = this.v) != null) {
                                  if ((tb = this.w) != null) {
                                     this.A = new o56(tv, tb, new p76(0, this), new p76(true, this));
                                     p0 = p0.findViewById(R.id.search_rv);
                                     co5.l(p0, "view.findViewById\(R.id.search_rv\)");
                                     this.z = p0;
                                     q71 oq71 = new q71();
                                     oq71.g = false;
                                     p0.setItemAnimator(oq71);
                                     SearchFragment tz = this.z;
                                     url = "searchRecyclerView";
                                     if (tz != null) {
                                        if ((tv = this.A) != null) {
                                           tz.setAdapter(tv);
                                           if ((tz = this.z) != null) {
                                              tz.i(this.K);
                                              this.v().A.f(this.getViewLifecycleOwner(), new q76(this));
                                              this.u();
                                              return;
                                           }else {
                                              co5.N(url);
                                              throw null;
                                           }
                                        }else {
                                           co5.N("rvAdapter");
                                           throw null;
                                        }
                                     }else {
                                        co5.N(url);
                                        throw null;
                                     }
                                  }else {
                                     co5.N("circleTransformation");
                                     throw null;
                                  }
                               }else {
                                  co5.N("imageLoader");
                                  throw null;
                               }
                            }else {
                               co5.N(str1);
                               throw null;
                            }
                         }else {
                            co5.N(str1);
                            throw null;
                         }
                      }else {
                         co5.N(str1);
                         throw null;
                      }
                   }else {
                      co5.N(str1);
                      throw null;
                   }
                }else {
                   co5.N(str1);
                   throw null;
                }
             }else {
                co5.N(str1);
                throw null;
             }
          }else {
             co5.N(str1);
             throw null;
          }
       }else {
          co5.N(str1);
          throw null;
       }
    }
    public final void u(){
       if (this.t != null) {
          return;
       }
       co5.N("pageLoadTimeKeeper");
       throw null;
    }
    public final x86 v(){
       return this.y.getValue();
    }
    public final fh5 w(){
       SearchFragment tc;
       if ((tc = this.c) != null) {
          return tc;
       }
       co5.N("ubiSearchLogger");
       throw null;
    }
    public final void x(String p0,String p1,String p2){
       SearchFragment tF;
       SearchFragment tE = this.E;
       String str = "emptyStateTitle";
       if (tE != null) {
          tE.setText(p0);
          if ((tE = this.E) != null) {
             str = 1;
             int i = 0;
             int i1 = (p0.length() > 0)? 1: 0;
             i1 = (i1)? 0: 8;
             tE.setVisibility(i1);
             if ((tF = this.F) != null) {
                tF.setText(p1);
                if ((tF = this.F) != null) {
                   int i2 = (p1.length() > 0)? 1: 0;
                   i2 = (i2)? 0: 8;
                   tF.setVisibility(i2);
                   tF = this.G;
                   i2 = "emptyStateBtn";
                   if (tF != null) {
                      tF.setText(p2);
                      if ((tF = this.G) != null) {
                         if (p2.length() <= 0) {
                            str = 0;
                         }
                         if (!str) {
                            i = 8;
                         }
                         tF.setVisibility(i);
                         return;
                      }else {
                         co5.N(i2);
                         throw null;
                      }
                   }else {
                      co5.N(i2);
                      throw null;
                   }
                }else {
                   co5.N("emptyStateSubtitle");
                   throw null;
                }
             }else {
                co5.N("emptyStateSubtitle");
                throw null;
             }
          }else {
             co5.N(str);
             throw null;
          }
       }else {
          co5.N(str);
          throw null;
       }
    }
    public final void y(boolean p0){
       SearchFragment tD;
       if (p0) {
          this.w().h();
       }
       if ((tD = this.D) != null) {
          int i = (p0)? 0: 8;
          tD.setVisibility(i);
          return;
       }else {
          co5.N("emptyStateContainer");
          throw null;
       }
    }
    public final void z(boolean p0,long p1){
       SearchFragment tB;
       AlphaAnimation uAlphaAnimat;
       void ovoid = null;
       String str = "loadingView";
       if (p0) {
          if ((tB = this.B) != null) {
             if (tB.getVisibility()) {
                tB.setVisibility(0);
                uAlphaAnimat = new AlphaAnimation(0, 0x3f800000);
                uAlphaAnimat.setDuration(p1);
                uAlphaAnimat.setFillAfter(true);
                uAlphaAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
                tB.startAnimation(uAlphaAnimat);
             }
             fh5 uofh5 = this.w();
             uofh5 = uofh5.c;
             uofh5.getClass();
             uofh5.b.a(new fh5(uofh5).e());
          }else {
             co5.N(str);
             throw ovoid;
          }
       }else if((tB = this.B) != null){
          if (tB.getVisibility() != 8) {
             uAlphaAnimat = new AlphaAnimation(0x3f800000, 0);
             uAlphaAnimat.setDuration(p1);
             uAlphaAnimat.setFillAfter(true);
             uAlphaAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
             uAlphaAnimat.setAnimationListener(new oi7(tB));
             tB.startAnimation(uAlphaAnimat);
          }
       }else {
          co5.N(str);
          throw ovoid;
       }
       return;
    }
}
