package p.lh0;
import p.xe7;
import java.lang.String;
import java.lang.CharSequence;
import p.lx;
import java.util.Map;
import p.v10;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.StringBuilder;
import p.tp2;
import p.kh0;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.Iterator;
import p.mh0;
import p.en6;

public final class lh0 extends xe7	// class@001d50 from classes.dex
{
    public final int F;

    public void lh0(int p0){
       this.F = p0;
       super();
    }
    public static void n0(boolean[] p0,int p1,int[] p2){
       int len = p2.length;
       int i = 0;
       while (i < len) {
          int i1 = p1 + 1;
          boolean b = (p2[i])? true: false;
          p0[p1] = b;
          i = i + 1;
          p1 = i1;
       }
       return;
    }
    public static int o0(int p0,String p1){
       int i = p1.length() - 1;
       int i1 = 0;
       int i2 = 1;
       while (i >= 0) {
          int i3 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(p1.charAt(i)) * i2;
          i1 = i1 + i3;
          if ((i2 = i2 + 1) > p0) {
             i2 = 1;
          }
          i = i - 1;
       }
       return (i1 % 47);
    }
    public static int p0(int p0,CharSequence p1){
       char c;
       char c1;
       int i = p1.length();
       int i1 = 1;
       if (p0 >= i) {
          return i1;
       }
       if ((c = p1.charAt(p0)) == 241) {
          return 4;
       }
       if (c >= '0' && c <= '9') {
          p0 = p0 + i1;
          i1 = 2;
          if (p0 >= i) {
             return i1;
          }else if((c1 = p1.charAt(p0)) >= '0' && c1 <= '9'){
             return 3;
          }
       }
       return i1;
    }
    public static void q0(int[] p0,int p1){
       for (int i = 0; i < 9; i = i + 1) {
          int i1 = i - 8;
          int i2 = 1;
          i1 = i2 << i1;
          if (i1 = i1 & p1) {
             i2 = 2;
          }
          p0[i] = i2;
       }
       return;
    }
    public static void r0(int[] p0,int p1){
       for (int i = 0; i < 9; i = i + 1) {
          int i1 = i - 8;
          int i2 = 1;
          i1 = i2 << i1;
          if (!(i1 = i1 & p1)) {
             i2 = 0;
          }
          p0[i] = i2;
       }
       return;
    }
    public final v10 e(String p0,lx p1,int p2,int p3,Map p4){
       switch (this.F){
           case 0:
             break;
           case 1:
             if (p1 == lx.b) {
                return super.e(p0, p1, p2, p3, p4);
             }
             throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(p1)));
             break;
           default:
             if (p1 == lx.c) {
                return super.e(p0, p1, p2, p3, p4);
             }
             throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(p1)));
       }
       if (p1 == lx.t) {
          return super.e(p0, p1, p2, p3, p4);
       }
       throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(p1)));
    }
    public final boolean[] s(String p0){
       int i6;
       int i7;
       int[][] g;
       int i9;
       int i10;
       int i11;
       char c1;
       Iterator iterator1;
       char c2;
       int[] ointArray1;
       int[] h;
       String str2;
       int i = 96;
       int i1 = 2;
       char c = '/';
       String str = "Requested contents should be less than 80 digits long, but got ";
       int i2 = 32;
       int i3 = 127;
       int i4 = 80;
       int i5 = 9;
       switch (this.F){
           case 0:
             break;
           case 1:
             if ((i1 = p0.length()) > i4) {
                throw new IllegalArgumentException(str.concat(String.valueOf(i1)));
             }
             i6 = 0;
             while (true) {
                if (i6 < i1) {
                   if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(p0.charAt(i6)) < 0) {
                      i1 = p0.length();
                      StringBuilder str1 = "";
                      i9 = 0;
                      while (true) {
                         if (i9 < i1) {
                            if (c2 = p0.charAt(i9)) {
                               if (c2 != i2) {
                                  if (c2 != '@') {
                                     if (c2 != i) {
                                        if (c2 != '-' && c2 != '.') {
                                           if (c2 <= 26) {
                                              i10 = c2 - 1;
                                              i10 = i10 + 65;
                                              str1 = str1.append('$').append((char)i10);
                                           }else {
                                              char c3 = '%';
                                              if (c2 < i2) {
                                                 i10 = c2 - 27;
                                                 i10 = i10 + 65;
                                                 str1 = str1.append(c3).append((char)i10);
                                              }else if(c2 > ',' && (c2 != c && c2 != ':')){
                                                 if (c2 <= '9') {
                                                    i10 = c2 - 48;
                                                    i10 = i10 + 48;
                                                    str1 = str1.append((char)i10);
                                                 }else if(c2 <= '?'){
                                                    i10 = c2 - 59;
                                                    i10 = i10 + 70;
                                                    str1 = str1.append(c3).append((char)i10);
                                                 }else if(c2 <= 'Z'){
                                                    i10 = c2 - 65;
                                                    i10 = i10 + 65;
                                                    str1 = str1.append((char)i10);
                                                 }else if(c2 <= '_'){
                                                    i10 = c2 - 91;
                                                    i10 = i10 + 75;
                                                    str1 = str1.append(c3).append((char)i10);
                                                 }else if(c2 <= 'z'){
                                                    i10 = c2 - 97;
                                                    i10 = i10 + 65;
                                                    str1 = str1.append('+').append((char)i10);
                                                 }else if(c2 <= i3){
                                                    i10 = c2 - 123;
                                                    i10 = i10 + i4;
                                                    str1 = str1.append(c3).append((char)i10);
                                                 }else {
                                                 }
                                              }else {
                                                 i10 = c2 - 33;
                                                 i10 = i10 + 65;
                                                 str1 = str1.append(c).append((char)i10);
                                              }
                                           }
                                        }
                                     }else {
                                        str1 = str1.append("%W");
                                     }
                                  }else {
                                     str1 = str1.append("%V");
                                  }
                               }
                               str1 = str1.append(c2);
                            }else {
                               str1 = str1.append("%U");
                            }
                            i9 = i9 + 1;
                            iterator1 = 96;
                         }else {
                            p0 = str1;
                            if ((i1 = p0.length()) <= i4) {
                            label_013b :
                               ointArray1 = new int[i5];
                               i6 = i1 + 25;
                               i7 = 0;
                               while (true) {
                                  h = kh0.H;
                                  if (i7 < i1) {
                                     lh0.q0(ointArray1, h["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(p0.charAt(i7))]);
                                     for (i11 = 0; i11 < i5; i11 = i11 + 1) {
                                        i6 = i6 + ointArray1[i11];
                                     }
                                     i7 = i7 + 1;
                                  }else {
                                     break ;
                                  }
                               }
                               boolean[] uobooleanArr1 = new boolean[i6];
                               lh0.q0(ointArray1, 148);
                               i2 = 0;
                               i3 = xe7.b(uobooleanArr1, i2, ointArray1, 1);
                               int[] ointArray2 = new int[]{1};
                               i5 = xe7.b(uobooleanArr1, i3, ointArray2, i2) + i3;
                               i3 = 0;
                               while (i3 < i1) {
                                  lh0.q0(ointArray1, h["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(p0.charAt(i3))]);
                                  i9 = xe7.b(uobooleanArr1, i5, ointArray1, 1) + i5;
                                  i5 = xe7.b(uobooleanArr1, i9, ointArray2, i2) + i9;
                                  i3 = i3 + 1;
                                  i2 = 0;
                               }
                               lh0.q0(ointArray1, 148);
                               xe7.b(uobooleanArr1, i5, ointArray1, 1);
                               return uobooleanArr1;
                            }else {
                            }
                         }
                      }
                      throw new IllegalArgumentException("Requested content contains a non-encodable character: \'"+p0.charAt(i9)+"\'");
                   }else {
                      i6 = i6 + 1;
                      ointArray1 = 96;
                   }
                }else {
                   goto label_013b ;
                }
             }
             throw new IllegalArgumentException(tp2.l(str, i1, " \(extended full ASCII mode\)"));
             break;
           default:
             if ((i = p0.length()) > i4) {
                throw new IllegalArgumentException(str.concat(String.valueOf(i)));
             }
             int[] ointArray3 = new int[i5];
             lh0.r0(ointArray3, mh0.G[c]);
             boolean[] uobooleanArr2 = new boolean[((((p0.length() + i1) + i1) * 9) + 1)];
             i11 = 0;
             lh0.n0(uobooleanArr2, i11, ointArray3);
             i2 = 9;
             while (true) {
                str2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
                if (i11 < i) {
                   lh0.r0(ointArray3, mh0.G[str2.indexOf(p0.charAt(i11))]);
                   lh0.n0(uobooleanArr2, i2, ointArray3);
                   i2 = i2 + 9;
                   i11 = i11 + 1;
                }else {
                   break ;
                }
             }
             i = lh0.o0(20, p0);
             h = mh0.G;
             lh0.r0(ointArray3, h[i]);
             lh0.n0(uobooleanArr2, i2, ointArray3);
             i2 = i2 + i5;
             lh0.r0(ointArray3, h[lh0.o0(15, en6.r(p0)+str2.charAt(i))]);
             lh0.n0(uobooleanArr2, i2, ointArray3);
             i2 = i2 + i5;
             lh0.r0(ointArray3, h[c]);
             lh0.n0(uobooleanArr2, i2, ointArray3);
             uobooleanArr2[(i2 + i5)] = 1;
             return uobooleanArr2;
       }
       if ((i = p0.length()) > 0 && i <= i4) {
          i6 = 0;
          while (true) {
             if (i6 < i) {
                c = p0.charAt(i6);
                switch (c){
                    case 241:
                    case 243:
                    case 244:
                    case 242:
                      break;
                    default:
                      if (c > i3) {
                         throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(c)));
                      }
                }
                i6 = i6 + 1;
             }else {
                ArrayList uArrayList = new ArrayList();
                i7 = 0;
                str = 0;
                i3 = 0;
                i4 = 1;
                while (true) {
                   g = kh0.G;
                   if (i3 < i) {
                      int i8 = lh0.p0(i3, p0);
                      i9 = 101;
                      i10 = 100;
                      if (i8 != i1) {
                         if (i8 == 1) {
                            if (i3 < p0.length() && ((c1 = p0.charAt(i3)) < i2 && (str != i9 && c1 < '`'))) {
                               i2 = 101;
                            label_023b :
                               if (i2 == str) {
                                  switch (p0.charAt(i3)){
                                      case 241:
                                        i9 = 102;
                                     label_0274 :
                                        i10 = i9;
                                        break;
                                      case 242:
                                        i9 = 97;
                                        goto label_0274 ;
                                        break;
                                      case 243:
                                        i10 = 96;
                                        break;
                                      case 244:
                                        if (str == i9) {
                                           goto label_0274 ;
                                        }
                                        break;
                                      default:
                                        if (str != i10) {
                                           if (str != i9) {
                                              i2 = i3 + 2;
                                              i2 = Integer.parseInt(p0.substring(i3, i2));
                                              i3 = i3 + 1;
                                           }else if((i2 = p0.charAt(i3) - 32) < 0){
                                              i2 = i2 + 96;
                                           }
                                        }else {
                                           i2 = p0.charAt(i3) - 32;
                                        }
                                        i9 = i2;
                                        goto label_0274 ;
                                  }
                                  i3 = i3 + 1;
                               }else if(!str){
                                  if (i2 != i10) {
                                     i10 = (i2 != i9)? 105: 103;
                                  }else {
                                     i10 = 104;
                                  }
                               }else {
                                  i10 = i2;
                               }
                               i11 = i2;
                               uArrayList.add(g[i10]);
                               i10 = i10 * i4;
                               i7 = i7 + i10;
                               if (i3) {
                                  i4 = i4 + 1;
                               }
                               i2 = 32;
                            }
                         }else {
                            i2 = 99;
                            if (str == i2) {
                               goto label_023b ;
                            }else {
                               i2 = 3;
                               int i12 = 4;
                               if (str == i10) {
                                  if (i8 != i12) {
                                     i8 = i3 + 2;
                                     if ((i8 = lh0.p0(i8, p0)) != 1 && i8 != i1) {
                                        if (i8 == i12) {
                                           if ((i8 = i3 + 3) != i2) {
                                           label_0239 :
                                              i2 = 100;
                                              goto label_023b ;
                                           }
                                        }else {
                                           i8 = i3 + 4;
                                           while ((i12 = lh0.p0(i8, p0)) == i2) {
                                              i8 = i8 + 2;
                                           }
                                           if (i12 == i1) {
                                              goto label_0239 ;
                                           }
                                        }
                                     }else {
                                        goto label_0239 ;
                                     }
                                  }
                               }else if(i8 == i12){
                                  i8 = i3 + 1;
                                  i8 = lh0.p0(i8, p0);
                               }
                               if (i8 != i2) {
                               }
                               i2 = 99;
                               goto label_023b ;
                            }
                         }
                      }
                   }else {
                      break ;
                   }
                }
                uArrayList.add(g[(i7 % 103)]);
                uArrayList.add(g[106]);
                Iterator iterator = uArrayList.iterator();
                i = 0;
                while (iterator.hasNext()) {
                   int[] ointArray = iterator.next();
                   i7 = ointArray.length;
                   i11 = 0;
                label_02bf :
                   if (i11 < i7) {
                      i = i + ointArray[i11];
                      i11 = i11 + 1;
                      goto label_02bf ;
                   }else {
                      continue ;
                   }
                }
                boolean[] uobooleanArr = new boolean[i];
                iterator1 = uArrayList.iterator();
                i1 = 0;
                while (iterator1.hasNext()) {
                   i1 = i1 + xe7.b(uobooleanArr, i1, iterator1.next(), 1);
                }
                return uobooleanArr;
             }
          }
       }else {
          throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(i)));
       }
    }
}
