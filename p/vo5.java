package p.vo5;
import p.in2;
import java.util.LinkedList;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.nio.Buffer;
import java.lang.Object;
import p.uo5;
import java.lang.String;
import p.do5;
import p.ox7;
import java.lang.Class;

public final class vo5 extends in2	// class@002a36 from classes.dex
{
    public short a;
    public short b;
    public final LinkedList c;
    public int d;
    public int e;
    public short f;

    public void vo5(){
       super();
       this.c = new LinkedList();
    }
    public final ByteBuffer a(){
       vo5 ta = this.a;
       int i = 1;
       int i1 = (ta == i)? 13: (ta * 6) + 11;
       ByteBuffer uByteBuffer = ByteBuffer.allocate(i1);
       uByteBuffer.putShort(this.a);
       if (this.a == i) {
          uByteBuffer.putShort(this.b);
       }else {
          Iterator iterator = this.c.iterator();
          while (iterator.hasNext()) {
             uo5 ouo5 = iterator.next();
             uByteBuffer.putInt(ouo5.a);
             uByteBuffer.putShort(ouo5.b);
          }
       }
       uByteBuffer.putInt(this.d);
       uByteBuffer.putInt(this.e);
       uByteBuffer.put((byte)(this.f & 0x00ff));
       uByteBuffer.rewind();
       return uByteBuffer;
    }
    public final String b(){
       return "rash";
    }
    public final void c(ByteBuffer p0){
       byte b;
       short shortx = p0.getShort();
       this.a = shortx;
       if (shortx == 1) {
          this.b = p0.getShort();
       }else {
          while (true) {
             int i = shortx - 1;
             if (shortx > 0) {
                this.c.add(new uo5(ox7.z(do5.k0(p0)), p0.getShort()));
                shortx = i;
             }
          }
       }
       this.d = ox7.z(do5.k0(p0));
       this.e = ox7.z(do5.k0(p0));
       if ((b = p0.get()) < 0) {
          b = b + 256;
       }
       this.f = (short)b;
       return;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || vo5.class != p0.getClass()) {
          return false;
       }
       if (this.f != p0.f) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (this.e != p0.e) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       vo5 tc = this.c;
       p0 = p0.c;
       if (tc != null) {
          if (!tc.equals(p0)) {
          label_0044 :
             return false;
          }
       }else if(p0 != null){
          goto label_0044 ;
       }
       return true;
    }
    public final int hashCode(){
       vo5 tc;
       int i = ((this.a * 31) + this.b) * 31;
       int i1 = ((tc = this.c) != null)? tc.hashCode(): 0;
       return (((((((i + i1) * 31) + this.d) * 31) + this.e) * 31) + this.f);
    }
}
