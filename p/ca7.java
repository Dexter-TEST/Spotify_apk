package p.ca7;
import p.he3;
import p.fa7;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Short;
import java.lang.Character;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;
import java.lang.Void;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.reflect.TypeVariable;

public abstract class ca7 extends he3	// class@0011ce from classes.dex
{
    public final he3 w;
    public final he3[] x;
    public final fa7 y;
    public static final fa7 z;

    static {
       ca7.z = fa7.x;
    }
    public void ca7(Class p0,fa7 p1,he3 p2,he3[] p3,int p4,Object p5,Object p6,boolean p7){
       super(p0, p4, p5, p6, p7);
       if (p1 == null) {
          p1 = ca7.z;
       }
       this.y = p1;
       this.w = p2;
       this.x = p3;
       return;
    }
    public static void o(Class p0,StringBuilder p1,boolean p2){
       char c;
       if (p0.isPrimitive()) {
          if (p0 == Boolean.TYPE) {
             p1+'Z';
          }else if(p0 == Byte.TYPE){
             p1+'B';
          }else if(p0 == Short.TYPE){
             p1+'S';
          }else if(p0 == Character.TYPE){
             p1+'C';
          }else if(p0 == Integer.TYPE){
             p1+'I';
          }else if(p0 == Long.TYPE){
             p1+'J';
          }else if(p0 == Float.TYPE){
             p1+'F';
          }else if(p0 == Double.TYPE){
             p1+'D';
          }else if(p0 == Void.TYPE){
             p1+'V';
          }else {
             throw new IllegalStateException("Unrecognized primitive type: ".concat(p0.getName()));
          }
       }else {
          p1 = p1+'L';
          String name = p0.getName();
          int i = name.length();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             if ((c = name.charAt(i1)) == '.') {
                c = '/';
             }
             p1 = p1.append(c);
          }
          if (p2) {
             p1+';';
          }
       }
       return;
    }
    public final String c(){
       return this.q();
    }
    public final boolean p(int p0){
       boolean b = (this.a.getTypeParameters().length == p0)? true: false;
       return b;
    }
    public String q(){
       return this.a.getName();
    }
}
