package p.kx7;
import java.io.FilterInputStream;
import java.io.InputStream;
import p.ez7;
import p.ix7;
import java.util.Arrays;
import p.dy7;
import java.lang.String;
import java.lang.Math;

public final class kx7 extends FilterInputStream	// class@001ca2 from classes.dex
{
    public final ez7 a;
    public byte[] b;
    public long c;
    public boolean t;
    public boolean v;

    public void kx7(InputStream p0){
       super(p0);
       this.a = new ez7();
       byte[] uobyteArray = new byte[4096];
       this.b = uobyteArray;
       this.t = false;
       this.v = false;
    }
    public final ix7 b(){
       kx7 tb;
       if ((this.c) > 0) {
          do {
          } while ((tb = this.b) == -1);
       }
       if (this.t == null && this.v == null) {
          boolean b = true;
          kx7 ta = this.a;
          if (!this.f(30)) {
             this.t = b;
             return ta.b();
          }else {
             ix7 oix7 = ta.b();
             if (oix7.e != null) {
                this.v = b;
                return oix7;
             }else if(oix7.b - 0xffffffff){
                int i = ta.f - 30;
                long l = (long)i;
                int len = this.b.length;
                if ((l - (long)len) > 0) {
                   do {
                      len = len + len;
                   } while (((long)len - l) >= 0);
                   this.b = Arrays.copyOf(this.b, len);
                }
                if (!this.f(i)) {
                   this.t = b;
                   return ta.b();
                }else {
                   oix7 = ta.b();
                   this.c = oix7.b;
                   return oix7;
                }
             }else {
                throw new dy7("Files bigger than 4GiB are not supported.");
             }
          }
       }else {
          ix7 tb1 = new ix7(null, -1, -1, false, false, null);
          return tb;
       }
    }
    public final boolean f(int p0){
       int i = Math.max(0, super.read(this.b, 0, p0));
       kx7 ta = this.a;
       if (i != p0) {
          int i1 = p0 - i;
          if (Math.max(0, super.read(this.b, i, i1)) != i1) {
             ta.a(this.b, 0, i);
             return 0;
          }
       }
       ta.a(this.b, 0, p0);
       return true;
    }
    public final int read(byte[] p0){
       return this.read(p0, 0, p0.length);
    }
    public final int read(byte[] p0,int p1,int p2){
       kx7 tc = this.c;
       if ((tc) <= 0 || this.t != null) {
          return -1;
       }
       p1 = 0;
       int i = Math.max(p1, super.read(p0, p1, (int)Math.min(tc, (long)p2)));
       this.c = this.c - (long)i;
       if (!i) {
          this.t = true;
       }else {
          p1 = i;
       }
       return p1;
    }
}
