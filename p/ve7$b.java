package p.ve7$b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.Class;
import p.ya7;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import p.ve7;
import java.util.Arrays;

public final class ve7$b implements ParameterizedType	// class@0029dc from classes.dex
{
    private final Type a;
    private final Type b;
    public final Type[] c;

    public void ve7$b(Type p0,Type p1,Type[] p2){
       super();
       if (p1 instanceof Class) {
          Class enclosingCla = p1.getEnclosingClass();
          if (p0 != null) {
             if (enclosingCla == null || ya7.g(p0) != enclosingCla) {
                throw new IllegalArgumentException("unexpected owner type for "+p1+": "+p0);
             }
          }else if(enclosingCla == null){
             throw new IllegalArgumentException("unexpected owner type for "+p1+": null");
          }
       }
       p0 = (p0 == null)? null: ve7.a(p0);
       this.a = p0;
       this.b = ve7.a(p1);
       this.c = p2.clone();
       int i = 0;
       while (true) {
          ve7$b tc = this.c;
          if (i < tc.length) {
             object oobject = tc[i];
             oobject.getClass();
             ve7.b(oobject);
             tc = this.c;
             tc[i] = ve7.a(tc[i]);
             i++;
          }else {
             break ;
          }
       }
       return;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof ParameterizedType && ya7.d(this, p0))? true: false;
       return b;
    }
    public Type[] getActualTypeArguments(){
       return this.c.clone();
    }
    public Type getOwnerType(){
       return this.a;
    }
    public Type getRawType(){
       return this.b;
    }
    public int hashCode(){
       return ((Arrays.hashCode(this.c) ^ this.b.hashCode()) ^ ve7.g(this.a));
    }
    public String toString(){
       int i = 1;
       StringBuilder str = new StringBuilder(((this.c.length + i) * 30))+ve7.v(this.b);
       if (!this.c.length) {
          return str;
       }
       str = str+"<"+ve7.v(this.c[0]);
       for (; i < this.c.length; i = i + 1) {
          str = str.append(", ").append(ve7.v(this.c[i]));
       }
       return str+">";
    }
}
