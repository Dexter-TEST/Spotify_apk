package p.ro5;
import p.ir0;
import p.o11;
import java.lang.Object;
import java.lang.Throwable;
import p.hs3;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Boolean;
import p.co5;
import java.util.Map;

public final class ro5 implements ir0	// class@00252a from classes.dex
{
    public final int a;
    public final o11 b;

    public void ro5(o11 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void a(Throwable p0){
       ro5 tb = this.b;
       switch (this.a){
           case 1:
           default:
             tb.c.a("Error while updating persisted report: "+p0.getMessage());
             return;
       }
       tb.c.a("Error while receiving initial state: "+p0.getMessage());
       return;
    }
    public final void accept(Object p0){
       ro5 tb = this.b;
       switch (this.a){
           case 0:
             tb.c.a("Initial RateLimiterReportsModelImpl state received");
             co5.l(p0, "savedState");
             tb.t.putAll(p0);
             return;
           case 1:
             this.a(p0);
             return;
           case 2:
             co5.l(p0, "isSuccessful");
             if (p0.booleanValue()) {
                tb.c.a("RateLimiterReportsModelImpl: persisted report was updated");
             }else {
                tb.c.a("RateLimiterReportsModelImpl: error: persisted report was not updated");
             }
             return;
             break;
           default:
             this.a(p0);
             return;
       }
    }
}
