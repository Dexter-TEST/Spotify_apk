package p.dt3;
import p.m00;
import p.da5;
import java.lang.Object;
import java.lang.String;
import android.os.Bundle;
import p.hu3;
import java.lang.System;
import android.os.BaseBundle;
import java.io.Closeable;
import p.a3;
import p.j3;
import p.co5;
import java.util.Date;
import p.ej4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.lang.CharSequence;
import java.util.List;
import p.av6;
import java.util.Arrays;
import p.ye7;
import java.lang.NullPointerException;
import android.util.Base64;
import p.oe0;
import java.nio.charset.Charset;
import org.json.JSONObject;
import p.ny1;
import p.yp;
import java.lang.Throwable;
import java.lang.Exception;
import p.et3;
import p.gt3;
import p.ft3;
import java.lang.Iterable;
import android.text.TextUtils;
import android.content.Context;
import p.cp5;
import p.li5;
import java.util.zip.ZipFile;
import java.io.File;
import java.lang.StringBuilder;
import java.lang.Class;
import java.util.zip.ZipEntry;
import java.util.regex.Pattern;
import java.util.HashSet;
import java.util.Enumeration;
import java.util.regex.Matcher;
import p.lu3;
import android.content.pm.ApplicationInfo;
import p.jm5;
import p.im5;
import p.me;
import p.m14;
import p.rf3;
import p.wx5;
import p.tp2;
import p.he3;
import p.bi6;
import p.ia7;

public final class dt3 implements m00, da5	// class@0013b1 from classes.dex
{
    public final int a;

