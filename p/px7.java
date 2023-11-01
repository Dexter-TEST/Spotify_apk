package p.px7;
import p.ak3;
import androidx.fragment.app.Fragment;
import java.util.WeakHashMap;
import p.pk;
import java.util.Map;
import java.util.Collections;
import java.lang.String;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Object;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.Class;
import p.nu7;
import android.os.Looper;
import p.ka0;
import java.lang.Runnable;
import android.os.Handler;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import p.su7;
import android.app.Activity;
import androidx.fragment.app.k;
import android.content.Intent;
import android.os.Bundle;
import java.util.Set;
import java.util.Map$Entry;

public final class px7 extends Fragment implements ak3	// class@0022f0 from classes.dex
{
    public final Map a;
    public int b;
    public Bundle c;
    public static final WeakHashMap t;

    static {
       px7.t = new WeakHashMap();
    }
    public void px7(){
       super();
       this.a = Collections.synchronizedMap(new pk());
       this.b = 0;
    }
    public final void dump(String p0,FileDescriptor p1,PrintWriter p2,String[] p3){
       super.dump(p0, p1, p2, p3);
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().getClass();
       }
       return;
    }
    public final void k(LifecycleCallback p0){
       px7 ta = this.a;
       String str = "ConnectionlessLifecycleHelper";
       if (ta.containsKey(str)) {
          throw new IllegalArgumentException(new StringBuilder((str.length() + 59))+"LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
       }
       ta.put(str, p0);
       if (this.b > null) {
          new nu7(Looper.getMainLooper()).post(new ka0(this, p0, str, 8));
       }
       return;
    }
    public final LifecycleCallback l(){
       return su7.class.cast(this.a.get("ConnectionlessLifecycleHelper"));
    }
    public final Activity n(){
       return this.getActivity();
    }
    public final void onActivityResult(int p0,int p1,Intent p2){
       super.onActivityResult(p0, p1, p2);
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0, p1, p2);
       }
       return;
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.b = 1;
       this.c = p0;
       Iterator iterator = this.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          LifecycleCallback value = uEntry.getValue();
          Bundle bundle = (p0 != null)? p0.getBundle(uEntry.getKey()): null;
          value.c(bundle);
       }
       return;
    }
    public final void onDestroy(){
       super.onDestroy();
       this.b = 5;
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().getClass();
       }
       return;
    }
    public final void onResume(){
       super.onResume();
       this.b = 3;
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().d();
       }
       return;
    }
    public final void onSaveInstanceState(Bundle p0){
       if (p0 == null) {
          return;
       }
       Iterator iterator = this.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Bundle uBundle = new Bundle();
          uEntry.getValue().e(uBundle);
          p0.putBundle(uEntry.getKey(), uBundle);
       }
       return;
    }
    public final void onStart(){
       super.onStart();
       this.b = 2;
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().f();
       }
       return;
    }
    public final void onStop(){
       super.onStop();
       this.b = 4;
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().g();
       }
       return;
    }
}
