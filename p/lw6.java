package p.lw6;
import android.view.MenuInflater;
import java.lang.Class;
import android.content.Context;
import java.lang.Object;
import android.app.Activity;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.Menu;
import p.kw6;
import org.xmlpull.v1.XmlPullParser;
import java.lang.String;
import java.lang.RuntimeException;
import p.m64;
import android.view.ActionProvider;
import java.lang.CharSequence;
import android.view.SubMenu;
import android.view.MenuItem;
import p.ej4;
import android.content.res.TypedArray;
import p.p86;
import java.lang.ClassLoader;
import java.lang.reflect.Constructor;
import java.lang.reflect.AccessibleObject;
import android.graphics.PorterDuff$Mode;
import p.ne1;
import android.content.res.ColorStateList;
import p.iw6;
import android.content.res.Resources;
import android.util.Xml;
import android.view.InflateException;
import java.lang.Throwable;

public final class lw6 extends MenuInflater	// class@001dda from classes.dex
{
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;
    public static final Class[] e;
    public static final Class[] f;

    static {
       Class[] uClassArray = new Class[]{Context.class};
       lw6.e = uClassArray;
       lw6.f = uClassArray;
    }
    public void lw6(Context p0){
       super(p0);
       this.c = p0;
       Object[] objArray = new Object[]{p0};
       this.a = objArray;
       this.b = objArray;
    }
    public static Object a(Context p0){
       if (p0 instanceof Activity) {
          return p0;
       }
       if (p0 instanceof ContextWrapper) {
          p0 = lw6.a(p0.getBaseContext());
       }
       return p0;
    }
    public final void b(XmlResourceParser p0,AttributeSet p1,Menu p2){
       String name;
       kw6 z;
       m64 om64;
       ColorStateList uColorStateL;
       int i5;
       lw6 olw6 = this;
       AttributeSet uAttributeSe = p1;
       kw6 okw6 = new kw6(olw6, p2);
       int eventType = p0.getEventType();
       while (true) {
          int i = 2;
          if (eventType == i) {
             name = p0.getName();
             if (name.equals("menu")) {
                eventType = p0.next();
             label_0036 :
                int i1 = 0;
                int i2 = 0;
                Object obj = null;
                while (true) {
                   if (i1) {
                      return;
                   }
                   if (eventType == 1) {
                      throw new RuntimeException("Unexpected end of document");
                   }
                   kw6 a = okw6.a;
                   String str = "item";
                   String str1 = "group";
                   int i3 = 3;
                   if (eventType != i) {
                      if (eventType == i3) {
                         name = p0.getName();
                         if (i2 && name.equals(obj)) {
                            i2 = 0;
                            obj = null;
                         label_0265 :
                            eventType = p0.next();
                            i = 2;
                         }else if(name.equals(str1)){
                            okw6.b = 0;
                            okw6.c = 0;
                            okw6.d = 0;
                            okw6.e = 0;
                            okw6.f = true;
                            okw6.g = true;
                         }else if(name.equals(str)){
                            if (okw6.h == null) {
                               if ((z = okw6.z) != null && z.a.hasSubMenu()) {
                                  okw6.h = true;
                                  okw6.a(a.addSubMenu(okw6.b, okw6.i, okw6.j, okw6.k).getItem());
                               }else {
                                  okw6.h = true;
                                  okw6.a(a.add(okw6.b, okw6.i, okw6.j, okw6.k));
                               }
                            }
                         }else if(name.equals("menu")){
                            i1 = 1;
                            goto label_0265 ;
                         }
                      }
                   }else if(i2){
                      name = p0.getName();
                      kw6 e = okw6.E;
                      i = 4;
                      if (name.equals(str1)) {
                         TypedArray typedArray = e.c.obtainStyledAttributes(uAttributeSe, ej4.S);
                         okw6.b = typedArray.getResourceId(true, 0);
                         okw6.c = typedArray.getInt(i3, 0);
                         okw6.d = typedArray.getInt(i, 0);
                         okw6.e = typedArray.getInt(5, 0);
                         okw6.f = typedArray.getBoolean(2, true);
                         okw6.g = typedArray.getBoolean(0, true);
                         typedArray.recycle();
                      }else if(name.equals(str)){
                         lw6 c = e.c;
                         p86 op86 = new p86(c, c.obtainStyledAttributes(uAttributeSe, ej4.T));
                         okw6.i = op86.i(2, 0);
                         eventType = op86.h(5, okw6.c) & 0xffff0000;
                         int i4 = op86.h(6, okw6.d) & 0xffff;
                         eventType = eventType | i4;
                         okw6.j = eventType;
                         okw6.k = op86.k(7);
                         okw6.l = op86.k(8);
                         okw6.m = op86.i(0, 0);
                         char c1 = ((name = op86.j(9)) == null)? 0: name.charAt(0);
                         okw6.n = c1;
                         i4 = 4096;
                         okw6.o = op86.h(16, i4);
                         c1 = ((name = op86.j(10)) == null)? 0: name.charAt(0);
                         okw6.p = c1;
                         okw6.q = op86.h(20, i4);
                         eventType = 11;
                         okw6.r = (op86.l(eventType))? op86.a(eventType, 0): okw6.e;
                         okw6.s = op86.a(i3, 0);
                         okw6.t = op86.a(i, okw6.f);
                         okw6.u = op86.a(true, okw6.g);
                         i = -1;
                         okw6.v = op86.h(21, i);
                         okw6.y = op86.j(12);
                         okw6.w = op86.i(13, 0);
                         okw6.x = op86.j(15);
                         i4 = ((name = op86.j(14)) != null)? 1: 0;
                         if (i4 && (okw6.w == null && okw6.x == null)) {
                            Class[] f = lw6.f;
                            lw6 b = e.b;
                            try{
                               Constructor constructor = Class.forName(name, 0, e.c.getClassLoader()).getConstructor(f);
                               constructor.setAccessible(true);
                               om64 = constructor.newInstance(b);
                            }catch(java.lang.Exception e0){
                               om64 = null;
                            }
                            okw6.z = om64;
                         }else {
                            okw6.z = null;
                         }
                         okw6.A = op86.k(17);
                         okw6.B = op86.k(22);
                         eventType = 19;
                         if (op86.l(eventType)) {
                            okw6.D = ne1.c(op86.h(eventType, i), okw6.D);
                            uColorStateL = null;
                         }else {
                            uColorStateL = null;
                            okw6.D = uColorStateL;
                         }
                         eventType = 18;
                         okw6.C = (op86.l(eventType))? op86.b(eventType): uColorStateL;
                         op86.o();
                         okw6.h = false;
                         i5 = p0;
                         goto label_0265 ;
                      }else if(name.equals("menu")){
                         okw6.h = true;
                         SubMenu subMenu = a.addSubMenu(okw6.b, okw6.i, okw6.j, okw6.k);
                         okw6.a(subMenu.getItem());
                         olw6.b(p0, uAttributeSe, subMenu);
                         goto label_0265 ;
                      }else {
                         obj = name;
                         i2 = 1;
                         goto label_0265 ;
                      }
                   }
                   i = 0;
                   goto label_0265 ;
                }
             }else {
                break ;
             }
          }else if((eventType = p0.next()) == 1){
             goto label_0036 ;
          }else {
             i5 = p0;
          }
       }
       throw new RuntimeException("Expecting menu, got ".concat(name));
    }
    public final void inflate(int p0,Menu p1){
       if (!p1 instanceof iw6) {
          super.inflate(p0, p1);
          return;
       }else {
          int i = 0;
          try{
             XmlResourceParser layout = this.c.getResources().getLayout(p0);
             this.b(layout, Xml.asAttributeSet(layout), p1);
             layout.close();
             return;
          }catch(org.xmlpull.v1.XmlPullParserException e4){
             throw new InflateException(v0, e4);
          }catch(java.io.IOException e4){
             throw new InflateException(v0, e4);
          }
       }
    }
}
