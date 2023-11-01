package p.oy7;
import p.d18;
import java.util.Arrays;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.AssertionError;
import java.lang.Object;
import p.z08;
import p.uo4;
import java.lang.Throwable;
import android.util.Log;

public abstract class oy7 extends d18	// class@0021b8 from classes.dex
{
    public final int a;

    public void oy7(byte[] p0){
       super();
       int i = (p0.length == 25)? 1: 0;
       if (i) {
          this.a = Arrays.hashCode(p0);
          return;
       }else {
          throw new IllegalArgumentException();
       }
    }
    public static byte[] n(String p0){
       try{
          return p0.getBytes("ISO-8859-1");
       }catch(java.io.UnsupportedEncodingException e1){
          throw new AssertionError(e1);
       }
    }
    public final boolean equals(Object p0){
       try{
          if (p0 != null && p0 instanceof z08) {
             if (p0.a != this.a) {
                return false;
             }
             return Arrays.equals(this.k(), new uo4(p0.k()).a);
          }
       }catch(android.os.RemoteException e4){
          Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
       }
       return false;
    }
    public final int hashCode(){
       return this.a;
    }
    public abstract byte[] k();
}
