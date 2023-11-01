package p.zz1;
import java.util.Hashtable;
import java.lang.Void;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Character;
import java.lang.Short;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;
import java.lang.Class;
import java.lang.String;
import java.lang.ClassLoader;
import java.lang.NoClassDefFoundError;
import java.lang.Throwable;
import p.we3;
import p.oy6;
import p.ja4;
import java.util.StringTokenizer;
import p.dm5;
import p.xl0;

public final class zz1	// class@000401 from classes2.dex
{
    public final Class a;
    public final ClassLoader b;
    public final String c;
    public int d;
    public static final Hashtable e;
    public static final Object[] f;
    public static Class g;

    static {
       Hashtable hashtable = new Hashtable();
       zz1.e = hashtable;
       hashtable.put("void", Void.TYPE);
       hashtable.put("boolean", Boolean.TYPE);
       hashtable.put("byte", Byte.TYPE);
       hashtable.put("char", Character.TYPE);
       hashtable.put("short", Short.TYPE);
       hashtable.put("int", Integer.TYPE);
       hashtable.put("long", Long.TYPE);
       hashtable.put("float", Float.TYPE);
       hashtable.put("double", Double.TYPE);
       Object[] objArray = new Object[0];
       zz1.f = objArray;
    }
    public void zz1(Class p0,String p1){
       super();
       this.c = p1;
       this.a = p0;
       this.d = 0;
       this.b = p0.getClassLoader();
    }
    public static Class a(ClassLoader p0,String p1){
       Class uClass;
       Class g;
       if (p1.equals("*")) {
          return null;
       }
       if ((uClass = zz1.e.get(p1)) != null) {
          return uClass;
       }
       try{
          if (p0 == null) {
             return Class.forName(p1);
          }
          return Class.forName(p1, false, p0);
       }catch(java.lang.ClassNotFoundException e0){
          if ((g = zz1.g) == null) {
             String str = "java.lang.ClassNotFoundException";
             try{
                g = Class.forName(str);
                zz1.g = g;
             }catch(java.lang.ClassNotFoundException e1){
                throw new NoClassDefFoundError(e1.getMessage());
             }
          }
          return g;
       }
    }
    public static oy6 b(we3 p0,Object p1,Object p2){
       oy6 v6 = new oy6(p0, p1, p2, zz1.f, 16);
       return v6;
    }
    public static oy6 c(we3 p0,Object p1,Object p2,Object p3){
       Object[] objArray = new Object[]{p3};
       oy6 v6 = new oy6(p0, p1, p2, objArray, 16);
       return v6;
    }
    public static oy6 d(we3 p0,Object p1,Object p2,Object p3,Object p4){
       Object[] objArray = new Object[]{p3,p4};
       oy6 v6 = new oy6(p0, p1, p2, objArray, 16);
       return v6;
    }
    public final ja4 e(String p0,String p1,String p2,String p3,String p4,String p5){
       int i = Integer.parseInt("1", 16);
       zz1 tb = this.b;
       Class uClass = zz1.a(tb, p1);
       StringTokenizer stringTokeni = new StringTokenizer(p2, ":");
       int i1 = stringTokeni.countTokens();
       Class[] uClassArray = new Class[i1];
       int i2 = 0;
       for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
          uClassArray[i3] = zz1.a(tb, stringTokeni.nextToken());
       }
       stringTokeni = new StringTokenizer(p3, ":");
       i1 = stringTokeni.countTokens();
       String[] stringArray = new String[i1];
       for (i3 = 0; i3 < i1; i3 = i3 + 1) {
          stringArray[i3] = stringTokeni.nextToken();
       }
       stringTokeni = new StringTokenizer(p4, ":");
       i1 = stringTokeni.countTokens();
       Class[] uClassArray1 = new Class[i1];
       for (; i2 < i1; i2 = i2 + 1) {
          uClassArray1[i2] = zz1.a(tb, stringTokeni.nextToken());
       }
       ja4 stringTokeni1 = new ja4(i, p0, uClass, uClassArray, uClassArray1, zz1.a(tb, p5));
       return stringTokeni;
    }
    public final dm5 f(ja4 p0,int p1){
       zz1 td = this.d;
       this.d = td + 1;
       return new dm5(td, p0, new xl0(this.a, this.c, p1, 9));
    }
}
