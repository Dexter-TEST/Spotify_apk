package p.f77;
import java.util.concurrent.Callable;
import p.i77;
import p.zy5;
import java.lang.Object;
import java.util.ArrayList;
import p.xy5;
import android.database.Cursor;
import p.vv7;
import java.lang.String;
import p.zv;
import p.bw;
import p.ej4;
import p.dw;
import p.zs;
import p.aw;
import p.at;
import p.bt;
import p.pk;
import p.wh6;
import p.gr;
import p.xv;

public final class f77 implements Callable	// class@001575 from classes.dex
{
    public final int a;
    public final zy5 b;
    public final i77 c;

    public void f77(i77 p0,zy5 p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public final ArrayList a(){
       Cursor uCursor;
       ArrayList uArrayList;
       String str;
       String str1;
       int intx;
       String str2;
       String str3;
       String str4;
       String str5;
       boolean b2;
       boolean b3;
       long longx;
       String str6;
       String str7;
       String str8;
       String str9;
       String str10;
       zv ozv;
       String str11;
       String str12;
       String str13;
       String str14;
       String str15;
       String str16;
       boolean b4;
       String str17;
       String str18;
       zs ozs;
       ArrayList uArrayList1;
       Cursor uCursor2;
       String str21;
       String str23;
       String str24;
       at uoat;
       zv ozv1;
       f77 uof77 = this;
       int i = 2;
       int i1 = 11;
       int i2 = 1;
       int i3 = 4;
       int i4 = 5;
       int i5 = 6;
       int i6 = 10;
       int i7 = 7;
       int i8 = 9;
       int i9 = 8;
       f77 b = uof77.b;
       f77 c = uof77.c;
       boolean i10 = 3;
       int b1 = false;
       switch (uof77.a){
           case 0:
             break;
           case 1:
             Cursor uCursor1 = vv7.J(c.a, b, false);
             i = ej4.z(uCursor1, "track_uri");
             i8 = ej4.z(uCursor1, "uid");
             i9 = ej4.z(uCursor1, "position");
             int i12 = ej4.z(uCursor1, "parent_uri");
             uArrayList1 = new ArrayList(uCursor1.getCount());
             while (uCursor1.moveToNext()) {
                String str20 = (uCursor1.isNull(i))? null: uCursor1.getString(i);
                str = (uCursor1.isNull(i8))? null: uCursor1.getString(i8);
                i1 = uCursor1.getInt(i9);
                str1 = (uCursor1.isNull(i12))? null: uCursor1.getString(i12);
                uArrayList1.add(dw.b(i1, str1, str20, str));
             }
             uCursor1.close();
             return uArrayList1;
             break;
           case 3:
             uCursor2 = vv7.J(c.a, b, false);
             uArrayList = new ArrayList(uCursor2.getCount());
             while (uCursor2.moveToNext()) {
                i7 = 0;
                str24 = (uCursor2.isNull(i7))? null: uCursor2.getString(i7);
                uArrayList.add(str24);
             }
             uCursor2.close();
             return uArrayList;
             break;
           case 4:
             uCursor = vv7.J(c.a, b, b1);
             uArrayList1 = new ArrayList(uCursor.getCount());
             while (uCursor.moveToNext()) {
                String str25 = (uCursor.isNull(b1))? null: uCursor.getString(b1);
                str1 = (uCursor.isNull(i2))? null: uCursor.getString(i2);
                b1 = uCursor.getInt(i);
                if (uCursor.isNull(i10) && (uCursor.isNull(i3) && (uCursor.isNull(i4) && (uCursor.isNull(i5) && (uCursor.isNull(i7) && (uCursor.isNull(i9) && (uCursor.isNull(i8) && (uCursor.isNull(i6) && (uCursor.isNull(i1) && (uCursor.isNull(12) && (uCursor.isNull(13) && uCursor.isNull(14)))))))))))) {
                   ozv1 = null;
                }else if(uCursor.isNull(i10)){
                   str2 = null;
                }else {
                   str2 = uCursor.getString(i10);
                }
                str3 = (uCursor.isNull(i3))? null: uCursor.getString(i3);
                str4 = (uCursor.isNull(i4))? null: uCursor.getString(i4);
                str5 = (uCursor.isNull(i5))? null: uCursor.getString(i5);
                b2 = (uCursor.getInt(i7))? true: false;
                b3 = (uCursor.getInt(i9))? true: false;
                longx = uCursor.getLong(i8);
                str6 = (uCursor.isNull(i6))? null: uCursor.getString(i6);
                if (uCursor.isNull(i1)) {
                   i = 12;
                   str7 = null;
                }else {
                   str7 = uCursor.getString(i1);
                   i = 12;
                }
                if (uCursor.isNull(i)) {
                   i = 13;
                   str8 = null;
                }else {
                   str8 = uCursor.getString(i);
                   i = 13;
                }
                if (uCursor.isNull(i)) {
                   i = 14;
                   str9 = null;
                }else {
                   str9 = uCursor.getString(i);
                   i = 14;
                }
                str10 = (uCursor.isNull(i))? null: uCursor.getString(i);
                ozv1 = zv.a(longx, str2, str3, str4, str5, str6, str7, str8, str9, str10, b2, b3);
                uArrayList1.add(bw.b(str25, str1, b1, ozv1));
                i = 2;
                b1 = 0;
                i2 = 1;
             }
             uCursor.close();
             return uArrayList1;
             break;
           default:
             uCursor2 = vv7.J(c.a, b, false);
             uArrayList = new ArrayList(uCursor2.getCount());
             while (uCursor2.moveToNext()) {
                i7 = 0;
                if (uCursor2.isNull(i7)) {
                   i9 = 1;
                   str21 = null;
                }else {
                   str21 = uCursor2.getString(i7);
                   i9 = 1;
                }
                String str22 = (uCursor2.isNull(i9))? null: uCursor2.getString(i9);
                i1 = uCursor2.getInt(2);
                if (uCursor2.isNull(i10) && (uCursor2.isNull(4) && (uCursor2.isNull(5) && (uCursor2.isNull(6) && (uCursor2.isNull(7) && (uCursor2.isNull(8) && (uCursor2.isNull(9) && (uCursor2.isNull(10) && (uCursor2.isNull(11) && (uCursor2.isNull(12) && (uCursor2.isNull(13) && (uCursor2.isNull(14) && uCursor2.isNull(15))))))))))))) {
                   ozs = null;
                   i9 = 16;
                   i5 = 9;
                }else if(uCursor2.isNull(i10)){
                   i2 = 4;
                   str23 = null;
                }else {
                   str23 = uCursor2.getString(i10);
                   i2 = 4;
                }
                str11 = (uCursor2.isNull(i2))? null: uCursor2.getString(i2);
                i6 = 5;
                str12 = (uCursor2.isNull(i6))? null: uCursor2.getString(i6);
                intx = 6;
                str13 = (uCursor2.isNull(intx))? null: uCursor2.getString(intx);
                i3 = 7;
                str14 = (uCursor2.isNull(i3))? null: uCursor2.getString(i3);
                i4 = 8;
                str15 = (uCursor2.isNull(i4))? null: uCursor2.getString(i4);
                int intx2 = uCursor2.getInt(9);
                i7 = 11;
                boolean b6 = (uCursor2.getInt(10))? true: false;
                i7 = 12;
                b4 = (uCursor2.getInt(i7))? true: false;
                long longx2 = uCursor2.getLong(i7);
                i7 = 13;
                str16 = (uCursor2.isNull(i7))? null: uCursor2.getString(i7);
                i7 = 14;
                str17 = (uCursor2.isNull(i7))? null: uCursor2.getString(i7);
                i7 = 15;
                str18 = (uCursor2.isNull(i7))? null: uCursor2.getString(i7);
                ozs = zs.a(intx2, longx2, str23, str11, str12, str13, str14, str15, str16, str17, str18, b6, b4);
                i9 = 16;
                if (uCursor2.isNull(i9) && (uCursor2.isNull(17) && uCursor2.isNull(18))) {
                   uoat = null;
                }else {
                   i9 = 16;
                   str24 = (uCursor2.isNull(i9))? null: uCursor2.getString(i9);
                   i10 = 17;
                   b1 = uCursor2.getInt(i10);
                   i10 = (uCursor2.getInt(18))? true: false;
                   uoat = at.b(b1, str24, i10);
                }
                uArrayList.add(bt.b(str21, str22, i1, ozs, uoat));
                i10 = 3;
             }
             uCursor2.close();
             return uArrayList;
       }
       uCursor = vv7.J(c.a, b, false);
       uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          int i11 = 0;
          if (uCursor.isNull(i11)) {
             i11 = 1;
             str = null;
          }else {
             str = uCursor.getString(i11);
             i11 = 1;
          }
          if (uCursor.isNull(i11)) {
             i11 = 2;
             str1 = null;
          }else {
             str1 = uCursor.getString(i11);
             i11 = 2;
          }
          intx = uCursor.getInt(i11);
          if (uCursor.isNull(i10) && (uCursor.isNull(i3) && (uCursor.isNull(i4) && (uCursor.isNull(i5) && (uCursor.isNull(i7) && (uCursor.isNull(i9) && (uCursor.isNull(i8) && (uCursor.isNull(i6) && (uCursor.isNull(i1) && (uCursor.isNull(12) && (uCursor.isNull(13) && uCursor.isNull(14)))))))))))) {
             ozv = null;
          }else if(uCursor.isNull(i10)){
             str2 = null;
          }else {
             str2 = uCursor.getString(i10);
          }
          str3 = (uCursor.isNull(i3))? null: uCursor.getString(i3);
          str4 = (uCursor.isNull(i4))? null: uCursor.getString(i4);
          str5 = (uCursor.isNull(i5))? null: uCursor.getString(i5);
          b2 = (uCursor.getInt(i7))? true: false;
          b3 = (uCursor.getInt(i9))? true: false;
          longx = uCursor.getLong(i8);
          str6 = (uCursor.isNull(i6))? null: uCursor.getString(i6);
          if (uCursor.isNull(i1)) {
             i11 = 12;
             str7 = null;
          }else {
             str7 = uCursor.getString(i1);
             i11 = 12;
          }
          if (uCursor.isNull(i11)) {
             i11 = 13;
             str8 = null;
          }else {
             str8 = uCursor.getString(i11);
             i11 = 13;
          }
          if (uCursor.isNull(i11)) {
             i11 = 14;
             str9 = null;
          }else {
             str9 = uCursor.getString(i11);
             i11 = 14;
          }
          str10 = (uCursor.isNull(i11))? null: uCursor.getString(i11);
          ozv = zv.a(longx, str2, str3, str4, str5, str6, str7, str8, str9, str10, b2, b3);
          i1 = 15;
          i1 = 22;
          i6 = 21;
          i8 = 27;
          i9 = 26;
          i7 = 25;
          i5 = 20;
          i4 = 19;
          if (uCursor.isNull(i1) && (uCursor.isNull(16) && (uCursor.isNull(17) && (uCursor.isNull(18) && (uCursor.isNull(i4) && (uCursor.isNull(i5) && (uCursor.isNull(i6) && (uCursor.isNull(i1) && (uCursor.isNull(23) && (uCursor.isNull(24) && (uCursor.isNull(i7) && (uCursor.isNull(i9) && uCursor.isNull(i8))))))))))))) {
             ozs = null;
          }else {
             i3 = 15;
             if (uCursor.isNull(i3)) {
                i3 = 16;
                str11 = null;
             }else {
                str11 = uCursor.getString(i3);
                i3 = 16;
             }
             if (uCursor.isNull(i3)) {
                i3 = 17;
                str12 = null;
             }else {
                str12 = uCursor.getString(i3);
                i3 = 17;
             }
             if (uCursor.isNull(i3)) {
                i3 = 18;
                str13 = null;
             }else {
                str13 = uCursor.getString(i3);
                i3 = 18;
             }
             str14 = (uCursor.isNull(i3))? null: uCursor.getString(i3);
             str15 = (uCursor.isNull(i4))? null: uCursor.getString(i4);
             str16 = (uCursor.isNull(i5))? null: uCursor.getString(i5);
             int intx1 = uCursor.getInt(i6);
             b4 = (uCursor.getInt(i1))? true: false;
             boolean b5 = (uCursor.getInt(23))? true: false;
             long longx1 = uCursor.getLong(24);
             str17 = (uCursor.isNull(i7))? null: uCursor.getString(i7);
             str18 = (uCursor.isNull(i9))? null: uCursor.getString(i9);
             String str19 = (uCursor.isNull(i8))? null: uCursor.getString(i8);
             ozs = zs.a(intx1, longx1, str11, str12, str13, str14, str15, str16, str17, str18, str19, b4, b5);
          }
          uArrayList.add(aw.b(str, str1, intx, ozv, ozs));
          i7 = 7;
          i8 = 9;
          i9 = 8;
          i1 = 11;
          i6 = 10;
          i3 = 4;
          i4 = 5;
          i5 = 6;
       }
       uCursor.close();
       return uArrayList;
    }
    public final Object call(){
       int i;
       ArrayList obj;
       String str8;
       zv ozv;
       gr ogr;
       int i3;
       xv oxv;
       f77 uof77 = this;
       switch (uof77.a){
           case 0:
             return this.a();
           case 1:
             return this.a();
           case 2:
             f77 c = uof77.c;
             c.a.c();
             boolean b = true;
             Cursor uCursor = vv7.J(c.a, uof77.b, b);
             pk opk = new pk();
             pk opk1 = new pk();
             while (true) {
                i = 0;
                obj = null;
                if (uCursor.moveToNext()) {
                   if (!uCursor.isNull(b)) {
                      opk.put(uCursor.getString(b), obj);
                   }
                   if (!uCursor.isNull(i)) {
                      String str = uCursor.getString(i);
                      if (opk1.getOrDefault(str, obj) == null) {
                         opk1.put(str, new ArrayList());
                      }
                   }
                }else {
                   break ;
                }
             }
             uCursor.moveToPosition(-1);
             c.a(opk);
             c.c(opk1);
             if (uCursor.moveToFirst()) {
                int i1 = 7;
                i = 3;
                if (uCursor.isNull(i) && (uCursor.isNull(b) && (uCursor.isNull(2) && (uCursor.isNull(i) && (uCursor.isNull(4) && (uCursor.isNull(5) && (uCursor.isNull(6) && (uCursor.isNull(i1) && (uCursor.isNull(8) && (uCursor.isNull(9) && (uCursor.isNull(10) && uCursor.isNull(11)))))))))))) {
                   ozv = null;
                }else {
                   int i2 = 0;
                   String str1 = (uCursor.isNull(i2))? null: uCursor.getString(i2);
                   String str2 = (uCursor.isNull(b))? null: uCursor.getString(b);
                   String str3 = (uCursor.isNull(2))? null: uCursor.getString(2);
                   String str4 = (uCursor.isNull(i))? null: uCursor.getString(i);
                   boolean b1 = (uCursor.getInt(4))? true: false;
                   boolean b2 = (uCursor.getInt(5))? true: false;
                   long longx = uCursor.getLong(6);
                   String str5 = (uCursor.isNull(i1))? null: uCursor.getString(i1);
                   String str6 = (uCursor.isNull(8))? null: uCursor.getString(8);
                   String str7 = (uCursor.isNull(9))? null: uCursor.getString(9);
                   if (uCursor.isNull(10)) {
                      i2 = 11;
                      str8 = null;
                   }else {
                      str8 = uCursor.getString(10);
                      i2 = 11;
                   }
                   String str9 = (uCursor.isNull(i2))? null: uCursor.getString(i2);
                   ozv = zv.a(longx, str1, str2, str3, str4, str5, str6, str7, str8, str9, b1, b2);
                }
                if (!uCursor.isNull(b)) {
                   ogr = opk.getOrDefault(uCursor.getString(b), null);
                   i3 = 0;
                }else {
                   i3 = 0;
                   ogr = null;
                }
                obj = (!uCursor.isNull(i3))? opk1.getOrDefault(uCursor.getString(i3), null): null;
                if (obj == null) {
                   obj = new ArrayList();
                }
                oxv = xv.a(ozv, ogr, obj);
             }else {
                oxv = obj;
             }
             c.a.r();
             uCursor.close();
             c.a.m();
             return oxv;
             break;
           case 3:
             return this.a();
           case 4:
             return this.a();
           default:
             return this.a();
       }
    }
    public final void finalize(){
       f77 tb = this.b;
       switch (this.a){
           case 0:
             tb.y();
             return;
           case 1:
             tb.y();
             return;
           case 2:
             tb.y();
             return;
           case 3:
             tb.y();
             return;
           case 4:
             tb.y();
             return;
           default:
             tb.y();
             return;
       }
    }
}
