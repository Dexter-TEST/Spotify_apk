package p.kv5;
import java.lang.String;
import java.util.regex.Pattern;
import p.cy5;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Type;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Character;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Short;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.lang.Exception;
import java.lang.IllegalArgumentException;
import p.do5;
import java.util.LinkedHashSet;
import java.util.Set;

public final class kv5	// class@00028c from classes2.dex
{
    public final cy5 a;
    public final Method b;
    public final Annotation[] c;
    public final Annotation[][] d;
    public final Type[] e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String n;
    public boolean o;
    public boolean p;
    public boolean q;
    public String r;
    public mp2 s;
    public u54 t;
    public LinkedHashSet u;
    public lv1[] v;
    public boolean w;
    public static final Pattern x;
    public static final Pattern y;

    static {
       kv5.x = Pattern.compile("\\{\([a-zA-Z][a-zA-Z0-9_-]*\)\\}");
       kv5.y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    }
    public void kv5(cy5 p0,Method p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p1.getAnnotations();
       this.e = p1.getGenericParameterTypes();
       this.d = p1.getParameterAnnotations();
    }
    public static Class a(Class p0){
       Short shortx;
       if (Boolean.TYPE == p0) {
          return Boolean.class;
       }
       if (Byte.TYPE == p0) {
          return Byte.class;
       }
       if (Character.TYPE == p0) {
          return Character.class;
       }
       if (Double.TYPE == p0) {
          return Double.class;
       }
       if (Float.TYPE == p0) {
          return Float.class;
       }
       if (Integer.TYPE == p0) {
          return Integer.class;
       }
       if (Long.TYPE == p0) {
          return Long.class;
       }
       if (Short.TYPE == p0) {
          shortx = Short.class;
       }
       return shortx;
    }
    public final void b(String p0,String p1,boolean p2){
       Object[] objArray;
       kv5 tn = this.n;
       kv5 tb = this.b;
       if (tn == null) {
          this.n = p0;
          this.o = p2;
          if (p1.isEmpty()) {
             return;
          }
          int i = p1.indexOf(63);
          Pattern x = kv5.x;
          if (i != -1 && i < (p1.length() - 1)) {
             i = p1.substring((i + 1));
             if (x.matcher(i).find()) {
                objArray = new Object[]{i};
                throw do5.M(tb, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", objArray);
             }
          }
          this.r = p1;
          Matcher matcher = x.matcher(p1);
          LinkedHashSet linkedHashSe = new LinkedHashSet();
          while (matcher.find()) {
             linkedHashSe.add(matcher.group(1));
          }
          this.u = linkedHashSe;
          return;
       }else {
          objArray = new Object[]{tn,p0};
          throw do5.M(tb, null, "Only one HTTP method is allowed. Found: %s and %s.", objArray);
       }
    }
    public final void c(int p0,Type p1){
       if (!do5.G(p1)) {
          return;
       }
       Object[] objArray = new Object[]{p1};
       throw do5.W(this.b, p0, "Parameter type must not include a type variable or wildcard: %s", objArray);
    }
}
