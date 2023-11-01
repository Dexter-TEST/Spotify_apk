package p.yk;
import java.util.concurrent.Callable;
import p.zk;
import p.zy5;
import java.lang.Object;
import p.xy5;
import android.database.Cursor;
import p.vv7;
import p.pk;
import java.lang.String;
import p.wh6;
import java.util.ArrayList;
import p.kr;
import p.jr;

public final class yk implements Callable	// class@002dda from classes.dex
{
    public final int a;
    public final zy5 b;
    public final zk c;

    public void yk(zk p0,zy5 p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public final Object call(){
       Cursor uCursor;
       pk opk;
       String str;
       kr okr;
       String str3;
       kr okr1;
       int i = 3;
       int i1 = 2;
       int i2 = -1;
       jr ojr = null;
       boolean b = true;
       yk tb = this.b;
       yk tc = this.c;
       switch (this.a){
           case 0:
             tc.a.c();
             uCursor = vv7.J(tc.a, tb, b);
             opk = new pk();
             while (uCursor.moveToNext()) {
                if (!uCursor.isNull(0)) {
                   str = uCursor.getString(0);
                   if (opk.getOrDefault(str, ojr) == null) {
                      opk.put(str, new ArrayList());
                   }
                }
             }
             uCursor.moveToPosition(i2);
             tc.b(opk);
             ArrayList uArrayList = new ArrayList(uCursor.getCount());
             while (uCursor.moveToNext()) {
                if (uCursor.isNull(0) && (uCursor.isNull(b) && (uCursor.isNull(i1) && uCursor.isNull(i)))) {
                   okr = ojr;
                }else if(uCursor.isNull(0)){
                   str = ojr;
                }else {
                   str = uCursor.getString(0);
                }
                String str1 = (uCursor.isNull(b))? ojr: uCursor.getString(b);
                long longx = uCursor.getLong(i1);
                String str2 = (uCursor.isNull(i))? ojr: uCursor.getString(i);
                okr = kr.a(longx, str, str1, str2);
                ArrayList orDefault = (!uCursor.isNull(0))? opk.getOrDefault(uCursor.getString(0), ojr): ojr;
                if (orDefault == null) {
                   orDefault = new ArrayList();
                }
                uArrayList.add(jr.a(okr, orDefault));
             }
             tc.a.r();
             uCursor.close();
             tc.a.m();
             return uArrayList;
             break;
           default:
             tc.a.c();
             uCursor = vv7.J(tc.a, tb, b);
             opk = new pk();
             while (uCursor.moveToNext()) {
                if (!uCursor.isNull(0)) {
                   str = uCursor.getString(0);
                   if (opk.getOrDefault(str, ojr) == null) {
                      opk.put(str, new ArrayList());
                   }
                }
             }
             uCursor.moveToPosition(i2);
             tc.b(opk);
             if (uCursor.moveToFirst()) {
                if (uCursor.isNull(0) && (uCursor.isNull(b) && (uCursor.isNull(i1) && uCursor.isNull(i)))) {
                   okr1 = ojr;
                }else if(uCursor.isNull(0)){
                   str3 = ojr;
                }else {
                   str3 = uCursor.getString(0);
                }
                String str4 = (uCursor.isNull(b))? ojr: uCursor.getString(b);
                long longx1 = uCursor.getLong(i1);
                String str5 = (uCursor.isNull(i))? ojr: uCursor.getString(i);
                okr1 = kr.a(longx1, str3, str4, str5);
                if (!uCursor.isNull(0)) {
                   ojr = opk.getOrDefault(uCursor.getString(0), ojr);
                }
                if (ojr == null) {
                   ojr = new ArrayList();
                }
                ojr = jr.a(okr1, ojr);
             }
       }
       tc.a.r();
       uCursor.close();
       tc.a.m();
       return ojr;
    }
    public final void finalize(){
       yk tb = this.b;
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
