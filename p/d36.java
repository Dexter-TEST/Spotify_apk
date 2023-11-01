package p.d36;
import p.qu0;
import java.lang.reflect.Type;
import java.lang.annotation.Annotation;
import p.cy5;
import p.su0;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Character;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Short;
import p.y26;
import p.a36;
import p.hs1;
import p.ms1;
import p.ks1;
import p.z26;
import p.lz0;
import p.gs1;
import p.fs1;
import p.js1;

public final class d36 extends qu0	// class@0001ab from classes2.dex
{

    public void d36(){
       super();
    }
    public final su0 a(Type p0,Annotation[] p1,Annotation[] p2,cy5 p3){
       if (p0 != String.class && (p0 != Boolean.TYPE && (p0 != Boolean.class && (p0 != Byte.TYPE && (p0 != Byte.class && (p0 != Character.TYPE && (p0 != Character.class && (p0 != Double.TYPE && (p0 != Double.class && (p0 != Float.TYPE && (p0 != Float.class && (p0 != Integer.TYPE && (p0 != Integer.class && (p0 != Long.TYPE && (p0 != Long.class && (p0 != Short.TYPE && p0 != Short.class)))))))))))))))) {
          return null;
       }
       return y26.a;
    }
    public final su0 b(Type p0,Annotation[] p1,cy5 p2){
       if (p0 == String.class) {
          return a36.a;
       }
       if (p0 == Boolean.class || p0 == Boolean.TYPE) {
          return js1.b;
       }
       if (p0 == Byte.class || p0 == Byte.TYPE) {
          return fs1.c;
       }
       if (p0 == Character.class || p0 == Character.TYPE) {
          return gs1.b;
       }
       if (p0 == Double.class || p0 == Double.TYPE) {
          return lz0.t;
       }
       if (p0 == Float.class || p0 == Float.TYPE) {
          return z26.a;
       }
       if (p0 == Integer.class || p0 == Integer.TYPE) {
          return ks1.b;
       }
       if (p0 == Long.class || p0 == Long.TYPE) {
          return ms1.b;
       }
       if (p0 != Short.class && p0 != Short.TYPE) {
          return null;
       }
       return hs1.b;
    }
}
