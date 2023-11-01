package p.ix7;
import java.lang.String;
import java.lang.Object;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class ix7	// class@001a25 from classes.dex
{
    public final String a;
    public final long b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final byte[] f;

    public void ix7(String p0,long p1,int p2,boolean p3,boolean p4,byte[] p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final boolean equals(Object p0){
       ix7 ta;
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof ix7) {
          if ((ta = this.a) == null) {
             if (p0.a != null) {
             label_0041 :
                return false;
             }
          }else if(ta.equals(p0.a)){
          }
          if (!(this.b - p0.b) && (this.c == p0.c && (this.d == p0.d && (this.e == p0.e && Arrays.equals(this.f, p0.f))))) {
             return true;
          }else {
             goto label_0041 ;
          }
       }else {
          goto label_0041 ;
       }
    }
    public final int hashCode(){
       ix7 ta;
       int i = ((ta = this.a) == null)? 0: ta.hashCode();
       int i1 = 0xf4243;
       ix7 tb = this.b;
       i = (((((i ^ i1) * i1) ^ (int)((tb >> 32) ^ tb)) * i1) ^ this.c) * i1;
       int i2 = 1237;
       int i3 = (1 != this.d)? 1237: 1231;
       i = (i ^ i3) * i1;
       if (1 == this.e) {
          i2 = 1231;
       }
       return (((i ^ i2) * i1) ^ Arrays.hashCode(this.f));
    }
    public final String toString(){
       String str = Arrays.toString(this.f);
       ix7 ta = this.a;
       StringBuilder str1 = new StringBuilder(((String.valueOf(ta).length() + 126) + String.valueOf(str).length()))+"ZipEntry{name="+ta;
       str1 = str1+", size="+this.b+", compressionMethod="+this.c+", isPartial="+this.d+", isEndOfArchive="+this.e+", headerBytes="+str;
       return str1+"}";
    }
}
