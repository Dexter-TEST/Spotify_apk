package p.sh0;
import java.lang.Object;
import p.ph0;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import java.io.InputStream;
import p.cc3;
import p.qh0;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import p.gd7;
import p.rh0;
import p.rc3;
import p.h80;
import java.lang.String;

public abstract class sh0	// class@002628 from classes.dex
{
    public int a;
    public final int b;
    public final int c;
    public zh2 d;

    public void sh0(){
       super();
       this.b = 100;
       this.c = Integer.MAX_VALUE;
    }
    public static int b(int p0){
       return ((- (p0 & 0x01)) ^ (p0 >> 1));
    }
    public static long c(long p0){
       return ((- (p0 & 1)) ^ (p0 >> 1));
    }
    public static ph0 f(byte[] p0,int p1,int p2,boolean p3){
       try{
          ph0 oph0 = new ph0(p0, p1, p2, p3);
          oph0.j(p2);
          return oph0;
       }catch(p.rc3 e1){
          throw new IllegalArgumentException(e1);
       }
    }
    public static sh0 g(InputStream p0){
       ph0 oph0;
       if (p0 == null) {
          byte[] b = cc3.b;
          oph0 = sh0.f(b, 0, b.length, 0);
       }else {
          oph0 = new qh0(p0);
       }
       return oph0;
    }
    public static sh0 h(ByteBuffer p0,boolean p1){
       if (p0.hasArray()) {
          return sh0.f(p0.array(), (p0.position() + p0.arrayOffset()), p0.remaining(), p1);
       }
       if (p0.isDirect() && gd7.d) {
          return new rh0(p0, p1);
       }
       int i = p0.remaining();
       byte[] uobyteArray = new byte[i];
       p0.duplicate().get(uobyteArray);
       return sh0.f(uobyteArray, 0, i, true);
    }
    public static int t(int p0,InputStream p1){
       int i2;
       if (!((p0 & 0x0080))) {
          return p0;
       }
       p0 = p0 & 0x7f;
       int i = 7;
       while (true) {
          int i1 = -1;
          if (i < 32) {
             if ((i2 = p1.read()) == i1) {
                throw rc3.g();
             }
             i1 = i2 & 0x7f;
             i1 = i1 << i;
             p0 = p0 | i1;
             if (!(i2 = i2 & 0x0080)) {
                break ;
             }else {
                i = i + 7;
             }
          }else {
             while (true) {
                if (i >= 64) {
                   throw rc3.d();
                }
                if ((i2 = p1.read()) == i1) {
                   throw rc3.g();
                }
                if (!(i2 = i2 & 0x0080)) {
                   return p0;
                }
                i = i + 7;
             }
          }
       }
       return p0;
    }
    public abstract int A();
    public abstract int B();
    public abstract long C();
    public abstract boolean D(int p0);
    public abstract void a(int p0);
    public abstract int d();
    public abstract boolean e();
    public abstract void i(int p0);
    public abstract int j(int p0);
    public abstract boolean k();
    public abstract h80 l();
    public abstract double m();
    public abstract int n();
    public abstract int o();
    public abstract long p();
    public abstract float q();
    public abstract int r();
    public abstract long s();
    public abstract int u();
    public abstract long v();
    public abstract int w();
    public abstract long x();
    public abstract String y();
    public abstract String z();
}
