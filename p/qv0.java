package p.qv0;
import p.ti3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.jl;
import p.kv0;
import p.pv0;

public final class qv0	// class@00241d from classes.dex
{
    public final ti3 a;
    public final Object b;
    public kv0 c;

    public void qv0(ti3 p0){
       co5.o(p0, "lazyCoreNativePlayerBinder");
       super();
       this.a = p0;
       this.b = new Object();
    }
    public final void a(){
       qv0 tb = this.b;
       _monitor_enter(tb);
       if (this.c != null) {
          jl.d("create\(\) called without destroy\(\) on existing player binder");
          this.b();
       }
       kv0 okv0 = this.a.get();
       this.c = okv0;
       if (okv0 != null) {
          okv0.c();
       }
       _monitor_exit(tb);
       return;
    }
    public final void b(){
       qv0 tc;
       qv0 tb = this.b;
       _monitor_enter(tb);
       if (this.c == null) {
          jl.d("destroy\(\) called without create\(\)");
       }
       if ((tc = this.c) != null) {
          tc.b();
       }
       this.c = null;
       _monitor_exit(tb);
       return;
    }
}
