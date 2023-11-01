package p.q54;
import android.database.ContentObserver;
import java.util.List;
import p.r54;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Object;
import android.database.Cursor;
import android.net.Uri;
import java.lang.Long;
import p.zf2;

public final class q54 extends ContentObserver	// class@002335 from classes.dex
{
    public final List a;
    public final long b;
    public final zf2 c;
    public final Handler d;

    public void q54(List p0,long p1,r54 p2){
       Handler handler = new Handler(Looper.getMainLooper());
       super(handler);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = handler;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          iterator.next().registerContentObserver(this);
       }
       return;
    }
    public final void onChange(boolean p0){
       this.onChange(p0, null);
    }
    public final void onChange(boolean p0,Uri p1){
       this.c.invoke(Long.valueOf(this.b));
    }
}
