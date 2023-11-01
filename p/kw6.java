package p.kw6;
import p.lw6;
import android.view.Menu;
import java.lang.Object;
import android.view.MenuItem;
import java.lang.CharSequence;
import android.content.Context;
import p.jw6;
import java.lang.String;
import android.view.MenuItem$OnMenuItemClickListener;
import java.lang.IllegalStateException;
import p.l64;
import p.r64;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.reflect.Method;
import java.lang.ClassLoader;
import java.lang.reflect.Constructor;
import java.lang.reflect.AccessibleObject;
import android.view.View;
import p.mw6;
import p.m64;
import android.os.Build$VERSION;
import p.j64;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;

public final class kw6	// class@001c98 from classes.dex
{
    public CharSequence A;
    public CharSequence B;
    public ColorStateList C;
    public PorterDuff$Mode D;
    public final lw6 E;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public m64 z;

    public void kw6(lw6 p0,Menu p1){
       this.E = p0;
       super();
       this.C = null;
       this.D = null;
       this.a = p1;
       this.b = 0;
       this.c = 0;
       this.d = 0;
       this.e = 0;
       this.f = true;
       this.g = true;
    }
    public final void a(MenuItem p0){
       kw6 tv;
       Constructor constructor;
       kw6 to;
       MenuItem menuItem = p0.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
       boolean b = false;
       boolean b1 = true;
       boolean b2 = (this.r >= b1)? true: false;
       menuItem.setCheckable(b2).setTitleCondensed(this.l).setIcon(this.m);
       if ((tv = this.v) >= null) {
          p0.setShowAsAction(tv);
       }
       kw6 tE = this.E;
       if (this.y != null) {
          if (!tE.c.isRestricted()) {
             if (tE.d == null) {
                tE.d = lw6.a(tE.c);
             }
             p0.setOnMenuItemClickListener(new jw6(tE.d, this.y));
          }else {
             throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
          }
       }
       if (this.r >= 2) {
          if (p0 instanceof l64) {
             l64 ol64 = p0;
             ol64.x = (ol64.x & 0xfb) | 4;
          }else if(p0 instanceof r64){
             r64 obj = p0;
             r64 d = obj.d;
             if (obj.e == null) {
                Class[] uClassArray = new Class[b1];
                uClassArray[b] = Boolean.TYPE;
                obj.e = d.getClass().getDeclaredMethod("setExclusiveCheckable", uClassArray);
             }
             Object[] objArray = new Object[b1];
             objArray[b] = Boolean.TRUE;
             obj.e.invoke(d, objArray);
          }
       }
    }
}
