package p.l;
import java.lang.reflect.ParameterizedType;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.Class;
import java.lang.reflect.Modifier;
import p.co5;
import p.mi;
import java.util.Arrays;
import java.lang.String;
import java.lang.StringBuilder;

public final class l implements ParameterizedType, Serializable	// class@001d11 from classes.dex
{
    public final Type a;
    public final Type b;
    public final Type[] c;

    public void l(Type p0,Type p1,Type[] p2){
       super();
       int i = 0;
       if (p1 instanceof Class) {
          Class uClass = p1;
          boolean b = true;
          uClass = (!Modifier.isStatic(uClass.getModifiers()) && uClass.getEnclosingClass() != null)? 0: 1;
          if (p0 == null && !uClass) {
             b = false;
          }
          co5.g(b);
       }
       p0 = (p0 == null)? null: mi.e(p0);
       this.a = p0;
       this.b = mi.e(p1);
       Type[] typeArray = p2.clone();
       this.c = typeArray;
       int len = typeArray.length;
       for (; i < len; i = i + 1) {
          this.c[i].getClass();
          mi.f(this.c[i]);
          l tc = this.c;
          tc[i] = mi.e(tc[i]);
       }
       return;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof ParameterizedType && mi.o(this, p0))? true: false;
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
       l ta;
       int i = Arrays.hashCode(this.c) ^ this.b.hashCode();
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       return (i ^ i1);
    }
    public final String toString(){
       l tc = this.c;
       int len = tc.length;
       l tb = this.b;
       if (!len) {
          return mi.P(tb);
       }
       StringBuilder str = new StringBuilder(((len + 1) * 30))+mi.P(tb)+"<"+mi.P(tc[0]);
       for (int i = 1; i < len; i = i + 1) {
          str = str.append(", ").append(mi.P(tc[i]));
       }
       return str+">";
    }
}
