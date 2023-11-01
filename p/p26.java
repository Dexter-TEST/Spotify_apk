package p.p26;
import p.s26;
import p.t26;
import p.ej7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.o26;
import p.ay6;
import p.wf2;
import android.os.Bundle;
import p.q26;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import p.m26;
import p.k26;

public final class p26 implements s26	// class@0021dc from classes.dex
{
    public final t26 a;
    public boolean b;
    public Bundle c;
    public final ay6 d;

    public void p26(t26 p0,ej7 p1){
       co5.o(p0, "savedStateRegistry");
       co5.o(p1, "viewModelStoreOwner");
       super();
       this.a = p0;
       this.d = new ay6(new o26(0, p1));
    }
    public final Bundle a(){
       p26 tc;
       Bundle uBundle = new Bundle();
       if ((tc = this.c) != null) {
          uBundle.putAll(tc);
       }
       Iterator iterator = this.d.getValue().t.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          Bundle uBundle1 = uEntry.getValue().e.a();
          if (!co5.c(uBundle1, Bundle.EMPTY)) {
             uBundle.putBundle(key, uBundle1);
          }
       }
       this.b = false;
       return uBundle;
    }
}
