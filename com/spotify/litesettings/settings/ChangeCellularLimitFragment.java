package com.spotify.litesettings.settings.ChangeCellularLimitFragment;
import androidx.fragment.app.Fragment;
import p.p80;
import p.n80;
import p.o80;
import p.fn0;
import android.content.Context;
import p.ej4;
import android.os.Bundle;
import p.vd0;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.ry7;
import android.widget.GridLayout;
import android.widget.Button;
import android.widget.TextView;
import p.es;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.res.Resources;
import java.lang.String;
import java.lang.NullPointerException;
import p.wp3;
import p.tn6;
import io.reactivex.rxjava3.core.Observable;
import p.ko1;
import p.ox7;
import p.p4;
import android.view.KeyEvent$Callback;
import java.lang.Object;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.kz6;
import p.i76;
import p.yf2;
import java.util.List;
import java.util.Arrays;
import java.lang.Iterable;
import java.util.Objects;
import p.up0;

public class ChangeCellularLimitFragment extends Fragment	// class@00095f from classes.dex
{
    public final fn0 a;
    public g54 b;
    public vd0 c;
    public es t;
    public static final long A;
    public static final int B;
    public static final long v;
    public static final long w;
    public static final long x;
    public static final long y;
    public static final long z;

    static {
       n80 c = p80.c;
       ChangeCellularLimitFragment.v = c.c(250);
       ChangeCellularLimitFragment.w = c.c(500);
       ChangeCellularLimitFragment.x = c.c(750);
       o80 t = p80.t;
       ChangeCellularLimitFragment.y = t.c(1);
       ChangeCellularLimitFragment.z = t.c(2);
       ChangeCellularLimitFragment.A = t.c(3);
    }
    public void ChangeCellularLimitFragment(){
       super();
       this.a = new fn0();
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.c = this.b.r(this, vd0.class);
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view1;
       View view2;
       View view3;
       View view4;
       View view5;
       View view6;
       View view7;
       View view8;
       View view = p0.inflate(R.layout.change_cellular_limit_fragment, p1, false);
       int i = 0x7f0a00e9;
       if ((view1 = ry7.q(view, i)) != null) {
          i = 0x7f0a00f1;
          if ((view2 = ry7.q(view, i)) != null) {
             i = 0x7f0a00f2;
             if ((view3 = ry7.q(view, i)) != null) {
                i = 0x7f0a00f3;
                if ((view4 = ry7.q(view, i)) != null) {
                   i = 0x7f0a00f4;
                   if ((view5 = ry7.q(view, i)) != null) {
                      i = 0x7f0a00f5;
                      if ((view6 = ry7.q(view, i)) != null) {
                         i = 0x7f0a00f6;
                         if ((view7 = ry7.q(view, i)) != null) {
                            i = 0x7f0a041c;
                            if ((view8 = ry7.q(view, i)) != null) {
                               es i1 = new es(view, view1, view2, view3, view4, view5, view6, view7, view8);
                               this.t = i;
                               return i.a;
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
    public final void onDestroyView(){
       this.a.e();
       this.t = null;
       super.onDestroyView();
    }
    public final void onViewCreated(View p0,Bundle p1){
       ChangeCellularLimitFragment uChangeCellu = this;
       ChangeCellularLimitFragment t = uChangeCellu.t;
       es c = t.c;
       es uoes = t.d;
       es uoes1 = t.e;
       es uoes2 = t.f;
       es uoes3 = t.g;
       es h = t.h;
       vd0 t1 = uChangeCellu.c.t;
       p4 op4 = v10;
       es uoes4 = h;
       es uoes5 = h;
       p4 op41 = v10;
       op4 = new p4(c, uoes, uoes1, uoes2, uoes3, uoes4, 1);
       ChangeCellularLimitFragment a = uChangeCellu.a;
       a.c(ox7.C(t1.c.r(t1.a)).subscribe(op41));
       Observable[] observableAr = new Observable[]{ry7.e(c).map(new i76(12)),ry7.e(uoes).map(new i76(13)),ry7.e(uoes1).map(new i76(14)),ry7.e(uoes2).map(new i76(15)),ry7.e(uoes3).map(new i76(16)),ry7.e(uoes5).map(new i76(17))};
       ChangeCellularLimitFragment c1 = uChangeCellu.c;
       Objects.requireNonNull(c1);
       a.c(Observable.merge(Arrays.asList(observableAr)).flatMap(new up0(22, c1)).subscribe());
    }
}
