package p.uy;
import android.content.Context;
import java.lang.Object;
import p.xy5;
import java.lang.String;
import p.co5;
import java.util.concurrent.atomic.AtomicBoolean;
import p.o26;
import p.ay6;
import p.wf2;
import p.uw6;
import android.view.MenuItem;
import p.mw6;
import p.wh6;
import p.r64;

public abstract class uy	// class@00294a from classes.dex
{
    public final Object a;
    public Object b;
    public ay6 c;

    public void uy(Context p0){
       super();
       this.a = p0;
    }
    public void uy(xy5 p0){
       co5.o(p0, "database");
       super();
       this.a = p0;
       this.b = new AtomicBoolean(false);
       this.c = new ay6(new o26(2, this));
    }
    public final uw6 c(){
       uy ta = this.a;
       ta.a();
       uw6 value = (this.b.compareAndSet(false, true))? this.c.getValue(): ta.e(this.d());
       return value;
    }
    public abstract String d();
    public final MenuItem e(MenuItem p0){
       MenuItem orDefault;
       if (!p0 instanceof mw6) {
          return p0;
       }
       if (this.b == null) {
          this.b = new wh6();
       }
       if ((orDefault = this.b.getOrDefault(p0, null)) == null) {
          orDefault = new r64(this.a, p0);
          this.b.put(p0, orDefault);
       }
       return orDefault;
    }
    public final void f(uw6 p0){
       co5.o(p0, "statement");
       if (p0 == this.c.getValue()) {
          this.b.set(false);
       }
       return;
    }
}
