package p.mg4;
import java.lang.ThreadLocal;
import android.content.Context;
import p.eh4;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.res.TypedArray;
import android.content.res.Resources;
import p.mf4;
import android.util.TypedValue;
import p.vg4;
import android.os.Parcelable;
import java.io.Serializable;
import p.pg4;
import p.av6;
import java.lang.Class;
import p.rg4;
import p.tg4;
import p.sg4;
import java.lang.Enum;
import p.qg4;
import p.ug4;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Integer;
import org.xmlpull.v1.XmlPullParserException;
import p.ir2;
import java.lang.Float;
import java.lang.Boolean;
import android.util.DisplayMetrics;
import java.lang.Long;
import java.lang.NullPointerException;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import p.gg4;
import org.xmlpull.v1.XmlPullParser;
import p.dh4;
import p.io2;
import java.util.Map;
import p.eg4;
import p.lf4;
import p.ng4;
import android.os.Bundle;
import android.os.BaseBundle;
import p.u6;
import p.jo6;
import java.lang.UnsupportedOperationException;
import p.ig4;
import p.lv1;
import android.util.Xml;

public final class mg4	// class@001e8e from classes.dex
{
    public final Context a;
    public final eh4 b;
    public static final ThreadLocal c;

    static {
       mg4.c = new ThreadLocal();
    }
    public void mg4(Context p0,eh4 p1){
       co5.o(p0, "context");
       co5.o(p1, "navigatorProvider");
       super();
       this.a = p0;
       this.b = p1;
    }
    public static mf4 c(TypedArray p0,Resources p1,int p2){
       TypedValue typedValue;
       String resourcePack;
       pg4 opg4;
       pg4 opg41;
       TypedArray typedArray1;
       pg4 opg42;
       pg4 opg43;
       pg4 opg44;
       TypedValue resourceId;
       Integer integer;
       boolean b2;
       Class componentTyp1;
       rg4 org4;
       rg4 org41;
       TypedValue resourceId1;
       boolean b3;
       Class uClass;
       TypedArray typedArray = p0;
       boolean booleanx = typedArray.getBoolean(3, false);
       ThreadLocal c = mg4.c;
       if ((typedValue = c.get()) == null) {
          typedValue = new TypedValue();
          c.set(typedValue);
       }
       String str = typedArray.getString(2);
       pg4 h = vg4.h;
       pg4 l = vg4.l;
       pg4 j = vg4.j;
       pg4 f = vg4.f;
       pg4 c1 = vg4.c;
       pg4 d = vg4.d;
       pg4 e = vg4.e;
       pg4 i = vg4.i;
       pg4 k = vg4.k;
       pg4 g = vg4.g;
       pg4 b = vg4.b;
       Parcelable parcelable = Parcelable.class;
       boolean b1 = booleanx;
       Serializable serializable = Serializable.class;
       int i1 = 0;
       if (str != null) {
          resourcePack = p1.getResourcePackageName(p2);
          TypedValue typedValue1 = typedValue;
          if (co5.c(b.b(), str)) {
             opg4 = h;
             opg41 = b;
          }else if(co5.c(d.b(), str)){
             opg4 = h;
             opg41 = d;
          }else if(co5.c(e.b(), str)){
             opg4 = h;
             opg41 = e;
          }else if(co5.c(f.b(), str)){
             opg4 = h;
             opg41 = f;
          }else if(co5.c(i.b(), str)){
             opg4 = h;
             opg41 = i;
          }else if(co5.c(j.b(), str)){
             opg4 = h;
             opg41 = j;
          }else if(co5.c(k.b(), str)){
             if (co5.c(l.b(), str)) {
                opg41 = l;
             }else if(co5.c(g.b(), str)){
                opg41 = g;
             }else if(co5.c(h.b(), str)){
                opg41 = h;
             }else if(co5.c(c1.b(), str)){
                opg41 = c1;
             }else if(!str.length()){
                typedValue = 1;
             }else {
                uClass = 0;
             }
             if (!typedValue) {
                try{
                   opg4 = h;
                   resourcePack = (av6.D0(str, ".", false) && resourcePack != null)? resourcePack.concat(str): str;
                   b3 = false;
                   if (av6.g0(str, "[]", b3)) {
                      resourcePack = resourcePack.substring(b3, (resourcePack.length() - 2));
                      co5.l(resourcePack, "this as java.lang.String…ing\(startIndex, endIndex\)");
                      uClass = Class.forName(resourcePack);
                      if (parcelable.isAssignableFrom(uClass)) {
                         org4 = new rg4(uClass);
                      }else if(serializable.isAssignableFrom(uClass)){
                         opg41 = new tg4(uClass);
                      }
                   }else {
                      uClass = Class.forName(resourcePack);
                      if (parcelable.isAssignableFrom(uClass)) {
                         opg41 = new sg4(uClass);
                      }else if(Enum.class.isAssignableFrom(uClass)){
                         opg41 = new qg4(uClass);
                      }else if(serializable.isAssignableFrom(uClass)){
                         opg41 = new ug4(uClass);
                      }
                   }
                   throw new IllegalArgumentException(resourcePack+" is not Serializable or Parcelable.");
                }catch(java.lang.ClassNotFoundException e0){
                   throw new RuntimeException(e0);
                }
             }
             opg4 = h;
          }
          opg4 = h;
          opg41 = k;
          typedArray1 = p0;
          typedValue = typedValue1;
          opg42 = l;
       }else {
          opg4 = h;
          typedArray1 = p0;
          opg42 = l;
          opg41 = i1;
       }
       if (typedArray1.getValue(1, typedValue)) {
          String str1 = "\' for ";
          opg43 = j;
          String str2 = "unsupported value \'";
          opg44 = f;
          f = 16;
          if (opg41 == c1) {
             if ((resourceId = typedValue.resourceId) == null) {
                if (typedValue.type == f && typedValue.data == null) {
                   resourceId = 0;
                }else {
                   throw new XmlPullParserException(str2+typedValue.string+str1+opg41.b()+". Must be a reference to a resource.");
                }
             }
             integer = Integer.valueOf(resourceId);
             c1 = opg41;
          }else if((resourceId1 = typedValue.resourceId) != null){
             if (opg41 == null) {
                integer = Integer.valueOf(resourceId1);
             }else {
                throw new XmlPullParserException(str2+typedValue.string+str1+opg41.b()+". You must use a \""+c1.b()+"\" type to reference other resources.");
             }
          }else if(opg41 == k){
             b2 = 1;
             integer = typedArray1.getString(b2);
             c1 = opg41;
          }else {
             b2 = true;
             if ((resourceId = typedValue.type) != 3) {
                if (resourceId != 4) {
                   if (resourceId != 5) {
                      if (resourceId != 18) {
                         if (resourceId >= 16 && resourceId <= 31) {
                            if (opg41 == g) {
                               c1 = ir2.n(typedValue, opg41, g, str, "float");
                               integer = Float.valueOf((float)typedValue.data);
                            }else {
                               c1 = ir2.n(typedValue, opg41, b, str, "integer");
                               integer = Integer.valueOf(typedValue.data);
                            }
                         }else {
                            throw new XmlPullParserException("unsupported argument type "+typedValue.type);
                         }
                      }else {
                         c1 = ir2.n(typedValue, opg41, i, str, "boolean");
                         b3 = (typedValue.data != null)? true: false;
                         integer = Boolean.valueOf(b3);
                      }
                   }else {
                      c1 = ir2.n(typedValue, opg41, b, str, "dimension");
                      integer = Integer.valueOf((int)typedValue.getDimension(p1.getDisplayMetrics()));
                   }
                }else {
                   c1 = ir2.n(typedValue, opg41, g, str, "float");
                   integer = Float.valueOf(typedValue.getFloat());
                }
             }else {
                str = typedValue.string.toString();
                if (opg41 == null) {
                   resourcePack = "value";
                   try{
                      co5.o(str, resourcePack);
                      b.c(str);
                      opg41 = b;
                   }catch(java.lang.IllegalArgumentException e0){
                      try{
                         e.c(str);
                         opg41 = e;
                      }catch(java.lang.IllegalArgumentException e0){
                         try{
                            g.c(str);
                            opg41 = g;
                         }catch(java.lang.IllegalArgumentException e0){
                            try{
                               i.c(str);
                               opg41 = i;
                            }catch(java.lang.IllegalArgumentException e0){
                               opg41 = k;
                            }
                         }
                      }
                   }
                }
                c1 = opg41;
                integer = c1.c(str);
             }
          }
          b2 = true;
       }else {
          opg43 = j;
          opg44 = f;
          b2 = true;
          c1 = opg41;
          integer = i1;
       }
       if (integer == null) {
          integer = i1;
          b2 = false;
       }
       if (c1 != null) {
          i1 = c1;
       }
       if (i1 == null) {
          if (integer instanceof Integer) {
             h = b;
          }else if(integer instanceof int[]){
             h = d;
          }else if(integer instanceof Long){
             h = e;
          }else if(integer instanceof long[]){
             h = opg44;
          }else if(integer instanceof Float){
             h = g;
          }else if(integer instanceof float[]){
             h = opg4;
          }else if(integer instanceof Boolean){
             h = i;
          }else if(integer instanceof boolean[]){
             h = opg43;
          }else if(!integer instanceof String && integer != null){
             if (integer instanceof Object[] && integer instanceof String[]) {
                h = opg42;
             }else if(integer.getClass().isArray()){
                Class componentTyp = integer.getClass().getComponentType();
                co5.i(componentTyp);
                if (parcelable.isAssignableFrom(componentTyp)) {
                   if ((componentTyp1 = integer.getClass().getComponentType()) != null) {
                      org4 = new rg4(componentTyp1);
                   }else {
                      throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                   }
                }else if(integer.getClass().isArray()){
                   componentTyp = integer.getClass().getComponentType();
                   co5.i(componentTyp);
                   if (serializable.isAssignableFrom(componentTyp)) {
                      if ((componentTyp1 = integer.getClass().getComponentType()) != null) {
                         org4 = new tg4(componentTyp1);
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                      }
                   }
                }
                if (integer instanceof Parcelable) {
                   org4 = new sg4(integer.getClass());
                }else if(integer instanceof Enum){
                   org4 = new qg4(integer.getClass());
                }else if(integer instanceof Serializable){
                   org4 = new ug4(integer.getClass());
                }else {
                   throw new IllegalArgumentException("Object of type "+integer.getClass().getName()+" is not supported for navigation arguments.");
                }
             }else {
             }
             org41 = org4;
          }else {
             h = k;
          }
       }else {
          org41 = i1;
       }
       return new mf4(h, b1, integer, b2);
    }
    public final gg4 a(Resources p0,XmlResourceParser p1,AttributeSet p2,int p3){
       int i3;
       TypedArray typedArray;
       String packageName;
       mg4 omg41;
       int i8;
       String str6;
       mf4 c;
       int i9;
       mg4 omg42;
       mg4 omg4 = this;
       Resources resources = p0;
       AttributeSet uAttributeSe = p2;
       int i = p3;
       String name = p1.getName();
       co5.l(name, "parser.name");
       gg4 ogg4 = omg4.b.b(name).a();
       mg4 a = omg4.a;
       ogg4.k(a, uAttributeSe);
       int i1 = 1;
       int i2 = p1.getDepth() + i1;
       while ((i3 = p1.next()) != i1) {
          int depth = p1.getDepth();
          ng4 int i4 = 3;
          if (depth < i2 && i3 == i4) {
             break ;
          }else if(i3 != 2 || depth > i2){
             continue ;
          }else {
             String name1 = p1.getName();
             String str = "argument";
             int[] a1 = io2.A;
             int i5 = 0;
             String str1 = "Arguments must have a name";
             String str2 = "res.obtainAttributes\(att… R.styleable.NavArgument\)";
             if (co5.c(str, name1)) {
                typedArray = resources.obtainAttributes(uAttributeSe, a1);
                co5.l(typedArray, str2);
                if ((str = typedArray.getString(i5)) != null) {
                   ogg4.x.put(str, mg4.c(typedArray, resources, i));
                   typedArray.recycle();
                }else {
                   throw new XmlPullParserException(str1);
                }
             }else if(co5.c("deepLink", name1)){
                typedArray = resources.obtainAttributes(uAttributeSe, io2.B);
                co5.l(typedArray, "res.obtainAttributes\(att… R.styleable.NavDeepLink\)");
                str = typedArray.getString(i4);
                String str3 = typedArray.getString(i1);
                str2 = typedArray.getString(2);
                String str4 = (str != null && str.length())? 0: 1;
                if (i6) {
                   str4 = (str3 != null && str3.length())? 0: 1;
                   if (i6) {
                      str4 = (str2 != null && str2.length())? 0: 1;
                      if (i6) {
                         throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                      }
                   }
                }
                str4 = "${applicationId}";
                String str5 = "context.packageName";
                if (str != null) {
                   str1 = a.getPackageName();
                   co5.l(str1, str5);
                   str = av6.x0(str, str4, str1);
                }else {
                   str = null;
                }
                str1 = (str3 != null && str3.length())? 0: 1;
                if (!str1) {
                   str1 = a.getPackageName();
                   co5.l(str1, str5);
                   str3 = av6.x0(str3, str4, str1);
                   if (str3.length() > 0) {
                      i5 = 1;
                   }
                   if (!i5) {
                      throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
                   }
                }else {
                   str3 = null;
                }
                if (str2 != null) {
                   packageName = a.getPackageName();
                   co5.l(packageName, str5);
                   str1 = av6.x0(str2, str4, packageName);
                }else {
                   str1 = null;
                }
                ogg4.a(new eg4(str, str3, str1));
                typedArray.recycle();
             }else if(co5.c("action", name1)){
                typedArray = a.obtainStyledAttributes(uAttributeSe, io2.z, i5, i5);
                int i6 = typedArray.getResourceId(i5, i5);
                lf4 olf4 = new lf4(typedArray.getResourceId(i1, i5));
                i4 = new ng4(typedArray.getBoolean(4, i5), typedArray.getBoolean(10, i5), typedArray.getResourceId(7, -1), typedArray.getBoolean(8, false), typedArray.getBoolean(9, false), typedArray.getResourceId(2, -1), typedArray.getResourceId(3, -1), typedArray.getResourceId(5, -1), typedArray.getResourceId(6, -1));
                olf4.b = i4;
                Bundle uBundle = new Bundle();
                omg41 = a;
                int i7 = 1;
                i5 = p1.getDepth() + i7;
                i8 = i2;
                while (true) {
                   if ((i2 = p1.next()) != i7 && ((i7 = p1.getDepth()) >= i5 && i2 == 3)) {
                      if (i2 == 2 && (i7 <= i5 && co5.c(str, p1.getName()))) {
                         TypedArray typedArray1 = resources.obtainAttributes(uAttributeSe, a1);
                         co5.l(typedArray1, str2);
                         if ((str6 = typedArray1.getString(0)) != null) {
                            mf4 omf4 = mg4.c(typedArray1, resources, i);
                            if ((c = omf4.c) != null && c != null) {
                               omf4.a.d(uBundle, str6, omf4.d);
                            }
                            typedArray1.recycle();
                         }else {
                            throw new XmlPullParserException(str1);
                         }
                      }
                      i7 = 1;
                      i = p3;
                   }else if(!uBundle.isEmpty()){
                      olf4.c = uBundle;
                   }
                   if (i9 = ogg4 instanceof u6 ^ 1) {
                      packageName = (i6)? 1: 0;
                      if (packageName) {
                         ogg4.w.f(i6, olf4);
                         typedArray.recycle();
                         i1 = this;
                      }else {
                         throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
                      }
                   }else {
                      throw new UnsupportedOperationException("Cannot add action "+i6+" to "+ogg4+" as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                   }
                }
                return ogg4;
             }else {
                omg41 = a;
                i8 = i2;
                if (co5.c("include", name1) && ogg4 instanceof ig4) {
                   TypedArray typedArray2 = resources.obtainAttributes(uAttributeSe, lv1.O);
                   co5.l(typedArray2, "res.obtainAttributes\(att…n.R.styleable.NavInclude\)");
                   omg42 = this;
                   ogg4.l(omg42.b(typedArray2.getResourceId(0, 0)));
                   typedArray2.recycle();
                }else {
                   omg42 = this;
                   if (ogg4 instanceof ig4) {
                      ogg4.l(this.a(p0, p1, p2, p3));
                   }
                }
             }
             i = p3;
             omg4 = i1;
             a = omg41;
             i2 = i8;
             i1 = 1;
          }
       }
    }
    public final ig4 b(int p0){
       int i;
       int i1;
       Resources resources = this.a.getResources();
       XmlResourceParser xml = resources.getXml(p0);
       co5.l(xml, "res.getXml\(graphResId\)");
       AttributeSet uAttributeSe = Xml.asAttributeSet(xml);
       try{
          do {
             i = xml.next();
             i1 = 2;
          } while (i != i1 && i != 1);
          if (i != i1) {
             throw new XmlPullParserException("No start tag found");
          }
          String name = xml.getName();
          co5.l(uAttributeSe, "attrs");
          gg4 ogg4 = this.a(resources, xml, uAttributeSe, p0);
          if (!ogg4 instanceof ig4) {
             throw new IllegalArgumentException("Root element <"+name+"> did not inflate into a NavGraph".toString());
          }
          xml.close();
          return ogg4;
       }catch(java.lang.Exception e2){
          throw new RuntimeException("Exception inflating "+resources.getResourceName(p0)+" line "+xml.getLineNumber(), e2);
       }
    }
}
