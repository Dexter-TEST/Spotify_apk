package p.q6;
import android.app.Application$ActivityLifecycleCallbacks;
import p.tx0;
import java.lang.Object;
import p.rr3;
import p.pr3;
import p.ge2;
import p.o6;
import android.app.Activity;
import java.lang.String;
import java.lang.Enum;
import java.lang.Class;
import android.content.Intent;
import p.fr0;
import java.lang.Throwable;
import android.os.Bundle;
import androidx.fragment.app.k;
import p.ae2;
import androidx.fragment.app.o;
import p.pd2;
import java.util.concurrent.CopyOnWriteArrayList;
import p.od2;
import p.ej4;

public final class q6 implements Application$ActivityLifecycleCallbacks, tx0	// class@002342 from classes.dex
{
    public final ge2 a;
    public final rr3 b;

    public void q6(){
       super();
       rr3 orr3 = new rr3(new pr3(0x36ee80, 100));
       this.b = orr3;
       this.a = new ge2(1, orr3);
    }
    public static String b(o6 p0,Activity p1){
       Object[] objArray = new Object[]{p0.name(),p1.getClass().getSimpleName(),p1.getIntent()};
       return String.format("%s\(class=%s, intent=%s\)", objArray);
    }
    public final void a(fr0 p0){
       p0.accept("--------------------------------- Activity/fragment output");
       this.b.b(p0);
    }
    public final void c(String p0){
       this.b.a('I', "ACTIVITY", p0, null);
    }
    public final void onActivityCreated(Activity p0,Bundle p1){
       this.b.a('I', "ACTIVITY", q6.b(o6.a, p0), null);
       if (p0 instanceof k) {
          p0.y().m.a.add(new od2(this.a));
       }
       return;
    }
    public final void onActivityDestroyed(Activity p0){
       this.c(q6.b(o6.x, p0));
       if (p0 instanceof k) {
          p0.y().g0(this.a);
       }
       return;
    }
    public final void onActivityPaused(Activity p0){
       this.c(q6.b(o6.t, p0));
    }
    public final void onActivityResumed(Activity p0){
       this.c(q6.b(o6.c, p0));
    }
    public final void onActivitySaveInstanceState(Activity p0,Bundle p1){
       this.c(q6.b(o6.w, p0));
    }
    public final void onActivityStarted(Activity p0){
       this.c(q6.b(o6.b, p0));
    }
    public final void onActivityStopped(Activity p0){
       this.c(q6.b(o6.v, p0));
    }
}
