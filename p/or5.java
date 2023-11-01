package p.or5;
import java.lang.Object;
import android.util.SparseArray;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import p.nr5;

public final class or5	// class@002177 from classes.dex
{
    public final SparseArray a;
    public int b;
    public final Set c;

    public void or5(){
       super();
       this.a = new SparseArray();
       this.b = 0;
       this.c = Collections.newSetFromMap(new IdentityHashMap());
    }
    public final nr5 a(int p0){
       nr5 onr5;
       or5 ta = this.a;
       if ((onr5 = ta.get(p0)) == null) {
          onr5 = new nr5();
          ta.put(p0, onr5);
       }
       return onr5;
    }
}
