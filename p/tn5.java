package p.tn5;
import java.io.Closeable;
import java.lang.String;
import java.lang.Class;
import java.util.logging.Logger;
import java.io.File;
import java.lang.Object;
import java.lang.StringBuilder;
import java.io.RandomAccessFile;
import java.io.IOException;
import p.qn5;
import java.lang.IndexOutOfBoundsException;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import p.ze;
import p.sn5;
import java.util.logging.Level;
import java.lang.Throwable;
import java.nio.channels.WritableByteChannel;
import java.lang.AssertionError;
import p.rn5;

public final class tn5 implements Closeable	// class@0027a7 from classes.dex
{
    public final RandomAccessFile a;
    public int b;
    public int c;
    public qn5 t;
    public qn5 v;
    public final byte[] w;
    public static final Logger x;

    static {
       tn5.x = Logger.getLogger(tn5.class.getName());
    }
    public void tn5(File p0){
       tn5 otn5 = this;
       File uFile = p0;
       super();
       int i = 16;
       byte[] uobyteArray = new byte[i];
       otn5.w = uobyteArray;
       int i1 = 4;
       if (!p0.exists()) {
          File uFile1 = new File(p0.getPath()+".tmp");
          RandomAccessFile randomAccess = new RandomAccessFile(uFile1, "rwd");
          randomAccess.setLength(4096);
          randomAccess.seek(0);
          byte[] uobyteArray1 = new byte[i];
          int[] ointArray = new int[i1];
          ointArray[0] = 4096;
          ointArray[1] = 0;
          ointArray[2] = 0;
          ointArray[3] = 0;
          int i2 = 0;
          int i3 = 0;
          while (i2 < i1) {
             int i4 = ointArray[i2];
             int i5 = i4 >> 24;
             uobyteArray1[i3] = (byte)i5;
             i5 = i3 + 1;
             i1 = i4 >> 16;
             uobyteArray1[i5] = (byte)i1;
             i1 = i3 + 2;
             i5 = i4 >> 8;
             uobyteArray1[i1] = (byte)i5;
             i1 = i3 + 3;
             uobyteArray1[i1] = (byte)i4;
             i3 = i3 + 4;
             i2 = i2 + 1;
             i1 = 4;
          }
          randomAccess.write(uobyteArray1);
          randomAccess.close();
          if (!uFile1.renameTo(uFile)) {
             throw new IOException("Rename failed!");
          }
       }
       RandomAccessFile randomAccess1 = new RandomAccessFile(uFile, "rwd");
       otn5.a = randomAccess1;
       randomAccess1.seek(0);
       randomAccess1.readFully(uobyteArray);
       int i6 = tn5.g0(uobyteArray, 0);
       otn5.b = i6;
       if (((long)i6 - randomAccess1.length()) <= 0) {
          otn5.c = tn5.g0(uobyteArray, 4);
          otn5.t = otn5.T(tn5.g0(uobyteArray, 8));
          otn5.v = otn5.T(tn5.g0(uobyteArray, 12));
          return;
       }else {
          throw new IOException("File is truncated. Expected length: "+otn5.b+", Actual length: "+randomAccess1.length());
       }
    }
    public static int g0(byte[] p0,int p1){
       return (((((p0[p1] & 0x00ff) << 24) + ((p0[(p1 + 1)] & 0x00ff) << 16)) + ((p0[(p1 + 2)] & 0x00ff) << 8)) + (p0[(p1 + 3)] & 0x00ff));
    }
    public synchronized final boolean J(){
       boolean b = (this.c == null)? true: false;
       return b;
    }
    public final qn5 T(int p0){
       if (!p0) {
          return qn5.c;
       }
       tn5 ta = this.a;
       ta.seek((long)p0);
       return new qn5(p0, ta.readInt());
    }
    public final void b(byte[] p0){
       boolean b;
       int i1;
       int len = p0.length;
       _monitor_enter(this);
       if (((len | 0x00)) >= 0) {
          int i = 0;
          if (len <= (p0.length - i)) {
             this.x(len);
             if (b = this.J()) {
                i1 = 16;
             }else {
                tn5 tv = this.v;
                i1 = this.l0(((tv.a + 4) + tv.b));
             }
             qn5 oqn5 = new qn5(i1, len);
             tn5 tw = this.w;
             tw[i] = (byte)(len >> 24);
             tw[1] = (byte)(len >> 16);
             tw[2] = (byte)(len >> 8);
             tw[3] = (byte)len;
             this.j0(i1, 4, tw);
             this.j0((i1 + 4), len, p0);
             int i2 = (b)? i1: this.t.a;
             this.m0(this.b, (this.c + 1), i2, i1);
             this.v = oqn5;
             this.c = this.c + 1;
             if (b) {
                this.t = oqn5;
             }
             _monitor_exit(this);
             return;
          }
       }
       throw new IndexOutOfBoundsException();
    }
    public synchronized final void close(){
       this.a.close();
    }
    public synchronized final void f(){
       this.m0(4096, 0, 0, 0);
       this.c = 0;
       qn5 c = qn5.c;
       this.t = c;
       this.v = c;
       if (this.b > 4096) {
          tn5 ta = this.a;
          ta.setLength((long)4096);
          ta.getChannel().force(true);
       }
       this.b = 4096;
       return;
    }
    public synchronized final void h0(){
       if (this.J()) {
          throw new NoSuchElementException();
       }
       int i = 1;
       if (this.c == i) {
          this.f();
       }else {
          tn5 tt = this.t;
          int i1 = this.l0(((tt.a + 4) + tt.b));
          this.i0(i1, 0, 4, this.w);
          this.m0(this.b, (this.c - i), i1, this.v.a);
          this.c = this.c - i;
          this.t = new qn5(i1, tn5.g0(this.w, 0));
       }
       return;
    }
    public final void i0(int p0,int p1,int p2,byte[] p3){
       p0 = this.l0(p0);
       tn5 tb = this.b;
       tn5 ta = this.a;
       if (((p0 + p2)) <= tb) {
          ta.seek((long)p0);
          ta.readFully(p3, p1, p2);
       }else {
          int i = tb - p0;
          ta.seek((long)p0);
          ta.readFully(p3, p1, i);
          ta.seek(16);
          ta.readFully(p3, (p1 + i), (p2 - i));
       }
       return;
    }
    public final void j0(int p0,int p1,byte[] p2){
       p0 = this.l0(p0);
       tn5 tb = this.b;
       tn5 ta = this.a;
       int i = 0;
       if (((p0 + p1)) <= tb) {
          ta.seek((long)p0);
          ta.write(p2, i, p1);
       }else {
          int i1 = tb - p0;
          ta.seek((long)p0);
          ta.write(p2, i, i1);
          ta.seek(16);
          ta.write(p2, (i + i1), (p1 - i1));
       }
       return;
    }
    public final int k0(){
       if (this.c == null) {
          return 16;
       }
       tn5 tv = this.v;
       qn5 a = tv.a;
       qn5 a1 = this.t.a;
       if (a >= a1) {
          return ((((a - a1) + 4) + tv.b) + 16);
       }
       return ((((a + 4) + tv.b) + this.b) - a1);
    }
    public final int l0(int p0){
       tn5 tb = this.b;
       if (p0 < tb) {
       }else {
          p0 = (p0 + 16) - tb;
       }
       return p0;
    }
    public final void m0(int p0,int p1,int p2,int p3){
       tn5 tw;
       int[] ointArray = new int[]{p0,p1,p2,p3};
       int i = 0;
       p0 = 0;
       while (true) {
          tw = this.w;
          if (i < 4) {
             p2 = ointArray[i];
             p3 = p2 >> 24;
             tw[p0] = (byte)p3;
             p3 = p0 + 1;
             int i1 = p2 >> 16;
             tw[p3] = (byte)i1;
             p3 = p0 + 2;
             i1 = p2 >> 8;
             tw[p3] = (byte)i1;
             p3 = p0 + 3;
             tw[p3] = (byte)p2;
             p0 = p0 + 4;
             i = i + 1;
          }else {
             break ;
          }
       }
       tn5 ta = this.a;
       ta.seek(0);
       ta.write(tw);
       return;
    }
    public final String toString(){
       StringBuilder str = tn5.class.getSimpleName()+"[fileLength="+this.b+", size="+this.c+", first="+this.t+", last="+this.v;
       String str1 = ", element lengths=[";
       try{
          str+str1;
          this.y(new ze(this, str));
       }catch(java.io.IOException e1){
          tn5.x.log(Level.WARNING, "read error", e1);
       }
       return str+"]]";
    }
    public final void x(int p0){
       int i;
       int i1;
       int i2;
       p0 = p0 + 4;
       if ((i = this.b - this.k0()) >= p0) {
          return;
       }
       tn5 tb = this.b;
       do {
          i = i + tb;
          i1 = 1;
          i2 = tb << i1;
       } while (i >= p0);
       tn5 ta = this.a;
       ta.setLength((long)i2);
       ta.getChannel().force(i1);
       tn5 tv = this.v;
       if ((i = this.l0(((tv.a + 4) + tv.b))) < this.t.a) {
          FileChannel channel = ta.getChannel();
          channel.position((long)this.b);
          long l = (long)(i - 4);
          if (channel.transferTo(16, l, channel) - l) {
             throw new AssertionError("Copied insufficient number of bytes!");
          }
       }
       qn5 a = this.v.a;
       qn5 a1 = this.t.a;
       if (a < a1) {
          i1 = (this.b + a) - 16;
          this.m0(i2, this.c, a1, i1);
          this.v = new qn5(i1, this.v.b);
       }else {
          this.m0(i2, this.c, a1, a);
       }
       this.b = i2;
       return;
    }
    public synchronized final void y(sn5 p0){
       qn5 a = this.t.a;
       for (int i = 0; i < this.c; i = i + 1) {
          a = this.T(a);
          p0.a(a.b, new rn5(this, a));
          int i1 = a.a + 4;
          i1 = i1 + a.b;
          this.l0(i1);
       }
       return;
    }
}
