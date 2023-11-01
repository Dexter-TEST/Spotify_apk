package p.i8;
import java.util.concurrent.Callable;
import p.j8;
import p.zy5;
import java.lang.Object;
import p.xy5;
import android.database.Cursor;
import p.vv7;
import p.pk;
import java.lang.String;
import p.wh6;
import java.util.ArrayList;
import p.ir;
import p.gr;

public final class i8 implements Callable	// class@001948 from classes.dex
{
    public final int a;
    public final zy5 b;
    public final j8 c;

    public void i8(j8 p0,zy5 p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public final Object call(){
       Cursor uCursor;
       pk opk;
       pk opk1;
       String str;
       ir oir;
       String str3;
       ir oir1;
       int i = 3;
       int i1 = 2;
       int i2 = -1;
       gr ogr = null;
       boolean b = true;
       i8 tb = this.b;
       i8 tc = this.c;
       switch (this.a){
           case 0:
             tc.b.c();
             uCursor = vv7.J(tc.b, tb, b);
             opk = new pk();
             opk1 = new pk();
             while (uCursor.moveToNext()) {
                if (!uCursor.isNull(0)) {
                   str = uCursor.getString(0);
                   if (opk.getOrDefault(str, ogr) == null) {
                      opk.put(str, new ArrayList());
                   }
                }
                if (!uCursor.isNull(0)) {
                   str = uCursor.getString(0);
                   if (opk1.getOrDefault(str, ogr) == null) {
                      opk1.put(str, new ArrayList());
                   }
                }
             }
             uCursor.moveToPosition(i2);
             tc.a(opk);
             tc.b(opk1);
             ArrayList uArrayList = new ArrayList(uCursor.getCount());
             while (uCursor.moveToNext()) {
                if (uCursor.isNull(0) && (uCursor.isNull(b) && (uCursor.isNull(i1) && uCursor.isNull(i)))) {
                   oir = ogr;
                }else if(uCursor.isNull(0)){
                   str = ogr;
                }else {
                   str = uCursor.getString(0);
                }
                String str1 = (uCursor.isNull(b))? ogr: uCursor.getString(b);
                long longx = uCursor.getLong(i1);
                String str2 = (uCursor.isNull(i))? ogr: uCursor.getString(i);
                oir = ir.a(longx, str, str1, str2);
                ArrayList orDefault = (!uCursor.isNull(0))? opk.getOrDefault(uCursor.getString(0), ogr): ogr;
                if (orDefault == null) {
                   orDefault = new ArrayList();
                }
                ArrayList orDefault1 = (!uCursor.isNull(0))? opk1.getOrDefault(uCursor.getString(0), ogr): ogr;
                if (orDefault1 == null) {
                   orDefault1 = new ArrayList();
                }
                uArrayList.add(gr.a(oir, orDefault, orDefault1));
             }
             tc.b.r();
             uCursor.close();
             tc.b.m();
             return uArrayList;
             break;
           default:
             tc.b.c();
             uCursor = vv7.J(tc.b, tb, b);
             opk = new pk();
             opk1 = new pk();
             while (uCursor.moveToNext()) {
                if (!uCursor.isNull(0)) {
                   str = uCursor.getString(0);
                   if (opk.getOrDefault(str, ogr) == null) {
                      opk.put(str, new ArrayList());
                   }
                }
                if (!uCursor.isNull(0)) {
                   str = uCursor.getString(0);
                   if (opk1.getOrDefault(str, ogr) == null) {
                      opk1.put(str, new ArrayList());
                   }
                }
             }
             uCursor.moveToPosition(i2);
             tc.a(opk);
             tc.b(opk1);
             if (uCursor.moveToFirst()) {
                if (uCursor.isNull(0) && (uCursor.isNull(b) && (uCursor.isNull(i1) && uCursor.isNull(i)))) {
                   oir1 = ogr;
                }else if(uCursor.isNull(0)){
                   str3 = ogr;
                }else {
                   str3 = uCursor.getString(0);
                }
                String str4 = (uCursor.isNull(b))? ogr: uCursor.getString(b);
                long longx1 = uCursor.getLong(i1);
                String str5 = (uCursor.isNull(i))? ogr: uCursor.getString(i);
                oir1 = ir.a(longx1, str3, str4, str5);
                ArrayList orDefault2 = (!uCursor.isNull(0))? opk.getOrDefault(uCursor.getString(0), ogr): ogr;
                if (orDefault2 == null) {
                   orDefault2 = new ArrayList();
                }
                if (!uCursor.isNull(0)) {
                   ogr = opk1.getOrDefault(uCursor.getString(0), ogr);
                }
                if (ogr == null) {
                   ogr = new ArrayList();
                }
                ogr = gr.a(oir1, orDefault2, ogr);
             }
       }
       tc.b.r();
       uCursor.close();
       tc.b.m();
       return ogr;
    }
    public final void finalize(){
       i8 tb = this.b;
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
