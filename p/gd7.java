package p.gd7;
import sun.misc.Unsafe;
import p.fc;
import java.lang.Long;
import java.lang.Class;
import java.lang.Integer;
import p.dd7;
import p.ed7;
import p.fd7;
import java.lang.Object;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.lang.Throwable;
import java.lang.String;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import java.nio.Buffer;
import java.lang.Boolean;
import java.lang.reflect.Method;
import java.lang.Byte;
import p.cd7;
import java.security.PrivilegedExceptionAction;
import java.security.AccessController;

public abstract class gd7	// class@0016ec from classes.dex
{
    public static final Unsafe a;
    public static final Class b;
    public static final fd7 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final long g;
    public static final boolean h;

    static {
       fd7 uofd7;
       Field uField;
       Unsafe unsafe = gd7.q();
       gd7.a = unsafe;
       gd7.b = fc.a;
       boolean b = gd7.f(Long.TYPE);
       boolean b1 = gd7.f(Integer.TYPE);
       boolean b2 = true;
       if (unsafe == null) {
       label_0031 :
          uofd7 = null;
       }else if(fc.a()){
          if (b) {
             uofd7 = new dd7(unsafe, b2);
          }else if(b1){
             uofd7 = new dd7(unsafe, 0);
          }else {
             goto label_0031 ;
          }
       }else {
          uofd7 = new ed7(unsafe);
       }
       gd7.c = uofd7;
       boolean b3 = (uofd7 == null)? false: uofd7.u();
       gd7.d = b3;
       b3 = (uofd7 == null)? false: uofd7.t();
       gd7.e = b3;
       gd7.f = (long)gd7.c(byte[].class);
       gd7.c(boolean[].class);
       gd7.d(boolean[].class);
       gd7.c(int[].class);
       gd7.d(int[].class);
       gd7.c(long[].class);
       gd7.d(long[].class);
       gd7.c(float[].class);
       gd7.d(float[].class);
       gd7.c(double[].class);
       gd7.d(double[].class);
       gd7.c(Object[].class);
       gd7.d(Object[].class);
       long l = ((uField = gd7.e()) != null && uofd7 != null)? uofd7.l(uField): -1;
       gd7.g = l;
       if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
          b2 = false;
       }
       gd7.h = b2;
    }
    public static void a(Throwable p0){
       Logger.getLogger(gd7.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: "+p0);
    }
    public static Object b(Class p0){
       try{
          return gd7.a.allocateInstance(p0);
       }catch(java.lang.InstantiationException e1){
          throw new IllegalStateException(e1);
       }
    }
    public static int c(Class p0){
       int i = (gd7.e)? gd7.c.a(p0): -1;
       return i;
    }
    public static void d(Class p0){
       if (gd7.e) {
          gd7.c.b(p0);
       }
       return;
    }
    public static Field e(){
       Field declaredFiel;
       Buffer uBuffer = Buffer.class;
       Field uField = null;
       if (fc.a()) {
          declaredFiel = uBuffer.getDeclaredField("effectiveDirectAddress");
          if (declaredFiel != null) {
             return declaredFiel;
          }
       }
       declaredFiel = uBuffer.getDeclaredField("address");
       if (declaredFiel != null && declaredFiel.getType() == Long.TYPE) {
          uField = declaredFiel;
       }
       return uField;
    }
    public static boolean f(Class p0){
       if (!fc.a()) {
          return false;
       }
       Class b = gd7.b;
       Class[] uClassArray = new Class[2];
       uClassArray[0] = p0;
       Class tYPE = Boolean.TYPE;
       uClassArray[1] = tYPE;
       b.getMethod("peekLong", uClassArray);
       Class[] uClassArray1 = new Class[]{p0,Long.TYPE,tYPE};
       b.getMethod("pokeLong", uClassArray1);
       uClassArray1 = new Class[3];
       uClassArray1[0] = p0;
       Class tYPE1 = Integer.TYPE;
       uClassArray1[1] = tYPE1;
       uClassArray1[2] = tYPE;
       b.getMethod("pokeInt", uClassArray1);
       uClassArray1 = new Class[]{p0,tYPE};
       b.getMethod("peekInt", uClassArray1);
       Class[] uClassArray2 = new Class[]{p0,Byte.TYPE};
       b.getMethod("pokeByte", uClassArray2);
       uClassArray2 = new Class[]{p0};
       b.getMethod("peekByte", uClassArray2);
       uClassArray1 = new Class[]{p0,byte[].class,tYPE1,tYPE1};
       b.getMethod("pokeByteArray", uClassArray1);
       uClassArray2 = new Class[]{p0,byte[].class,tYPE1,tYPE1};
       b.getMethod("peekByteArray", uClassArray2);
       return 1;
    }
    public static boolean g(long p0,Object p1){
       return gd7.c.d(p0, p1);
    }
    public static byte h(long p0){
       return gd7.c.e(p0);
    }
    public static byte i(byte[] p0,long p1){
       return gd7.c.f((gd7.f + p1), p0);
    }
    public static byte j(long p0,Object p1){
       return (byte)((gd7.n((-4 & p0), p1) >> (int)(((~ p0) & 3) << 3)) & 0x00ff);
    }
    public static byte k(long p0,Object p1){
       return (byte)((gd7.n((-4 & p0), p1) >> (int)((p0 & 3) << 3)) & 0x00ff);
    }
    public static double l(long p0,Object p1){
       return gd7.c.g(p0, p1);
    }
    public static float m(long p0,Object p1){
       return gd7.c.h(p0, p1);
    }
    public static int n(long p0,Object p1){
       return gd7.c.i(p0, p1);
    }
    public static long o(long p0,Object p1){
       return gd7.c.j(p0, p1);
    }
    public static Object p(long p0,Object p1){
       return gd7.c.k(p0, p1);
    }
    public static Unsafe q(){
       Unsafe unsafe = AccessController.doPrivileged(new cd7());
       return unsafe;
    }
    public static void r(Object p0,long p1,boolean p2){
       gd7.c.m(p0, p1, p2);
    }
    public static void s(byte[] p0,long p1,byte p2){
       gd7.c.n(p0, (gd7.f + p1), p2);
    }
    public static void t(Object p0,long p1,byte p2){
       long l = -4 & p1;
       int i = ((~ (int)p1) & 0x03) << 3;
       gd7.x((((255 & p2) << i) | (gd7.n(l, p0) & (~ (255 << i)))), l, p0);
    }
    public static void u(Object p0,long p1,byte p2){
       long l = -4 & p1;
       int i = ((int)p1 & 0x03) << 3;
       gd7.x((((255 & p2) << i) | (gd7.n(l, p0) & (~ (255 << i)))), l, p0);
    }
    public static void v(Object p0,long p1,double p2){
       gd7.c.o(p0, p1, p2);
    }
    public static void w(Object p0,long p1,float p2){
       gd7.c.p(p0, p1, p2);
    }
    public static void x(int p0,long p1,Object p2){
       gd7.c.q(p0, p1, p2);
    }
    public static void y(Object p0,long p1,long p2){
       gd7.c.r(p0, p1, p2);
    }
    public static void z(long p0,Object p1,Object p2){
       gd7.c.s(p0, p1, p2);
    }
}
