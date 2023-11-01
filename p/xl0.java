package p.xl0;
import p.yx6;
import p.nq6;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import p.mp2;
import p.g54;
import p.k30;
import p.un5;
import p.am2;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.util.Xml;
import java.lang.Class;
import android.content.res.ColorStateList;
import p.jj0;
import org.xmlpull.v1.XmlPullParserException;
import java.lang.StringBuilder;
import p.ty0;
import android.content.res.TypedArray;
import p.ej4;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Float;
import p.zk;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.SweepGradient;
import android.graphics.RadialGradient;
import p.md7;
import p.fw;
import p.qe3;
import java.lang.StackTraceElement;
import android.graphics.Shader;
import p.wf0;
import java.lang.reflect.Array;
import java.lang.StringBuffer;

public final class xl0 implements yx6, nq6	// class@002c9a from classes.dex
{
    public final int a;
    public int b;
    public final Object c;
    public Object t;

    public void xl0(int p0,int p1,Serializable p2){
       this.a = p1;
       this.c = p2;
       this.b = p0;
       super();
    }
    public void xl0(int p0,String p1,mp2 p2){
       this.a = 5;
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
    }
    public void xl0(Object p0,Object p1,int p2,int p3){
       this.a = p3;
       this.c = p0;
       this.t = p1;
       this.b = p2;
       super();
    }
    public void xl0(g54 p0,k30 p1){
       this.a = 7;
       super();
       this.b = -1;
       this.c = p0;
       this.t = p1;
    }
    public void xl0(un5 p0,byte[] p1,int p2){
       this.a = 4;
       this.t = p0;
       super();
       this.c = p1;
       this.b = p2;
    }
    public void xl0(nq6[] p0){
       this.a = 6;
       super();
       this.b = 1024;
       this.c = p0;
       this.t = new am2(1024, 3);
    }
    public static xl0 a(Resources p0,int p1,Resources$Theme p2){
       int i;
       int i1;
       int i2;
       float f11;
       Shader$TileMode cLAMP;
       zk a;
       Resources resources = p0;
       Resources$Theme theme = p2;
       XmlResourceParser xml = p0.getXml(p1);
       AttributeSet uAttributeSe = Xml.asAttributeSet(xml);
       do {
          i = xml.next();
          i1 = 2;
          i2 = 1;
       } while (i != i1 && i != i2);
       if (i != i1) {
          throw new XmlPullParserException("No start tag found");
       }
       String name = xml.getName();
       name.getClass();
       String str = "gradient";
       TypedArray obj = null;
       int i3 = 0;
       if (!name.equals(str)) {
          if (name.equals("selector")) {
             ColorStateList uColorStateL = jj0.b(resources, xml, uAttributeSe, theme);
             return new xl0(obj, uColorStateL, uColorStateL.getDefaultColor(), i3);
          }else {
             throw new XmlPullParserException(xml.getPositionDescription()+": unsupported complex color tag "+name);
          }
       }else {
          name = xml.getName();
          if (!name.equals(str)) {
             throw new XmlPullParserException(xml.getPositionDescription()+": invalid gradient color tag "+name);
          }
          TypedArray typedArray = ej4.h0(resources, theme, uAttributeSe, ty0.i);
          float f = 0;
          float f1 = ej4.K(typedArray, xml, "startX", 8, f);
          float f2 = ej4.K(typedArray, xml, "startY", 9, f);
          float f3 = ej4.K(typedArray, xml, "endX", 10, f);
          float f4 = ej4.K(typedArray, xml, "endY", 11, f);
          float f5 = ej4.K(typedArray, xml, "centerX", 3, f);
          float f6 = ej4.K(typedArray, xml, "centerY", 4, f);
          int i4 = ej4.L(typedArray, xml, "type", i1, i3);
          i1 = (!ej4.R(xml, "startColor"))? 0: typedArray.getColor(i3, i3);
          boolean b = ej4.R(xml, "centerColor");
          int i5 = (!ej4.R(xml, "centerColor"))? 0: typedArray.getColor(7, i3);
          int i6 = (!ej4.R(xml, "endColor"))? 0: typedArray.getColor(i2, i3);
          float f7 = f5;
          i2 = ej4.L(typedArray, xml, "tileMode", 6, i3);
          float f8 = f6;
          typedArray.recycle();
          i = xml.getDepth() + 1;
          int i7 = 20;
          ArrayList uArrayList = new ArrayList(i7);
          float f9 = ej4.K(typedArray, xml, "gradientRadius", 5, 0);
          ArrayList uArrayList1 = new ArrayList(i7);
          while (true) {
             i7 = xml.next();
             float f10 = f3;
             if (i7 != 1) {
                int depth = xml.getDepth();
                f11 = f2;
                if (depth < i && i7 == 3) {
                label_0175 :
                   zk ozk = (uArrayList1.size() > 0)? new zk(uArrayList1, uArrayList): null;
                   if (ozk == null) {
                      ozk = (b)? new zk(i1, i5, i6): new zk(i1, i6);
                   }
                   theme = 1;
                   if (i4 != theme) {
                      xml = 2;
                      if (i4 != xml) {
                         zk ozk1 = ozk.a;
                         zk ozk2 = ozk.b;
                         if (i2 != theme) {
                            cLAMP = (i2 != xml)? Shader$TileMode.CLAMP: Shader$TileMode.MIRROR;
                         }else {
                            cLAMP = Shader$TileMode.REPEAT;
                         }
                         LinearGradient uAttributeSe1 = new LinearGradient(f1, f11, f10, f4, ozk1, ozk2, cLAMP);
                         break ;
                      }else {
                         SweepGradient sweepGradien = new SweepGradient(f7, f8, ozk.a, ozk.b);
                         break ;
                      }
                   }else {
                      float f12 = f7;
                      float f13 = f8;
                      if ((f9) > 0) {
                         a = ozk.a;
                         zk ozk3 = ozk.b;
                         if (i2 != 1) {
                            cLAMP = (i2 != 2)? Shader$TileMode.CLAMP: Shader$TileMode.MIRROR;
                         }else {
                            cLAMP = Shader$TileMode.REPEAT;
                         }
                         RadialGradient uAttributeSe2 = new RadialGradient(f12, f13, f9, a, ozk3, cLAMP);
                         break ;
                      }else {
                         throw new XmlPullParserException("<gradient> tag requires \'gradientRadius\' attribute with radial type");
                      }
                   }
                }else if(i7 != 2 || (depth > i || !xml.getName().equals("item"))){
                   obj = ej4.h0(resources, theme, uAttributeSe, ty0.j);
                   int i8 = 1;
                   boolean b1 = obj.hasValue(i8);
                   if (obj.hasValue(0) && b1) {
                      obj.recycle();
                      uArrayList1.add(Integer.valueOf(obj.getColor(0, 0)));
                      uArrayList.add(Float.valueOf(obj.getFloat(i8, 0)));
                   }else {
                      throw new XmlPullParserException(xml.getPositionDescription()+": <item> tag requires a \'color\' attribute and a \'offset\' attribute!");
                   }
                }
                f3 = f10;
                f2 = f11;
             }else {
                f11 = f2;
                goto label_0175 ;
             }
          }
          return new xl0(uAttributeSe, null, 0, 0);
       }
    }
    public final Object b(){
       this.c.d.a(this.t, (this.b + 1));
       return null;
    }
    public final StackTraceElement[] c(StackTraceElement[] p0){
       if (p0.length <= this.b) {
          return p0;
       }
       xl0 tc = this.c;
       int len = tc.length;
       StackTraceElement[] stackTraceEl = p0;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = tc[i];
          if (stackTraceEl.length <= this.b) {
             break ;
          }else {
             stackTraceEl = oobject.c(p0);
          }
       }
       if (stackTraceEl.length > this.b) {
          stackTraceEl = this.t.c(stackTraceEl);
       }
       return stackTraceEl;
    }
    public final boolean d(){
       boolean b;
       if (this.c == null) {
          xl0 tt = this.t;
          if (tt != null && tt.isStateful()) {
             b = true;
          label_0018 :
             return b;
          }
       }
       b = false;
       goto label_0018 ;
    }
    public final boolean e(int[] p0){
       boolean colorForStat;
       if (this.d()) {
          xl0 tt = this.t;
          if ((colorForStat = tt.getColorForState(p0, tt.getDefaultColor())) != this.b) {
             this.b = colorForStat;
             colorForStat = true;
          label_001b :
             return colorForStat;
          }
       }
       colorForStat = false;
       goto label_001b ;
    }
    public final boolean equals(Object p0){
       boolean b;
       switch (this.a){
           case 1:
             if (p0 == this) {
             label_0040 :
                b = true;
             }else {
                b = false;
                if (wf0.k(this.c, p0) && Array.getLength(p0) == this.b) {
                   int i = 0;
                   while (true) {
                      if (i < this.b) {
                         Object obj = Array.get(this.t, i);
                         Object obj1 = Array.get(p0, i);
                         if (obj == obj1 || (obj == null || obj.equals(obj1))) {
                            i = i + 1;
                         }
                      }else {
                         goto label_0040 ;
                      }
                   }
                }
             }
             break;
           default:
             return super.equals(p0);
       }
       return b;
    }
    public final String toString(){
       switch (this.a){
           case 9:
           default:
             return super.toString();
       }
       return this.t+":"+this.b;
    }
}
