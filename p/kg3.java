package p.kg3;
import java.io.Closeable;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.util.Arrays;
import p.cd2;
import p.xq7;
import p.mf3;
import p.en6;

public abstract class kg3 implements Closeable	// class@001c09 from classes.dex
{
    public int a;
    public int[] b;
    public String[] c;
    public int[] t;
    public static final String[] v;

    static {
       String[] stringArray = new String[128];
       kg3.v = stringArray;
       int i = 0;
       for (int i1 = 0; i1 <= 31; i1 = i1 + 1) {
          Object[] objArray = new Object[1];
          objArray[i] = Integer.valueOf(i1);
          kg3.v[i1] = String.format("\\u%04x", objArray);
       }
       stringArray = kg3.v;
       stringArray[34] = "\\\"";
       stringArray[92] = "\\\\";
       stringArray[9] = "\\t";
       stringArray[8] = "\\b";
       stringArray[10] = "\\n";
       stringArray[13] = "\\r";
       stringArray[12] = "\\f";
    }
    public void kg3(){
       super();
       int[] ointArray = new int[32];
       this.b = ointArray;
       String[] stringArray = new String[32];
       this.c = stringArray;
       int[] ointArray1 = new int[32];
       this.t = ointArray1;
    }
    public abstract boolean J();
    public abstract boolean T();
    public abstract void b();
    public final String d(){
       int i1;
       object oobject;
       kg3 ta = this.a;
       kg3 tb = this.b;
       kg3 tc = this.c;
       kg3 tt = this.t;
       String str = "$";
       int i = 0;
       while (i < ta) {
          if ((i1 = tb[i]) != 1 && i1 != 2) {
             if (i1 == 3 || (i1 == 4 || i1 == 5)) {
                str = str.append('.');
                if ((oobject = tc[i]) != null) {
                   str = str.append(oobject);
                }
             }
          }else {
             str = str.append('[').append(tt[i]).append(']');
          }
          i = i + 1;
       }
       return str;
    }
    public abstract void f();
    public abstract double g0();
    public abstract int h0();
    public abstract String i0();
    public abstract int j0();
    public final void k0(int p0){
       kg3 ta = this.a;
       kg3 tb = this.b;
       if (ta == tb.length) {
          if (ta != 256) {
             this.b = Arrays.copyOf(tb, (tb.length * 2));
             ta = this.c;
             this.c = Arrays.copyOf(ta, (ta.length * 2));
             ta = this.t;
             this.t = Arrays.copyOf(ta, (ta.length * 2));
          }else {
             throw new cd2("Nesting too deep at "+this.d(), 2);
          }
       }
       tb = this.a;
       this.a = tb + 1;
       this.b[tb] = p0;
       return;
    }
    public abstract int l0(xq7 p0);
    public abstract void m0();
    public abstract void n0();
    public final void o0(String p0){
       throw new mf3(en6.s(p0, " at path ")+this.d());
    }
    public abstract void x();
    public abstract void y();
}
