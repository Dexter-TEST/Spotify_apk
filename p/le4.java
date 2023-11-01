package p.le4;
import java.io.Serializable;
import p.y0;
import p.po2;
import p.w51;
import p.ke4;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.en6;

public final class le4 extends y0 implements Serializable	// class@001d39 from classes.dex
{
    public final int a;
    public static final le4 b;

    static {
       le4.b = new le4(0);
       le4 ole4 = new le4(po2.a);
    }
    public void le4(int p0){
       super();
       this.a = p0;
    }
    public final w51 b(){
       return new ke4(this.a);
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof le4 && this.a == p0.a) {
          b = true;
       }
       return b;
    }
    public final int hashCode(){
       return (le4.class.hashCode() ^ this.a);
    }
    public final String toString(){
       return en6.o("Hashing.murmur3_128\(", this.a, "\)");
    }
}
