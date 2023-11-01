package p.oo5;
import p.ng3;
import p.rx0;
import java.io.DataInputStream;
import java.io.InputStream;
import p.fx0;

public final class oo5 extends ng3	// class@0002e7 from classes2.dex
{
    public final DataInputStream d;

    public void oo5(rx0 p0){
       super(1);
       DataInputStream uDataInputSt = new DataInputStream(p0);
       this.d = uDataInputSt;
       if (uDataInputSt.readUnsignedByte()) {
          throw new fx0();
       }
       this.c = uDataInputSt.readInt();
       this.b = -1;
       return;
    }
    public final void f(){
       if (!((this.b & 0xff000000))) {
          this.c = (this.c << 8) | this.d.readUnsignedByte();
          this.b = this.b << 8;
       }
       return;
    }
}
