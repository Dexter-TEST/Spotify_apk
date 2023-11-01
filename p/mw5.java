package p.mw5;
import android.graphics.PorterDuff$Mode;
import p.kw5;
import java.lang.Object;
import java.util.WeakHashMap;
import android.graphics.PorterDuffColorFilter;
import android.os.Build$VERSION;
import p.jw5;
import java.lang.String;
import p.wh6;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable$ConstantState;
import p.qv3;
import java.lang.ref.WeakReference;
import android.util.TypedValue;
import android.content.res.Resources;
import android.graphics.drawable.LayerDrawable;
import p.i77;
import java.lang.Long;
import java.lang.ref.Reference;
import p.og7;
import java.lang.Class;
import java.lang.Integer;
import p.jo6;
import java.lang.CharSequence;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.util.Xml;
import p.lw5;
import android.content.res.Resources$Theme;
import org.xmlpull.v1.XmlPullParserException;
import java.lang.Throwable;
import android.util.Log;
import p.n6;
import p.os0;
import android.content.res.ColorStateList;
import p.ne1;
import p.eb3;
import p.ce1;
import p.n37;
import p.ng;
import java.lang.IllegalStateException;
import java.lang.Math;
import android.graphics.ColorFilter;

public final class mw5	// class@001f1c from classes.dex
{
    public WeakHashMap a;
    public wh6 b;
    public jo6 c;
    public final WeakHashMap d;
    public TypedValue e;
    public boolean f;
    public i77 g;
    public static final PorterDuff$Mode h;
    public static mw5 i;
    public static final kw5 j;

