package p.i80;
import java.lang.Iterable;
import java.io.Serializable;
import p.h80;
import p.cc3;
import p.fc;
import p.e80;
import java.lang.Object;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;
import java.lang.String;
import p.tp2;
import java.util.Arrays;
import java.lang.System;
import java.nio.charset.Charset;
import p.sh0;
import p.xe7;
import java.util.Locale;
import java.lang.Integer;
import p.xj0;

public abstract class i80 implements Iterable, Serializable	// class@001940 from classes.dex
{
    public int a;
    public static final h80 b;
    public static final e80 c;

    static {
       i80.b = new h80(cc3.b);
       e80 uoe80 = (fc.a())? new e80(1, 0): new e80(0, 0);
       i80.c = uoe80;
    }
    public void i80(){
       super();
       this.a = 0;
    }
    public static int b(int p0,int p1,int p2){
       int i = p1 - p0;
       if (((((p0 | p1) | i) | (p2 - p1))) >= 0) {
          return i;
       }
       if (p0 < 0) {
          throw new IndexOutOfBoundsException(tp2.l("Beginning index: ", p0, " < 0"));
       }
       if (p1 < p0) {
          throw new IndexOutOfBoundsException("Beginning index larger than ending index: "+p0+", "+p1);
       }
       throw new IndexOutOfBoundsException("End index: "+p1+" >= "+p2);
    }
    public static h80 c(byte[] p0,int p1,int p2){
       int i = p1 + p2;
       i80.b(p1, i, p0.length);
       switch (i80.c.a){
           case 0:
             p0 = Arrays.copyOfRange(p0, p1, i);
             break;
           default:
             byte[] uobyteArray = new byte[p2];
             System.arraycopy(p0, p1, uobyteArray, 0, p2);
             p0 = uobyteArray;
       }
       return new h80(p0);
    }
    public static h80 d(String p0){
       return new h80(p0.getBytes(cc3.a));
    }
    public abstract byte a(int p0);
    public abstract boolean equals(Object p0);
    public abstract void g(int p0,byte[] p1);
    public final int hashCode(){
       i80 ta;
       if ((ta = this.a) == null) {
          if (!(ta = this.n(this.size(), this.size()))) {
             ta = 1;
          }
          this.a = ta;
       }
       return ta;
    }
    public abstract byte k(int p0);
    public abstract boolean l();
    public abstract sh0 m();
    public abstract int n(int p0,int p1);
    public abstract i80 o(int p0);
    public final byte[] p(){
       int i;
       if (!(i = this.size())) {
          return cc3.b;
       }
       byte[] uobyteArray = new byte[i];
       this.g(i, uobyteArray);
       return uobyteArray;
    }
    public abstract String q(Charset p0);
    public final String r(){
       Charset a = cc3.a;
       String str = (!this.size())? "": this.q(a);
       return str;
    }
    public abstract void s(xe7 p0);
    public abstract int size();
    public final String toString(){
       Locale rOOT = Locale.ROOT;
       Object[] objArray = new Object[3];
       objArray[0] = Integer.toHexString(System.identityHashCode(this));
       objArray[1] = Integer.valueOf(this.size());
       String str = (this.size() <= 50)? xj0.f0(this): xj0.f0(this.o(47))+"...";
       objArray[2] = str;
       return String.format(rOOT, "<ByteString@%s size=%d contents=\"%s\">", objArray);
    }
}
