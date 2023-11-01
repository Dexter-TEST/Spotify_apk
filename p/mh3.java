package p.mh3;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.lang.String;
import p.nh3;
import java.lang.Object;
import android.content.SharedPreferences;
import p.co5;
import p.sn6;
import p.ng2;
import java.lang.Throwable;

public final class mh3 implements SharedPreferences$OnSharedPreferenceChangeListener	// class@001e96 from classes.dex
{
    public final ObservableEmitter a;
    public final String b;
    public final nh3 c;

    public void mh3(ObservableEmitter p0,String p1,nh3 p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onSharedPreferenceChanged(SharedPreferences p0,String p1){
       mh3 ta = this.a;
       if (ta.isDisposed()) {
          return;
       }
       if (!co5.c(this.b, p1)) {
          return;
       }
       if (!p0.contains(p1)) {
          ta.onNext(new sn6(2, null));
          return;
       }else {
          try{
             mh3 tc = this.c;
             int i = ((tc = tc.c.b(tc.a, tc.b)) == null)? 3: 1;
             ta.onNext(new sn6(i, tc));
             return;
          }catch(java.lang.Exception e3){
             ta.onError(e3);
             return;
          }
       }
    }
}
