package p.av0;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Rect;
import android.content.Context;
import android.util.AttributeSet;
import p.xj0;
import android.content.res.TypedArray;
import java.lang.String;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.ThreadLocal;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Constructor;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.reflect.AccessibleObject;
import p.xu0;
import java.lang.RuntimeException;
import p.en6;
import java.lang.Throwable;
import android.view.ViewGroup$LayoutParams;

public final class av0 extends ViewGroup$MarginLayoutParams	// class@000ff9 from classes.dex
{
    public xu0 a;
    public boolean b;
    public int c;
    public int d;
    public final int e;
    public final int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final Rect q;

    public void av0(int p0,int p1){
       super(p0, p1);
       this.b = false;
       this.c = 0;
       this.d = 0;
       this.e = -1;
       this.f = -1;
       this.g = 0;
       this.h = 0;
       this.q = new Rect();
    }
    public void av0(Context p0,AttributeSet p1){
       String str;
       xu0 oxu0;
       av0 ta;
       Map map;
       Constructor uConstructor;
       super(p0, p1);
       this.b = false;
       this.c = 0;
       this.d = 0;
       this.e = -1;
       this.f = -1;
       this.g = 0;
       this.h = 0;
       this.q = new Rect();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, xj0.G);
       this.c = typedArray.getInteger(false, false);
       this.f = typedArray.getResourceId(1, -1);
       int i = 2;
       this.d = typedArray.getInteger(i, false);
       this.e = typedArray.getInteger(6, -1);
       this.g = typedArray.getInt(5, false);
       this.h = typedArray.getInt(4, false);
       int i1 = 3;
       int b = typedArray.hasValue(i1);
       this.b = b;
       if (b) {
          try{
             str = typedArray.getString(i1);
             if (TextUtils.isEmpty(str)) {
                oxu0 = null;
             }else if(str.startsWith(".")){
                str = p0.getPackageName()+str;
             }else {
                b = 46;
                if (str.indexOf(b) < 0) {
                   String k = CoordinatorLayout.K;
                   if (!TextUtils.isEmpty(k)) {
                      str = k+b+str;
                   }
                }
             }
             ThreadLocal m = CoordinatorLayout.M;
             if ((map = m.get()) == null) {
                map = new HashMap();
                m.set(map);
             }
             if ((uConstructor = map.get(str)) == null) {
                uConstructor = Class.forName(str, false, p0.getClassLoader()).getConstructor(CoordinatorLayout.L);
                uConstructor.setAccessible(1);
                map.put(str, uConstructor);
             }
             Object[] objArray = new Object[i];
             objArray[0] = p0;
             objArray[1] = p1;
             oxu0 = uConstructor.newInstance(objArray);
          }catch(java.lang.Exception e9){
             throw new RuntimeException(en6.n("Could not inflate Behavior subclass ", str), e9);
          }
             this.a = oxu0;
       }
       typedArray.recycle();
       if ((ta = this.a) != null) {
          ta.c(this);
       }
       return;
    }
    public void av0(ViewGroup$LayoutParams p0){
       super(p0);
       this.b = false;
       this.c = 0;
       this.d = 0;
       this.e = -1;
       this.f = -1;
       this.g = 0;
       this.h = 0;
       this.q = new Rect();
    }
    public void av0(ViewGroup$MarginLayoutParams p0){
       super(p0);
       this.b = false;
       this.c = 0;
       this.d = 0;
       this.e = -1;
       this.f = -1;
       this.g = 0;
       this.h = 0;
       this.q = new Rect();
    }
    public void av0(av0 p0){
       super(p0);
       this.b = false;
       this.c = 0;
       this.d = 0;
       this.e = -1;
       this.f = -1;
       this.g = 0;
       this.h = 0;
       this.q = new Rect();
    }
    public final boolean a(int p0){
       if (!p0) {
          return this.n;
       }
       if (p0 != 1) {
          return false;
       }
       return this.o;
    }
    public final void b(xu0 p0){
       av0 ta;
       if ((ta = this.a) != p0) {
          if (ta != null) {
             ta.f();
          }
          this.a = p0;
          this.b = true;
          if (p0 != null) {
             p0.c(this);
          }
       }
       return;
    }
}
