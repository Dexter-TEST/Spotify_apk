package p.tl6;
import androidx.fragment.app.f;
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
import java.lang.String;
import android.os.BaseBundle;
import p.or7;
import p.ul6;
import p.wl6;
import p.vl6;
import p.aq6;
import java.lang.Class;
import p.co5;
import p.vs0;
import p.yp6;
import java.lang.IllegalStateException;
import android.app.Dialog;

public class tl6 extends f	// class@002796 from classes.dex
{
    public rj2 H;
    public wd5 I;
    public wl6 J;
    public static final int K;

    public void tl6(){
       super();
    }
    public final void onAttach(Context p0){
       super.onAttach(p0);
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.H = new rj2(this.getActivity(), new up0(7, this), this.I);
       ft0 uoft0 = new ft0(0);
       uoft0.e = true;
       this.H.b(uoft0);
       this.getActivity().x.a(this, new sd2(7, this, true));
    }
    public final void onPause(){
       super.onPause();
       if (!this.isStateSaved()) {
          this.v(false, false);
       }
       return;
    }
    public final void onStart(){
       k ok;
       super.onStart();
       Bundle arguments = this.getArguments();
       int i = 0;
       if (arguments != null) {
          String str = arguments.getString("uri");
          tl6 tJ = this.J;
          Fragment parentFragme = this.getParentFragment();
          if (parentFragme instanceof ul6) {
          }else {
             ok = this.getActivity();
             if (ok instanceof ul6) {
             }else {
                throw new IllegalStateException("No sleep timer context menu host");
             }
          }
          ok = this.requireActivity();
          tl6 tJ1 = this.J;
          vl6 ovl6 = new vl6(ok, tJ1, new or7(tJ, str, parentFragme));
          tl6 tH = this.H;
          ft0 uoft0 = new ft0(i);
          String str1 = ok.getString(R.string.context_menu_sleep_timer_title);
          ft0 a = uoft0.a;
          a.getClass();
          co5.o(str1, "<set-?>");
          a.a = str1;
          ovl6.a(uoft0, R.id.menu_item_sleep_timer_5_mins);
          ovl6.a(uoft0, R.id.menu_item_sleep_timer_10_mins);
          ovl6.a(uoft0, R.id.menu_item_sleep_timer_15_mins);
          ovl6.a(uoft0, R.id.menu_item_sleep_timer_30_mins);
          ovl6.a(uoft0, R.id.menu_item_sleep_timer_45_mins);
          ovl6.a(uoft0, R.id.menu_item_sleep_timer_1_hour);
          if (new aq6(str).b == yp6.m0) {
             ovl6.a(uoft0, R.id.menu_item_sleep_timer_end_of_episode);
          }else {
             ovl6.a(uoft0, R.id.menu_item_sleep_timer_end_of_track);
          }
          if (tJ1.b()) {
             ovl6.a(uoft0, R.id.menu_item_sleep_timer_turn_off);
          }
          tH.b(uoft0);
       }else {
          this.v(i, i);
       }
       return;
    }
    public final Dialog x(Bundle p0){
       return this.H.a();
    }
}
