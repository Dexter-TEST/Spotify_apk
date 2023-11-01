package p.ci0;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import java.lang.Runnable;
import android.view.View;
import android.os.Handler;
import java.util.HashSet;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.ref.WeakReference;
import p.bi0;
import p.au1;
import android.view.View$OnClickListener;
import p.gi7;
import p.xh0;
import java.lang.NullPointerException;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;
import p.yh0;
import android.view.View$OnTouchListener;
import p.go5;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import p.b3;
import java.util.Iterator;
import java.lang.Class;
import android.view.ViewParent;
import p.av6;
import android.widget.ListView;
import p.di0;
import p.sz1;
import p.f22;
import p.h22;
import org.json.JSONArray;
import org.json.JSONObject;
import android.view.ViewTreeObserver;

public final class ci0 implements ViewTreeObserver$OnGlobalLayoutListener, ViewTreeObserver$OnScrollChangedListener, Runnable	// class@00120e from classes.dex
{
    public final WeakReference a;
    public ArrayList b;
    public final HashSet c;
    public final String t;

    public void ci0(View p0,Handler p1,HashSet p2,String p3){
       co5.o(p1, "handler");
       co5.o(p2, "listenerSet");
       super();
       this.a = new WeakReference(p0);
       this.c = p2;
       this.t = p3;
       p1.postDelayed(this, 200);
    }
    public final void a(bi0 p0,View p1,au1 p2){
       View view;
       if ((view = p0.a()) == null) {
          return;
       }
       View$OnClickListener onClickListe = gi7.e(view);
       if (onClickListe instanceof xh0) {
          if (onClickListe != null) {
             if (onClickListe.v != null) {
                onClickListe = 1;
             label_0022 :
                ci0 tc = this.c;
                p0 = p0.b;
                if (!tc.contains(p0) && !onClickListe) {
                   view.setOnClickListener(new xh0(p2, p1, view));
                   tc.add(p0);
                }
                return;
             }
          }else {
             throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
          }
       }
       onClickListe = 0;
       goto label_0022 ;
    }
    public final void b(bi0 p0,View p1,au1 p2){
       AdapterView uAdapterView;
       if ((uAdapterView = p0.a()) == null) {
          return;
       }
       AdapterView$OnItemClickListener onItemClickL = uAdapterView.getOnItemClickListener();
       if (onItemClickL instanceof yh0) {
          if (onItemClickL != null) {
             if (onItemClickL.v != null) {
                onItemClickL = 1;
             label_0024 :
                ci0 tc = this.c;
                p0 = p0.b;
                if (!tc.contains(p0) && !onItemClickL) {
                   uAdapterView.setOnItemClickListener(new yh0(p2, p1, uAdapterView));
                   tc.add(p0);
                }
                return;
             }
          }else {
             throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
          }
       }
       onItemClickL = 0;
       goto label_0024 ;
    }
    public final void c(bi0 p0,View p1,au1 p2){
       View view;
       if ((view = p0.a()) == null) {
          return;
       }
       View$OnTouchListener onTouchListe = gi7.f(view);
       if (onTouchListe instanceof go5) {
          if (onTouchListe != null) {
             if (onTouchListe.v != null) {
                onTouchListe = 1;
             label_0022 :
                ci0 tc = this.c;
                p0 = p0.b;
                if (!tc.contains(p0) && !onTouchListe) {
                   view.setOnTouchListener(new go5(p2, p1, view));
                   tc.add(p0);
                }
                return;
             }
          }else {
             throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
          }
       }
       onTouchListe = 0;
       goto label_0022 ;
    }
    public final void d(){
       ci0 tb;
       int i;
       au1 d;
       int i3;
       View view1;
       if ((tb = this.b) == null) {
       }else {
          ci0 ta = this.a;
          if (ta.get() != null && (i = tb.size() - 1) >= 0) {
             int i1 = 0;
             while (true) {
                int i2 = i1 + 1;
                au1 uoau1 = tb.get(i1);
                View view = ta.get();
                if (uoau1 != null && view != null) {
                   HashSet a = ((d = uoau1.d) != null && d.length())? 0: 1;
                   ci0 tt = this.t;
                   if (!i3 && !co5.c(d, tt)) {
                   }else {
                      List list = Collections.unmodifiableList(uoau1.b);
                      co5.l(list, "unmodifiableList\(path\)");
                      if (list.size() > 25) {
                      }else {
                         Iterator iterator = b3.k(view, list, 0, -1, tt).iterator();
                         while (iterator.hasNext()) {
                            bi0 uobi0 = iterator.next();
                            try{
                               if ((view1 = uobi0.a()) == null) {
                               }else {
                                  View view2 = view1;
                                  while (true) {
                                     if (view2 != null) {
                                        if (co5.c(view2.getClass().getName(), "com.facebook.react.ReactRootView")) {
                                        }else {
                                           view2 = view2.getParent();
                                           if (view2 instanceof View) {
                                           }else {
                                           label_0097 :
                                              view2 = null;
                                           }
                                        }
                                     }else {
                                        goto label_0097 ;
                                     }
                                  }
                                  if (view2 != null && gi7.i(view1, view2)) {
                                     this.c(uobi0, view, uoau1);
                                  }else if(av6.D0(view1.getClass().getName(), "com.facebook.react", 0)){
                                     continue ;
                                  }else if(!view1 instanceof AdapterView){
                                     this.a(uobi0, view, uoau1);
                                  }else if(view1 instanceof ListView){
                                     this.b(uobi0, view, uoau1);
                                  }
                               }
                            }catch(java.lang.Exception e0){
                               a = sz1.a;
                            }
                         }
                      label_00ca :
                         if (i2 <= i) {
                            i1 = i2;
                         }
                      }
                   }
                }else {
                   goto label_00ca ;
                }
             }
          }
       }
       return;
    }
    public final void onGlobalLayout(){
       this.d();
    }
    public final void onScrollChanged(){
       this.d();
    }
    public final void run(){
       f22 uof22;
       ArrayList uArrayList;
       int i;
       View view;
       if ((uof22 = h22.b(sz1.b())) != null && uof22.g != null) {
          try{
             uArrayList = new ArrayList();
             if ((uof22 = uof22.h) != null && (i = uof22.length()) > 0) {
                int i1 = 0;
                while (true) {
                   int i2 = i1 + 1;
                   JSONObject jSONObject = uof22.getJSONObject(i1);
                   co5.l(jSONObject, "array.getJSONObject\(i\)");
                   uArrayList.add(b3.q(jSONObject));
                   if (i2 < i) {
                      i1 = i2;
                   }
                }
             }
          }catch(org.json.JSONException e0){
          }catch(java.lang.IllegalArgumentException e0){
          }
          this.b = uArrayList;
          if ((view = this.a.get()) == null) {
             return;
          }else {
             ViewTreeObserver viewTreeObse = view.getViewTreeObserver();
             if (viewTreeObse.isAlive()) {
                viewTreeObse.addOnGlobalLayoutListener(this);
                viewTreeObse.addOnScrollChangedListener(this);
             }
             this.d();
          }
       }
       return;
    }
}
