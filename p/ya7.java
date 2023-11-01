package p.ya7;
import java.lang.reflect.Type;
import java.lang.reflect.GenericArrayType;
import java.lang.Class;
import p.ve7$a;
import java.util.Collection;
import java.lang.reflect.WildcardType;
import java.lang.reflect.ParameterizedType;
import java.lang.Object;
import p.ve7$b;
import java.util.Arrays;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.GenericDeclaration;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import p.ve7;
import java.lang.reflect.Array;
import java.lang.IllegalArgumentException;
import java.util.Properties;
import java.util.Map;
import p.ve7$c;

public abstract class ya7	// class@002d80 from classes.dex
{

    public static Type a(Type p0){
       if (p0 instanceof GenericArrayType) {
          return p0.getGenericComponentType();
       }
       if (p0 instanceof Class) {
          return p0.getComponentType();
       }
       return null;
    }
    public static GenericArrayType b(Type p0){
       return new ve7$a(p0);
    }
    public static Type c(Type p0,Class p1){
       object oobject;
       p0 = ya7.h(p0, p1, Collection.class);
       if (p0 instanceof WildcardType) {
          oobject = p0.getUpperBounds()[0];
       }
       if (oobject instanceof ParameterizedType) {
          return oobject.getActualTypeArguments()[0];
       }else {
          return Object.class;
       }
    }
    public static boolean d(Type p0,Type p1){
       ve7$b c;
       boolean b = true;
       if (p0 == p1) {
          return b;
       }
       if (p0 instanceof Class) {
          if (p1 instanceof GenericArrayType) {
             return ya7.d(p0.getComponentType(), p1.getGenericComponentType());
          }else {
             return p0.equals(p1);
          }
       }else if(p0 instanceof ParameterizedType){
          if (!p1 instanceof ParameterizedType) {
             return false;
          }else if(p0 instanceof ve7$b){
             c = p0.c;
          }else {
             c = p0.getActualTypeArguments();
          }
          ve7$b c1 = (p1 instanceof ve7$b)? p1.c: p1.getActualTypeArguments();
          if (!ya7.d(p0.getOwnerType(), p1.getOwnerType()) || (!p0.getRawType().equals(p1.getRawType()) || !Arrays.equals(c, c1))) {
             b = false;
          }
          return b;
       }else if(p0 instanceof GenericArrayType){
          if (p1 instanceof Class) {
             return ya7.d(p1.getComponentType(), p0.getGenericComponentType());
          }else if(!p1 instanceof GenericArrayType){
             return false;
          }else {
             return ya7.d(p0.getGenericComponentType(), p1.getGenericComponentType());
          }
       }else if(p0 instanceof WildcardType){
          if (!p1 instanceof WildcardType) {
             return false;
          }else if(Arrays.equals(p0.getUpperBounds(), p1.getUpperBounds()) && Arrays.equals(p0.getLowerBounds(), p1.getLowerBounds())){
             b = false;
          }
          return b;
       }else if(p0 instanceof TypeVariable){
          if (!p1 instanceof TypeVariable) {
             return false;
          }
          if (p0.getGenericDeclaration() != p1.getGenericDeclaration() || !p0.getName().equals(p1.getName())) {
             b = false;
          }
          return b;
       }else {
          return false;
       }
    }
    public static String e(String p0){
       return p0.replace("$", "_")+"JsonAdapter";
    }
    public static Type f(Type p0){
       Class uClass = ya7.g(p0);
       return ve7.q(p0, uClass, uClass.getGenericSuperclass());
    }
    public static Class g(Type p0){
       if (p0 instanceof Class) {
          return p0;
       }
       if (p0 instanceof ParameterizedType) {
          return p0.getRawType();
       }
       int i = 0;
       if (p0 instanceof GenericArrayType) {
          return Array.newInstance(ya7.g(p0.getGenericComponentType()), i).getClass();
       }
       if (p0 instanceof TypeVariable) {
          return Object.class;
       }
       if (p0 instanceof WildcardType) {
          return ya7.g(p0.getUpperBounds()[i]);
       }
       String str = (p0 == null)? "null": p0.getClass().getName();
       throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <"+p0+"> is of type "+str);
    }
    public static Type h(Type p0,Class p1,Class p2){
       if (p2.isAssignableFrom(p1)) {
          return ve7.q(p0, p1, ve7.e(p0, p1, p2));
       }
       throw new IllegalArgumentException();
    }
    public static Type[] i(Type p0,Class p1){
       Type[] typeArray;
       if (p0 == Properties.class) {
          typeArray = new Type[]{String.class,String.class};
          return typeArray;
       }else {
          p0 = ya7.h(p0, p1, Map.class);
          if (p0 instanceof ParameterizedType) {
             return p0.getActualTypeArguments();
          }
          typeArray = new Type[]{Object.class,Object.class};
          return typeArray;
       }
    }
    public static ParameterizedType j(Type p0,Type[] p1){
       if (p1.length) {
          return new ve7$b(null, p0, p1);
       }
       throw new IllegalArgumentException("Missing type arguments for "+p0);
    }
    public static WildcardType k(Type p0){
       Type[] upperBounds;
       if (p0 instanceof WildcardType) {
          upperBounds = p0.getUpperBounds();
       }else {
          Type[] typeArray = new Type[]{p0};
          upperBounds = typeArray;
       }
       return new ve7$c(upperBounds, ve7.b);
    }
    public static WildcardType l(Type p0){
       Type[] lowerBounds;
       int i = 1;
       if (p0 instanceof WildcardType) {
          lowerBounds = p0.getLowerBounds();
       }else {
          Type[] typeArray1 = new Type[i];
          typeArray1[0] = p0;
          lowerBounds = typeArray1;
       }
       Type[] typeArray = new Type[i];
       typeArray[0] = Object.class;
       return new ve7$c(typeArray, lowerBounds);
    }
}
