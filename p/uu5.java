package p.uu5;
import android.app.Fragment;
import p.kj3;
import android.os.Build$VERSION;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.gg1;
import android.os.Bundle;
import p.rk5;
import p.sk5;
import p.fk3;

public final class uu5 extends Fragment	// class@002923 from classes.dex
{
    public rk5 a;
    public static final int b;

    public void uu5(){
       super();
    }
    public final void a(kj3 p0){
       if (Build$VERSION.SDK_INT < 29) {
          Activity activity = this.getActivity();
          co5.l(activity, "activity");
          gg1.z(activity, p0);
       }
       return;
    }
    public final void onActivityCreated(Bundle p0){
       super.onActivityCreated(p0);
       this.a(kj3.ON_CREATE);
    }
    public final void onDestroy(){
       super.onDestroy();
       this.a(kj3.ON_DESTROY);
       this.a = null;
    }
    public final void onPause(){
       super.onPause();
       this.a(kj3.ON_PAUSE);
    }
    public final void onResume(){
       uu5 ta;
       super.onResume();
       if ((ta = this.a) != null) {
          ta.a.b();
       }
       this.a(kj3.ON_RESUME);
       return;
    }
    public final void onStart(){
       uu5 ta;
       super.onStart();
       if ((ta = this.a) != null) {
          rk5 a = ta.a;
          int i = 1;
          int i1 = a.a + i;
          a.a = i1;
          if (i1 == i && a.t != null) {
             a.w.f(kj3.ON_START);
             a.t = false;
          }
       }
       this.a(kj3.ON_START);
       return;
    }
    public final void onStop(){
       super.onStop();
       this.a(kj3.ON_STOP);
    }
}
