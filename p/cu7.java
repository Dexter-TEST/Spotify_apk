package p.cu7;
import p.lt7;
import p.jv7;
import com.google.android.gms.common.api.Status;
import p.ky;
import java.lang.RuntimeException;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.StringBuilder;
import p.ll2;
import p.bl2;
import p.si4;
import java.util.Map;
import java.lang.Boolean;
import p.ru7;
import p.ca5;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class cu7 extends lt7	// class@00127f from classes.dex
{
    public final ky b;

    public void cu7(int p0,jv7 p1){
       super(p0);
       this.b = p1;
    }
    public final void b(Status p0){
       try{
          this.b.I(p0);
          return;
       }catch(java.lang.IllegalStateException e0){
       }
    }
    public final void c(RuntimeException p0){
       String simpleName = p0.getClass().getSimpleName();
       String localizedMes = p0.getLocalizedMessage();
       StringBuilder str = new StringBuilder((String.valueOf(localizedMes).length() + (simpleName.length() + 2)))+simpleName;
       localizedMes = str+": "+localizedMes;
       try{
          Status status = new Status(10, localizedMes, 0);
          this.b.I(status);
          return;
       }catch(java.lang.IllegalStateException e0){
       }
    }
    public final void d(ll2 p0){
       int i;
       try{
          cu7 tb = this.b;
          p0 = p0.b;
          tb.getClass();
          try{
             i = 8;
             tb.H(p0);
          }catch(android.os.DeadObjectException e6){
             tb.I(new Status(i, e6.getLocalizedMessage(), 0));
             throw e6;
          }catch(android.os.RemoteException e6){
             tb.I(new Status(i, e6.getLocalizedMessage(), 0));
          }
          return;
       }catch(java.lang.RuntimeException e6){
          this.c(e6);
          return;
       }
    }
    public final void e(si4 p0,boolean p1){
       cu7 tb = this.b;
       p0.a.put(tb, Boolean.valueOf(p1));
       tb.C(new ru7(p0, tb));
    }
}
