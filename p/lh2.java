package p.lh2;
import p.ir0;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.core.Notification;
import java.lang.String;
import java.util.Objects;

public final class lh2 implements ir0	// class@001d52 from classes.dex
{
    public final int a;
    public final ir0 b;

    public void lh2(ir0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       lh2 tb = this.b;
       switch (this.a){
           case 0:
           default:
             Objects.requireNonNull(p0, "value is null");
             tb.accept(new Notification(p0));
             return;
       }
       tb.accept(Notification.a(p0));
       return;
    }
}
