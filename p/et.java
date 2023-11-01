package p.et;
import p.o11;
import java.lang.Long;
import java.lang.Integer;
import java.lang.String;
import p.kg4;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class et	// class@0014f8 from classes.dex
{
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public static final et f;

    static {
       o11 oo11 = new o11(6);
       oo11.b = Long.valueOf(0xa00000);
       oo11.c = Integer.valueOf(200);
       oo11.t = Integer.valueOf(0x2710);
       oo11.v = Long.valueOf(0x240c8400);
       oo11.w = Integer.valueOf(0x14000);
       String str = (oo11.b == null)? " maxStorageSizeInBytes": "";
       if (oo11.c == null) {
          str = str.concat(" loadBatchSize");
       }
       if (oo11.t == null) {
          str = kg4.l(str, " criticalSectionEnterTimeoutMs");
       }
       if (oo11.v == null) {
          str = kg4.l(str, " eventCleanUpAge");
       }
       if (oo11.w == null) {
          str = kg4.l(str, " maxBlobByteSizePerRow");
       }
       if (str.isEmpty()) {
          et str1 = new et(oo11.b.longValue(), oo11.c.intValue(), oo11.t.intValue(), oo11.v.longValue(), oo11.w.intValue());
          et.f = str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public void et(long p0,int p1,int p2,long p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof et) {
          return false;
       }
       if ((this.a - p0.a) || (this.b != p0.b || (this.c != p0.c || ((this.d - p0.d) || this.e != p0.e)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       et ta = this.a;
       et td = this.d;
       return (this.e ^ (((((((((int)(ta ^ (ta >> 32)) ^ 0xf4243) * 0xf4243) ^ this.b) * 0xf4243) ^ this.c) * 0xf4243) ^ (int)((td >> 32) ^ td)) * 0xf4243));
    }
    public final String toString(){
       return en6.o("EventStoreConfig{maxStorageSizeInBytes="+this.a+", loadBatchSize="+this.b+", criticalSectionEnterTimeoutMs="+this.c+", eventCleanUpAge="+this.d+", maxBlobByteSizePerRow=", this.e, "}");
    }
}
