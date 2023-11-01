package p.h80;
import p.g80;
import java.lang.Class;
import java.lang.Object;
import p.i80;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;
import java.lang.System;
import p.se7;
import p.sh0;
import p.ph0;
import p.cc3;
import p.f80;
import java.nio.charset.Charset;
import p.xe7;

public class h80 extends g80	// class@0017fb from classes.dex
{
    public final byte[] t;

    public void h80(byte[] p0){
       super();
       p0.getClass();
       this.t = p0;
    }
    public byte a(int p0){
       return this.t[p0];
    }
    public final boolean equals(Object p0){
       int i;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       boolean b1 = false;
       if (!p0 instanceof i80) {
          return b1;
       }
       if (this.size() != p0.size()) {
          return b1;
       }
       if (!this.size()) {
          return b;
       }
       if (!p0 instanceof h80) {
          return p0.equals(this);
       }
       i80 ta = this.a;
       i80 a = p0.a;
       if (ta != null && (a != null && ta != a)) {
          return b1;
       }
       if ((i = this.size()) > p0.size()) {
          throw new IllegalArgumentException("Length too large: "+i+this.size());
       }
       if (((b1 + i)) > p0.size()) {
          throw new IllegalArgumentException(kg4.r("Ran off end of other: 0, ", i, ", ")+p0.size());
       }
       int i1 = this.t() + i;
       i = this.t();
       int i2 = p0.t() + b1;
       while (i < i1) {
          if (this.t[i] != p0.t[i2]) {
             b = false;
             break ;
          }else {
             i = i + 1;
             i2 = i2 + 1;
          }
       }
       return b;
    }
    public void g(int p0,byte[] p1){
       System.arraycopy(this.t, 0, p1, 0, p0);
    }
    public byte k(int p0){
       return this.t[p0];
    }
    public final boolean l(){
       int i = this.t();
       return se7.e(this.t, i, (this.size() + i));
    }
    public final sh0 m(){
       return sh0.f(this.t, this.t(), this.size(), true);
    }
    public final int n(int p0,int p1){
       int i = this.t() + 0;
       int i1 = i;
       while (true) {
          int i2 = i + p1;
          if (i1 < i2) {
             p0 = p0 * 31;
             p0 = p0 + this.t[i1];
             i1 = i1 + 1;
          }else {
             break ;
          }
       }
       return p0;
    }
    public final i80 o(int p0){
       int i = 0;
       if (!(p0 = i80.b(i, p0, this.size()))) {
          return i80.b;
       }
       return new f80(this.t, (this.t() + i), p0);
    }
    public final String q(Charset p0){
       return new String(this.t, this.t(), this.size(), p0);
    }
    public final void s(xe7 p0){
       p0.l0(this.t, this.t(), this.size());
    }
    public int size(){
       return this.t.length;
    }
    public int t(){
       return 0;
    }
}
