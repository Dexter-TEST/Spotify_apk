package p.n37;
import java.lang.ThreadLocal;
import android.content.Context;
import android.view.View;
import p.ej4;
import android.content.res.TypedArray;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import android.util.Log;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.graphics.Color;
import java.lang.Math;
import p.lj0;
import android.util.AttributeSet;
import p.n6;

public abstract class n37	// class@001f5f from classes.dex
{
    public static final ThreadLocal a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;

    static {
       n37.a = new ThreadLocal();
       int[] ointArray = new int[]{-16842910};
       n37.b = ointArray;
       ointArray = new int[]{0x101009c};
       n37.c = ointArray;
       ointArray = new int[]{0x10100a7};
       n37.d = ointArray;
       ointArray = new int[]{0x10100a0};
       n37.e = ointArray;
       ointArray = new int[0];
       n37.f = ointArray;
       int[] ointArray1 = new int[1];
       n37.g = ointArray1;
    }
    public static void a(Context p0,View p1){
       TypedArray typedArray = p0.obtainStyledAttributes(ej4.M);
       if (!typedArray.hasValue(117)) {
          Log.e("ThemeUtils", "View "+p1.getClass()+" is an AppCompat widget that can only be used with a Theme.AppCompat theme \(or descendant\).");
       }
       typedArray.recycle();
       return;
    }
    public static int b(Context p0,int p1){
       ColorStateList uColorStateL;
       TypedValue typedValue;
       if ((uColorStateL = n37.d(p0, p1)) != null && uColorStateL.isStateful()) {
          return uColorStateL.getColorForState(n37.b, uColorStateL.getDefaultColor());
       }
       ThreadLocal a = n37.a;
       if ((typedValue = a.get()) == null) {
          typedValue = new TypedValue();
          a.set(typedValue);
       }
       p0.getTheme().resolveAttribute(0x1010033, typedValue, true);
       int i = n37.c(p0, p1);
       return lj0.h(i, Math.round(((float)Color.alpha(i) * typedValue.getFloat())));
    }
    public static int c(Context p0,int p1){
       int[] g = n37.g;
       g[0] = p1;
       TypedArray typedArray = p0.obtainStyledAttributes(null, g);
       typedArray.recycle();
       return typedArray.getColor(0, 0);
    }
    public static ColorStateList d(Context p0,int p1){
       int resourceId;
       ColorStateList uColorStateL;
       int[] g = n37.g;
       g[0] = p1;
       TypedArray typedArray = p0.obtainStyledAttributes(null, g);
       if (!typedArray.hasValue(0) || (!(resourceId = typedArray.getResourceId(0, 0)) || (uColorStateL = n6.c(p0, resourceId)) == null)) {
          uColorStateL = typedArray.getColorStateList(0);
       }
       typedArray.recycle();
       return uColorStateL;
    }
}
