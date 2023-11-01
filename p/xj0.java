package p.xj0;
import p.tm0;
import p.w54;
import p.dv0;
import p.c65;
import p.xy;
import p.ps3;
import java.lang.Object;
import android.content.Context;
import android.content.ContentResolver;
import java.lang.String;
import android.provider.Settings$Secure;
import android.os.Build;
import p.bc3;
import p.my7;
import p.jv3;
import java.lang.Float;
import p.y52;
import java.lang.CharSequence;
import java.io.File;
import p.w36;
import java.util.List;
import p.av6;
import com.google.protobuf.e;
import p.rc3;
import p.h30;
import org.json.JSONObject;
import org.json.JSONArray;
import p.co5;
import java.lang.StringBuilder;
import p.md1;
import java.lang.Double;
import java.text.Normalizer$Form;
import java.text.Normalizer;
import java.lang.Thread;
import p.jl;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import java.lang.RuntimeException;
import java.lang.Integer;
import java.lang.Throwable;
import java.lang.AssertionError;
import p.db3;
import java.util.Locale;
import java.lang.IllegalArgumentException;
import android.util.Patterns;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p.sh0;
import java.util.Map;
import android.widget.FrameLayout;
import android.widget.TextView;
import p.sp6;
import android.view.View;
import p.mj5;
import p.oj5;
import android.content.res.ColorStateList;
import p.lp6;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p.v27;
import java.security.MessageDigest;
import android.util.Log;
import p.cc3;
import java.nio.charset.Charset;
import p.se7;
import p.qe7;
import p.nc7;
import p.i80;
import p.h80;
import java.lang.Long;
import java.io.ByteArrayOutputStream;
import p.pe0;
import android.util.DisplayMetrics;
import java.lang.Math;
import p.uv1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.io.Closeable;
import p.m73;
import p.k73;
import java.util.Set;
import p.dt5;
import p.wh0;
import java.lang.IllegalStateException;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import java.util.Iterator;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.Boolean;
import android.os.Debug;
import p.n6;
import android.content.pm.ApplicationInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.NullPointerException;
import android.content.Intent;
import android.text.TextUtils;
import android.content.pm.PackageManager;
import p.p80;
import p.o80;
import p.n80;
import p.m80;
import android.net.Uri;
import androidx.appcompat.app.a;
import java.lang.Enum;
import com.spotify.litesettings.settings.CellularSettingsActivity;
import p.cu;
import p.xt;
import p.ql4;
import java.util.HashSet;
import p.vv7;
import android.view.animation.PathInterpolator;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import p.xe7;
import android.content.res.TypedArray;
import p.s95;
import android.view.ViewGroup;
import p.o85;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import java.io.FileInputStream;
import java.io.InputStream;
import p.oe0;
import p.t65;
import p.q14;
import java.lang.ClassLoader;
import p.um5;

public abstract class xj0 implements tm0, w54	// class@002c88 from classes.dex
{
    public static JSONObject A;
    public static boolean B;
    public static final xy C;
    public static final ps3 D;
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final char[] a;
    public static long b;
    public static final dv0 c;
    public static final int[] t;
    public static final int[] v;
    public static final c65 w;
    public static Map x;
    public static Map y;
    public static Map z;

