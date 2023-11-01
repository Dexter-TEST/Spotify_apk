package p.v54;
import p.nf6;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.vu6;
import p.ge6;
import java.lang.ref.SoftReference;
import p.ja4;
import java.lang.StringBuffer;
import java.lang.reflect.Modifier;

public abstract class v54 implements nf6	// class@00037f from classes2.dex
{
    public int a;
    public String b;
    public String c;
    public Class d;
    public ge6 e;
    public static boolean f = true;

    public void v54(int p0,Class p1,String p2){
       super();
       this.a = p0;
       this.b = p2;
       this.d = p1;
    }
    public final String a(){
       v54 te;
       object oobject;
       v54 a;
       ja4 i2;
       String[] stringArray;
       String[] stringArray1;
       vu6 f = vu6.f;
       int i = 0;
       int i1 = 3;
       String str = null;
       if (v54.f) {
          if ((te = this.e) == null) {
             this.e = new ge6(i1);
          }else {
             vu6 e = f.e;
             if ((stringArray1 = te.a.get()) != null) {
                oobject = stringArray1[e];
             label_002b :
                if (oobject == null) {
                   ge6 oge6 = this;
                   StringBuffer str1 = "";
                   if ((a = oge6.a) != -1) {
                      String str2 = " ";
                      if (f.c != null) {
                         str = Modifier.toString(a);
                         if (str.length()) {
                            str = str.concat(str2);
                         label_0052 :
                            str1 = str1+str;
                            if (f.b != null) {
                               i2 = oge6.i;
                               i2.getClass();
                               str1 = str1+vu6.a(i2, i2.getName(), f.a);
                            }
                            if (f.b != null) {
                               str1 = str1+str2;
                            }
                            v54 d = oge6.d;
                            d.getClass();
                            if (oge6.c == null) {
                               a = oge6.d;
                               a.getClass();
                               oge6.c = a.getName();
                            }
                            d = oge6.b;
                            d.getClass();
                            str1 = str1+vu6.a(d, oge6.c, f.d)+"."+d;
                            i2 = oge6.g;
                            i2.getClass();
                            if (f.b == null) {
                               if (!i2.length) {
                                  str1 = str1+"\(\)";
                               }else {
                                  str1 = str1+"\(..\)";
                               }
                            }else {
                               str1 = str1+"\(";
                               for (; i < i2.length; i = i + 1) {
                                  if (i > 0) {
                                     str1 = str1.append(", ");
                                  }
                                  object oobject1 = i2[i];
                                  str1 = str1.append(vu6.a(oobject1, oobject1.getName(), f.a));
                               }
                               str1 = str1+"\)";
                            }
                            oge6.h.getClass();
                            oobject = str1;
                         }
                      }
                      str = "";
                      goto label_0052 ;
                   }else {
                      throw str;
                   }
                }
                if (v54.f) {
                   v54 te1 = this.e;
                   f = f.e;
                   if ((stringArray = te1.a.get()) == null) {
                      stringArray = new String[i1];
                      te1.a = new SoftReference(stringArray);
                   }
                   stringArray[f] = oobject;
                }
                return oobject;
             }
          }
       }
       oobject = str;
       goto label_002b ;
    }
    public final String b(){
       return this.a();
    }
    public final String toString(){
       return this.b();
    }
}
