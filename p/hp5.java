package p.hp5;
import p.g70;
import p.nn6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.e70;
import java.lang.IllegalStateException;
import p.j80;
import java.lang.Math;
import p.f70;
import p.el6;
import p.zs7;
import java.io.EOFException;
import java.lang.StringBuilder;
import p.kg4;
import java.lang.IllegalArgumentException;
import p.t45;
import java.lang.NumberFormatException;
import p.vv7;
import java.lang.Integer;
import java.nio.charset.Charset;
import p.b57;
import p.y70;
import p.aa5;
import p.xe7;
import java.nio.ByteBuffer;

public final class hp5 implements g70	// class@00022d from classes2.dex
{
    public final nn6 a;
    public final e70 b;
    public boolean c;

    public void hp5(nn6 p0){
       co5.o(p0, "source");
       super();
       this.a = p0;
       this.b = new e70();
    }
    public final String B(){
       return this.O(Long.MAX_VALUE);
    }
    public final byte[] D(){
       hp5 tb = this.b;
       tb.A(this.a);
       return tb.D();
    }
    public final int E(){
       this.V(4);
       return this.b.E();
    }
    public final boolean F(){
       int i = 1;
       if (!((this.c ^ i))) {
          throw new IllegalStateException("closed".toString());
       }
       hp5 tb = this.b;
       if (!tb.F() || (this.a.o(tb, 8192) - -1)) {
          i = false;
       }
       return i;
    }
    public final long H(j80 p0){
       long l1;
       co5.o(p0, "bytes");
       if (!((this.c ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       long l = 0;
       while (true) {
          hp5 tb = this.b;
          l1 = tb.j0(l, p0);
          int i = -1;
          if (l1 - i) {
             break ;
          }else {
             e70 b = tb.b;
             if (!(this.a.o(tb, 8192) - i)) {
                l1 = i;
                break ;
             }else {
                l1 = b - (long)p0.d();
                l1 = l1 + 1;
                l = Math.max(l, l1);
             }
          }
       }
       return l1;
    }
    public final long L(f70 p0){
       hp5 tb;
       long l = 0;
       while (true) {
          tb = this.b;
          if (this.a.o(tb, 8192) - -1) {
             long l1 = tb.T();
             if ((l1) > 0) {
                l = l + l1;
                p0.I(tb, l1);
             }
          }else {
             break ;
          }
       }
       e70 b = tb.b;
       if ((b) > 0) {
          l = l + b;
          p0.I(tb, b);
       }
       return l;
    }
    public final long N(){
       this.V(8);
       return this.b.N();
    }
    public final String O(long p0){
       hp5 ohp5 = this;
       long l = p0;
       int i = ((l) >= 0)? 1: 0;
       if (i) {
          long l1 = 1;
          long l2 = (!(l - Long.MAX_VALUE))? Long.MAX_VALUE: l + l1;
          byte b = (byte)10;
          String long l3 = this.b(b, 0, l2);
          hp5 b1 = ohp5.b;
          if (l3 - -1) {
             l3 = zs7.b(b1, l3);
          }else if((l2 - Long.MAX_VALUE) < 0 && (ohp5.a(l2) && (b1.h0((l2 - l1)) == (byte)13 && (ohp5.a((l1 + l2)) && b1.h0(l2) == b)))){
             l3 = zs7.b(b1, l2);
          }else {
             e70 l31 = new e70();
             b1.g0(0, Math.min((long)32, b1.b), l31);
             throw new EOFException("\\n not found: limit="+Math.min(b1.b, l)+" content="+l31.m0().e()+8230);
          }
          return l3;
       }else {
          throw new IllegalArgumentException(kg4.k("limit < 0: ", l).toString());
       }
    }
    public final int U(t45 p0){
       int i;
       co5.o(p0, "options");
       if (!((this.c ^ 1))) {
          throw new IllegalStateException("closed".toString());
       }
       while (true) {
          hp5 tb = this.b;
          if ((i = zs7.c(tb, p0, 1)) != -2) {
             if (i != -1) {
                tb.skip((long)p0.a[i].d());
                break ;
             }
          }else {
             if (this.a.o(tb, 8192) - -1) {
                continue ;
             }
          }
          i = -1;
          break ;
       }
       return i;
    }
    public final void V(long p0){
       if (this.a(p0)) {
          return;
       }
       throw new EOFException();
    }
    public final boolean a(long p0){
       hp5 tb;
       boolean b = false;
       int i = ((p0) >= 0)? 1: 0;
       if (i) {
          if ((this.c ^ 0x01)) {
             do {
                tb = this.b;
                if ((tb.b - p0) < 0) {
                }else {
                   b = true;
                   break ;
                }
             } while (!(this.a.o(tb, 8192) - -1));
             return b;
          }else {
             throw new IllegalStateException("closed".toString());
          }
       }else {
          throw new IllegalArgumentException(kg4.k("byteCount < 0: ", p0).toString());
       }
    }
    public final long b(byte p0,long p1,long p2){
       int i = 1;
       if (!((this.c ^ i))) {
          throw new IllegalStateException("closed".toString());
       }
       long l = 0;
       if ((l - p2) > 0) {
          i = 0;
       }
       if (i) {
          while (true) {
             p1 = -1;
             if ((l - p2) < 0) {
                long l1 = this.b.i0(p0, l, p2);
                if (l1 - p1) {
                   p1 = l1;
                   break ;
                }else {
                   hp5 tb = this.b;
                   e70 b = tb.b;
                   if ((b - p2) < 0 && (this.a.o(tb, 8192) - p1)) {
                      l = Math.max(l, b);
                   }else {
                      break ;
                   }
                }
             }else {
                break ;
             }
          }
          return p1;
       }else {
          throw new IllegalArgumentException(kg4.k("fromIndex=0 toIndex=", p2).toString());
       }
    }
    public final long b0(){
       hp5 tb;
       byte b;
       this.V(1);
       int i = 0;
       while (true) {
          int i1 = i + 1;
          tb = this.b;
          if (this.a((long)i1)) {
             if ((b = tb.h0((long)i)) >= (byte)48 && (b <= (byte)57 || (b >= (byte)97 && (b <= (byte)102 || (b >= (byte)65 && b <= (byte)70))))) {
                i = i1;
             }else if(i){
                break ;
             }else {
                vv7.f(16);
                vv7.f(16);
                String str = Integer.toString(b, 16);
                co5.l(str, "toString\(this, checkRadix\(radix\)\)");
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(str));
             }
          }else {
             break ;
          }
       }
       return tb.b0();
    }
    public final e70 c(){
       return this.b;
    }
    public final String c0(Charset p0){
       hp5 tb = this.b;
       tb.A(this.a);
       return tb.p0(tb.b, p0);
    }
    public final void close(){
       if (this.c == null) {
          this.c = true;
          this.a.close();
          this.b.f();
       }
       return;
    }
    public final b57 e(){
       return this.a.e();
    }
    public final y70 e0(){
       return new y70(this, 2);
    }
    public final long f(){
       hp5 tb;
       byte b;
       long l = 1;
       this.V(l);
       int i = 0;
       long l1 = i;
       while (true) {
          long l2 = l1 + l;
          tb = this.b;
          if (this.a(l2)) {
             if ((b = tb.h0(l1)) >= (byte)48 && (b <= (byte)57 || (!(v10 = l1 - i) && b == (byte)45))) {
                l1 = l2;
             }else if(v10){
                break ;
             }else {
                vv7.f(16);
                vv7.f(16);
                String str = Integer.toString(b, 16);
                co5.l(str, "toString\(this, checkRadix\(radix\)\)");
                throw new NumberFormatException("Expected a digit or \'-\' but was 0x".concat(str));
             }
          }else {
             break ;
          }
       }
       return tb.n0();
    }
    public final boolean isOpen(){
       return (this.c ^ 0x01);
    }
    public final boolean l(long p0,j80 p1){
       long l1;
       co5.o(p1, "bytes");
       j80 a = p1.a;
       int len = a.length;
       int i = 1;
       if (!((this.c ^ i))) {
          throw new IllegalStateException("closed".toString());
       }
       if ((p0) >= 0 && (len >= 0 && ((a.length - 0)) >= len)) {
          int i1 = 0;
          while (i1 < len) {
             long l = (long)i1 + p0;
             if (l1 = 1 + l) {
                int i2 = 0 + i1;
                if (this.b.h0(l) == p1.a[i2]) {
                   i1 = i1 + 1;
                }
             }
          }
          return i;
       }
       i = false;
    }
    public final long o(e70 p0,long p1){
       long l;
       co5.o(p0, "sink");
       int i = 0;
       int i1 = ((p1 - i) >= 0)? 1: 0;
       if (i1) {
          if ((this.c ^ 0x01)) {
             hp5 tb = this.b;
             if (!(tb.b - i)) {
                l = -1;
                if (!(this.a.o(tb, 8192) - l)) {
                label_0037 :
                   return l;
                }
             }
             l = tb.o(p0, Math.min(p1, tb.b));
             goto label_0037 ;
          }else {
             throw new IllegalStateException("closed".toString());
          }
       }else {
          throw new IllegalArgumentException(kg4.k("byteCount < 0: ", p1).toString());
       }
    }
    public final long p(j80 p0){
       long l1;
       co5.o(p0, "targetBytes");
       if (!((this.c ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       long l = 0;
       while (true) {
          hp5 tb = this.b;
          l1 = tb.k0(l, p0);
          if (l1 - -1) {
             break ;
          }else {
             e70 b = tb.b;
             if (!(this.a.o(tb, 8192) - -1)) {
                l1 = -1;
                break ;
             }else {
                l = Math.max(l, b);
             }
          }
       }
       return l1;
    }
    public final hp5 peek(){
       return xe7.f(new aa5(this));
    }
    public final j80 q(long p0){
       this.V(p0);
       return this.b.q(p0);
    }
    public final int read(ByteBuffer p0){
       co5.o(p0, "sink");
       hp5 tb = this.b;
       if (!(tb.b) && !(this.a.o(tb, 8192) - -1)) {
          return -1;
       }
       return tb.read(p0);
    }
    public final int read(byte[] p0){
       long l = (long)p0.length;
       co5.p((long)p0.length, (long)0, l);
       hp5 tb = this.b;
       int i = (!(tb.b) && !(this.a.o(tb, 8192) - -1))? -1: tb.read(p0, 0, (int)Math.min(l, tb.b));
       return i;
    }
    public final byte readByte(){
       this.V(1);
       return this.b.readByte();
    }
    public final int readInt(){
       this.V(4);
       return this.b.readInt();
    }
    public final short readShort(){
       this.V(2);
       return this.b.readShort();
    }
    public final void skip(long p0){
       if (!((this.c ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       while (true) {
          int i = 0;
          if ((p0 - i) <= 0) {
             return;
          }
          hp5 tb = this.b;
          if (!(tb.b - i) && !(this.a.o(tb, 8192) - -1)) {
             break ;
          }else {
             long l = Math.min(p0, tb.b);
             tb.skip(l);
             p0 = p0 - l;
          }
       }
       throw new EOFException();
    }
    public final String toString(){
       return "buffer\("+this.a+')';
    }
    public final short x(){
       this.V(2);
       return this.b.o0();
    }
    public final String y(long p0){
       this.V(p0);
       return this.b.r0(p0);
    }
}
