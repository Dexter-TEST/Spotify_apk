package p.y84;
import android.content.Context;
import p.f01;
import p.fh5;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import p.r87;
import com.google.android.datatransport.cct.CctBackendFactory;
import p.ts;
import p.ah0;
import p.e01;

public final class y84	// class@002d6b from classes.dex
{
    public final fh5 a;
    public final f01 b;
    public final HashMap c;

    public void y84(Context p0,f01 p1){
       super();
       this.c = new HashMap();
       this.a = new fh5(p0);
       this.b = p1;
    }
    public synchronized final r87 a(String p0){
       CctBackendFactory uCctBackendF;
       if (this.c.containsKey(p0)) {
          return this.c.get(p0);
       }
       if ((uCctBackendF = this.a.d(p0)) == null) {
          return null;
       }
       y84 tb = this.b;
       r87 or87 = uCctBackendF.create(new ts(tb.a, tb.b, tb.c, p0));
       this.c.put(p0, or87);
       return or87;
    }
}
