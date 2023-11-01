package p.jo1;
import java.util.concurrent.Callable;
import p.ko1;
import p.zy5;
import java.lang.Object;
import p.xy5;
import android.database.Cursor;
import p.vv7;
import p.pk;
import java.lang.String;
import p.wh6;
import java.util.ArrayList;
import p.zs;
import p.dw;
import p.at;
import p.du;
import p.lv;
import p.xs;

public final class jo1 implements Callable	// class@001b14 from classes.dex
{
    public final int a;
    public final zy5 b;
    public final ko1 c;

    public void jo1(ko1 p0,zy5 p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public final Object call(){
       String str;
       String str1;
       String str5;
       String str6;
       int i6;
       boolean b3;
       String str7;
       String str8;
       String str9;
       String str10;
       dw uodw;
       at uoat;
       Cursor uCursor1;
       int i7;
       String str13;
       boolean b4;
       boolean b5;
       String str14;
       String str15;
       zs ozs;
       xs obj1;
       jo1 ojo1 = this;
       int i = 5;
       int i1 = 6;
       int i2 = 7;
       boolean i3 = 8;
       zs obj = null;
       int i4 = -1;
       jo1 b = ojo1.b;
       jo1 c = ojo1.c;
       boolean b1 = true;
       int i5 = 0;
       switch (ojo1.a){
           case 0:
             c.b.c();
             Cursor uCursor = vv7.J(c.b, b, b1);
             pk opk = new pk();
             while (uCursor.moveToNext()) {
                if (!uCursor.isNull(i5)) {
                   str = uCursor.getString(i5);
                   if (opk.getOrDefault(str, obj) == null) {
                      opk.put(str, new ArrayList());
                   }
                }
                obj = null;
             }
             uCursor.moveToPosition(i4);
             c.e(opk);
             ArrayList uArrayList = new ArrayList(uCursor.getCount());
             while (uCursor.moveToNext()) {
                if (uCursor.isNull(i5) && (uCursor.isNull(b1) && (uCursor.isNull(2) && (uCursor.isNull(3) && (uCursor.isNull(4) && (uCursor.isNull(i) && (uCursor.isNull(i1) && (uCursor.isNull(i2) && (uCursor.isNull(i3) && (uCursor.isNull(9) && (uCursor.isNull(10) && (uCursor.isNull(11) && uCursor.isNull(12))))))))))))) {
                   obj = null;
                }else if(uCursor.isNull(i5)){
                   str1 = null;
                }else {
                   str1 = uCursor.getString(i5);
                }
                String str2 = (uCursor.isNull(b1))? null: uCursor.getString(b1);
                String str3 = (uCursor.isNull(2))? null: uCursor.getString(2);
                String str4 = (uCursor.isNull(3))? null: uCursor.getString(3);
                str5 = (uCursor.isNull(4))? null: uCursor.getString(4);
                str6 = (uCursor.isNull(i))? null: uCursor.getString(i);
                int intx = uCursor.getInt(i1);
                boolean b2 = (uCursor.getInt(i2))? true: false;
                if (uCursor.getInt(i3)) {
                   i6 = 9;
                   b3 = true;
                }else {
                   i6 = 9;
                   b3 = false;
                }
                long longx = uCursor.getLong(i6);
                i6 = 10;
                if (uCursor.isNull(i6)) {
                   i6 = 11;
                   str7 = null;
                }else {
                   str7 = uCursor.getString(i6);
                   i6 = 11;
                }
                if (uCursor.isNull(i6)) {
                   i6 = 12;
                   str8 = null;
                }else {
                   str8 = uCursor.getString(i6);
                   i6 = 12;
                }
                str9 = (uCursor.isNull(i6))? null: uCursor.getString(i6);
                obj = zs.a(intx, longx, str1, str2, str3, str4, str5, str6, str7, str8, str9, b2, b3);
                i4 = 13;
                i3 = 16;
                i2 = 15;
                i1 = 14;
                if (uCursor.isNull(i4) && (uCursor.isNull(i1) && (uCursor.isNull(i2) && uCursor.isNull(i3)))) {
                   uodw = null;
                }else if(uCursor.isNull(i4)){
                   str10 = null;
                }else {
                   str10 = uCursor.getString(i4);
                }
                String str11 = (uCursor.isNull(i1))? null: uCursor.getString(i1);
                String str12 = (uCursor.isNull(i2))? null: uCursor.getString(i2);
                uodw = dw.b(uCursor.getInt(i3), str11, str10, str12);
                i2 = 17;
                i4 = 19;
                i = 18;
                if (uCursor.isNull(i2) && (uCursor.isNull(i) && uCursor.isNull(i4))) {
                   uoat = null;
                }else if(uCursor.isNull(i2)){
                   str12 = null;
                }else {
                   str12 = uCursor.getString(i2);
                }
                i = uCursor.getInt(i);
                i3 = (uCursor.getInt(i4))? true: false;
                uoat = at.b(i, str12, i3);
                ArrayList orDefault = (!uCursor.isNull(i5))? opk.getOrDefault(uCursor.getString(i5), null): null;
                if (orDefault == null) {
                   orDefault = new ArrayList();
                }
                uArrayList.add(du.a(obj, uoat, uodw, orDefault));
                i = 5;
                i1 = 6;
                i2 = 7;
                i3 = 8;
             }
             c.b.r();
             uCursor.close();
             c.b.m();
             return uArrayList;
             break;
           default:
             c.b.c();
             uCursor1 = vv7.J(c.b, b, b1);
             pk opk1 = new pk();
             pk opk2 = new pk();
             pk opk3 = new pk();
             while (uCursor1.moveToNext()) {
                if (!uCursor1.isNull(i5)) {
                   opk1.put(uCursor1.getString(i5), null);
                }
                if (!uCursor1.isNull(b1)) {
                   opk2.put(uCursor1.getString(b1), null);
                }
                if (!uCursor1.isNull(i5)) {
                   str = uCursor1.getString(i5);
                   if (opk3.getOrDefault(str, null) == null) {
                      opk3.put(str, new ArrayList());
                   }
                }
             }
             uCursor1.moveToPosition(i4);
             c.c(opk1);
             c.f(opk2);
             c.e(opk3);
             if (uCursor1.moveToFirst()) {
                if (uCursor1.isNull(i5) && (uCursor1.isNull(b1) && (uCursor1.isNull(2) && (uCursor1.isNull(3) && (uCursor1.isNull(4) && (uCursor1.isNull(5) && (uCursor1.isNull(6) && (uCursor1.isNull(7) && (uCursor1.isNull(8) && (uCursor1.isNull(9) && (uCursor1.isNull(10) && (uCursor1.isNull(11) && uCursor1.isNull(12))))))))))))) {
                   ozs = null;
                }else if(uCursor1.isNull(i5)){
                   str5 = null;
                }else {
                   str5 = uCursor1.getString(i5);
                }
                str6 = (uCursor1.isNull(b1))? null: uCursor1.getString(b1);
                str7 = (uCursor1.isNull(2))? null: uCursor1.getString(2);
                str8 = (uCursor1.isNull(3))? null: uCursor1.getString(3);
                if (uCursor1.isNull(4)) {
                   i7 = 5;
                   str9 = null;
                }else {
                   str9 = uCursor1.getString(4);
                   i7 = 5;
                }
                if (uCursor1.isNull(i7)) {
                   i7 = 6;
                   str13 = null;
                }else {
                   str13 = uCursor1.getString(i7);
                   i7 = 6;
                }
                int intx1 = uCursor1.getInt(i7);
                if (uCursor1.getInt(7)) {
                   i7 = 8;
                   b4 = true;
                }else {
                   i7 = 8;
                   b4 = false;
                }
                if (uCursor1.getInt(i7)) {
                   i7 = 9;
                   b5 = true;
                }else {
                   i7 = 9;
                   b5 = false;
                }
                long longx1 = uCursor1.getLong(i7);
                i7 = 10;
                if (uCursor1.isNull(i7)) {
                   i7 = 11;
                   str14 = null;
                }else {
                   str14 = uCursor1.getString(i7);
                   i7 = 11;
                }
                if (uCursor1.isNull(i7)) {
                   i7 = 12;
                   str15 = null;
                }else {
                   str15 = uCursor1.getString(i7);
                   i7 = 12;
                }
                String str16 = (uCursor1.isNull(i7))? null: uCursor1.getString(i7);
                ozs = zs.a(intx1, longx1, str5, str6, str7, str8, str9, str13, str14, str15, str16, b4, b5);
                uoat = (!uCursor1.isNull(i5))? opk1.getOrDefault(uCursor1.getString(i5), null): null;
                lv orDefault1 = (!uCursor1.isNull(b1))? opk2.getOrDefault(uCursor1.getString(b1), null): null;
                obj1 = (!uCursor1.isNull(i5))? opk3.getOrDefault(uCursor1.getString(i5), null): null;
                if (obj1 == null) {
                   obj1 = new ArrayList();
                }
                obj1 = xs.a(ozs, uoat, orDefault1, obj1);
             }else {
                obj1 = null;
             }
       }
       c.b.r();
       uCursor1.close();
       c.b.m();
       return obj1;
    }
    public final void finalize(){
       jo1 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.y();
             return;
       }
       tb.y();
       return;
    }
}