    static {
       xj0.a = new char[16]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
       xj0.b = -1;
       xj0.c = new dv0(5);
       int[] ointArray = new int[]{-16842910};
       xj0.t = ointArray;
       ointArray = new int[0];
       xj0.v = ointArray;
       xj0.w = new c65(17);
       xj0.C = new xy();
       xj0.D = new ps3(27);
       ointArray = new int[]{0x10100c4};
       xj0.E = ointArray;
       xj0.F = new int[2]{0x7f03032f,0x7f0305c5};
       xj0.G = new int[7]{0x10100b3,0x7f03033c,0x7f03033d,0x7f03033e,0x7f03036f,0x7f03037d,0x7f03037e};
    }
    public void xj0(){
       super();
    }
    public static long A(byte[] p0,int p1){
       return ((((long)p0[(p1 + 7)] & 255) << 56) | ((((((((long)p0[p1] & 255) | (((long)p0[(p1 + 1)] & 255) << 8)) | (((long)p0[(p1 + 2)] & 255) << 16)) | (((long)p0[(p1 + 3)] & 255) << 24)) | (((long)p0[(p1 + 4)] & 255) << 32)) | (((long)p0[(p1 + 5)] & 255) << 40)) | (((long)p0[(p1 + 6)] & 255) << 48)));
    }
    public static boolean A0(Context p0){
       String str = Settings$Secure.getString(p0.getContentResolver(), "android_id");
       String pRODUCT = Build.PRODUCT;
       boolean b = (!"sdk".equals(pRODUCT) && (!"google_sdk".equals(pRODUCT) && str != null))? false: true;
       return b;
    }
    public static int B(int p0,byte[] p1,int p2,int p3,bc3 p4,my7 p5){
       p4.c(xj0.A(p1, p2));
       for (p2 = p2 + 8; p2 < p3; p2 = i + 8) {
          int i = xj0.Y(p1, p2, p5);
          if (p0 != p5.a) {
             break ;
          }else {
             p4.c(xj0.A(p1, i));
          }
       }
       return p2;
    }
    public static boolean B0(byte p0){
       boolean b = (p0 > -65)? true: false;
       return b;
    }
    public static float C(byte[] p0,int p1){
       return Float.intBitsToFloat(xj0.y(p0, p1));
    }
    public static boolean C0(String p0){
       boolean b = (p0 != null && p0.length())? false: true;
       return b;
    }
    public static int D(int p0,byte[] p1,int p2,int p3,bc3 p4,my7 p5){
       p4.c(Float.intBitsToFloat(xj0.y(p1, p2)));
       for (p2 = p2 + 4; p2 < p3; p2 = i + 4) {
          int i = xj0.Y(p1, p2, p5);
          if (p0 != p5.a) {
             break ;
          }else {
             p4.c(Float.intBitsToFloat(xj0.y(p1, i)));
          }
       }
       return p2;
    }
    public static boolean D0(Context p0){
       boolean b = xj0.A0(p0);
       String tAGS = Build.TAGS;
       if (!b && (tAGS != null && tAGS.contains("test-keys"))) {
          return true;
       }
       if (new File("/system/app/Superuser.apk").exists()) {
          return true;
       }
       File uFile = new File("/system/xbin/su");
       if (!b && uFile.exists()) {
          return true;
       }
       return false;
    }
    public static int E(w36 p0,int p1,byte[] p2,int p3,int p4,bc3 p5,my7 p6){
       int i = (p1 & 0xf8) | 0x04;
       Object obj = p0.i();
       p0.d(obj);
       p6.c = obj;
       p5.add(obj);
       for (p3 = xj0.F0(obj, p0, p2, p3, p4, i, p6); p3 < p4; obj1 = xj0.F0(obj1, p0, p2, i1, p4, i, p6)) {
          int i1 = xj0.Y(p2, p3, p6);
          if (p1 != p6.a) {
             break ;
          }else {
             Object obj1 = p0.i();
             p0.d(obj1);
             p6.c = obj1;
             p5.add(obj1);
          }
       }
       return p3;
    }
    public static boolean E0(String[] p0,String[] p1){
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i < len) {
             object oobject = p0[i];
             i = i + 1;
             int len1 = p1.length;
             int i1 = 0;
             while (true) {
                if (i1 < len1) {
                   i1 = i1 + 1;
                   if (av6.f0(p1[i1], oobject)) {
                      return true;
                   }
                }else {
                   continue ;
                }
             }
             return false;
          }else {
          }
       }
    }
    public static int F(w36 p0,byte[] p1,int p2,int p3,my7 p4){
       Object obj = p0.i();
       p0.d(obj);
       p4.c = obj;
       return xj0.G0(obj, p0, p1, p2, p3, p4);
    }
    public static int F0(Object p0,w36 p1,byte[] p2,int p3,int p4,int p5,my7 p6){
       p6.c = p0;
       return p1.J(p0, p2, p3, p4, p5, p6);
    }
    public static int G(w36 p0,int p1,byte[] p2,int p3,int p4,bc3 p5,my7 p6){
       p3 = xj0.F(p0, p2, p3, p4, p6);
       p5.add(p6.c);
       while (p3 < p4) {
          int i = xj0.Y(p2, p3, p6);
          if (p1 != p6.a) {
             break ;
          }else {
             p3 = xj0.F(p0, p2, i, p4, p6);
             p5.add(p6.c);
          }
       }
       return p3;
    }
    public static int G0(Object p0,w36 p1,byte[] p2,int p3,int p4,my7 p5){
       byte b;
       int i = p3 + 1;
       if ((b = p2[p3]) < 0) {
          i = xj0.X(b, p2, i, p5);
          b = p5.a;
       }
       int i1 = i;
       if (b >= null && b <= (p4 - i1)) {
          b = b + i1;
          p1.b(p0, p2, i1, b, p5);
          p5.c = p0;
          return b;
       }else {
          throw rc3.g();
       }
    }
    public static int H(byte[] p0,int p1,bc3 p2,my7 p3){
       p1 = xj0.Y(p0, p1, p3);
       int i = p3.a + p1;
       while (p1 < i) {
          p1 = xj0.a0(p0, p1, p3);
          boolean b = (p3.b)? true: false;
          p2.c(b);
       }
       if (p1 == i) {
          return p1;
       }
       throw rc3.g();
    }
    public static float[] H0(JSONObject p0,JSONArray p1,String p2,String p3,String p4){
       int i2;
       int i = 30;
       float[] uofloatArray = new float[i];
       int i1 = 0;
       while (true) {
          i2 = 0;
          if (i1 < i) {
             uofloatArray[i1] = i2;
             i1 = i1 + 1;
          }else {
             break ;
          }
       }
       i = p1.length();
       i1 = 1;
       float f = (i > i1)? (float)i - 0x3f800000: 0;
       uofloatArray[3] = f;
       try{
          if ((i = p1.length()) > 0) {
             int i7 = 0;
             while (true) {
                int i8 = i7 + 1;
                JSONObject jSONObject = p1.getJSONObject(i7);
                co5.l(jSONObject, "siblings.getJSONObject\(i\)");
                i7 = jSONObject.optInt("classtypebitmask") & i1;
                if ((i7 = i7 << 5) > 0) {
                   jSONObject = 1;
                label_003e :
                   if (jSONObject) {
                      i7 = 9;
                      float f1 = uofloatArray[i7] + 0x3f800000;
                      uofloatArray[i7] = f1;
                   }
                   if (i8 < i) {
                      i7 = i8;
                   }
                }else {
                   jSONObject = 0;
                   goto label_003e ;
                }
             }
          }
       }catch(org.json.JSONException e0){
       }
       uofloatArray[13] = 0xbf800000;
       uofloatArray[14] = 0xbf800000;
       String str = p2+'|'+p4;
       p2 = "";
       p4 = "";
       xj0.S0(p0, p4, p2);
       String str1 = p2;
       co5.l(str1, "hintSB.toString\(\)");
       p2 = p4;
       co5.l(p2, "textSB.toString\(\)");
       p4 = "COMPLETE_REGISTRATION";
       int i3 = (xj0.N0(p4, "BUTTON_TEXT", p2))? 0x3f800000: 0;
       uofloatArray[15] = i3;
       i1 = (xj0.N0(p4, "PAGE_TITLE", str))? 0x3f800000: 0;
       uofloatArray[16] = i1;
       int i4 = (xj0.N0(p4, "BUTTON_ID", str1))? 0x3f800000: 0;
       uofloatArray[17] = i4;
       i4 = (av6.f0(p3, "password"))? 0x3f800000: 0;
       uofloatArray[18] = i4;
       i4 = (xj0.M0("\(?i\)\(confirm.*password\)|\(password.*\(confirmation|confirm\)|confirmation\)", p3))? 0x3f800000: 0;
       uofloatArray[19] = i4;
       i4 = (xj0.M0("\(?i\)\(sign in\)|login|signIn", p3))? 0x3f800000: 0;
       uofloatArray[20] = i4;
       i4 = (xj0.M0("\(?i\)\(sign.*\(up|now\)|registration|register|\(create|apply\).*\(profile|account\)|open.*account|account.*\(open|creation|application\)|enroll|join.*now\)", p3))? 0x3f800000: 0;
       uofloatArray[21] = i4;
       str1 = "PURCHASE";
       int i5 = (xj0.N0(str1, "BUTTON_TEXT", p2))? 0x3f800000: 0;
       uofloatArray[22] = i5;
       i4 = (xj0.N0(str1, "PAGE_TITLE", str))? 0x3f800000: 0;
       uofloatArray[24] = i4;
       i4 = (xj0.M0("\(?i\)add to\(\\s|\\Z\)|update\(\\s|\\Z\)|cart", p2))? 0x3f800000: 0;
       uofloatArray[25] = i4;
       i4 = (xj0.M0("\(?i\)add to\(\\s|\\Z\)|update\(\\s|\\Z\)|cart|shop|buy", str))? 0x3f800000: 0;
       uofloatArray[27] = i4;
       str1 = "LEAD";
       int i6 = (xj0.N0(str1, "BUTTON_TEXT", p2))? 0x3f800000: 0;
       uofloatArray[28] = i6;
       if (xj0.N0(str1, "PAGE_TITLE", str)) {
          i2 = 0x3f800000;
       }
       uofloatArray[29] = i2;
       return uofloatArray;
    }
    public static int I(byte[] p0,int p1,bc3 p2,my7 p3){
       p1 = xj0.Y(p0, p1, p3);
       int i = p3.a + p1;
       for (; p1 < i; p1 = p1 + 8) {
          p2.c(Double.longBitsToDouble(xj0.A(p0, p1)));
       }
       if (p1 == i) {
          return p1;
       }
       throw rc3.g();
    }
    public static String I0(String p0){
       String str = "";
       String str1 = "[^\\x20-\\x7E]";
       try{
          return Normalizer.normalize(p0, Normalizer$Form.NFKD).replaceAll(str1, str);
       }catch(java.lang.AssertionError e2){
          long l = 100;
          try{
             Thread.sleep(l);
             try{
                jl.d("normalize worked after sleeping");
                return Normalizer.normalize(p0, Normalizer$Form.NFKD).replaceAll(str1, e0);
             }catch(java.lang.AssertionError e0){
                try{
                   Class uClass = Class.forName("libcore.icu.NativeNormalizer$1");
                   Field declaredFiel = uClass.getDeclaredField("$SwitchMap$java$text$Normalizer$Form");
                   declaredFiel.setAccessible(true);
                   int[] ointArray = declaredFiel.get(uClass);
                   Object[] objArray = new Object[]{Integer.valueOf(ointArray[0]),Integer.valueOf(ointArray[1]),Integer.valueOf(ointArray[2]),Integer.valueOf(ointArray[3])};
                   throw new RuntimeException(String.format("switchmap overwritten? 0x%08x,0x%08x,0x%08x,0x%08x", objArray), e2);
                }catch(java.lang.ClassNotFoundException e7){
                   throw new AssertionError(e7);
                }catch(java.lang.NoSuchFieldException e7){
                   throw new AssertionError(e7);
                }catch(java.lang.IllegalAccessException e7){
                   throw new AssertionError(e7);
                }
             }
          }catch(java.lang.InterruptedException e0){
          }
       }
    }
    public static int J(byte[] p0,int p1,bc3 p2,my7 p3){
       p1 = xj0.Y(p0, p1, p3);
       int i = p3.a + p1;
       for (; p1 < i; p1 = p1 + 4) {
          p2.c(xj0.y(p0, p1));
       }
       if (p1 == i) {
          return p1;
       }
       throw rc3.g();
    }
    public static String J0(int p0){
       if (p0 < 0) {
          throw new IllegalArgumentException("value must be zero or greater");
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0)};
       return String.format(Locale.US, "%1$10s", objArray).replace(' ', '0');
    }
    public static int K(byte[] p0,int p1,bc3 p2,my7 p3){
       p1 = xj0.Y(p0, p1, p3);
       int i = p3.a + p1;
       for (; p1 < i; p1 = p1 + 8) {
          p2.c(xj0.A(p0, p1));
       }
       if (p1 == i) {
          return p1;
       }
       throw rc3.g();
    }
    public static float[] K0(JSONObject p0){
       String[] stringArray1;
       int i4;
       int i = 30;
       float[] uofloatArray = new float[i];
       int i1 = 0;
       for (int i2 = 0; i2 < i; i2 = i2 + 1) {
          uofloatArray[i2] = 0;
       }
       String str = p0.optString("text");
       co5.l(str, "node.optString\(TEXT_KEY\)");
       str = str.toLowerCase();
       co5.l(str, "\(this as java.lang.String\).toLowerCase\(\)");
       String str1 = p0.optString("hint");
       co5.l(str1, "node.optString\(HINT_KEY\)");
       str1 = str1.toLowerCase();
       co5.l(str1, "\(this as java.lang.String\).toLowerCase\(\)");
       String str2 = p0.optString("classname");
       co5.l(str2, "node.optString\(CLASS_NAME_KEY\)");
       str2 = str2.toLowerCase();
       co5.l(str2, "\(this as java.lang.String\).toLowerCase\(\)");
       i2 = p0.optInt("inputtype", -1);
       int i3 = 2;
       String[] stringArray = new String[i3];
       stringArray[i1] = str;
       stringArray[1] = str1;
       if (stringArray1 = new String[]{"$","amount","price","total"}) {
          uofloatArray[i1] = uofloatArray[i1] + 0x3f800000;
       }
       if (stringArray1 = new String[]{"password","pwd"}) {
          uofloatArray[1] = uofloatArray[1] + 0x3f800000;
       }
       if (stringArray1 = new String[]{"tel","phone"}) {
          uofloatArray[i3] = uofloatArray[i3] + 0x3f800000;
       }
       if (stringArray1 = new String[]{"search"}) {
          i4 = 4;
          uofloatArray[i4] = uofloatArray[i4] + 0x3f800000;
       }
       if (i2 >= 0) {
          i4 = 5;
          uofloatArray[i4] = uofloatArray[i4] + 0x3f800000;
       }
       if (i2 == 3 || i2 == i3) {
          i4 = 6;
          uofloatArray[i4] = uofloatArray[i4] + 0x3f800000;
       }
       if (i2 == 32 || Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
          i2 = 7;
          uofloatArray[i2] = uofloatArray[i2] + 0x3f800000;
       }
       if (av6.f0(str2, "checkbox")) {
          i2 = 8;
          uofloatArray[i2] = uofloatArray[i2] + 0x3f800000;
       }
       String[] stringArray2 = new String[]{"complete","confirm","done","submit"};
       stringArray1 = new String[]{str};
       if (xj0.E0(stringArray2, stringArray1)) {
          i = 10;
          uofloatArray[i] = uofloatArray[i] + 0x3f800000;
       }
       if (av6.f0(str2, "radio") && av6.f0(str2, "button")) {
          i = 12;
          uofloatArray[i] = uofloatArray[i] + 0x3f800000;
       }
       try{
          JSONArray jSONArray = p0.optJSONArray("childviews");
          if ((i = jSONArray.length()) > 0) {
             while (true) {
                i2 = i1 + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i1);
                co5.l(jSONObject, "childViews.getJSONObject\(i\)");
                xj0.R0(uofloatArray, xj0.K0(jSONObject));
                if (i2 < i) {
                   i1 = i2;
                }
             }
          }
          return uofloatArray;
       }catch(org.json.JSONException e0){
       }
    }
    public static int L(byte[] p0,int p1,bc3 p2,my7 p3){
       p1 = xj0.Y(p0, p1, p3);
       int i = p3.a + p1;
       for (; p1 < i; p1 = p1 + 4) {
          p2.c(Float.intBitsToFloat(xj0.y(p0, p1)));
       }
       if (p1 == i) {
          return p1;
       }
       throw rc3.g();
    }
    public static boolean L0(JSONObject p0,JSONArray p1){
       boolean i1;
       int i3;
       int i4;
       int i6;
       String str = "childviews";
       String str1 = "is_interacted";
       int i = 0;
       try{
          if (p0.optBoolean(str1)) {
             return true;
          }
          JSONArray jSONArray = p0.optJSONArray(str);
          if ((i1 = jSONArray.length()) > 0) {
             int i2 = 0;
             while (true) {
                i3 = i2 + 1;
                if (jSONArray.getJSONObject(i2).optBoolean(str1)) {
                   str1 = 1;
                   i1 = true;
                   break ;
                }else if(i3 >= i1){
                   i2 = i3;
                }
             }
             JSONArray jSONArray1 = new JSONArray();
             if (str1) {
                if ((i4 = jSONArray.length()) > 0) {
                   int i5 = 0;
                   while (true) {
                      i6 = i5 + 1;
                      p1.put(jSONArray.getJSONObject(i5));
                      if (i6 < i4) {
                         i5 = i6;
                      }
                   }
                }
             }else if((i6 = jSONArray.length()) > 0){
                i3 = 0;
                while (true) {
                   int i7 = i3 + 1;
                   JSONObject jSONObject = jSONArray.getJSONObject(i3);
                   co5.l(jSONObject, "child");
                   if (xj0.L0(jSONObject, p1)) {
                      jSONArray1.put(jSONObject);
                      i1 = true;
                      break ;
                   }else if(i7 >= i6){
                      i3 = i7;
                   }
                }
             }
             p0.put(str, jSONArray1);
             return i1;
          }
          i6 = 0;
          i1 = false;
       }catch(org.json.JSONException e0){
          return i;
       }
    }
    public static int M(byte[] p0,int p1,bc3 p2,my7 p3){
       p1 = xj0.Y(p0, p1, p3);
       int i = p3.a + p1;
       while (p1 < i) {
          p1 = xj0.Y(p0, p1, p3);
          p2.c(sh0.b(p3.a));
       }
       if (p1 == i) {
          return p1;
       }
       throw rc3.g();
    }
    public static boolean M0(String p0,String p1){
       return Pattern.compile(p0).matcher(p1).find();
    }
    public static int N(byte[] p0,int p1,bc3 p2,my7 p3){
       p1 = xj0.Y(p0, p1, p3);
       int i = p3.a + p1;
       while (p1 < i) {
          p1 = xj0.a0(p0, p1, p3);
          p2.c(sh0.c(p3.b));
       }
       if (p1 == i) {
          return p1;
       }
       throw rc3.g();
    }
    public static boolean N0(String p0,String p1,String p2){
       JSONObject jSONObject;
       Map z;
       Map y;
       JSONObject a = xj0.A;
       String str = null;
       if (a != null) {
          if ((a = a.optJSONObject("rulesForLanguage")) == null) {
             a = str;
          }else if((y = xj0.x) != null){
             a = a.optJSONObject(y.get("ENGLISH"));
          }else {
             co5.N("languageInfo");
             throw str;
          }
          if (a == null || (a = a.optJSONObject("rulesForEvent")) == null) {
             jSONObject = str;
          }else if((y = xj0.y) != null){
             jSONObject = a.optJSONObject(y.get(p0));
          }else {
             co5.N("eventInfo");
             throw str;
          }
          if (jSONObject != null && (jSONObject = jSONObject.optJSONObject("positiveRules")) != null) {
             if ((z = xj0.z) != null) {
                str = jSONObject.optString(z.get(p1));
             }else {
                co5.N("textTypeInfo");
                throw str;
             }
          }
          boolean b = (str == null)? false: xj0.M0(str, p2);
          return b;
       }else {
          co5.N("rules");
          throw str;
       }
    }
    public static int O(byte[] p0,int p1,bc3 p2,my7 p3){
       p1 = xj0.Y(p0, p1, p3);
       int i = p3.a + p1;
       while (p1 < i) {
          p1 = xj0.Y(p0, p1, p3);
          p2.c(p3.a);
       }
       if (p1 == i) {
          return p1;
       }
       throw rc3.g();
    }
    public static void O0(FrameLayout p0,TextView p1,sp6 p2){
       oj5.a(p0).a();
       Context context = p1.getContext();
       lp6 olp6 = new lp6(context, p2, (float)xj0.e0(24.00f, context.getResources()));
       olp6.b(p1.getTextColors().getDefaultColor());
       v27.g(p1, olp6, null, null, null);
    }
    public static int P(byte[] p0,int p1,bc3 p2,my7 p3){
       p1 = xj0.Y(p0, p1, p3);
       int i = p3.a + p1;
       while (p1 < i) {
          p1 = xj0.a0(p0, p1, p3);
          p2.c(p3.b);
       }
       if (p1 == i) {
          return p1;
       }
       throw rc3.g();
    }
    public static String P0(String p0){
       String str = "SHA-1";
       byte[] bytes = p0.getBytes();
       try{
          MessageDigest instance = MessageDigest.getInstance(str);
          instance.update(bytes);
          bytes = xj0.v0(instance.digest());
       }catch(java.security.NoSuchAlgorithmException e2){
          Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e2);
          bytes = "";
       }
       return bytes;
    }
    public static int Q(int p0,byte[] p1,int p2,int p3,bc3 p4,my7 p5){
       p2 = xj0.Y(p1, p2, p5);
       p4.c(sh0.b(p5.a));
       while (p2 < p3) {
          int i = xj0.Y(p1, p2, p5);
          if (p0 != p5.a) {
             break ;
          }else {
             p2 = xj0.Y(p1, i, p5);
             p4.c(sh0.b(p5.a));
          }
       }
       return p2;
    }
    public static int Q0(int p0,byte[] p1,int p2,int p3,my7 p4){
       int i;
       my7 a;
       if (!((p0 >> 3))) {
          throw rc3.a();
       }
       if (!(i = p0 & 0x07)) {
          return xj0.a0(p1, p2, p4);
       }
       if (i == 1) {
          return (p2 + 8);
       }
       if (i == 2) {
          return (xj0.Y(p1, p2, p4) + p4.a);
       }
       if (i != 3) {
          if (i == 5) {
             return (p2 + 4);
          }
          throw rc3.a();
       }else {
          p0 = (p0 & 0xf8) | 0x04;
          i = 0;
          for (; p2 < p3; p2 = xj0.Q0(a, p1, p2, p3, p4)) {
             p2 = xj0.Y(p1, p2, p4);
             if ((a = p4.a) == p0) {
                break ;
             }else {
             }
          }
          if (p2 <= p3 && a == p0) {
             return p2;
          }
          throw rc3.f();
       }
    }
    public static int R(int p0,byte[] p1,int p2,int p3,bc3 p4,my7 p5){
       p2 = xj0.a0(p1, p2, p5);
       p4.c(sh0.c(p5.b));
       while (p2 < p3) {
          int i = xj0.Y(p1, p2, p5);
          if (p0 != p5.a) {
             break ;
          }else {
             p2 = xj0.a0(p1, i, p5);
             p4.c(sh0.c(p5.b));
          }
       }
       return p2;
    }
    public static void R0(float[] p0,float[] p1){
       int i;
       if ((i = p0.length - 1) >= 0) {
          int i1 = 0;
          while (true) {
             int i2 = i1 + 1;
             float f = p0[i1] + p1[i1];
             p0[i1] = f;
             if (i2 <= i) {
                i1 = i2;
             }
          }
       }
       return;
    }
    public static int S(byte[] p0,int p1,my7 p2){
       my7 a;
       p1 = xj0.Y(p0, p1, p2);
       if ((a = p2.a) < null) {
          throw rc3.e();
       }
       if (a == null) {
          p2.c = "";
          return p1;
       }else {
          p2.c = new String(p0, p1, a, cc3.a);
          return (p1 + a);
       }
    }
    public static void S0(JSONObject p0,StringBuilder p1,StringBuilder p2){
       JSONArray jSONArray;
       int i3;
       int i4;
       String str = p0.optString("text", "");
       co5.l(str, "view.optString\(TEXT_KEY, \"\"\)");
       str = str.toLowerCase();
       co5.l(str, "\(this as java.lang.String\).toLowerCase\(\)");
       String str1 = p0.optString("hint", "");
       co5.l(str1, "view.optString\(HINT_KEY, \"\"\)");
       str1 = str1.toLowerCase();
       co5.l(str1, "\(this as java.lang.String\).toLowerCase\(\)");
       int i = 1;
       int i1 = 0;
       int i2 = (str.length() > 0)? 1: 0;
       if (i2) {
          p1 = p1+str+" ";
       }
       if (str1.length() <= 0) {
          i = 0;
       }
       if (i) {
          p2 = p2+str1+" ";
       }
       if ((jSONArray = p0.optJSONArray("childviews")) == null) {
          return;
       }else if((i3 = jSONArray.length()) > 0){
          while (true) {
             i4 = i1 + 1;
             break ;
          }
          try{
             JSONObject jSONObject = jSONArray.getJSONObject(i1);
             co5.l(jSONObject, "currentChildView");
             xj0.S0(jSONObject, p1, p2);
          }catch(org.json.JSONException e0){
          }
          if (i4 < e0) {
             i1 = i4;
          }
       }
       return;
    }
    public static int T(int p0,byte[] p1,int p2,int p3,bc3 p4,my7 p5){
       my7 a;
       p2 = xj0.Y(p1, p2, p5);
       if ((a = p5.a) < null) {
          throw rc3.e();
       }
       if (a == null) {
          p4.add("");
          while (p2 < p3) {
             int i = xj0.Y(p1, p2, p5);
             if (p0 != p5.a) {
                break ;
             }else {
                p2 = xj0.Y(p1, i, p5);
                if ((a = p5.a) >= null) {
                   if (a == null) {
                      p4.add("");
                   }else {
                      p4.add(new String(p1, p2, a, cc3.a));
                   }
                }else {
                   throw rc3.e();
                }
             }
          }
          return p2;
       }else {
          p4.add(new String(p1, p2, a, cc3.a));
       }
       p2 = p2 + a;
    }
    public static int U(int p0,byte[] p1,int p2,int p3,bc3 p4,my7 p5){
       my7 a;
       int i1;
       p2 = xj0.Y(p1, p2, p5);
       if ((a = p5.a) < null) {
          throw rc3.e();
       }
       if (a == null) {
          p4.add("");
          while (p2 < p3) {
             int i = xj0.Y(p1, p2, p5);
             if (p0 != p5.a) {
                break ;
             }else {
                p2 = xj0.Y(p1, i, p5);
                if ((a = p5.a) >= null) {
                   if (a == null) {
                      p4.add("");
                   }else {
                      i1 = p2 + a;
                      if (se7.e(p1, p2, i1)) {
                         p4.add(new String(p1, p2, a, cc3.a));
                      }else {
                         throw rc3.b();
                      }
                   }
                }else {
                   throw rc3.e();
                }
             }
          }
          return p2;
       }else {
          i1 = p2 + a;
          if (se7.e(p1, p2, i1)) {
             p4.add(new String(p1, p2, a, cc3.a));
          }else {
             throw rc3.b();
          }
       }
       p2 = i1;
    }
    public static int V(byte[] p0,int p1,my7 p2){
       my7 a;
       p1 = xj0.Y(p0, p1, p2);
       if ((a = p2.a) < null) {
          throw rc3.e();
       }
       if (a == null) {
          p2.c = "";
          return p1;
       }else {
          p2.c = se7.a.n0(p0, p1, a);
          return (p1 + a);
       }
    }
    public static int W(int p0,byte[] p1,int p2,int p3,nc7 p4,my7 p5){
       int i;
       my7 a;
       my7 omy7;
       my7 a1;
       if (!((p0 >> 3))) {
          throw rc3.a();
       }
       if (i = p0 & 0x07) {
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   if (i == 5) {
                      p4.f(p0, Integer.valueOf(xj0.y(p1, p2)));
                      return (p2 + 4);
                   }else {
                      throw rc3.a();
                   }
                }else {
                   nc7 onc7 = new nc7();
                   int i1 = (p0 & 0xf8) | 0x04;
                   i = 0;
                   for (; p2 < p3; a = xj0.W(a, p1, i2, p3, onc7, p5)) {
                      int i2 = xj0.Y(p1, p2, p5);
                      if ((a = p5.a) == i1) {
                         omy7 = a;
                         a = i2;
                         break ;
                      }
                      omy7 = a;
                   }
                   if (a <= p3 && omy7 == i1) {
                      p4.f(p0, onc7);
                      return a;
                   }else {
                      throw rc3.f();
                   }
                }
             }else {
                p2 = xj0.Y(p1, p2, p5);
                if ((a1 = p5.a) < null) {
                   throw rc3.e();
                }
                if (a1 > (p1.length - p2)) {
                   throw rc3.g();
                }
                if (a1 == null) {
                   p4.f(p0, i80.b);
                }else {
                   p4.f(p0, i80.c(p1, p2, a1));
                }
                return (p2 + a1);
             }
          }else {
             p4.f(p0, Long.valueOf(xj0.A(p1, p2)));
             return (p2 + 8);
          }
       }else {
          p4.f(p0, Long.valueOf(p5.b));
          return xj0.a0(p1, p2, p5);
       }
    }
    public static int X(int p0,byte[] p1,int p2,my7 p3){
       byte b;
       p0 = p0 & 0x7f;
       int i = p2 + 1;
       if ((b = p1[p2]) >= 0) {
          p3.a = p0 | (b << 7);
          return i;
       }else {
          p0 = p0 | ((b & 0x7f) << 7);
          b = i + 1;
          if ((i = p1[i]) >= 0) {
             p3.a = p0 | (i << 14);
             return b;
          }else {
             p0 = p0 | ((i & 0x7f) << 14);
             i = b + 1;
             if ((b = p1[b]) >= 0) {
                p3.a = p0 | (b << 21);
                return i;
             }else {
                p0 = p0 | ((b & 0x7f) << 21);
                b = i + 1;
                if ((i = p1[i]) >= 0) {
                   p3.a = p0 | (i << 28);
                   return b;
                }else {
                   p0 = p0 | ((i & 0x7f) << 28);
                   while (true) {
                      i = b + 1;
                      if (p1[b] < 0) {
                         b = i;
                      }else {
                         break ;
                      }
                   }
                   p3.a = p0;
                   return i;
                }
             }
          }
       }
    }
    public static int Y(byte[] p0,int p1,my7 p2){
       byte b;
       int i = p1 + 1;
       if ((b = p0[p1]) < 0) {
          return xj0.X(b, p0, i, p2);
       }
       p2.a = b;
       return i;
    }
    public static int Z(int p0,byte[] p1,int p2,int p3,bc3 p4,my7 p5){
       p2 = xj0.Y(p1, p2, p5);
       p4.c(p5.a);
       while (p2 < p3) {
          int i = xj0.Y(p1, p2, p5);
          if (p0 != p5.a) {
             break ;
          }else {
             p2 = xj0.Y(p1, i, p5);
             p4.c(p5.a);
          }
       }
       return p2;
    }
    public static int a0(byte[] p0,int p1,my7 p2){
       byte i = p1 + 1;
       long l = (long)p0[p1];
       if ((l) >= 0) {
          p2.b = l;
          return i;
       }else {
          p1 = i + 1;
          i = p0[i];
          l = (l & 127) | ((long)(i & 0x7f) << 7);
          int i1 = 7;
          while (i < 0) {
             i = p1 + 1;
             byte b = p0[p1];
             i1 = i1 + 7;
             int i2 = b & 0x7f;
             long l1 = (long)i2 << i1;
             l = l | l1;
             int i3 = i;
             i = b;
             b = i3;
          }
          p2.b = l;
          return p1;
       }
    }
    public static int b0(int p0,byte[] p1,int p2,int p3,bc3 p4,my7 p5){
       p2 = xj0.a0(p1, p2, p5);
       p4.c(p5.b);
       while (p2 < p3) {
          int i = xj0.Y(p1, p2, p5);
          if (p0 != p5.a) {
             break ;
          }else {
             p2 = xj0.a0(p1, i, p5);
             p4.c(p5.b);
          }
       }
       return p2;
    }
    public static String c0(String p0,String p1){
       int i = 0;
       jl.a(Integer.valueOf(i), Integer.valueOf((p0.length() % 2)));
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       for (; i < p0.length(); i = i1) {
          int i1 = i + 2;
          i = Integer.parseInt(p1.substring(i, i1), 16) ^ Integer.parseInt(p0.substring(i, i1), 16);
          uByteArrayOu.write(i);
       }
       return new String(uByteArrayOu.toByteArray(), pe0.c);
    }
    public static int d0(float p0,Resources p1){
       return (int)(p0 * p1.getDisplayMetrics().density);
    }
    public static void e(byte p0,byte p1,byte p2,byte p3,char[] p4,int p5){
       if (xj0.B0(p1) || (((((p1 + 112) + (p0 << 28)) >> 30)) || (xj0.B0(p2) || xj0.B0(p3)))) {
          throw rc3.b();
       }
       int i = ((((p0 & 0x07) << 18) | ((p1 & 0x3f) << 12)) | ((p2 & 0x3f) << 6)) | (p3 & 0x3f);
       p4[p5] = (char)((i >> 10) + 0xd7c0);
       p5++;
       p4[p5] = (char)((i & 0x03ff) + 0xdc00);
       return;
    }
    public static int e0(float p0,Resources p1){
       int i;
       if (i = Math.round((p1.getDisplayMetrics().density * p0))) {
          return i;
       }
       if (!(p0 = 0 - p0)) {
          return 0;
       }
       if (p0 > 0) {
          return 1;
       }
       return -1;
    }
    public static void f(byte p0,byte p1,char[] p2,int p3){
       if (p0 < -62 || xj0.B0(p1)) {
          throw rc3.b();
       }
       p2[p3] = (char)(((p0 & 0x1f) << 6) | (p1 & 0x3f));
       return;
    }
    public static String f0(i80 p0){
       int b;
       uv1 ouv1 = new uv1(21, p0);
       StringBuilder str = new StringBuilder(ouv1.p());
       int i = 0;
       while (i < ouv1.p()) {
          if ((b = ouv1.b.a(i)) != 34) {
             if (b != 39) {
                char c = '\';
                if (b != c) {
                   switch (b){
                       case 7:
                         str = str.append("\\a");
                         break;
                       case 8:
                         str = str.append("\\b");
                         break;
                       case 9:
                         str = str.append("\\t");
                         break;
                       case 10:
                         str = str.append("\\n");
                         break;
                       case 11:
                         str = str.append("\\v");
                         break;
                       case 12:
                         str = str.append("\\f");
                         break;
                       case 13:
                         str = str.append("\\r");
                         break;
                       default:
                         if (b >= 32 && b <= 126) {
                            str = str.append((char)b);
                         }else {
                            int i1 = b >> 6;
                            i1 = i1 & 0x03;
                            i1 = i1 + 48;
                            i1 = b >> 3;
                            i1 = i1 & 0x07;
                            i1 = i1 + 48;
                            b = b & 0x07;
                            b = b + 48;
                            str = str.append(c).append((char)i1).append((char)i1).append((char)b);
                         }
                   }
                }else {
                   str = str.append("\\\\");
                }
             }else {
                str = str.append("\\\'");
             }
          }else {
             str = str.append("\\\"");
          }
          i = i + 1;
       }
       return str;
    }
    public static void g(byte p0,byte p1,byte p2,char[] p3,int p4){
       if (xj0.B0(p1) || (p0 == -32 || (p1 >= -96 || (p0 == -19 || (p1 < -96 && !xj0.B0(p2)))))) {
          throw rc3.b();
       }
       p3[p4] = (char)((((p0 & 0x0f) << 12) | ((p1 & 0x3f) << 6)) | (p2 & 0x3f));
       return;
    }
    public static String g0(File p0){
       BufferedReader uBufferedRea;
       String str1;
       String str = null;
       if (p0.exists()) {
          try{
             uBufferedRea = new BufferedReader(new FileReader(p0), 1024);
             try{
                while (true) {
                   if ((str1 = uBufferedRea.readLine()) != null) {
                      String[] stringArray = Pattern.compile("\\s*:\\s*").split(str1, 2);
                      if (stringArray.length > 1 && stringArray[0].equals("MemTotal")) {
                         str = stringArray[1];
                      }
                   }
                   xj0.l(uBufferedRea, "Failed to close system file reader.");
                   break ;
                }
             }catch(java.lang.Exception e0){
             }
             Log.e("FirebaseCrashlytics", "Error parsing "+p0, e0);
          }catch(java.lang.Exception e0){
             uBufferedRea = str;
          }
       }
       return str;
    }
    public static m73 h(Map p0,boolean p1){
       k73 ok73 = m73.a();
       ok73.f(p0.entrySet());
       ok73.d("X-Allow-Offline-Mode", String.valueOf(p1));
       return ok73.b(true);
    }
    public static void h0(wh0 p0,String p1){
       if (p0 != null) {
          try{
             p0.flush();
          }catch(java.io.IOException e1){
             Log.e("FirebaseCrashlytics", p1, e1);
          }
       }
       return;
    }
    public static void i(float p0,float p1,float p2,float p3){
       int i = 0xbf800000;
       if ((i - p0) && ((i - p1) && ((i - p2) && (i - p3)))) {
          return;
       }
       Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3)};
       throw new IllegalStateException(String.format(Locale.US, "Incorrectly defined easing curve style. All control points must be set: \(%.1f, %.1f, %.1f, %.1f\)", objArray));
    }
    public static ActivityManager$RunningAppProcessInfo i0(Context p0,String p1){
       List runningAppPr;
       ActivityManager$RunningAppProcessInfo runningAppPr1;
       if ((runningAppPr = p0.getSystemService("activity").getRunningAppProcesses()) != null) {
          Iterator iterator = runningAppPr.iterator();
          do {
             if (iterator.hasNext()) {
             }
             runningAppPr1 = iterator.next();
          } while (runningAppPr1.processName.equals(p1));
          return runningAppPr1;
       }
       runningAppPr1 = null;
    }
    public static boolean j(Context p0){
       NetworkInfo activeNetwor;
       boolean b = false;
       int i = (!p0.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE"))? 1: 0;
       if (i) {
          if ((activeNetwor = p0.getSystemService("connectivity").getActiveNetworkInfo()) != null && activeNetwor.isConnectedOrConnecting()) {
             b = true;
          }
          return b;
       }else {
          return true;
       }
    }
    public static boolean j0(Context p0,String p1){
       Resources resources;
       int i;
       int i1;
       if (p0 != null && (resources = p0.getResources()) != null) {
          if ((i = xj0.o0(p0, p1, "bool")) > 0) {
             return resources.getBoolean(i);
          }else if((i1 = xj0.o0(p0, p1, "string")) > 0){
             return Boolean.parseBoolean(p0.getString(i1));
          }
       }
       return true;
    }
    public static String k(String p0,Locale p1){
       p0 = (p0.length() > 1)? p0.substring(0, 1).toUpperCase(p1)+p0.substring(1): p0.toUpperCase(p1);
       return p0;
    }
    public static final float[] k0(String p0,JSONObject p1){
       JSONObject jSONObject1;
       float[] uofloatArray = null;
       if (!xj0.B) {
          return uofloatArray;
       }
       int i = 30;
       float[] uofloatArray1 = new float[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uofloatArray1[i1] = 0;
       }
       try{
          p0 = p0.toLowerCase();
          co5.l(p0, "\(this as java.lang.String\).toLowerCase\(\)");
          JSONObject jSONObject = new JSONObject(p1.optJSONObject("view").toString());
          String str = p1.optString("screenname");
          JSONArray jSONArray = new JSONArray();
          xj0.L0(jSONObject, jSONArray);
          xj0.R0(uofloatArray1, xj0.K0(jSONObject));
          if ((jSONObject1 = xj0.m0(jSONObject)) == null) {
             return uofloatArray;
          }
          co5.l(str, "screenName");
          String str1 = jSONObject.toString();
          co5.l(str1, "viewTree.toString\(\)");
          xj0.R0(uofloatArray1, xj0.H0(jSONObject1, jSONArray, str, str1, p0));
          return uofloatArray1;
       }catch(org.json.JSONException e0){
       }
    }
    public static void l(Closeable p0,String p1){
       if (p0 != null) {
          try{
             p0.close();
          }catch(java.io.IOException e1){
             Log.e("FirebaseCrashlytics", p1, e1);
          }
       }
       return;
    }
    public static int l0(Context p0){
       boolean b = xj0.A0(p0);
       if (xj0.D0(p0)) {
          b = b | 0x02;
       }
       int i = (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger())? 0: 1;
       if (i) {
          b = b | 0x04;
       }
       return b;
    }
    public static void m(Closeable p0){
       if (p0 != null) {
          try{
             p0.close();
          }catch(java.lang.RuntimeException e0){
             throw e0;
          }catch(java.lang.Exception e0){
          }
       }
       return;
    }
    public static JSONObject m0(JSONObject p0){
       JSONArray jSONArray;
       int i;
       JSONObject jSONObject = null;
       try{
          if (p0.optBoolean("is_interacted")) {
             return p0;
          }
          if ((jSONArray = p0.optJSONArray("childviews")) == null) {
             return jSONObject;
          }
          if ((i = jSONArray.length()) > 0) {
             int i1 = 0;
             while (true) {
                int i2 = i1 + 1;
                JSONObject jSONObject1 = jSONArray.getJSONObject(i1);
                co5.l(jSONObject1, "children.getJSONObject\(i\)");
                if ((jSONObject1 = xj0.m0(jSONObject1)) != null) {
                   return jSONObject1;
                }
                if (i2 < i) {
                   i1 = i2;
                }
             }
          }
          return e0;
       }catch(org.json.JSONException e0){
       }
    }
    public static long n(int p0,String p1,String p2){
       return (Long.parseLong(p1.split(p2)[0].trim()) * (long)p0);
    }
    public static String n0(Context p0){
       int i;
       if (!(i = xj0.o0(p0, "com.google.firebase.crashlytics.mapping_file_id", "string"))) {
          i = xj0.o0(p0, "com.crashlytics.android.build_id", "string");
       }
       String str = (i)? p0.getResources().getString(i): null;
       return str;
    }
    public static lp6 o(Context p0){
       lp6 olp6 = new lp6(p0, sp6.K, (float)xj0.e0(12.00f, p0.getResources()));
       olp6.b(n6.b(p0, R.color.cat_accessory_green));
       return olp6;
    }
    public static int o0(Context p0,String p1,String p2){
       ApplicationInfo icon;
       Resources resources = p0.getResources();
       String resourcePack = ((icon = p0.getApplicationContext().getApplicationInfo().icon) > null)? p0.getResources().getResourcePackageName(icon): p0.getPackageName();
    }
    public static String p(String[] p0){
       String str;
       object oobject;
       if (!p0.length) {
       }else {
          ArrayList uArrayList = new ArrayList();
          int len = p0.length;
          int i = 0;
          while (i < len) {
             if ((oobject = p0[i]) != null) {
                uArrayList.add(oobject.replace("-", "").toLowerCase(Locale.US));
             }
             i = i + 1;
          }
          Collections.sort(uArrayList);
          str = "";
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             str = str.append(iterator.next());
          }
          str = str;
          if (str.length() > 0) {
             str = xj0.P0(str);
          label_0051 :
             return str;
          }
       }
       str = null;
       goto label_0051 ;
    }
    public static final String p0(String p0,String p1,String p2){
       co5.o(p1, "activityName");
       if ((p0 = p2+" | "+p1+", "+p0) == null) {
          throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
       }
       p0 = p0.toLowerCase();
       co5.l(p0, "\(this as java.lang.String\).toLowerCase\(\)");
       return p0;
    }
    public static Intent q(Context p0){
       return xj0.z0(p0, "spotify.intent.action.MAIN").addFlags(0x4000000);
    }
    public static synchronized long q0(){
       long l;
       String str = "Unexpected meminfo format while computing RAM: ";
       _monitor_enter(xj0.class);
       if (!(xj0.b - -1)) {
          String str1 = xj0.g0(new File("/proc/meminfo"));
          if (!TextUtils.isEmpty(str1)) {
             str1 = str1.toUpperCase(Locale.US);
             try{
                if (str1.endsWith("KB")) {
                   l = xj0.n(1024, str1, "KB");
                }else if(str1.endsWith("MB")){
                   l = xj0.n(0x100000, str1, "MB");
                }else if(str1.endsWith("GB")){
                   l = xj0.n(0x40000000, str1, "GB");
                }else {
                   Log.isLoggable("FirebaseCrashlytics", 3);
                }
             }catch(java.lang.NumberFormatException e3){
                Log.e("FirebaseCrashlytics", str+str1, e3);
             }
          }else {
             l = 0;
          }
          xj0.b = l;
       }
       _monitor_exit(xj0.class);
       return xj0.b;
    }
    public static Intent r(Context p0){
       Intent launchIntent;
       if ((launchIntent = p0.getPackageManager().getLaunchIntentForPackage(p0.getPackageName())) == null) {
          throw new IllegalStateException("No launcher activity found for "+p0.getPackageName());
       }
       launchIntent.addFlags(0x8000);
       return launchIntent;
    }
    public static p80 r0(long p0){
       o80 t = p80.t;
       long l = 1;
       if ((p0 - t.c(l)) >= 0) {
          return t;
       }
       n80 c = p80.c;
       if ((p0 - c.c(l)) >= 0) {
          return c;
       }
       m80 b = p80.b;
       if ((p0 - b.c(l)) >= 0) {
          return b;
       }
       return p80.a;
    }
    public static Intent s(Context p0,String p1){
       Uri uri = Uri.parse(p1);
       if ("spotify".equals(uri.getScheme())) {
          return xj0.q(p0).setData(uri);
       }
       return new Intent("android.intent.action.VIEW", uri);
    }
    public static String s0(a p0,long p1,p80 p2){
       int i;
       Object[] objArray;
       if (i = p2.ordinal()) {
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   throw new IllegalArgumentException("Unknown ByteUnit: "+p2);
                }
                objArray = new Object[]{Long.valueOf(p2.b(p1))};
                return p0.getString(R.string.byte_unit_gigabytes_formatted, objArray);
             }else {
                objArray = new Object[]{Long.valueOf(p2.b(p1))};
                return p0.getString(R.string.byte_unit_megabytes_formatted, objArray);
             }
          }else {
             objArray = new Object[]{Long.valueOf(p2.b(p1))};
             return p0.getString(R.string.byte_unit_kilobytes_formatted, objArray);
          }
       }else {
          objArray = new Object[]{Long.valueOf(p2.b(p1))};
          return p0.getString(R.string.byte_unit_bytes_formatted, objArray);
       }
    }
    public static int t(int p0,byte[] p1,int p2,int p3,bc3 p4,my7 p5){
       p2 = xj0.a0(p1, p2, p5);
       boolean b = (p5.b)? true: false;
       p4.c(b);
       while (p2 < p3) {
          b = xj0.Y(p1, p2, p5);
          if (p0 != p5.a) {
             break ;
          }else {
             p2 = xj0.a0(p1, b, p5);
             b = (p5.b)? true: false;
             p4.c(b);
          }
       }
       return p2;
    }
    public static String t0(CellularSettingsActivity p0,p80 p1){
       int i;
       if (!(i = p1.ordinal())) {
          return p0.getString(R.string.byte_unit_bytes);
       }
       if (i == 1) {
          return p0.getString(R.string.byte_unit_kilobytes);
       }
       if (i == 2) {
          return p0.getString(R.string.byte_unit_megabytes);
       }
       if (i == 3) {
          return p0.getString(R.string.byte_unit_gigabytes);
       }
       throw new IllegalArgumentException("Unknown ByteUnit: "+p1);
    }
    public static int u(byte[] p0,int p1,my7 p2){
       my7 a;
       p1 = xj0.Y(p0, p1, p2);
       if ((a = p2.a) < null) {
          throw rc3.e();
       }
       if (a > (p0.length - p1)) {
          throw rc3.g();
       }
       if (a == null) {
          p2.c = i80.b;
          return p1;
       }else {
          p2.c = i80.c(p0, p1, a);
          return (p1 + a);
       }
    }
    public static xt u0(cu p0,String p1){
       if (p0.v != null || TextUtils.isEmpty(p1)) {
          return xt.e();
       }
       Object[] objArray = new Object[]{new ql4(p1)};
       return new xt(p0, co5.B(vv7.p(objArray)));
    }
    public static int v(int p0,byte[] p1,int p2,int p3,bc3 p4,my7 p5){
       my7 a;
       p2 = xj0.Y(p1, p2, p5);
       if ((a = p5.a) < null) {
          throw rc3.e();
       }
       int i = p1.length - p2;
       if (a > i) {
          throw rc3.g();
       }
       if (a == null) {
          p4.add(i80.b);
          while (p2 < p3) {
             int i1 = xj0.Y(p1, p2, p5);
             if (p0 != p5.a) {
                break ;
             }else {
                p2 = xj0.Y(p1, i1, p5);
                if ((a = p5.a) >= null) {
                   i = p1.length - p2;
                   if (a <= i) {
                      if (a == null) {
                         p4.add(i80.b);
                      }else {
                         p4.add(i80.c(p1, p2, a));
                      }
                   }else {
                      throw rc3.g();
                   }
                }else {
                   throw rc3.e();
                }
             }
          }
          return p2;
       }else {
          p4.add(i80.c(p1, p2, a));
       }
       p2 = p2 + a;
    }
    public static String v0(byte[] p0){
       char[] uocharArray = new char[(p0.length * 2)];
       for (int i = 0; i < p0.length; i = i + 1) {
          int i1 = p0[i] & 0x00ff;
          int i2 = i * 2;
          char[] a = xj0.a;
          int i3 = i1 >> 4;
          uocharArray[i2] = a[i3];
          i2 = i2 + 1;
          i1 = i1 & 0x0f;
          uocharArray[i2] = a[i1];
       }
       return new String(uocharArray);
    }
    public static double w(byte[] p0,int p1){
       return Double.longBitsToDouble(xj0.A(p0, p1));
    }
    public static PathInterpolator w0(Context p0){
       TypedValue typedValue = new TypedValue();
       boolean b = true;
       if (!p0.getTheme().resolveAttribute(R.attr.pasteEasingCurveInHard, typedValue, b)) {
          throw new IllegalStateException("Failed to resolve the attribute: 2130904261");
       }
       TypedArray typedArray = p0.obtainStyledAttributes(typedValue.resourceId, xe7.B);
       float floatx = typedArray.getFloat(0, 0xbf800000);
       float floatx1 = typedArray.getFloat(2, 0xbf800000);
       float floatx2 = typedArray.getFloat(b, 0xbf800000);
       float floatx3 = typedArray.getFloat(3, 0xbf800000);
       xj0.i(floatx, floatx1, floatx2, floatx3);
       typedArray.recycle();
       return s95.b(floatx, floatx1, floatx2, floatx3);
    }
    public static int x(int p0,byte[] p1,int p2,int p3,bc3 p4,my7 p5){
       p4.c(Double.longBitsToDouble(xj0.A(p1, p2)));
       for (p2 = p2 + 8; p2 < p3; p2 = i + 8) {
          int i = xj0.Y(p1, p2, p5);
          if (p0 != p5.a) {
             break ;
          }else {
             p4.c(Double.longBitsToDouble(xj0.A(p1, i)));
          }
       }
       return p2;
    }
    public static o85 x0(Context p0,ViewGroup p1,int p2){
       ViewGroup$LayoutParams layoutParams;
       o85 oo85 = new o85(p0);
       View view = LayoutInflater.from(p0).inflate(p2, p1, false);
       view.setDuplicateParentStateEnabled(true);
       view.setId(R.id.row_view);
       if ((layoutParams = view.getLayoutParams()) != null) {
          oo85.setLayoutParams(layoutParams);
          view.setLayoutParams(new FrameLayout$LayoutParams(layoutParams));
       }
       oo85.addView(view);
       return oo85;
    }
    public static int y(byte[] p0,int p1){
       return (((p0[(p1 + 3)] & 0x00ff) << 24) | (((p0[p1] & 0x00ff) | ((p0[(p1 + 1)] & 0x00ff) << 8)) | ((p0[(p1 + 2)] & 0x00ff) << 16)));
    }
    public static final void y0(File p0){
       try{
          xj0.A = new JSONObject();
          FileInputStream uFileInputSt = new FileInputStream(p0);
          byte[] uobyteArray = new byte[uFileInputSt.available()];
          uFileInputSt.read(uobyteArray);
          uFileInputSt.close();
          xj0.A = new JSONObject(new String(uobyteArray, oe0.a));
          t65[] ot65Array = new t65[]{new t65("ENGLISH", "1"),new t65("GERMAN", "2"),new t65("SPANISH", "3"),new t65("JAPANESE", "4")};
          xj0.x = q14.o0(ot65Array);
          ot65Array = new t65[9];
          ot65Array[0] = new t65("VIEW_CONTENT", "0");
          ot65Array[1] = new t65("SEARCH", "1");
          ot65Array[2] = new t65("ADD_TO_CART", "2");
          ot65Array[3] = new t65("ADD_TO_WISHLIST", "3");
          ot65Array[4] = new t65("INITIATE_CHECKOUT", "4");
          ot65Array[5] = new t65("ADD_PAYMENT_INFO", "5");
          ot65Array[6] = new t65("PURCHASE", "6");
          ot65Array[7] = new t65("LEAD", "7");
          ot65Array[8] = new t65("COMPLETE_REGISTRATION", "8");
          xj0.y = q14.o0(ot65Array);
          t65[] ot65Array1 = new t65[]{new t65("BUTTON_TEXT", "1"),new t65("PAGE_TITLE", "2"),new t65("RESOLVED_DOCUMENT_LINK", "3"),new t65("BUTTON_ID", "4")};
          xj0.z = q14.o0(ot65Array1);
          xj0.B = true;
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static int z(int p0,byte[] p1,int p2,int p3,bc3 p4,my7 p5){
       p4.c(xj0.y(p1, p2));
       for (p2 = p2 + 4; p2 < p3; p2 = i + 4) {
          int i = xj0.Y(p1, p2, p5);
          if (p0 != p5.a) {
             break ;
          }else {
             p4.c(xj0.y(p1, i));
          }
       }
       return p2;
    }
    public static Intent z0(Context p0,String p1){
       Intent intent = new Intent(p1).setPackage(p0.getPackageName());
       intent.setExtrasClassLoader(p0.getClassLoader());
       return intent;
    }
    public Object a(Class p0){
       um5 oum5;
       if ((oum5 = this.b(p0)) == null) {
          return null;
       }
       return oum5.get();
    }
    public Set d(){
       return this.c().get();
    }
}
