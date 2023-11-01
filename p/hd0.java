package p.hd0;
import p.in2;
import java.nio.ByteBuffer;
import p.vv7;
import java.util.UUID;
import p.io2;
import java.nio.Buffer;
import java.lang.String;
import p.do5;
import java.lang.Object;
import java.lang.Class;
import java.lang.StringBuilder;

public final class hd0 extends in2	// class@001829 from classes.dex
{
    public boolean a;
    public byte b;
    public UUID c;

    public void hd0(){
       super();
    }
    public final ByteBuffer a(){
       ByteBuffer uByteBuffer = ByteBuffer.allocate(20);
       vv7.f0(uByteBuffer, this.a);
       if (this.a != null) {
          uByteBuffer.put((byte)(this.b & 0x00ff));
          uByteBuffer.put(io2.i(this.c));
       }else {
          byte[] uobyteArray = new byte[17];
          uByteBuffer.put(uobyteArray);
       }
       uByteBuffer.rewind();
       return uByteBuffer;
    }
    public final String b(){
       return "seig";
    }
    public final void c(ByteBuffer p0){
       byte b1;
       boolean b = true;
       if (do5.j0(p0) == b) {
       }else {
          b = false;
       }
       this.a = b;
       if ((b1 = p0.get()) < 0) {
          b1 = b1 + 256;
       }
       this.b = (byte)b1;
       byte[] uobyteArray = new byte[16];
       p0.get(uobyteArray);
       this.c = io2.h(uobyteArray);
       return;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || hd0.class != p0.getClass()) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       hd0 tc = this.c;
       p0 = p0.c;
       if (tc != null) {
          if (!tc.equals(p0)) {
          label_002f :
             return false;
          }
       }else if(p0 != null){
          goto label_002f ;
       }
       return true;
    }
    public final int hashCode(){
       hd0 tc;
       int i = (this.a != null)? 7: 19;
       i = ((i * 31) + this.b) * 31;
       int i1 = ((tc = this.c) != null)? tc.hashCode(): 0;
       return (i + i1);
    }
    public final String toString(){
       return "CencSampleEncryptionInformationGroupEntry{isEncrypted="+this.a+", ivSize="+this.b+", kid="+this.c+'}';
    }
}
