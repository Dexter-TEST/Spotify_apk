package p.mn6;
import androidx.fragment.app.f;
import p.ln6;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import java.lang.IllegalStateException;
import java.lang.String;
import android.content.Context;
import p.ej4;
import android.os.Bundle;
import p.rj2;
import p.up0;
import java.lang.Object;
import p.wd5;
import androidx.activity.a;
import p.sd2;
import p.ek3;
import p.k15;
import androidx.activity.b;
import android.app.Dialog;
import p.ft0;
import android.os.Parcelable;
import p.au2;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.sp6;
import p.lp6;
import android.content.res.Resources;
import p.kn6;
import p.h25;

public class mn6 extends f	// class@001ece from classes.dex
{
    public wd5 H;
    public rj2 I;
    public static final int J;

    public void mn6(){
       super();
    }
    public final ln6 C(){
       Fragment parentFragme = this.getParentFragment();
       if (parentFragme instanceof ln6) {
          return parentFragme;
       }
       k activity = this.getActivity();
       if (activity instanceof ln6) {
          return activity;
       }
       throw new IllegalStateException("No host");
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.I = new rj2(this.getActivity(), new up0(5, this), this.H);
       this.getActivity().x.a(this, new sd2(6, this, true));
    }
    public final Dialog x(Bundle p0){
       Dialog uDialog = this.I.a();
       mn6 tI = this.I;
       Bundle arguments = this.getArguments();
       ft0 uoft0 = new ft0(0);
       if (arguments != null) {
          int i = arguments.getParcelable("bundle").d("option").intValue();
          HashMap hashMap = this.C().j();
          Iterator iterator = hashMap.entrySet().iterator();
          while (iterator.hasNext()) {
             Integer key = iterator.next().getKey();
             if (i == key.intValue()) {
                uoft0.b(key.intValue(), hashMap.get(key), new lp6(this.requireContext(), sp6.D, (float)this.getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size)), new kn6(this, key, 0));
             }else {
                uoft0.b(key.intValue(), hashMap.get(key), null, new kn6(this, key, 1));
             }
          }
       }
       tI.b(uoft0);
       return uDialog;
    }
}
