package p.ia7;
import java.io.Serializable;
import p.he3;
import p.fa7;
import java.lang.String;
import java.lang.Object;
import java.lang.Comparable;
import java.lang.Class;
import java.lang.Enum;
import p.zf3;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import p.bi6;
import p.ai3;
import p.ua4;
import p.ko1;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.GenericArrayType;
import p.tk;
import java.lang.reflect.Array;
import java.lang.reflect.TypeVariable;
import p.cw5;
import java.util.Arrays;
import java.lang.IllegalArgumentException;
import p.tp2;
import java.lang.reflect.WildcardType;
import java.lang.StringBuilder;
import p.da7;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import p.wf0;
import java.util.Properties;
import p.k14;
import java.util.Map;
import java.util.List;
import java.util.Collection;
import p.zi0;
import java.util.concurrent.atomic.AtomicReference;
import p.ms5;
import java.util.Iterator;
import java.lang.IllegalStateException;

public final class ia7 implements Serializable	// class@001959 from classes.dex
{
    public final ai3 a;
    public static final Class A;
    public static final Class B;
    public static final Class C;
    public static final Class D;
    public static final bi6 E;
    public static final bi6 F;
    public static final bi6 G;
    public static final bi6 H;
    public static final bi6 I;
    public static final bi6 J;
    public static final bi6 K;
    public static final bi6 L;
    public static final bi6 M;
    public static final he3[] b;
    public static final ia7 c;
    public static final fa7 t;
    public static final Class v;
    public static final Class w;
    public static final Class x;
    public static final Class y;
    public static final Class z;

