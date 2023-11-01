package p.t26;
import java.lang.Object;
import p.a26;
import java.lang.String;
import android.os.Bundle;
import android.os.BaseBundle;
import java.lang.IllegalStateException;
import p.s26;
import java.util.Iterator;
import p.y16;
import java.util.Map$Entry;
import p.co5;
import java.lang.IllegalArgumentException;
import p.dj3;
import p.ff;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.util.Set;
import java.lang.StringBuilder;
import java.lang.Throwable;

public final class t26	// class@0026ea from classes.dex
{
    public final a26 a;
    public boolean b;
    public Bundle c;
    public boolean d;
    public ff e;
    public boolean f;

    public void t26(){
       super();
       this.a = new a26();
       this.f = true;
    }
    public final Bundle a(String p0){
       t26 tc;
       t26 tc1;
       if (this.d == null) {
          throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
       }
       if ((tc = this.c) == null) {
          return null;
       }
       Bundle bundle = tc.getBundle(p0);
       if ((tc1 = this.c) != null) {
          tc1.remove(p0);
       }
       t26 tc2 = ((tc2 = this.c) != null && !tc2.isEmpty())? 1: 0;
       if (!tc2) {
          this.c = null;
       }
       return bundle;
    }
    public final s26 b(){
       String key;
       s26 value;
       Iterator iterator = this.a.iterator();
       do {
          Iterator iterator1 = iterator;
          if (iterator1.hasNext()) {
          }else {
             value = null;
             break ;
          }
          Map$Entry uEntry = iterator1.next();
          co5.l(uEntry, "components");
          key = uEntry.getKey();
          value = uEntry.getValue();
       } while (co5.c(key, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
       return value;
    }
    public final void c(String p0,s26 p1){
       co5.o(p0, "key");
       co5.o(p1, "provider");
       int i = (this.a.b(p0, p1) == null)? 1: 0;
       if (i) {
          return;
       }else {
          throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
       }
    }
    public final void d(){
       t26 te;
       dj3 uodj3 = dj3.class;
       if (this.f == null) {
          throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
       }
       if ((te = this.e) == null) {
          te = new ff(this);
       }
       this.e = te;
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          uodj3.getDeclaredConstructor(uClassArray);
          if ((te = this.e) != null) {
             te.b.add(uodj3.getName());
          }
          return;
       }catch(java.lang.NoSuchMethodException e1){
          throw new IllegalArgumentException("Class "+uodj3.getSimpleName()+" must have default constructor in order to be automatically recreated", e1);
       }
    }
}
