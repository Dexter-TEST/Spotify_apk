package p.p86;
import android.widget.AutoCompleteTextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.reflect.AccessibleObject;
import java.lang.Boolean;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.os.Build$VERSION;
import java.lang.UnsupportedClassVersionError;
import android.content.res.ColorStateList;
import p.n6;
import android.graphics.drawable.Drawable;
import p.eb3;
import p.ng;
import p.mw5;
import p.ph;
import android.graphics.Typeface;
import android.util.TypedValue;
import p.xw5;
import p.uw5;
import java.lang.CharSequence;

public final class p86	// class@002212 from classes.dex
{
    public final Object a;
    public final Object b;
    public Object c;

    public void p86(){
       AutoCompleteTextView uAutoComplet = AutoCompleteTextView.class;
       super();
       this.a = null;
       this.b = null;
       this.c = null;
       p86.n();
       try{
          int i = 1;
          Class[] uClassArray = new Class[0];
          Method declaredMeth = uAutoComplet.getDeclaredMethod("doBeforeTextChanged", uClassArray);
          this.a = declaredMeth;
          declaredMeth.setAccessible(i);
          try{
             uClassArray = new Class[0];
             declaredMeth = e0.getDeclaredMethod("doAfterTextChanged", uClassArray);
             this.b = declaredMeth;
             declaredMeth.setAccessible(i);
             try{
                uClassArray = new Class[i];
                uClassArray[0] = Boolean.TYPE;
                Method method = e0.getMethod("ensureImeVisible", uClassArray);
                this.c = method;
                method.setAccessible(i);
                return;
             }catch(java.lang.NoSuchMethodException e0){
             }
          }catch(java.lang.NoSuchMethodException e0){
          }
       }catch(java.lang.NoSuchMethodException e0){
       }
    }
    public void p86(Context p0,TypedArray p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static p86 m(Context p0,AttributeSet p1,int[] p2,int p3){
       return new p86(p0, p0.obtainStyledAttributes(p1, p2, p3, 0));
    }
    public static void n(){
       if (Build$VERSION.SDK_INT < 29) {
          return;
       }
       throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
    public final boolean a(int p0,boolean p1){
       return this.b.getBoolean(p0, p1);
    }
    public final ColorStateList b(int p0){
       int resourceId;
       ColorStateList uColorStateL;
       p86 tb = this.b;
       if (tb.hasValue(p0) && ((resourceId = tb.getResourceId(p0, 0)) && (uColorStateL = n6.c(this.a, resourceId)) != null)) {
          return uColorStateL;
       }
       return tb.getColorStateList(p0);
    }
    public final int c(int p0,int p1){
       return this.b.getDimensionPixelOffset(p0, p1);
    }
    public final int d(int p0,int p1){
       return this.b.getDimensionPixelSize(p0, p1);
    }
    public final Drawable e(int p0){
       int resourceId;
       p86 tb = this.b;
       if (tb.hasValue(p0) && (resourceId = tb.getResourceId(p0, 0))) {
          return eb3.m(this.a, resourceId);
       }
       return tb.getDrawable(p0);
    }
    public final Drawable f(int p0){
       if (!this.b.hasValue(p0) || !(p0 = this.b.getResourceId(p0, 0))) {
          return null;
       }
       ng ong = ng.a();
       _monitor_enter(ong);
       _monitor_exit(ong);
       return ong.a.f(p0, this.a, true);
    }
    public final Typeface g(int p0,int p1,ph p2){
       int resourceId = this.b.getResourceId(p0, 0);
       Typeface typeface = null;
       if (!resourceId) {
          return typeface;
       }
       if (this.c == null) {
          this.c = new TypedValue();
       }
       p86 op86 = this.a;
       p86 op861 = this.c;
       if (!op86.isRestricted()) {
          typeface = xw5.d(op86, resourceId, op861, p1, p2, true, false);
       }
       return typeface;
    }
    public final int h(int p0,int p1){
       return this.b.getInt(p0, p1);
    }
    public final int i(int p0,int p1){
       return this.b.getResourceId(p0, p1);
    }
    public final String j(int p0){
       return this.b.getString(p0);
    }
    public final CharSequence k(int p0){
       return this.b.getText(p0);
    }
    public final boolean l(int p0){
       return this.b.hasValue(p0);
    }
    public final void o(){
       this.b.recycle();
    }
}
