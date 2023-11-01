package p.fi;
import android.graphics.RectF;
import java.util.concurrent.ConcurrentHashMap;
import android.widget.TextView;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.os.Build$VERSION;
import p.di;
import p.ci;
import p.ei;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.List;
import java.util.Collections;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.reflect.AccessibleObject;
import java.lang.CharSequence;
import android.text.method.TransformationMethod;
import p.zh;
import android.text.TextPaint;
import android.graphics.Paint;
import android.text.Layout$Alignment;
import java.lang.Math;
import android.text.StaticLayout;
import p.bi;
import android.text.Layout;
import java.lang.IllegalStateException;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import p.ai;
import p.pg;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class fi	// class@0015d6 from classes.dex
{
    public int a;
    public boolean b;
    public float c;
    public float d;
    public float e;
    public int[] f;
    public boolean g;
    public TextPaint h;
    public final TextView i;
    public final Context j;
    public final ei k;
    public static final RectF l;
    public static final ConcurrentHashMap m;

    static {
       fi.l = new RectF();
       fi.m = new ConcurrentHashMap();
       ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
    }
    public void fi(TextView p0){
       int sDK_INT;
       super();
       this.a = 0;
       this.b = false;
       this.c = 0xbf800000;
       this.d = 0xbf800000;
       this.e = 0xbf800000;
       int[] ointArray = new int[0];
       this.f = ointArray;
       this.g = false;
       this.i = p0;
       this.j = p0.getContext();
       if ((sDK_INT = Build$VERSION.SDK_INT) >= 29) {
          this.k = new di();
       }else if(sDK_INT >= 23){
          this.k = new ci();
       }else {
          this.k = new ei();
       }
       return;
    }
    public static int[] b(int[] p0){
       int len;
       int i2;
       if (!(len = p0.length)) {
          return p0;
       }
       Arrays.sort(p0);
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       int i1 = 0;
       while (i1 < len) {
          if ((i2 = p0[i1]) > 0 && Collections.binarySearch(uArrayList, Integer.valueOf(i2)) < 0) {
             uArrayList.add(Integer.valueOf(i2));
          }
          i1 = i1 + 1;
       }
       if (len == uArrayList.size()) {
          return p0;
       }
       int i3 = uArrayList.size();
       int[] ointArray = new int[i3];
       for (; i < i3; i = i + 1) {
          ointArray[i] = uArrayList.get(i).intValue();
       }
       return ointArray;
    }
    public static Method d(String p0){
       Method method;
       try{
          ConcurrentHashMap m = fi.m;
          if ((method = m.get(p0)) == null) {
             Class[] uClassArray = new Class[0];
             if ((method = TextView.class.getDeclaredMethod(p0, uClassArray)) != null) {
                method.setAccessible(true);
                m.put(p0, method);
             }
          }
          return method;
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public final void a(){
       int i = (this.h() && this.a != null)? 1: 0;
       if (!i) {
          return;
       }else if(this.b != null){
          if (this.i.getMeasuredHeight() > 0 && this.i.getMeasuredWidth() > 0) {
             i = (this.k.b(this.i))? 0x100000: (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
             int i1 = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
             if (i > 0 && i1 > 0) {
                RectF l = fi.l;
                _monitor_enter(l);
                l.setEmpty();
                l.right = (float)i;
                l.bottom = (float)i1;
                float f = (float)this.c(l);
                if (this.i.getTextSize() - f) {
                   this.e(f, 0);
                }
                _monitor_exit(l);
             }
          }
          return;
       }
       this.b = true;
       return;
    }
    public final int c(RectF p0){
       int len;
       CharSequence text;
       TransformationMethod transformati;
       CharSequence transformati1;
       fi h;
       StaticLayout staticLayout;
       fi uofi = this;
       RectF rectF = p0;
       if (!(len = uofi.f.length)) {
          throw new IllegalStateException("No available text sizes to choose from.");
       }
       len = len - 1;
       int i = 0;
       int i1 = 1;
       int i2 = 0;
       while (i1 <= len) {
          i2 = i1 + len;
          i2 = i2 / 2;
          int i3 = uofi.f[i2];
          fi i4 = uofi.i;
          text = i4.getText();
          if ((transformati = i4.getTransformationMethod()) != null && (transformati1 = transformati.getTransformation(text, i4)) != null) {
             text = transformati1;
          }
          int sDK_INT = Build$VERSION.SDK_INT;
          int i5 = zh.b(i4);
          if ((h = uofi.h) == null) {
             uofi.h = new TextPaint();
          }else {
             h.reset();
          }
          uofi.h.set(i4.getPaint());
          uofi.h.setTextSize((float)i3);
          String str = "getLayoutAlignment";
          try{
             Layout$Alignment aLIGN_NORMAL = Layout$Alignment.ALIGN_NORMAL;
             Object[] objArray = new Object[i];
             Object obj = fi.d(str).invoke(i4, objArray);
             Object obj1 = obj;
             int i6 = Math.round(e0.right);
             if (sDK_INT >= 23) {
                i = i5;
                staticLayout = bi.a(text, obj1, i6, i5, uofi.i, uofi.h, uofi.k);
             }else {
                i = i5;
                staticLayout = zh.a(text, obj1, i6, i4, uofi.h);
             }
             i = (i != -1 && (staticLayout.getLineCount() > i && ((i = staticLayout.getLineCount() - 1) == text.length() || (e0.bottom - (float)staticLayout.getHeight()) > 0)))? 0: 1;
             if (i) {
                i2 = i2 + 1;
                i = 0;
                int i7 = i2;
                i2 = i1;
                i1 = i7;
             }else {
                i2 = i2 - 1;
                len = i2;
                i = 0;
             }
          }catch(java.lang.Exception e0){
          }
       }
       return uofi.f[i2];
    }
    public final void e(float p0,int p1){
       fi tj;
       Method method;
       Resources system = ((tj = this.j) == null)? Resources.getSystem(): tj.getResources();
       p0 = TypedValue.applyDimension(p1, p0, system.getDisplayMetrics());
       fi ti = this.i;
       if (ti.getPaint().getTextSize() - p0) {
          ti.getPaint().setTextSize(p0);
          boolean b = ai.a(ti);
          if (ti.getLayout() != null) {
             boolean b1 = false;
             this.b = b1;
             try{
                if ((method = fi.d("nullLayouts")) != null) {
                   Object[] objArray = new Object[b1];
                   method.invoke(ti, objArray);
                }
             }catch(java.lang.Exception e0){
             }
             if (!b) {
                ti.requestLayout();
             }else {
                ti.forceLayout();
             }
             ti.invalidate();
          }
       }
       return;
    }
    public final boolean f(){
       int i = 0;
       if (this.h() && this.a == 1) {
          if (this.g == null || !this.f.length) {
             int i1 = (int)Math.floor((double)((this.e - this.d) / this.c)) + 1;
             int[] ointArray = new int[i1];
             for (; i < i1; i = i + 1) {
                float f = (float)i * this.c;
                f = f + this.d;
                ointArray[i] = Math.round(f);
             }
             this.f = fi.b(ointArray);
          }
          this.b = true;
       }else {
          this.b = i;
       }
       return this.b;
    }
    public final boolean g(){
       fi tf = this.f;
       int len = tf.length;
       int i = 0;
       boolean b = (len > 0)? true: false;
       this.g = b;
       if (b) {
          this.a = 1;
          this.d = (float)tf[i];
          this.e = (float)tf[(len - 1)];
          this.c = 0xbf800000;
       }
       return b;
    }
    public final boolean h(){
       return (this.i instanceof pg ^ 0x01);
    }
    public final void i(float p0,float p1,float p2){
       String str = "px\) is less or equal to \(0px\)";
       int i = 0;
       if ((p0 - i) <= 0) {
          throw new IllegalArgumentException("Minimum auto-size text size \("+p0+str);
       }
       if ((p1 - p0) <= 0) {
          throw new IllegalArgumentException("Maximum auto-size text size \("+p1+"px\) is less or equal to minimum auto-size text size \("+p0+"px\)");
       }
       if ((p2 - i) <= 0) {
          throw new IllegalArgumentException("The auto-size step granularity \("+p2+str);
       }
       this.a = 1;
       this.d = p0;
       this.e = p1;
       this.c = p2;
       this.g = false;
       return;
    }
}
