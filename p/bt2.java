package p.bt2;
import p.e33;
import java.lang.Object;
import java.util.WeakHashMap;
import p.ju2;
import android.os.Parcelable;
import java.lang.Class;
import java.util.IdentityHashMap;
import java.lang.String;
import java.lang.IllegalArgumentException;
import p.tp2;

public class bt2	// class@00112e from classes.dex
{
    public final WeakHashMap a;
    public final e33 b;

    public void bt2(e33 p0){
       super();
       this.a = new WeakHashMap();
       this.b = p0;
    }
    public final Parcelable a(ju2 p0){
       ju2 oju2;
       bt2 ta = this.a;
       p0.getClass();
       if ((oju2 = this.b.c.get(p0)) != null) {
          return ta.get(oju2.c());
       }
       String str = (p0.c() != null)? p0.c(): p0.toString();
       throw new IllegalArgumentException(tp2.m("Model ", str, " not resolved"));
    }
    public final void b(ju2 p0,Parcelable p1){
       p0.getClass();
       if ((p0 = this.b.c.get(p0)) != null && p0.c() != null) {
          this.a.put(p0.c(), p1);
       }
       return;
    }
}
