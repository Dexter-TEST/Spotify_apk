package p.dz3;
import p.i50;
import p.ua;
import p.o26;
import java.lang.Object;
import p.ay6;
import p.wf2;
import p.xy3;
import android.content.Context;
import java.lang.String;
import p.co5;
import p.sc;
import androidx.fragment.app.f;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import p.sb4;
import androidx.fragment.app.Fragment;
import p.vy3;
import java.lang.Boolean;
import p.vu5;
import java.util.ArrayList;
import p.ye7;
import java.util.List;
import android.os.BaseBundle;
import p.ne4;
import p.az3;
import p.ek3;
import p.xz4;
import androidx.lifecycle.b;
import androidx.fragment.app.o;
import java.lang.Class;
import p.fv1;
import p.uy3;
import com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import com.spotify.mobius.rx3.RxMobius;
import p.qy3;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.my3;
import p.ir0;
import p.hs0;
import p.ny3;
import p.oy3;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.xo0;
import com.spotify.mobius.rx3.RxConnectables;
import p.kd7;
import p.lb4;
import p.mi;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observable;
import p.nv1;
import com.spotify.mobius.rx3.RxEventSources;
import p.gg1;
import p.xz3;
import p.j93;
import p.er7;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p.f50;
import p.bz3;
import android.view.View$OnClickListener;
import java.lang.IllegalArgumentException;

public final class dz3 extends i50	// class@0013e7 from classes.dex
{
    public final sc I;
    public yy3 J;
    public final ay6 K;
    public ConstraintLayout L;
    public LinearLayout M;
    public TextView N;
    public static final int O;

    public void dz3(ua p0){
       super();
       this.I = p0;
       this.K = new ay6(new o26(25, this));
    }
    public final xy3 C(){
       return this.K.getValue();
    }
    public final void onAttach(Context p0){
       co5.o(p0, "context");
       this.I.a(this);
       super.onAttach(p0);
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       co5.o(p0, "inflater");
       View view = p0.inflate(R.layout.lyrics_fullscreen_report_fragment, p1, false);
       View view1 = view.findViewById(R.id.root);
       co5.l(view1, "view.findViewById\(R.id.root\)");
       this.L = view1;
       view1 = view.findViewById(R.id.report_options_container);
       co5.l(view1, "view.findViewById\(R.id.report_options_container\)");
       this.M = view1;
       view1 = view.findViewById(R.id.cancel);
       co5.l(view1, "view.findViewById\(R.id.cancel\)");
       this.N = view1;
       return view;
    }
    public final void onStart(){
       xy3 v;
       super.onStart();
       if ((v = this.C().v) != null) {
          v.f();
          return;
       }else {
          co5.N("controller");
          throw null;
       }
    }
    public final void onStop(){
       xy3 v;
       super.onStop();
       if ((v = this.C().v) != null) {
          v.g();
          return;
       }else {
          co5.N("controller");
          throw null;
       }
    }
    public final void onViewCreated(View p0,Bundle p1){
       Bundle arguments;
       String str3;
       Bundle arguments1;
       dz3 tL;
       void ovoid;
       co5.o(p0, "view");
       super.onViewCreated(p0, p1);
       Context context = this.getContext();
       String str = "Required value was null.";
       if (context == null) {
          throw new IllegalArgumentException(str.toString());
       }
       Boolean uBoolean = ((arguments = this.getArguments()) != null)? Boolean.valueOf(arguments.getBoolean("lyrics_track_report_provider_synced_value")): null;
       if (uBoolean != null) {
          vu5[] ovu5Array = new vu5[2];
          String str1 = context.getString(R.string.lyrics_fullscreen_report_option_some_lyrics_are_wrong);
          co5.l(str1, "context.getString\(R.stri…on_some_lyrics_are_wrong\)");
          vu5 ovu5 = new vu5("SOME_INCORRECT_LYRICS", str1);
          ovu5Array[0] = ovu5;
          String str2 = context.getString(R.string.lyrics_fullscreen_report_option_all_lyrics_are_wrong);
          co5.l(str2, "context.getString\(R.stri…ion_all_lyrics_are_wrong\)");
          ovu5 = new vu5("ALL_INCORRECT_LYRICS", str2);
          ovu5Array[1] = ovu5;
          ArrayList uArrayList = ye7.M(ovu5Array);
          if (uBoolean.booleanValue()) {
             str3 = context.getString(R.string.lyrics_fullscreen_report_option_lyrics_not_synced_properly);
             co5.l(str3, "context.getString\(R.stri…rics_not_synced_properly\)");
             uArrayList.add(new vu5("INCORRECT_SYNC", str3));
          }
          str3 = ((str3 = this.getArguments()) != null)? str3.getString("lyrics_track_report_uri"): null;
          if (str3 != null) {
             String str4 = ((arguments = this.getArguments()) != null)? arguments.getString("lyrics_track_report_provider"): null;
             if (str4 != null) {
                String str5 = ((arguments1 = this.getArguments()) != null)? arguments1.getString("lyrics_track_report_provider_lyrics_id"): null;
                if (str5 != null) {
                   this.C().x.getValue().f(this, new az3(this));
                   xy3 oxy3 = this.C();
                   o parentFragme = this.getParentFragmentManager();
                   co5.l(parentFragme, "parentFragmentManager");
                   oxy3.getClass();
                   xy3 t = oxy3.t;
                   t.getClass();
                   uy3 a = t.a;
                   co5.o(a, "lyricsTrackReporter");
                   RxMobius$SubtypeEffectHandlerBuilder subtypeEffec = RxMobius.a();
                   subtypeEffec.d(my3.class, new qy3(parentFragme, 0), id.a());
                   hs0 ohs0 = new hs0(10, a);
                   subtypeEffec.d(ny3.class, ohs0, id.a());
                   qy3 a1 = new qy3(parentFragme, 1);
                   subtypeEffec.d(oy3.class, a1, id.a());
                   ObservableSource[] observableSo = new ObservableSource[]{Observable.empty()};
                   sb4 osb4 = new sb4(mi.A(fv1.y, RxConnectables.a(subtypeEffec.h())).c(RxEventSources.a(observableSo)), new vy3(str3, uArrayList, str4, str5), gg1.z, new xz3());
                   osb4.a(oxy3);
                   oxy3.v = osb4;
                   if ((tL = this.L) != null) {
                      BottomSheetBehavior uBottomSheet = BottomSheetBehavior.z(tL);
                      uBottomSheet.E(3);
                      uBottomSheet.C(1);
                      uBottomSheet.E = true;
                      f50 uof50 = new f50(2, this);
                      uBottomSheet = uBottomSheet.Q;
                      if (!uBottomSheet.contains(uof50)) {
                         uBottomSheet.add(uof50);
                      }
                      if ((tL = this.N) != null) {
                         tL.setOnClickListener(new bz3(this));
                         return;
                      }else {
                         co5.N("cancelTextView");
                         throw null;
                      }
                   }else {
                      co5.N("root");
                      throw null;
                   }
                }else {
                   throw new IllegalArgumentException(str.toString());
                }
             }else {
                throw new IllegalArgumentException(str.toString());
             }
          }else {
             throw new IllegalArgumentException(str.toString());
          }
       }else {
          throw new IllegalArgumentException(str.toString());
       }
    }
    public final int w(){
       return 0x7f13018f;
    }
}
