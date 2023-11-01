package p.zn4;
import java.util.HashSet;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Short;
import java.lang.Character;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;
import java.lang.Number;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.lang.String;
import java.lang.Object;
import com.fasterxml.jackson.databind.deser.std.m;
import com.fasterxml.jackson.databind.deser.std.i;
import com.fasterxml.jackson.databind.deser.std.d;
import com.fasterxml.jackson.databind.deser.std.j;
import com.fasterxml.jackson.databind.deser.std.g;
import com.fasterxml.jackson.databind.deser.std.f;
import com.fasterxml.jackson.databind.deser.std.e;
import com.fasterxml.jackson.databind.deser.std.l;
import com.fasterxml.jackson.databind.deser.std.h;
import java.lang.Void;
import com.fasterxml.jackson.databind.deser.std.a;
import com.fasterxml.jackson.databind.deser.std.k;
import com.fasterxml.jackson.databind.deser.std.b;
import com.fasterxml.jackson.databind.deser.std.c;
import java.lang.IllegalArgumentException;

public abstract class zn4	// class@002f2f from classes.dex
{
    public static final HashSet a;

    static {
       zn4.a = new HashSet();
       Class[] uClassArray = new Class[11];
       int i = 0;
       uClassArray[i] = Boolean.class;
       uClassArray[1] = Byte.class;
       uClassArray[2] = Short.class;
       uClassArray[3] = Character.class;
       uClassArray[4] = Integer.class;
       uClassArray[5] = Long.class;
       uClassArray[6] = Float.class;
       uClassArray[7] = Double.class;
       uClassArray[8] = Number.class;
       uClassArray[9] = BigDecimal.class;
       uClassArray[10] = BigInteger.class;
       for (; i < 11; i = i + 1) {
          zn4.a.add(uClassArray[i].getName());
       }
    }
    public static m a(Class p0,String p1){
       if (p0.isPrimitive()) {
          if (p0 == Integer.TYPE) {
             return i.v;
          }else if(p0 == Boolean.TYPE){
             return d.v;
          }else if(p0 == Long.TYPE){
             return j.v;
          }else if(p0 == Double.TYPE){
             return g.v;
          }else if(p0 == Character.TYPE){
             return f.v;
          }else if(p0 == Byte.TYPE){
             return e.v;
          }else if(p0 == Short.TYPE){
             return l.v;
          }else if(p0 == Float.TYPE){
             return h.v;
          }else if(p0 == Void.TYPE){
             return a.a;
          }
       }else if(zn4.a.contains(p1)){
          if (p0 == Integer.class) {
             return i.w;
          }else if(p0 == Boolean.class){
             return d.w;
          }else if(p0 == Long.class){
             return j.w;
          }else if(p0 == Double.class){
             return g.w;
          }else if(p0 == Character.class){
             return f.w;
          }else if(p0 == Byte.class){
             return e.w;
          }else if(p0 == Short.class){
             return l.w;
          }else if(p0 == Float.class){
             return h.w;
          }else if(p0 == Number.class){
             return k.a;
          }else if(p0 == BigDecimal.class){
             return b.a;
          }else if(p0 == BigInteger.class){
             return c.a;
          }
       }else {
          return null;
       }
       throw new IllegalArgumentException("Internal error: can\'t find deserializer for ".concat(p0.getName()));
    }
}
