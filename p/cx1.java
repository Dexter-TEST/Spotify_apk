package p.cx1;
import java.lang.Object;
import java.lang.String;
import p.gx1;
import java.nio.charset.Charset;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import p.ex1;
import java.io.Serializable;
import java.lang.Double;
import java.lang.NumberFormatException;
import java.lang.Integer;
import java.lang.StringBuilder;
import p.bx1;
import java.io.InputStream;
import java.lang.Throwable;
import android.util.Log;
import p.en6;

public final class cx1	// class@001294 from classes.dex
{
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public void cx1(long p0,byte[] p1,int p2,int p3){
       super();
       this.a = p2;
       this.b = p3;
       this.c = p0;
       this.d = p1;
    }
    public void cx1(byte[] p0,int p1,int p2){
       super(-1, p0, p1, p2);
    }
    public static cx1 a(String p0){
       byte[] bytes = p0.concat("\xff\x02\xff\x02").getBytes(gx1.M);
       return new cx1(bytes, 2, bytes.length);
    }
    public static cx1 b(long p0,ByteOrder p1){
       long[] olongArray = new long[]{p0};
       byte[] uobyteArray = new byte[(gx1.D[4] * 1)];
       ByteBuffer uByteBuffer = ByteBuffer.wrap(uobyteArray);
       uByteBuffer.order(p1);
       uByteBuffer.putInt((int)olongArray[0]);
       return new cx1(uByteBuffer.array(), 4, 1);
    }
    public static cx1 c(ex1 p0,ByteOrder p1){
       ex1[] uoex1Array = new ex1[]{p0};
       byte[] uobyteArray = new byte[(gx1.D[5] * 1)];
       ByteBuffer uByteBuffer = ByteBuffer.wrap(uobyteArray);
       uByteBuffer.order(p1);
       object oobject = uoex1Array[0];
       uByteBuffer.putInt((int)oobject.a);
       uByteBuffer.putInt((int)oobject.b);
       return new cx1(uByteBuffer.array(), 5, 1);
    }
    public static cx1 d(int p0,ByteOrder p1){
       int[] ointArray = new int[]{p0};
       byte[] uobyteArray = new byte[(gx1.D[3] * 1)];
       ByteBuffer uByteBuffer = ByteBuffer.wrap(uobyteArray);
       uByteBuffer.order(p1);
       uByteBuffer.putShort((short)ointArray[0]);
       return new cx1(uByteBuffer.array(), 3, 1);
    }
    public final double e(ByteOrder p0){
       Serializable serializable;
       if ((serializable = this.h(p0)) == null) {
          throw new NumberFormatException("NULL can\'t be converted to a double value");
       }
       if (serializable instanceof String) {
          return Double.parseDouble(serializable);
       }
       String str = "There are more than one component";
       if (serializable instanceof long[]) {
          if (serializable.length == 1) {
             return (double)serializable[0];
          }
          throw new NumberFormatException(str);
       }else if(serializable instanceof int[]){
          if (serializable.length == 1) {
             return (double)serializable[0];
          }
          throw new NumberFormatException(str);
       }else if(serializable instanceof double[]){
          if (serializable.length == 1) {
             return serializable[0];
          }
          throw new NumberFormatException(str);
       }else if(serializable instanceof ex1[]){
          if (serializable.length != 1) {
             throw new NumberFormatException(str);
          }
          object oobject = serializable[0];
          return ((double)oobject.a / (double)oobject.b);
       }else {
          throw new NumberFormatException("Couldn\'t find a double value");
       }
    }
    public final int f(ByteOrder p0){
       Serializable serializable;
       if ((serializable = this.h(p0)) == null) {
          throw new NumberFormatException("NULL can\'t be converted to a integer value");
       }
       if (serializable instanceof String) {
          return Integer.parseInt(serializable);
       }
       if (serializable instanceof long[]) {
          if (serializable.length == 1) {
             return (int)serializable[0];
          }
          throw new NumberFormatException("There are more than one component");
       }else if(serializable instanceof int[]){
          if (serializable.length == 1) {
             return serializable[0];
          }
          throw new NumberFormatException("There are more than one component");
       }else {
          throw new NumberFormatException("Couldn\'t find a integer value");
       }
    }
    public final String g(ByteOrder p0){
       Serializable serializable = this.h(p0);
       String str = null;
       if (serializable == null) {
          return str;
       }
       if (serializable instanceof String) {
          return serializable;
       }
       StringBuilder str1 = "";
       int i = 0;
       if (serializable instanceof long[]) {
          while (i < serializable.length) {
             str1 = str1.append(serializable[i]);
             if ((i = i + 1) != serializable.length) {
                str1 = str1.append(",");
             }
          }
          return str1;
       }else if(serializable instanceof int[]){
          while (i < serializable.length) {
             str1 = str1.append(serializable[i]);
             if ((i = i + 1) != serializable.length) {
                str1 = str1.append(",");
             }
          }
          return str1;
       }else if(serializable instanceof double[]){
          while (i < serializable.length) {
             str1 = str1.append(serializable[i]);
             if ((i = i + 1) != serializable.length) {
                str1 = str1.append(",");
             }
          }
          return str1;
       }else if(serializable instanceof ex1[]){
          while (i < serializable.length) {
             str1 = str1.append(serializable[i].a).append('/').append(serializable[i].b);
             if ((i = i + 1) != serializable.length) {
                str1 = str1.append(",");
             }
          }
          return str1;
       }else {
          return str;
       }
    }
    public final Serializable h(ByteOrder p0){
       InputStream inputStream;
       int b;
       String td1;
       StringBuilder str;
       byte b1;
       int[] ointArray;
       long l1;
       ex1[] uoex1Array;
       double[] uodoubleArra;
       cx1 td = this.d;
       Serializable serializable = null;
       try{
          try{
             bx1 uobx1 = new bx1(td);
             uobx1.b = p0;
             long l = 0xffffffff;
             int i = 0;
             int i1 = 1;
             cx1 tb = this.b;
             switch (this.a){
                 case 1:
                 case 6:
                   break;
                 case 2:
                 case 7:
                   if (tb >= gx1.E.length) {
                      b = 0;
                      while (true) {
                         byte[] e = gx1.E;
                         if (b < e.length) {
                            if (td[b] != e[b]) {
                               i1 = 0;
                               break ;
                            }else {
                               b++;
                            }
                         }else if(i1){
                            i = e.length;
                         }
                      }
                   }
                   str = "";
                   while (i < tb && (b1 = td[i])) {
                      str = (b1 >= 32)? str.append((char)b1): str.append('?');
                      i = i + 1;
                   }
                   str = str;
                   try{
                      uobx1.close();
                   }catch(java.io.IOException e0){
                      Log.e("ExifInterface", "IOException occurred while closing InputStream", e0);
                   }
                   return str;
                   break;
                 case 3:
                   ointArray = new int[tb];
                   for (; i < tb; i = i + 1) {
                      ointArray[i] = uobx1.readUnsignedShort();
                   }
                   try{
                      uobx1.close();
                   }catch(java.io.IOException e0){
                      Log.e("ExifInterface", "IOException occurred while closing InputStream", e0);
                   }
                   return ointArray;
                   break;
                 case 4:
                   long[] olongArray = new long[tb];
                   for (; i < tb; i = i + 1) {
                      l1 = (long)uobx1.readInt() & l;
                      olongArray[i] = l1;
                   }
                   try{
                      uobx1.close();
                   }catch(java.io.IOException e0){
                      Log.e("ExifInterface", "IOException occurred while closing InputStream", e0);
                   }
                   return olongArray;
                   break;
                 case 5:
                   uoex1Array = new ex1[tb];
                   for (; i < tb; i = i + 1) {
                      l1 = (long)uobx1.readInt() & l;
                      long l2 = (long)uobx1.readInt() & l;
                      uoex1Array[i] = new ex1(l1, l2);
                   }
                   try{
                      uobx1.close();
                   }catch(java.io.IOException e0){
                      Log.e("ExifInterface", "IOException occurred while closing InputStream", e0);
                   }
                   return uoex1Array;
                   break;
                 case 8:
                   ointArray = new int[tb];
                   for (; i < tb; i = i + 1) {
                      ointArray[i] = uobx1.readShort();
                   }
                   try{
                      uobx1.close();
                   }catch(java.io.IOException e0){
                      Log.e("ExifInterface", "IOException occurred while closing InputStream", e0);
                   }
                   return ointArray;
                   break;
                 case 9:
                   ointArray = new int[tb];
                   for (; i < tb; i = i + 1) {
                      ointArray[i] = uobx1.readInt();
                   }
                   try{
                      uobx1.close();
                   }catch(java.io.IOException e0){
                      Log.e("ExifInterface", "IOException occurred while closing InputStream", e0);
                   }
                   return ointArray;
                   break;
                 case 10:
                   uoex1Array = new ex1[tb];
                   for (; i < tb; i = i + 1) {
                      uoex1Array[i] = new ex1((long)uobx1.readInt(), (long)uobx1.readInt());
                   }
                   try{
                      uobx1.close();
                   }catch(java.io.IOException e0){
                      Log.e("ExifInterface", "IOException occurred while closing InputStream", e0);
                   }
                   return uoex1Array;
                   break;
                 case 11:
                   uodoubleArra = new double[tb];
                   for (; i < tb; i = i + 1) {
                      uodoubleArra[i] = (double)uobx1.readFloat();
                   }
                   try{
                      uobx1.close();
                   }catch(java.io.IOException e0){
                      Log.e("ExifInterface", "IOException occurred while closing InputStream", e0);
                   }
                   return uodoubleArra;
                   break;
                 case 12:
                   uodoubleArra = new double[tb];
                   for (; i < tb; i = i + 1) {
                      uodoubleArra[i] = uobx1.readDouble();
                   }
                   try{
                      uobx1.close();
                   }catch(java.io.IOException e0){
                      Log.e("ExifInterface", "IOException occurred while closing InputStream", e0);
                   }
                   return uodoubleArra;
                   break;
                 default:
                   try{
                      uobx1.close();
                   }catch(java.io.IOException e15){
                      Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                   }
                   return serializable;
             }
             if (td.length == i1 && ((b = td[i]) >= 0 && b <= i1)) {
                char[] uocharArray = new char[i1];
                uocharArray[i] = (char)(b + 48);
                try{
                   td1 = new String(uocharArray);
                   uobx1.close();
                }catch(java.io.IOException e15){
                   Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                }
                return td1;
             }else {
                try{
                   Charset m = gx1.M;
                   try{
                      str = new String(td, m);
                      uobx1.close();
                   }catch(java.io.IOException e0){
                      Log.e("ExifInterface", "IOException occurred while closing InputStream", e0);
                   }
                   return str;
                }catch(java.io.IOException e0){
                }
                if (inputStream) {
                   inputStream.close();
                }
                return serializable;
             }
          }catch(java.io.IOException e0){
          }
       }catch(java.io.IOException e0){
          inputStream = serializable;
       }
    }
    public final String toString(){
       return en6.o("\("+gx1.C[this.a]+", data length:", this.d.length, "\)");
    }
}
