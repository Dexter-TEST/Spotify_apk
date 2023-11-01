package p.df4;
import p.cf4;
import p.bf4;
import java.lang.Object;
import java.util.ArrayList;
import p.ye7;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Integer;
import java.util.TreeSet;
import android.content.Context;
import p.sz1;
import android.content.ContentResolver;
import java.lang.String;
import java.lang.StringBuilder;
import android.net.Uri;
import p.co5;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import java.lang.Throwable;
import android.util.Log;
import android.database.Cursor;
import java.util.Set;
import p.o61;
import p.bv3;
import android.content.Intent;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import p.ej4;
import java.util.Iterator;
import java.util.List;
import android.content.pm.ResolveInfo;
import p.uz1;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import p.ny1;
import p.uk;
import android.os.BaseBundle;
import java.util.UUID;
import p.mz1;
import java.util.concurrent.Executor;
import p.bc;
import java.lang.Runnable;
import p.ir2;
import java.lang.Boolean;
import java.lang.Math;

public final class df4	// class@001337 from classes.dex
{
    public static final ArrayList a;
    public static final AtomicBoolean b;
    public static final Integer[] c;

    static {
       cf4[] uocf4Array = new cf4[]{new bf4(2),new bf4(4)};
       ArrayList uArrayList = ye7.e(uocf4Array);
       df4.a = uArrayList;
       cf4[] uocf4Array1 = new cf4[]{new bf4(0)};
       ArrayList uArrayList1 = ye7.e(uocf4Array1);
       cf4[] uocf4Array2 = new cf4[]{new bf4(2),new bf4(4)};
       uArrayList1.addAll(ye7.e(uocf4Array2));
       HashMap hashMap = new HashMap();
       ArrayList uArrayList2 = new ArrayList();
       uArrayList2.add(new bf4(3));
       hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", uArrayList);
       hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", uArrayList);
       hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", uArrayList);
       hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", uArrayList);
       hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", uArrayList2);
       hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", uArrayList2);
       hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", uArrayList1);
       hashMap.put("com.facebook.platform.action.request.SHARE_STORY", uArrayList);
       df4.b = new AtomicBoolean(0);
       Integer[] integerArray = new Integer[22];
       integerArray[0] = Integer.valueOf(0x13464da);
       integerArray[1] = Integer.valueOf(0x133c96b);
       integerArray[2] = Integer.valueOf(0x133c6b1);
       integerArray[3] = Integer.valueOf(0x133c6ab);
       integerArray[4] = Integer.valueOf(0x133c5e5);
       integerArray[5] = Integer.valueOf(0x133a1f9);
       integerArray[6] = Integer.valueOf(0x1339f47);
       integerArray[7] = Integer.valueOf(0x13379ae);
       integerArray[8] = Integer.valueOf(0x1337881);
       integerArray[9] = Integer.valueOf(0x13354a2);
       integerArray[10] = Integer.valueOf(0x1335433);
       integerArray[11] = Integer.valueOf(0x13353e4);
       integerArray[12] = Integer.valueOf(0x13353c9);
       integerArray[13] = Integer.valueOf(0x133529d);
       integerArray[14] = Integer.valueOf(0x1335124);
       integerArray[15] = Integer.valueOf(0x1335119);
       integerArray[16] = Integer.valueOf(0x13350ac);
       integerArray[17] = Integer.valueOf(0x1332d23);
       integerArray[18] = Integer.valueOf(0x1332cd0);
       integerArray[19] = Integer.valueOf(0x1332b3a);
       integerArray[20] = Integer.valueOf(0x1332ac6);
       integerArray[21] = Integer.valueOf(0x133060d);
       df4.c = integerArray;
    }
    public void df4(){
       super();
    }
    public static final TreeSet a(cf4 p0){
       ProviderInfo providerInfo;
       TreeSet treeSet = new TreeSet();
       ContentResolver contentResol = sz1.a().getContentResolver();
       String[] stringArray = new String[]{"version"};
       Uri uri = Uri.parse("content://"+p0.b()+".provider.PlatformProvider/versions");
       co5.l(uri, "parse\(CONTENT_SCHEME + appInfo.getPackage\(\) + PLATFORM_PROVIDER_VERSIONS\)");
       Cursor uCursor = null;
       PackageManager packageManag = sz1.a().getPackageManager();
       String str = co5.K(".provider.PlatformProvider", p0.b());
       try{
          int i = 0;
          providerInfo = packageManag.resolveContentProvider(str, i);
       }catch(java.lang.RuntimeException e11){
          Log.e("p.df4", "Failed to query content resolver.", e11);
          providerInfo = uCursor;
       }
       if (providerInfo != null) {
          String str1 = null;
          try{
             uCursor = contentResol.query(uri, stringArray, null, null, str1);
          }catch(java.lang.NullPointerException e0){
             Log.e("p.df4", e0);
          }catch(java.lang.SecurityException e0){
             Log.e("p.df4", e0);
          }catch(java.lang.IllegalArgumentException e0){
             Log.e("p.df4", e0);
          }
          if (uCursor != null) {
             while (uCursor.moveToNext()) {
                treeSet.add(Integer.valueOf(uCursor.getInt(uCursor.getColumnIndex("version"))));
             }
          }
       }
       if (uCursor != null) {
          uCursor.close();
       }
       return treeSet;
    }
    public static Intent b(cf4 p0,String p1,Set p2,String p3,boolean p4,o61 p5,String p6,String p7,boolean p8,String p9,boolean p10,bv3 p11,boolean p12,boolean p13,String p14){
       String str;
       String str1;
       Intent intent = null;
       switch (p0.b){
           case 0:
           case 3:
             str = intent;
             break;
           case 1:
             str = "com.instagram.platform.AppAuthorizeActivity";
             break;
           default:
             str = "com.facebook.katana.ProxyAuth";
       }
       if (str == null) {
          return intent;
       }
       Intent intent1 = new Intent().setClassName(p0.b(), str).putExtra("client_id", p1);
       co5.l(intent1, "Intent\(\)\n            .setClassName\(appInfo.getPackage\(\), activityName\)\n            .putExtra\(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId\)");
       intent1.putExtra("facebook_sdk_version", "15.0.1");
       intent = (p2.isEmpty())? 1: 0;
       if (!intent) {
          intent1.putExtra("scope", TextUtils.join(",", p2));
       }
       if (!ej4.Z(p3)) {
          intent1.putExtra("e2e", p3);
       }
       intent1.putExtra("state", p6);
       switch (p0.b){
           case 1:
             str1 = "token,signed_request,graph_domain,granted_scopes";
             break;
           default:
             str1 = "id_token,token,signed_request,graph_domain";
       }
       intent1.putExtra("response_type", str1);
       intent1.putExtra("nonce", p14);
       intent1.putExtra("return_scopes", "true");
       if (p4) {
          intent1.putExtra("default_audience", p5.a);
       }
       intent1.putExtra("legacy_override", sz1.d());
       intent1.putExtra("auth_type", p7);
       if (p8) {
          intent1.putExtra("fail_on_logged_out", true);
       }
       intent1.putExtra("messenger_page_id", p9);
       intent1.putExtra("reset_messenger_state", p10);
       if (p12) {
          intent1.putExtra("fx_app", p11.a);
       }
       if (p13) {
          intent1.putExtra("skip_dedupe", true);
       }
       return intent1;
    }
    public static final Intent c(Context p0){
       Intent intent;
       Intent intent1;
       ResolveInfo resolveInfo;
       co5.o(p0, "context");
       Iterator iterator = df4.a.iterator();
       while (true) {
          intent = null;
          if (iterator.hasNext()) {
             if ((intent1 = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(iterator.next().b()).addCategory("android.intent.category.DEFAULT")) != null && (resolveInfo = p0.getPackageManager().resolveService(intent1, 0)) != null) {
                ServiceInfo packageName = resolveInfo.serviceInfo.packageName;
                co5.l(packageName, "resolveInfo.serviceInfo.packageName");
                if (uz1.a(p0, packageName)) {
                   intent = intent1;
                }
             }
             if (intent != null) {
                break ;
             }
          }else {
             break ;
          }
       }
       return intent;
    }
    public static final Intent d(Intent p0,Bundle p1,ny1 p2){
       Bundle bundleExtra;
       String str1;
       UUID uUID;
       String str = "com.facebook.platform.protocol.PROTOCOL_VERSION";
       int i = 0;
       int intExtra = p0.getIntExtra(str, i);
       intExtra = (uk.i0(df4.c, Integer.valueOf(intExtra)) && intExtra >= 0x133529d)? 1: 0;
       Intent intent = null;
       if (intExtra) {
          str1 = ((bundleExtra = p0.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS")) != null)? bundleExtra.getString("action_id"): intent;
       }else {
          str1 = p0.getStringExtra("com.facebook.platform.protocol.CALL_ID");
       }
       if (str1 != null) {
          try{
             uUID = UUID.fromString(str1);
          label_003e :
             if (uUID == null) {
                return intent;
             }else {
                intent = new Intent();
                intent.putExtra(e0, p0.getIntExtra(e0, i));
                Bundle uBundle = new Bundle();
                uBundle.putString("action_id", uUID.toString());
                if (p2 != null) {
                   Bundle uBundle1 = new Bundle();
                   uBundle1.putString("error_description", p2.toString());
                   if (p2 instanceof mz1) {
                      uBundle1.putString("error_type", "UserCanceled");
                   }
                   uBundle.putBundle("error", uBundle1);
                }
                intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", uBundle);
                if (p1 != null) {
                   intent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", p1);
                }
                return intent;
             }
          }catch(java.lang.IllegalArgumentException e0){
          }
          uUID = intent;
          goto label_003e ;
       }else {
       }
    }
    public static final int e(int p0){
       ArrayList a;
       ir2 oir2;
       cf4 a1;
       int i2;
       int i = 1;
       int[] ointArray = new int[i];
       ointArray[0] = p0;
       if (!df4.b.compareAndSet(0, i)) {
       }else {
          sz1.c().execute(new bc(14));
       }
       p0 = -1;
       if ((a = df4.a) == null) {
          oir2 = new ir2();
          oir2.a = p0;
       }else {
          Iterator iterator = a.iterator();
          while (true) {
             if (iterator.hasNext()) {
                cf4 uocf4 = iterator.next();
                if ((a1 = uocf4.a) == null || !co5.c(Boolean.valueOf(a1.isEmpty()), Boolean.FALSE)) {
                   uocf4.a(0);
                }
                uocf4 = uocf4.a;
                int i1 = df4.c[0].intValue();
                if (uocf4 != null) {
                   Iterator iterator1 = uocf4.descendingIterator();
                   int i3 = -1;
                   int i4 = 0;
                   while (true) {
                      if (iterator1.hasNext()) {
                         Integer integer = iterator1.next();
                         co5.l(integer, "fbAppVersion");
                         i3 = Math.max(i3, integer.intValue());
                         while (i4 >= 0 && ointArray[i4] > integer.intValue()) {
                            i4 = i4 - 1;
                         }
                         if (i4 >= 0) {
                            if (ointArray[i4] == integer.intValue()) {
                               if (!(i4 = i4 % 2)) {
                                  i2 = Math.min(i3, i1);
                               }
                            }
                         }
                      }
                   }
                   if (i2 != p0) {
                      oir2 = new ir2();
                      oir2.a = i2;
                   }
                }
                i2 = -1;
             }else {
                oir2 = new ir2();
                oir2.a = p0;
                break ;
             }
          }
       }
       return oir2.a;
    }
}
