package p.jl;
import p.pc;
import p.gl;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import p.il;
import com.spotify.base.java.logging.Logger;
import java.lang.Throwable;
import java.util.Locale;
import java.lang.AssertionError;
import java.util.ArrayList;
import java.lang.StackTraceElement;
import java.lang.Class;
import p.hl;

public final class jl	// class@001b00 from classes.dex
{
    public gl a;
    public static final jl b;

    static {
       jl.b = new jl(new pc(10));
    }
    private void jl(gl p0){
       super();
       this.a = p0;
    }
    public static void a(Object p0,Object p1){
       if (p0 == null) {
          if (p1 != null) {
             jl.k("The two objects\(null, "+p1+"\) are not equal.");
          }
       }else if(!p0.equals(p1)){
          jl.k("The two objects\("+p0+", "+p1+"\) are not equal.");
       }
       return;
    }
    public static void b(Object p0){
       jl.c(p0, "Object failed null check");
    }
    public static void c(Object p0,String p1){
       if (p0 == null) {
          jl.k(p1);
       }
       return;
    }
    public static void d(String p0){
       jl.m(p0);
    }
    public static void e(String p0,String p1){
       Object[] objArray = new Object[]{p0};
       jl.n(new il(Logger.d("%s", objArray), p1));
    }
    public static void f(String p0,Throwable p1){
       jl.n(new il(p0, p1));
    }
    public static void g(String p0,boolean p1){
       if (!p1) {
          Object[] objArray = new Object[]{p0};
          jl.k(Logger.d("%s", objArray));
       }
       return;
    }
    public static void h(boolean p0,String p1){
       if (!p0) {
          jl.m(p1);
       }
       return;
    }
    public static void i(boolean p0,String p1,Object[] p2){
       if (!p0) {
          jl.m(String.format(Locale.US, p1, p2));
       }
       return;
    }
    private static gl j(){
       return jl.b.a;
    }
    public static void k(String p0){
       Object[] objArray = new Object[]{p0};
       Logger.b("%s", objArray);
       Object[] objArray1 = new Object[]{p0};
       jl.l(new AssertionError(Logger.d("%s", objArray1)));
    }
    private static void l(AssertionError p0){
       jl.o(p0);
       jl.j().b(p0);
    }
    private static void m(String p0){
       Object[] objArray = new Object[]{p0};
       jl.n(new il(Logger.d("%s", objArray), null));
    }
    private static void n(il p0){
       jl.o(p0);
       jl.j().c(p0);
    }
    private static void o(Throwable p0){
       ArrayList uArrayList = new ArrayList();
       StackTraceElement[] stackTrace = p0.getStackTrace();
       int len = stackTrace.length;
       int i = 0;
       while (i < len) {
          object oobject = stackTrace[i];
          if (!jl.class.getCanonicalName().equals(oobject.getClassName())) {
             uArrayList.add(oobject);
          }
          i = i + 1;
       }
       stackTrace = new StackTraceElement[0];
       p0.setStackTrace(uArrayList.toArray(stackTrace));
       return;
    }
    public static void p(String p0){
       jl.r(new hl(p0));
    }
    public static void q(String p0,Throwable p1){
       jl.r(new hl(p0, p1));
    }
    private static void r(hl p0){
       jl.o(p0);
       jl.j().d(p0);
    }
    public static void s(gl p0){
       jl.b.a = p0;
    }
}
