package p.p2;
import p.aj7;
import p.cj7;
import p.v26;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.t26;
import p.vj3;
import p.ek3;
import java.lang.Class;
import p.vi7;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import p.oi;
import p.m26;
import java.lang.UnsupportedOperationException;
import java.lang.IllegalArgumentException;
import p.me4;
import p.fv1;
import p.i01;
import java.util.LinkedHashMap;
import p.ry7;
import java.lang.IllegalStateException;

public abstract class p2 extends cj7 implements aj7	// class@0021de from classes.dex
{
    public final t26 a;
    public final vj3 b;
    public final Bundle c;

    public void p2(v26 p0){
       co5.o(p0, "owner");
       super();
       this.a = p0.getSavedStateRegistry();
       this.b = p0.getLifecycle();
       this.c = null;
    }
    public final vi7 a(Class p0){
       String canonicalNam;
       p2 tb;
       if ((canonicalNam = p0.getCanonicalName()) == null) {
          throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
       }
       if ((tb = this.b) == null) {
          throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create\(modelClass: Class<T>, extras: CreationExtras\).");
       }
       p2 ta = this.a;
       co5.i(ta);
       co5.i(tb);
       SavedStateHandleController savedStateHa = oi.e(ta, tb, canonicalNam, this.c);
       vi7 ovi7 = this.d(canonicalNam, p0, savedStateHa.b);
       ovi7.c(savedStateHa);
       return ovi7;
    }
    public final vi7 b(Class p0,me4 p1){
       String str;
       p2 ta;
       vi7 ovi7;
       if ((str = p1.a.get(fv1.A)) == null) {
          throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
       }
       if ((ta = this.a) != null) {
          co5.i(ta);
          p2 tb = this.b;
          co5.i(tb);
          SavedStateHandleController savedStateHa = oi.e(ta, tb, str, this.c);
          ovi7 = this.d(str, p0, savedStateHa.b);
          ovi7.c(savedStateHa);
       }else {
          ovi7 = this.d(str, p0, ry7.m(p1));
       }
       return ovi7;
    }
    public final void c(vi7 p0){
       p2 ta;
       if ((ta = this.a) != null) {
          p2 tb = this.b;
          co5.i(tb);
          oi.c(p0, ta, tb);
       }
       return;
    }
    public abstract vi7 d(String p0,Class p1,m26 p2);
}
