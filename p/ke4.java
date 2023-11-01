package p.ke4;
import p.w51;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p.fo2;
import java.nio.Buffer;
import java.lang.AssertionError;
import java.lang.Object;
import java.lang.Long;
import p.co2;

public final class ke4 extends w51	// class@001bf8 from classes.dex
{
    public final ByteBuffer D;
    public final int E;
    public final int F;
    public long G;
    public long H;
    public int I;

    public void ke4(int p0){
       super();
       this.D = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
       this.E = 16;
       this.F = 16;
       long l = (long)p0;
       this.G = l;
       this.H = l;
       this.I = 0;
    }
    public final fo2 B(){
       long l;
       long l5;
       this.Y();
       ke4 tD = this.D;
       tD.flip();
       if (tD.remaining() > 0) {
          this.I = tD.remaining() + this.I;
          l = 48;
          long l1 = 32;
          long l2 = 8;
          long l3 = 0;
          switch (tD.remaining()){
              case 1:
                l = l3;
             label_00e1 :
                l1 = (long)(tD.get(0) & 0x00ff) ^ l;
             label_00ea :
                this.G = this.G ^ (Long.rotateLeft((l1 * 0x87c37b91114253d5), 31) * 0x4cf5ad432745937f);
                this.H = this.H ^ (Long.rotateLeft((l3 * 0x4cf5ad432745937f), 33) * 0x87c37b91114253d5);
                tD.position(tD.limit());
                break;
              case 2:
                l = l3;
             label_00d5 :
                l = l ^ ((long)(tD.get(1) & 0x00ff) << l2);
                goto label_00e1 ;
                break;
              case 3:
                l = l3;
             label_00c9 :
                l = l ^ ((long)(tD.get(2) & 0x00ff) << 16);
                goto label_00d5 ;
                break;
              case 4:
                l = l3;
             label_00bc :
                l = l ^ ((long)(tD.get(3) & 0x00ff) << 24);
                goto label_00c9 ;
                break;
              case 5:
                l = l3;
             label_00b0 :
                l = l ^ ((long)(tD.get(4) & 0x00ff) << l1);
                goto label_00bc ;
                break;
              case 6:
                l5 = l3;
             label_00a3 :
                l = ((long)(tD.get(5) & 0x00ff) << 40) ^ l5;
                goto label_00b0 ;
                break;
              case 7:
                l5 = ((long)(tD.get(6) & 0x00ff) << l) ^ l3;
                goto label_00a3 ;
                break;
              case 8:
                l = l3;
             label_0090 :
                l1 = tD.getLong() ^ l3;
                l3 = l;
                goto label_00ea ;
                break;
              case 9:
                l = l3;
             label_0086 :
                l = l ^ (long)(tD.get(l2) & 0x00ff);
                goto label_0090 ;
                break;
              case 10:
                l = l3;
             label_0079 :
                l = l ^ ((long)(tD.get(9) & 0x00ff) << l2);
                goto label_0086 ;
                break;
              case 11:
                l = l3;
             label_006c :
                l = l ^ ((long)(tD.get(10) & 0x00ff) << 16);
                goto label_0079 ;
                break;
              case 12:
                l = l3;
             label_005e :
                l = l ^ ((long)(tD.get(11) & 0x00ff) << 24);
                goto label_006c ;
                break;
              case 13:
                l = l3;
             label_0051 :
                l = l ^ ((long)(tD.get(12) & 0x00ff) << l1);
                goto label_005e ;
                break;
              case 14:
                l5 = l3;
             label_0043 :
                l = ((long)(tD.get(13) & 0x00ff) << 40) ^ l5;
                goto label_0051 ;
                break;
              case 15:
                l5 = ((long)(tD.get(14) & 0x00ff) << l) ^ l3;
                goto label_0043 ;
                break;
              default:
                throw new AssertionError("Should never get here.");
          }
       }
       l = (long)this.I;
       long l4 = this.G ^ l;
       l = l ^ this.H;
       l4 = l4 + l;
       l = l + l4;
       l4 = (l4 ^ (l4 >> 33)) * 0xff51afd7ed558ccd;
       l4 = (l4 ^ (l4 >> 33)) * 0xc4ceb9fe1a85ec53;
       l = (l ^ (l >> 33)) * 0xff51afd7ed558ccd;
       l = (l ^ (l >> 33)) * 0xc4ceb9fe1a85ec53;
       l = l ^ (l >> 33);
       l4 = (l4 ^ (l4 >> 33)) + l;
       this.G = l4;
       this.H = l + l4;
       byte[] uobyteArray = new byte[16];
       return new co2(ByteBuffer.wrap(uobyteArray).order(ByteOrder.LITTLE_ENDIAN).putLong(this.G).putLong(this.H).array());
    }
    public final w51 I(byte[] p0,int p1){
       int i = 0;
       ByteBuffer uByteBuffer = ByteBuffer.wrap(p0, i, p1).order(ByteOrder.LITTLE_ENDIAN);
       ke4 tD = this.D;
       if (uByteBuffer.remaining() <= tD.remaining()) {
          tD.put(uByteBuffer);
          if (tD.remaining() < 8) {
             this.Y();
          }
       }else {
          p1 = this.E - tD.position();
          for (; i < p1; i = i + 1) {
             tD.put(uByteBuffer.get());
          }
          this.Y();
          while (uByteBuffer.remaining() >= this.F) {
             this.Z(uByteBuffer);
          }
          tD.put(uByteBuffer);
       }
       return this;
    }
    public final w51 J(char p0){
       int i;
       ke4 tD = this.D;
       tD.putChar(p0);
       if ((i = tD.remaining()) < 8) {
          this.Y();
       }
       return this;
    }
    public final void Y(){
       ke4 tD = this.D;
       tD.flip();
       while (tD.remaining() >= this.F) {
          this.Z(tD);
       }
       tD.compact();
       return;
    }
    public final void Z(ByteBuffer p0){
       long l = (Long.rotateLeft((p0.getLong() * 0x87c37b91114253d5), 31) * 0x4cf5ad432745937f) ^ this.G;
       this.G = l;
       ke4 tH = this.H;
       this.G = ((Long.rotateLeft(l, 27) + tH) * 5) + 0x52dce729;
       l = (Long.rotateLeft((p0.getLong() * 0x4cf5ad432745937f), 33) * 0x87c37b91114253d5) ^ tH;
       this.H = l;
       this.H = ((Long.rotateLeft(l, 31) + this.G) * 5) + 0x38495ab5;
       this.I = this.I + 16;
    }
}
