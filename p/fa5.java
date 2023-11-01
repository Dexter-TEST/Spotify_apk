package p.fa5;
import p.a27;
import java.lang.String;
import java.lang.CharSequence;
import java.lang.IllegalArgumentException;
import java.lang.Math;
import java.lang.Class;
import java.lang.Object;
import p.qe5;
import java.lang.ThreadLocal;
import java.lang.Character;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.AssertionError;
import java.lang.IndexOutOfBoundsException;
import p.tp2;

public final class fa5 extends a27	// class@00158e from classes.dex
{
    public final boolean c;
    public final boolean[] t;
    public static final char[] v;
    public static final char[] w;

    static {
       char[] uocharArray = new char[]{'+'};
       fa5.v = uocharArray;
       fa5.w = "0123456789ABCDEF".toCharArray();
    }
    public void fa5(String p0,boolean p1){
       int i = 0;
       super(6, i);
       if (p0.matches(".*[0-9A-Za-z].*")) {
          throw new IllegalArgumentException("Alphanumeric characters are always \'safe\' and should not be explicitly specified");
       }
       p0 = p0.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
       if (p1 && p0.contains(" ")) {
          throw new IllegalArgumentException("plusForSpace cannot be specified when space is a \'safe\' character");
       }
       this.c = p1;
       char[] uocharArray = p0.toCharArray();
       int len = uocharArray.length;
       int i1 = -1;
       for (int i2 = 0; i2 < len; i2 = i2 + 1) {
          i1 = Math.max(uocharArray[i2], i1);
       }
       boolean[] uobooleanArr = new boolean[(i1 + 1)];
       i2 = uocharArray.length;
       for (; i < i2; i = i + 1) {
          uobooleanArr[uocharArray[i]] = 1;
       }
       this.t = uobooleanArr;
       return;
    }
    public final String g(String p0){
       char c1;
       int i6;
       char[] uocharArray2;
       fa5 uofa5 = this;
       String str = p0;
       p0.getClass();
       int i = p0.length();
       int i1 = 0;
       int i2 = 0;
       while (i2 < i) {
          char c = str.charAt(i2);
          fa5 t = uofa5.t;
          if (c < t.length && t[c]) {
             i2 = i2 + 1;
          }else {
             i = p0.length();
             char[] uocharArray = qe5.a.get();
             int i3 = 0;
             int i4 = 0;
             while (true) {
                String str1 = "Cannot increase internal buffer any further";
                if (i2 < i) {
                   if (i2 < i) {
                      int i5 = i2 + 1;
                      if ((c1 = str.charAt(i2)) >= 0xd800 && c1 <= 0xdfff) {
                         String str2 = "\'";
                         String str3 = " in \'";
                         String str4 = " at index ";
                         if (c1 <= 0xdbff) {
                            if (i5 == i) {
                               i6 = - c1;
                            }else {
                               char c2 = str.charAt(i5);
                               if (Character.isLowSurrogate(c2)) {
                                  i6 = Character.toCodePoint(c1, c2);
                               }else {
                                  throw new IllegalArgumentException("Expected low surrogate but got char \'"+c2+"\' with value "+c2+str4+i5+str3+str+str2);
                               }
                            }
                         }else {
                            throw new IllegalArgumentException("Unexpected low surrogate character \'"+c1+"\' with value "+c1+str4+(i5 - 1)+str3+str+str2);
                         }
                      }
                      if (c1 >= 0) {
                         char[] uocharArray1 = uofa5.j(c1);
                         i6 = (Character.isSupplementaryCodePoint(c1))? 2: 1;
                         i6 = i6 + i2;
                         if (uocharArray1 != null) {
                            int i7 = i2 - i3;
                            int i8 = i4 + i7;
                            int i9 = uocharArray1.length + i8;
                            if (uocharArray.length < i9) {
                               int i10 = i - i2;
                               i10 = i10 + i9;
                               if ((i10 = i10 + 32) >= 0) {
                                  uocharArray2 = new char[i10];
                                  if (i4 > 0) {
                                     System.arraycopy(uocharArray, i1, uocharArray2, i1, i4);
                                  }
                                  uocharArray = uocharArray2;
                               }else {
                                  throw new AssertionError(str1);
                               }
                            }
                            if (i7 > 0) {
                               str.getChars(i3, i2, uocharArray, i4);
                               i4 = i8;
                            }
                            if (uocharArray1.length > 0) {
                               System.arraycopy(uocharArray1, i1, uocharArray, i4, uocharArray1.length);
                               i4 = i4 + uocharArray1.length;
                            }
                            i3 = i6;
                         }
                         i2 = uofa5.k(str, i6, i);
                      }else {
                         throw new IllegalArgumentException("Trailing high surrogate at end of input");
                      }
                   }else {
                      throw new IndexOutOfBoundsException("Index exceeds specified range");
                   }
                }else if((i2 = i - i3) > 0){
                   i2 = i2 + i4;
                   if (uocharArray.length < i2) {
                      if (i2 >= 0) {
                         uocharArray2 = new char[i2];
                         if (i4 > 0) {
                            System.arraycopy(uocharArray, i1, uocharArray2, i1, i4);
                         }
                         uocharArray = uocharArray2;
                      }else {
                         throw new AssertionError(str1);
                      }
                   }
                   str.getChars(i3, i, uocharArray, i4);
                   i4 = i2;
                }
                str = new String(uocharArray, i1, i4);
                break ;
             }
             return str;
          }
       }
    }
    public final char[] j(int p0){
       char[] uocharArray;
       fa5 tt = this.t;
       if (p0 < tt.length && tt[p0]) {
          return null;
       }
       if (p0 == 32 && this.c != null) {
          return fa5.v;
       }
       int i = 1;
       char[] w = fa5.w;
       int i1 = 0;
       if (p0 <= 127) {
          uocharArray = new char[]{'%',w[(p0 >> 4)],w[(p0 & 0x0f)]};
          return uocharArray;
       }else if(p0 <= 2047){
          uocharArray = new char[6];
          uocharArray[0] = '%';
          uocharArray[3] = '%';
          uocharArray[5] = w[(p0 & 0x0f)];
          p0 = p0 >> 4;
          uocharArray[4] = w[((p0 & 0x03) | 8)];
          p0 = p0 >> 2;
          uocharArray[2] = w[(p0 & 0x0f)];
          uocharArray[1] = w[((p0 >> 4) | 12)];
          return uocharArray;
       }else if(p0 <= 0xffff){
          uocharArray = new char[9];
          uocharArray[0] = '%';
          uocharArray[1] = 'E';
          uocharArray[3] = '%';
          uocharArray[6] = '%';
          uocharArray[8] = w[(p0 & 0x0f)];
          p0 = p0 >> 4;
          uocharArray[7] = w[((p0 & 0x03) | 8)];
          p0 = p0 >> 2;
          uocharArray[5] = w[(p0 & 0x0f)];
          p0 = p0 >> 4;
          uocharArray[4] = w[((p0 & 0x03) | 8)];
          uocharArray[2] = w[(p0 >> 2)];
          return uocharArray;
       }else if(p0 <= 0x10ffff){
          uocharArray = new char[12];
          uocharArray[0] = '%';
          uocharArray[1] = 'F';
          uocharArray[3] = '%';
          uocharArray[6] = '%';
          uocharArray[9] = '%';
          uocharArray[11] = w[(p0 & 0x0f)];
          p0 = p0 >> 4;
          uocharArray[10] = w[((p0 & 0x03) | 8)];
          p0 = p0 >> 2;
          uocharArray[8] = w[(p0 & 0x0f)];
          p0 = p0 >> 4;
          uocharArray[7] = w[((p0 & 0x03) | 8)];
          p0 = p0 >> 2;
          uocharArray[5] = w[(p0 & 0x0f)];
          p0 = p0 >> 4;
          uocharArray[4] = w[((p0 & 0x03) | 8)];
          uocharArray[2] = w[((p0 >> 2) & 7)];
          return uocharArray;
       }else {
          throw new IllegalArgumentException(tp2.k("Invalid unicode character value ", p0));
       }
    }
    public final int k(CharSequence p0,int p1,int p2){
       p0.getClass();
       while (p1 < p2) {
          char c = p0.charAt(p1);
          fa5 tt = this.t;
          if (c < tt.length && tt[c]) {
             p1++;
          }else {
             break ;
          }
       }
       return p1;
    }
}
