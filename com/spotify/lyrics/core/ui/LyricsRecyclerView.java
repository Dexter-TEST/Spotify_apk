package com.spotify.lyrics.core.ui.LyricsRecyclerView;
import p.dx3;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.kb;
import p.ay6;
import p.wf2;
import p.ly3;
import p.tw3;
import p.yq5;
import p.un0;
import p.ej5;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import p.gh4;
import p.dj0;
import androidx.recyclerview.widget.LinearLayoutManager;
import p.hr5;
import p.b56;
import io.reactivex.rxjava3.core.Completable;
import p.hy3;
import p.by3;
import p.ba0;
import p.wh7;
import android.view.View;
import p.gh7;
import p.kk7;
import p.an5;
import p.j86;
import android.view.View$OnLayoutChangeListener;
import p.u44;
import p.gy3;
import p.gu0;
import p.iz3;
import p.dk3;
import p.vj3;
import p.il7;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import p.ir2;
import p.bi5;
import io.reactivex.rxjava3.core.Observable;
import p.uf;
import io.reactivex.rxjava3.core.ObservableSource;
import p.w00;
import io.reactivex.rxjava3.core.Scheduler;
import p.hs0;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.hz3;
import p.jy3;
import p.g37;
import p.hx3;
import p.er5;
import p.qw3;
import java.util.Collection;
import p.ky3;
import p.dr5;
import java.lang.Class;
import p.hl7;
import io.reactivex.rxjava3.core.Flowable;
import p.b72;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import java.util.concurrent.TimeUnit;
import p.s36;
import java.util.Objects;
import p.e72;
import p.ay3;
import p.q87;
import p.zq5;
import p.ng2;
import p.t00;
import p.dq2;

public final class LyricsRecyclerView extends RecyclerView implements dx3	// class@0009e7 from classes.dex
{
    public ng2 a1;
    public hy3 b1;
    public b56 c1;
    public g37 d1;
    public hz3 e1;
    public final ay6 f1;
    public static final int g1;

