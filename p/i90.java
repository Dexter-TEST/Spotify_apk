package p.i90;
import p.cx5;
import java.lang.Object;
import p.h90;
import p.ui3;
import p.ej4;
import p.hp5;
import java.lang.String;
import java.lang.Long;
import java.lang.Integer;
import java.util.ArrayList;
import p.r;
import java.lang.CharSequence;
import p.av6;
import p.co5;
import p.gg1;
import java.lang.IllegalArgumentException;
import p.mp2;
import java.lang.NullPointerException;
import p.gp5;
import p.f70;

public final class i90	// class@001949 from classes.dex
{
    public final ui3 a;
    public final ui3 b;
    public final long c;
    public final long d;
    public final boolean e;
    public final mp2 f;

    public void i90(cx5 p0){
       super();
       int i = 0;
       this.a = ej4.c0(new h90(this, i));
       this.b = ej4.c0(new h90(this, 1));
       this.c = p0.B;
       this.d = p0.C;
       if (p0.v != null) {
          i = true;
       }
       this.e = i;
       this.f = p0.w;
       return;
    }
    public void i90(hp5 p0){
       String str;
       int i1;
       Object[] objArray;
       super();
       this.a = ej4.c0(new h90(this, 0));
       this.b = ej4.c0(new h90(this, 1));
       this.c = Long.parseLong(p0.B());
       this.d = Long.parseLong(p0.B());
       int b = (Integer.parseInt(p0.B()) > 0)? true: false;
       this.e = b;
       b = Integer.parseInt(p0.B());
       ArrayList uArrayList = new ArrayList(20);
       int i = 0;
       while (true) {
          if (i < b) {
             str = p0.B();
             int i2 = ((i1 = av6.m0(str, ':', 0, 0, 6)) != -1)? 1: 0;
             if (i2) {
                String str1 = str.substring(0, i1);
                co5.l(str1, "this as java.lang.String…ing\(startIndex, endIndex\)");
                str1 = av6.K0(str1).toString();
                i1 = i1 + 1;
                str = str.substring(i1);
                co5.l(str, "this as java.lang.String\).substring\(startIndex\)");
                co5.o(str1, "name");
                gg1.j(str1);
                uArrayList.add(str1);
                uArrayList.add(av6.K0(str).toString());
                i = i + 1;
             }else {
                break ;
             }
          }else {
             String[] stringArray = new String[0];
             if ((objArray = uArrayList.toArray(stringArray)) != null) {
                this.f = new mp2(objArray);
                return;
             }else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
             }
          }
       }
       throw new IllegalArgumentException("Unexpected header: ".concat(str).toString());
    }
    public final void a(gp5 p0){
       p0.X(this.c);
       p0.writeByte(10);
       p0.X(this.d);
       p0.writeByte(10);
       long l = (this.e != null)? 1: 0;
       p0.X(l);
       p0.writeByte(10);
       i90 tf = this.f;
       p0.X((long)(tf.a.length / 2));
       p0.writeByte(10);
       int i = tf.a.length / 2;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          p0.W(tf.c(i1));
          p0.W(": ");
          p0.W(tf.g(i1));
          p0.writeByte(10);
       }
       return;
    }
}
