package p.e81;
import java.io.Serializable;
import p.gb6;
import p.d81;
import p.va6;
import p.fb6;
import p.vf3;
import java.lang.Exception;
import java.io.IOException;
import java.lang.Throwable;
import java.lang.String;
import p.wf0;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;
import p.yf3;
import java.io.Closeable;
import p.mg3;
import p.jm5;
import p.cb6;
import p.ua6;
import p.le;
import p.wv5;
import p.lg3;
import p.he3;

public abstract class e81 extends gb6 implements Serializable	// class@001437 from classes.dex
{

    public void e81(d81 p0,va6 p1,fb6 p2){
       super(p0, p1, p2);
    }
    public static IOException C(vf3 p0,Exception p1){
       String str;
       if (p1 instanceof IOException) {
          return p1;
       }
       if ((str = wf0.f(p1)) == null) {
          str = "[no message for "+p1.getClass().getName()+"]";
       }
       return new yf3(p0, str, p1);
    }
    public final void A(vf3 p0,Object p1,mg3 p2,jm5 p3){
       jm5 c;
       try{
          p0.v0();
          if ((c = p3.c) == null) {
             cb6 uocb6 = new cb6(p3.a);
             p3.c = uocb6;
             c = uocb6;
          }
          p0.j0(c);
          p2.serialize(p1, p0, this);
          p0.h0();
          return;
       }catch(java.lang.Exception e4){
          throw e81.C(p0, e4);
       }
    }
    public final void B(vf3 p0){
       gb6 tt = this.t;
       Object obj = null;
       try{
          tt.serialize(obj, p0, this);
          return;
       }catch(java.lang.Exception e0){
          throw e81.C(p0, e0);
       }
    }
    public final void D(vf3 p0,Object p1){
       if (p1 == null) {
          this.B(p0);
          return;
       }else {
          this.o(p1.getClass());
          throw null;
       }
    }
    public final mg3 z(le p0,Object p1){
       if (p1 instanceof mg3) {
          if (p1 instanceof wv5) {
             p1.a(this);
          }
          return p1;
       }else if(p1 instanceof Class){
          if (p1 == lg3.class || wf0.l(p1)) {
             return null;
          }
          if (mg3.class.isAssignableFrom(p1)) {
             throw null;
          }
          this.h(p0.a(), "AnnotationIntrospector returned Class "+p1.getName()+"; expected Class<JsonSerializer>");
          throw null;
       }else {
          this.h(p0.a(), "AnnotationIntrospector returned serializer definition of type "+p1.getClass().getName()+"; expected type JsonSerializer or Class<JsonSerializer> instead");
          throw null;
       }
    }
}