    static {
       he3[] ohe3Array = new he3[0];
       ia7.b = ohe3Array;
       ia7.c = new ia7();
       ia7.t = fa7.x;
       ia7.v = String.class;
       ia7.w = Object.class;
       ia7.x = Comparable.class;
       ia7.y = Class.class;
       ia7.z = Enum.class;
       ia7.A = zf3.class;
       Class tYPE = Boolean.TYPE;
       ia7.B = tYPE;
       Class tYPE1 = Integer.TYPE;
       ia7.C = tYPE1;
       Class tYPE2 = Long.TYPE;
       ia7.D = tYPE2;
       ia7.E = new bi6(tYPE);
       ia7.F = new bi6(tYPE1);
       ia7.G = new bi6(tYPE2);
       ia7.H = new bi6(String.class);
       ia7.I = new bi6(Object.class);
       ia7.J = new bi6(Comparable.class);
       ia7.K = new bi6(Enum.class);
       ia7.L = new bi6(Class.class);
       ia7.M = new bi6(zf3.class);
    }
    public void ia7(){
       super();
       this.a = new ai3(16, 200);
       ua4 oua4 = new ua4(this);
    }
    public static bi6 a(Class p0){
       if (p0.isPrimitive()) {
          if (p0 == ia7.B) {
             return ia7.E;
          }else if(p0 == ia7.C){
             return ia7.F;
          }else if(p0 == ia7.D){
             return ia7.G;
          }
       }else if(p0 == ia7.v){
          return ia7.H;
       }else if(p0 == ia7.w){
          return ia7.I;
       }else if(p0 == ia7.A){
          return ia7.M;
       }
       return null;
    }
    public static bi6 f(){
       ia7.c.getClass();
       return ia7.I;
    }
    public final he3 b(ko1 p0,Type p1,fa7 p2){
       he3 ohe3;
       Class rawType;
       Type[] actualTypeAr;
       int i1;
       fa7 t;
       object oobject;
       cw5 a1;
       String[] stringArray;
       if (p1 instanceof Class) {
          ohe3 = this.c(p0, p1, ia7.t);
       }else {
          int i = 0;
          if (p1 instanceof ParameterizedType) {
             if ((rawType = p1.getRawType()) == ia7.z) {
                ohe3 = ia7.K;
             }else if(rawType == ia7.x){
                ohe3 = ia7.J;
             }else if(rawType == ia7.y){
                ohe3 = ia7.L;
             }else if((actualTypeAr = p1.getActualTypeArguments()) == null){
                i1 = 0;
             }else {
                i1 = actualTypeAr.length;
             }
             if (!i1) {
                t = ia7.t;
             }else {
                he3[] ohe3Array = new he3[i1];
                for (; i < i1; i = i + 1) {
                   ohe3Array[i] = this.b(p0, actualTypeAr[i], p2);
                }
                t = fa7.b(rawType, ohe3Array);
             }
             ohe3 = this.c(p0, rawType, t);
          }else if(p1 instanceof he3){
             return p1;
          }else if(p1 instanceof GenericArrayType){
             he3 ohe31 = this.b(p0, p1.getGenericComponentType(), p2);
             tk ohe31.a = new tk(ohe31, p2, Array.newInstance(ohe31.a, i), null, null, false);
          }else if(p1 instanceof TypeVariable){
             String name = p1.getName();
             if (p2 != null) {
                fa7 a = p2.a;
                int len = a.length;
                int i2 = 0;
                while (true) {
                   if (i2 < len) {
                      if (name.equals(a[i2])) {
                         oobject = p2.b[i2];
                         if (oobject instanceof cw5 && (a1 = oobject.A) != null) {
                            oobject = a1;
                         label_00b2 :
                            if (oobject != null) {
                               ohe3 = oobject;
                               break ;
                            }else {
                               a = p2.c;
                               len = 1;
                               if (a != null) {
                                  i2 = a.length;
                                  while (true) {
                                     if ((i2 = i2 - 1) >= 0) {
                                        if (name.equals(a[i2])) {
                                           oobject = 1;
                                        label_00cb :
                                           if (oobject) {
                                              ohe3 = ia7.I;
                                              break ;
                                           }else if((a = p2.c) == null){
                                              i2 = 0;
                                           }else {
                                              i2 = a.length;
                                           }
                                           stringArray = (!i2)? new String[len]: Arrays.copyOf(a, (i2 + 1));
                                           stringArray[i2] = name;
                                           _monitor_enter(p1);
                                           _monitor_exit(p1);
                                           ohe3 = this.b(p0, p1.getBounds()[i], new fa7(p2.a, p2.b, stringArray));
                                           break ;
                                        }else {
                                           continue ;
                                        }
                                     }
                                  }
                               }
                               stringArray = 0;
                               goto label_00cb ;
                            }
                         }else {
                            goto label_00b2 ;
                         }
                      }else {
                         i2 = i2 + 1;
                      }
                   }else {
                      oobject = null;
                      goto label_00b2 ;
                   }
                }
             }else {
                throw new IllegalArgumentException(tp2.m("Null `bindings` passed \(type variable \"", name, "\"\)"));
             }
          }else if(p1 instanceof WildcardType){
             ohe3 = this.b(p0, p1.getUpperBounds()[i], p2);
          }else {
             String str = "Unrecognized Type: ";
             String str1 = (p1 == null)? "[null]": p1.toString();
             throw new IllegalArgumentException(str+str1);
          }
       }
       return ohe3;
    }
    public final he3 c(ko1 p0,Class p1,fa7 p2){
       bi6 uobi6;
       he3 ohe3;
       ko1 oko11;
       tk v8;
       ko1 oko12;
       cw5 uocw5;
       he3[] ohe3Array;
       Properties properties1;
       k14 v17;
       int i1;
       bi6 uobi61;
       bi6 uobi62;
       he3 ohe32;
       int len;
       he3 ohe33;
       he3 ohe34;
       int i4;
       List list1;
       Type genericSuper;
       ko1 oko13;
       ia7 oia7 = this;
       ko1 oko1 = p0;
       Class uClass = p1;
       fa7 uofa7 = p2;
       if ((uobi6 = ia7.a(p1)) != null) {
          return uobi6;
       }
       da7 uoda7 = (uofa7 && !p2.e())? new da7(uClass, uofa7.b, uofa7.t): uClass;
       ia7 a = oia7.a;
       if ((ohe3 = a.b.get(uoda7)) != null) {
          return ohe3;
       }else {
          fa7 t = ia7.t;
          if (!oko1) {
             oko11 = new ko1(uClass);
          }else if(oko1.c == uClass){
             oko13 = oko1;
          }else {
             oko13 = oko1.b;
             while (true) {
                if (oko13 != null) {
                   if (oko13.c != uClass) {
                      oko13 = oko13.b;
                   }
                }else {
                   oko13 = null;
                }
             }
          }
          if (oko13 != null) {
             uocw5 = new cw5(uClass, t);
             if (oko13.t == null) {
                oko13.t = new ArrayList();
             }
             oko13.t.add(uocw5);
             return uocw5;
          }else {
             oko11 = new ko1(oko1, uClass);
          }
          int i = 0;
          if (p1.isArray()) {
             ohe3 = oia7.b(oko11, p1.getComponentType(), uofa7);
             v8 = new tk(ohe3, p2, Array.newInstance(ohe3.a, i), null, null, false);
             oko12 = oko11;
          }else if(p1.isInterface()){
             ohe3Array = oia7.d(oko11, uClass, uofa7);
             i = 0;
          }else if((genericSuper = p1.getGenericSuperclass()) == null){
             genericSuper = 0;
          }else {
             he3 ohe36 = oia7.b(oko11, genericSuper, uofa7);
          }
          he3 ohe35 = genericSuper;
          ohe3Array = oia7.d(oko11, uClass, uofa7);
          he3[] ohe3Array1 = ohe3Array;
          he3 ohe31 = i;
          bi6 h = ia7.H;
          Properties properties = Properties.class;
          if (uClass == properties) {
             properties1 = properties;
             oko12 = oko11;
             v17 = new k14(p1, p2, ohe31, ohe3Array1, h, h, 0, 0, 0);
             ohe3 = v17;
             i1 = ohe31;
             ohe3Array1 = ohe3Array1;
          }else {
             properties1 = properties;
             oko12 = oko11;
             if (i1 = ohe31) {
                ohe3 = i1.m(uClass, uofa7, i1, ohe3Array1);
             }
          }
          if (ohe3 == null) {
             fa7 uofa71 = (uofa7 == null)? t: uofa7;
             bi6 i2 = ia7.I;
             int i3 = 1;
             if (uClass == Map.class) {
                if (uClass != properties1) {
                   List list = uofa71.d();
                   if (i4 = list.size()) {
                      int i5 = 2;
                      if (i4 != i5) {
                         Object[] objArray = new Object[4];
                         objArray[0] = wf0.p(p1);
                         objArray[1] = Integer.valueOf(i4);
                         String str = (i4 == i3)? "": "s";
                         objArray[i5] = str;
                         objArray[3] = uofa71;
                         throw new IllegalArgumentException(String.format("Strange Map type %s with %d type parameter%s \(%s\), can not resolve", objArray));
                      }else {
                         uobi61 = list.get(0);
                         uobi62 = list.get(i3);
                      label_0158 :
                         ohe3Array1 = ohe3Array1;
                         ohe32 = i1;
                         v17 = new k14(p1, uofa71, i1, ohe3Array1, uobi61, uobi62, null, 0, 0);
                      }
                   }else {
                      h = i2;
                   }
                }
                uobi61 = h;
                uobi62 = uobi61;
                goto label_0158 ;
             }else {
                ohe3Array1 = ohe3Array1;
                ohe32 = i1;
                len = 0;
                String str1 = ": cannot determine type parameters";
                if (uClass == Collection.class) {
                   list1 = uofa71.d();
                   if (!list1.isEmpty()) {
                      if (list1.size() == i3) {
                         i2 = list1.get(len);
                      }else {
                         throw new IllegalArgumentException(tp2.j(uClass, "Strange Collection type ", str1));
                      }
                   }
                   uobi61 = i2;
                   zi0 t1 = new zi0(p1, uofa71, ohe32, ohe3Array1, uobi61, null, null, false);
                }else if(uClass == AtomicReference.class){
                   list1 = uofa71.d();
                   if (!list1.isEmpty()) {
                      if (list1.size() == i3) {
                         i2 = list1.get(len);
                      }else {
                         throw new IllegalArgumentException(tp2.j(uClass, "Strange Reference type ", str1));
                      }
                   }
                   uobi61 = i2;
                   ms5 t2 = new ms5(p1, uofa71, ohe32, ohe3Array1, uobi61, null, null, null, false);
                }else {
                   ms5 oms5 = null;
                }
             }
             if (t == null) {
                ohe3Array = ohe3Array1;
                len = ohe3Array.length;
                i = 0;
                while (true) {
                   if (i < len) {
                      ohe33 = ohe32;
                      if ((ohe34 = ohe3Array[i].m(uClass, uofa7, ohe33, ohe3Array)) != null) {
                      label_0211 :
                         if (ohe34 == null) {
                            ohe3 = new bi6(uClass, uofa7, ohe33, ohe3Array);
                         }else {
                            ohe31 = ohe34;
                         }
                      }else {
                         i = i + 1;
                         ohe32 = ohe33;
                      }
                   }else {
                      ohe33 = ohe32;
                      ohe34 = null;
                      goto label_0211 ;
                   }
                }
             }else {
                k14 ok14 = t;
             }
          }
          ohe31 = ohe3;
          if ((oko12 = oko12.t) != null) {
             Iterator iterator = oko12.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   uocw5 = iterator.next();
                   if (uocw5.A == null) {
                      uocw5.A = v8;
                   }else {
                      throw new IllegalStateException("Trying to re-set self reference; old value = "+uocw5.A+", new = "+v8);
                   }
                }
             }
          }
          if (!v8.h()) {
             a.a(uoda7, v8);
          }
          return v8;
       }
    }
    public final he3[] d(ko1 p0,Class p1,fa7 p2){
       Type[] genericInter;
       if ((genericInter = p1.getGenericInterfaces()) == null || !genericInter.length) {
          return ia7.b;
       }
       int len = genericInter.length;
       he3[] ohe3Array = new he3[len];
       for (int i = 0; i < len; i = i + 1) {
          ohe3Array[i] = this.b(p0, genericInter[i], p2);
       }
       return ohe3Array;
    }
    public final he3 e(Type p0){
       return this.b(null, p0, ia7.t);
    }
}
