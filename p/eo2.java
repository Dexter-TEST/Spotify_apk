package p.eo2;
import java.io.Serializable;
import p.fo2;

public final class eo2 extends fo2 implements Serializable	// class@0014c6 from classes.dex
{
    public final long b;

    public void eo2(long p0){
       super();
       this.b = p0;
    }
    public final byte[] a(){
       eo2 tb;
       byte[] uobyteArray = new byte[]{(byte)(int)tb,(byte)(int)(tb >> 8),(byte)(int)(tb >> 16),(byte)(int)(tb >> 24),(byte)(int)(tb >> 32),(byte)(int)(tb >> 40),(byte)(int)(tb >> 48),(byte)(int)(tb >> 56)};
       tb = this.b;
       return uobyteArray;
    }
    public final int b(){
       return (int)this.b;
    }
    public final long c(){
       return this.b;
    }
    public final int d(){
       return 64;
    }
    public final boolean e(fo2 p0){
       boolean b = (!(this.b - p0.c()))? true: false;
       return b;
    }
}
