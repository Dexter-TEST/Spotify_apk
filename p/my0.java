package p.my0;
import java.util.concurrent.Callable;
import p.ny0;
import java.lang.Object;
import java.lang.Boolean;
import java.io.File;
import p.kf6;
import java.lang.String;
import android.util.Log;
import java.lang.Throwable;
import p.ly0;
import p.oy0;

public final class my0 implements Callable	// class@001f29 from classes.dex
{
    public final int a;
    public final ny0 b;

    public void my0(ny0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Boolean a(){
       Boolean uBoolean;
       String str;
       boolean b;
       int i = 3;
       my0 tb = this.b;
       switch (this.a){
           case 0:
             try{
                Log.isLoggable("FirebaseCrashlytics", i);
                uBoolean = Boolean.valueOf(tb.e.f().delete());
             }catch(java.lang.Exception e0){
                Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e0);
                uBoolean = Boolean.FALSE;
             }
             return uBoolean;
             break;
           default:
             ny0 h = tb.h;
             ly0 d = h.d;
             if (!d.f().exists()) {
                if ((str = h.g()) == null || !h.p.h(str)) {
                   b = false;
                }
             }else {
                Log.isLoggable("FirebaseCrashlytics", i);
                d.f().delete();
             }
             b = true;
       }
       return Boolean.valueOf(b);
    }
    public final Object call(){
       switch (this.a){
           case 0:
           default:
             return this.a();
       }
       return this.a();
    }
}
