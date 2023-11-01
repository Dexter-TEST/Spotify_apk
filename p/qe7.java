package p.qe7;
import p.xe7;
import p.gd7;
import p.se7;
import java.lang.AssertionError;
import java.lang.String;
import p.xj0;
import p.rc3;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.Object;
import java.lang.Integer;
import p.cc3;
import java.nio.charset.Charset;
import java.lang.CharSequence;
import java.util.Arrays;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import p.fd7;
import java.lang.Character;
import p.re7;
import java.lang.StringBuilder;

public final class qe7 extends xe7	// class@002389 from classes.dex
{
    public final int F;

    public void qe7(int p0){
       this.F = p0;
       super();
    }
    public static int r0(long p0,byte[] p1,int p2,int p3){
       if (p3) {
          if (p3 != 1) {
             if (p3 == 2) {
                return se7.d(p2, gd7.i(p1, p0), gd7.i(p1, (p0 + 1)));
             }else {
                throw new AssertionError();
             }
          }else {
             return se7.c(p2, gd7.i(p1, p0));
          }
       }else if(p2 > -12){
          p2 = -1;
       }
       return p2;
    }
    public final String n0(byte[] p0,int p1,int p2){
       int b;
       int i2;
       byte b1;
       switch (this.F){
           case 0:
             break;
           default:
             Charset a = cc3.a;
             String str = new String(p0, p1, p2, a);
             if (!str.contains("\xff\x02") || Arrays.equals(str.getBytes(a), Arrays.copyOfRange(p0, p1, (p2 + p1)))) {
                return str;
             }
             throw rc3.b();
       }
       if ((((p1 | p2) | ((p0.length - p1) - p2))) >= 0) {
          int i = p1 + p2;
          char[] uocharArray = new char[p2];
          int i1 = 0;
          while (p1 < i) {
             i2 = ((b = p0[p1]) >= 0)? 1: 0;
             if (!i2) {
                break ;
             }
             p1++;
             i2 = i1 + 1;
             uocharArray[i1] = (char)b;
             i1 = i2;
          }
          int i3 = i1;
          while (true) {
             if (p1 >= i) {
                return new String(uocharArray, 0, i3);
             }
             i1 = p1 + 1;
             b = ((b1 = p0[p1]) >= 0)? 1: 0;
             if (b) {
                b = i3 + 1;
                uocharArray[i3] = (char)b1;
                b1 = i1;
                while (true) {
                   i3 = b;
                   if (b1 < i) {
                      b = ((i1 = p0[b1]) >= 0)? 1: 0;
                      if (!b) {
                      }else {
                         b1++;
                         b = i3 + 1;
                         uocharArray[i3] = (char)i1;
                      }
                   }else {
                      continue ;
                   }
                }
             }else if(b1 < -32){
                b = 1;
             }else {
                b = 0;
             }
             if (b) {
                if (i1 < i) {
                   b = i1 + 1;
                   i2 = i3 + 1;
                   xj0.f(b1, p0[i1], uocharArray, i3);
                   b1 = b;
                   i3 = i2;
                }else {
                   break ;
                }
             }else if(b1 < -16){
                b = 1;
             }else {
                b = 0;
             }
             if (b) {
                b = i - 1;
                if (i1 < b) {
                   b = i1 + 1;
                   i2 = b + 1;
                   int i4 = i3 + 1;
                   xj0.g(b1, p0[i1], p0[b], uocharArray, i3);
                   b1 = i2;
                   i3 = i4;
                }else {
                   throw rc3.b();
                }
             }else {
                b = i - 2;
                if (i1 < b) {
                   b = i1 + 1;
                   i1 = b + 1;
                   int i5 = i1 + 1;
                   int i6 = i3 + 1;
                   xj0.e(b1, p0[i1], p0[b], p0[i1], uocharArray, i3);
                   i3 = i6 + 1;
                   b1 = i5;
                }else {
                   throw rc3.b();
                }
             }
          }
          throw rc3.b();
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p0.length),Integer.valueOf(p1),Integer.valueOf(p2)};
          throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", objArray));
       }
    }
    public final String o0(ByteBuffer p0,int p1,int p2){
       byte b;
       int i4;
       int i = p1;
       int i1 = p2;
       switch (this.F){
           case 0:
           default:
             if ((((i | i1) | ((p0.limit() - i) - i1))) >= 0) {
                long l = gd7.c.j(gd7.g, p0) + (long)i;
                long l1 = (long)i1 + l;
                char[] uocharArray = new char[i1];
                i1 = 0;
                while ((l - l1) < 0) {
                   int i2 = ((b = gd7.h(l)) >= 0)? 1: 0;
                   if (!i2) {
                      break ;
                   }
                   l = l + 1;
                   i2 = i1 + 1;
                   uocharArray[i1] = (char)b;
                   i1 = i2;
                }
                while (true) {
                   int i3 = i1;
                   break ;
                }
                while (true) {
                   if ((l - l1) >= 0) {
                      return new String(uocharArray, 0, i3);
                   }
                   long l2 = l + 1;
                   l = ((i2 = gd7.h(l)) >= 0)? 1: 0;
                   if (l) {
                      i4 = i3 + 1;
                      uocharArray[i3] = (char)i2;
                      i3 = i4;
                      l = l2;
                      while ((l - l1) < 0) {
                         b = ((i1 = gd7.h(l)) >= 0)? 1: 0;
                         if (!b) {
                         }
                         l = l + 1;
                         b = i3 + 1;
                         uocharArray[i3] = (char)i1;
                         i3 = b;
                      }
                   }else if(i2 < -32){
                      i4 = 1;
                   }else {
                      i4 = 0;
                   }
                   if (i4) {
                      if ((l2 - l1) < 0) {
                         l = l2 + 1;
                         b = i3 + 1;
                         xj0.f(i2, gd7.h(l2), uocharArray, i3);
                         i3 = b;
                      }else {
                         break ;
                      }
                   }else if(i2 < -16){
                      i4 = 1;
                   }else {
                      i4 = 0;
                   }
                   if (i4) {
                      l = l1 - 1;
                      if ((l2 - l) < 0) {
                         l = l2 + 1;
                         long l3 = l + 1;
                         b = gd7.h(l);
                         i4 = i3 + 1;
                         xj0.g(i2, gd7.h(l2), b, uocharArray, i3);
                         i3 = i4;
                         l = l3;
                      }else {
                         throw rc3.b();
                      }
                   }else {
                      l = l1 - 2;
                      if ((l2 - l) < 0) {
                         l = l2 + 1;
                         l2 = l + 1;
                         byte b1 = gd7.h(l);
                         l = l2 + 1;
                         byte b2 = gd7.h(l2);
                         i1 = i3 + 1;
                         xj0.e(i2, gd7.h(l2), b1, b2, uocharArray, i3);
                         i1 = i1 + 1;
                      }else {
                         throw rc3.b();
                      }
                   }
                }
                throw rc3.b();
             }else {
                Object[] objArray = new Object[]{Integer.valueOf(p0.limit()),Integer.valueOf(p1),Integer.valueOf(p2)};
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", objArray));
             }
       }
       return xe7.p(p0, p1, p2);
    }
    public final int p0(CharSequence p0,byte[] p1,int p2,int p3){
       int i4;
       int i6;
       char c;
       int i7;
       char c1;
       int i8;
       int i9;
       int i10;
       char c3;
       long l3;
       long l4;
       CharSequence uCharSequenc = p0;
       byte[] uobyteArray = p1;
       int i = p2;
       int i1 = p3;
       int i2 = 0xdfff;
       int i3 = 2048;
       switch (this.F){
           case 0:
             i4 = p0.length();
             i1 = i1 + i;
             for (int i5 = 0; i5 < i4 && ((i6 = i5 + i) < i1 && (c = uCharSequenc.charAt(i5)) < 128); i5 = i5 + 1) {
                uobyteArray[i6] = (byte)c;
             }
             if (i5 == i4) {
                i7 = i + i4;
             }else {
                i = i + i5;
                while (true) {
                   if (i5 < i4) {
                      if ((c1 = uCharSequenc.charAt(i5)) < 128 && i < i1) {
                         i8 = i + 1;
                         uobyteArray[i] = (byte)c1;
                      label_0089 :
                         i = i8;
                      }else if(c1 < i3){
                         i8 = i1 - 2;
                         if (i <= i8) {
                            i8 = i + 1;
                            i9 = c1 >> 6;
                            i9 = i9 | 0x03c0;
                            uobyteArray[i] = (byte)i9;
                            i = i8 + 1;
                            i6 = c1 & 0x3f;
                            i6 = i6 | 128;
                            uobyteArray[i8] = (byte)i6;
                         }
                      }
                      if (c1 < 0xd800 || i2 < c1) {
                         i8 = i1 - 3;
                         if (i <= i8) {
                            i8 = i + 1;
                            i9 = c1 >> 12;
                            i9 = i9 | 0x01e0;
                            uobyteArray[i] = (byte)i9;
                            i = i8 + 1;
                            i9 = c1 >> 6;
                            i9 = i9 & 0x3f;
                            i9 = i9 | 128;
                            uobyteArray[i8] = (byte)i9;
                            i8 = i + 1;
                            i6 = c1 & 0x3f;
                            i6 = i6 | 128;
                            uobyteArray[i] = (byte)i6;
                            goto label_0089 ;
                         }
                      }
                      i8 = i1 - 4;
                      if (i <= i8) {
                         if ((i8 = i5 + 1) != p0.length()) {
                            char c2 = uCharSequenc.charAt(i8);
                            if (Character.isSurrogatePair(c1, c2)) {
                               i5 = Character.toCodePoint(c1, c2);
                               i6 = i + 1;
                               i9 = i5 >> 18;
                               i9 = i9 | 0x00f0;
                               uobyteArray[i] = (byte)i9;
                               i = i6 + 1;
                               i9 = i5 >> 12;
                               i9 = i9 & 0x3f;
                               i9 = i9 | 128;
                               uobyteArray[i6] = (byte)i9;
                               i6 = i + 1;
                               i9 = i5 >> 6;
                               i9 = i9 & 0x3f;
                               i9 = i9 | 128;
                               uobyteArray[i] = (byte)i9;
                               i = i6 + 1;
                               i5 = i5 & 0x3f;
                               i5 = i5 | 128;
                               uobyteArray[i6] = (byte)i5;
                               i5 = i8;
                            }else {
                               i5 = i8;
                            }
                         }
                         throw new re7((i5 - 1), i4);
                      }else if(0xd800 <= c1 && (c1 <= i2 && ((i10 = i5 + 1) == p0.length() && Character.isSurrogatePair(c1, uCharSequenc.charAt(i10))))){
                         throw new re7(i5, i4);
                      }else {
                         throw new ArrayIndexOutOfBoundsException("Failed writing "+c1+" at index "+i);
                      }
                      i5 = i5 + 1;
                   }else {
                      i7 = i;
                      break ;
                   }
                }
             }
             break;
           default:
             long l = (long)i;
             long l1 = (long)i1 + l;
             if ((i9 = p0.length()) > i1 || ((uobyteArray.length - i1)) < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing "+uCharSequenc.charAt((i9 - 1))+" at index "+(i + i1));
             }
             i = 0;
             while (true) {
                long l2 = 1;
                if (i < i9 && (c3 = uCharSequenc.charAt(i)) < 128) {
                   l2 = l + l2;
                   gd7.s(uobyteArray, l, (byte)c3);
                   i = i + 1;
                   l = l2;
                }else if(i == i9){
                   while (true) {
                      if (i < i9) {
                         if ((c3 = uCharSequenc.charAt(i)) < 128 && (l - l1) < 0) {
                            l3 = l + l2;
                            gd7.s(uobyteArray, l, (byte)c3);
                            l4 = l3;
                         label_0196 :
                            l = l4;
                         }else if(c3 < i3){
                            l3 = l1 - 2;
                            if ((l - l3) <= 0) {
                               l4 = l + l2;
                               i4 = c3 >> 6;
                               i4 = i4 | 0x03c0;
                               gd7.s(uobyteArray, l, (byte)i4);
                               l = l4 + l2;
                               i1 = c3 & 0x3f;
                               i1 = i1 | 128;
                               gd7.s(uobyteArray, l4, (byte)i1);
                            }
                         }
                         if (c3 < 0xd800 || 0xdfff < c3) {
                            l4 = l1 - 3;
                            if ((l - l4) <= 0) {
                               l4 = l + l2;
                               i4 = c3 >> 12;
                               i4 = i4 | 0x01e0;
                               gd7.s(uobyteArray, l, (byte)i4);
                               l = l4 + l2;
                               i4 = c3 >> 6;
                               i4 = i4 & 0x3f;
                               i4 = i4 | 128;
                               gd7.s(uobyteArray, l4, (byte)i4);
                               l4 = l + l2;
                               i1 = c3 & 0x3f;
                               i1 = i1 | 128;
                               gd7.s(uobyteArray, l, (byte)i1);
                               goto label_0196 ;
                            }
                         }
                         l4 = l1 - 4;
                         if ((l - l4) <= 0) {
                            if ((i4 = i + 1) != i9) {
                               char c4 = uCharSequenc.charAt(i4);
                               if (Character.isSurrogatePair(c3, c4)) {
                                  i = Character.toCodePoint(c3, c4);
                                  l4 = l + l2;
                                  i1 = i >> 18;
                                  i1 = i1 | 0x00f0;
                                  gd7.s(uobyteArray, l, (byte)i1);
                                  l = l4 + l2;
                                  i1 = i >> 12;
                                  i1 = i1 & 0x3f;
                                  i1 = i1 | 128;
                                  gd7.s(uobyteArray, l4, (byte)i1);
                                  l4 = l + l2;
                                  i1 = i >> 6;
                                  i1 = i1 & 0x3f;
                                  i1 = i1 | 128;
                                  gd7.s(uobyteArray, l, (byte)i1);
                                  l = l4 + l2;
                                  i = i & 0x3f;
                                  i = i | 128;
                                  gd7.s(uobyteArray, l4, (byte)i);
                                  i = i4;
                               }else {
                                  i = i4;
                                  break ;
                               }
                            }
                            break ;
                         }else if(0xd800 <= c3 && (c3 <= 0xdfff && ((i10 = i + 1) == i9 && Character.isSurrogatePair(c3, uCharSequenc.charAt(i10))))){
                            throw new re7(i, i9);
                         }else {
                            throw new ArrayIndexOutOfBoundsException("Failed writing "+c3+" at index "+l);
                         }
                         i = i + 1;
                         i3 = 2048;
                      }
                   }
                   throw new re7((i - 1), i9);
                }
                return (int)l;
             }
       }
       return i7;
    }
    public final int q0(int p0,int p1,byte[] p2){
       int i3;
       int i4;
       int i5;
       long l1;
       int i = p0;
       int i1 = p1;
       byte[] uobyteArray = p2;
       int i2 = -19;
       switch (this.F){
           case 0:
             while (i < i1 && uobyteArray[i] >= 0) {
                i = i + 1;
             }
             if (i >= i1) {
             label_0029 :
                i3 = 0;
             }else if(i >= i1){
                goto label_0029 ;
             }else {
                i4 = i + 1;
                if ((i = uobyteArray[i]) < 0) {
                   if (i < -32) {
                      if (i4 >= i1) {
                         i3 = i;
                      }else if(i >= -62){
                         i = i4 + 1;
                         if (uobyteArray[i4] <= -65) {
                            continue ;
                         }
                      }
                   }else if(i < -16){
                      i5 = i1 - 1;
                      if (i4 >= i5) {
                         i3 = se7.a(uobyteArray, i4, i1);
                      }else {
                         i5 = i4 + 1;
                         if ((i4 = uobyteArray[i4]) <= -65 && (i != -32 && (i4 < -96 && (i != i2 && i4 >= -96)))) {
                            i = i5 + 1;
                            if (uobyteArray[i5] <= -65) {
                            }
                         }
                      }
                   }else {
                      i5 = i1 - 2;
                      if (i4 >= i5) {
                         i3 = se7.a(uobyteArray, i4, i1);
                      }else {
                         i5 = i4 + 1;
                         if ((i4 = uobyteArray[i4]) <= -65) {
                            i = i << 28;
                            i4 = i4 + 112;
                            i4 = i4 + i;
                            if (!(i = i4 >> 30)) {
                               i = i5 + 1;
                               if (uobyteArray[i5] <= -65) {
                                  i4 = i + 1;
                                  if (uobyteArray[i] <= -65) {
                                  label_0086 :
                                     i = i4;
                                  }
                               }
                            }
                         }
                      }
                   }
                   i3 = -1;
                }else {
                   goto label_0086 ;
                }
             }
             break;
           default:
             if ((((i | i1) | (uobyteArray.length - i1))) >= 0) {
                long l = (long)i;
                if ((i1 = (int)((long)i1 - l)) < 16) {
                   i4 = 0;
                }else {
                   i = ((int)l & 0x07) - 8;
                   long l2 = l;
                   i4 = 0;
                   while (true) {
                      if (i4 < i) {
                         long l3 = l2 + 1;
                         if (gd7.i(uobyteArray, l2) >= 0) {
                            i4 = i4 + 1;
                            l2 = l3;
                         }
                      }else {
                         while ((i = i4 + 8) <= i1) {
                            l1 = gd7.f + l2;
                            l1 = gd7.o(l1, uobyteArray) & 0x8080808080808080;
                            if (l1) {
                            }
                            l2 = l2 + 8;
                            i4 = i;
                            l1 = -19;
                         }
                         while (true) {
                            if (i4 < i1) {
                               l1 = l2 + 1;
                               if (gd7.i(uobyteArray, l2) >= 0) {
                                  i4 = i4 + 1;
                                  l2 = l1;
                               }
                            }else {
                               i4 = i1;
                            }
                         }
                      }
                   }
                }
                i1 = i1 - i4;
                l = l + (long)i4;
                while (true) {
                   i = 0;
                   break ;
                }
                while (i1 > 0) {
                   l1 = l + 1;
                   if ((i = gd7.i(uobyteArray, l)) >= 0) {
                      i1 = i1 - 1;
                      l = l1;
                   }else {
                      l = l1;
                   }
                }
                if (!i1) {
                   i3 = 0;
                }else {
                   i1 = i1 - 1;
                   if (i < -32) {
                      if (!i1) {
                         i3 = i;
                      }else {
                         i1 = i1 - 1;
                         if (i >= -62) {
                            l1 = l + 1;
                            if (gd7.i(uobyteArray, l) <= -65) {
                               l = l1;
                            }
                         }
                      }
                   }else if(i < -16){
                      if (i1 < 2) {
                         i3 = qe7.r0(l, uobyteArray, i, i1);
                      }else {
                         i1 = i1 - 2;
                         l1 = l + 1;
                         if ((i3 = gd7.i(uobyteArray, l)) <= -65 && (i != -32 && (i3 < -96 && (i != -19 && i3 >= -96)))) {
                            l = l1 + 1;
                            if (gd7.i(uobyteArray, l1) <= -65) {
                            }
                         }
                      }
                   }else if(i1 < 3){
                      i3 = qe7.r0(l, uobyteArray, i, i1);
                   }else {
                      i1 = i1 - 3;
                      l1 = l + 1;
                      if ((i3 = gd7.i(uobyteArray, l)) <= -65) {
                         i = i << 28;
                         i3 = i3 + 112;
                         i3 = i3 + i;
                         if (!(i = i3 >> 30)) {
                            l = l1 + 1;
                            if (gd7.i(uobyteArray, l1) <= -65) {
                               l1 = l + 1;
                               if (gd7.i(uobyteArray, l) <= -65) {
                               }
                            }
                         }
                      }
                   }
                   i3 = -1;
                }
                return i3;
             }else {
                Object[] objArray = new Object[]{Integer.valueOf(uobyteArray.length),Integer.valueOf(p0),Integer.valueOf(p1)};
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", objArray));
             }
       }
    }
}
