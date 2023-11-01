package p.u1;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.lang.Math;

public final class u1 extends FilterInputStream	// class@002827 from classes.dex
{
    public int a;

    public void u1(int p0,InputStream p1){
       super(p1);
       this.a = p0;
    }
    public final int available(){
       return Math.min(super.available(), this.a);
    }
    public final int read(){
       int i;
       if (this.a <= null) {
          return -1;
       }
       if ((i = super.read()) >= 0) {
          this.a = this.a - 1;
       }
       return i;
    }
    public final int read(byte[] p0,int p1,int p2){
       u1 ta;
       int i;
       if ((ta = this.a) <= null) {
          return -1;
       }
       if ((i = super.read(p0, p1, Math.min(p2, ta))) >= 0) {
          this.a = this.a - i;
       }
       return i;
    }
    public final long skip(long p0){
       int i;
       if ((i = (int)super.skip(Math.min(p0, (long)this.a))) >= 0) {
          this.a = this.a - i;
       }
       return (long)i;
    }
}
