package p.vh0;
import p.xe7;
import java.lang.String;
import java.lang.Class;
import java.util.logging.Logger;
import p.gd7;
import java.lang.CharSequence;
import p.se7;
import p.cc3;
import java.nio.charset.Charset;
import p.i80;
import p.s74;
import p.w36;
import com.google.protobuf.a;
import p.re7;
import java.util.logging.Level;
import java.lang.Throwable;
import p.mf3;
import java.lang.IndexOutOfBoundsException;

public abstract class vh0 extends xe7	// class@0029f2 from classes.dex
{
    public vf F;
    public static final Logger G;
    public static final boolean H;

    static {
       vh0.G = Logger.getLogger(vh0.class.getName());
       vh0.H = gd7.e;
    }
    public void vh0(){
       super();
    }
    public static int A0(int p0,int p1){
       return (vh0.G0(((p1 >> 31) ^ (p1 << 1))) + vh0.E0(p0));
    }
    public static int B0(int p0,long p1){
       return (vh0.I0(((p1 >> 63) ^ (p1 << 1))) + vh0.E0(p0));
    }
    public static int C0(int p0,String p1){
       return (vh0.D0(p1) + vh0.E0(p0));
    }
    public static int D0(String p0){
       int i;
       try{
          i = se7.b(p0);
       }catch(p.re7 e0){
          i = i.getBytes(cc3.a).length;
       }
       return (vh0.G0(i) + i);
    }
    public static int E0(int p0){
       return vh0.G0(((p0 << 3) | 0x00));
    }
    public static int F0(int p0,int p1){
       return (vh0.G0(p1) + vh0.E0(p0));
    }
    public static int G0(int p0){
       if (!((p0 & 0x80))) {
          return 1;
       }
       if (!((p0 & 0xc000))) {
          return 2;
       }
       if (!((0xffe00000 & p0))) {
          return 3;
       }
       if (!((p0 & 0xf0000000))) {
          return 4;
       }
       return 5;
    }
    public static int H0(int p0,long p1){
       return (vh0.I0(p1) + vh0.E0(p0));
    }
    public static int I0(long p0){
       int i;
       if (!((-128 & p0))) {
          return 1;
       }
       if ((p0) < 0) {
          return 10;
       }
       if ((0xfffffff800000000 & p0)) {
          p0 = p0 >> 28;
          i = 6;
       }else {
          i = 2;
       }
       if ((-2097152 & p0)) {
          i = i + 2;
          p0 = p0 >> 14;
       }
       if ((p0 & -16384)) {
          i = i + 1;
       }
       return i;
    }
    public static int n0(int p0){
       return (vh0.E0(p0) + 1);
    }
    public static int o0(int p0,i80 p1){
       int i = p1.size();
       return ((vh0.G0(i) + i) + vh0.E0(p0));
    }
    public static int p0(int p0){
       return (vh0.E0(p0) + 8);
    }
    public static int q0(int p0,int p1){
       return (vh0.w0(p1) + vh0.E0(p0));
    }
    public static int r0(int p0){
       return (vh0.E0(p0) + 4);
    }
    public static int s0(int p0){
       return (vh0.E0(p0) + 8);
    }
    public static int t0(int p0){
       return (vh0.E0(p0) + 4);
    }
    public static int u0(int p0,s74 p1,w36 p2){
       return (p1.getSerializedSize(p2) + (vh0.E0(p0) * 2));
    }
    public static int v0(int p0,int p1){
       return (vh0.w0(p1) + vh0.E0(p0));
    }
    public static int w0(int p0){
       if (p0 >= 0) {
          return vh0.G0(p0);
       }
       return 10;
    }
    public static int x0(int p0,long p1){
       return (vh0.I0(p1) + vh0.E0(p0));
    }
    public static int y0(int p0){
       return (vh0.E0(p0) + 4);
    }
    public static int z0(int p0){
       return (vh0.E0(p0) + 8);
    }
    public final void J0(String p0,re7 p1){
       vh0.G.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", p1);
       byte[] bytes = p0.getBytes(cc3.a);
       try{
          this.c1(bytes.length);
          this.l0(bytes, 0, bytes.length);
          return;
       }catch(java.lang.IndexOutOfBoundsException e4){
          throw new mf3(e4);
       }
    }
    public abstract int K0();
    public abstract void L0(byte p0);
    public abstract void M0(int p0,boolean p1);
    public abstract void N0(byte[] p0,int p1);
    public abstract void O0(int p0,i80 p1);
    public abstract void P0(i80 p0);
    public abstract void Q0(int p0,int p1);
    public abstract void R0(int p0);
    public abstract void S0(int p0,long p1);
    public abstract void T0(long p0);
    public abstract void U0(int p0,int p1);
    public abstract void V0(int p0);
    public abstract void W0(int p0,s74 p1,w36 p2);
    public abstract void X0(s74 p0);
    public abstract void Y0(int p0,String p1);
    public abstract void Z0(String p0);
    public abstract void a1(int p0,int p1);
    public abstract void b1(int p0,int p1);
    public abstract void c1(int p0);
    public abstract void d1(int p0,long p1);
    public abstract void e1(long p0);
}