    static {
       mw5.h = PorterDuff$Mode.SRC_IN;
       mw5.j = new kw5(0);
    }
    public void mw5(){
       super();
       this.d = new WeakHashMap(0);
    }
    public static synchronized mw5 d(){
       _monitor_enter(mw5.class);
       if (mw5.i == null) {
          mw5 omw5 = new mw5();
          mw5.i = omw5;
          mw5.j(omw5);
       }
       _monitor_exit(mw5.class);
       return mw5.i;
    }
    public static synchronized PorterDuffColorFilter h(int p0,PorterDuff$Mode p1){
       PorterDuffColorFilter porterDuffCo;
       _monitor_enter(mw5.class);
       kw5 j = mw5.j;
       if ((porterDuffCo = j.j(p0, p1)) == null) {
          porterDuffCo = new PorterDuffColorFilter(p0, p1);
          j.k(p0, p1, porterDuffCo);
       }
       _monitor_exit(mw5.class);
       return porterDuffCo;
    }
    public static void j(mw5 p0){
       if (Build$VERSION.SDK_INT < 24) {
          p0.a("vector", new jw5(3));
          p0.a("animated-vector", new jw5(1));
          p0.a("animated-selector", new jw5(0));
          p0.a("drawable", new jw5(2));
       }
       return;
    }
    public final void a(String p0,jw5 p1){
       if (this.b == null) {
          this.b = new wh6();
       }
       this.b.put(p0, p1);
       return;
    }
    public synchronized final void b(Context p0,long p1,Drawable p2){
       Drawable$ConstantState constantStat;
       qv3 oqv3;
       if ((constantStat = p2.getConstantState()) == null) {
          return;
       }
       if ((oqv3 = this.d.get(p0)) == null) {
          oqv3 = new qv3();
          this.d.put(p0, oqv3);
       }
       oqv3.h(p1, new WeakReference(constantStat));
       return;
    }
    public final Drawable c(Context p0,int p1){
       Drawable uDrawable;
       LayerDrawable layerDrawabl;
       if (this.e == null) {
          this.e = new TypedValue();
       }
       mw5 te = this.e;
       p0.getResources().getValue(p1, te, true);
       long l = ((long)te.assetCookie << 32) | (long)te.data;
       if ((uDrawable = this.e(p0, l)) != null) {
          return uDrawable;
       }else if(this.g == null){
       label_0073 :
          layerDrawabl = null;
       }else if(p1 == 0x7f070020){
          Drawable[] uDrawableArr = new Drawable[]{this.g(p0, R.drawable.abc_cab_background_internal_bg),this.g(p0, R.drawable.abc_cab_background_top_mtrl_alpha)};
          layerDrawabl = new LayerDrawable(uDrawableArr);
       }else if(p1 == 0x7f070044){
          layerDrawabl = i77.s(this, p0, R.dimen.abc_star_big);
       }else if(p1 == 0x7f070043){
          layerDrawabl = i77.s(this, p0, R.dimen.abc_star_medium);
       }else if(p1 == 0x7f070045){
          layerDrawabl = i77.s(this, p0, R.dimen.abc_star_small);
       }else {
          goto label_0073 ;
       }
       if (layerDrawabl != null) {
          layerDrawabl.setChangingConfigurations(te.changingConfigurations);
          this.b(p0, l, layerDrawabl);
       }
       return layerDrawabl;
    }
    public synchronized final Drawable e(Context p0,long p1){
       qv3 oqv3;
       WeakReference weakReferenc;
       Drawable$ConstantState uConstantSta;
       if ((oqv3 = this.d.get(p0)) == null) {
          return null;
       }
       if ((weakReferenc = oqv3.f(p1, null)) != null) {
          if ((uConstantSta = weakReferenc.get()) != null) {
             return uConstantSta.newDrawable(p0.getResources());
          }else {
             oqv3.i(p1);
          }
       }
       return null;
    }
    public synchronized final Drawable f(int p0,Context p1,boolean p2){
       Integer integer1;
       ColorStateList uColorStateL;
       Drawable uDrawable1;
       TypedValue string;
       XmlResourceParser xml;
       int i3;
       int i4;
       lw5 orDefault;
       boolean b = false;
       if (this.f != null) {
       }else {
          this.f = true;
          if ((uDrawable1 = this.g(p1, R.drawable.abc_vector_test)) != null) {
             uDrawable1 = (!uDrawable1 instanceof og7 && !"android.graphics.drawable.VectorDrawable".equals(uDrawable1.getClass().getName()))? 0: 1;
             if (!uDrawable1) {
             label_01aa :
                this.f = b;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
             }
          }else {
             goto label_01aa ;
          }
       }
       mw5 tb = this.b;
       Integer integer = null;
       if (tb != null && !tb.isEmpty()) {
          tb = this.c;
          String str = "appcompat_skip_skip";
          if (tb != null) {
             String str1 = tb.e(p0, integer);
             if (str.equals(str1) || (str1 != null || this.b.getOrDefault(str1, integer) != null)) {
             label_00e9 :
                integer1 = integer;
             }
          }else {
             this.c = new jo6();
          }
          if (this.e == null) {
             this.e = new TypedValue();
          }
          tb = this.e;
          Resources resources = p1.getResources();
          resources.getValue(p0, tb, true);
          long l = ((long)tb.assetCookie << 32) | (long)tb.data;
          if ((integer1 = this.e(p1, l)) == null) {
             if ((string = tb.string) != null && string.toString().endsWith(".xml")) {
                try{
                   xml = resources.getXml(p0);
                   AttributeSet uAttributeSe = Xml.asAttributeSet(xml);
                   do {
                      i3 = xml.next();
                      i4 = 2;
                   } while (i3 != i4 && i3 != 1);
                   if (i3 == i4) {
                      String name = xml.getName();
                      this.c.a(p0, name);
                      if ((orDefault = this.b.getOrDefault(name, integer)) != null) {
                         integer1 = orDefault.a(p1, xml, uAttributeSe, p1.getTheme());
                      }
                      if (integer1 != null) {
                         integer1.setChangingConfigurations(tb.changingConfigurations);
                         this.b(p1, l, integer1);
                      }
                   }else {
                      throw new XmlPullParserException("No start tag found");
                   }
                }catch(java.lang.Exception e0){
                   Log.e("ResourceManagerInternal", "Exception while inflating drawable", e0);
                }
             }
             if (integer1 == null) {
                this.c.a(p0, str);
             }
          }
       }else {
          goto label_00e9 ;
       }
       if (integer1 == null) {
          integer1 = this.c(p1, p0);
       }
       if (integer1 == null) {
          integer1 = os0.b(p1, p0);
       }
       if (integer1 != null) {
          if ((uColorStateL = this.i(p1, p0)) != null) {
             Drawable uDrawable = eb3.L(integer1.mutate());
             ce1.h(uDrawable, uColorStateL);
             if (this.g != null && p0 == 0x7f070052) {
                integer = PorterDuff$Mode.MULTIPLY;
             }
             if (integer != null) {
                ce1.i(uDrawable, integer);
             }
             integer = uDrawable;
          }else if(this.g != null){
             int i = 0x102000f;
             int i1 = 0x1020000;
             int i2 = 0x7f030141;
             if (p0 == 0x7f07004d) {
                uDrawable1 = integer1;
                PorterDuff$Mode b1 = ng.b;
                i77.A(uDrawable1.findDrawableByLayerId(i1), n37.c(p1, i2), b1);
                i77.A(uDrawable1.findDrawableByLayerId(i), n37.c(p1, i2), b1);
                i77.A(uDrawable1.findDrawableByLayerId(0x102000d), n37.c(p1, R.attr.colorControlActivated), b1);
             }else if(p0 != 0x7f070044 && (p0 != 0x7f070043 && p0 != 0x7f070045)){
             label_0195 :
                if (b) {
                   integer = integer1;
                }
             }else {
                uDrawable1 = integer1;
                PorterDuff$Mode b2 = ng.b;
                i77.A(uDrawable1.findDrawableByLayerId(i1), n37.b(p1, i2), b2);
                i77.A(uDrawable1.findDrawableByLayerId(i), n37.c(p1, R.attr.colorControlActivated), b2);
                i77.A(uDrawable1.findDrawableByLayerId(0x102000d), n37.c(p1, R.attr.colorControlActivated), b2);
             }
             b = 1;
             goto label_0195 ;
          }
          if (this.m(p1, p0, integer1) || !p2) {
          }
          integer1 = integer;
       }
       if (integer1 != null) {
          ne1.a(integer1);
       }
       return integer1;
    }
    public synchronized final Drawable g(Context p0,int p1){
       return this.f(p1, p0, false);
    }
    public synchronized final ColorStateList i(Context p0,int p1){
       jo6 ojo6;
       mw5 ta = this.a;
       Integer integer = null;
       ColorStateList uColorStateL = (ta != null && (ojo6 = ta.get(p0)) != null)? ojo6.e(p1, integer): integer;
       if (uColorStateL == null) {
          if ((ta = this.g) != null) {
             integer = ta.t(p0, p1);
          }
          if (integer != null) {
             if (this.a == null) {
                this.a = new WeakHashMap();
             }
             if ((ojo6 = this.a.get(p0)) == null) {
                ojo6 = new jo6();
                this.a.put(p0, ojo6);
             }
             ojo6.a(p1, integer);
          }
          uColorStateL = integer;
       }
       return uColorStateL;
    }
    public synchronized final void k(Context p0){
       qv3 oqv3;
       if ((oqv3 = this.d.get(p0)) != null) {
          oqv3.c();
       }
       return;
    }
    public synchronized final void l(i77 p0){
       this.g = p0;
    }
    public final boolean m(Context p0,int p1,Drawable p2){
       int i;
       int i1;
       int i2;
       mw5 tg = this.g;
       boolean b = false;
       if (tg != null) {
          PorterDuff$Mode b1 = ng.b;
          if (i77.f(tg.a, p1)) {
             p1 = 0x7f030141;
          }else if(i77.f(tg.c, p1)){
             p1 = 0x7f03013f;
          }else if(i77.f(tg.d, p1)){
             b1 = PorterDuff$Mode.MULTIPLY;
          }else if(p1 == 0x7f070035){
             p1 = Math.round(40.80f);
             i = 0x1010030;
          label_004c :
             i1 = 1;
          label_0051 :
             if (i1) {
                p2 = p2.mutate();
                _monitor_enter(ng.class);
                _monitor_exit(ng.class);
                p2.setColorFilter(mw5.h(n37.c(p0, i), b1));
                if (p1 != -1) {
                   p2.setAlpha(p1);
                }
                i2 = 1;
             }else {
                i2 = 0;
             }
             if (i2) {
                b = true;
             }
          }else if(p1 == 0x7f070023){
             p1 = -1;
             i = 0;
             i1 = 0;
             goto label_0051 ;
          }
          p1 = 0x1010031;
          i = p1;
          p1 = -1;
          goto label_004c ;
       }
       return b;
    }
}
