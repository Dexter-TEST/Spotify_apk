package p.cm0;
import p.s26;
import java.lang.Object;
import android.os.Bundle;
import androidx.fragment.app.k;
import p.ae2;
import androidx.fragment.app.o;
import p.kj3;
import p.fk3;
import androidx.activity.a;
import java.lang.Class;
import java.util.ArrayList;
import androidx.activity.result.a;
import java.util.Collection;
import java.util.HashMap;
import java.lang.String;
import java.util.Set;
import java.io.Serializable;

public final class cm0 implements s26	// class@001232 from classes.dex
{
    public final int a;
    public final Object b;

    public void cm0(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Bundle a(){
       cm0 tb = this.b;
       switch (this.a){
           case 0:
           case 1:
             cm0 uocm0 = tb;
             int o = k.O;
             do {
             } while (!k.z(uocm0.y()));
             uocm0.K.f(kj3.ON_STOP);
             return new Bundle();
             break;
           default:
             return tb.V();
       }
       tb.getClass();
       Bundle uBundle = new Bundle();
       a b = tb.B;
       b.getClass();
       a c = b.c;
       uBundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(c.values()));
       uBundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(c.keySet()));
       uBundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(b.e));
       uBundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", b.h.clone());
       uBundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", b.a);
       return uBundle;
    }
}
