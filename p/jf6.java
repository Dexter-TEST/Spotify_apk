package p.jf6;
import java.util.concurrent.Callable;
import p.kf6;
import p.zy5;
import java.lang.Object;
import p.xy5;
import android.database.Cursor;
import p.vv7;
import p.pk;
import java.lang.String;
import p.wh6;
import java.util.ArrayList;
import p.lv;
import p.jv;

public final class jf6 implements Callable	// class@001ac8 from classes.dex
{
    public final int a;
    public final zy5 b;
    public final kf6 c;

    public void jf6(kf6 p0,zy5 p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public final Object call(){
       Cursor uCursor;
       pk opk;
       String str;
       String str1;
       String str2;
       String str3;
       String str4;
       lv olv;
       String str6;
       lv olv1;
       jf6 ojf6 = this;
       int i = 2;
       int i1 = 3;
       int i2 = -1;
       jv ojv = null;
       jf6 b = ojf6.b;
       jf6 c = ojf6.c;
       switch (ojf6.a){
           case 0:
             c.b.c();
             uCursor = vv7.J(c.b, b, true);
             opk = new pk();
             while (uCursor.moveToNext()) {
                if (!uCursor.isNull(0)) {
                   str = uCursor.getString(0);
                   if (opk.getOrDefault(str, ojv) == null) {
                      opk.put(str, new ArrayList());
                   }
                }
             }
             uCursor.moveToPosition(i2);
             c.a(opk);
             ArrayList uArrayList = new ArrayList(uCursor.getCount());
             while (uCursor.moveToNext()) {
                if (uCursor.isNull(0) && (uCursor.isNull(true) && (uCursor.isNull(i) && (uCursor.isNull(i1) && (uCursor.isNull(4) && (uCursor.isNull(5) && uCursor.isNull(6))))))) {
                   olv = ojv;
                }else if(uCursor.isNull(0)){
                   str1 = ojv;
                }else {
                   str1 = uCursor.getString(0);
                }
                str2 = (uCursor.isNull(true))? ojv: uCursor.getString(true);
                str3 = (uCursor.isNull(i))? ojv: uCursor.getString(i);
                str4 = (uCursor.isNull(i1))? ojv: uCursor.getString(i1);
                long longx = uCursor.getLong(4);
                boolean b1 = (uCursor.getInt(5))? true: false;
                String str5 = (uCursor.isNull(6))? ojv: uCursor.getString(6);
                olv = lv.a(longx, str1, str2, str3, str4, str5, b1);
                ArrayList orDefault = (!uCursor.isNull(0))? opk.getOrDefault(uCursor.getString(0), ojv): ojv;
                if (orDefault == null) {
                   orDefault = new ArrayList();
                }
                uArrayList.add(jv.a(olv, orDefault));
             }
             c.b.r();
             uCursor.close();
             c.b.m();
             return uArrayList;
             break;
           default:
             c.b.c();
             uCursor = vv7.J(c.b, b, true);
             opk = new pk();
             while (uCursor.moveToNext()) {
                if (!uCursor.isNull(0)) {
                   str = uCursor.getString(0);
                   if (opk.getOrDefault(str, ojv) == null) {
                      opk.put(str, new ArrayList());
                   }
                }
             }
             uCursor.moveToPosition(i2);
             c.a(opk);
             if (uCursor.moveToFirst()) {
                if (uCursor.isNull(0) && (uCursor.isNull(true) && (uCursor.isNull(i) && (uCursor.isNull(i1) && (uCursor.isNull(4) && (uCursor.isNull(5) && uCursor.isNull(6))))))) {
                   olv1 = ojv;
                }else if(uCursor.isNull(0)){
                   str6 = ojv;
                }else {
                   str6 = uCursor.getString(0);
                }
                str1 = (uCursor.isNull(true))? ojv: uCursor.getString(true);
                str2 = (uCursor.isNull(i))? ojv: uCursor.getString(i);
                str3 = (uCursor.isNull(i1))? ojv: uCursor.getString(i1);
                long longx1 = uCursor.getLong(4);
                boolean b2 = (uCursor.getInt(5))? true: false;
                str4 = (uCursor.isNull(6))? ojv: uCursor.getString(6);
                olv1 = lv.a(longx1, str6, str1, str2, str3, str4, b2);
                if (!uCursor.isNull(0)) {
                   ojv = opk.getOrDefault(uCursor.getString(0), ojv);
                }
                if (ojv == null) {
                   ojv = new ArrayList();
                }
                ojv = jv.a(olv1, ojv);
             }
       }
       c.b.r();
       uCursor.close();
       c.b.m();
       return ojv;
    }
    public final void finalize(){
       jf6 tb = this.b;
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
