package p.ay7;
import p.jd;
import java.lang.String;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import android.util.Base64;
import android.os.Build;
import java.lang.CharSequence;

public abstract class ay7	// class@00101b from classes.dex
{
    public static final jd a;

    static {
       ay7.a = new jd("PhoneskyVerificationUtils");
    }
    public static boolean a(Context p0){
       String[] packagesForU;
       if ((packagesForU = p0.getPackageManager().getPackagesForUid(Binder.getCallingUid())) != null && Arrays.asList(packagesForU).contains("com.android.vending")) {
          return true;
       }
       return false;
    }
    public static boolean b(Context p0){
       PackageInfo signatures;
       int len;
       String str1;
       String str = "com.android.vending";
       int i = 0;
       try{
          if (p0.getPackageManager().getApplicationInfo(str, i).enabled != null) {
             if ((signatures = p0.getPackageManager().getPackageInfo(str, 64).signatures) != null && (len = signatures.length)) {
                int i1 = 0;
                while (i1 < len) {
                   byte[] uobyteArray = signatures[i1].toByteArray();
                   try{
                      MessageDigest instance = MessageDigest.getInstance("SHA-256");
                      instance.update(uobyteArray);
                      uobyteArray = instance.digest();
                      str1 = Base64.encodeToString(uobyteArray, 11);
                   }catch(java.security.NoSuchAlgorithmException e0){
                      str1 = "";
                   }
                   if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str1) && (!Build.TAGS.contains("dev-keys") && (!Build.TAGS.contains("test-keys") || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str1)))) {
                      i1 = i1 + 1;
                   }else {
                      return true;
                   }
                }
             }else {
                Object[] objArray = new Object[i];
                ay7.a.f("Phonesky package is not signed -- possibly self-built package. Could not verify.", objArray);
             }
          }
          return i;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
       }
    }
}
