package p.vl2;
import android.app.Activity;
import java.lang.Object;
import android.content.Context;
import p.w51;
import p.ox7;
import android.content.pm.PackageInfo;
import p.oy7;
import p.a08;
import android.content.pm.Signature;
import p.h08;

public final class vl2	// class@002a18 from classes.dex
{
    public final Context a;
    public static vl2 b;

    public void vl2(Activity p0){
       super();
       this.a = p0;
    }
    public void vl2(Context p0){
       super();
       this.a = p0.getApplicationContext();
    }
    public static vl2 a(Context p0){
       w51.k(p0);
       _monitor_enter(vl2.class);
       if (vl2.b == null) {
          ox7.R(p0);
          vl2.b = new vl2(p0);
       }
       _monitor_exit(vl2.class);
       return vl2.b;
    }
    public static oy7 b(PackageInfo p0,oy7[] p1){
       PackageInfo signatures;
       if ((signatures = p0.signatures) == null) {
          return null;
       }
       if (signatures.length != 1) {
          return null;
       }
       int i = 0;
       a08 uoa08 = new a08(p0.signatures[i].toByteArray());
       while (true) {
          if (i >= p1.length) {
             return null;
          }
          if (p1[i].equals(uoa08)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return p1[i];
    }
    public static boolean c(PackageInfo p0,boolean p1){
       oy7 ooy7;
       if (p0 != null && p0.signatures != null) {
          if (p1) {
             ooy7 = vl2.b(p0, h08.a);
          }else {
             oy7[] ooy7Array = new oy7[true];
             ooy7Array[0] = h08.a[0];
             ooy7 = vl2.b(p0, ooy7Array);
          }
          if (ooy7 != null) {
             return true;
          }
       }
       return false;
    }
}
