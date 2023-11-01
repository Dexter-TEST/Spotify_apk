package p.me0;
import java.lang.String;
import java.lang.Object;
import java.lang.System;
import java.util.Arrays;
import java.lang.Character;

public abstract class me0	// class@001e78 from classes.dex
{
    public static final char[] a;
    public static final byte[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;

    static {
       int i3;
       int i5;
       char[] uocharArray = "0123456789ABCDEF".toCharArray();
       me0.a = uocharArray;
       int len = uocharArray.length;
       byte[] uobyteArray = new byte[len];
       me0.b = uobyteArray;
       int i = 0;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          me0.b[i1] = (byte)me0.a[i1];
       }
       len = 256;
       int[] ointArray = new int[len];
       int i2 = 0;
       while (true) {
          i3 = 32;
          if (i2 < i3) {
             ointArray[i2] = -1;
             i2 = i2 + 1;
          }else {
             break ;
          }
       }
       i2 = 34;
       int i4 = 1;
       ointArray[i2] = i4;
       ointArray[92] = i4;
       int len1 = ointArray.length;
       int[] ointArray1 = new int[len1];
       System.arraycopy(ointArray, i, ointArray1, i, len1);
       i1 = 128;
       for (len1 = 128; len1 < len; len1 = len1 + 1) {
          if ((i5 = len1 & 0x00e0) == 192) {
             i5 = 2;
          }else if((i5 = len1 & 0x00f0) == 224){
             i5 = 3;
          }else if((i5 = len1 & 0x00f8) == 240){
             i5 = 4;
          }else {
             i5 = -1;
          }
          ointArray1[len1] = i5;
       }
       me0.c = ointArray1;
       int[] ointArray2 = new int[len];
       Arrays.fill(ointArray2, -1);
       int i6 = 33;
       while (i6 < len) {
          if (Character.isJavaIdentifierPart((char)i6)) {
             ointArray2[i6] = i;
          }
          i6 = i6 + 1;
       }
       ointArray2[64] = i;
       ointArray2[35] = i;
       ointArray2[42] = i;
       ointArray2[45] = i;
       ointArray2[43] = i;
       int[] ointArray3 = new int[len];
       System.arraycopy(ointArray2, i, ointArray3, i, len);
       Arrays.fill(ointArray3, i1, i1, i);
       ointArray2 = new int[len];
       ointArray3 = me0.c;
       System.arraycopy(ointArray3, i1, ointArray2, i1, i1);
       Arrays.fill(ointArray2, i, i3, -1);
       ointArray2[9] = i;
       ointArray2[10] = 10;
       ointArray2[13] = 13;
       ointArray2[42] = 42;
       ointArray2 = new int[len];
       System.arraycopy(ointArray3, i1, ointArray2, i1, i1);
       Arrays.fill(ointArray2, i, i3, -1);
       ointArray2[i3] = i4;
       ointArray2[9] = i4;
       ointArray2[10] = 10;
       ointArray2[13] = 13;
       ointArray2[47] = 47;
       ointArray2[35] = 35;
       ointArray = new int[i1];
       for (i4 = 0; i4 < i3; i4 = i4 + 1) {
          ointArray[i4] = -1;
       }
       ointArray[i2] = i2;
       ointArray[92] = 92;
       ointArray[8] = 98;
       ointArray[9] = 116;
       ointArray[12] = 102;
       ointArray[10] = 110;
       ointArray[13] = 114;
       me0.d = ointArray;
       int[] ointArray4 = new int[len];
       me0.e = ointArray4;
       Arrays.fill(ointArray4, -1);
       for (len = 0; len < 10; len = len + 1) {
          i2 = len + 48;
          me0.e[i2] = len;
       }
       for (; i < 6; i = i + 1) {
          ointArray4 = me0.e;
          i1 = i + 97;
          i2 = i + 10;
          ointArray4[i1] = i2;
          i1 = i + 65;
          ointArray4[i1] = i2;
       }
    }
}
