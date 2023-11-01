package p.yl5;
import p.vv5;
import java.lang.Object;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import android.content.pm.PackageInfo;
import p.wl5;
import java.lang.String;
import p.gg1;
import java.lang.Class;
import p.n2;
import p.lv1;
import java.io.File;
import p.xl5;

public abstract class yl5	// class@002de0 from classes.dex
{
    public static final vv5 a;
    public static final Object b;
    public static gg1 c;

    static {
       yl5.a = new vv5();
       yl5.b = new Object();
       yl5.c = null;
    }
    public static long a(Context p0){
       PackageManager packageManag = p0.getApplicationContext().getPackageManager();
       if (Build$VERSION.SDK_INT >= 33) {
          return wl5.a(packageManag, p0).lastUpdateTime;
       }
       return packageManag.getPackageInfo(p0.getPackageName(), 0).lastUpdateTime;
    }
    public static gg1 b(int p0,boolean p1,boolean p2){
       gg1 ogg1 = new gg1(p0, p1, p2);
       yl5.c = ogg1;
       vv5 a = yl5.a;
       a.getClass();
       if (n2.w.g(a, null, ogg1)) {
          n2.c(a);
       }
       return yl5.c;
    }
    public static void c(Context p0,boolean p1){
       xl5 b2;
       if (!p1 && yl5.c != null) {
          return;
       }
       Object b = yl5.b;
       _monitor_enter(b);
       if (!p1 && yl5.c != null) {
          _monitor_exit(b);
          return;
       }else {
          boolean sDK_INT = Build$VERSION.SDK_INT;
          boolean b1 = false;
          if (sDK_INT >= 28 && sDK_INT != 30) {
             File sDK_INT1 = new File(new File("/data/misc/profiles/ref/", p0.getPackageName()), "primary.prof");
             long l = sDK_INT1.length();
             int i = 1;
             boolean i1 = 0;
             sDK_INT = (sDK_INT1.exists() && (l - i1) > 0)? true: false;
             File uFile = new File(new File("/data/misc/profiles/cur/0/", p0.getPackageName()), "primary.prof");
             long l1 = uFile.length();
             i1 = (uFile.exists() && (l1 - i1) > 0)? true: false;
             try{
                long l2 = yl5.a(p0);
                File uFile1 = new File(p0.getFilesDir(), "profileInstalled");
                xl5 oxl5 = (uFile1.exists())? xl5.a(uFile1): null;
                int i2 = 2;
                if (oxl5 != null && (!(oxl5.c - l2) && (b2 = oxl5.b) != i2)) {
                   b1 = b2;
                }else if(sDK_INT){
                   b1 = 1;
                }else if(i1){
                   b1 = 2;
                }
                if (p1 && (i1 && b1 != i)) {
                   b1 = 2;
                }
                if (oxl5 != null && (oxl5.b == i2 && (b1 == i && (l - oxl5.d) < 0))) {
                   b1 = 3;
                }
                xl5 i3 = new xl5(1, b1, l2, l1);
                if (oxl5 == null || !oxl5.equals(i)) {
                   try{
                      i.b(uFile1);
                   }catch(java.io.IOException e0){
                      b1 = 0x30000;
                   }
                }
                yl5.b(b1, e0, i1);
                _monitor_exit(b);
                return;
             }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                yl5.b(0x10000, e0, i1);
                _monitor_exit(b);
                return;
             }
          }else {
             yl5.b(0x40000, b1, b1);
             _monitor_exit(b);
             return;
          }
       }
    }
}