    public void LyricsRecyclerView(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0);
       this.f1 = new ay6(new kb(this, 7, p0));
    }
    private final ly3 getItemDecoration(){
       return this.f1.getValue();
    }
    private final tw3 getLyricsAdapter(){
       List list;
       Iterator obj;
       yq5 adapter = this.getAdapter();
       co5.j(adapter, "null cannot be cast to non-null type androidx.recyclerview.widget.ConcatAdapter");
       un0 t = adapter.t;
       if (t.a.isEmpty()) {
          list = Collections.emptyList();
       }else {
          ArrayList uArrayList = new ArrayList(t.a.size());
          obj = t.a.iterator();
          while (obj.hasNext()) {
             uArrayList.add(obj.next().c);
          }
          list = uArrayList;
       }
       list = Collections.unmodifiableList(list);
       co5.l(list, "adapter as ConcatAdapter\).adapters");
       obj = dj0.k0(list);
       co5.j(obj, "null cannot be cast to non-null type com.spotify.lyrics.core.ui.LyricsAdapter");
       return obj;
    }
    private final LinearLayoutManager getLyricsLayoutManger(){
       return this.getLayoutManager();
    }
    public int getFirstVisibleItemIndex(){
       LinearLayoutManager lyricsLayout;
       int i = -1;
       try{
          if ((lyricsLayout = this.getLyricsLayoutManger()) != null) {
             i = lyricsLayout.a1();
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public int getFocusedLineIndex(){
       LyricsRecyclerView tc1;
       if ((tc1 = this.c1) != null) {
          return tc1.b();
       }
       co5.N("scroller");
       throw 0;
    }
    public int getLastVisibleItemIndex(){
       LinearLayoutManager lyricsLayout;
       int i = -1;
       try{
          if ((lyricsLayout = this.getLyricsLayoutManger()) != null) {
             i = lyricsLayout.c1();
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public Completable getMinimumCharactersDisplayedCompletable(){
       LyricsRecyclerView tb1;
       if ((tb1 = this.b1) != null) {
          by3 d = tb1.b.e.b.d;
          co5.l(d, "<get-minimumCharactersDisplayedCompletable>\(...\)");
          return d;
       }else {
          co5.N("presenter");
          throw null;
       }
    }
    public final void onAttachedToWindow(){
       LyricsRecyclerView tb1;
       super.onAttachedToWindow();
       if (gh7.c(this) && !this.isLayoutRequested()) {
          int i = this.getWidth() - (this.getPaddingRight() + this.getPaddingLeft());
          if ((tb1 = this.b1) != null) {
             tb1.d.onNext(new kk7(i, this.getHeight()));
          }else {
             co5.N("presenter");
             throw null;
          }
       }else {
          this.addOnLayoutChangeListener(new j86(4, this));
       }
       return;
    }
    public final void onDetachedFromWindow(){
       LyricsRecyclerView tb1;
       gy3 b;
       gu0 b1;
       iz3 i;
       by3 j;
       super.onDetachedFromWindow();
       if ((tb1 = this.b1) != null) {
          tb1.f.t();
          hy3 a = tb1.a;
          a.f.t();
          if ((b = a.b) != null && ((b1 = b.b) != null && (i = b1.i) != null)) {
             i.c(a.g.getValue());
          }
          hy3 b2 = tb1.b;
          b2.f.t();
          if ((j = b2.j) != null) {
             il7 a1 = j.a;
             a1.getViewTreeObserver().removeOnScrollChangedListener(j.c);
             a1.removeOnLayoutChangeListener(null);
          }
          return;
       }else {
          co5.N("presenter");
          throw null;
       }
    }
    public final void p0(hy3 p0){
       co5.o(p0, "containerPresenter");
       this.b1 = p0;
       Disposable uDisposable = Observable.combineLatest(p0.d.filter(ir2.h0).distinctUntilChanged(), p0.c.filter(ir2.i0).distinctUntilChanged(), new uf(0, p0)).observeOn(p0.g).subscribe(new hs0(9, p0));
       co5.l(uDisposable, "override fun onViewAvail…        }\n        \)\n    }");
       p0.f.s(uDisposable);
    }
    public final void q0(hz3 p0){
       LyricsRecyclerView te11;
       LyricsRecyclerView te12;
       LyricsRecyclerView te13;
       this.e1 = p0;
       yq5[] oyq5Array = new yq5[2];
       LyricsRecyclerView td1 = this.d1;
       void ovoid = null;
       if (td1 != null) {
          oyq5Array[0] = new tw3(p0, td1, new jy3(this));
          LyricsRecyclerView te1 = this.e1;
          String str = "uiModel";
          if (te1 != null) {
             oyq5Array[1] = new hx3(te1);
             this.setAdapter(new un0(oyq5Array));
             if ((te11 = this.e1) != null) {
                if (te11.i != null) {
                   this.b0(this.getItemDecoration());
                   this.h(this.getItemDecoration(), -1);
                }
                if ((te12 = this.e1) != null) {
                   int i = te12.a.a.size();
                   if ((te13 = this.e1) != null) {
                      this.c1 = new b56(this, i, te13.g, te13.j);
                      this.setItemAnimator(new ky3(this));
                      if ((te11 = this.b1) != null) {
                         b72 il7 i1 = new il7(this);
                         hy3 b = te11.b;
                         b.getClass();
                         b.j = i1;
                         hl7 str1 = new hl7(i1);
                         i1 = new b72(str1);
                         TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
                         Scheduler b1 = s36.b;
                         Objects.requireNonNull(mILLISECONDS, "unit is null");
                         Objects.requireNonNull(b1, "scheduler is null");
                         e72 uoe72 = new e72(i1, mILLISECONDS, b1);
                         Disposable uDisposable = uoe72.subscribe(new ay3(b, 1));
                         co5.l(uDisposable, "override fun viewVisibil…        }\n        \)\n    }");
                         b.f.s(uDisposable);
                         return;
                      }else {
                         co5.N("presenter");
                         throw ovoid;
                      }
                   }else {
                      co5.N(str);
                      throw ovoid;
                   }
                }else {
                   co5.N(str);
                   throw ovoid;
                }
             }else {
                co5.N(str);
                throw ovoid;
             }
          }else {
             co5.N(str);
             throw ovoid;
          }
       }else {
          co5.N("lyricViewLineSpec");
          throw ovoid;
       }
    }
    public final void r0(int p0,int p1){
       tw3 lyricsAdapte = this.getLyricsAdapter();
       tw3 t = lyricsAdapte.t;
       if (t.b != p0 || t.c != p1) {
          t.b = p0;
          t.c = p1;
          lyricsAdapte.g();
       }
       return;
    }
    public final void s0(q87 p0){
       LyricsRecyclerView tc1;
       View view1;
       int i3;
       co5.o(p0, "translationState");
       tw3 lyricsAdapte = this.getLyricsAdapter();
       lyricsAdapte.getClass();
       Object obj = null;
       if (!co5.c(lyricsAdapte.x, p0)) {
          lyricsAdapte.x = p0;
          int i = lyricsAdapte.d();
          lyricsAdapte.a.d(0, i, obj);
       }
       if ((tc1 = this.c1) != null) {
          b56 e = tc1.e;
          LinearLayoutManager linearLayout = tc1.a();
          View view = linearLayout.e1(0, linearLayout.I(), true, 0);
          int i1 = -1;
          view = (view == null)? -1: hr5.R(view);
          int i2 = tc1.a().b1();
          e = (view <= e && e <= i2)? 1: 0;
          if (e) {
             tc1.e(tc1.e, 0);
          }else {
             LinearLayoutManager linearLayout1 = tc1.a();
             if ((view1 = linearLayout1.e1(0, linearLayout1.I(), true, 0)) != null) {
                i1 = hr5.R(view1);
             }
             tc1.a().r1(i1, 0);
          }
          return;
       }else {
          co5.N("scroller");
          throw obj;
       }
    }
    public void setOnLineClickedAction(ng2 p0){
       co5.o(p0, "lineClickedListener");
       this.a1 = p0;
    }
    public void setTranslationState(q87 p0){
       LyricsRecyclerView tb1;
       co5.o(p0, "translationState");
       if ((tb1 = this.b1) != null) {
          hy3 a = tb1.a;
          a.getClass();
          a.d.onNext(p0);
          return;
       }else {
          co5.N("presenter");
          throw null;
       }
    }
    public final void t0(dq2 p0){
       co5.o(p0, "highlightState");
       tw3 lyricsAdapte = this.getLyricsAdapter();
       lyricsAdapte.getClass();
       lyricsAdapte.y = p0;
       lyricsAdapte.g();
    }
}
