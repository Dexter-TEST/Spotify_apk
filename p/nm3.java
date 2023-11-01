package p.nm3;
import p.vg0;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import p.po2;
import p.oo2;
import android.content.pm.Signature;
import java.lang.Class;
import p.ap5;
import p.w51;
import p.m74;
import p.fo2;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import p.xe7;
import p.vf;
import java.util.List;
import java.util.Arrays;
import java.lang.Iterable;
import com.spotify.base.java.logging.Logger;
import java.util.Iterator;
import p.kr3;
import p.zr3;
import java.lang.Throwable;
import android.content.ContentResolver;
import android.provider.Settings$Secure;
import p.kq3;
import p.de0;
import p.mi;

public final class nm3 implements vg0	// class@002007 from classes.dex
{
    public final Context a;
    public final String b;
    public final String c;
    public final String d;

    public void nm3(Context p0){
       int i;
       String str;
       String str1;
       super();
       this.a = p0;
       this.b = p0.getPackageManager().getInstallerPackageName(p0.getPackageName());
       try{
          i = 0;
          PackageInfo packageInfo = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 64);
          if (packageInfo.signatures != null) {
             ArrayList uArrayList = new ArrayList();
             packageInfo = packageInfo.signatures;
             int len = packageInfo.length;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   m74 a = oo2.a;
                   byte[] uobyteArray = packageInfo[i1].toByteArray();
                   a.getClass();
                   int len1 = uobyteArray.length;
                   int i2 = len1 + 0;
                   ap5.i(i, i2, uobyteArray.length);
                   int i3 = (len1 >= 0)? 1: 0;
                   if (i3) {
                      w51 ow51 = a.b();
                      ow51.I(uobyteArray, len1);
                      uArrayList.add(ow51.B().toString());
                      i1 = i1 + 1;
                   }else {
                      Object[] objArray1 = new Object[1];
                      objArray1[i] = Integer.valueOf(len1);
                      throw new IllegalArgumentException(xe7.E("expectedInputSize must be >= 0 but was %s", objArray1));
                   }
                }else {
                   str = new vf(String.valueOf(':')).r(Arrays.asList(uArrayList.toArray()));
                label_00af :
                   this.c = str;
                   if ((str1 = Settings$Secure.getString(p0.getContentResolver(), "android_id")) == null || str1.isEmpty()) {
                      str1 = "0";
                      break ;
                   }
                   break ;
                }
             }
             this.d = str1;
             return;
          }
       }catch(android.content.pm.PackageManager$NameNotFoundException e1){
          Object[] objArray = new Object[i];
          Iterator iterator = Logger.a.iterator();
       label_0097 :
          if (iterator.hasNext()) {
             Logger.g(iterator.next().b(), e1, "Failed to get the application signatures", objArray);
             goto label_0097 ;
          }
       }
       str = "";
       goto label_00af ;
    }
    public final String a(){
       return new de0().Q().G();
    }
}
