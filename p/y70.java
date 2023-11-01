package p.y70;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.g70;
import p.e70;
import java.lang.Math;
import java.nio.Buffer;
import p.hp5;
import java.io.IOException;
import java.lang.String;
import p.nn6;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;

public final class y70 extends InputStream	// class@002d5f from classes.dex
{
    public final int a;
    public final Object b;

    public void y70(ByteBuffer p0){
       this.a = 0;
       super();
       this.b = p0;
    }
    public void y70(g70 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final int available(){
       long l;
       int i = Integer.MAX_VALUE;
       y70 tb = this.b;
       switch (this.a){
           case 0:
             return tb.remaining();
           case 1:
             l = Math.min(tb.b, (long)i);
          label_0014 :
             return (int)l;
             break;
           default:
             if (tb.c != null) {
                throw new IOException("closed");
             }
             l = Math.min(tb.b.b, (long)i);
             goto label_0014 ;
       }
    }
    public final void close(){
       switch (this.a){
           case 1:
           case 2:
             this.b.close();
             break;
           default:
             super.close();
             return;
       }
       return;
    }
    public final int read(){
       int i = 0;
       int i1 = -1;
       y70 tb = this.b;
       switch (this.a){
           case 0:
             if (tb.hasRemaining()) {
                i1 = tb.get() & 0x00ff;
             }
             break;
           case 1:
             if ((tb.b - i) > 0) {
                i1 = tb.readByte() & 0x00ff;
             }
             return i1;
             break;
           default:
             if (tb.c != null) {
                throw new IOException("closed");
             }
             hp5 b = tb.b;
             if ((b.b - i) || (tb.a.o(b, 8192) - -1)) {
                i1 = b.readByte() & 0x00ff;
             }
             return i1;
       }
       return i1;
    }
    public final int read(byte[] p0,int p1,int p2){
       int i = -1;
       y70 tb = this.b;
       switch (this.a){
           case 0:
             if (tb.hasRemaining()) {
                i = Math.min(p2, tb.remaining());
                tb.get(p0, p1, i);
             }
             return i;
             break;
           case 1:
           default:
             co5.o(p0, "data");
             if (tb.c != null) {
                throw new IOException("closed");
             }
             co5.p((long)p0.length, (long)p1, (long)p2);
             hp5 b = tb.b;
             if ((b.b) || (tb.a.o(b, 8192) - -1)) {
                i = b.read(p0, p1, p2);
             }
             return i;
       }
       co5.o(p0, "sink");
       return tb.read(p0, p1, p2);
    }
    public final String toString(){
       y70 tb = this.b;
       switch (this.a){
           case 1:
             return tb+".inputStream\(\)";
           case 2:
             return tb+".inputStream\(\)";
           default:
             return super.toString();
       }
    }
}
