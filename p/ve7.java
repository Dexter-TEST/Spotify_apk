package p.ve7;
import java.util.Set;
import java.util.Collections;
import java.lang.reflect.Type;
import java.lang.String;
import java.lang.Class;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.LinkedHashMap;
import java.lang.Boolean;
import java.lang.Object;
import java.util.Map;
import java.lang.Byte;
import java.lang.Character;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Short;
import java.lang.Void;
import p.ve7$a;
import java.lang.reflect.ParameterizedType;
import p.ve7$b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import p.ve7$c;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.GenericDeclaration;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.JsonAdapter;
import p.bf3;
import java.lang.annotation.Annotation;
import p.ya7;
import java.lang.ClassLoader;
import java.lang.reflect.Constructor;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.util.NoSuchElementException;
import java.lang.reflect.AnnotatedElement;
import p.ig3;
import java.util.LinkedHashSet;
import p.ye3;
import com.squareup.moshi.b;
import p.hf3;
import java.util.Collection;
import java.lang.Error;

public abstract class ve7	// class@0029de from classes.dex
{
    public static final Set a;
    public static final Type[] b;
    public static final Class c;
    private static final Class d;
    private static final Map e;

    static {
       Class uClass;
       ve7.a = Collections.emptySet();
       Type[] typeArray = new Type[0];
       ve7.b = typeArray;
       try{
          typeArray = 0;
          uClass = Class.forName(ve7.getKotlinMetadataClassName());
       }catch(java.lang.ClassNotFoundException e0){
          uClass = e0;
       }
       ve7.d = uClass;
       try{
          DefaultConstructorMarker uDefaultCons = DefaultConstructorMarker.class;
          ve7.c = e0;
          LinkedHashMap uDefaultCons1 = new LinkedHashMap(16);
          uDefaultCons1.put(Boolean.TYPE, Boolean.class);
          uDefaultCons1.put(Byte.TYPE, Byte.class);
          uDefaultCons1.put(Character.TYPE, Character.class);
          uDefaultCons1.put(Double.TYPE, Double.class);
          uDefaultCons1.put(Float.TYPE, Float.class);
          uDefaultCons1.put(Integer.TYPE, Integer.class);
          uDefaultCons1.put(Long.TYPE, Long.class);
          uDefaultCons1.put(Short.TYPE, Short.class);
          uDefaultCons1.put(Void.TYPE, Void.class);
          ve7.e = Collections.unmodifiableMap(uDefaultCons1);
       }catch(java.lang.ClassNotFoundException e0){
       }
    }
    public static Type a(Type p0){
       ve7$a uoa;
       if (p0 instanceof Class) {
          if (p0.isArray()) {
             uoa = new ve7$a(ve7.a(p0.getComponentType()));
          }
          return uoa;
       }else if(p0 instanceof ParameterizedType){
          if (p0 instanceof ve7$b) {
             return p0;
          }
          return new ve7$b(p0.getOwnerType(), p0.getRawType(), p0.getActualTypeArguments());
       }else if(p0 instanceof GenericArrayType){
          if (p0 instanceof ve7$a) {
             return p0;
          }
          return new ve7$a(p0.getGenericComponentType());
       }else if(p0 instanceof WildcardType){
          if (p0 instanceof ve7$c) {
             return p0;
          }
          return new ve7$c(p0.getUpperBounds(), p0.getLowerBounds());
       }else {
          return p0;
       }
    }
    public static void b(Type p0){
       if (p0 instanceof Class && p0.isPrimitive()) {
          throw new IllegalArgumentException("Unexpected primitive "+p0+". Use the boxed type.");
       }
       return;
    }
    public static Class c(TypeVariable p0){
       GenericDeclaration genericDecla = p0.getGenericDeclaration();
       if (genericDecla instanceof Class) {
       }else {
          genericDecla = null;
       }
       return genericDecla;
    }
    public static JsonAdapter d(Moshi p0,Type p1,Class p2){
       Constructor declaredCons;
       Object[] objArray;
       Class[] uClassArray1;
       bf3 annotation = p2.getAnnotation(bf3.class);
       JsonAdapter jsonAdapter = null;
       if (annotation == null || !annotation.generateAdapter()) {
          return jsonAdapter;
       }
       String str = ya7.e(p2.getName());
       try{
          Class uClass = Class.forName(str, true, p2.getClassLoader());
          Moshi moshi = Moshi.class;
          if (p1 instanceof ParameterizedType) {
             Type[] actualTypeAr = p1.getActualTypeArguments();
             try{
                int i = 2;
                Class[] uClassArray = new Class[i];
                uClassArray[0] = moshi;
                uClassArray[1] = Type[].class;
                declaredCons = uClass.getDeclaredConstructor(uClassArray);
                objArray = new Object[i];
                objArray[0] = p0;
                objArray[1] = actualTypeAr;
             }catch(java.lang.NoSuchMethodException e0){
                try{
                   uClassArray1 = new Class[true];
                   uClassArray1[0] = e0;
                   declaredCons = uClass.getDeclaredConstructor(uClassArray1);
                   objArray = new Object[true];
                   objArray[0] = actualTypeAr;
                }catch(java.lang.NoSuchMethodException e7){
                   if (!p1 instanceof ParameterizedType && uClass.getTypeParameters().length) {
                      throw new RuntimeException("Failed to find the generated JsonAdapter constructor for \'"+p1+"\'. Suspiciously, the type was not parameterized but the target class \'"+uClass.getCanonicalName()+"\' is generic. Consider using Types#newParameterizedType\(\) to define these missing type variables.", e7);
                   }else {
                      throw new RuntimeException("Failed to find the generated JsonAdapter constructor for "+p1, e7);
                   }
                }catch(java.lang.InstantiationException e7){
                   throw new RuntimeException("Failed to instantiate the generated JsonAdapter for "+p1, e7);
                }catch(java.lang.InstantiationException e0){
                }
             }catch(java.lang.IllegalAccessException e7){
                throw new RuntimeException("Failed to access the generated JsonAdapter for "+p1, e7);
             }catch(java.lang.InstantiationException e7){
             }catch(java.lang.reflect.InvocationTargetException e7){
                throw ve7.t(e7);
             }
          }else {
             try{
                Class[] uClassArray2 = new Class[true];
                uClassArray2[0] = moshi;
                declaredCons = uClass.getDeclaredConstructor(uClassArray2);
                objArray = new Object[true];
                objArray[0] = p0;
             }catch(java.lang.NoSuchMethodException e0){
                uClassArray1 = new Class[0];
                declaredCons = uClass.getDeclaredConstructor(uClassArray1);
                objArray = new Object[0];
             }catch(java.lang.IllegalAccessException e7){
             }catch(java.lang.IllegalAccessException e0){
             }
          }
          declaredCons.setAccessible(true);
          return declaredCons.newInstance(objArray).nullSafe();
       }catch(java.lang.ClassNotFoundException e7){
          throw new RuntimeException("Failed to find the generated JsonAdapter class for "+p1, e7);
       }catch(java.lang.NoSuchMethodException e7){
       }catch(java.lang.IllegalAccessException e7){
       }catch(java.lang.InstantiationException e7){
       }catch(java.lang.reflect.InvocationTargetException e7){
       }
    }
    public static Type e(Type p0,Class p1,Class p2){
       object oobject;
       Class superclass;
       if (p2 == p1) {
          return p0;
       }
       if (p2.isInterface()) {
          Class[] interfaces = p1.getInterfaces();
          int len = interfaces.length;
          int i = 0;
          while (true) {
             if (i < len) {
                if ((oobject = interfaces[i]) == p2) {
                   return p1.getGenericInterfaces()[i];
                }else if(p2.isAssignableFrom(oobject)){
                   return ve7.e(p1.getGenericInterfaces()[i], interfaces[i], p2);
                }else {
                   i = i + 1;
                }
             }
          }
       }
       if (!p1.isInterface()) {
          while (p1 != Object.class) {
             if ((superclass = p1.getSuperclass()) == p2) {
                return p1.getGenericSuperclass();
             }else if(p2.isAssignableFrom(superclass)){
                return ve7.e(p1.getGenericSuperclass(), superclass, p2);
             }
             p1 = superclass;
          }
       }
       return p2;
    }
    public static boolean f(Annotation[] p0){
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (p0[i].annotationType().getSimpleName().equals("Nullable")) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static int g(Object p0){
       int i = (p0 != null)? p0.hashCode(): 0;
       return i;
    }
    private static String getKotlinMetadataClassName(){
       return "kotlin.Metadata";
    }
    public static int h(Object[] p0,Object p1){
       int i = 0;
       while (true) {
          if (i >= p0.length) {
             throw new NoSuchElementException();
          }
          if (p1.equals(p0[i])) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public static boolean i(Class p0){
       Class d;
       boolean b = ((d = ve7.d) != null && p0.isAnnotationPresent(d))? true: false;
       return b;
    }
    public static boolean j(Class p0){
       String name = p0.getName();
       boolean b = (!name.startsWith("android.") && (!name.startsWith("androidx.") && (!name.startsWith("java.") && (!name.startsWith("javax.") && (!name.startsWith("kotlin.") && (!name.startsWith("kotlinx.") && !name.startsWith("scala.")))))))? false: true;
       return b;
    }
    public static Set k(AnnotatedElement p0){
       return ve7.l(p0.getAnnotations());
    }
    public static Set l(Annotation[] p0){
       int len = p0.length;
       Set set = null;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (oobject.annotationType().isAnnotationPresent(ig3.class)) {
             if (set == null) {
                set = new LinkedHashSet();
             }
             set.add(oobject);
          }
          i = i + 1;
       }
       Set set1 = (set != null)? Collections.unmodifiableSet(set): ve7.a;
       return set1;
    }
    public static String m(String p0,AnnotatedElement p1){
       return ve7.n(p0, p1.getAnnotation(ye3.class));
    }
    public static String n(String p0,ye3 p1){
       if (p1 == null) {
          return p0;
       }
       String str = p1.name();
       if (!"\xff\x02\xff\x02".equals(str)) {
          p0 = str;
       }
       return p0;
    }
    public static hf3 o(String p0,String p1,b p2){
       String str = p2.d();
       if (p1.equals(p0)) {
          Object[] objArray = new Object[]{p0,str};
          p0 = String.format("Required value \'%s\' missing at %s", objArray);
       }else {
          Object[] objArray1 = new Object[]{p0,p1,str};
          p0 = String.format("Required value \'%s\' \(JSON name \'%s\'\) missing at %s", objArray1);
       }
       return new hf3(p0);
    }
    public static Type p(Type p0){
       if (!p0 instanceof WildcardType) {
          return p0;
       }
       WildcardType wildcardType = p0;
       if (wildcardType.getLowerBounds().length) {
          return p0;
       }
       Type[] upperBounds = wildcardType.getUpperBounds();
       if (upperBounds.length == 1) {
          return upperBounds[0];
       }
       throw new IllegalArgumentException();
    }
    public static Type q(Type p0,Class p1,Type p2){
       return ve7.r(p0, p1, p2, new LinkedHashSet());
    }
    private static Type r(Type p0,Class p1,Type p2,Collection p3){
       Type obj;
       GenericArrayType genericArray;
       Type type;
       Type type1;
       ve7$b uob;
       while (true) {
          if (p2 instanceof TypeVariable) {
             obj = p2;
             if (p3.contains(obj)) {
                return p2;
             }else {
                p3.add(obj);
                if ((p2 = ve7.s(p0, p1, obj)) == obj) {
                   return p2;
                }
                continue ;
             }
          }else if(p2 instanceof Class){
             obj = p2;
             if (obj.isArray()) {
                Class componentTyp = obj.getComponentType();
                p0 = ve7.r(p0, p1, componentTyp, p3);
                if (componentTyp != p0) {
                   genericArray = ya7.b(p0);
                   break ;
                }
                break ;
             }
          }
          if (p2 instanceof GenericArrayType) {
             obj = p2.getGenericComponentType();
             p0 = ve7.r(p0, p1, obj, p3);
             if (obj != p0) {
                GenericArrayType genericArray1 = ya7.b(p0);
             }
             return p2;
          }else {
             int i = 1;
             int i1 = 0;
             if (p2 instanceof ParameterizedType) {
                obj = p2.getOwnerType();
                genericArray = ((type = ve7.r(p0, p1, obj, p3)) != obj)? 1: 0;
                Type[] actualTypeAr = p2.getActualTypeArguments();
                int len = actualTypeAr.length;
                while (i1 < len) {
                   if ((type1 = ve7.r(p0, p1, actualTypeAr[i1], p3)) != actualTypeAr[i1]) {
                      if (!genericArray) {
                         actualTypeAr = actualTypeAr.clone();
                         genericArray = 1;
                      }
                      actualTypeAr[i1] = type1;
                   }
                   i1 = i1 + 1;
                }
                if (genericArray) {
                   uob = new ve7$b(type, p2.getRawType(), actualTypeAr);
                }
                return uob;
             }else if(p2 instanceof WildcardType){
                Type[] lowerBounds = p2.getLowerBounds();
                Type[] upperBounds = p2.getUpperBounds();
                if (lowerBounds.length == i) {
                   if ((p0 = ve7.r(p0, p1, lowerBounds[i1], p3)) != lowerBounds[i1]) {
                      return ya7.l(p0);
                   }
                }else if(upperBounds.length == i && (p0 = ve7.r(p0, p1, upperBounds[i1], p3)) != upperBounds[i1]){
                   return ya7.k(p0);
                }
             }
             return p2;
          }
       }
       return obj;
    }
    public static Type s(Type p0,Class p1,TypeVariable p2){
       Class uClass;
       if ((uClass = ve7.c(p2)) == null) {
          return p2;
       }
       p0 = ve7.e(p0, p1, uClass);
       if (p0 instanceof ParameterizedType) {
          return p0.getActualTypeArguments()[ve7.h(uClass.getTypeParameters(), p2)];
       }
       return p2;
    }
    public static RuntimeException t(InvocationTargetException p0){
       Throwable tarException = p0.getTargetException();
       if (tarException instanceof RuntimeException) {
          throw tarException;
       }
       if (tarException instanceof Error) {
          throw tarException;
       }
       throw new RuntimeException(tarException);
    }
    public static String u(Type p0,Set p1){
       StringBuilder str = p0;
       String str1 = (p1.isEmpty())? " \(with no annotations\)": " annotated "+p1;
       return str+str1;
    }
    public static String v(Type p0){
       String name = (p0 instanceof Class)? p0.getName(): p0.toString();
       return name;
    }
    public static hf3 w(String p0,String p1,b p2){
       String str = p2.d();
       if (p1.equals(p0)) {
          Object[] objArray = new Object[]{p0,str};
          p0 = String.format("Non-null value \'%s\' was null at %s", objArray);
       }else {
          Object[] objArray1 = new Object[]{p0,p1,str};
          p0 = String.format("Non-null value \'%s\' \(JSON name \'%s\'\) was null at %s", objArray1);
       }
       return new hf3(p0);
    }
}
