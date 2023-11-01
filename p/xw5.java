package p.xw5;
import java.lang.ThreadLocal;
import java.util.WeakHashMap;
import java.lang.Object;
import p.sw5;
import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import android.util.SparseArray;
import p.rw5;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build$VERSION;
import p.qw5;
import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import p.uw5;
import java.lang.String;
import java.lang.CharSequence;
import p.pa7;
import p.jw3;
import android.content.res.XmlResourceParser;
import p.wb2;
import p.ye7;
import android.util.Log;
import p.vf;
import java.lang.Throwable;
import android.content.res.Resources$NotFoundException;
import java.lang.StringBuilder;
import java.lang.Integer;

public abstract class xw5	// class@002d00 from classes.dex
{
    public static final ThreadLocal a;
    public static final WeakHashMap b;
    public static final Object c;

    static {
       xw5.a = new ThreadLocal();
       xw5.b = new WeakHashMap(0);
       xw5.c = new Object();
    }
    public static void a(sw5 p0,int p1,ColorStateList p2,Resources$Theme p3){
       SparseArray sparseArray;
       Object c = xw5.c;
       _monitor_enter(c);
       WeakHashMap b = xw5.b;
       if ((sparseArray = b.get(p0)) == null) {
          sparseArray = new SparseArray();
          b.put(p0, sparseArray);
       }
       sparseArray.append(p1, new rw5(p2, p0.a.getConfiguration(), p3));
       _monitor_exit(c);
       return;
    }
    public static int b(Resources p0,int p1,Resources$Theme p2){
       if (Build$VERSION.SDK_INT >= 23) {
          return qw5.a(p0, p1, p2);
       }
       return p0.getColor(p1);
    }
    public static Typeface c(Context p0,int p1){
       if (p0.isRestricted()) {
          return null;
       }
       return xw5.d(p0, p1, new TypedValue(), 0, null, false, false);
    }
    public static Typeface d(Context p0,int p1,TypedValue p2,int p3,uw5 p4,boolean p5,boolean p6){
       TypedValue string;
       Typeface typeface;
       wb2 owb2;
       int i = p1;
       TypedValue typedValue = p2;
       int i1 = p3;
       uw5 ouw5 = p4;
       Resources resources = p0.getResources();
       resources.getValue(i, typedValue, true);
       if ((string = typedValue.string) == null) {
          throw new Resources$NotFoundException("Resource \""+resources.getResourceName(i)+"\" \("+Integer.toHexString(p1)+"\) is not a Font: "+typedValue);
       }
       String str = string.toString();
       if (!str.startsWith("res/")) {
          if (ouw5) {
             ouw5.c(-3);
          }
       }else {
          jw3 b = pa7.b;
          if ((typeface = b.b(pa7.b(resources, i, str, typedValue.assetCookie, i1))) != null) {
             if (ouw5 != null) {
                ouw5.d(typeface);
             label_00b9 :
                if (typeface == null && (ouw5 == null && !p6)) {
                   throw new Resources$NotFoundException("Font resource ID #0x"+Integer.toHexString(p1)+" could not be retrieved.");
                }else {
                   return typeface;
                }
             }else {
                goto label_00b9 ;
             }
          }else if(p6){
             try{
                if (str.toLowerCase().endsWith(".xml")) {
                   if ((owb2 = ye7.O(resources.getXml(i), resources)) == null) {
                      Log.e("ResourcesCompat", "Failed to find font-family tag");
                      if (ouw5 != null) {
                         ouw5.c(-3);
                      }
                   }else {
                      typeface = pa7.a(p0, owb2, resources, p1, str, typedValue.assetCookie, p3, p4, p5);
                      goto label_00b9 ;
                   }
                }else {
                   typedValue = typedValue.assetCookie;
                   if ((typeface = pa7.a.m(p0, resources, p1, str, p3)) != null) {
                      b.c(pa7.b(resources, i, str, typedValue, i1), typeface);
                   }
                   if (ouw5 != null) {
                      if (typeface != null) {
                         ouw5.d(typeface);
                         goto label_00b9 ;
                      }else {
                         ouw5.c(-3);
                         goto label_00b9 ;
                      }
                   }else {
                      goto label_00b9 ;
                   }
                }
             }catch(org.xmlpull.v1.XmlPullParserException e0){
                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(str), e0);
             }catch(java.io.IOException e0){
                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(str), e0);
             }
             if (ouw5) {
                ouw5.c(-3);
             }
          }
       }
       typeface = null;
       goto label_00b9 ;
    }
}
