package p.g0;
import p.w51;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.lang.Class;
import java.lang.Object;
import p.ap5;
import java.nio.Buffer;

public abstract class g0 extends w51	// class@001678 from classes.dex
{
    public final ByteBuffer D;

    public void g0(){
       super();
       this.D = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
    }
    public final w51 H(byte[] p0){
       p0.getClass();
       this.Y(p0, p0.length);
       return this;
    }
    public final w51 I(byte[] p0,int p1){
       ap5.i(0, (0 + p1), p0.length);
       this.Y(p0, p1);
       return this;
    }
    public final w51 J(char p0){
       g0 tD = this.D;
       tD.putChar(p0);
       this.Y(tD.array(), 2);
       tD.clear();
       return this;
    }
    public abstract void Y(byte[] p0,int p1);
}
