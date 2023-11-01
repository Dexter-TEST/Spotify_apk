package p.u26;
import p.v26;
import java.lang.Object;
import p.t26;
import p.vj3;
import p.ek3;
import p.uj3;
import androidx.savedstate.Recreator;
import p.dk3;
import java.lang.Class;
import p.sf4;
import java.lang.IllegalStateException;
import java.lang.String;
import android.os.Bundle;
import java.lang.Enum;
import java.lang.StringBuilder;
import p.co5;
import p.x16;
import p.a26;
import java.lang.Boolean;
import java.util.WeakHashMap;
import java.util.Map$Entry;
import p.s26;
import android.os.BaseBundle;

public final class u26	// class@00282e from classes.dex
{
    public final v26 a;
    public final t26 b;
    public boolean c;

    public void u26(v26 p0){
       super();
       this.a = p0;
       this.b = new t26();
    }
    public final void a(){
       u26 ta = this.a;
       vj3 lifecycle = ta.getLifecycle();
       int i = (lifecycle.b() == uj3.b)? 1: 0;
       if (i) {
          lifecycle.a(new Recreator(ta));
          ta = this.b;
          ta.getClass();
          if ((ta.b ^ 1)) {
             lifecycle.a(new sf4(2, ta));
             ta.b = true;
             this.c = true;
             return;
          }else {
             throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
          }
       }else {
          throw new IllegalStateException("Restarter must be created only during owner\'s initialization stage".toString());
       }
    }
    public final void b(Bundle p0){
       if (this.c == null) {
          this.a();
       }
       vj3 lifecycle = this.a.getLifecycle();
       int i = (lifecycle.b().compareTo(uj3.t) >= 0)? 1: 0;
       if ((i ^ 1)) {
          u26 tb = this.b;
          if (tb.b != null) {
             if ((tb.d ^ 1)) {
                p0 = (p0 != null)? p0.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key"): null;
                tb.c = p0;
                tb.d = true;
                return;
             }else {
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
             }
          }else {
             throw new IllegalStateException("You must call performAttach\(\) before calling performRestore\(Bundle\).".toString());
          }
       }else {
          throw new IllegalStateException("performRestore cannot be called when owner is "+lifecycle.b().toString());
       }
    }
    public final void c(Bundle p0){
       t26 c;
       String key;
       co5.o(p0, "outBundle");
       u26 tb = this.b;
       tb.getClass();
       Bundle uBundle = new Bundle();
       if ((c = tb.c) != null) {
          uBundle.putAll(c);
       }
       t26 a = tb.a;
       a.getClass();
       x16 ox16 = new x16(a);
       a.c.put(ox16, Boolean.FALSE);
       while (ox16.hasNext()) {
          Map$Entry uEntry = ox16.next();
          key = uEntry.getKey();
          uBundle.putBundle(key, uEntry.getValue().a());
       }
       if (!uBundle.isEmpty()) {
          p0.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", uBundle);
       }
       return;
    }
}
