package p.li5;
import p.ly7;
import java.lang.Object;
import java.lang.Boolean;
import androidx.work.impl.WorkDatabase;
import p.m91;
import p.xy5;
import p.eb4;
import p.jb7;
import p.kb7;
import p.lb7;
import java.lang.String;
import java.lang.Integer;
import java.util.ArrayList;
import p.fb4;
import p.g54;
import p.oi2;
import p.pi2;
import java.util.List;
import p.uo;
import java.lang.Class;
import p.zr;
import java.lang.IllegalStateException;
import java.lang.IllegalArgumentException;
import java.lang.System;
import java.lang.ArithmeticException;
import p.o08;
import p.a70;
import p.tu6;
import p.m18;
import p.t18;
import android.content.Context;
import java.util.UUID;
import java.lang.Long;
import p.zy5;
import android.database.Cursor;
import p.vv7;
import p.u65;
import p.nb7;
import p.mb7;
import p.fb7;
import p.gb7;
import p.ki5;
import p.rn1;
import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import p.n6;
import p.ms0;
import java.lang.StringBuilder;

public class li5 implements ly7	// class@001d5e from classes.dex
{
    public final int a;
    public Object b;
    public Object c;

    public void li5(int p0){
       this.a = p0;
       if (p0 != 7) {
          super();
          this.b = Boolean.FALSE;
          return;
       }else {
          super();
          return;
       }
    }
    public void li5(int p0,int p1){
       this.a = p0;
       super();
    }
    public void li5(WorkDatabase p0){
       this.a = 0;
       super();
       this.b = p0;
       this.c = new m91(this, p0, 1);
    }
    public void li5(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public void li5(eb4 p0){
       this.a = 13;
       this.c = p0;
       super();
       jb7 ojb7 = p0.b.b();
       lb7 v6 = new lb7("filter_chips", null, null, null, null);
       ojb7.i.add(v6);
       ojb7.j = true;
       this.b = ojb7.a();
    }
    public void li5(fb4 p0){
       this.a = 14;
       this.c = p0;
       super();
       jb7 ojb7 = p0.b.b();
       lb7 v6 = new lb7("content", null, null, null, null);
       ojb7.i.add(v6);
       ojb7.j = true;
       this.b = ojb7.a();
    }
    public void li5(g54 p0){
       this.a = 10;
       super();
       this.c = p0;
    }
    public void li5(oi2 p0){
       this.a = 8;
       super();
       this.b = p0;
       ArrayList uArrayList = new ArrayList();
       this.c = uArrayList;
       int[] ointArray = new int[]{1};
       uArrayList.add(new pi2(p0, ointArray));
    }
    public void li5(uo p0){
       this.a = 4;
       super();
       this.b = Boolean.FALSE;
       p0.getClass();
       this.b = Boolean.valueOf(p0.a);
       this.c = p0.b;
    }
    public final zr a(){
       String str = (this.b == null)? " filename": "";
       if (this.c == null) {
          str = str.concat(" contents");
       }
       if (str.isEmpty()) {
          return new zr(this.b, this.c);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final void b(int[] p0,int p1){
       int i;
       int i1;
       pi2 opi2;
       int i5;
       pi2 a;
       int i6;
       int i9;
       oi2 ooi21;
       li5 oli5 = this;
       Object obj = p0;
       if (!(i = p1)) {
          throw new IllegalArgumentException("No error correction bytes");
       }
       if ((i1 = obj.length - i) <= 0) {
          throw new IllegalArgumentException("No data bytes provided");
       }
       int i2 = 0;
       int pi2 i3 = 1;
       String str = "GenericGFPolys do not have same GenericGF field";
       if (i >= oli5.c.size()) {
          li5 c = oli5.c;
          opi2 = c.get((c.size() - i3));
          int i4 = oli5.c.size();
          while (true) {
             if (i4 <= i) {
                li5 b = oli5.b;
                int[] ointArray = new int[2];
                ointArray[i2] = i3;
                i5 = i4 - 1;
                i5 = i5 + b.f;
                ointArray[i3] = b.a[i5];
                pi2 opi21 = new pi2(b, ointArray);
                opi2.getClass();
                a = opi2.a;
                if (a.equals(b)) {
                   if (!opi2.b() && !opi21.b()) {
                      opi2 = opi2.b;
                      int len = opi2.length;
                      opi21 = opi21.b;
                      i5 = opi21.length;
                      int[] ointArray1 = new int[((len + i5) - 1)];
                      i6 = 0;
                      while (i6 < len) {
                         int i7 = opi2[i6];
                         i3 = 0;
                         while (i3 < i5) {
                            int i8 = i6 + i3;
                            i2 = a.a(i7, opi21[i3]) ^ ointArray1[i8];
                            ointArray1[i8] = i2;
                            i3 = i3 + 1;
                            i2 = 0;
                         }
                         i6 = i6 + 1;
                         i3 = 1;
                      }
                      opi2 = new pi2(a, ointArray1);
                   }else {
                      opi2 = a.c;
                   }
                   oli5.c.add(opi2);
                   i4 = i4 + 1;
                   i2 = 0;
                   i3 = 1;
                }else {
                   break ;
                }
             }
          }
          throw new IllegalArgumentException(str);
       }
       opi2 = oli5.c.get(i);
       int[] ointArray2 = new int[i1];
       System.arraycopy(obj, 0, ointArray2, 0, i1);
       i3 = new pi2(oli5.b, ointArray2);
       pi2 opi22 = i3.c(i, 1);
       opi22.getClass();
       pi2 a1 = opi22.a;
       if (a1.equals(opi2.a)) {
          if (!opi2.b()) {
             i3 = opi2.b;
             if (i9 = i3[((i3.length - 1) - (i3.length - 1))]) {
                i9 = a1.a[((a1.d - a1.b[i9]) - 1)];
                oi2 c1 = a1.c;
                oi2 ooi2 = c1;
                while (true) {
                   a = opi22.b;
                   i5 = a.length - 1;
                   int i10 = i3.length - 1;
                   if (i5 >= i10 && !opi22.b()) {
                      i5 = a.length - 1;
                      i10 = i3.length - 1;
                      i5 = i5 - i10;
                      int i11 = a.length - 1;
                      pi2 b1 = opi22.b;
                      i6 = b1.length - 1;
                      i6 = i6 - i11;
                      i11 = a1.a(b1[i6], i9);
                      b1 = opi2.c(i5, i11);
                      if (i5 >= 0) {
                         if (!i11) {
                            ooi21 = c1;
                         }else {
                            i5 = i5 + 1;
                            int[] ointArray3 = new int[i5];
                            ointArray3[0] = i11;
                            ooi21 = new pi2(a1, ointArray3);
                         }
                         ooi2.a(ooi21);
                         opi22 = opi22.a(b1);
                      }else {
                         break ;
                      }
                   }else {
                      i = i - a.length;
                      for (i3 = 0; i3 < i; i3 = i3 + 1) {
                         int i12 = i1 + i3;
                         obj[i12] = 0;
                      }
                      System.arraycopy(a, 0, obj, (i1 + i), a.length);
                      return;
                   }
                }
                throw new IllegalArgumentException();
             }else {
                throw new ArithmeticException();
             }
          }else {
             throw new IllegalArgumentException("Divide by 0");
          }
       }else {
          throw new IllegalArgumentException(str);
       }
    }
    public final Object c(){
       a70 a = this.b.a.a;
       tu6.E(a);
       return new m18(a, this.c.c());
    }
    public final String d(){
       li5 tb;
       String str;
       if ((tb = this.b) != null) {
          return tb;
       }
       if ((str = this.c.s("installation_id")) != null) {
          this.b = str;
          return str;
       }else {
          str = UUID.randomUUID().toString();
          this.c.u("installation_id", str);
          this.b = str;
          return str;
       }
    }
    public final Long e(String p0){
       zy5 ozy5 = zy5.x(1, "SELECT long_value FROM Preference where `key`=?");
       ozy5.s(1, p0);
       this.b.b();
       boolean b = false;
       Cursor uCursor = vv7.J(this.b, ozy5, b);
       Long longx = (uCursor.moveToFirst() && !uCursor.isNull(b))? Long.valueOf(uCursor.getLong(b)): null;
       uCursor.close();
       ozy5.y();
       return longx;
    }
    public final boolean equals(Object p0){
       boolean b;
       switch (this.a){
           case 2:
             b = false;
             if (p0 instanceof u65) {
                u65 a = p0.a;
                li5 tb = this.b;
                li5 tc = (a != tb && (a == null && a.equals(tb)))? 0: 1;
                if (a) {
                   tc = this.c;
                   int i = ((p0 = p0.b) != tc && (p0 == null && p0.equals(tc)))? 0: 1;
                   if (i) {
                      b = true;
                   }
                }
             }
             break;
           default:
             return super.equals(p0);
       }
       return b;
    }
    public final nb7 f(){
       mb7 omb7;
       switch (this.a){
           case 13:
           default:
             omb7 = new mb7();
             omb7.c(this.b);
             omb7.b = this.c.a;
             return omb7.a();
       }
       omb7 = new mb7();
       omb7.c(this.b);
       omb7.b = this.c.a;
       return omb7.a();
    }
    public final void g(ki5 p0){
       this.b.b();
       this.b.c();
       this.c.h(p0);
       this.b.r();
       this.b.m();
    }
    public final void h(Context p0,Uri p1){
       this.b.setData(p1);
       ms0.b(p0, this.b, this.c);
    }
    public final int hashCode(){
       int i;
       int i1;
       li5 tc;
       switch (this.a){
           case 2:
             li5 tb = this.b;
             i = 0;
             i1 = (tb == null)? 0: tb.hashCode();
             if ((tc = this.c) != null) {
                i = tc.hashCode();
             }
             break;
           default:
             return super.hashCode();
       }
       return (i1 ^ i);
    }
    public final String toString(){
       switch (this.a){
           case 2:
           default:
             return super.toString();
       }
       return "Pair{"+this.b+" "+this.c+"}";
    }
}
