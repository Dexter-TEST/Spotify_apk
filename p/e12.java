package p.e12;
import java.util.concurrent.Callable;
import p.g12;
import p.zy5;
import java.lang.Object;
import java.lang.Boolean;
import p.xy5;
import android.database.Cursor;
import p.vv7;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.String;
import p.zv;
import p.bw;

public final class e12 implements Callable	// class@0013f9 from classes.dex
{
    public final int a;
    public final zy5 b;
    public final g12 c;

    public void e12(g12 p0,zy5 p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public final Boolean a(){
       Cursor uCursor;
       Boolean uBoolean1;
       boolean b = true;
       Boolean uBoolean = null;
       e12 tb = this.b;
       e12 tc = this.c;
       switch (this.a){
           case 1:
             uCursor = vv7.J(tc.a, tb, false);
             if (uCursor.moveToFirst()) {
                Integer integer = (uCursor.isNull(false))? uBoolean: Integer.valueOf(uCursor.getInt(false));
                if (integer != null) {
                   if (!integer.intValue()) {
                      b = false;
                   }
                   uBoolean = Boolean.valueOf(b);
                }
             }
             break;
           case 2:
             uCursor = vv7.J(tc.a, tb, false);
             if (uCursor.moveToFirst()) {
                uBoolean1 = (uCursor.isNull(false))? uBoolean: Integer.valueOf(uCursor.getInt(false));
                if (uBoolean1 != null) {
                   if (!uBoolean1.intValue()) {
                      b = false;
                   }
                   uBoolean = Boolean.valueOf(b);
                }
             }
             uCursor.close();
             return uBoolean;
             break;
           case 3:
             uCursor = vv7.J(tc.a, tb, false);
             if (uCursor.moveToFirst()) {
                uBoolean1 = (uCursor.isNull(false))? uBoolean: Integer.valueOf(uCursor.getInt(false));
                if (uBoolean1 != null) {
                   if (!uBoolean1.intValue()) {
                      b = false;
                   }
                   uBoolean = Boolean.valueOf(b);
                }
             }
             uCursor.close();
             return uBoolean;
             break;
           case 4:
             uCursor = vv7.J(tc.a, tb, false);
             if (uCursor.moveToFirst()) {
                uBoolean1 = (uCursor.isNull(false))? uBoolean: Integer.valueOf(uCursor.getInt(false));
                if (uBoolean1 != null) {
                   if (!uBoolean1.intValue()) {
                      b = false;
                   }
                   uBoolean = Boolean.valueOf(b);
                }
             }
             uCursor.close();
             return uBoolean;
             break;
           default:
             uCursor = vv7.J(tc.a, tb, false);
             if (uCursor.moveToFirst()) {
                uBoolean1 = (uCursor.isNull(false))? uBoolean: Integer.valueOf(uCursor.getInt(false));
                if (uBoolean1 != null) {
                   if (!uBoolean1.intValue()) {
                      b = false;
                   }
                   uBoolean = Boolean.valueOf(b);
                }
             }
             uCursor.close();
             return uBoolean;
       }
       uCursor.close();
       return uBoolean;
    }
    public final ArrayList b(){
       Cursor uCursor;
       ArrayList uArrayList;
       String str;
       String str8;
       String str9;
       zv ozv;
       e12 uoe12 = this;
       e12 b = uoe12.b;
       e12 c = uoe12.c;
       int b1 = false;
       switch (uoe12.a){
           case 0:
             break;
           default:
             uCursor = vv7.J(c.a, b, b1);
             uArrayList = new ArrayList(uCursor.getCount());
             while (uCursor.moveToNext()) {
                str = (uCursor.isNull(b1))? null: uCursor.getString(b1);
                int i = 1;
                String str1 = (uCursor.isNull(i))? null: uCursor.getString(i);
                int intx = uCursor.getInt(2);
                b1 = 12;
                int i1 = 11;
                i = 10;
                int i2 = 6;
                if (uCursor.isNull(3) && (uCursor.isNull(4) && (uCursor.isNull(5) && (uCursor.isNull(i2) && (uCursor.isNull(7) && (uCursor.isNull(8) && (uCursor.isNull(9) && (uCursor.isNull(i) && (uCursor.isNull(i1) && (uCursor.isNull(b1) && (uCursor.isNull(13) && uCursor.isNull(14)))))))))))) {
                   ozv = null;
                }else {
                   int i3 = 3;
                   String str2 = (uCursor.isNull(i3))? null: uCursor.getString(i3);
                   String str3 = (uCursor.isNull(4))? null: uCursor.getString(4);
                   String str4 = (uCursor.isNull(5))? null: uCursor.getString(5);
                   String str5 = (uCursor.isNull(i2))? null: uCursor.getString(i2);
                   boolean b2 = (uCursor.getInt(7))? true: false;
                   boolean b3 = (uCursor.getInt(8))? true: false;
                   long longx = uCursor.getLong(9);
                   String str6 = (uCursor.isNull(i))? null: uCursor.getString(i);
                   String str7 = (uCursor.isNull(i1))? null: uCursor.getString(i1);
                   if (uCursor.isNull(b1)) {
                      b1 = 13;
                      str8 = null;
                   }else {
                      str8 = uCursor.getString(b1);
                      b1 = 13;
                   }
                   if (uCursor.isNull(b1)) {
                      b1 = 14;
                      str9 = null;
                   }else {
                      str9 = uCursor.getString(b1);
                      b1 = 14;
                   }
                   String str10 = (uCursor.isNull(b1))? null: uCursor.getString(b1);
                   ozv = zv.a(longx, str2, str3, str4, str5, str6, str7, str8, str9, str10, b2, b3);
                }
                uArrayList.add(bw.b(str, str1, intx, ozv));
                b1 = 0;
             }
             uCursor.close();
             return uArrayList;
       }
       uCursor = vv7.J(c.a, b, b1);
       uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          str = (uCursor.isNull(b1))? null: uCursor.getString(b1);
          uArrayList.add(str);
       }
       uCursor.close();
       return uArrayList;
    }
    public final Object call(){
       switch (this.a){
           case 0:
             return this.b();
           case 1:
             return this.a();
           case 2:
             return this.a();
           case 3:
             return this.a();
           case 4:
             return this.a();
           case 5:
             return this.a();
           default:
             return this.b();
       }
    }
    public final void finalize(){
       e12 tb = this.b;
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
           case 5:
             tb.y();
             return;
           default:
             tb.y();
             return;
       }
    }
}
