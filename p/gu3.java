package p.gu3;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import p.ht3;
import android.os.Bundle;
import java.lang.String;
import android.os.Parcelable;
import p.ny1;
import p.up0;
import java.lang.Object;
import androidx.fragment.app.k;
import android.content.ComponentName;
import android.app.Activity;
import p.et3;
import p.f7;
import p.vf4;
import p.eu3;
import p.c7;
import p.z6;
import p.h7;
import p.co5;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.fu3;
import p.mu3;
import android.util.Log;
import p.a3;
import p.az5;
import java.util.ArrayList;
import p.bv3;
import p.sz1;
import p.ct3;
import p.ba3;
import p.fj2;
import p.ih3;
import p.e11;
import p.bn7;
import p.fa1;
import java.lang.NullPointerException;

public class gu3 extends Fragment	// class@00177e from classes.dex
{
    public String a;
    public et3 b;
    public ht3 c;
    public h7 t;
    public View v;
    public static final int w;

    public void gu3(){
       super();
    }
    public final void onActivityResult(int p0,int p1,Intent p2){
       super.onActivityResult(p0, p1, p2);
       this.u().u(p0, p1, p2);
    }
    public final void onCreate(Bundle p0){
       k activity;
       ComponentName callingActiv;
       Intent intent;
       Bundle bundleExtra;
       super.onCreate(p0);
       ht3 oht3 = (p0 == null)? null: p0.getParcelable("loginClient");
       if (oht3 != null) {
          if (oht3.c == null) {
             oht3.c = this;
          }else {
             throw new ny1("Can\'t set fragment once it is already set.");
          }
       }else {
          oht3 = new ht3(this);
       }
       this.c = oht3;
       oht3.t = new up0(2, this);
       if ((activity = this.getActivity()) == null) {
          return;
       }else if((callingActiv = activity.getCallingActivity()) == null){
          this.a = callingActiv.getPackageName();
       }
       if ((intent = activity.getIntent()) != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
          this.b = bundleExtra.getParcelable("request");
       }
       h7 oh7 = this.registerForActivityResult(new f7(), new eu3(0, new vf4(this, 3, activity)));
       co5.l(oh7, "registerForActivityResult\(\n            ActivityResultContracts.StartActivityForResult\(\),\n            getLoginMethodHandlerCallback\(activity\)\)");
       this.t = oh7;
       return;
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       co5.o(p0, "inflater");
       View view = p0.inflate(R.layout.com_facebook_login_fragment, p1, false);
       View view1 = view.findViewById(R.id.com_facebook_login_fragment_progress_bar);
       co5.l(view1, "view.findViewById<View>\(R.id.com_facebook_login_fragment_progress_bar\)");
       this.v = view1;
       view1.v = new fu3(this);
       return view;
    }
    public final void onDestroy(){
       mu3 omu3;
       if ((omu3 = this.u().j()) == null) {
       }else {
          omu3.b();
       }
       super.onDestroy();
       return;
    }
    public final void onPause(){
       super.onPause();
       View view = ((view = this.getView()) == null)? null: view.findViewById(R.id.com_facebook_login_fragment_progress_bar);
       if (view != null) {
          view.setVisibility(8);
       }
       return;
    }
    public final void onResume(){
       k activity;
       et3 c1;
       et3 a;
       Object[] objArray;
       super.onResume();
       if (this.a == null) {
          Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
          if ((activity = this.getActivity()) != null) {
             activity.finish();
          }
          return;
       }else {
          ht3 oht3 = this.u();
          gu3 tb = this.b;
          ht3 x = oht3.x;
          int i = 1;
          int i1 = (x != null && oht3.b >= null)? 1: 0;
          if (!i1 && tb != null) {
             if (x == null) {
                if (!az5.J() || oht3.b()) {
                   oht3.x = tb;
                   ArrayList uArrayList = new ArrayList();
                   bv3 c = bv3.c;
                   int i2 = ((c1 = tb.C) == c)? 1: 0;
                   a = tb.a;
                   if (i2) {
                      if (!sz1.m && a.w != null) {
                         uArrayList.add(new ba3(oht3));
                      }
                   }else if(a.a != null){
                      uArrayList.add(new fj2(oht3));
                   }
                   if (!sz1.m && a.b != null) {
                      uArrayList.add(new ih3(oht3));
                   }
                   if (a.v != null) {
                      uArrayList.add(new e11(oht3));
                   }
                   if (a.c != null) {
                      uArrayList.add(new bn7(oht3));
                   }
                   if (c1 != c) {
                      i = 0;
                   }
                   if (!i && a.t != null) {
                      uArrayList.add(new fa1(oht3));
                   }
                   mu3[] omu3Array = new mu3[0];
                   if ((objArray = uArrayList.toArray(omu3Array)) != null) {
                      oht3.a = objArray;
                      oht3.y();
                   }else {
                      throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                   }
                }
             }else {
                throw new ny1("Attempted to authorize while a request is pending.");
             }
          }
          return;
       }
    }
    public final void onSaveInstanceState(Bundle p0){
       co5.o(p0, "outState");
       p0.putParcelable("loginClient", this.u());
    }
    public final ht3 u(){
       gu3 tc;
       if ((tc = this.c) != null) {
          return tc;
       }
       co5.N("loginClient");
       throw null;
    }
}
