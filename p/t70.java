package p.t70;
import java.io.OutputStream;
import p.b17;
import java.util.LinkedList;
import java.lang.Math;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.System;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.lang.RuntimeException;
import java.lang.StringBuilder;

public final class t70 extends OutputStream	// class@002711 from classes.dex
{
    public final LinkedList a;
    public int b;
    public byte[] c;
    public int t;
    public static final byte[] v;

    static {
       byte[] uobyteArray = new byte[0];
       t70.v = uobyteArray;
    }
    public void t70(b17 p0){
       super(p0, 500);
    }
    public void t70(b17 p0,int p1){
       super();
       this.a = new LinkedList();
       if (p1 > 0x20000) {
          p1 = 0x20000;
       }
       byte[] uobyteArray = (p0 == null)? new byte[p1]: p0.e(2);
       this.c = uobyteArray;
       return;
    }
    public final void b(){
       int i;
       if ((i = this.b + this.c.length) < 0) {
          throw new IllegalStateException("Maximum Java array size \(2GB\) exceeded by `ByteArrayBuilder`");
       }
       this.b = i;
       if ((i = Math.max((i >> 1), 1000)) > 0x20000) {
          i = 0x20000;
       }
       this.a.add(this.c);
       byte[] uobyteArray = new byte[i];
       this.c = uobyteArray;
       this.t = 0;
       return;
    }
    public final void close(){
    }
    public final void f(int p0){
       if (this.t >= this.c.length) {
          this.b();
       }
       t70 tt = this.t;
       this.t = tt + 1;
       this.c[tt] = (byte)p0;
       return;
    }
    public final void flush(){
    }
    public final void write(int p0){
       this.f(p0);
    }
    public final void write(byte[] p0){
       this.write(p0, 0, p0.length);
    }
    public final void write(byte[] p0,int p1,int p2){
       while (true) {
          int i = this.c.length - this.t;
          if ((i = Math.min(i, p2)) > 0) {
             System.arraycopy(p0, p1, this.c, this.t, i);
             p1 = p1 + i;
             int i1 = this.t + i;
             this.t = i1;
             p2 = p2 - i;
             break ;
          }else if(p2 <= 0){
             return;
          }else {
             this.b();
          }
       }
    }
    public final void x(){
       this.b = 0;
       this.t = 0;
       t70 ta = this.a;
       if (!ta.isEmpty()) {
          ta.clear();
       }
       return;
    }
    public final byte[] y(){
       int i;
       int len;
       if (!(i = this.b + this.t)) {
          return t70.v;
       }
       byte[] uobyteArray = new byte[i];
       t70 ta = this.a;
       Iterator iterator = ta.iterator();
       int i1 = 0;
       while (iterator.hasNext()) {
          byte[] uobyteArray1 = iterator.next();
          len = uobyteArray1.length;
          System.arraycopy(uobyteArray1, 0, uobyteArray, i1, len);
          i1 = i1 + len;
       }
       System.arraycopy(this.c, 0, uobyteArray, i1, this.t);
       if ((i1 = i1 + this.t) != i) {
          throw new RuntimeException("Internal error: total len assumed to be "+i+", copied "+i1+" bytes");
       }
       if (!ta.isEmpty()) {
          this.x();
       }
       return uobyteArray;
    }
}
