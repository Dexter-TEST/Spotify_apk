package p.zm1;
import androidx.fragment.app.f;
import p.fn0;
import android.content.Context;
import androidx.fragment.app.Fragment;
import p.ej4;
import android.os.Bundle;
import p.rj2;
import androidx.fragment.app.k;
import p.up0;
import java.lang.Object;
import p.wd5;
import p.ft0;
import androidx.activity.a;
import p.sd2;
import p.ek3;
import p.k15;
import androidx.activity.b;
import p.ym1;
import java.lang.String;
import android.os.Parcelable;
import p.k23;
import p.a23;
import p.au2;
import p.aq6;
import p.td7;
import p.bo3;
import java.lang.Class;
import java.util.Set;
import io.reactivex.rxjava3.core.Observable;
import p.wn3;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.xm1;
import p.yf2;
import p.id;
import java.util.Objects;
import p.mg1;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.IllegalStateException;
import android.app.Dialog;

public class zm1 extends f	// class@002f23 from classes.dex
{
    public rj2 H;
    public final fn0 I;
    public wd5 J;
    public wn3 K;
    public m12 L;
    public static final int M;

    public void zm1(){
       super();
       this.I = new fn0();
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.H = new rj2(this.getActivity(), new up0(16, this), this.J);
       ft0 uoft0 = new ft0(0);
       uoft0.e = true;
       this.H.b(uoft0);
       this.getActivity().x.a(this, new sd2(11, this, true));
    }
    public final void onPause(){
       super.onPause();
       if (!this.isStateSaved()) {
          this.v(false, false);
       }
       return;
    }
    public final void onStart(){
       Parcelable parcelable1;
       super.onStart();
       Fragment parentFragme = this.getParentFragment();
       if (parentFragme instanceof ym1) {
       }else {
          parentFragme = this.getActivity();
          if (parentFragme instanceof ym1) {
          }else {
             throw new IllegalStateException("No context menu host");
          }
       }
       Fragment uFragment = parentFragme;
       Context uContext = this.requireContext();
       Bundle arguments = this.getArguments();
       int i = 1;
       if (arguments != null) {
          Parcelable parcelable = arguments.getParcelable("model");
          String str = ((parcelable1 = arguments.getParcelable("bundle")) == null)? null: parcelable1.q("context_uri");
          aq6 uoaq6 = td7.d(str);
          if (parcelable1 != null && uoaq6 != null) {
             this.L.getClass();
             xm1 v9 = new xm1(uContext, uoaq6, uFragment, parcelable, parcelable1, (bo3.q.contains(uoaq6.b) ^ 0x01));
             zm1 tH = this.H;
             Objects.requireNonNull(tH);
             this.I.c(this.K.b(uoaq6).distinctUntilChanged().observeOn(s36.b).map(v9).observeOn(id.a()).subscribe(new mg1(15, tH)));
             tH = 0;
          }
       }
       if (tH) {
          this.v(false, false);
       }
       return;
    }
    public final void onStop(){
       this.I.e();
       super.onStop();
    }
    public final Dialog x(Bundle p0){
       return this.H.a();
    }
}
