package p.gy7;
import java.io.OutputStream;
import java.io.File;
import p.sz7;
import p.ez7;
import p.ix7;
import java.io.FileOutputStream;
import java.lang.String;
import java.io.RandomAccessFile;
import java.lang.Math;

public final class gy7 extends OutputStream	// class@0017a6 from classes.dex
{
    public final ez7 a;
    public final File b;
    public final sz7 c;
    public long t;
    public long v;
    public FileOutputStream w;
    public ix7 x;

    public void gy7(File p0,sz7 p1){
       super();
       this.a = new ez7();
       this.b = p0;
       this.c = p1;
    }
    public final void write(int p0){
       byte[] uobyteArray = new byte[]{(byte)p0};
       this.write(uobyteArray, 0, 1);
    }
    public final void write(byte[] p0){
       this.write(p0, 0, p0.length);
    }
    public final void write(byte[] p0,int p1,int p2){
       gy7 ta;
       int i2;
       ix7 oix7;
       int i3;
       FileOutputStream uFileOutputS;
       long l1;
       while (true) {
          if (p2 <= 0) {
             return;
          }
          String str = "/";
          gy7 tc = this.c;
          int i = 1;
          int i1 = 0;
          if (!(this.t) && !(this.v)) {
             ta = this.a;
             if ((i2 = ta.a(p0, p1, p2)) == -1) {
                break ;
             }else {
                p1 = p1 + i2;
                p2 = p2 - i2;
                oix7 = ta.b();
                this.x = oix7;
                if (oix7.e != null) {
                   this.t = 0;
                   oix7 = oix7.f;
                   i3 = tc.g + i;
                   tc.g = i3;
                   uFileOutputS = new FileOutputStream(tc.c());
                   uFileOutputS.write(oix7, i1, oix7.length);
                   uFileOutputS.close();
                   this.v = (long)this.x.f.length;
                }else if(oix7.c == null){
                   i2 = 1;
                }else {
                   i2 = 0;
                }
                if (i2) {
                   boolean b = ((oix7 = oix7.a) == null)? 0: oix7.endsWith(str);
                   if (!b) {
                      tc.h(this.x.f);
                      File uFile = new File(this.b, this.x.a);
                      uFile.getParentFile().mkdirs();
                      this.t = this.x.b;
                      this.w = new FileOutputStream(uFile);
                   }
                }
                oix7 = this.x.f;
                i3 = tc.g + i;
                tc.g = i3;
                uFileOutputS = new FileOutputStream(tc.c());
                uFileOutputS.write(oix7, i1, oix7.length);
                uFileOutputS.close();
                this.t = this.x.b;
             }
          }
          oix7 = ((oix7 = this.x.a) == null)? 0: oix7.endsWith(str);
          if (oix7) {
             continue ;
          }else {
             ta = this.x;
             str = "rw";
             if (ta.e != null) {
                RandomAccessFile randomAccess = new RandomAccessFile(tc.c(), str);
                randomAccess.seek(this.v);
                randomAccess.write(p0, p1, p2);
                randomAccess.close();
                long l = this.v + (long)p2;
                this.v = l;
                i2 = p2;
             }else if(ta.c == null){
                i = 0;
             }
             if (i) {
                i2 = (int)Math.min((long)p2, this.t);
                this.w.write(p0, p1, i2);
                l1 = this.t - (long)i2;
                this.t = l1;
                if (!(l1)) {
                   this.w.close();
                }
             }else {
                i2 = (int)Math.min((long)p2, this.t);
                ta = this.x;
                long l2 = (long)ta.f.length + ta.b;
                l2 = l2 - this.t;
                RandomAccessFile randomAccess1 = new RandomAccessFile(tc.c(), str);
                randomAccess1.seek(l2);
                randomAccess1.write(p0, p1, i2);
                randomAccess1.close();
                l1 = this.t - (long)i2;
                this.t = l1;
             }
             p1 = p1 + i2;
             p2 = p2 - i2;
          }
       }
       return;
    }
}
