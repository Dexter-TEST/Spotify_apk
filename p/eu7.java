package p.eu7;
import p.yt7;
import p.l07;
import p.m07;
import p.dt3;
import java.lang.IllegalArgumentException;
import java.lang.String;
import com.google.android.gms.common.api.Status;
import java.lang.Class;
import java.lang.Object;
import p.uv5;
import p.ve;
import java.lang.Exception;
import java.lang.RuntimeException;
import p.ll2;
import p.bl2;
import android.os.RemoteException;
import p.lt7;
import p.si4;
import java.util.Map;
import java.lang.Boolean;
import p.qu7;
import p.o07;
import p.sx7;
import p.mt7;
import p.r15;
import p.a28;
import p.p18;
import p.l18;
import p.q12;

public final class eu7 extends yt7	// class@001500 from classes.dex
{
    public final l07 b;
    public final m07 c;
    public final dt3 d;

    public void eu7(int p0,l07 p1,m07 p2,dt3 p3){
       super(p0);
       this.c = p2;
       this.b = p1;
       this.d = p3;
       if (p0 == 2 && p1.b != null) {
          throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
       }
       return;
    }
    public final void b(Status p0){
       this.d.getClass();
       int i = (p0.t != null)? 1: 0;
       uv5 ouv5 = (i)? new uv5(p0): new ve(p0);
       this.c.a(ouv5);
       return;
    }
    public final void c(RuntimeException p0){
       this.c.a(p0);
    }
    public final void d(ll2 p0){
       try{
          this.b.a(p0.b, this.c);
          return;
       }catch(android.os.DeadObjectException e3){
          throw e3;
       }catch(android.os.RemoteException e3){
          this.b(lt7.a(e3));
          return;
       }catch(java.lang.RuntimeException e3){
          this.c(e3);
          return;
       }
    }
    public final void e(si4 p0,boolean p1){
       eu7 tc = this.c;
       p0.b.put(tc, Boolean.valueOf(p1));
       m07 a = tc.a;
       qu7 oqu7 = new qu7(p0, tc);
       a.getClass();
       a.b.c(new sx7(o07.a, oqu7));
       a.m();
    }
    public final q12[] f(ll2 p0){
       return this.b.a;
    }
    public final boolean g(ll2 p0){
       return this.b.b;
    }
}
