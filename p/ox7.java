package p.ox7;
import p.w54;
import p.c65;
import p.ia1;
import p.bx6;
import java.lang.String;
import p.dl1;
import p.ps3;
import java.lang.Math;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import p.z4;
import java.lang.Throwable;
import java.lang.Object;
import p.pl0;
import p.k12;
import p.yf2;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeoutException;
import p.l51;
import p.do5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.CharSequence;
import p.av6;
import android.content.Context;
import p.ji5;
import android.text.TextUtils;
import java.lang.Class;
import java.net.URLDecoder;
import java.util.HashMap;
import java.lang.Boolean;
import android.content.SharedPreferences$Editor;
import p.ej4;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import java.lang.IllegalArgumentException;
import android.content.res.Resources;
import android.view.View;
import p.co5;
import android.view.ViewOutlineProvider;
import p.gz5;
import p.af0;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import android.support.v4.media.MediaMetadataCompat;
import p.u44;
import android.support.v4.media.RatingCompat;
import p.wh6;
import java.lang.Integer;
import android.os.Bundle;
import android.os.Parcelable;
import p.bm;
import p.bi5;
import p.vt;
import p.zv;
import p.au2;
import p.aq6;
import p.td7;
import p.zt2;
import p.ty0;
import p.yp6;
import p.te5;
import p.a23;
import android.widget.ImageView;
import p.he1;
import p.wp6;
import p.ej0;
import p.vp6;
import p.lp6;
import p.sp6;
import android.graphics.drawable.Drawable;
import p.uw5;
import java.lang.Enum;
import java.lang.Float;
import p.e5;
import p.nf0;
import p.fn0;
import p.zo0;
import p.vs3;
import p.vq4;
import java.util.concurrent.TimeUnit;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.ObservableSource;
import p.fj7;
import p.b5;
import java.io.File;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import android.content.pm.PackageInfo;
import android.content.pm.ComponentInfo;
import java.nio.charset.Charset;
import java.net.URLEncoder;
import java.lang.AssertionError;
import p.zs;
import java.lang.Character;
import java.util.Arrays;
import java.lang.StringBuilder;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.Reader;
import java.util.Locale;
import p.nd;
import android.content.res.Configuration;
import p.br3;
import p.is7;
import java.util.Collection;
import com.spotify.webapi.service.models.Image;
import java.io.FileFilter;
import com.spotify.webapi.service.models.TrackSimple;
import java.lang.Iterable;
import p.ab2;
import p.pq5;
import p.jg2;
import p.rd3;
import p.vf;
import p.xe3;
import android.widget.EditText;
import android.widget.TextView;
import p.gi7;
import android.app.ActivityManager$MemoryInfo;
import android.app.ActivityManager;
import p.wh7;
import p.eh7;
import java.lang.RuntimeException;

public abstract class ox7 implements w54	// class@0021af from classes.dex
{
    public static final dl1 A;
    public static final dl1 B;
    public static final c65 C;
    public static final int[] D;
    public static final ps3 E;
    public static Context a;
    public static String b;
    public static final c65 c;
    public static final ia1 t;
    public static final bx6 v;
    public static final bx6 w;
    public static final bx6 x;
    public static final bx6 y;
    public static final bx6 z;

