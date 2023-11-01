package p.j80;
import java.io.Serializable;
import java.lang.Comparable;
import p.ir2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Class;
import java.io.ObjectInputStream;
import java.io.InputStream;
import java.io.EOFException;
import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import p.tp2;
import java.lang.IllegalArgumentException;
import java.io.ObjectOutputStream;
import p.ys7;
import p.oe0;
import java.nio.charset.Charset;
import java.lang.Math;
import java.security.MessageDigest;
import p.ej4;
import java.util.Arrays;
import p.uk;
import java.lang.StringBuilder;
import p.e70;
import p.av6;

public class j80 implements Serializable, Comparable	// class@000257 from classes2.dex
{
    public final byte[] a;
    public int b;
    public String c;
    public static final j80 t;

    static {
       ir2 oir2 = new ir2(24, 0);
       byte[] uobyteArray = new byte[0];
       j80.t = new j80(uobyteArray);
    }
    public void j80(byte[] p0){
       co5.o(p0, "data");
       super();
       this.a = p0;
    }
    public static int g(j80 p0,j80 p1){
       p0.getClass();
       co5.o(p1, "other");
       return p0.f(p1.a, 0);
    }
    public static int k(j80 p0,j80 p1){
       p0.getClass();
       co5.o(p1, "other");
       return p0.j(p1.a, -1234567890);
    }
    public static j80 o(j80 p0,int p1,int p2,int p3){
       if ((p3 & 0x01)) {
          p1 = 0;
       }
       if ((p3 & 0x02)) {
          p2 = -1234567890;
       }
       return p0.n(p1, p2);
    }
    private final void readObject(ObjectInputStream p0){
       int i = p0.readInt();
       int i1 = 0;
       int i2 = (i >= 0)? 1: 0;
       if (i2) {
          byte[] uobyteArray = new byte[i];
          while (true) {
             if (i1 < i) {
                int i3 = i - i1;
                if ((i3 = p0.read(uobyteArray, i1, i3)) != -1) {
                   i1 = i1 + i3;
                }else {
                   break ;
                }
             }else {
                Field declaredFiel = j80.class.getDeclaredField("a");
                declaredFiel.setAccessible(true);
                declaredFiel.set(this, new j80(uobyteArray).a);
                return;
             }
          }
          throw new EOFException();
       }else {
          throw new IllegalArgumentException(tp2.k("byteCount < 0: ", i).toString());
       }
    }
    private final void writeObject(ObjectOutputStream p0){
       p0.writeInt(this.a.length);
       p0.write(this.a);
    }
    public String a(){
       int i4;
       byte b;
       j80 ta = this.a;
       byte[] a = ys7.a;
       co5.o(ta, "<this>");
       co5.o(a, "map");
       int i = 2;
       byte[] uobyteArray = new byte[(((ta.length + i) / 3) * 4)];
       int i1 = ta.length - (ta.length % 3);
       int i3 = 0;
       for (byte i2 = 0; i2 < i1; i2 = i6) {
          i4 = i2 + 1;
          i2 = ta[i2];
          byte i5 = i4 + 1;
          i4 = ta[i4];
          int i6 = i5 + 1;
          i5 = ta[i5];
          int i7 = i3 + 1;
          int i8 = i2 & 0x00ff;
          i8 = i8 >> i;
          uobyteArray[i3] = a[i8];
          i3 = i7 + 1;
          i2 = i2 & 0x03;
          i2 = i2 << 4;
          i8 = i4 & 0x00ff;
          i8 = i8 >> 4;
          i2 = i2 | i8;
          uobyteArray[i7] = a[i2];
          i2 = i3 + 1;
          i4 = i4 & 0x0f;
          i4 = i4 << i;
          i7 = i5 & 0x00ff;
          i7 = i7 >> 6;
          i4 = i4 | i7;
          uobyteArray[i3] = a[i4];
          i3 = i2 + 1;
          i4 = i5 & 0x3f;
          uobyteArray[i2] = a[i4];
       }
       if ((i4 = ta.length - i1) != 1) {
          if (i4 == i) {
             i2 = ta[i2];
             b = ta[(i2 + 1)];
             i1 = i3 + 1;
             uobyteArray[i3] = a[((i2 & 0x00ff) >> i)];
             i3 = i1 + 1;
             uobyteArray[i1] = a[(((i2 & 0x03) << 4) | ((b & 0x00ff) >> 4))];
             uobyteArray[i3] = a[((b & 0x0f) << i)];
             uobyteArray[(i3 + 1)] = (byte)61;
          }
       }else {
          b = ta[i2];
          i1 = i3 + 1;
          uobyteArray[i3] = a[((b & 0x00ff) >> 2)];
          i = i1 + 1;
          uobyteArray[i1] = a[((b & 0x03) << 4)];
          byte b1 = (byte)61;
          uobyteArray[i] = b1;
          uobyteArray[(i + 1)] = b1;
       }
       return new String(uobyteArray, oe0.a);
    }
    public final int b(j80 p0){
       co5.o(p0, "other");
       int i = this.d();
       int i1 = p0.d();
       int i2 = Math.min(i, i1);
       int i3 = 0;
       int i4 = 0;
       while (true) {
          if (i4 < i2) {
             int i5 = this.i(i4) & 0x00ff;
             int i6 = p0.i(i4) & 0x00ff;
             if (i5 == i6) {
                i4 = i4 + 1;
             }else if(i5 < i6){
             label_0030 :
                i3 = -1;
                break ;
             }else {
             label_0032 :
                i3 = 1;
                break ;
             }
          }else if(i == i1){
             break ;
          }else if(i < i1){
             goto label_0030 ;
          }else {
             goto label_0032 ;
          }
       }
       return i3;
    }
    public j80 c(String p0){
       MessageDigest instance = MessageDigest.getInstance(p0);
       instance.update(this.a, 0, this.d());
       byte[] uobyteArray = instance.digest();
       co5.l(uobyteArray, "digestBytes");
       return new j80(uobyteArray);
    }
    public final int compareTo(Object p0){
       return this.b(p0);
    }
    public int d(){
       return this.a.length;
    }
    public String e(){
       j80 ta = this.a;
       char[] uocharArray = new char[(ta.length * 2)];
       int len = ta.length;
       int i1 = 0;
       for (int i = 0; i < len; i = i + 1) {
          int b = ta[i];
          int i2 = i1 + 1;
          char[] n0 = ej4.n0;
          int i3 = b >> 4;
          i3 = i3 & 0x0f;
          uocharArray[i1] = n0[i3];
          i1 = i2 + 1;
          b = b & 0x0f;
          uocharArray[i2] = n0[b];
       }
       return new String(uocharArray);
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
       }else if(p0 instanceof j80){
          j80 ta = this.a;
          if (p0.d() != ta.length || !p0.l(0, 0, ta.length, ta)) {
          }
       }else {
       }
       return b;
    }
    public int f(byte[] p0,int p1){
       co5.o(p0, "other");
       int i = this.a.length - p0.length;
       if ((p1 = Math.max(p1, 0)) <= i) {
          while (!co5.d(p1, 0, p0.length, this.a, p0)) {
             if (p1 != i) {
                p1++;
             }
          }
          return p1;
       }
       p1 = -1;
    }
    public byte[] h(){
       return this.a;
    }
    public int hashCode(){
       j80 tb;
       if ((tb = this.b) != null) {
       }else {
          tb = Arrays.hashCode(this.a);
          this.b = tb;
       }
       return tb;
    }
    public byte i(int p0){
       return this.a[p0];
    }
    public int j(byte[] p0,int p1){
       co5.o(p0, "other");
       p1 = Math.min(co5.E(this, p1), (this.a.length - p0.length));
       while (true) {
          if (-1 < p1) {
             if (co5.d(p1, 0, p0.length, this.a, p0)) {
                break ;
             }else {
                p1--;
             }
          }else {
             p1 = -1;
             break ;
          }
       }
       return p1;
    }
    public boolean l(int p0,int p1,int p2,byte[] p3){
       boolean b;
       co5.o(p3, "other");
       if (p0 >= 0) {
          j80 ta = this.a;
          if (p0 <= (ta.length - p2) && (p1 >= 0 && (p1 <= (p3.length - p2) && co5.d(p0, p1, p2, ta, p3)))) {
             b = true;
          label_001c :
             return b;
          }
       }
       b = false;
       goto label_001c ;
    }
    public boolean m(int p0,j80 p1,int p2){
       co5.o(p1, "other");
       return p1.l(0, p0, p2, this.a);
    }
    public j80 n(int p0,int p1){
       p1 = co5.E(this, p1);
       int i = 0;
       int i1 = (p0 >= 0)? 1: 0;
       if (i1) {
          j80 ta = this.a;
          int i2 = (p1 <= ta.length)? 1: 0;
          if (i2) {
             if (((p1 - p0)) >= 0) {
                i = 1;
             }
             if (i) {
                j80 oj80 = (!p0 && p1 == ta.length)? this: new j80(uk.m0(ta, p0, p1));
                return oj80;
             }else {
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
             }
          }else {
             throw new IllegalArgumentException(tp2.n("endIndex > length\(", this.a.length, ')').toString());
          }
       }else {
          throw new IllegalArgumentException("beginIndex < 0".toString());
       }
    }
    public j80 p(){
       j80 oj80;
       int i = 0;
       while (true) {
          j80 ta = this.a;
          if (i < ta.length) {
             byte b = ta[i];
             byte b1 = (byte)65;
             if (b >= b1) {
                byte b2 = (byte)90;
                if (b <= b2) {
                   byte[] uobyteArray = Arrays.copyOf(ta, ta.length);
                   co5.l(uobyteArray, "copyOf\(this, size\)");
                   int i1 = i + 1;
                   uobyteArray[i] = (byte)(b + 32);
                   while (i1 < uobyteArray.length) {
                      if ((i = uobyteArray[i1]) >= b1 && i <= b2) {
                         i = i + 32;
                         uobyteArray[i1] = (byte)i;
                      }
                      i1 = i1 + 1;
                   }
                   oj80 = new j80(uobyteArray);
                }
             }
             i = i + 1;
          }else {
             oj80 = this;
             break ;
          }
       }
       return oj80;
    }
    public final String q(){
       j80 tc;
       if ((tc = this.c) == null) {
          byte[] uobyteArray = this.h();
          co5.o(uobyteArray, "<this>");
          String str = new String(uobyteArray, oe0.a);
          this.c = str;
          tc = str;
       }
       return tc;
    }
    public void r(e70 p0,int p1){
       co5.o(p0, "buffer");
       p0.write(this.a, 0, p1);
    }
    public String toString(){
       String str;
       int i4;
       int i11;
       String str3;
       j80 oj80 = this;
       j80 a = oj80.a;
       int i = (!a.length)? 1: 0;
       if (i) {
          str = "[size=0]";
       }else {
          i = a.length;
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          while (true) {
             i4 = 64;
             if (i1 < i) {
                int b = a[i1];
                int i5 = 13;
                int i6 = 127;
                int i7 = 160;
                int i8 = 32;
                int i9 = 0xfffd;
                int i10 = 0x10000;
                if (b >= 0) {
                   i11 = i2 + 1;
                   if (i2 == i4) {
                      break ;
                   }else if(b != 10 && b != i5){
                      str3 = (b >= 0 && b < i8)? 1: 0;
                      if (!str3) {
                         str3 = (i6 <= b && b < i7)? 1: 0;
                         if (!str3) {
                            str3 = 0;
                         label_004b :
                            if (str3) {
                            label_0220 :
                               i3 = -1;
                               break ;
                            }
                         }
                      }
                      str3 = 1;
                      goto label_004b ;
                   }
                   if (b == i9) {
                      goto label_0220 ;
                   }else if(b < i10){
                      i2 = 1;
                   }else {
                      i2 = 2;
                   }
                   i3 = i3 + i2;
                   i1 = i1 + 1;
                   while (true) {
                      i2 = i11;
                      if (i1 < i && (b = a[i1]) >= 0) {
                         i1 = i1 + 1;
                         i11 = i2 + 1;
                         if (i2 == i4) {
                         }else if(b != 10 && b != i5){
                            str3 = (b >= 0 && b < i8)? 1: 0;
                            if (!str3) {
                               str3 = (i6 <= b && b < i7)? 1: 0;
                               if (!str3) {
                                  str3 = 0;
                               label_0082 :
                                  if (str3) {
                                  }
                               }
                            }
                            str3 = 1;
                            goto label_0082 ;
                         }
                         if (b == i9) {
                            goto label_0220 ;
                         }else if(b < i10){
                            i2 = 1;
                         }else {
                            i2 = 2;
                         }
                         i3 = i3 + i2;
                      }else {
                         continue ;
                      }
                   }
                }else {
                   i9 = b >> 5;
                   i10 = -2;
                   i11 = 128;
                   if (i9 == i10) {
                      i9 = i1 + 1;
                      if (i <= i9) {
                         if (i2 == i4) {
                            break ;
                         }else {
                            goto label_0220 ;
                         }
                      }else {
                         i9 = a[i9];
                         i10 = ((i10 = i9 & 0x00c0) == i11)? 1: 0;
                         if (!i10) {
                            if (i2 == i4) {
                               break ;
                            }else {
                               goto label_0220 ;
                            }
                         }else {
                            i9 = i9 ^ 0x0f80;
                            b = b << 6;
                            if ((b = b ^ i9) < i11) {
                               if (i2 == i4) {
                                  break ;
                               }else {
                                  goto label_0220 ;
                               }
                            }else {
                               i9 = i2 + 1;
                               if (i2 == i4) {
                                  break ;
                               }else if(b != 10 && b != i5){
                                  str3 = (b >= 0 && b < i8)? 1: 0;
                                  if (!str3) {
                                     str3 = (i6 <= b && b < i7)? 1: 0;
                                     if (!str3) {
                                        str3 = 0;
                                     label_00d8 :
                                        if (str3) {
                                        }
                                     }
                                  }
                                  str3 = 1;
                                  goto label_00d8 ;
                               }
                               if (b == 0xfffd) {
                                  goto label_0220 ;
                               }else if(b < 0x10000){
                                  i11 = 1;
                               }else {
                                  i11 = 2;
                               }
                               i3 = i3 + i11;
                               i1 = i1 + 2;
                               i2 = i9;
                            }
                         }
                      }
                   }else {
                      i6 = b >> 4;
                      i7 = 0xe000;
                      i8 = 0xd800;
                      if (i6 == i10) {
                         i6 = i1 + 2;
                         if (i <= i6) {
                            if (i2 == i4) {
                               break ;
                            }else {
                               goto label_0220 ;
                            }
                         }else {
                            i9 = i1 + 1;
                            i9 = a[i9];
                            i10 = ((i10 = i9 & 0x00c0) == i11)? 1: 0;
                            if (!i10) {
                               if (i2 == i4) {
                                  break ;
                               }else {
                                  goto label_0220 ;
                               }
                            }else {
                               i6 = a[i6];
                               i10 = ((i10 = i6 & 0x00c0) == i11)? 1: 0;
                               if (!i10) {
                                  if (i2 == i4) {
                                     break ;
                                  }else {
                                     goto label_0220 ;
                                  }
                               }else {
                                  i6 = i6 ^ -123008;
                                  i9 = i9 << 6;
                                  i6 = i6 ^ i9;
                                  b = b << 12;
                                  if ((b = b ^ i6) < 2048) {
                                     if (i2 == i4) {
                                        break ;
                                     }else {
                                        goto label_0220 ;
                                     }
                                  }else if(i8 <= b && b < i7){
                                     i6 = 1;
                                  }else {
                                     i6 = 0;
                                  }
                                  if (i6) {
                                     if (i2 == i4) {
                                        break ;
                                     }else {
                                        goto label_0220 ;
                                     }
                                  }else {
                                     i6 = i2 + 1;
                                     if (i2 == i4) {
                                        break ;
                                     }else if(b != 10 && b != i5){
                                        str3 = (b >= 0 && b < 32)? 1: 0;
                                        if (!str3) {
                                           str3 = (127 <= b && b < 160)? 1: 0;
                                           if (!str3) {
                                              str3 = 0;
                                           label_0165 :
                                              if (str3) {
                                              }
                                           }
                                        }
                                        str3 = 1;
                                        goto label_0165 ;
                                     }
                                     if (b == 0xfffd) {
                                        goto label_0220 ;
                                     }else if(b < 0x10000){
                                        i11 = 1;
                                     }else {
                                        i11 = 2;
                                     }
                                     i3 = i3 + i11;
                                     i1 = i1 + 3;
                                     i2 = i6;
                                  }
                               }
                            }
                         }
                      }else if((i5 = b >> 3) == i10){
                         i5 = i1 + 3;
                         if (i <= i5) {
                            if (i2 == i4) {
                               break ;
                            }else {
                               goto label_0220 ;
                            }
                         }else {
                            i6 = i1 + 1;
                            i6 = a[i6];
                            i9 = ((i9 = i6 & 0x00c0) == i11)? 1: 0;
                            if (!i9) {
                               if (i2 == i4) {
                                  break ;
                               }else {
                                  goto label_0220 ;
                               }
                            }else {
                               i9 = i1 + 2;
                               i9 = a[i9];
                               i10 = ((i10 = i9 & 0x00c0) == i11)? 1: 0;
                               if (!i10) {
                                  if (i2 == i4) {
                                     break ;
                                  }else {
                                     goto label_0220 ;
                                  }
                               }else {
                                  i5 = a[i5];
                                  i10 = ((i10 = i5 & 0x00c0) == i11)? 1: 0;
                                  if (!i10) {
                                     if (i2 == i4) {
                                        break ;
                                     }else {
                                        goto label_0220 ;
                                     }
                                  }else {
                                     i5 = i5 ^ 0x381f80;
                                     i9 = i9 << 6;
                                     i5 = i5 ^ i9;
                                     i6 = i6 << 12;
                                     i5 = i5 ^ i6;
                                     b = b << 18;
                                     if ((b = b ^ i5) > 0x10ffff) {
                                        if (i2 == i4) {
                                           break ;
                                        }else {
                                           goto label_0220 ;
                                        }
                                     }else if(i8 <= b && b < i7){
                                        i5 = 1;
                                     }else {
                                        i5 = 0;
                                     }
                                     if (i5) {
                                        if (i2 == i4) {
                                           break ;
                                        }else {
                                           goto label_0220 ;
                                        }
                                     }else if(b < 0x10000){
                                        if (i2 == i4) {
                                           break ;
                                        }else {
                                           goto label_0220 ;
                                        }
                                     }else {
                                        i5 = i2 + 1;
                                        if (i2 == i4) {
                                           break ;
                                        }else if(b != 10 && b != 13){
                                           str3 = (b >= 0 && b < 32)? 1: 0;
                                           if (!str3) {
                                              str3 = (127 <= b && b < 160)? 1: 0;
                                              if (!str3) {
                                                 str3 = 0;
                                              label_0208 :
                                                 if (str3) {
                                                 }
                                              }
                                           }
                                           str3 = 1;
                                           goto label_0208 ;
                                        }
                                        if (b == 0xfffd) {
                                           goto label_0220 ;
                                        }else if(b < 0x10000){
                                           i11 = 1;
                                        }else {
                                           i11 = 2;
                                        }
                                        i3 = i3 + i11;
                                        i1 = i1 + 4;
                                        i2 = i5;
                                     }
                                  }
                               }
                            }
                         }
                      }else if(i2 == i4){
                         break ;
                      }else {
                         goto label_0220 ;
                      }
                   }
                }
             }else {
                break ;
             }
          }
          str = "…]";
          String str1 = "[size=";
          char c = ']';
          if (i3 == -1) {
             if (oj80.a.length <= i4) {
                str = "[hex="+this.e()+c;
             }else {
                StringBuilder str2 = str1+oj80.a.length+" hex=";
                i = co5.E(oj80, i4);
                j80 a1 = oj80.a;
                i3 = (i <= a1.length)? 1: 0;
                if (i3) {
                   i3 = (((i + 0)) >= 0)? 1: 0;
                   if (i3) {
                      j80 oj801 = (i == a1.length)? oj80: new j80(uk.m0(a1, 0, i));
                      str = str2+oj801.e()+str;
                   }else {
                      throw new IllegalArgumentException("endIndex < beginIndex".toString());
                   }
                }else {
                   throw new IllegalArgumentException(tp2.n("endIndex > length\(", oj80.a.length, ')').toString());
                }
             }
          }else {
             str3 = this.q();
             String str4 = str3.substring(0, i3);
             co5.l(str4, "this as java.lang.String…ing\(startIndex, endIndex\)");
             str4 = av6.x0(av6.x0(av6.x0(str4, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
             if (i3 < str3.length()) {
                str = str1+oj80.a.length+" text="+str4+str;
             }else {
                str = "[text="+str4+c;
             }
          }
       }
       return str;
    }
}
