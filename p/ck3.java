package p.ck3;
import androidx.appcompat.app.a;
import p.t63;
import android.os.Bundle;
import androidx.fragment.app.k;
import p.iz7;
import java.lang.Object;
import p.eo1;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import android.os.StrictMode$ThreadPolicy$Builder;
import java.lang.Runnable;
import android.view.Menu;
import java.lang.String;
import p.co5;
import androidx.activity.a;
import android.content.Intent;
import java.lang.Class;
import p.mj3;
import p.fr0;
import p.bk3;
import p.nq5;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Map;
import p.i64;
import p.dk3;
import p.vj3;
import p.h64;
import p.tj3;
import android.app.Activity;
import p.sj3;

public abstract class ck3 extends a	// class@001223 from classes.dex
{
    public boolean Q;
    public final t63 R;

    public void ck3(){
       super();
       this.R = new t63(14);
    }
    public static final void C(ck3 p0,Bundle p1){
       super.onCreate(p1);
    }
    public final void D(Bundle p0){
       this.Q = false;
       StrictMode$ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
       StrictMode.setThreadPolicy(new eo1(6).apply(new StrictMode$ThreadPolicy$Builder(threadPolicy)).build());
       new iz7(this, 8, p0).run();
       StrictMode.setThreadPolicy(threadPolicy);
    }
    public final boolean E(int p0,Menu p1){
       co5.o(p1, "frameworkMenu");
       if (this.Q != null) {
          return false;
       }
       super.onCreatePanelMenu(p0, p1);
       return true;
    }
    public final void F(){
       super.onDestroy();
       this.Q = true;
    }
    public final void onActivityResult(int p0,int p1,Intent p2){
       super.onActivityResult(p0, p1, p2);
       ck3 tR = this.R;
       tR.getClass();
       tR.o(new mj3(p0, p1, p2));
    }
    public void onCreate(Bundle p0){
       i64 oi64;
       this.D(p0);
       bk3 uobk3 = new bk3(this);
       a tc = this.c;
       tc.b.add(uobk3);
       tc.a.run();
       if ((oi64 = tc.c.remove(uobk3)) != null) {
          oi64.a.c(oi64.b);
          oi64.b = null;
       }
       tc.c.put(uobk3, new i64(this.t, new h64(tc, uobk3)));
       return;
    }
    public final boolean onCreatePanelMenu(int p0,Menu p1){
       return this.E(p0, p1);
    }
    public final void onDestroy(){
       this.F();
       this.R.o(tj3.v);
    }
    public final void onPause(){
       super.onPause();
       this.R.o(tj3.t);
    }
    public final void onRestoreInstanceState(Bundle p0){
       co5.o(p0, "savedInstanceState");
       super.onRestoreInstanceState(p0);
       ck3 tR = this.R;
       tR.getClass();
       tR.o(new sj3(1, p0));
    }
    public void onResume(){
       super.onResume();
       this.R.o(tj3.c);
    }
    public final void onSaveInstanceState(Bundle p0){
       co5.o(p0, "outState");
       super.onSaveInstanceState(p0);
       ck3 tR = this.R;
       tR.getClass();
       tR.o(new sj3(0, p0));
    }
    public final void onStart(){
       super.onStart();
       this.R.o(tj3.a);
    }
    public final void onStop(){
       super.onStop();
       this.R.o(tj3.b);
    }
}
