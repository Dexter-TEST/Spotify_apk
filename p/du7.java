package p.du7;
import p.yt7;
import p.m07;
import com.google.android.gms.common.api.Status;
import p.ve;
import java.lang.Exception;
import java.lang.RuntimeException;
import p.ll2;
import android.os.RemoteException;
import p.lt7;
import p.si4;
import p.q12;
import java.lang.Object;
import java.util.HashMap;
import p.tp2;
import java.lang.Boolean;

public final class du7 extends yt7	// class@0013be from classes.dex
{
    public final m07 b;

    public void du7(m07 p0){
       super(4);
       this.b = p0;
    }
    public final void b(Status p0){
       this.b.a(new ve(p0));
    }
    public final void c(RuntimeException p0){
       this.b.a(p0);
    }
    public final void d(ll2 p0){
       try{
          this.h(p0);
       }catch(android.os.DeadObjectException e2){
          this.b(lt7.a(e2));
          throw e2;
       }catch(android.os.RemoteException e2){
          this.b(lt7.a(e2));
       }catch(java.lang.RuntimeException e2){
          this.c(e2);
       }
       return;
    }
    public final void e(si4 p0,boolean p1){
    }
    public final q12[] f(ll2 p0){
       tp2.v(p0.f.get(null));
       return null;
    }
    public final boolean g(ll2 p0){
       tp2.v(p0.f.get(null));
       return false;
    }
    public final void h(ll2 p0){
       tp2.v(p0.f.remove(null));
       this.b.b(Boolean.FALSE);
    }
}
