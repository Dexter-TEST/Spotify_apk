package p.di0;
import p.b3;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.util.WeakHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.lang.String;
import p.co5;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import android.app.Activity;
import android.view.View;
import p.is7;
import java.lang.Class;
import p.ci0;

public final class di0	// class@00134e from classes.dex
{
    public final Handler a;
    public final Set b;
    public final LinkedHashSet c;
    public HashSet d;
    public final HashMap e;
    public static final b3 f;
    public static di0 g;

    static {
       di0.f = new b3(15, 0);
    }
    public void di0(){
       super();
       this.a = new Handler(Looper.getMainLooper());
       Set set = Collections.newSetFromMap(new WeakHashMap());
       co5.l(set, "newSetFromMap\(WeakHashMap\(\)\)");
       this.b = set;
       this.c = new LinkedHashSet();
       this.d = new HashSet();
       this.e = new HashMap();
    }
    public final void a(){
       Activity uActivity;
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          if ((uActivity = iterator.next()) != null) {
             this.c.add(new ci0(is7.q(uActivity), this.a, this.d, uActivity.getClass().getSimpleName()));
          }
       }
       return;
    }
}
