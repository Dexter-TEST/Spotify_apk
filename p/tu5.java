package p.tu5;
import android.app.Application$ActivityLifecycleCallbacks;
import p.su5;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import p.co5;
import p.u3;
import android.os.Bundle;
import p.uu5;
import p.kj3;
import p.gg1;

public final class tu5 implements Application$ActivityLifecycleCallbacks	// class@0027e5 from classes.dex
{
    public static final su5 Companion;

    static {
       tu5.Companion = new su5();
    }
    public void tu5(){
       super();
    }
    public static final void registerIn(Activity p0){
       tu5.Companion.getClass();
       co5.o(p0, "activity");
       u3.l(p0, new tu5());
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       co5.o(p0, "activity");
    }
    public void onActivityDestroyed(Activity p0){
       co5.o(p0, "activity");
    }
    public void onActivityPaused(Activity p0){
       co5.o(p0, "activity");
    }
    public void onActivityPostCreated(Activity p0,Bundle p1){
       co5.o(p0, "activity");
       gg1.z(p0, kj3.ON_CREATE);
    }
    public void onActivityPostResumed(Activity p0){
       co5.o(p0, "activity");
       gg1.z(p0, kj3.ON_RESUME);
    }
    public void onActivityPostStarted(Activity p0){
       co5.o(p0, "activity");
       gg1.z(p0, kj3.ON_START);
    }
    public void onActivityPreDestroyed(Activity p0){
       co5.o(p0, "activity");
       gg1.z(p0, kj3.ON_DESTROY);
    }
    public void onActivityPrePaused(Activity p0){
       co5.o(p0, "activity");
       gg1.z(p0, kj3.ON_PAUSE);
    }
    public void onActivityPreStopped(Activity p0){
       co5.o(p0, "activity");
       gg1.z(p0, kj3.ON_STOP);
    }
    public void onActivityResumed(Activity p0){
       co5.o(p0, "activity");
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
       co5.o(p0, "activity");
       co5.o(p1, "bundle");
    }
    public void onActivityStarted(Activity p0){
       co5.o(p0, "activity");
    }
    public void onActivityStopped(Activity p0){
       co5.o(p0, "activity");
    }
}
