package p.yk4;
import androidx.fragment.app.f;
import p.fn0;
import android.content.Context;
import androidx.fragment.app.Fragment;
import p.ej4;
import android.os.Bundle;
import androidx.fragment.app.k;
import p.al4;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import p.rj2;
import p.up0;
import java.lang.Object;
import p.wd5;
import p.ft0;
import androidx.activity.a;
import p.sd2;
import p.ek3;
import p.k15;
import androidx.activity.b;
import p.xk4;
import p.p54;
import io.reactivex.rxjava3.core.Observable;
import p.ws3;
import p.yf2;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.vs3;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.IllegalStateException;
import java.lang.String;
import android.app.Dialog;

public class yk4 extends f	// class@002dd6 from classes.dex
{
    public g54 H;
    public wd5 I;
    public rj2 J;
    public final fn0 K;
    public al4 L;

    public void yk4(){
       super();
       this.K = new fn0();
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.L = this.H.r(this.requireActivity(), al4.class);
       this.J = new rj2(this.getActivity(), new up0(9, this), this.I);
       ft0 uoft0 = new ft0(0);
       uoft0.e = true;
       this.J.b(uoft0);
       this.getActivity().x.a(this, new sd2(9, this, true));
    }
    public final void onPause(){
       super.onPause();
       this.v(false, false);
    }
    public final void onStart(){
       super.onStart();
       yk4 tL = this.L;
       k activity = this.getActivity();
       Fragment parentFragme = this.getParentFragment();
       if (parentFragme instanceof xk4) {
       }else {
          parentFragme = this.getActivity();
          if (parentFragme instanceof xk4) {
          }else {
             throw new IllegalStateException("No context menu host");
          }
       }
       this.K.c(tL.t.e().map(new ws3(tL, activity, parentFragme, 6)).observeOn(id.a()).subscribe(new vs3(25, this)));
       return;
    }
    public final void onStop(){
       super.onStop();
       this.K.dispose();
    }
    public final Dialog x(Bundle p0){
       return this.J.a();
    }
}
