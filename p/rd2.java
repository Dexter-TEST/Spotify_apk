package p.rd2;
import p.z6;
import androidx.fragment.app.o;
import java.lang.Object;
import p.y6;
import java.util.ArrayDeque;
import p.wd2;
import java.lang.String;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import android.content.Intent;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Boolean;

public final class rd2 implements z6	// class@0024c4 from classes.dex
{
    public final int a;
    public final o b;

    public void rd2(o p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void a(y6 p0){
       wd2 owd2;
       Fragment uFragment;
       rd2 tb = this.b;
       switch (this.a){
           case 1:
             if ((owd2 = tb.E.pollFirst()) != null && (uFragment = tb.c.c(owd2.a)) != null) {
                uFragment.onActivityResult(owd2.b, p0.a, p0.b);
             }
             break;
           default:
             if ((owd2 = tb.E.pollFirst()) != null && (uFragment = tb.c.c(owd2.a)) != null) {
                uFragment.onActivityResult(owd2.b, p0.a, p0.b);
             }
             return;
       }
       return;
    }
    public final void b(Object p0){
       wd2 owd2;
       Fragment uFragment;
       switch (this.a){
           case 0:
             String[] stringArray = new String[0];
             String[] stringArray1 = p0.keySet().toArray(stringArray);
             ArrayList uArrayList = new ArrayList(p0.values());
             p0 = new int[uArrayList.size()];
             for (int i = 0; i < uArrayList.size(); i = i + 1) {
                int i1 = (uArrayList.get(i).booleanValue())? 0: -1;
                p0[i] = i1;
             }
             rd2 tb = this.b;
             if ((owd2 = tb.E.pollFirst()) != null && (uFragment = tb.c.c(owd2.a)) != null) {
                uFragment.onRequestPermissionsResult(owd2.b, stringArray1, p0);
             }
             return;
             break;
           case 1:
           default:
             this.a(p0);
             return;
       }
       this.a(p0);
       return;
    }
}
