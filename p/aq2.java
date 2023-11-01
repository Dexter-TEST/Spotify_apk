package p.aq2;
import java.lang.String;
import java.lang.Integer;
import java.lang.Class;
import java.lang.Object;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Iterator;
import java.lang.Iterable;
import p.kr6;
import java.util.List;

public final class aq2	// class@000fd1 from classes.dex
{
    public final byte[] a;
    public static final String[] b;
    public static final int[][] c;
    public static final int[][] d;
    public static final int[][] e;

    static {
       int i3;
       int i4;
       int i5;
       String[] stringArray = new String[]{"UPPER","LOWER","DIGIT","MIXED","PUNCT"};
       aq2.b = stringArray;
       int[][] ointArray = new int[][5];
       ointArray[0] = new int[5]{0,0x5001c,0x5001e,0x5001d,0xa03be};
       int i = 1;
       ointArray[1] = new int[5]{0x901ee,0,0x5001e,0x5001d,0xa03be};
       ointArray[2] = new int[5]{0x4000e,0x901dc,0,0x901dd,0xe3bbe};
       ointArray[3] = new int[5]{0x5001d,0x5001c,0xa03be,0,0x5001e};
       ointArray[4] = new int[5]{0x5001f,0xa03fc,0xa03fe,0xa03fd,0};
       aq2.c = ointArray;
       int[][] ointArray1 = Array.newInstance(Integer.TYPE, new int[2]{5,256});
       aq2.d = ointArray1;
       int i1 = 32;
       ointArray1[0][i1] = i;
       for (int i2 = 65; i2 <= 90; i2 = i2 + 1) {
          i3 = i2 - 65;
          i3 = i3 + 2;
          aq2.d[0][i2] = i3;
       }
       aq2.d[i][i1] = i;
       for (i2 = 97; i2 <= 122; i2 = i2 + 1) {
          i3 = i2 - 97;
          i3 = i3 + 2;
          aq2.d[i][i2] = i3;
       }
       aq2.d[2][i1] = i;
       for (i2 = 48; i2 <= 57; i2 = i2 + 1) {
          i4 = i2 - 48;
          i4 = i4 + 2;
          aq2.d[2][i2] = i4;
       }
       object oobject = aq2.d[2];
       oobject[44] = 12;
       oobject[46] = 13;
       i2 = 28;
       int[] ointArray2 = new int[i2]{0,32,1,2,3,4,5,6,7,8,9,10,11,12,13,27,28,29,30,31,'@',92,'^','_','`','|','~',127};
       for (i4 = 0; i4 < i2; i4 = i4 + 1) {
          aq2.d[3][ointArray2[i4]] = i4;
       }
       i1 = 31;
       int[] ointArray3 = new int[i1]{0,13,0,0,0,0,'!',39,'#','$','%','&',39,'(',')','*','+',',','-','.','/',':',';','<','=','>','?','[',']','{','}'};
       i3 = 0;
       while (i3 < i1) {
          if ((i5 = ointArray3[i3]) > 0) {
             aq2.d[4][i5] = i3;
          }
          i3 = i3 + 1;
       }
       ointArray = Array.newInstance(Integer.TYPE, new int[2]{6,6});
       aq2.e = ointArray;
       i4 = ointArray.length;
       for (i3 = 0; i3 < i4; i3 = i3 + 1) {
          Arrays.fill(ointArray[i3], -1);
       }
       ointArray = aq2.e;
       ointArray[0][4] = 0;
       object oobject1 = ointArray[i];
       oobject1[4] = 0;
       oobject1[0] = i2;
       ointArray[3][4] = 0;
       oobject = ointArray[2];
       oobject[4] = 0;
       oobject[0] = 15;
    }
    public void aq2(byte[] p0){
       super();
       this.a = p0;
    }
    public static LinkedList a(LinkedList p0){
       LinkedList linkedList = new LinkedList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          kr6 okr6 = iterator.next();
          Iterator iterator1 = linkedList.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                kr6 okr61 = iterator1.next();
                if (okr61.c(okr6)) {
                   iterator1 = 0;
                label_0038 :
                   if (iterator1) {
                      linkedList.add(okr6);
                   }else {
                      continue ;
                   }
                }else if(okr6.c(okr61)){
                   iterator1.remove();
                }
             }else {
                iterator1 = 1;
                goto label_0038 ;
             }
          }
       }
       return linkedList;
    }
}
