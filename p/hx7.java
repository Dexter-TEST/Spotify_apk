package p.hx7;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;

public final class hx7	// class@0018e2 from classes.dex
{
    public final int a;
    public final String b;
    public final long c;
    public final long d;
    public final int e;

    public void hx7(int p0,int p1,long p2,long p3,String p4){
       super();
       this.a = p0;
       this.b = p4;
       this.c = p2;
       this.d = p3;
       this.e = p1;
    }
    public final boolean equals(Object p0){
       hx7 tb;
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof hx7 && this.a == p0.a) {
          hx7 b = p0.b;
          if ((tb = this.b) == null) {
             if (b != null) {
             label_0038 :
                return false;
             }
          }else if(!tb.equals(b)){
             goto label_0038 ;
          }
          if (!(this.c - p0.c) && (!(this.d - p0.d) && this.e == p0.e)) {
             return true;
          }else {
             goto label_0038 ;
          }
       }else {
          goto label_0038 ;
       }
    }
    public final int hashCode(){
       hx7 tb;
       int i = 0xf4243;
       int i1 = (this.a ^ i) * i;
       int i2 = ((tb = this.b) == null)? 0: tb.hashCode();
       tb = this.c;
       tb = this.d;
       return (((((((i1 ^ i2) * i) ^ (int)(tb ^ (tb >> 32))) * i) ^ (int)(tb ^ (tb >> 32))) * i) ^ this.e);
    }
    public final String toString(){
       hx7 tb = this.b;
       StringBuilder str = new StringBuilder((String.valueOf(tb).length() + 157))+"SliceCheckpoint{fileExtractionStatus="+this.a+", filePath="+tb;
       return str+", fileOffset="+this.c+", remainingBytes="+this.d+", previousChunk="+this.e+"}";
    }
}