    public void dt3(){
       this.a = 15;
       super();
    }
    public void dt3(int p0){
       this.a = p0;
       super();
    }
    public void dt3(int p0,int p1){
       this.a = p0;
       switch (p0){
           case 1:
             super(1);
             return;
           case 2:
             super(2);
             return;
           case 3:
             super(3);
             return;
           case 4:
             super(4);
             return;
           case 5:
             super(5);
             return;
           case 6:
             super(6);
             return;
           case 7:
             super(7);
             return;
           case 8:
             super(8);
             return;
           case 9:
             super(9);
             return;
           default:
             super(0);
             return;
       }
    }
    public static final Bundle f(String p0){
       Bundle uBundle = new Bundle();
       uBundle.putLong("1_timestamp_ms", System.currentTimeMillis());
       uBundle.putString("0_auth_logger_id", p0);
       uBundle.putString("3_method", "");
       uBundle.putString("2_result", "");
       uBundle.putString("5_error_message", "");
       uBundle.putString("4_error_code", "");
       uBundle.putString("6_extras", "");
       return uBundle;
    }
    public static void g(Closeable p0){
       try{
          if (p0 != null) {
             p0.close();
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
    public static a3 h(Bundle p0,String p1){
       String str1;
       a3 p0;
       j3 c = j3.c;
       co5.o(p0, "bundle");
       co5.o(p1, "applicationId");
       Date uDate = ej4.x(p0, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
       ArrayList stringArrayL = p0.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
       String str = p0.getString("com.facebook.platform.extra.ACCESS_TOKEN");
       Date uDate1 = ej4.x(p0, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0));
       if (str != null) {
          int i = 0;
          int i1 = (!str.length())? 1: 0;
          if (!i1 && (str1 = p0.getString("com.facebook.platform.extra.USER_ID")) != null) {
             if (!str1.length()) {
                i = 1;
             }
             if (!i) {
                p0 = new a3(str, p1, str1, stringArrayL, 0, 0, c, uDate, new Date(), uDate1, p0.getString("graph_domain"));
                return p0;
             }
          }
       }
       return null;
    }
    public static a3 i(Set p0,Bundle p1,j3 p2,String p3){
       Object[] objArray;
       ArrayList uArrayList;
       ArrayList uArrayList1;
       ArrayList uArrayList2;
       Object[] objArray1;
       String obj = p1;
       co5.o(obj, "bundle");
       co5.o(p3, "applicationId");
       Date uDate = ej4.x(obj, "expires_in", new Date());
       String str = obj.getString("access_token");
       a3 uoa3 = null;
       if (str == null) {
          return uoa3;
       }
       Date uDate1 = ej4.x(obj, "data_access_expiration_time", new Date(0));
       String str1 = obj.getString("granted_scopes");
       int i = 6;
       int i1 = 1;
       int i2 = 0;
       String str2 = ",";
       String str3 = "null cannot be cast to non-null type kotlin.Array<T>";
       if (str1 != null) {
          int i3 = (str1.length() > 0)? 1: 0;
          if (i3) {
             String[] stringArray = new String[]{str2};
             stringArray = new String[i2];
             if ((objArray = av6.B0(str1, stringArray, i2, i).toArray(stringArray)) != null) {
                uArrayList = ye7.e(Arrays.copyOf(objArray, objArray.length));
             label_006e :
                if ((str1 = obj.getString("denied_scopes")) != null) {
                   int i4 = (str1.length() > 0)? 1: 0;
                   if (i4) {
                      String[] stringArray1 = new String[]{str2};
                      stringArray1 = new String[i2];
                      if ((objArray = av6.B0(str1, stringArray1, i2, i).toArray(stringArray1)) != null) {
                         uArrayList1 = ye7.e(Arrays.copyOf(objArray, objArray.length));
                      label_00a5 :
                         if ((str1 = obj.getString("expired_scopes")) != null) {
                            int i5 = (str1.length() > 0)? 1: 0;
                            if (i5) {
                               String[] stringArray2 = new String[]{str2};
                               stringArray2 = new String[i2];
                               if ((objArray = av6.B0(str1, stringArray2, i2, i).toArray(stringArray2)) != null) {
                                  uArrayList2 = ye7.e(Arrays.copyOf(objArray, objArray.length));
                               label_00dc :
                                  if (ej4.Z(str)) {
                                     return uoa3;
                                  }else {
                                     String str4 = obj.getString("graph_domain");
                                     if ((obj = obj.getString("signed_request")) != null) {
                                        objArray = (!obj.length())? 1: 0;
                                        if (!objArray) {
                                           try{
                                              String[] stringArray3 = new String[]{"."};
                                              stringArray3 = new String[i2];
                                              if ((objArray1 = av6.B0(obj, stringArray3, i2, i).toArray(stringArray3)) != null) {
                                                 if (objArray1.length == 2) {
                                                    byte[] uobyteArray = Base64.decode(objArray1[i1], i2);
                                                    co5.l(uobyteArray, "data");
                                                    String i6 = new String(uobyteArray, oe0.a);
                                                    i6 = new JSONObject(i6).getString("user_id");
                                                    co5.l(i6, "jsonObject.getString\(\"user_id\"\)");
                                                    a3 uobyteArray1 = new a3(str, p3, i6, uArrayList, uArrayList1, uArrayList2, p2, uDate, new Date(), uDate1, str4);
                                                    return uobyteArray;
                                                 }else {
                                                    throw new ny1("Failed to retrieve user_id from signed_request");
                                                 }
                                              }else {
                                                 throw new NullPointerException(str3);
                                              }
                                           }catch(java.io.UnsupportedEncodingException e0){
                                           }catch(org.json.JSONException e0){
                                           }
                                        }
                                     }
                                     throw new ny1("Authorization response does not contain the signed_request");
                                  }
                               }else {
                                  throw new NullPointerException(str3);
                               }
                            }
                         }
                         uArrayList2 = uoa3;
                         goto label_00dc ;
                      }else {
                         throw new NullPointerException(str3);
                      }
                   }
                }
                uArrayList1 = uoa3;
                goto label_00a5 ;
             }else {
                throw new NullPointerException(str3);
             }
          }
       }
       uArrayList = p0;
       goto label_006e ;
    }
    public static yp j(Bundle p0,String p1){
       String str;
       yp oyp;
       co5.o(p0, "bundle");
       if ((str = p0.getString("id_token")) != null) {
          int i = 0;
          int i1 = (!str.length())? 1: 0;
          if (!i1 && p1 != null) {
             if (!p1.length()) {
                i = 1;
             }
             if (!i) {
                try{
                   oyp = new yp(str, p1);
                label_0038 :
                   return oyp;
                }catch(java.lang.Exception e3){
                   throw new ny1(e3.getMessage(), e3);
                }
             }
          }
       }
       oyp = null;
       goto label_0038 ;
    }
    public static gt3 k(et3 p0,String p1){
       gt3 v6 = new gt3(p0, ft3.c, null, p1, null);
       return v6;
    }
    public static gt3 l(et3 p0,a3 p1,yp p2){
       gt3 v7 = new gt3(p0, ft3.b, p1, p2, null, null);
       return v7;
    }
    public static gt3 m(et3 p0,String p1,String p2,String p3){
       gt3 ": ";
       ArrayList uArrayList = new ArrayList();
       if (p1 != null) {
          uArrayList.add(p1);
       }
       if (p2 != null) {
          uArrayList.add(p2);
       }
       ": " = new gt3(p0, ft3.t, null, TextUtils.join(": ", uArrayList), p3);
       return ": ";
    }
    public static li5 n(Context p0,String[] p1,String p2,cp5 p3){
       int i4;
       ZipEntry entry;
       int i = p1;
       String[] stringArray = dt3.r(p0);
       int len = stringArray.length;
       int i1 = 0;
       while (true) {
          ZipFile zipFile = null;
          if (i1 >= len) {
             return zipFile;
          }
          object oobject = stringArray[i1];
          int i2 = 0;
       label_000f :
          int i3 = i2 + 1;
          if (i2 < 5) {
             try{
                zipFile = new ZipFile(new File(oobject), 1);
             }catch(java.io.IOException e0){
                i2 = i3;
                goto label_000f ;
             }
          }
          try{
             if (zipFile == null) {
                i4 = p2;
             }else {
                i2 = 0;
                while (true) {
                   i3 = i2 + 1;
                   if (i2 < 5) {
                      i2 = i.length;
                      int i5 = 0;
                      while (true) {
                         if (i5 < i2) {
                            String str = "lib".append(File.separatorChar).append(i[i5]).append(File.separatorChar).append(p2).toString();
                            Object[] objArray = new Object[]{str,oobject};
                            p3.getClass();
                            cp5.d("Looking for %s in APK %s...", objArray);
                            if ((entry = zipFile.getEntry(str)) != null) {
                               break ;
                            }else {
                               i5 = i5 + 1;
                            }
                         }else {
                            i2 = i3;
                         }
                      }
                      return new li5(zipFile, 3, entry);
                   }else {
                      i4 = p2;
                      zipFile.close();
                   }
                }
             }
             i1 = i1 + 1;
          }catch(java.io.IOException e0){
          }
       }
    }
    public static String[] o(Context p0,String p1){
       Pattern pattern = Pattern.compile("lib"+File.separatorChar+"\([^\\"+File.separatorChar+"]*\)"+File.separatorChar+p1);
       HashSet hashSet = new HashSet();
       String[] stringArray = dt3.r(p0);
       int len = stringArray.length;
       int i = 0;
       while (i < len) {
          object oobject = stringArray[i];
          try{
             int i1 = 1;
             Enumeration uEnumeration = new ZipFile(new File(oobject), i1).entries();
             while (uEnumeration.hasMoreElements()) {
                Matcher matcher = pattern.matcher(uEnumeration.nextElement().getName());
                if (matcher.matches()) {
                   hashSet.add(matcher.group(i1));
                }
             }
             i = i + 1;
          }catch(java.io.IOException e0){
          }
       }
       stringArray = new String[hashSet.size()];
       return hashSet.toArray(stringArray);
    }
    public static boolean p(String p0){
       boolean b = false;
       if (p0 != null && (av6.D0(p0, "publish", b) && (!av6.D0(p0, "manage", b) && !lu3.d.contains(p0)))) {
          b = true;
       }
       return b;
    }
    public static String q(String p0){
       if (p0.startsWith("lib") && p0.endsWith(".so")) {
          return p0;
       }
       return System.mapLibraryName(p0);
    }
    public static String[] r(Context p0){
       ApplicationInfo splitSourceD;
       ApplicationInfo applicationI = p0.getApplicationInfo();
       if ((splitSourceD = applicationI.splitSourceDirs) != null && splitSourceD.length) {
          String[] stringArray = new String[(splitSourceD.length + 1)];
          stringArray[0] = applicationI.sourceDir;
          System.arraycopy(splitSourceD, 0, stringArray, 1, splitSourceD.length);
          return stringArray;
       }else {
          String[] stringArray1 = new String[]{applicationI.sourceDir};
          return stringArray1;
       }
    }
    public final jm5 a(){
       return jm5.v;
    }
    public final im5 b(){
       return im5.A;
    }
    public final me c(){
       return null;
    }
    public final rf3 d(m14 p0,Class p1){
       return rf3.y;
    }
    public final Object e(wx5 p0){
       switch (this.a){
           case 14:
           default:
             return null;
       }
       tp2.v(p0);
       throw null;
    }
    public final he3 getType(){
       return ia7.f();
    }
}
