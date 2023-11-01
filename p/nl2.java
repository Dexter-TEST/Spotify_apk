package p.nl2;
import p.vt7;
import p.cy;
import p.ol2;
import p.bl2;
import p.we;
import java.lang.Object;
import p.fp0;
import p.t5;
import java.lang.Runnable;
import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import p.ll2;
import p.nu7;
import p.w51;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.RuntimeException;
import p.i43;
import java.util.Set;

public final class nl2 implements vt7, cy	// class@001ffd from classes.dex
{
    public final se a;
    public final we b;
    public i43 c;
    public Set d;
    public boolean e;
    public final ol2 f;

    public void nl2(ol2 p0,bl2 p1,we p2){
       this.f = p0;
       super();
       this.c = null;
       this.d = null;
       this.e = false;
       this.a = p1;
       this.b = p2;
    }
    public final void a(fp0 p0){
       this.f.n.post(new t5(this, 13, p0));
    }
    public final void b(fp0 p0){
       ll2 oll2;
       if ((oll2 = this.f.j.get(this.b)) != null) {
          w51.g(oll2.l.n);
          ll2 b = oll2.b;
          String name = b.getClass().getName();
          String str = String.valueOf(p0);
          StringBuilder str1 = new StringBuilder((str.length() + (name.length() + 25)))+"onSignInFailed for "+name;
          b.e(str1+" with "+str);
          oll2.d(p0, null);
       }
       return;
    }
    public final void c(){
       nl2 tc;
       if (this.e != null && (tc = this.c) != null) {
          this.a.h(tc, this.d);
       }
       return;
    }
}
