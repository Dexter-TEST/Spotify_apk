package p.ef7;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Objects;
import p.do5;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class ef7 implements ParameterizedType	// class@0001d5 from classes2.dex
{
    public final Type a;
    public final Type b;
    public final Type[] c;

    public void ef7(Type p0,Type p1,Type[] p2){
       int i1;
       super();
       int i = 0;
       if (p1 instanceof Class) {
          i1 = 1;
          int i2 = (p0 == null)? 1: 0;
          if (p1.getEnclosingClass() != null) {
             i1 = 0;
          }
          if (i2 != i1) {
             throw new IllegalArgumentException();
          }
       }
       i1 = p2.length;
       for (; i < i1; i = i + 1) {
          object oobject = p2[i];
          Objects.requireNonNull(oobject, "typeArgument == null");
          do5.h(oobject);
       }
       this.a = p0;
       this.b = p1;
       this.c = p2.clone();
       return;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof ParameterizedType && do5.r(this, p0))? true: false;
       return b;
    }
    public final Type[] getActualTypeArguments(){
       return this.c.clone();
    }
    public final Type getOwnerType(){
       return this.a;
    }
    public final Type getRawType(){
       return this.b;
    }
    public final int hashCode(){
       ef7 ta;
       int i = Arrays.hashCode(this.c) ^ this.b.hashCode();
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       return (i ^ i1);
    }
    public final String toString(){
       ef7 tc = this.c;
       ef7 tb = this.b;
       if (!tc.length) {
          return do5.w0(tb);
       }
       int i = 1;
       StringBuilder str = new StringBuilder(((tc.length + i) * 30))+do5.w0(tb)+"<"+do5.w0(tc[0]);
       for (; i < tc.length; i = i + 1) {
          str = str.append(", ").append(do5.w0(tc[i]));
       }
       return str+">";
    }
}
