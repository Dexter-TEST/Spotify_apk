package p.ng3;
import java.lang.Object;
import java.util.Arrays;
import java.lang.String;
import java.lang.StringBuilder;
import p.me0;

public abstract class ng3	// class@001fd1 from classes.dex
{
    public final int a;
    public int b;
    public int c;

    public void ng3(int p0){
       this.a = p0;
       if (p0 != 1) {
          super();
          return;
       }else {
          super();
          this.b = 0;
          this.c = 0;
          return;
       }
    }
    public static final void e(short[] p0){
       Arrays.fill(p0, 1024);
    }
    public final int a(short[] p0,int p1){
       int i1;
       this.f();
       short s = p0[p1];
       ng3 tb = this.b;
       int i = (tb >> 11) * s;
       ng3 tc = this.c;
       if (((tc ^ Integer.MIN_VALUE)) < (Integer.MIN_VALUE ^ i)) {
          this.b = i;
          p0[p1] = (short)(s + ((s - 2048) >> 5));
          i1 = 0;
       }else {
          this.b = tb - i;
          this.c = tc - i;
          p0[p1] = (short)(s - (s >> 5));
          i1 = 1;
       }
       return i1;
    }
    public final int b(short[] p0){
       int i1;
       int i = 1;
       do {
          i1 = i << 1;
       } while ((i = this.a(p0, i) | i1) >= p0.length);
       return (i - p0.length);
    }
    public abstract String c();
    public final boolean d(){
       boolean b = true;
       if (this.b == b) {
       }else {
          b = false;
       }
       return b;
    }
    public abstract void f();
    public String toString(){
       StringBuilder str;
       ng3 tb;
       String str1;
       char c;
       int i2;
       switch (this.a){
           case 0:
             str = new StringBuilder(64);
             if ((tb = this.b) != null) {
                int i = 0;
                if (tb != 1) {
                   str = str+'{';
                   if ((str1 = this.c()) != null) {
                      str = str+'"';
                      int[] d = me0.d;
                      int len = d.length;
                      int i1 = str1.length();
                      while (i < i1) {
                         if ((c = str1.charAt(i)) < len && d[c]) {
                            str = str.append('\');
                            if ((i2 = d[c]) < 0) {
                               i2 = c >> 4;
                               char[] a = me0.a;
                               int i3 = c & 0x0f;
                               str = str.append("u00").append(a[i2]).append(a[i3]);
                            }else {
                               str = str.append((char)i2);
                            }
                         }else {
                            str = str.append(c);
                         }
                         i = i + 1;
                      }
                      str = str+'"';
                   }else {
                      str = str+'?';
                   }
                   str = str+'}';
                }else {
                   str = str+'[';
                   if ((tb = this.c) >= null) {
                      i = tb;
                   }
                   str = str+i+']';
                }
             }else {
                str = str+"/";
             }
             break;
           default:
             return super.toString();
       }
       return str;
    }
}
