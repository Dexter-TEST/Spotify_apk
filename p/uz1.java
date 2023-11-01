package p.uz1;
import java.lang.String;
import java.lang.Object;
import java.util.HashSet;
import p.co5;
import android.content.Context;
import android.os.Build;
import android.content.pm.ApplicationInfo;
import p.av6;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import p.ej4;
import java.util.Collection;
import p.dj0;

public abstract class uz1	// class@00294c from classes.dex
{
    public static final HashSet a;

    static {
       String[] stringArray = new String[]{"8a3c4b262d721acd49a4bf97d5213199c86fa2b9","cc2751449a350f668590264ed76692694a80308a","a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc","df6b721c8b4d3b6eb44c861d4415007e5a35fc95","9b8f518b086098de3d77736f9458a3d2f6f95a37","2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3","c56fb7d591ba6704df047fd98f535372fea00211"};
       uz1.a = co5.A(stringArray);
    }
    public static final boolean a(Context p0,String p1){
       PackageInfo signatures;
       String str = "packageInfo.signatures";
       co5.o(p0, "context");
       String bRAND = Build.BRAND;
       ApplicationInfo flags = p0.getApplicationInfo().flags;
       co5.l(bRAND, "brand");
       boolean b = false;
       if (av6.D0(bRAND, "generic", b) && ((flags & 0x02))) {
          return true;
       }
       try{
          if ((signatures = p0.getPackageManager().getPackageInfo(p1, 64).signatures) != null) {
             int i = (!signatures.length)? 1: 0;
             if (!i) {
                co5.l(signatures, str);
                i = signatures.length;
                int i1 = 0;
                while (true) {
                   if (i1 < i) {
                      byte[] uobyteArray = signatures[i1].toByteArray();
                      co5.l(uobyteArray, "it.toByteArray\(\)");
                      if (dj0.f0(uz1.a, ej4.S("SHA-1", uobyteArray))) {
                         i1 = i1 + 1;
                      }
                   }else {
                      b = true;
                      break ;
                   }
                }
             }
          }
          return b;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
       }
    }
}
