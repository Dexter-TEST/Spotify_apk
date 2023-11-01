package p.u70;
import com.spotify.cosmos.cosmonaut.Converter;
import java.lang.Object;
import java.lang.reflect.Type;
import java.lang.String;
import p.co5;
import java.lang.Class;
import java.lang.reflect.Method;
import p.r75;
import p.ii2;
import com.google.protobuf.c;
import p.yx1;
import java.lang.StringBuilder;
import p.b17;
import java.io.IOException;
import java.lang.Throwable;
import p.tp2;
import p.uu6;
import java.nio.charset.Charset;
import p.s74;
import java.lang.reflect.GenericArrayType;
import java.lang.Byte;

public final class u70 implements Converter	// class@002855 from classes.dex
{
    public final int a;

    public void u70(int p0){
       this.a = p0;
       super();
    }
    public final Object a(Type p0,byte[] p1){
       String str1;
       String str = "type";
       switch (this.a){
           case 2:
             break;
           default:
             co5.o(p0, str);
             co5.i(p1);
             Charset a = uu6.a;
             co5.l(a, "DEFAULT_CHARSET");
             return new String(p1, a);
       }
       co5.o(p0, str);
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          c obj = p0.getDeclaredMethod("parser", uClassArray).invoke(null, objArray);
          co5.j(obj, "null cannot be cast to non-null type com.google.protobuf.Parser<com.google.protobuf.MessageLite>");
          obj = c.access$200(obj.a, p1, 0, p1.length, ii2.b);
          ii2.a(obj);
          return obj;
       }catch(java.lang.IllegalAccessException e7){
          throw new IOException(tp2.j(p0, "failed to access ", v0), e7);
       }catch(java.lang.NoSuchMethodException e7){
          throw new IOException(tp2.j(p0, "failed to find method ", v0), e7);
       }catch(java.lang.reflect.InvocationTargetException e7){
          throw new IOException(tp2.j(p0, "failed to invoke method ", v0), e7);
       }catch(p.rc3 e0){
          if (p1) {
             str1 = (!p1.length)? "Body is empty when parsing ".concat(p0.getName()): "Invalid body when parsing "+p0.getName()+", length="+p1.length+", source="+b17.A(p1);
          }else {
             str1 = "Body is missing when parsing ".concat(p0.getName());
          }
          throw new IOException(str1, e0);
       }
    }
    public final byte[] b(Type p0,Object p1){
       switch (this.a){
           case 1:
           default:
             co5.o(p0, "type");
             co5.i(p1);
             Charset a = uu6.a;
             co5.l(a, "DEFAULT_CHARSET");
             byte[] bytes = p1.getBytes(a);
             co5.l(bytes, "this as java.lang.String\).getBytes\(charset\)");
             return bytes;
       }
       co5.o(p0, "type");
       co5.i(p1);
       return p1.toByteArray();
    }
    public final boolean canHandle(Type p0){
       boolean b = true;
       switch (this.a){
           case 0:
             co5.o(p0, "type");
             boolean b1 = (p0 instanceof GenericArrayType)? co5.c(p0.getGenericComponentType(), Byte.TYPE): co5.c(p0, byte[].class);
             return b1;
             break;
           case 1:
             co5.o(p0, "type");
             if (!p0 instanceof Class || !s74.class.isAssignableFrom(p0)) {
                b = false;
             }
             return b;
             break;
           case 2:
             co5.o(p0, "type");
             if (!p0 instanceof Class || !s74.class.isAssignableFrom(p0)) {
                b = false;
             }
             return b;
             break;
           case 3:
           default:
             co5.o(p0, "type");
             return co5.c(p0, String.class);
       }
       co5.o(p0, "type");
       return co5.c(p0, String.class);
    }
    public final Object convert(Type p0,Object p1){
       switch (this.a){
           case 0:
             co5.o(p0, "type");
             return p1;
           case 1:
             return this.b(p0, p1);
           case 2:
             return this.a(p0, p1);
           case 3:
             return this.b(p0, p1);
           default:
             return this.a(p0, p1);
       }
    }
}
