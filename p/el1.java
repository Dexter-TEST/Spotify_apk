package p.el1;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.String;
import p.co5;

public abstract class el1 implements Application$ActivityLifecycleCallbacks	// class@0014aa from classes.dex
{

    public void el1(){
       super();
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
    public void onActivityResumed(Activity p0){
       co5.o(p0, "activity");
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
       co5.o(p0, "activity");
       co5.o(p1, "outState");
    }
    public void onActivityStarted(Activity p0){
       co5.o(p0, "activity");
    }
    public void onActivityStopped(Activity p0){
       co5.o(p0, "activity");
    }
}
