package p.zh2;
import java.lang.Object;
import p.r8;
import p.sh0;
import p.cc3;
import java.lang.NullPointerException;
import java.lang.String;
import p.rc3;
import java.util.List;
import p.db3;
import p.qc3;
import java.lang.Integer;
import p.jv3;
import java.lang.Long;
import p.cj3;
import p.i80;
import java.util.Arrays;
import java.lang.System;
import java.lang.IllegalArgumentException;
import androidx.recyclerview.widget.RecyclerView;
import p.hr5;
import p.o7;
import p.yq5;
import p.vr5;
import p.pr5;
import java.lang.Byte;
import java.lang.Class;
import java.lang.reflect.Array;
import p.w36;
import p.yx1;
import p.h30;
import java.lang.Boolean;
import p.h80;
import p.md1;
import java.lang.Double;
import p.cq7;
import java.lang.Enum;
import p.qm5;
import java.lang.Float;
import p.y52;

public final class zh2	// class@002ef7 from classes.dex
{
    public int a;
    public int b;
    public int c;
    public Object d;

    public void zh2(){
       super();
    }
    public void zh2(int p0,int p1){
       super();
       r8[] or8Array = new r8[p0];
       this.d = or8Array;
       int len = or8Array.length;
       for (int i = 0; i < len; i = i + 1) {
          int i1 = p1 + 4;
          i1 = i1 * 17;
          i1 = i1 + 1;
          this.d[i] = new r8(i1, 6);
       }
       this.c = p1 * 17;
       this.b = p0;
       this.a = -1;
       return;
    }
    public void zh2(sh0 p0){
       super();
       this.c = 0;
       if (p0 == null) {
          throw new NullPointerException("input");
       }
       this.d = p0;
       p0.d = this;
       return;
    }
    public static void Q(int p0){
       if (!((p0 & 0x03))) {
          return;
       }
       throw rc3.f();
    }
    public static void R(int p0){
       if (!((p0 & 0x07))) {
          return;
       }
       throw rc3.f();
    }
    public final int A(){
       this.O(5);
       return this.d.u();
    }
    public final void B(List p0){
       int i1;
       int i3;
       int i = 5;
       if (p0 instanceof db3) {
          db3 uodb3 = p0;
          if ((i1 = this.a & 0x07) != 2) {
             if (i1 == i) {
                while (true) {
                   uodb3.c(this.d.u());
                   if (this.d.e()) {
                      return;
                   }
                   if ((i1 = this.d.A()) != this.a) {
                      break ;
                   }
                }
                this.c = i1;
                return;
             }else {
                throw new qc3();
             }
          }else {
             i1 = this.d.B();
             zh2.Q(i1);
             int i2 = this.d.d() + i1;
             do {
                uodb3.c(this.d.u());
             } while (this.d.d() >= i2);
          }
       }else if((i3 = this.a & 0x07) != 2){
          if (i3 == i) {
             while (true) {
                p0.add(Integer.valueOf(this.d.u()));
                if (this.d.e()) {
                   return;
                }
                if ((i3 = this.d.A()) != this.a) {
                   break ;
                }
             }
             this.c = i3;
             return;
          }else {
             throw new qc3();
          }
       }else {
          i3 = this.d.B();
          zh2.Q(i3);
          i = this.d.d() + i3;
          do {
             p0.add(Integer.valueOf(this.d.u()));
          } while (this.d.d() >= i);
       }
       return;
    }
    public final long C(){
       this.O(1);
       return this.d.v();
    }
    public final void D(List p0){
       int i2;
       int i3;
       int i = 2;
       int i1 = 1;
       if (p0 instanceof jv3) {
          jv3 ojv3 = p0;
          if ((i2 = this.a & 0x07) != i1) {
             if (i2 == i) {
                i2 = this.d.B();
                zh2.R(i2);
                i = this.d.d() + i2;
                do {
                   ojv3.c(this.d.v());
                } while (this.d.d() >= i);
             }else {
                throw new qc3();
             }
          }else {
             while (true) {
                ojv3.c(this.d.v());
                if (this.d.e()) {
                   return;
                }
                if ((i2 = this.d.A()) != this.a) {
                   break ;
                }
             }
             this.c = i2;
             return;
          }
       }else if((i3 = this.a & 0x07) != i1){
          if (i3 == i) {
             i3 = this.d.B();
             zh2.R(i3);
             i = this.d.d() + i3;
             do {
                p0.add(Long.valueOf(this.d.v()));
             } while (this.d.d() >= i);
          }else {
             throw new qc3();
          }
       }else {
          while (true) {
             p0.add(Long.valueOf(this.d.v()));
             if (this.d.e()) {
                return;
             }
             if ((i3 = this.d.A()) != this.a) {
                break ;
             }
          }
          this.c = i3;
          return;
       }
       return;
    }
    public final int E(){
       this.O(0);
       return this.d.w();
    }
    public final void F(List p0){
       int i1;
       int i2;
       int i = 2;
       if (p0 instanceof db3) {
          db3 uodb3 = p0;
          if (i1 = this.a & 0x07) {
             if (i1 == i) {
                i = this.d.d() + this.d.B();
                do {
                   uodb3.c(this.d.w());
                } while (this.d.d() >= i);
                this.N(i);
             }else {
                throw rc3.c();
             }
          }else {
             while (true) {
                uodb3.c(this.d.w());
                if (this.d.e()) {
                   return;
                }
                if ((i1 = this.d.A()) != this.a) {
                   break ;
                }
             }
             this.c = i1;
             return;
          }
       }else if(i2 = this.a & 0x07){
          if (i2 == i) {
             i = this.d.d() + this.d.B();
             do {
                p0.add(Integer.valueOf(this.d.w()));
             } while (this.d.d() >= i);
             this.N(i);
          }else {
             throw rc3.c();
          }
       }else {
          while (true) {
             p0.add(Integer.valueOf(this.d.w()));
             if (this.d.e()) {
                return;
             }
             if ((i2 = this.d.A()) != this.a) {
                break ;
             }
          }
          this.c = i2;
          return;
       }
       return;
    }
    public final long G(){
       this.O(0);
       return this.d.x();
    }
    public final void H(List p0){
       int i1;
       int i2;
       int i = 2;
       if (p0 instanceof jv3) {
          jv3 ojv3 = p0;
          if (i1 = this.a & 0x07) {
             if (i1 == i) {
                i = this.d.d() + this.d.B();
                do {
                   ojv3.c(this.d.x());
                } while (this.d.d() >= i);
                this.N(i);
             }else {
                throw rc3.c();
             }
          }else {
             while (true) {
                ojv3.c(this.d.x());
                if (this.d.e()) {
                   return;
                }
                if ((i1 = this.d.A()) != this.a) {
                   break ;
                }
             }
             this.c = i1;
             return;
          }
       }else if(i2 = this.a & 0x07){
          if (i2 == i) {
             i = this.d.d() + this.d.B();
             do {
                p0.add(Long.valueOf(this.d.x()));
             } while (this.d.d() >= i);
             this.N(i);
          }else {
             throw rc3.c();
          }
       }else {
          while (true) {
             p0.add(Long.valueOf(this.d.x()));
             if (this.d.e()) {
                return;
             }
             if ((i2 = this.d.A()) != this.a) {
                break ;
             }
          }
          this.c = i2;
          return;
       }
       return;
    }
    public final void I(List p0,boolean p1){
       int i;
       int i1;
       String str;
       if ((i = this.a & 0x07) != 2) {
          throw new qc3();
       }
       if (p0 instanceof cj3 && !p1) {
          cj3 uocj3 = p0;
          while (true) {
             uocj3.e(this.k());
             if (this.d.e()) {
                return;
             }
             if ((i1 = this.d.A()) != this.a) {
                break ;
             }
          }
          this.c = i1;
          return;
       }else if(p1){
          this.O(2);
          str = this.d.z();
       }else {
          this.O(2);
          str = this.d.y();
       }
       p0.add(str);
       if (this.d.e()) {
       }else {
          if ((i = this.d.A()) != this.a) {
             this.c = i;
             return;
          }
       }
    }
    public final int J(){
       this.O(0);
       return this.d.B();
    }
    public final void K(List p0){
       int i1;
       int i2;
       int i = 2;
       if (p0 instanceof db3) {
          db3 uodb3 = p0;
          if (i1 = this.a & 0x07) {
             if (i1 == i) {
                i = this.d.d() + this.d.B();
                do {
                   uodb3.c(this.d.B());
                } while (this.d.d() >= i);
                this.N(i);
             }else {
                throw rc3.c();
             }
          }else {
             while (true) {
                uodb3.c(this.d.B());
                if (this.d.e()) {
                   return;
                }
                if ((i1 = this.d.A()) != this.a) {
                   break ;
                }
             }
             this.c = i1;
             return;
          }
       }else if(i2 = this.a & 0x07){
          if (i2 == i) {
             i = this.d.d() + this.d.B();
             do {
                p0.add(Integer.valueOf(this.d.B()));
             } while (this.d.d() >= i);
             this.N(i);
          }else {
             throw rc3.c();
          }
       }else {
          while (true) {
             p0.add(Integer.valueOf(this.d.B()));
             if (this.d.e()) {
                return;
             }
             if ((i2 = this.d.A()) != this.a) {
                break ;
             }
          }
          this.c = i2;
          return;
       }
       return;
    }
    public final long L(){
       this.O(0);
       return this.d.C();
    }
    public final void M(List p0){
       int i1;
       int i2;
       int i = 2;
       if (p0 instanceof jv3) {
          jv3 ojv3 = p0;
          if (i1 = this.a & 0x07) {
             if (i1 == i) {
                i = this.d.d() + this.d.B();
                do {
                   ojv3.c(this.d.C());
                } while (this.d.d() >= i);
                this.N(i);
             }else {
                throw rc3.c();
             }
          }else {
             while (true) {
                ojv3.c(this.d.C());
                if (this.d.e()) {
                   return;
                }
                if ((i1 = this.d.A()) != this.a) {
                   break ;
                }
             }
             this.c = i1;
             return;
          }
       }else if(i2 = this.a & 0x07){
          if (i2 == i) {
             i = this.d.d() + this.d.B();
             do {
                p0.add(Long.valueOf(this.d.C()));
             } while (this.d.d() >= i);
             this.N(i);
          }else {
             throw rc3.c();
          }
       }else {
          while (true) {
             p0.add(Long.valueOf(this.d.C()));
             if (this.d.e()) {
                return;
             }
             if ((i2 = this.d.A()) != this.a) {
                break ;
             }
          }
          this.c = i2;
          return;
       }
       return;
    }
    public final void N(int p0){
       if (this.d.d() == p0) {
          return;
       }
       throw rc3.g();
    }
    public final void O(int p0){
       if (((this.a & 0x07)) == p0) {
          return;
       }
       throw rc3.c();
    }
    public final boolean P(){
       zh2 ta;
       if (!this.d.e() && (ta = this.a) != this.b) {
          return this.d.D(ta);
       }
       return false;
    }
    public final void a(int p0,int p1){
       if (p0 < 0) {
          throw new IllegalArgumentException("Layout positions must be non-negative");
       }
       if (p1 < 0) {
          throw new IllegalArgumentException("Pixel distance must be non-negative");
       }
       int i = this.c * 2;
       zh2 td = this.d;
       if (td == null) {
          int[] ointArray = new int[4];
          this.d = ointArray;
          Arrays.fill(ointArray, -1);
       }else if(i >= td.length){
          int[] ointArray1 = new int[(i * 2)];
          this.d = ointArray1;
          System.arraycopy(td, 0, ointArray1, 0, td.length);
       }
       td = this.d;
       td[i] = p0;
       td[(i + 1)] = p1;
       this.c = this.c + 1;
       return;
    }
    public final void b(RecyclerView p0,boolean p1){
       zh2 td;
       zh2 tc;
       int i = 0;
       this.c = i;
       if ((td = this.d) != null) {
          Arrays.fill(td, -1);
       }
       RecyclerView e = p0.E;
       if (p0.D != null && (e != null && e.A != null)) {
          if (p1) {
             if (!p0.v.g()) {
                e.u(p0.D.d(), this);
             }
          }else if(p0.L != null && (p0.U == null && !p0.v.g())){
             i = 1;
          }
          if (!i) {
             e.t(this.a, this.b, p0.y0, this);
          }
          if ((tc = this.c) > e.B) {
             e.B = tc;
             e.C = p1;
             p0.c.n();
          }
       }
       return;
    }
    public final r8 c(){
       return this.d[this.a];
    }
    public final int d(){
       zh2 tc;
       if ((tc = this.c) != null) {
          this.a = tc;
          this.c = 0;
       }else {
          this.a = this.d.A();
       }
       if ((tc = this.a) != null && tc != this.b) {
          return (tc >> 3);
       }else {
          return Integer.MAX_VALUE;
       }
    }
    public final byte[][] e(int p0,int p1){
       int[] ointArray = new int[]{this.b * p1,this.c * p0};
       byte[][] uobyteArray = Array.newInstance(Byte.TYPE, ointArray);
       int i = this.b * p1;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          int i2 = i - i1;
          i2 = i2 - 1;
          int i3 = i1 / p1;
          object oobject = this.d[i3];
          i3 = oobject.c.length * p0;
          byte[] uobyteArray1 = new byte[i3];
          for (int i4 = 0; i4 < i3; i4 = i4 + 1) {
             int i5 = i4 / p0;
             uobyteArray1[i4] = oobject.c[i5];
          }
          uobyteArray[i2] = uobyteArray1;
       }
       return uobyteArray;
    }
    public final void f(Object p0,w36 p1,yx1 p2){
       this.O(3);
       this.g(p0, p1, p2);
    }
    public final void g(Object p0,w36 p1,yx1 p2){
       zh2 tb = this.b;
       this.b = ((this.a >> 3) << 3) | 0x04;
       p1.c(p0, this, p2);
       if (this.a != this.b) {
          throw rc3.f();
       }
       this.b = tb;
       return;
    }
    public final void h(Object p0,w36 p1,yx1 p2){
       int i = this.d.B();
       zh2 td = this.d;
       if (td.a >= td.b) {
          throw new rc3("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit\(\) to increase the depth limit.");
       }
       td = this.d;
       td.a = td.a + 1;
       p1.c(p0, this, p2);
       this.d.a(0);
       p0 = this.d;
       p0.a = p0.a - 1;
       p0.i(td.j(i));
       return;
    }
    public final boolean i(){
       this.O(0);
       return this.d.k();
    }
    public final void j(List p0){
       int i1;
       int i2;
       int i = 2;
       if (p0 instanceof h30) {
          h30 oh30 = p0;
          if (i1 = this.a & 0x07) {
             if (i1 == i) {
                i = this.d.d() + this.d.B();
                do {
                   oh30.c(this.d.k());
                } while (this.d.d() >= i);
                this.N(i);
             }else {
                throw rc3.c();
             }
          }else {
             while (true) {
                oh30.c(this.d.k());
                if (this.d.e()) {
                   return;
                }
                if ((i1 = this.d.A()) != this.a) {
                   break ;
                }
             }
             this.c = i1;
             return;
          }
       }else if(i2 = this.a & 0x07){
          if (i2 == i) {
             i = this.d.d() + this.d.B();
             do {
                p0.add(Boolean.valueOf(this.d.k()));
             } while (this.d.d() >= i);
             this.N(i);
          }else {
             throw rc3.c();
          }
       }else {
          while (true) {
             p0.add(Boolean.valueOf(this.d.k()));
             if (this.d.e()) {
                return;
             }
             if ((i2 = this.d.A()) != this.a) {
                break ;
             }
          }
          this.c = i2;
          return;
       }
       return;
    }
    public final i80 k(){
       this.O(2);
       return this.d.l();
    }
    public final void l(List p0){
       int i;
       if (((this.a & 0x07)) != 2) {
          throw rc3.c();
       }
       while (true) {
          p0.add(this.k());
          if (this.d.e()) {
             return;
          }
          if ((i = this.d.A()) != this.a) {
             break ;
          }
       }
       this.c = i;
       return;
    }
    public final double m(){
       this.O(1);
       return this.d.m();
    }
    public final void n(List p0){
       int i2;
       int i3;
       int i = 2;
       int i1 = 1;
       if (p0 instanceof md1) {
          md1 omd1 = p0;
          if ((i2 = this.a & 0x07) != i1) {
             if (i2 == i) {
                i2 = this.d.B();
                zh2.R(i2);
                i = this.d.d() + i2;
                do {
                   omd1.c(this.d.m());
                } while (this.d.d() >= i);
             }else {
                throw new qc3();
             }
          }else {
             while (true) {
                omd1.c(this.d.m());
                if (this.d.e()) {
                   return;
                }
                if ((i2 = this.d.A()) != this.a) {
                   break ;
                }
             }
             this.c = i2;
             return;
          }
       }else if((i3 = this.a & 0x07) != i1){
          if (i3 == i) {
             i3 = this.d.B();
             zh2.R(i3);
             i = this.d.d() + i3;
             do {
                p0.add(Double.valueOf(this.d.m()));
             } while (this.d.d() >= i);
          }else {
             throw new qc3();
          }
       }else {
          while (true) {
             p0.add(Double.valueOf(this.d.m()));
             if (this.d.e()) {
                return;
             }
             if ((i3 = this.d.A()) != this.a) {
                break ;
             }
          }
          this.c = i3;
          return;
       }
       return;
    }
    public final void o(List p0){
       int i1;
       int i2;
       int i = 2;
       if (p0 instanceof db3) {
          db3 uodb3 = p0;
          if (i1 = this.a & 0x07) {
             if (i1 == i) {
                i = this.d.d() + this.d.B();
                do {
                   uodb3.c(this.d.n());
                } while (this.d.d() >= i);
                this.N(i);
             }else {
                throw rc3.c();
             }
          }else {
             while (true) {
                uodb3.c(this.d.n());
                if (this.d.e()) {
                   return;
                }
                if ((i1 = this.d.A()) != this.a) {
                   break ;
                }
             }
             this.c = i1;
             return;
          }
       }else if(i2 = this.a & 0x07){
          if (i2 == i) {
             i = this.d.d() + this.d.B();
             do {
                p0.add(Integer.valueOf(this.d.n()));
             } while (this.d.d() >= i);
             this.N(i);
          }else {
             throw rc3.c();
          }
       }else {
          while (true) {
             p0.add(Integer.valueOf(this.d.n()));
             if (this.d.e()) {
                return;
             }
             if ((i2 = this.d.A()) != this.a) {
                break ;
             }
          }
          this.c = i2;
          return;
       }
       return;
    }
    public final Object p(cq7 p0,Class p1,yx1 p2){
       switch (p0.ordinal()){
           case 0:
             return Double.valueOf(this.m());
           case 1:
             return Float.valueOf(this.u());
           case 2:
             return Long.valueOf(this.y());
           case 3:
             return Long.valueOf(this.L());
           case 4:
             return Integer.valueOf(this.w());
           case 5:
             return Long.valueOf(this.s());
           case 6:
             return Integer.valueOf(this.q());
           case 7:
             return Boolean.valueOf(this.i());
           case 8:
             this.O(2);
             return this.d.z();
           case 10:
             this.O(2);
             w36 ow36 = qm5.c.a(p1);
             p1 = ow36.i();
             this.h(p1, ow36, p2);
             ow36.d(p1);
             return p1;
           case 11:
             return this.k();
           case 12:
             return Integer.valueOf(this.J());
           case 13:
             this.O(0);
             return Integer.valueOf(this.d.n());
           case 14:
             return Integer.valueOf(this.A());
           case 15:
             return Long.valueOf(this.C());
           case 16:
             return Integer.valueOf(this.E());
           case 17:
             return Long.valueOf(this.G());
           default:
             throw new IllegalArgumentException("unsupported field type.");
       }
    }
    public final int q(){
       this.O(5);
       return this.d.o();
    }
    public final void r(List p0){
       int i1;
       int i3;
       int i = 5;
       if (p0 instanceof db3) {
          db3 uodb3 = p0;
          if ((i1 = this.a & 0x07) != 2) {
             if (i1 == i) {
                while (true) {
                   uodb3.c(this.d.o());
                   if (this.d.e()) {
                      return;
                   }
                   if ((i1 = this.d.A()) != this.a) {
                      break ;
                   }
                }
                this.c = i1;
                return;
             }else {
                throw new qc3();
             }
          }else {
             i1 = this.d.B();
             zh2.Q(i1);
             int i2 = this.d.d() + i1;
             do {
                uodb3.c(this.d.o());
             } while (this.d.d() >= i2);
          }
       }else if((i3 = this.a & 0x07) != 2){
          if (i3 == i) {
             while (true) {
                p0.add(Integer.valueOf(this.d.o()));
                if (this.d.e()) {
                   return;
                }
                if ((i3 = this.d.A()) != this.a) {
                   break ;
                }
             }
             this.c = i3;
             return;
          }else {
             throw new qc3();
          }
       }else {
          i3 = this.d.B();
          zh2.Q(i3);
          i = this.d.d() + i3;
          do {
             p0.add(Integer.valueOf(this.d.o()));
          } while (this.d.d() >= i);
       }
       return;
    }
    public final long s(){
       this.O(1);
       return this.d.p();
    }
    public final void t(List p0){
       int i2;
       int i3;
       int i = 2;
       int i1 = 1;
       if (p0 instanceof jv3) {
          jv3 ojv3 = p0;
          if ((i2 = this.a & 0x07) != i1) {
             if (i2 == i) {
                i2 = this.d.B();
                zh2.R(i2);
                i = this.d.d() + i2;
                do {
                   ojv3.c(this.d.p());
                } while (this.d.d() >= i);
             }else {
                throw new qc3();
             }
          }else {
             while (true) {
                ojv3.c(this.d.p());
                if (this.d.e()) {
                   return;
                }
                if ((i2 = this.d.A()) != this.a) {
                   break ;
                }
             }
             this.c = i2;
             return;
          }
       }else if((i3 = this.a & 0x07) != i1){
          if (i3 == i) {
             i3 = this.d.B();
             zh2.R(i3);
             i = this.d.d() + i3;
             do {
                p0.add(Long.valueOf(this.d.p()));
             } while (this.d.d() >= i);
          }else {
             throw new qc3();
          }
       }else {
          while (true) {
             p0.add(Long.valueOf(this.d.p()));
             if (this.d.e()) {
                return;
             }
             if ((i3 = this.d.A()) != this.a) {
                break ;
             }
          }
          this.c = i3;
          return;
       }
       return;
    }
    public final float u(){
       this.O(5);
       return this.d.q();
    }
    public final void v(List p0){
       int i1;
       int i3;
       int i = 5;
       if (p0 instanceof y52) {
          y52 oy52 = p0;
          if ((i1 = this.a & 0x07) != 2) {
             if (i1 == i) {
                while (true) {
                   oy52.c(this.d.q());
                   if (this.d.e()) {
                      return;
                   }
                   if ((i1 = this.d.A()) != this.a) {
                      break ;
                   }
                }
                this.c = i1;
                return;
             }else {
                throw new qc3();
             }
          }else {
             i1 = this.d.B();
             zh2.Q(i1);
             int i2 = this.d.d() + i1;
             do {
                oy52.c(this.d.q());
             } while (this.d.d() >= i2);
          }
       }else if((i3 = this.a & 0x07) != 2){
          if (i3 == i) {
             while (true) {
                p0.add(Float.valueOf(this.d.q()));
                if (this.d.e()) {
                   return;
                }
                if ((i3 = this.d.A()) != this.a) {
                   break ;
                }
             }
             this.c = i3;
             return;
          }else {
             throw new qc3();
          }
       }else {
          i3 = this.d.B();
          zh2.Q(i3);
          i = this.d.d() + i3;
          do {
             p0.add(Float.valueOf(this.d.q()));
          } while (this.d.d() >= i);
       }
       return;
    }
    public final int w(){
       this.O(0);
       return this.d.r();
    }
    public final void x(List p0){
       int i1;
       int i2;
       int i = 2;
       if (p0 instanceof db3) {
          db3 uodb3 = p0;
          if (i1 = this.a & 0x07) {
             if (i1 == i) {
                i = this.d.d() + this.d.B();
                do {
                   uodb3.c(this.d.r());
                } while (this.d.d() >= i);
                this.N(i);
             }else {
                throw rc3.c();
             }
          }else {
             while (true) {
                uodb3.c(this.d.r());
                if (this.d.e()) {
                   return;
                }
                if ((i1 = this.d.A()) != this.a) {
                   break ;
                }
             }
             this.c = i1;
             return;
          }
       }else if(i2 = this.a & 0x07){
          if (i2 == i) {
             i = this.d.d() + this.d.B();
             do {
                p0.add(Integer.valueOf(this.d.r()));
             } while (this.d.d() >= i);
             this.N(i);
          }else {
             throw rc3.c();
          }
       }else {
          while (true) {
             p0.add(Integer.valueOf(this.d.r()));
             if (this.d.e()) {
                return;
             }
             if ((i2 = this.d.A()) != this.a) {
                break ;
             }
          }
          this.c = i2;
          return;
       }
       return;
    }
    public final long y(){
       this.O(0);
       return this.d.s();
    }
    public final void z(List p0){
       int i1;
       int i2;
       int i = 2;
       if (p0 instanceof jv3) {
          jv3 ojv3 = p0;
          if (i1 = this.a & 0x07) {
             if (i1 == i) {
                i = this.d.d() + this.d.B();
                do {
                   ojv3.c(this.d.s());
                } while (this.d.d() >= i);
                this.N(i);
             }else {
                throw rc3.c();
             }
          }else {
             while (true) {
                ojv3.c(this.d.s());
                if (this.d.e()) {
                   return;
                }
                if ((i1 = this.d.A()) != this.a) {
                   break ;
                }
             }
             this.c = i1;
             return;
          }
       }else if(i2 = this.a & 0x07){
          if (i2 == i) {
             i = this.d.d() + this.d.B();
             do {
                p0.add(Long.valueOf(this.d.s()));
             } while (this.d.d() >= i);
             this.N(i);
          }else {
             throw rc3.c();
          }
       }else {
          while (true) {
             p0.add(Long.valueOf(this.d.s()));
             if (this.d.e()) {
                return;
             }
             if ((i2 = this.d.A()) != this.a) {
                break ;
             }
          }
          this.c = i2;
          return;
       }
       return;
    }
}
