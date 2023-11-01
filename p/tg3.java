package p.tg3;
import p.kg3;
import p.j80;
import java.lang.String;
import p.ir2;
import p.hp5;
import p.cd2;
import java.lang.StringBuilder;
import p.tp2;
import p.e70;
import p.nn6;
import java.lang.Double;
import p.mf3;
import java.lang.Integer;
import java.lang.Long;
import java.lang.AssertionError;
import p.xq7;
import p.t45;
import p.g70;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.io.EOFException;

public final class tg3 extends kg3	// class@002766 from classes.dex
{
    public int A;
    public String B;
    public final g70 w;
    public final e70 x;
    public int y;
    public long z;
    public static final j80 C;
    public static final j80 D;
    public static final j80 E;

    static {
       tg3.C = ir2.t("\'\\");
       tg3.D = ir2.t("\"\\");
       tg3.E = ir2.t("{}[]:, \n\t\r\f/\\;#=");
       ir2.t("\n\r");
       ir2.t("*/");
    }
    public void tg3(hp5 p0){
       super();
       this.y = 0;
       this.w = p0;
       this.x = p0.b;
       this.k0(6);
    }
    public final boolean J(){
       tg3 ty;
       if ((ty = this.y) == null) {
          ty = this.q0();
       }
       boolean b = (ty != 2 && (ty != 4 && ty != 18))? true: false;
       return b;
    }
    public final boolean T(){
       tg3 ty;
       kg3 tt;
       int i1;
       if ((ty = this.y) == null) {
          ty = this.q0();
       }
       int i = 0;
       if (ty == 5) {
          this.y = i;
          tt = this.t;
          i1 = this.a - 1;
          tt[i1] = tt[i1] + 1;
          return 1;
       }else if(ty == 6){
          this.y = i;
          tt = this.t;
          i1 = this.a - 1;
          tt[i1] = tt[i1] + 1;
          return i;
       }else {
          throw new cd2("Expected a boolean but was "+tp2.A(this.j0())+" at path "+this.d(), 2);
       }
    }
    public final void b(){
       tg3 ty;
       if ((ty = this.y) == null) {
          ty = this.q0();
       }
       if (ty == 3) {
          this.k0(1);
          this.t[(this.a - 1)] = 0;
          this.y = 0;
          return;
       }else {
          throw new cd2("Expected BEGIN_ARRAY but was "+tp2.A(this.j0())+" at path "+this.d(), 2);
       }
    }
    public final void close(){
       this.y = 0;
       this.b[0] = 8;
       this.a = 1;
       this.x.f();
       this.w.close();
    }
    public final void f(){
       tg3 ty;
       if ((ty = this.y) == null) {
          ty = this.q0();
       }
       if (ty == 1) {
          this.k0(3);
          this.y = 0;
          return;
       }else {
          throw new cd2("Expected BEGIN_OBJECT but was "+tp2.A(this.j0())+" at path "+this.d(), 2);
       }
    }
    public final double g0(){
       tg3 ty;
       double d;
       if ((ty = this.y) == null) {
          ty = this.q0();
       }
       int i = 0;
       if (ty == 16) {
          this.y = i;
          kg3 tt = this.t;
          int i1 = this.a - 1;
          tt[i1] = tt[i1] + 1;
          return (double)this.z;
       }else {
          int i2 = 2;
          String str = "Expected a double but was ";
          if (ty == 17) {
             this.B = this.x.r0((long)this.A);
          }else if(ty == 9){
             this.B = this.v0(tg3.D);
          }else if(ty == 8){
             this.B = this.v0(tg3.C);
          }else if(ty == 10){
             this.B = this.w0();
          }else if(ty == 11){
             throw new cd2(str+tp2.A(this.j0())+" at path "+this.d(), i2);
          }
          this.y = 11;
          try{
             d = Double.parseDouble(this.B);
             if (!Double.isNaN(d) && !Double.isInfinite(d)) {
                this.B = null;
                this.y = i;
                kg3 tt1 = this.t;
                i2 = this.a - 1;
                tt1[i2] = tt1[i2] + 1;
                return d;
             }else {
                throw new mf3("JSON forbids NaN and infinities: "+d+" at path "+this.d());
             }
          }catch(java.lang.NumberFormatException e0){
             throw new cd2(str+this.B+" at path "+this.d(), Double.isNaN(d));
          }
       }
    }
    public final int h0(){
       tg3 ty;
       int i1;
       kg3 tt;
       int i2;
       String str1;
       if ((ty = this.y) == null) {
          ty = this.q0();
       }
       int i = 0;
       String str = "Expected an int but was ";
       if (ty == 16) {
          ty = this.z;
          i1 = (int)ty;
          if (!(ty - (long)i1)) {
             this.y = i;
             tt = this.t;
             i2 = this.a - 1;
             tt[i2] = tt[i2] + 1;
             return i1;
          }else {
             throw new cd2(str+this.z+" at path "+this.d(), 2);
          }
       }else {
          i1 = 11;
          if (ty == 17) {
             this.B = this.x.r0((long)this.A);
          }else {
             i2 = 9;
             if (ty != i2 && ty != 8) {
                if (ty != i1) {
                   throw new cd2(str+tp2.A(this.j0())+" at path "+this.d(), 2);
                }
             }else if(ty == i2){
                str1 = this.v0(tg3.D);
             }else {
                str1 = this.v0(tg3.C);
             }
             this.B = str1;
             try{
                this.y = i;
                kg3 tt1 = this.t;
                int i3 = this.a - 1;
                tt1[i3] = tt1[i3] + 1;
                return Integer.parseInt(str1);
             }catch(java.lang.NumberFormatException e0){
             }
          }
          this.y = i1;
          try{
             double d = Double.parseDouble(this.B);
             i1 = (int)d;
             if (!(d - (double)i1)) {
                this.B = null;
                this.y = i;
                tt = this.t;
                i2 = this.a - 1;
                tt[i2] = tt[i2] + 1;
                return i1;
             }else {
                throw new cd2(str+this.B+" at path "+this.d(), 2);
             }
          }catch(java.lang.NumberFormatException e0){
             throw new cd2(str+this.B+" at path "+this.d(), 2);
          }
       }
    }
    public final String i0(){
       tg3 ty;
       String str;
       if ((ty = this.y) == null) {
          ty = this.q0();
       }
       if (ty == 10) {
          str = this.w0();
       }else if(ty == 9){
          str = this.v0(tg3.D);
       }else if(ty == 8){
          str = this.v0(tg3.C);
       }else if(ty == 11){
          str = this.B;
          this.B = null;
       }else if(ty == 16){
          str = Long.toString(this.z);
       }else if(ty == 17){
          str = this.x.r0((long)this.A);
       }else {
          throw new cd2("Expected a string but was "+tp2.A(this.j0())+" at path "+this.d(), 2);
       }
       this.y = 0;
       kg3 tt = this.t;
       int i = this.a - 1;
       tt[i] = tt[i] + 1;
       return str;
    }
    public final int j0(){
       tg3 ty;
       if ((ty = this.y) == null) {
          ty = this.q0();
       }
       switch (ty){
           case 1:
             return 3;
           case 2:
             return 4;
           case 3:
             return 1;
           case 4:
             return 2;
           case 5:
           case 6:
             return 8;
           case 7:
             return 9;
           case 8:
           case 10:
           case 11:
           case 9:
             return 6;
           case 12:
           case 14:
           case 15:
           case 13:
             return 5;
           case 16:
           case 17:
             return 7;
           case 18:
             return 10;
           default:
             throw new AssertionError();
       }
    }
    public final int l0(xq7 p0){
       tg3 ty;
       int i2;
       int i3;
       if ((ty = this.y) == null) {
          ty = this.q0();
       }
       int i = -1;
       if (ty >= 12) {
          int i1 = 15;
          if (ty <= i1) {
             if (ty == i1) {
                return this.r0(this.B, p0);
             }else if((i2 = this.w.U(p0.c)) != i){
                this.y = 0;
                this.c[(this.a - 1)] = p0.b[i2];
                return i2;
             }else {
                object oobject = this.c[(this.a - 1)];
                String str = this.t0();
                if ((i3 = this.r0(str, p0)) == i) {
                   this.y = i1;
                   this.B = str;
                   this.c[(this.a - 1)] = oobject;
                }
                return i3;
             }
          }
       }
       return i;
    }
    public final void m0(){
       tg3 ty;
       if ((ty = this.y) == null) {
          ty = this.q0();
       }
       if (ty == 14) {
          long l = this.w.p(tg3.E);
          tg3 tx = this.x;
          if (!(l - -1)) {
             l = tx.b;
          }
          tx.skip(l);
       }else if(ty == 13){
          this.y0(tg3.D);
       }else if(ty == 12){
          this.y0(tg3.C);
       }else if(ty == 15){
          throw new cd2("Expected a name but was "+tp2.A(this.j0())+" at path "+this.d(), 2);
       }
       this.y = 0;
       this.c[(this.a - 1)] = "null";
       return;
    }
    public final void n0(){
       tg3 ty;
       int i3;
       String str;
       int i = 0;
       int i1 = 0;
       while (true) {
          if ((ty = this.y) == null) {
             ty = this.q0();
          }
          int i2 = 3;
          if (ty == i2) {
             this.k0(1);
          label_0011 :
             i1 = i1 + 1;
          }else if(ty == 1){
             this.k0(i2);
             goto label_0011 ;
          }else {
             str = "Expected a value but was ";
             if (ty == 4) {
                if ((i1 = i1 - 1) >= 0) {
                   i3 = this.a - 1;
                   this.a = i3;
                }else {
                   throw new cd2(str+tp2.A(this.j0())+" at path "+this.d(), 2);
                }
             }else if(ty == 2){
                if ((i1 = i1 - 1) >= 0) {
                   i3 = this.a - 1;
                   this.a = i3;
                }else {
                   throw new cd2(str+tp2.A(this.j0())+" at path "+this.d(), 2);
                }
             }else {
                tg3 tx = this.x;
                if (ty != 14 && ty != 10) {
                   if (ty != 9 && ty != 13) {
                      if (ty != 8 && ty != 12) {
                         if (ty == 17) {
                            tx.skip((long)this.A);
                         }else if(ty != 18){
                            break ;
                         }
                      }else {
                         this.y0(tg3.C);
                      }
                   }else {
                      this.y0(tg3.D);
                   }
                }else {
                   long l = this.w.p(tg3.E);
                   if (!(l - -1)) {
                      l = tx.b;
                   }
                   tx.skip(l);
                }
             }
          }
          this.y = i;
          if (!i1) {
             kg3 tt = this.t;
             kg3 ta = this.a;
             i3 = ta - 1;
             tt[i3] = tt[i3] + 1;
             this.c[(ta - 1)] = "null";
             return;
          }
       }
       throw new cd2(str+tp2.A(this.j0())+" at path "+this.d(), 2);
    }
    public final void p0(){
       this.o0("Use JsonReader.setLenient\(true\) to accept malformed JSON");
       throw null;
    }
    public final int q0(){
       int i12;
       String str;
       String str1;
       int i13;
       kg3 okg3 = this;
       kg3 b = okg3.b;
       kg3 a = okg3.a;
       int i = b[(a - 1)];
       int i1 = 0;
       int i2 = 93;
       int i3 = 59;
       int i4 = 44;
       byte i5 = 6;
       int i6 = 3;
       int i7 = 7;
       int i8 = 5;
       int i9 = 4;
       int i10 = 2;
       tg3 x = okg3.x;
       int i11 = 1;
       if (i == i11) {
          b[(a - i11)] = i10;
       }else if(i == i10){
          i13 = okg3.u0(i11);
          x.readByte();
          if (i13 != i4) {
             if (i13 != i3) {
                if (i13 == i2) {
                   okg3.y = i9;
                   return i9;
                }else {
                   okg3.o0("Unterminated array");
                   throw i1;
                }
             }else {
                this.p0();
                throw i1;
             }
          }
       }else if(i != i6 && i != i8){
          if (i == i9) {
             b[(a - i11)] = i8;
             i13 = okg3.u0(i11);
             x.readByte();
             if (i13 != 58) {
                if (i13 != 61) {
                   okg3.o0("Expected \':\'");
                   throw i1;
                }else {
                   this.p0();
                   throw i1;
                }
             }
          }else if(i == i5){
             b[(a - i11)] = i7;
          }else if(i == i7){
             if (okg3.u0(false) == -1) {
                okg3.y = 18;
                return 18;
             }else {
                this.p0();
                throw i1;
             }
          }else if(i != 8){
          label_007f :
             if ((i12 = okg3.u0(i11)) != 34) {
                if (i12 != 39) {
                   if (i12 != i4 && i12 != i3) {
                      if (i12 != 91) {
                         if (i12 != i2) {
                            if (i12 != 123) {
                               long l = 0;
                               i = x.h0(l);
                               tg3 w = okg3.w;
                               if (i != 116 && i != 84) {
                                  if (i != 102 && i != 70) {
                                     if (i != 110 && i != 78) {
                                     label_0108 :
                                        i4 = 0;
                                     label_0110 :
                                        if (i4) {
                                        }else {
                                           long l1 = l;
                                           i = 0;
                                           i1 = 0;
                                           i2 = 1;
                                           i6 = 0;
                                           while (true) {
                                              i7 = i + 1;
                                              if (!w.a((long)i7)) {
                                              label_0190 :
                                                 if (i1 == i10 && (i2 && ((l1 - Long.MIN_VALUE) && (!i6 && ((l1 - l) && i6))))) {
                                                    if (!i6) {
                                                       l1 = - l1;
                                                    }
                                                    okg3.z = l1;
                                                    x.skip((long)i);
                                                    okg3.y = 16;
                                                 }else if(i1 != i10 && (i1 != 4 && i1 != 7)){
                                                 label_01e4 :
                                                    i11 = 0;
                                                 }else {
                                                    okg3.A = i;
                                                    i11 = 17;
                                                    okg3.y = i11;
                                                 }
                                              }else if((i8 = x.h0((long)i)) != 43){
                                                 if (i8 != 69 && i8 != 101) {
                                                    if (i8 != 45) {
                                                       if (i8 != 46) {
                                                          if (i8 >= 48 && i8 <= 57) {
                                                             if (i1 != i11 && i1) {
                                                                if (i1 == i10) {
                                                                   if (!(l1 - l)) {
                                                                      goto label_01e4 ;
                                                                   }else {
                                                                      long l2 = 10 * l1;
                                                                      i8 = i8 - 48;
                                                                      l2 = l2 - (long)i8;
                                                                      i = ((v3 = l1 - 0xf333333333333334) <= 0 && (i && (l2 - l1) < 0))? 0: 1;
                                                                      i = i & i2;
                                                                      i2 = i;
                                                                      l1 = l2;
                                                                   }
                                                                }else if(i1 == 3){
                                                                   i1 = 4;
                                                                }else {
                                                                   i9 = 6;
                                                                   if (i1 == 5 || i1 == i9) {
                                                                      i1 = 7;
                                                                   }
                                                                }
                                                                i9 = 6;
                                                             }else {
                                                                i8 = i8 - 48;
                                                                i = - i8;
                                                                l1 = (long)i;
                                                                i1 = 2;
                                                             }
                                                          }else if(!okg3.s0(i8)){
                                                             goto label_0190 ;
                                                          }else {
                                                             goto label_01e4 ;
                                                          }
                                                       }else if(i1 == i10){
                                                          i1 = 3;
                                                       }else {
                                                          goto label_01e4 ;
                                                       }
                                                    }else if(!i1){
                                                       i1 = 1;
                                                       i6 = 1;
                                                    }else if(i1 == 5){
                                                    label_01df :
                                                       i1 = 6;
                                                    }else {
                                                       goto label_01e4 ;
                                                    }
                                                 }else if(i1 != i10 && i1 != 4){
                                                    goto label_01e4 ;
                                                 }else {
                                                    i1 = 5;
                                                 }
                                              }else if(i1 == 5){
                                                 goto label_01df ;
                                              }else {
                                                 goto label_01e4 ;
                                              }
                                              i = i7;
                                              i8 = 5;
                                           }
                                           if (16) {
                                              return 16;
                                           }else if(!okg3.s0(x.h0(l))){
                                              okg3.o0("Expected value");
                                              throw 0;
                                           }else {
                                              this.p0();
                                              throw 0;
                                           }
                                        }
                                     }else {
                                        str = "null";
                                        str1 = "NULL";
                                        i4 = 7;
                                     }
                                  }else {
                                     str = "false";
                                     str1 = "FALSE";
                                     i4 = 6;
                                  }
                               }else {
                                  str = "true";
                                  str1 = "TRUE";
                                  i4 = 5;
                               }
                               i1 = str.length();
                               i7 = 1;
                               while (true) {
                                  if (i7 < i1) {
                                     i9 = i7 + 1;
                                     if (!w.a((long)i9) || ((i5 = x.h0((long)i7)) != str.charAt(i7) && i5 != str1.charAt(i7))) {
                                        goto label_0108 ;
                                     }else {
                                        i7 = i9;
                                        i9 = 4;
                                     }
                                  }else if(w.a((long)(i1 + 1)) && okg3.s0(x.h0((long)i1))){
                                     goto label_0108 ;
                                  }else {
                                     x.skip((long)i1);
                                     okg3.y = i4;
                                     goto label_0110 ;
                                  }
                               }
                               return i4;
                            }else {
                               x.readByte();
                               okg3.y = i11;
                               return i11;
                            }
                         }else if(i == i11){
                            x.readByte();
                            okg3.y = 4;
                            return 4;
                         }
                      }else {
                         x.readByte();
                         okg3.y = 3;
                         return 3;
                      }
                   }
                   if (i != i11 && i != i10) {
                      okg3.o0("Unexpected value");
                      throw 0;
                   }else {
                      this.p0();
                      throw 0;
                   }
                }else {
                   this.p0();
                   throw i1;
                }
             }else {
                x.readByte();
                okg3.y = 9;
                return 9;
             }
          }else {
             throw new IllegalStateException("JsonReader is closed");
          }
       }else {
          b[(a - i11)] = 4;
          i13 = 125;
          if (i == 5) {
             i12 = okg3.u0(i11);
             x.readByte();
             if (i12 != i4) {
                if (i12 != i3) {
                   if (i12 == i13) {
                      okg3.y = i10;
                      return i10;
                   }else {
                      okg3.o0("Unterminated object");
                      throw 0;
                   }
                }else {
                   this.p0();
                   throw 0;
                }
             }
          }
          if ((i12 = okg3.u0(i11)) != 34) {
             if (i12 != 39) {
                if (i12 == i13) {
                   if (i != 5) {
                      x.readByte();
                      okg3.y = i10;
                      return i10;
                   }else {
                      okg3.o0("Expected name");
                      throw 0;
                   }
                }else {
                   this.p0();
                   throw 0;
                }
             }else {
                x.readByte();
                this.p0();
                throw 0;
             }
          }else {
             x.readByte();
             okg3.y = 13;
             return 13;
          }
       }
       b = 0;
       goto label_007f ;
    }
    public final int r0(String p0,xq7 p1){
       int len = p1.b.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return -1;
          }
          if (p0.equals(p1.b[i])) {
             break ;
          }else {
             i = i + 1;
          }
       }
       this.y = 0;
       p1[(this.a - 1)] = p0;
       return i;
    }
    public final boolean s0(int p0){
       if (p0 != 9 && (p0 != 10 && (p0 != 12 && (p0 != 13 && p0 != 32)))) {
          if (p0 != 35) {
             if (p0 != 44) {
                if (p0 != 47 && p0 != 61) {
                   if (p0 != 123 && (p0 != 125 && p0 != 58)) {
                      if (p0 != 59) {
                         switch (p0){
                             case '[':
                             case ']':
                             case 92:
                             default:
                               return true;
                         }
                      }
                   }
                }
             }
          }
          this.p0();
          throw false;
       }
       return false;
    }
    public final String t0(){
       tg3 ty;
       String str;
       if ((ty = this.y) == null) {
          ty = this.q0();
       }
       if (ty == 14) {
          str = this.w0();
       }else if(ty == 13){
          str = this.v0(tg3.D);
       }else if(ty == 12){
          str = this.v0(tg3.C);
       }else if(ty == 15){
          str = this.B;
       }else {
          throw new cd2("Expected a name but was "+tp2.A(this.j0())+" at path "+this.d(), 2);
       }
       this.y = 0;
       this.c[(this.a - 1)] = str;
       return str;
    }
    public final String toString(){
       return "JsonReader\("+this.w+"\)";
    }
    public final int u0(boolean p0){
       byte b;
       int i = 0;
       while (true) {
          int i1 = i + 1;
          tg3 tw = this.w;
          if (tw.a((long)i1)) {
             tg3 tx = this.x;
             if ((b = tx.h0((long)i)) != 10 && (b != 32 && (b != 13 && b != 9))) {
                tx.skip((long)(i1 - 1));
                if (b == 47) {
                   if (!tw.a(2)) {
                      break ;
                   }else {
                      this.p0();
                      throw 0;
                   }
                }else if(b != 35){
                   return b;
                }else {
                   this.p0();
                   throw 0;
                }
             }else {
                i = i1;
             }
          }else if(!p0){
             return -1;
          }else {
             throw new EOFException("End of input");
          }
       }
       return b;
    }
    public final String v0(j80 p0){
       long l;
       tg3 tx;
       StringBuilder str = null;
       while (true) {
          l = this.w.p(p0);
          if (l - -1) {
             tx = this.x;
             if (tx.h0(l) == 92) {
                if (str == null) {
                   str = "";
                }
                tx.readByte();
                str = str.append(tx.r0(l)).append(this.x0());
             }else if(str == null){
                break ;
             }else {
                tx.readByte();
                return str+tx.r0(l);
             }
          }else {
             this.o0("Unterminated string");
             throw null;
          }
       }
       tx.readByte();
       return tx.r0(l);
    }
    public final String w0(){
       long l = this.w.p(tg3.E);
       tg3 tx = this.x;
       String str = (l - -1)? tx.r0(l): tx.q0();
       return str;
    }
    public final void x(){
       tg3 ty;
       if ((ty = this.y) == null) {
          ty = this.q0();
       }
       if (ty == 4) {
          int i = this.a - 1;
          this.a = i;
          kg3 tt = this.t;
          i = i - 1;
          tt[i] = tt[i] + 1;
          this.y = 0;
          return;
       }else {
          throw new cd2("Expected END_ARRAY but was "+tp2.A(this.j0())+" at path "+this.d(), 2);
       }
    }
    public final char x0(){
       int b;
       tg3 tw = this.w;
       char c = 0;
       if (tw.a(1)) {
          tg3 tx = this.x;
          if ((b = tx.readByte()) == 10 || (b == 34 || (b == 39 || (b == 47 || b == 92)))) {
             return (char)b;
          }
          if (b == 98) {
             return 8;
          }
          if (b == 102) {
             return 12;
          }
          if (b == 110) {
             return 10;
          }
          if (b == 114) {
             return 13;
          }
          if (b == 116) {
             return 9;
          }
          if (b == 117) {
             if (!tw.a(4)) {
                throw new EOFException("Unterminated escape sequence at path "+this.d());
             }
             int i = 0;
             b = 0;
             while (true) {
                if (i < 4) {
                   int b1 = tx.h0((long)i);
                   b = b << 4;
                   char c1 = (char)b;
                   if (b1 >= 48 && b1 <= 57) {
                      b1 = b1 - 48;
                   }else if(b1 >= 97 && b1 <= 102){
                      b1 = b1 - 97;
                   }else if(b1 >= 65 && b1 <= 70){
                      b1 = b1 - 65;
                   }else {
                      break ;
                   }
                   b1 = b1 + 10;
                   b1 = b1 + c1;
                   c1 = (char)b1;
                   i = i + 1;
                }else {
                   tx.skip(4);
                   return b;
                }
             }
             this.o0("\\u".concat(tx.r0(4)));
             throw c;
          }else {
             this.o0("Invalid escape sequence: \\"+(char)b);
             throw c;
          }
       }else {
          this.o0("Unterminated escape sequence");
          throw c;
       }
    }
    public final void y(){
       tg3 ty;
       if ((ty = this.y) == null) {
          ty = this.q0();
       }
       int i = 2;
       if (ty == i) {
          int i1 = this.a - 1;
          this.a = i1;
          this.c[i1] = null;
          kg3 tt = this.t;
          i1 = i1 - 1;
          tt[i1] = tt[i1] + 1;
          this.y = 0;
          return;
       }else {
          throw new cd2("Expected END_OBJECT but was "+tp2.A(this.j0())+" at path "+this.d(), i);
       }
    }
    public final void y0(j80 p0){
       long l;
       tg3 tx;
       while (true) {
          l = this.w.p(p0);
          if (l - -1) {
             tx = this.x;
             if (tx.h0(l) == 92) {
                l = l + 1;
                tx.skip(l);
                this.x0();
             }else {
                break ;
             }
          }else {
             this.o0("Unterminated string");
             throw null;
          }
       }
       tx.skip((l + 1));
       return;
    }
}
