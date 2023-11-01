package p.gd0;
import java.lang.Object;
import p.wc0;
import p.xc0;
import p.ad0;
import p.yc0;
import p.zc0;
import p.fd0;
import p.dd0;
import p.ed0;
import p.bd0;
import p.cd0;
import java.lang.Class;
import java.math.BigInteger;
import java.util.Arrays;
import java.lang.String;
import java.lang.StringBuilder;
import p.xe7;

public final class gd0	// class@0016e5 from classes.dex
{
    public byte[] a;
    public wc0[] b;

    public void gd0(){
       super();
       byte[] uobyteArray = new byte[0];
       this.a = uobyteArray;
       this.b = null;
    }
    public static wc0 a(int p0,long p1){
       int i = 0;
       if (p0 <= 127) {
          if ((p1 - 127) <= 0) {
             return new xc0(p0, p1);
          }
          if ((p1 - 0x7fff) <= 0) {
             return new ad0(p0, p1, i);
          }
          if ((p1 - 0x7fffffff) <= 0) {
             return new yc0(p0, p1, i);
          }
          return new zc0(p0, p1);
       }else if(p0 <= 0x7fff){
          if ((p1 - 127) <= 0) {
             return new ad0(p0, p1, 1);
          }
          if ((p1 - 0x7fff) <= 0) {
             return new fd0(p0, p1);
          }
          if ((p1 - 0x7fffffff) <= 0) {
             return new dd0(p0, p1, 1);
          }
          return new ed0(p0, p1);
       }else if((p1 - 127) <= 0){
          return new yc0(p0, p1, 1);
       }else if((p1 - 0x7fff) <= 0){
          return new dd0(p0, p1, i);
       }else if((p1 - 0x7fffffff) <= 0){
          return new bd0(p0, p1);
       }else {
          return new cd0(p0, p1);
       }
    }
    public final int b(){
       gd0 tb;
       int len = this.a.length;
       if ((tb = this.b) != null && tb.length > 0) {
          len = (len + 2) + (tb.length * 6);
       }
       return len;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || gd0.class != p0.getClass()) {
          return false;
       }
       if (!new BigInteger(this.a).equals(new BigInteger(p0.a))) {
          return false;
       }
       gd0 tb = this.b;
       p0 = p0.b;
       if (tb != null) {
          if (!Arrays.equals(tb, p0)) {
          label_0036 :
             return false;
          }
       }else if(p0 != null){
          goto label_0036 ;
       }
       return true;
    }
    public final int hashCode(){
       gd0 tb;
       gd0 ta = this.a;
       int i = 0;
       int i1 = (ta != null)? Arrays.hashCode(ta): 0;
       i1 = i1 * 31;
       if ((tb = this.b) != null) {
          i = Arrays.hashCode(tb);
       }
       return (i1 + i);
    }
    public final String toString(){
       return "Entry{iv="+xe7.t(this.a, 0)+", pairs="+Arrays.toString(this.b)+'}';
    }
}
