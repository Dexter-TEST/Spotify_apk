package p.w26;
import p.aj7;
import p.cj7;
import android.app.Application;
import p.v26;
import android.os.Bundle;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.t26;
import p.vj3;
import p.ek3;
import p.zi7;
import java.lang.Class;
import p.vi7;
import java.lang.IllegalArgumentException;
import p.me4;
import p.fv1;
import p.i01;
import java.util.LinkedHashMap;
import p.ry7;
import p.gg1;
import p.od;
import p.x26;
import java.util.List;
import java.lang.reflect.Constructor;
import p.m26;
import java.lang.IllegalStateException;
import p.oi;
import p.bj7;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.UnsupportedOperationException;

public final class w26 extends cj7 implements aj7	// class@002ab4 from classes.dex
{
    public final Application a;
    public final zi7 b;
    public final Bundle c;
    public final vj3 d;
    public final t26 e;

    public void w26(Application p0,v26 p1,Bundle p2){
       zi7 c;
       co5.o(p1, "owner");
       super();
       this.e = p1.getSavedStateRegistry();
       this.d = p1.getLifecycle();
       this.c = p2;
       this.a = p0;
       if (p0 != null) {
          if (zi7.c == null) {
             zi7.c = new zi7(p0);
          }
          c = zi7.c;
          co5.i(c);
       }else {
          c = new zi7(null);
       }
       this.b = c;
       return;
    }
    public final vi7 a(Class p0){
       String canonicalNam;
       if ((canonicalNam = p0.getCanonicalName()) != null) {
          return this.d(p0, canonicalNam);
       }
       throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
    public final vi7 b(Class p0,me4 p1){
       String str;
       boolean b;
       vi7 ovi7;
       i01 a = p1.a;
       if ((str = a.get(fv1.A)) == null) {
          throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
       }
       if (a.get(ry7.I) != null && a.get(ry7.J) != null) {
          Application uApplication = a.get(gg1.B);
          Constructor uConstructor = ((b = od.class.isAssignableFrom(p0)) && uApplication != null)? x26.a(x26.a, p0): x26.a(x26.b, p0);
          if (uConstructor == null) {
             return this.b.b(p0, p1);
          }else if(b && uApplication != null){
             Object[] objArray = new Object[]{uApplication,ry7.m(p1)};
             ovi7 = x26.b(p0, uConstructor, objArray);
          }else {
             Object[] objArray1 = new Object[]{ry7.m(p1)};
             ovi7 = x26.b(p0, uConstructor, objArray1);
          }
       }else if(this.d != null){
          ovi7 = this.d(p0, str);
       }else {
          throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
       }
       return ovi7;
    }
    public final void c(vi7 p0){
       w26 td;
       if ((td = this.d) != null) {
          w26 te = this.e;
          co5.i(te);
          oi.c(p0, te, td);
       }
       return;
    }
    public final vi7 d(Class p0,String p1){
       w26 td;
       vi7 ovi7;
       Object[] objArray;
       if ((td = this.d) == null) {
          throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create\(modelClass: Class<T>, extras: CreationExtras\).");
       }
       boolean b = od.class.isAssignableFrom(p0);
       w26 ta = this.a;
       Constructor uConstructor = (b && ta != null)? x26.a(x26.a, p0): x26.a(x26.b, p0);
       if (uConstructor == null) {
          if (ta != null) {
             ovi7 = this.b.a(p0);
          }else if(bj7.a == null){
             bj7.a = new bj7();
          }
          bj7 a = bj7.a;
          co5.i(a);
          ovi7 = a.a(p0);
          return ovi7;
       }else {
          w26 te = this.e;
          co5.i(te);
          SavedStateHandleController savedStateHa = oi.e(te, td, p1, this.c);
          SavedStateHandleController b1 = savedStateHa.b;
          if (b && ta != null) {
             objArray = new Object[]{ta,b1};
             ovi7 = x26.b(p0, uConstructor, objArray);
          }else {
             objArray = new Object[]{b1};
             ovi7 = x26.b(p0, uConstructor, objArray);
          }
          ovi7.c(savedStateHa);
          return ovi7;
       }
    }
}
