package p.ci3;
import java.io.InputStream;
import p.fi3;
import p.rx0;
import p.io2;
import java.lang.Math;
import java.lang.IndexOutOfBoundsException;

public final class ci3 extends InputStream	// class@00019c from classes2.dex
{
    public final fi3 a;

    public void ci3(InputStream p0){
       super();
       this.a = new fi3(new rx0(p0));
    }
    public final int available(){
       return this.a.available();
    }
    public final void close(){
       this.a.close();
    }
    public final int read(){
       return this.a.read();
    }
    public final int read(byte[] p0,int p1,int p2){
       return this.a.read(p0, p1, p2);
    }
    public final long skip(long p0){
       ci3 ta;
       int i;
       int i1;
       long l = p0;
       while (true) {
          ta = this.a;
          if ((l) > 0) {
             l = ta.skip(l);
             if (!(l)) {
                break ;
             }else {
                l = l - l;
             }
          }else {
             break ;
          }
       }
       while ((l) > 0) {
          byte[] v = io2.v;
          if ((i = (int)Math.min(l, 4096)) < 0 || (i1 = i + 0) > 4096) {
             throw new IndexOutOfBoundsException();
          }
          i1 = 0;
          int i2 = 0;
          while (i2 != i) {
             int i3 = i1 + i2;
             int i4 = i - i2;
             if ((i3 = ta.read(v, i3, i4)) == -1) {
                break ;
             }else {
                i2 = i2 + i3;
             }
          }
          if (i2 < 1) {
          }else {
             l = l - (long)i2;
          }
       }
       return (p0 - l);
    }
}
