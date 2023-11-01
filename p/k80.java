package p.k80;
import java.lang.Object;
import java.lang.String;
import java.lang.RuntimeException;
import java.lang.Throwable;

public final class k80	// class@001bc1 from classes.dex
{
    public final byte[] a;
    public int b;

    public void k80(byte[] p0){
       super();
       this.b = 0;
       this.a = p0;
    }
    public static k80 a(String p0){
       try{
          return new k80(p0.getBytes("UTF-8"));
       }catch(java.io.UnsupportedEncodingException e2){
          throw new RuntimeException("UTF-8 not supported.", e2);
       }
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof k80) {
          return false;
       }
       k80 ta = this.a;
       int len = ta.length;
       p0 = p0.a;
       if (len != p0.length) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= len) {
             return true;
          }
          if (ta[i] != p0[i]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public final int hashCode(){
       k80 tb;
       if ((tb = this.b) == null) {
          tb = this.a;
          int len = tb.length;
          int i1 = len;
          for (int i = 0; i < len; i = i + 1) {
             i1 = i1 * 31;
             i1 = i1 + tb[i];
          }
          tb = (!i1)? 1: i1;
          this.b = tb;
       }
       return tb;
    }
}
