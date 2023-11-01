package p.jg3;
import java.io.Closeable;
import p.yy6;
import java.io.StringReader;
import java.lang.Object;
import java.lang.String;
import p.r04;
import java.lang.StringBuilder;
import p.en6;
import java.lang.IllegalStateException;
import p.tp2;
import java.io.Reader;
import java.lang.System;
import java.lang.Double;
import java.lang.NumberFormatException;
import java.lang.Integer;
import java.lang.Long;
import java.io.EOFException;
import java.lang.Math;
import java.lang.Class;
import java.lang.AssertionError;
import java.util.Arrays;

public class jg3 implements Closeable	// class@001ace from classes.dex
{
    public int A;
    public String B;
    public int[] C;
    public int D;
    public String[] E;
    public int[] F;
    public final Reader a;
    public boolean b;
    public final char[] c;
    public int t;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;

    static {
       yy6.b = new yy6();
    }
    public void jg3(StringReader p0){
       super();
       this.b = false;
       char[] uocharArray = new char[1024];
       this.c = uocharArray;
       this.t = 0;
       this.v = 0;
       this.w = 0;
       this.x = 0;
       this.y = 0;
       int[] ointArray = new int[32];
       this.C = ointArray;
       this.D = 1;
       ointArray[0] = 6;
       String[] stringArray = new String[32];
       this.E = stringArray;
       int[] ointArray1 = new int[32];
       this.F = ointArray1;
       this.a = p0;
    }
    public final void A0(String p0){
       throw new r04(en6.r(p0)+this.j0());
    }
    public final void J(){
       jg3 ty;
       if ((ty = this.y) == null) {
          ty = this.y();
       }
       if (ty == 4) {
          int i = this.D - 1;
          this.D = i;
          jg3 tF = this.F;
          i = i - 1;
          tF[i] = tF[i] + 1;
          this.y = 0;
          return;
       }else {
          throw new IllegalStateException("Expected END_ARRAY but was "+tp2.B(this.u0())+this.j0());
       }
    }
    public final void T(){
       jg3 ty;
       if ((ty = this.y) == null) {
          ty = this.y();
       }
       if (ty == 2) {
          int i = this.D - 1;
          this.D = i;
          this.E[i] = null;
          jg3 tF = this.F;
          i = i - 1;
          tF[i] = tF[i] + 1;
          this.y = 0;
          return;
       }else {
          throw new IllegalStateException("Expected END_OBJECT but was "+tp2.B(this.u0())+this.j0());
       }
    }
    public final void b(){
       jg3 ty;
       if ((ty = this.y) == null) {
          ty = this.y();
       }
       if (ty == 3) {
          this.v0(1);
          this.F[(this.D - 1)] = 0;
          this.y = 0;
          return;
       }else {
          throw new IllegalStateException("Expected BEGIN_ARRAY but was "+tp2.B(this.u0())+this.j0());
       }
    }
    public final void close(){
       this.y = 0;
       this.C[0] = 8;
       this.D = 1;
       this.a.close();
    }
    public final String d(){
       int i1;
       object oobject;
       String str = "$";
       jg3 tD = this.D;
       int i = 0;
       while (i < tD) {
          if ((i1 = this.C[i]) != 1 && i1 != 2) {
             if (i1 == 3 || (i1 == 4 || i1 == 5)) {
                str = str.append('.');
                if ((oobject = this.E[i]) != null) {
                   str = str.append(oobject);
                }
             }
          }else {
             str = str.append('[').append(this.F[i]).append(']');
          }
          i = i + 1;
       }
       return str;
    }
    public final void f(){
       jg3 ty;
       if ((ty = this.y) == null) {
          ty = this.y();
       }
       if (ty == 1) {
          this.v0(3);
          this.y = 0;
          return;
       }else {
          throw new IllegalStateException("Expected BEGIN_OBJECT but was "+tp2.B(this.u0())+this.j0());
       }
    }
    public final boolean g0(int p0){
       int i;
       int i2;
       jg3 tt = this.t;
       this.x = this.x - tt;
       jg3 tv = this.v;
       jg3 tc = this.c;
       if (tv != tt) {
          i = tv - tt;
          this.v = i;
          System.arraycopy(tc, tt, tc, 0, i);
       }else {
          this.v = 0;
       }
       this.t = 0;
       while (true) {
          tv = this.v;
          int i1 = tc.length - tv;
          if ((i = this.a.read(tc, tv, i1)) == -1) {
             return 0;
          }
          i1 = this.v + i;
          this.v = i1;
          i2 = 1;
          if (this.w == null && ((tv = this.x) == null && (i1 > 0 && tc[0] == 0xfeff))) {
             int i3 = this.t + i2;
             this.t = i3;
             i = tv + 1;
             this.x = i;
             p0++;
          }
          if (i1 >= p0) {
             break ;
          }
       }
       return i2;
    }
    public final boolean h0(){
       jg3 ty;
       if ((ty = this.y) == null) {
          ty = this.y();
       }
       boolean b = (ty != 2 && ty != 4)? true: false;
       return b;
    }
    public final boolean i0(char p0){
       if (p0 != 9 && (p0 != 10 && (p0 != 12 && (p0 != 13 && p0 != ' ')))) {
          if (p0 != '#') {
             if (p0 != ',') {
                if (p0 != '/' && p0 != '=') {
                   if (p0 != '{' && (p0 != '}' && p0 != ':')) {
                      if (p0 != ';') {
                         switch (p0){
                             case '[':
                             case ']':
                             case 92:
                               break;
                             default:
                               return true;
                         }
                      }
                   }
                }
             }
          }
          this.x();
       }
       return false;
    }
    public final String j0(){
       return " at line "+(this.w + 1)+" column "+((this.t - this.x) + 1)+" path "+this.d();
    }
    public final boolean k0(){
       jg3 ty;
       int i1;
       if ((ty = this.y) == null) {
          ty = this.y();
       }
       int i = 0;
       if (ty == 5) {
          this.y = i;
          ty = this.F;
          i1 = this.D - 1;
          ty[i1] = ty[i1] + 1;
          return 1;
       }else if(ty == 6){
          this.y = i;
          ty = this.F;
          i1 = this.D - 1;
          ty[i1] = ty[i1] + 1;
          return i;
       }else {
          throw new IllegalStateException("Expected a boolean but was "+tp2.B(this.u0())+this.j0());
       }
    }
    public final double l0(){
       jg3 ty;
       int i1;
       char c;
       if ((ty = this.y) == null) {
          ty = this.y();
       }
       int i = 0;
       if (ty == 15) {
          this.y = i;
          ty = this.F;
          i1 = this.D - 1;
          ty[i1] = ty[i1] + 1;
          return (double)this.z;
       }else {
          int i2 = 11;
          if (ty == 16) {
             this.B = new String(this.c, this.t, this.A);
             this.t = this.t + this.A;
          }else {
             i1 = 8;
             if (ty != i1 && ty != 9) {
                if (ty == 10) {
                   this.B = this.t0();
                }else if(ty == i2){
                   throw new IllegalStateException("Expected a double but was "+tp2.B(this.u0())+this.j0());
                }
             }else if(ty == i1){
                c = ''';
             }else {
                c = '"';
             }
             this.B = this.r0(c);
          }
          this.y = i2;
          double d = Double.parseDouble(this.B);
          if (this.b == null && (Double.isNaN(d) && !Double.isInfinite(d))) {
             throw new r04("JSON forbids NaN and infinities: "+d+this.j0());
          }else {
             this.B = null;
             this.y = i;
             jg3 tF = this.F;
             i2 = this.D - 1;
             tF[i2] = tF[i2] + 1;
             return d;
          }
       }
    }
    public final int m0(){
       jg3 ty;
       int i;
       int i1;
       char c;
       if ((ty = this.y) == null) {
          ty = this.y();
       }
       String str = "Expected an int but was ";
       if (ty == 15) {
          ty = this.z;
          i = (int)ty;
          if (!(ty - (long)i)) {
             this.y = 0;
             ty = this.F;
             i1 = this.D - 1;
             ty[i1] = ty[i1] + 1;
             return i;
          }else {
             throw new NumberFormatException(str+this.z+this.j0());
          }
       }else if(ty == 16){
          this.B = new String(this.c, this.t, this.A);
          this.t = this.t + this.A;
       }else {
          try{
             i1 = 10;
             i = 8;
             if (ty != i && (ty != 9 && ty != i1)) {
                throw new IllegalStateException(str+tp2.B(this.u0())+this.j0());
             }else if(ty == i1){
                this.B = this.t0();
             }else if(ty == i){
                c = ''';
             }else {
                c = '"';
             }
             this.B = this.r0(c);
          }catch(java.lang.NumberFormatException e0){
          }
             this.y = 0;
             jg3 tF = this.F;
             i = this.D - 1;
             tF[i] = tF[i] + 1;
             return Integer.parseInt(this.B);
       }
       this.y = 11;
       double d = Double.parseDouble(this.B);
       i1 = (int)d;
       if (!(d - (double)i1)) {
          this.B = null;
          this.y = 0;
          ty = this.F;
          i1 = this.D - 1;
          ty[i1] = ty[i1] + 1;
          return i1;
       }else {
          throw new NumberFormatException(str+this.B+this.j0());
       }
    }
    public final long n0(){
       jg3 ty;
       int i1;
       long l;
       char c;
       if ((ty = this.y) == null) {
          ty = this.y();
       }
       int i = 0;
       if (ty == 15) {
          this.y = i;
          ty = this.F;
          i1 = this.D - 1;
          ty[i1] = ty[i1] + 1;
          return this.z;
       }else if(ty == 16){
          this.B = new String(this.c, this.t, this.A);
          this.t = this.t + this.A;
       }else {
          try{
             i1 = 10;
             l = 8;
             if (ty != l && (ty != 9 && ty != i1)) {
                throw new IllegalStateException("Expected a long but was "+tp2.B(this.u0())+this.j0());
             }else if(ty == i1){
                this.B = this.t0();
             }else if(ty == l){
                c = ''';
             }else {
                c = '"';
             }
             this.B = this.r0(c);
          }catch(java.lang.NumberFormatException e0){
          }
             this.y = i;
             jg3 tF = this.F;
             int i2 = this.D - 1;
             tF[i2] = tF[i2] + 1;
             return Long.parseLong(this.B);
       }
       this.y = 11;
       double d = Double.parseDouble(this.B);
       l = (long)d;
       if (!(d - (double)l)) {
          this.B = null;
          this.y = i;
          ty = this.F;
          i1 = this.D - 1;
          ty[i1] = ty[i1] + 1;
          return l;
       }else {
          throw new NumberFormatException("Expected a long but was "+this.B+this.j0());
       }
    }
    public final String o0(){
       jg3 ty;
       String str;
       if ((ty = this.y) == null) {
          ty = this.y();
       }
       if (ty == 14) {
          str = this.t0();
       }else if(ty == 12){
          str = this.r0(''');
       }else if(ty == 13){
          str = this.r0('"');
       }else {
          throw new IllegalStateException("Expected a name but was "+tp2.B(this.u0())+this.j0());
       }
       this.y = 0;
       this.E[(this.D - 1)] = str;
       return str;
    }
    public final int p0(boolean p0){
       int i1;
       char c;
       int i2;
       int b;
       char c1;
       jg3 tt = this.t;
       jg3 tv = this.v;
       while (true) {
          int i = 1;
          if (tt == tv) {
             this.t = tt;
             if (!this.g0(i)) {
                if (!p0) {
                }else {
                   throw new EOFException("End of input"+this.j0());
                }
             }else {
                tt = this.t;
                tv = this.v;
             label_002f :
                i1 = tt + 1;
                jg3 tc = this.c;
                if ((c = tc[tt]) == 10) {
                   i2 = this.w + i;
                   this.w = i2;
                   this.x = i1;
                }else if(c != ' ' && (c != 13 && c != 9)){
                   int i3 = 47;
                   if (c == i3) {
                      this.t = i1;
                      if (i1 == tv) {
                         i1 = i1 - 1;
                         this.t = i1;
                         b = this.g0(2);
                         i1 = this.t + i;
                         this.t = i1;
                         if (!b) {
                            return c;
                         }
                      }
                      this.x();
                      tv = this.t;
                      if ((c1 = tc[tv]) != '*') {
                         if (c1 != i3) {
                            return c;
                         }else {
                            b = tv + 1;
                            this.t = b;
                            this.y0();
                            tt = this.t;
                            tv = this.v;
                         }
                      }else {
                         b = tv + 1;
                         this.t = b;
                         while (true) {
                            i2 = this.t + 2;
                            i1 = 0;
                            if (i2 > this.v && !this.g0(2)) {
                               i = 0;
                            label_00c0 :
                               if (i) {
                                  i2 = this.t + 2;
                                  tv = this.v;
                               }else {
                                  this.A0("Unterminated comment");
                                  throw 0;
                               }
                            }else {
                               tt = this.t;
                               if (tc[tt] == 10) {
                                  b = this.w + i;
                                  this.w = b;
                                  i2 = tt + 1;
                                  this.x = i2;
                               }else {
                                  while (true) {
                                     if (i1 < 2) {
                                        if ((i2 = this.t + i1) == "*/".charAt(i1)) {
                                           i1 = i1 + 1;
                                        }
                                     }else {
                                        goto label_00c0 ;
                                     }
                                  }
                                  return -1;
                               }
                               i2 = this.t + i;
                               this.t = i2;
                            }
                         }
                      }
                   }else if(c == '#'){
                      this.t = i1;
                      this.x();
                      this.y0();
                      tt = this.t;
                      tv = this.v;
                   }else {
                      break ;
                   }
                }
                i2 = i1;
             }
          }else {
             goto label_002f ;
          }
       }
       this.t = i1;
       return c;
    }
    public final void q0(){
       jg3 ty;
       if ((ty = this.y) == null) {
          ty = this.y();
       }
       if (ty == 7) {
          this.y = 0;
          ty = this.F;
          int i = this.D - 1;
          ty[i] = ty[i] + 1;
          return;
       }else {
          throw new IllegalStateException("Expected null but was "+tp2.B(this.u0())+this.j0());
       }
    }
    public final String r0(char p0){
       jg3 tc;
       int i1;
       char c;
       int i2;
       int i3;
       StringBuilder str = null;
       do {
          jg3 tt = this.t;
          jg3 tv = this.v;
          while (true) {
             jg3 ojg3 = tt;
             break ;
          }
          while (true) {
             int i = 16;
             tc = this.c;
             if (ojg3 < tv) {
                i1 = ojg3 + 1;
                if ((c = tc[ojg3]) == p0) {
                   this.t = i1;
                   i1 = (i1 - tt) - 1;
                   if (str == null) {
                      break ;
                   }else {
                      return str+tc;
                   }
                }else if(c == '\'){
                   this.t = i1;
                   i1 = i1 - tt;
                   i1 = i1 - 1;
                   if (str == null) {
                      i2 = i1 + 1;
                      i2 = i2 * 2;
                      str = new StringBuilder(Math.max(i2, i));
                   }
                   str = str.append(tc, tt, i1).append(this.w0());
                   tt = this.t;
                   tv = this.v;
                }else if(c == 10){
                   i3 = this.w + 1;
                   this.w = i3;
                   this.x = i1;
                }
                i3 = i1;
             }else if(str == null){
                i2 = ojg3 - tt;
                i2 = i2 * 2;
                str = new StringBuilder(Math.max(i2, i));
             }
             int i4 = ojg3 - tt;
             str = str.append(tc, tt, i4);
             this.t = ojg3;
             if (this.g0(1)) {
                continue ;
             }else {
             }
          }
          return new String(tc, tt, i1);
       } while (this.g0(1));
       this.A0("Unterminated string");
       throw null;
    }
    public final String s0(){
       jg3 ty;
       String str;
       if ((ty = this.y) == null) {
          ty = this.y();
       }
       if (ty == 10) {
          str = this.t0();
       }else if(ty == 8){
          str = this.r0(''');
       }else if(ty == 9){
          str = this.r0('"');
       }else if(ty == 11){
          str = this.B;
          this.B = null;
       }else if(ty == 15){
          str = Long.toString(this.z);
       }else if(ty == 16){
          str = new String(this.c, this.t, this.A);
          this.t = this.t + this.A;
       }else {
          throw new IllegalStateException("Expected a string but was "+tp2.B(this.u0())+this.j0());
       }
       this.y = 0;
       jg3 tF = this.F;
       int i = this.D - 1;
       tF[i] = tF[i] + 1;
       return str;
    }
    public final String t0(){
       int i3;
       char c;
       String str = null;
       int i = 0;
       do {
          int i1 = 0;
          while (true) {
             jg3 tt = this.t;
             int i2 = tt + i1;
             jg3 tc = this.c;
             if (i2 < this.v) {
                i3 = tt + i1;
                if ((c = tc[i3]) != 9 && (c != 10 && (c != 12 && (c != 13 && c != ' ')))) {
                   if (c != '#') {
                      if (c != ',') {
                         if (c != '/' && c != '=') {
                            if (c != '{' && (c != '}' && c != ':')) {
                               if (c != ';') {
                                  switch (c){
                                      case '[':
                                      case ']':
                                     label_005a :
                                        i = i1;
                                        break;
                                      case 92:
                                        break;
                                      default:
                                        i1 = i1 + 1;
                                  }
                               }
                            }else {
                               goto label_005a ;
                            }
                         }
                      }else {
                         goto label_005a ;
                      }
                   }
                   this.x();
                   goto label_005a ;
                }else {
                   goto label_005a ;
                }
             }else if(i1 < tc.length){
                if (i3 = i1 + 1) {
                   continue ;
                }else {
                   goto label_005a ;
                }
             }else if(str == null){
                str = new StringBuilder(Math.max(i1, 16));
             }
             str = str.append(tc, this.t, i1);
             i3 = this.t + i1;
             this.t = i3;
             if (!this.g0(1)) {
             }else {
                continue ;
             }
          }
       } while (!this.g0(1));
       str = (str == null)? new String(tc, this.t, i): str+tc;
       this.t = this.t + i;
       return str;
    }
    public final String toString(){
       return jg3.class.getSimpleName()+this.j0();
    }
    public final int u0(){
       jg3 ty;
       if ((ty = this.y) == null) {
          ty = this.y();
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
           case 13:
             return 5;
           case 15:
           case 16:
             return 7;
           case 17:
             return 10;
           default:
             throw new AssertionError();
       }
    }
    public final void v0(int p0){
       jg3 tD = this.D;
       jg3 tC = this.C;
       if (tD == tC.length) {
          int i = tD * 2;
          this.C = Arrays.copyOf(tC, i);
          this.F = Arrays.copyOf(this.F, i);
          this.E = Arrays.copyOf(this.E, i);
       }
       tC = this.D;
       this.D = tC + 1;
       this.C[tC] = p0;
       return;
    }
    public final char w0(){
       char c1;
       int i5;
       char c = 0;
       String str = "Unterminated escape sequence";
       int i = 1;
       if (this.t == this.v && !this.g0(i)) {
          this.A0(str);
          throw c;
       }else {
          jg3 tt = this.t;
          int i1 = tt + 1;
          this.t = i1;
          jg3 tc = this.c;
          if ((c1 = tc[tt]) != 10) {
             if (c1 != '"' && (c1 != ''' && (c1 != '/' && c1 != '\'))) {
                if (c1 != 'b') {
                   if (c1 != 'f') {
                      if (c1 != 'n') {
                         if (c1 != 'r') {
                            if (c1 != 't') {
                               if (c1 == 'u') {
                                  int i2 = 4;
                                  if (((i1 + i2)) > this.v && !this.g0(i2)) {
                                     this.A0(str);
                                     throw c;
                                  }else {
                                     jg3 tt1 = this.t;
                                     int i3 = tt1 + 4;
                                     int i4 = 0;
                                     while (true) {
                                        if (tt1 < i3) {
                                           char c2 = tc[tt1];
                                           i4 = i4 << 4;
                                           char c3 = (char)i4;
                                           if (c2 >= '0' && c2 <= '9') {
                                              i5 = c2 - 48;
                                           }else if(c2 >= 'a' && c2 <= 'f'){
                                              i5 = c2 - 97;
                                           }else if(c2 >= 'A' && c2 <= 'F'){
                                              i5 = c2 - 65;
                                           }else {
                                              break ;
                                           }
                                           i5 = i5 + 10;
                                           i5 = i5 + c3;
                                           c3 = (char)i5;
                                           tt1 = tt1 + 1;
                                        }else {
                                           this.t = this.t + i2;
                                           return i4;
                                        }
                                     }
                                     throw new NumberFormatException("\\u".concat(new String(tc, this.t, i2)));
                                  }
                               }else {
                                  this.A0("Invalid escape sequence");
                                  throw c;
                               }
                            }else {
                               return 9;
                            }
                         }else {
                            return 13;
                         }
                      }else {
                         return 10;
                      }
                   }else {
                      return 12;
                   }
                }else {
                   return 8;
                }
             }
          }else {
             this.w = this.w + i;
             this.x = i1;
          }
          return c1;
       }
    }
    public final void x(){
       if (this.b != null) {
          return;
       }
       this.A0("Use JsonReader.setLenient\(true\) to accept malformed JSON");
       throw null;
    }
    public final void x0(char p0){
       int i;
       char c;
       int i1;
       do {
          jg3 tt = this.t;
          jg3 tv = this.v;
          while (true) {
             if (tt < tv) {
                i = tt + 1;
                if ((c = this.c[tt]) == p0) {
                   break ;
                }else if(c == '\'){
                   this.t = i;
                   this.w0();
                   tt = this.t;
                   tv = this.v;
                }else if(c == 10){
                   i1 = this.w + 1;
                   this.w = i1;
                   this.x = i;
                }
                i1 = i;
             }else {
                this.t = tt;
                if (this.g0(1)) {
                   continue ;
                }else {
                }
             }
          }
          this.t = i;
          return;
       } while (this.g0(1));
       this.A0("Unterminated string");
       throw null;
    }
    public final int y(){
       int i9;
       char c2;
       String str;
       String str1;
       int i10;
       char c3;
       int i11;
       char c4;
       jg3 ojg3 = this;
       jg3 c = ojg3.C;
       jg3 d = ojg3.D;
       int i = c[(d - 1)];
       int i1 = 0;
       int i2 = 39;
       int i3 = 93;
       int i4 = 59;
       int i5 = 44;
       int i6 = 6;
       jg3 c1 = ojg3.c;
       int i7 = 4;
       int i8 = 2;
       if (i == 1) {
          c[(d - 1)] = i8;
       }else if(i == i8){
          if ((i10 = ojg3.p0(1)) != i5) {
             if (i10 != i4) {
                if (i10 == i3) {
                   ojg3.y = i7;
                   return i7;
                }else {
                   ojg3.A0("Unterminated array");
                   throw i1;
                }
             }else {
                this.x();
             }
          }
       }else {
          i8 = 125;
          if (i != 3 && i != 5) {
             if (i == i7) {
                c[(d - 1)] = 5;
                if ((i10 = ojg3.p0(1)) != 58) {
                   if (i10 == 61) {
                      this.x();
                      if (ojg3.t < ojg3.v || ojg3.g0(1)) {
                         c = ojg3.t;
                         if (c1[c] == '>') {
                            ojg3.t = c + 1;
                         }
                      }
                   }else {
                      ojg3.A0("Expected \':\'");
                      throw i1;
                   }
                }
             }else if(i == i6){
                if (ojg3.b != null) {
                   ojg3.p0(1);
                   i10 = ojg3.t - 1;
                   ojg3.t = i10;
                   if ((((i10 + 5)) <= ojg3.v || (ojg3.g0(5) && (c1[i10] == ')' && (c1[(i10 + 1)] == i3 && (c1[(i10 + 2)] == i8 && (c1[(i10 + 3)] == i2 && c1[(i10 + i7)] == 10))))))) {
                      ojg3.t = ojg3.t + 5;
                   }
                }
                ojg3.C[(ojg3.D - 1)] = 7;
             label_00be :
                c = 0;
             label_00de :
                if ((i9 = ojg3.p0(1)) != 34) {
                   if (i9 != i2) {
                      if (i9 != i5 && i9 != i4) {
                         if (i9 != 91) {
                            if (i9 != i3) {
                               if (i9 != 123) {
                                  i9 = ojg3.t - 1;
                                  ojg3.t = i9;
                                  if ((c2 = c1[i9]) != 't' && c2 != 'T') {
                                     if (c2 != 'f' && c2 != 'F') {
                                        if (c2 == 'n' || c2 == 'N') {
                                           str = "null";
                                           str1 = "NULL";
                                           i8 = 7;
                                        label_0128 :
                                           i1 = str.length();
                                           i2 = 1;
                                           while (true) {
                                              if (i2 < i1) {
                                                 if ((i3 = ojg3.t + i2) < ojg3.v || (i3 = i2 + 1)) {
                                                    i3 = ojg3.t + i2;
                                                    if ((c4 = c1[i3]) == str.charAt(i2) || c4 == str1.charAt(i2)) {
                                                       i2 = i2 + 1;
                                                    }
                                                 }
                                              }else if(((ojg3.t + i1)) >= ojg3.v && (!ojg3.g0((i1 + 1)) || !ojg3.i0(c1[(ojg3.t + i1)]))){
                                                 ojg3.t = ojg3.t + i1;
                                                 ojg3.y = i8;
                                              label_0177 :
                                                 if (i8) {
                                                    break ;
                                                 }else {
                                                    d = ojg3.t;
                                                    jg3 v = ojg3.v;
                                                    i8 = 0;
                                                    long l = i8;
                                                    i2 = 0;
                                                    i3 = 0;
                                                    i4 = 0;
                                                    i5 = 1;
                                                    while (true) {
                                                       if ((i10 = d + i2) == v) {
                                                          if (i2 == c1.length) {
                                                          label_026c :
                                                             i8 = 0;
                                                          }else if(!(i10 = i2 + 1)){
                                                          label_020b :
                                                             i10 = 2;
                                                             if (i3 == i10) {
                                                                if (i5 && ((l - Long.MIN_VALUE) && (!i4 && ((l) && i4)))) {
                                                                   if (!i4) {
                                                                      l = - l;
                                                                   }
                                                                   ojg3.z = l;
                                                                   ojg3.t = ojg3.t + i2;
                                                                   ojg3.y = 15;
                                                                }else {
                                                                   i10 = 2;
                                                                }
                                                             }
                                                             if (i3 != i10 && (i3 != 4 && i3 != 7)) {
                                                                goto label_026c ;
                                                             }else {
                                                                ojg3.A = i2;
                                                                i8 = 16;
                                                                ojg3.y = i8;
                                                             }
                                                          }else {
                                                             v = ojg3.v;
                                                             d = ojg3.t;
                                                          label_019e :
                                                             i10 = d + i2;
                                                             if ((c3 = c1[i10]) != '+') {
                                                                if (c3 != 'E' && c3 != 'e') {
                                                                   if (c3 != '-') {
                                                                      if (c3 != '.') {
                                                                         if (c3 >= '0' && c3 <= '9') {
                                                                            if (i3 != 1 && i3) {
                                                                               if (i3 == 2) {
                                                                                  if (!(l - i8)) {
                                                                                     goto label_026c ;
                                                                                  }else {
                                                                                     long l1 = 10 * l;
                                                                                     i10 = c3 - 48;
                                                                                     l1 = l1 - (long)i10;
                                                                                     i10 = ((v1 = l - 0xf333333333333334) <= 0 && (i10 && (l1 - l) < 0))? 0: 1;
                                                                                     i10 = i10 & i5;
                                                                                     i5 = i10;
                                                                                     l = l1;
                                                                                     i8 = 6;
                                                                                  }
                                                                               }else {
                                                                                  i8 = 6;
                                                                                  if (i3 == 3) {
                                                                                     i3 = 4;
                                                                                  }else if(i3 != 5 && i3 != i8){
                                                                                     i3 = 7;
                                                                                  }
                                                                               }
                                                                            }else {
                                                                               i10 = c3 - 48;
                                                                               i10 = - i10;
                                                                               l = (long)i10;
                                                                               i3 = 2;
                                                                            }
                                                                            i11 = 0;
                                                                         }else if(!ojg3.i0(c3)){
                                                                            goto label_020b ;
                                                                         }else {
                                                                            goto label_026c ;
                                                                         }
                                                                      }else {
                                                                         i11 = i8;
                                                                         if (i3 == 2) {
                                                                            i3 = 3;
                                                                         }else {
                                                                            goto label_026c ;
                                                                         }
                                                                      }
                                                                   }else {
                                                                      i11 = i8;
                                                                      if (!i3) {
                                                                         i3 = 1;
                                                                         i4 = 1;
                                                                      }else if(i3 == 5){
                                                                      label_0264 :
                                                                         i3 = 6;
                                                                      }else {
                                                                         goto label_026c ;
                                                                      }
                                                                   }
                                                                }else {
                                                                   i11 = i8;
                                                                   if (i3 != 2 && i3 != 4) {
                                                                      goto label_026c ;
                                                                   }else {
                                                                      i3 = 5;
                                                                   }
                                                                }
                                                             }else {
                                                                i11 = i8;
                                                                if (i3 == 5) {
                                                                   goto label_0264 ;
                                                                }else {
                                                                   goto label_026c ;
                                                                }
                                                             }
                                                             i2 = i2 + 1;
                                                             i8 = i11;
                                                             i6 = 6;
                                                          }
                                                       }else {
                                                          goto label_019e ;
                                                       }
                                                    }
                                                    if (i8) {
                                                       return i8;
                                                    }else if(ojg3.i0(c1[ojg3.t])){
                                                       this.x();
                                                       ojg3.y = 10;
                                                       return 10;
                                                    }else {
                                                       ojg3.A0("Expected value");
                                                       throw 0;
                                                    }
                                                 }
                                              }
                                           }
                                           return i8;
                                        }
                                     }else {
                                        str = "false";
                                        str1 = "FALSE";
                                        i8 = 6;
                                        goto label_0128 ;
                                     }
                                  }else {
                                     str = "true";
                                     str1 = "TRUE";
                                     i8 = 5;
                                     goto label_0128 ;
                                  }
                                  i8 = 0;
                                  goto label_0177 ;
                               }else {
                                  ojg3.y = 1;
                                  return 1;
                               }
                            }else if(i == 1){
                               ojg3.y = 4;
                               return 4;
                            }
                         }else {
                            ojg3.y = 3;
                            return 3;
                         }
                      }
                      if (i != 1 && i != 2) {
                         ojg3.A0("Unexpected value");
                         throw 0;
                      }else {
                         this.x();
                         ojg3.t = ojg3.t - 1;
                         ojg3.y = 7;
                         return 7;
                      }
                   }else {
                      this.x();
                      ojg3.y = 8;
                      return 8;
                   }
                }else {
                   ojg3.y = 9;
                   return 9;
                }
             }else if(i == 7){
                if (ojg3.p0(false) == -1) {
                   ojg3.y = 17;
                   return 17;
                }else {
                   this.x();
                   ojg3.t = ojg3.t - 1;
                   goto label_00de ;
                }
             }else if(i != 8){
                goto label_00de ;
             }else {
                throw new IllegalStateException("JsonReader is closed");
             }
          }else {
             c[(d - 1)] = 4;
             if (i == 5 && (i10 = ojg3.p0(1)) != i5) {
                if (i10 != i4) {
                   if (i10 == i8) {
                      ojg3.y = 2;
                      return 2;
                   }else {
                      ojg3.A0("Unterminated object");
                      throw 0;
                   }
                }else {
                   this.x();
                }
             }
             if ((i10 = ojg3.p0(1)) != 34) {
                if (i10 != i2) {
                   if (i10 != i8) {
                      this.x();
                      ojg3.t = ojg3.t - 1;
                      if (ojg3.i0((char)i10)) {
                         ojg3.y = 14;
                         return 14;
                      }else {
                         ojg3.A0("Expected name");
                         throw 0;
                      }
                   }else if(i != 5){
                      ojg3.y = 2;
                      return 2;
                   }else {
                      ojg3.A0("Expected name");
                      throw 0;
                   }
                }else {
                   this.x();
                   ojg3.y = 12;
                   return 12;
                }
             }else {
                ojg3.y = 13;
                return 13;
             }
          }
       }
       i8 = 7;
       goto label_00be ;
    }
    public final void y0(){
       char c;
       while (this.t < this.v || this.g0(1)) {
          jg3 tt = this.t;
          int i = tt + 1;
          this.t = i;
          if ((c = this.c[tt]) == 10) {
             this.w = this.w + 1;
             this.x = i;
             break ;
          }
          break ;
       }
       return;
    }
    public final void z0(){
       jg3 ty;
       int i3;
       char c;
       int i = 0;
       int i1 = 0;
       do {
          if ((ty = this.y) == null) {
             ty = this.y();
          }
          int i2 = 3;
          if (ty == i2) {
             this.v0(1);
          label_0011 :
             i1 = i1 + 1;
          }else if(ty == 1){
             this.v0(i2);
             goto label_0011 ;
          }else if(ty == 4){
             i3 = this.D - 1;
             this.D = i3;
          }else if(ty == 2){
             i3 = this.D - 1;
             this.D = i3;
          }else if(ty != 14 && ty != 10){
             if (ty != 8 && ty != 12) {
                if (ty != 9 && ty != 13) {
                   if (ty == 16) {
                      i3 = this.t + this.A;
                      this.t = i3;
                   }
                }else {
                   this.x0('"');
                }
             }else {
                this.x0(''');
             }
          }else {
             do {
                i3 = 0;
                while (true) {
                   if ((i2 = this.t + i3) < this.v) {
                      if ((c = this.c[i2]) != 9 && (c != 10 && (c != 12 && (c != 13 && c != ' ')))) {
                         if (c != '#') {
                            if (c != ',') {
                               if (c != '/' && c != '=') {
                                  if (c != '{' && (c != '}' && c != ':')) {
                                     if (c != ';') {
                                        switch (c){
                                            case '[':
                                            case ']':
                                              break;
                                            case 92:
                                              break;
                                            default:
                                              i3 = i3 + 1;
                                        }
                                     }
                                  }
                               }
                            }
                         }
                         this.x();
                      }
                      i2 = this.t + i3;
                      this.t = i2;
                   }else {
                      this.t = i2;
                      if (this.g0(1)) {
                         continue ;
                      }
                   }
                }
                jg3 tF = this.F;
                jg3 tD = this.D;
                i3 = tD - 1;
                tF[i3] = tF[i3] + 1;
                this.E[(tD - 1)] = "null";
                return;
             } while (!this.g0(1));
          }
          i1 = i1 - 1;
          this.y = i;
          if (!i1) {
          }else {
             continue ;
          }
       } while (!i1);
    }
}
