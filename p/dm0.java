package p.dm0;
import p.u15;
import androidx.fragment.app.k;
import java.lang.Object;
import androidx.activity.a;
import p.u26;
import java.lang.String;
import android.os.Bundle;
import p.t26;
import java.lang.Class;
import java.util.ArrayList;
import androidx.activity.result.a;
import java.io.Serializable;
import java.util.Random;
import java.util.HashMap;
import java.lang.Integer;
import android.os.BaseBundle;
import androidx.fragment.app.i;
import p.nd2;
import p.ld2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;

public final class dm0 implements u15	// class@001371 from classes.dex
{
    public final int a;
    public final a b;

    public void dm0(k p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void a(){
       Bundle uBundle;
       ArrayList stringArrayL;
       dm0 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             i a = tb.J.a;
             a.t.b(a, a, null);
             return;
       }
       if ((uBundle = tb.v.b.a("android:support:activity-result")) != null) {
          a b = tb.B;
          b.getClass();
          ArrayList integerArray = uBundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
          if ((stringArrayL = uBundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS")) != null && integerArray != null) {
             b.e = uBundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
             b.a = uBundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
             a h = b.h;
             h.putAll(uBundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
             for (int i = 0; i < stringArrayL.size(); i = i + 1) {
                String str = stringArrayL.get(i);
                a c = b.c;
                a b1 = b.b;
                if (c.containsKey(str)) {
                   Integer integer = c.remove(str);
                   if (!h.containsKey(str)) {
                      b1.remove(integer);
                   }
                }
                int i1 = integerArray.get(i).intValue();
                String str1 = stringArrayL.get(i);
                b1.put(Integer.valueOf(i1), str1);
                c.put(str1, Integer.valueOf(i1));
             }
          }
       }
       return;
    }
}
