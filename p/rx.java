package p.rx;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.util.Arrays;
import java.lang.IllegalArgumentException;
import p.tp2;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.Class;
import p.sx;
import p.en6;

public final class rx implements Serializable	// class@00257c from classes.dex
{
    public final int[] a;
    public final char[] b;
    public final byte[] c;
    public final String t;
    public final char v;
    public final int w;
    public final boolean x;
    public final int y;

    public void rx(String p0,String p1,boolean p2,char p3,int p4){
       int i1;
       super();
       int[] ointArray = new int[128];
       this.a = ointArray;
       int i = 64;
       char[] uocharArray = new char[i];
       this.b = uocharArray;
       byte[] uobyteArray = new byte[i];
       this.c = uobyteArray;
       this.t = p0;
       this.x = p2;
       this.v = p3;
       this.w = p4;
       if ((i1 = p1.length()) != i) {
          throw new IllegalArgumentException(tp2.l("Base64Alphabet length must be exactly 64 \(was ", i1, "\)"));
       }
       p4 = 0;
       p1.getChars(p4, i1, uocharArray, p4);
       Arrays.fill(ointArray, -1);
       for (; p4 < i1; p4++) {
          char c = this.b[p4];
          this.c[p4] = (byte)c;
          this.a[c] = p4;
       }
       if (p2) {
          i1[p3] = -2;
       }
       i1 = (p2)? 2: 1;
       this.y = i1;
       return;
    }
    public void rx(rx p0,String p1,boolean p2,char p3,int p4){
       super(p0, p1, p2, p3, p0.y, p4);
    }
    public void rx(rx p0,String p1,boolean p2,char p3,int p4,int p5){
       super();
       int[] ointArray = new int[128];
       this.a = ointArray;
       char[] uocharArray = new char[64];
       this.b = uocharArray;
       byte[] uobyteArray = new byte[64];
       this.c = uobyteArray;
       this.t = p1;
       rx c = p0.c;
       System.arraycopy(c, 0, uobyteArray, 0, c.length);
       c = p0.b;
       System.arraycopy(c, 0, uocharArray, 0, c.length);
       p0 = p0.a;
       System.arraycopy(p0, 0, ointArray, 0, p0.length);
       this.x = p2;
       this.v = p3;
       this.w = p5;
       this.y = p4;
    }
    public final String a(byte[] p0){
       int len = p0.length;
       StringBuilder str = new StringBuilder((((len >> 2) + len) + (len >> 3)));
       int i = this.w >> 2;
       int i1 = len - 3;
       int i2 = 0;
       int i3 = i;
       while (true) {
          rx tb = this.b;
          if (i2 <= i1) {
             int i4 = i2 + 1;
             i2 = p0[i2] << 8;
             int i5 = i4 + 1;
             i4 = p0[i4] & 0x00ff;
             i2 = i2 | i4;
             i2 = i2 << 8;
             i4 = i5 + 1;
             i5 = p0[i5] & 0x00ff;
             i2 = i2 | i5;
             i5 = i2 >> 18;
             i5 = i5 & 0x3f;
             i5 = i2 >> 12;
             i5 = i5 & 0x3f;
             i5 = i2 >> 6;
             i5 = i5 & 0x3f;
             i2 = i2 & 0x3f;
             str = str.append(tb[i5]).append(tb[i5]).append(tb[i5]).append(tb[i2]);
             if ((i3 = i3 - 1) <= 0) {
                str = str.append("\\n");
                i3 = i;
             }
             i2 = i4;
          }else if((len = len - i2) > 0){
             i = i2 + 1;
             i1 = p0[i2] << 16;
             if (len == 2) {
                i1 = i1 | ((p0[i] & 0x00ff) << 8);
             }
             str = str+tb[((i1 >> 18) & 0x3f)]+tb[((i1 >> 12) & 0x3f)];
             if (this.x != null) {
                rx tv = this.v;
                char c = (len == 2)? tb[((i1 >> 6) & 0x3f)]: tv;
                str = str+c+tv;
             }else if(len == 2){
                str = str+tb[((i1 >> 6) & 0x3f)];
             }
          }
          return str;
       }
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (p0 == null || p0.getClass() != rx.class) {
          return false;
       }
       if (p0.v != this.v || (p0.w != this.w || (p0.x != this.x || (p0.y != this.y || !this.t.equals(p0.t))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return this.t.hashCode();
    }
    public Object readResolve(){
       rx a = sx.a;
       rx tt = this.t;
       if (!a.t.equals(tt)) {
          a = sx.b;
          if (!a.t.equals(tt)) {
             a = sx.c;
             if (!a.t.equals(tt)) {
                a = sx.d;
                if (!a.t.equals(tt)) {
                   String str = (tt == null)? "<null>": tp2.m("\'", tt, "\'");
                   throw new IllegalArgumentException(en6.n("No Base64Variant with name ", str));
                }
             }
          }
       }
       rx orx = a;
       rx tx = this.x;
       a = orx.x;
       if (tx == a && (this.v == orx.v && (this.y == orx.y && (this.w == orx.w && tx == a)))) {
          return orx;
       }else {
          a = new rx(orx, this.t, tx, this.v, this.y, this.w);
          return a;
       }
    }
    public final String toString(){
       return this.t;
    }
}
