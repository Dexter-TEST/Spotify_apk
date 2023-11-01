package com.spotify.signup.signup.facebook.FacebookLoginActivity;
import p.a21;
import android.content.Intent;
import androidx.fragment.app.k;
import p.qy1;
import p.ja0;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import p.ia0;
import java.lang.String;
import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.a;
import android.os.Parcelable;
import p.d;
import p.sb4;
import android.view.View;
import p.tm5;
import p.lu3;
import p.g54;
import java.lang.Class;
import p.sz1;
import p.eo5;
import p.iu3;
import p.bm;
import p.xo0;
import p.ny1;
import p.fd1;
import p.sa6;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;
import androidx.activity.a;

public class FacebookLoginActivity extends a21	// class@000c2c from classes.dex
{
    public View R;
    public pb4 S;
    public qy1 T;
    public static final int U;

    public void FacebookLoginActivity(){
       super();
    }
    public final void onActivityResult(int p0,int p1,Intent p2){
       ia0 oia0;
       super.onActivityResult(p0, p1, p2);
       if ((oia0 = this.T.b.a.get(Integer.valueOf(p0))) == null) {
          mj7 b = ja0.b;
          _monitor_enter(b);
          ia0 oia01 = ja0.c.get(Integer.valueOf(p0));
          _monitor_exit(b);
          if (oia01 != null) {
             oia01.a(p2, p1);
          }
       }else {
          oia0.a(p2, p1);
       }
       if (p0 == 1339 && p1 == -1) {
          this.setResult(-1, new Intent().putExtra("RESULT_ACCESS_TOKEN", p2.getStringExtra("RESULT_ACCESS_TOKEN")).putExtra("RESULT_FROM_SIGNUP", true));
          this.finish();
       }
       return;
    }
    public final void onCreate(Bundle p0){
       d parcelable;
       super.onCreate(p0);
       this.setContentView(R.layout.signup_facebook);
       if (p0 != null && (parcelable = p0.getParcelable("FACEBOOK_MODEL")) != null) {
          this.S.e(parcelable);
       }
       this.R = this.findViewById(R.id.facebook_progress_bar);
       FacebookLoginActivity tT = this.T;
       lu3 olu3 = tT.a.get();
       g54 og54 = new g54(tT);
       olu3.getClass();
       qy1 b = tT.b;
       if (b instanceof ja0) {
          eo5.Q();
          b.getClass();
          b.a.put(Integer.valueOf((sz1.h + 0)), new iu3(olu3, og54));
          this.S.a(new bm(1));
          return;
       }else {
          throw new ny1("Unexpected CallbackManager, please use the provided Factory.");
       }
    }
    public final void onDestroy(){
       super.onDestroy();
       this.S.b();
       FacebookLoginActivity tT = this.T;
       tT.a.get().getClass();
       qy1 b = tT.b;
       if (!b instanceof ja0) {
          throw new ny1("Unexpected CallbackManager, please use the provided Factory.");
       }
       eo5.Q();
       b.a.remove(Integer.valueOf((sz1.h + 0)));
       cd1.d(tT.e.a.a, null);
       return;
    }
    public final void onPause(){
       this.R.setVisibility(8);
       super.onPause();
    }
    public final void onResume(){
       this.R.setVisibility(0);
       super.onResume();
    }
    public final void onSaveInstanceState(Bundle p0){
       super.onSaveInstanceState(p0);
       p0.putParcelable("FACEBOOK_MODEL", this.S.c());
    }
    public final void onStart(){
       super.onStart();
       this.S.f();
    }
    public final void onStop(){
       super.onStop();
       this.S.g();
    }
}
