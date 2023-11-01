package p.do2;
import java.io.Serializable;
import p.fo2;
import java.lang.IllegalStateException;
import java.lang.String;

public final class do2 extends fo2 implements Serializable	// class@001384 from classes.dex
{
    public final int b;

    public void do2(int p0){
       super();
       this.b = p0;
    }
    public final byte[] a(){
       do2 tb;
       byte[] uobyteArray = new byte[]{(byte)tb,(byte)(tb >> 8),(byte)(tb >> 16),(byte)(tb >> 24)};
       tb = this.b;
       return uobyteArray;
    }
    public final int b(){
       return this.b;
    }
    public final long c(){
       throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
    }
    public final int d(){
       return 32;
    }
    public final boolean e(fo2 p0){
       boolean b = (this.b == p0.b())? true: false;
       return b;
    }
}