    static {
       ox7.c = new c65(19);
       ox7.t = new ia1();
       ox7.v = new bx6("COMPLETING_ALREADY");
       ox7.w = new bx6("COMPLETING_WAITING_CHILDREN");
       ox7.x = new bx6("COMPLETING_RETRY");
       ox7.y = new bx6("TOO_LATE_TO_CANCEL");
       ox7.z = new bx6("SEALED");
       ox7.A = new dl1(false);
       ox7.B = new dl1(true);
       ox7.C = new c65(0);
       ox7.D = new int[2]{0x7f0304f7,0x7f0304f8};
       ox7.E = new ps3(20);
    }
    public static int A(String p0,int p1,int p2){
       int i;
       float[] uofloatArray;
       int i8;
       float f1;
       float f5;
       float f6;
       char c1;
       float f7;
       String str = p0;
       if ((i = p1) >= p0.length()) {
          return p2;
       }
       int i1 = 6;
       if (!p2) {
          uofloatArray = new float[i1]{0,0x3f800000,0x3f800000,0x3f800000,0x3f800000,0x3fa00000};
       }else {
          uofloatArray = new float[i1]{0x3f800000,0x40000000,0x40000000,0x40000000,0x40000000,0x40100000};
          uofloatArray[p2] = 0;
       }
       int i2 = 0;
       while (true) {
          int i3 = i + i2;
          int i4 = 5;
          int i5 = 2;
          int i6 = 3;
          int i7 = 4;
          if (i3 == p0.length()) {
             byte[] uobyteArray = new byte[i1];
             int[] ointArray = new int[i1];
             i8 = ox7.f(uofloatArray, ointArray, uobyteArray);
             i3 = 0;
             for (i2 = 0; i2 < i1; i2 = i2 + 1) {
                i3 = i3 + uobyteArray[i2];
             }
             if (ointArray[0] == i8) {
                return 0;
             }else if(i3 == 1 && uobyteArray[i4] > 0){
                return i4;
             }else if(i3 == 1 && uobyteArray[i7] > 0){
                return i7;
             }else if(i3 == 1 && uobyteArray[i5] > 0){
                return i5;
             }else if(i3 == 1 && uobyteArray[i6] > 0){
                return i6;
             }else {
                return 1;
             }
          }else {
             char c = str.charAt(i3);
             i2 = i2 + 1;
             int i9 = 57;
             int i10 = 48;
             int i11 = (c >= i10 && c <= i9)? 1: 0;
             float f = 0x3f800000;
             if (i11) {
                f1 = uofloatArray[0] + 0x3f000000;
                uofloatArray[0] = f1;
             }else if(ox7.u(c)){
                f7 = (float)Math.ceil((double)uofloatArray[0]);
                uofloatArray[0] = f7;
                f7 = f7 + 2.00f;
                uofloatArray[0] = f7;
             }else {
                f7 = (float)Math.ceil((double)uofloatArray[0]);
                uofloatArray[0] = f7;
                f7 = f7 + f;
                uofloatArray[0] = f7;
             }
             i6 = 32;
             float f4 = (c != i6 && (c < i10 && (c <= i9 && (c < 'A' && c <= 'Z'))))? 0: 1;
             f1 = 2.67f;
             float f2 = 0x3faaaaab;
             float f3 = 0x3f2aaaab;
             if (i7) {
                f4 = uofloatArray[1] + f3;
                uofloatArray[1] = f4;
             }else if(ox7.u(c)){
                f4 = uofloatArray[1] + f1;
                uofloatArray[1] = f4;
             }else {
                f4 = uofloatArray[1] + f2;
                uofloatArray[1] = f4;
             }
             byte[] uobyteArray1 = (c != i6 && (c < i10 && (c <= i9 && (c < 'a' && c <= 'z'))))? 0: 1;
             if (i9) {
                f5 = uofloatArray[i5] + f3;
                uofloatArray[i5] = f5;
             }else if(ox7.u(c)){
                f5 = uofloatArray[i5] + f1;
                uofloatArray[i5] = f5;
             }else {
                f5 = uofloatArray[i5] + f2;
                uofloatArray[i5] = f5;
             }
             if (ox7.w(c)) {
                i9 = 3;
                f4 = uofloatArray[i9] + f3;
                uofloatArray[i9] = f4;
             }else {
                i9 = 3;
                if (ox7.u(c)) {
                   f4 = uofloatArray[i9] + 4.33f;
                   uofloatArray[i9] = f4;
                }else {
                   f4 = uofloatArray[i9] + 3.33f;
                   uofloatArray[i9] = f4;
                }
             }
             f5 = (c >= i6 && c <= '^')? 1: 0;
             if (f5) {
                i9 = 4;
                f6 = uofloatArray[i9] + 0x3f400000;
                uofloatArray[i9] = f6;
             }else {
                i9 = 4;
                if (ox7.u(c)) {
                   f6 = uofloatArray[i9] + 4.25f;
                   uofloatArray[i9] = f6;
                }else {
                   f6 = uofloatArray[i9] + 3.25f;
                   uofloatArray[i9] = f6;
                }
             }
             f6 = uofloatArray[i4] + f;
             uofloatArray[i4] = f6;
             if (i2 >= i9) {
                int[] ointArray1 = new int[i1];
                uobyteArray1 = new byte[i1];
                ox7.f(uofloatArray, ointArray1, uobyteArray1);
                i7 = 0;
                for (i6 = 0; i6 < i1; i6 = i6 + 1) {
                   i7 = i7 + uobyteArray1[i6];
                }
                i6 = ointArray1[0];
                i10 = ointArray1[i4];
                if (i6 < i10 && (i6 < ointArray1[1] && (i6 < ointArray1[i5] && (i6 < ointArray1[3] && i6 < ointArray1[4])))) {
                   return 0;
                }else if(i10 >= i6){
                   byte b = uobyteArray1[i5];
                   i11 = uobyteArray1[1] + b;
                   byte b1 = uobyteArray1[3];
                   i11 = i11 + b1;
                   int i12 = 4;
                   i9 = uobyteArray1[i12];
                   if (i11 = i11 + i9) {
                      if (i7 == 1 && i9 > 0) {
                         return i12;
                      }else if(i7 == 1 && b > 0){
                         return i5;
                      }else if(i7 == 1 && b1 > 0){
                         return 3;
                      }else {
                         i9 = ointArray1[1];
                         if ((i4 = i9 + 1) < i6 && (i4 < i10 && (i4 < ointArray1[4] && i4 < ointArray1[i5]))) {
                            i3 = ointArray1[3];
                            if (i9 < i3) {
                               return 1;
                            }else if(i9 == i3){
                               i = (i + i2) + 1;
                               while (i < p0.length()) {
                                  i8 = ((c1 = str.charAt(i)) != 13 && (c1 != '*' && c1 != '>'))? 0: 1;
                                  if (i8) {
                                     return 3;
                                  }else if(ox7.w(c1)){
                                     i = i + 1;
                                  }else {
                                     break ;
                                  }
                               }
                               return 1;
                            }
                         }
                      }
                   }
                }
                return i4;
             }
          }
       }
    }
    public static Observable B(Completable p0){
       return p0.t(new z4(null, false)).onErrorReturn(new k12(13)).toObservable().startWithItem(new z4(null, true));
    }
    public static Observable C(Observable p0){
       return ox7.P(ox7.P(p0.map(new k12(16)), do5.s(new TimeoutException()), 0x2ee0), new l51(true, null, null), 500).onErrorReturn(new k12(17));
    }
    public static final boolean D(ArrayList p0,ArrayList p1){
       Iterator iterator = p0.iterator();
       while (true) {
          boolean b = false;
          if (!iterator.hasNext()) {
             return b;
          }
          String str = iterator.next();
          Iterator iterator1 = p1.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                if (av6.f0(str, iterator1.next())) {
                   b = 1;
                }
             }
             if (b) {
                break ;
             }else {
                continue ;
             }
          }
          return true;
       }
    }
    public static void E(Context p0,String p1,long p2,long p3,String p4){
       int i3;
       String str = p1;
       long l = p2;
       long l1 = p3;
       ji5 oji5 = ji5.g(p0);
       if (!TextUtils.isEmpty(p4)) {
          oji5.getClass();
          if (!TextUtils.isEmpty(p4)) {
             oji5.w("bnc_app_store_source", p4);
          }
       }
       int i = 0;
       if ((l - i) > 0) {
          oji5.t("bnc_referrer_click_ts", l);
          l = 0;
       }else {
          int i4 = i;
       }
       if ((l1 - l) > 0) {
          oji5.t("bnc_install_begin_ts", l1);
       }
       if (str) {
          try{
             str = URLDecoder.decode(str, "UTF-8");
             HashMap hashMap = new HashMap();
             String[] stringArray = str.split("&");
             oji5.w("bnc_google_play_install_referrer_extras", str);
             int len = stringArray.length;
             int i1 = 0;
             for (int i2 = 0; i2 < len; len = i3) {
                object oobject = stringArray[i2];
                if (!TextUtils.isEmpty(oobject)) {
                   String str1 = (!oobject.contains("=") && oobject.contains("-"))? "-": "=";
                   String[] stringArray1 = oobject.split(str1);
                   i3 = len;
                   len = 1;
                   if (stringArray1.length > len) {
                      hashMap.put(URLDecoder.decode(stringArray1[i1], "UTF-8"), URLDecoder.decode(stringArray1[len], "UTF-8"));
                   }
                }else {
                   i3 = len;
                }
                i2 = i2 + 1;
             }
             if (hashMap.containsKey("link_click_id")) {
                str = hashMap.get("link_click_id");
                ox7.b = str;
                oji5.w("bnc_link_click_identifier", str);
             }
             if (hashMap.containsKey("is_full_app_conversion") && hashMap.containsKey("referring_link")) {
                oji5.b.putBoolean("bnc_is_full_app_conversion", Boolean.valueOf(Boolean.parseBoolean(hashMap.get("is_full_app_conversion"))).booleanValue()).apply();
                oji5.w("bnc_app_link", hashMap.get("referring_link"));
             }
             if (hashMap.containsKey("google_search_install_referrer")) {
                oji5.w("bnc_google_search_install_identifier", hashMap.get("google_search_install_referrer"));
             }
             if (hashMap.containsValue("play-auto-installs")) {
                ej4.L0(p0, hashMap);
             }
             if (hashMap.containsKey("gclid")) {
                oji5.u(hashMap.get("gclid"));
             }
          }catch(java.io.UnsupportedEncodingException e0){
             e0.printStackTrace();
          }catch(java.lang.IllegalArgumentException e0){
             e0.printStackTrace();
          }
       }
       return;
    }
    public static TypedValue F(Context p0,int p1){
       TypedValue typedValue = new TypedValue();
       if (p0.getTheme().resolveAttribute(p1, typedValue, true)) {
          return typedValue;
       }
       return null;
    }
    public static int G(int p0,Context p1,String p2){
       TypedValue typedValue;
       if ((typedValue = ox7.F(p1, p0)) != null) {
          return typedValue.data;
       }
       Object[] objArray = new Object[]{p2,p1.getResources().getResourceName(p0)};
       throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents \(or a descendant\).", objArray));
    }
    public static final void H(View p0,float p1){
       co5.o(p0, "view");
       int i = (!(p1))? 1: 0;
       if (i) {
          p0.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
          p0.setClipToOutline(false);
       }else {
          p0.setClipToOutline(true);
          p0.setOutlineProvider(new af0(true, new gz5(p1)));
       }
       return;
    }
    public static final String I(String p0){
       co5.o(p0, "locale");
       Pattern pattern = Pattern.compile("_+");
       co5.l(pattern, "compile\(pattern\)");
       Matcher matcher = pattern.matcher(p0);
       matcher = matcher.replaceAll("-");
       co5.l(matcher, "nativePattern.matcher\(in…).replaceAll\(replacement\)");
       return matcher;
    }
    public static MediaMetadataCompat J(MediaMetadataCompat p0,boolean p1){
       u44 ou44 = (p0 != null)? new u44(p0): new u44(0);
       float f = (p1)? 0x3f800000: 0;
       RatingCompat ratingCompat = new RatingCompat(f, 1);
       pk t = MediaMetadataCompat.t;
       if (t.containsKey("android.media.metadata.USER_RATING") && t.getOrDefault("android.media.metadata.USER_RATING", null).intValue() != 3) {
          throw new IllegalArgumentException("The android.media.metadata.USER_RATING key cannot be used to put a Rating");
       }else {
          u44 b = ou44.b;
          b.putParcelable("android.media.metadata.USER_RATING", ratingCompat.b());
          return new MediaMetadataCompat(b);
       }
    }
    public static Observable K(Observable p0){
       return p0.filter(new bm(26)).map(new k12(14));
    }
    public static au2 L(vt p0,zv p1,boolean p2){
       aq6 b;
       aq6 uoaq6 = td7.d(p1.b);
       aq6 uoaq61 = td7.d(p1.c);
       aq6 uoaq62 = td7.d(p1.l);
       zt2 ozt2 = ty0.b().r("title", p1.d);
       vt a = p0.a;
       if (uoaq6 != null) {
          String str = uoaq6.toString();
          ozt2 = ozt2.r("context_uri", str).r("share_uri", str);
          if (p0.b()) {
             ozt2 = ozt2.r("queue_uri", str);
          }
          if (a.b != yp6.w) {
             ozt2 = ozt2.r("track_uri", str);
          }
          if ((b = a.b) == yp6.y0) {
             ozt2 = ozt2.r("delete_uri", str);
          }
          zv j = p1.j;
          if (!te5.a(j)) {
             ozt2 = ozt2.r("image_uri", j);
          }
          j = (b != yp6.A && b != yp6.B)? 0: 1;
          if (j && p2) {
             ozt2 = ozt2.b("can_remove", p2);
          }
       }
       if (uoaq62 != null && a.b != yp6.b) {
          ozt2 = ozt2.r("artist_uri", uoaq62.toString());
       }
       if (uoaq61 != null && a.b != yp6.t) {
          ozt2 = ozt2.r("album_uri", uoaq61.toString());
       }
       return ozt2.d();
    }
    public static wp6 M(ImageView p0,he1 p1){
       wp6 tag;
       p0.getClass();
       if ((tag = p0.getTag(R.id.picasso_target)) == null) {
          tag = new wp6(p0, p1);
          p0.setTag(R.id.picasso_target, tag);
       }
       tag.c = null;
       tag.b = p1;
       return tag;
    }
    public static wp6 N(ImageView p0,ej0 p1){
       wp6 tag;
       p0.getClass();
       if ((tag = p0.getTag(R.id.picasso_target)) == null) {
          tag = new wp6(p0, new vp6(p0));
          p0.setTag(R.id.picasso_target, tag);
       }
       tag.c = p1;
       return tag;
    }
    public static Drawable O(Context p0,lp6 p1,sp6 p2,float p3,boolean p4){
       int i = (p4)? 0: uw5.k(p0, R.attr.pasteColorPlaceholderBackground);
       switch (p2.ordinal()){
           case 10:
           case 31:
           case '-':
           case 'l':
           case 'u':
           case 188:
           case 256:
           case 263:
           case 338:
             if (Float.isNaN(p3)) {
                p3 = 0x3f400000;
             }
             break;
           case 27:
           case 347:
             if (Float.isNaN(p3)) {
                p3 = 0x3f19999a;
             }
             nf0 onf0 = new nf0(p1, p3);
             onf0.a(i);
             return onf0;
             break;
           case 134:
           case 355:
             if (Float.isNaN(p3)) {
                p3 = 0x3ea8f5c3;
             }
             return new e5(p3, i, p1);
             break;
           case 249:
           case 311:
           case 335:
           case 250:
             if (Float.isNaN(p3)) {
                p3 = 0x3f28f5c3;
             }
             return new e5(p3, i, p1);
             break;
           default:
             if (!Float.isNaN(p3)) {
                e5 uoe5 = new e5(p3, i, p1);
             }
             return p1;
       }
       return new e5(p3, i, p1);
    }
    public static Observable P(Observable p0,Object p1,long p2){
       fn0 uofn0 = new fn0();
       zo0 ozo0 = p0.publish();
       ozo0.getClass();
       vq4 ovq4 = new vq4(ozo0, new vs3(8, uofn0));
       return ovq4.timeout(Observable.timer(p2, TimeUnit.MILLISECONDS, s36.b), new k12(15), ovq4.startWithItem(p1)).doOnDispose(new fj7(uofn0, 0));
    }
    public static String Q(File p0){
       if (!p0.getName().endsWith(".apk")) {
          throw new IllegalArgumentException("Non-apk found in splits directory.");
       }
       String str = "";
       String str1 = p0.getName().replaceFirst("\(_\\d+\)?\\.apk", str);
       if (str1.equals("base-master") || str1.equals("base-main")) {
          return str;
       }
       String str2 = "base-";
       if (str1.startsWith(str2)) {
          return str1.replace(str2, "config.");
       }
       return str1.replace("-", ".config.").replace(".config.master", str).replace(".config.main", str);
    }
    public static synchronized void R(Context p0){
       _monitor_enter(ox7.class);
       if (ox7.a == null && p0 != null) {
          ox7.a = p0.getApplicationContext();
          _monitor_exit(ox7.class);
          return;
       }else {
          _monitor_exit(ox7.class);
          return;
       }
    }
    public static void S(PackageManager p0,ComponentName p1){
       int componentEna;
       object oobject;
       object oobject1;
       if ((componentEna = p0.getComponentEnabledSetting(p1)) != 1) {
          int i = 2;
          if (componentEna != i) {
             String packageName = p1.getPackageName();
             String className = p1.getClassName();
             try{
                int i1 = 516;
                PackageInfo packageInfo = p0.getPackageInfo(packageName, i1);
                ComponentInfo[][] uComponentIn = new ComponentInfo[][3]{packageInfo.activities,packageInfo.services,packageInfo.providers};
                componentEna = 0;
                while (true) {
                   if (componentEna < 3) {
                      if ((oobject = uComponentIn[componentEna]) != null) {
                         int len = oobject.length;
                         int i2 = 0;
                         while (true) {
                            if (i2 < len) {
                               oobject1 = oobject[i2];
                               if (oobject1.name.equals(className)) {
                               label_0046 :
                                  if (oobject1 != null && oobject1.isEnabled()) {
                                     break ;
                                  }
                               }else {
                                  i2 = i2 + 1;
                               }
                            }
                         }
                      }
                      componentEna = componentEna + 1;
                   }else {
                      oobject1 = null;
                      goto label_0046 ;
                   }
                }
             }catch(android.content.pm.PackageManager$NameNotFoundException e0){
             }
          }
          p0.setComponentEnabledSetting(p1, 1, 1);
       }else {
       }
    }
    public static boolean T(int p0){
       if (p0 != 2 && (p0 != 7 && p0 != 3)) {
          return false;
       }
       return true;
    }
    public static boolean U(int p0,int p1){
       int i = 5;
       if (p0 == i) {
          if (p1 == i) {
             p0 = 5;
          }else {
             return 1;
          }
       }
       int i1 = 6;
       if (p0 == i1) {
          if (p1 != i1 && p1 != i) {
             return 1;
          }else {
             p0 = 6;
          }
       }
       i = 4;
       if (p0 == i && p1 != i) {
          return 1;
       }else if(p0 == 3 && (p1 == 2 && (p1 != 7 && (p1 != 1 && p1 != 8)))){
          return 1;
       }else if(p0 == 2 && (p1 == 1 && p1 != 8)){
          return 1;
       }else {
          return false;
       }
    }
    public static Drawable a(Context p0,sp6 p1,float p2,float p3){
       lp6 olp6 = new lp6(p0, p1, p3);
       olp6.b(uw5.k(p0, R.attr.pasteColorPlaceholder));
       return ox7.O(p0, olp6, p1, p2, false);
    }
    public static Drawable b(Context p0,sp6 p1,float p2,float p3){
       lp6 olp6 = new lp6(p0, p1, p3);
       olp6.b(uw5.k(p0, R.attr.pasteColorPlaceholder));
       return ox7.O(p0, olp6, p1, p2, true);
    }
    public static String c(String p0,Charset p1){
       try{
          p0.getClass();
          String str = p1.name();
          str.getClass();
          return URLEncoder.encode(p0, str);
       }catch(java.io.UnsupportedEncodingException e0){
          throw new AssertionError(e0);
       }
    }
    public static au2 d(aq6 p0,zs p1,boolean p2){
       zs b = p1.b;
       zt2 ozt2 = ty0.b().r("title", p1.d).r("subtitle", p1.e).r("context_uri", b).r("share_uri", b).r("queue_uri", b);
       if (p0.b != yp6.m0) {
          ozt2 = ozt2.r("episode_uri", b);
       }
       if ((p0 = p0.b) != yp6.l0) {
          ozt2 = ozt2.r("show_uri", p1.c);
       }
       p1 = p1.m;
       if (!te5.a(p1)) {
          ozt2 = ozt2.r("image_uri", p1);
       }
       int i = (p0 != yp6.A && p0 != yp6.B)? 0: 1;
       if (i && p2) {
          ozt2 = ozt2.b("can_remove", p2);
       }
       return ozt2.d();
    }
    public static int e(byte[] p0,int p1){
       int b;
       while (true) {
          if (p1 >= p0.length || (b = p0[p1]) == 10) {
             return -1;
          }
          if (Character.isDigit(b)) {
             b = p1 + 1;
             while (b < p0.length && Character.isDigit(p0[b])) {
                b = b + 1;
             }
             return Integer.parseInt(new String(p0, 0, p1, (b - p1)));
          }else {
             p1++;
          }
       }
    }
    public static int f(float[] p0,int[] p1,byte[] p2){
       Arrays.fill(p2, 0);
       int i = Integer.MAX_VALUE;
       int i1 = 0;
       while (i1 < 6) {
          int i2 = (int)Math.ceil((double)p0[i1]);
          p1[i1] = i2;
          if (i > i2) {
             Arrays.fill(p2, 0);
             i = i2;
          }
          if (i == i2) {
             i2 = p2[i1] + 1;
             p2[i1] = (byte)i2;
          }
          i1 = i1 + 1;
       }
       return i;
    }
    public static int g(){
       int i5;
       int i = 0;
       int i1 = -1;
       int i2 = 0;
       int i3 = -1;
       try{
          while (i2 < ox7.m()) {
             File uFile = new File("".append("/sys/devices/system/cpu/cpu").append(i2).append("/cpufreq/cpuinfo_max_freq").toString());
             if (uFile.exists() && uFile.canRead()) {
                int i4 = 128;
                byte[] uobyteArray = new byte[i4];
                try{
                   FileInputStream uFileInputSt = new FileInputStream(uFile);
                   uFileInputSt.read(uobyteArray);
                   i5 = 0;
                   while (Character.isDigit(uobyteArray[i5]) && i5 < i4) {
                      i5 = i5 + 1;
                   }
                   Integer integer = Integer.valueOf(Integer.parseInt(new String(uobyteArray, i, i5)));
                   if (integer.intValue() > i3) {
                      i3 = integer.intValue();
                   }
                   uFileInputSt.close();
                }catch(java.lang.NumberFormatException e0){
                }
             }
             i2 = i2 + 1;
          }
          try{
             if (i3 == i1) {
                FileInputStream uFileInputSt1 = new FileInputStream("/proc/cpuinfo");
                i5 = 1024;
                try{
                   byte[] uobyteArray1 = new byte[i5];
                   int i6 = uFileInputSt1.read(uobyteArray1);
                   while (true) {
                      if (i < i6) {
                         int b = uobyteArray1[i];
                         int i7 = 10;
                         if (b == i7 || !i) {
                            if (b == i7) {
                               i = i + 1;
                            }
                            b = i;
                            while (true) {
                               if (b < i6) {
                                  i7 = b - i;
                                  if (uobyteArray1[b] == "cpu MHz".charAt(i7)) {
                                     if (i7 == 6) {
                                        i = ox7.e(uobyteArray1, b);
                                     }else {
                                        b = b + 1;
                                     }
                                  }
                               }
                            }
                            return i1;
                         }
                         i = i + 1;
                      }else {
                         i = -1;
                      }
                   }
                }catch(java.io.IOException e0){
                }catch(java.lang.NumberFormatException e0){
                }
                if ((i = i * 1000) > i3) {
                   i3 = i;
                }
                uFileInputSt1.close();
             }
             i1 = i3;
          }catch(java.io.IOException e0){
          }
       }catch(java.io.IOException e0){
       }
    }
    public static String h(MediaMetadataCompat p0){
       return ox7.o(p0, "spotify.media.metadata.CONTEXT_URI");
    }
    public static int i(String p0){
       FileInputStream uFileInputSt;
       int i = -1;
       int i1 = 0;
       try{
          try{
             uFileInputSt = new FileInputStream(p0);
             BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(uFileInputSt));
             String str = uBufferedRea.readLine();
             uBufferedRea.close();
             if (str != null && str.matches("0-[\\d]+$")) {
                i = Integer.valueOf(str.substring(2)).intValue() + 1;
             }
             try{
                uFileInputSt.close();
                return e0;
             }catch(java.io.IOException e0){
             }
          }catch(java.io.IOException e0){
             InputStream inputStream = uFileInputSt;
          }
          try{
             if (i1) {
                i1.close();
             }
             return e0;
          }catch(java.io.IOException e0){
          }
       }catch(java.io.IOException e0){
       }
    }
    public static final String j(){
       return nd.a("_", Locale.getDefault());
    }
    public static final String k(Context p0){
       co5.o(p0, "context");
       return nd.a("_", is7.p(p0.getResources().getConfiguration()).c(0));
    }
    public static String l(List p0){
       String str = null;
       if (p0 != null && !p0.isEmpty()) {
          Image image = (p0.isEmpty())? str: p0.get((p0.size() - 1));
          if (image != null) {
             str = image.url;
          }
       }
       return str;
    }
    public static int m(){
       int i1;
       int i = -1;
       try{
          if ((i1 = ox7.i("/sys/devices/system/cpu/possible")) == i) {
             i1 = ox7.i("/sys/devices/system/cpu/present");
          }
          i = (i1 == i)? new File("/sys/devices/system/cpu/").listFiles(ox7.t).length: i1;
          return e0;
       }catch(java.lang.SecurityException e0){
       }catch(java.lang.NullPointerException e0){
       }
    }
    public static String n(MediaMetadataCompat p0){
       return ox7.o(p0, "spotify.media.metadata.PLAYBACK_ID");
    }
    public static String o(MediaMetadataCompat p0,String p1){
       String str = (p0 == null)? null: p0.c(p1);
       return str;
    }
    public static String p(TrackSimple p0){
       TrackSimple artists;
       String str = null;
       if (p0 == null) {
          return str;
       }
       if ((artists = p0.artists) == null || artists.isEmpty()) {
          return str;
       }
       Iterable iterable = ab2.b(p0.artists).m(new pq5(1)).c();
       iterable.getClass();
       ab2 uoab2 = ab2.b(new rd3(iterable, 3, 1));
       uoab2.getClass();
       return new xe3(new vf(", "), new vf(", ")).r(uoab2);
    }
    public static ArrayList q(View p0){
       ArrayList uArrayList = new ArrayList();
       if (p0 instanceof EditText) {
          return uArrayList;
       }
       if (p0 instanceof TextView) {
          String str = p0.getText().toString();
          int i = (str.length() > 0)? 1: 0;
          if (i && str.length() < 100) {
             str = str.toLowerCase();
             co5.l(str, "\(this as java.lang.String\).toLowerCase\(\)");
             uArrayList.add(str);
          }
          return uArrayList;
       }else {
          Iterator iterator = gi7.a(p0).iterator();
          while (iterator.hasNext()) {
             uArrayList.addAll(ox7.q(iterator.next()));
          }
          return uArrayList;
       }
    }
    public static long r(Context p0){
       ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
       p0.getSystemService("activity").getMemoryInfo(memoryInfo);
       return memoryInfo.totalMem;
    }
    public static String s(MediaMetadataCompat p0){
       return ox7.o(p0, "android.media.metadata.MEDIA_ID");
    }
    public static void t(char p0){
       String str = Integer.toHexString(p0);
       throw new IllegalArgumentException("Illegal character: "+p0+" \(0x"+"0000".substring(0, (str.length() - 4))+str+')');
    }
    public static boolean u(char p0){
       if (p0 >= 128 && p0 <= 255) {
          return true;
       }
       return false;
    }
    public static boolean v(MediaMetadataCompat p0){
       RatingCompat ratingCompat;
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       String str = "android.media.metadata.USER_RATING";
       try{
          ratingCompat = RatingCompat.a(p0.a.getParcelable(str));
       }catch(java.lang.Exception e0){
          ratingCompat = null;
       }
       if (ratingCompat != null && ratingCompat.c()) {
          b = true;
       }
       return b;
    }
    public static boolean w(char p0){
       int i = (p0 != 13 && (p0 != '*' && p0 != '>'))? 0: 1;
       if (!i && (p0 != ' ' && (p0 < '0' && (p0 <= '9' && (p0 < 'A' && p0 <= 'Z'))))) {
          return false;
       }else {
          return true;
       }
    }
    public static boolean x(Context p0){
       boolean b = true;
       if (p0.getResources().getConfiguration().getLayoutDirection() == b) {
       }else {
          b = false;
       }
       return b;
    }
    public static boolean y(View p0){
       boolean b = true;
       if (eh7.d(p0) == b) {
       }else {
          b = false;
       }
       return b;
    }
    public static int z(long p0){
       if ((p0 - 0x7fffffff) <= 0 && (p0 - -2147483648) >= 0) {
          return (int)p0;
       }
       throw new RuntimeException("A cast to int has gone wrong. Please contact the mp4parser discussion group \("+p0+"\)");
    }
}
