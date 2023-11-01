package p.h51;
import java.lang.String;
import p.es3;
import p.b7;
import java.util.Map;
import java.lang.Object;
import java.util.HashMap;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.InputStream;
import java.lang.Throwable;
import android.util.Log;
import java.lang.IllegalStateException;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Class;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class h51	// class@0017e2 from classes.dex
{
    public final HashMap a;
    public static final String b;
    public static final h51 c;

    static {
       h51.b = es3.d("Data");
       h51.c = new b7(7).l();
    }
    public void h51(Map p0){
       super();
       this.a = new HashMap(p0);
    }
    public void h51(h51 p0){
       super();
       this.a = new HashMap(p0.a);
    }
    public static h51 a(byte[] p0){
       Throwable throwable;
       String str = "Error in Data#fromByteArray: ";
       if (p0.length > 0x2800) {
          throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
       }
       HashMap hashMap = new HashMap();
       ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(p0);
       try{
          int i = 0;
          try{
             ObjectInputStream objectInputS = new ObjectInputStream(uByteArrayIn);
             i = objectInputS.readInt();
             while (i > 0) {
                hashMap.put(objectInputS.readUTF(), objectInputS.readObject());
                i--;
             }
             try{
                objectInputS.close();
             }catch(java.io.IOException e8){
                Log.e(h51.b, str, e8);
             }
             uByteArrayIn.close();
          }catch(java.io.IOException e8){
          }catch(java.lang.ClassNotFoundException e8){
          }
       }catch(java.io.IOException e4){
       }catch(java.lang.ClassNotFoundException e4){
       }catch(java.io.IOException e8){
          Log.e(h51.b, str, e8);
       }
       return new h51(hashMap);
    }
    public static byte[] b(h51 p0){
       ObjectOutputStream objectOutput;
       String str = "Error in Data#toByteArray: ";
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       try{
          int i = 0;
          try{
             objectOutput = new ObjectOutputStream(uByteArrayOu);
             objectOutput.writeInt(p0.a.size());
             Iterator iterator = p0.a.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                objectOutput.writeUTF(uEntry.getKey());
                objectOutput.writeObject(uEntry.getValue());
             }
             try{
                objectOutput.close();
             }catch(java.io.IOException e6){
                Log.e(h51.b, str, e6);
             }
             try{
                uByteArrayOu.close();
             }catch(java.io.IOException e6){
                Log.e(h51.b, str, e6);
             }
             if (uByteArrayOu.size() <= 0x2800) {
                return uByteArrayOu.toByteArray();
             }else {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
             }
          }catch(java.io.IOException e6){
             ObjectOutputStream objectOutput1 = objectOutput;
          }
          Log.e(h51.b, str, e6);
          byte[] uobyteArray = uByteArrayOu.toByteArray();
          if (i) {
             try{
                i.close();
             }catch(java.io.IOException e3){
                Log.e(h51.b, str, e3);
             }
          }
          try{
             uByteArrayOu.close();
          }catch(java.io.IOException e2){
             Log.e(h51.b, str, e2);
          }
          return uobyteArray;
       }catch(java.io.IOException e6){
       }
    }
    public final boolean equals(Object p0){
       boolean b;
       if (this == p0) {
          return true;
       }
       if (p0 == null || h51.class != p0.getClass()) {
          return false;
       }
       h51 ta = this.a;
       Set set = ta.keySet();
       if (!set.equals(p0.a.keySet())) {
          return false;
       }
       Iterator iterator = set.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          String str = iterator.next();
          Object obj = ta.get(str);
          Object obj1 = p0.a.get(str);
          if (obj != null && obj1 != null) {
             b = (obj instanceof Object[] && obj1 instanceof Object[])? Arrays.deepEquals(obj, obj1): obj.equals(obj1);
          }else if(obj == obj1){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             break ;
          }
       }
       return false;
    }
    public final int hashCode(){
       return (this.a.hashCode() * 31);
    }
    public final String toString(){
       StringBuilder str = "Data {";
       h51 ta = this.a;
       if (!ta.isEmpty()) {
          Iterator iterator = ta.keySet().iterator();
          while (iterator.hasNext()) {
             String str1 = iterator.next();
             str = str.append(str1).append(" : ");
             Object obj = ta.get(str1);
             str = (obj instanceof Object[])? str.append(Arrays.toString(obj)): str.append(obj);
             str = str.append(", ");
          }
       }
       return str+"}";
    }
}
