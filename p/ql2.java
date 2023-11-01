package p.ql2;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageInstaller;
import java.util.List;
import java.util.Iterator;
import java.lang.Object;
import android.content.pm.PackageInstaller$SessionInfo;
import java.lang.String;
import android.content.pm.ApplicationInfo;

public abstract class ql2	// class@0023c3 from classes.dex
{
    public static boolean a = false;
    public static boolean b;
    public static final AtomicBoolean c;
    public static final AtomicBoolean d;

    static {
       ql2.c = new AtomicBoolean();
       ql2.d = new AtomicBoolean();
    }
    public static boolean a(Context p0){
       PackageManager packageManag;
       try{
          Iterator iterator = p0.getPackageManager().getPackageInstaller().getAllSessions().iterator();
          while (true) {
             if (iterator.hasNext()) {
                if ("com.google.android.gms".equals(iterator.next().getAppPackageName())) {
                   return true;
                }
                continue ;
             }else {
                packageManag = p0.getPackageManager();
                break ;
             }
          }
          try{
             iterator = 8192;
             return packageManag.getApplicationInfo("com.google.android.gms", iterator).enabled;
          }catch(android.content.pm.PackageManager$NameNotFoundException e0){
             return false;
          }
       }catch(java.lang.Exception e0){
       }
    }
}
