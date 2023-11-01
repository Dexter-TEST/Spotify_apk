package p.p51;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.reflect.Type;
import p.he3;
import p.ia7;
import p.tu0;
import java.lang.Class;
import p.ru0;
import p.wf0;
import p.ne;
import java.lang.IllegalStateException;
import p.tp2;

public abstract class p51	// class@0021f2 from classes.dex
{

    public void p51(){
       super();
    }
    public static String a(String p0,String p1){
       if (p1 == null) {
          return p0;
       }
       return p0+": "+p1;
    }
    public static String b(String p0){
       if (p0 == null) {
          return "[N/A]";
       }
       Object[] objArray = new Object[1];
       if (p0.length() > 500) {
          p0 = p0.substring(0, 500)+"]...["+p0.substring((p0.length() - 500));
       }
       objArray[0] = p0;
       return String.format("\"%s\"", objArray);
    }
    public final he3 c(Type p0){
       if (p0 == null) {
          return null;
       }
       return this.f().e(p0);
    }
    public final tu0 d(Object p0){
       if (p0 instanceof tu0) {
          return p0;
       }
       if (!p0 instanceof Class) {
          throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type "+p0.getClass().getName()+"; expected type Converter or Class<Converter> instead");
       }
       if (p0 == ru0.class || wf0.l(p0)) {
          return null;
       }
       if (!tu0.class.isAssignableFrom(p0)) {
          throw new IllegalStateException(tp2.j(p0, "AnnotationIntrospector returned Class ", "; expected Class<Converter>"));
       }
       ne one = this.e();
       one.m();
       return wf0.e(p0, one.e());
    }
    public abstract ne e();
    public abstract ia7 f();
    public final Object g(Class p0,String p1){
       return this.h(this.c(p0), p1);
    }
    public abstract Object h(he3 p0,String p1);
}
