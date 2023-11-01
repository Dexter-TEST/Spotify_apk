package p.fd3;
import com.googlecode.mp4parser.a;
import java.lang.Class;
import p.dd;
import p.gs3;
import java.lang.String;
import java.lang.Math;
import java.lang.Object;
import java.lang.System;
import java.lang.Error;
import java.lang.Throwable;

public abstract class fd3 extends a	// class@0015a7 from classes.dex
{

    static {
       gs3.a(fd3.class);
    }
    public static String b(byte[] p0){
       byte[] uobyteArray = new byte[4];
       int i = Math.min(p0.length, 4);
       try{
          System.arraycopy(p0, 0, uobyteArray, 0, i);
          return new String(uobyteArray, "ISO-8859-1");
       }catch(java.io.UnsupportedEncodingException e3){
          throw new Error("Required character encoding is missing", e3);
       }
    }
    public static byte[] f(String p0){
       byte[] uobyteArray = new byte[4];
       if (p0 != null) {
          for (int i = 0; i < Math.min(4, p0.length()); i = i + 1) {
             uobyteArray[i] = (byte)p0.charAt(i);
          }
       }
       return uobyteArray;
    }
}
