package p.eh5;
import java.util.concurrent.Callable;
import p.fh5;
import p.zy5;
import java.lang.Object;
import p.xy5;
import android.database.Cursor;
import p.vv7;
import p.pk;
import java.lang.String;
import p.wh6;
import java.util.ArrayList;
import p.yu;
import java.lang.Long;
import p.zu;
import p.iw;
import p.xu;
import java.lang.NullPointerException;

public final class eh5 implements Callable	// class@00148a from classes.dex
{
    public final int a;
    public final zy5 b;
    public final fh5 c;

    public void eh5(fh5 p0,zy5 p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public final Object call(){
       String str3;
       String str4;
       String str5;
       zu ozu;
       String str6;
       iw oiw;
       Cursor uCursor1;
       zu ozu1;
       iw oiw1;
       xu obj1;
       eh5 uoeh5 = this;
       String str = "Null name";
       String str1 = "Null uri";
       int i = 6;
       int i1 = 5;
       int i2 = 2;
       int i3 = 4;
       int i4 = 3;
       int i5 = -1;
       String obj = null;
       eh5 b = uoeh5.b;
       eh5 c = uoeh5.c;
       switch (uoeh5.a){
           case 0:
             c.b.c();
             Cursor uCursor = vv7.J(c.b, b, true);
             pk opk = new pk();
             while (uCursor.moveToNext()) {
                if (!uCursor.isNull(0)) {
                   String str2 = uCursor.getString(0);
                   if (opk.getOrDefault(str2, obj) == null) {
                      opk.put(str2, new ArrayList());
                      obj = null;
                   }
                }
             }
             uCursor.moveToPosition(i5);
             c.a(opk);
             ArrayList uArrayList = new ArrayList(uCursor.getCount());
             while (true) {
                if (uCursor.moveToNext()) {
                   if (uCursor.isNull(0) && (uCursor.isNull(true) && (uCursor.isNull(i2) && (uCursor.isNull(i4) && uCursor.isNull(i3))))) {
                      ozu = null;
                   }else if(uCursor.isNull(0)){
                      str3 = null;
                   }else {
                      str3 = uCursor.getString(0);
                   }
                   obj = (uCursor.isNull(true))? null: uCursor.getString(true);
                   str4 = (uCursor.isNull(i2))? null: uCursor.getString(i2);
                   long longx = uCursor.getLong(i4);
                   str5 = (uCursor.isNull(i3))? null: uCursor.getString(i3);
                   yu oyu = new yu();
                   if (str3 != null) {
                      oyu.b = str3;
                      if (obj != null) {
                         oyu.c = obj;
                         oyu.d = str4;
                         oyu.e = Long.valueOf(longx);
                         oyu.a = str5;
                         ozu = oyu.a();
                      }else {
                         break ;
                      }
                   }else {
                      throw new NullPointerException(str1);
                   }
                   if (uCursor.isNull(i1) && (uCursor.isNull(i) && uCursor.isNull(7))) {
                      oiw = null;
                   }else if(uCursor.isNull(i1)){
                      str5 = null;
                   }else {
                      str5 = uCursor.getString(i1);
                   }
                   str6 = (uCursor.isNull(i))? null: uCursor.getString(i);
                   i5 = 7;
                   obj = (uCursor.isNull(i5))? null: uCursor.getString(i5);
                   oiw = iw.a(str5, str6, obj);
                   ArrayList orDefault = (!uCursor.isNull(0))? opk.getOrDefault(uCursor.getString(0), null): null;
                   if (orDefault == null) {
                      orDefault = new ArrayList();
                   }
                   uArrayList.add(xu.a(ozu, oiw, orDefault));
                   i2 = 2;
                   i3 = 4;
                   i4 = 3;
                }else {
                   c.b.r();
                   uCursor.close();
                   c.b.m();
                   return uArrayList;
                }
             }
             throw new NullPointerException(str);
             break;
           default:
             c.b.c();
             uCursor1 = vv7.J(c.b, b, true);
             pk opk1 = new pk();
             while (uCursor1.moveToNext()) {
                if (!uCursor1.isNull(0)) {
                   str4 = uCursor1.getString(0);
                   if (opk1.getOrDefault(str4, null) == null) {
                      opk1.put(str4, new ArrayList());
                   }
                }
             }
             uCursor1.moveToPosition(i5);
             c.a(opk1);
             if (uCursor1.moveToFirst()) {
                if (uCursor1.isNull(0) && (uCursor1.isNull(true) && (uCursor1.isNull(2) && (uCursor1.isNull(3) && uCursor1.isNull(4))))) {
                   ozu1 = null;
                }else if(uCursor1.isNull(0)){
                   str3 = null;
                }else {
                   str3 = uCursor1.getString(0);
                }
                str4 = (uCursor1.isNull(true))? null: uCursor1.getString(true);
                i3 = 2;
                str5 = (uCursor1.isNull(i3))? null: uCursor1.getString(i3);
                i4 = 3;
                long longx1 = uCursor1.getLong(i4);
                i4 = 4;
                str6 = (uCursor1.isNull(i4))? null: uCursor1.getString(i4);
                yu oyu1 = new yu();
                if (str3 != null) {
                   oyu1.b = str3;
                   if (str4 != null) {
                      oyu1.c = str4;
                      oyu1.d = str5;
                      oyu1.e = Long.valueOf(longx1);
                      oyu1.a = str6;
                      ozu1 = oyu1.a();
                   }else {
                      throw new NullPointerException(str);
                   }
                }else {
                   throw new NullPointerException(str1);
                }
                if (uCursor1.isNull(i1) && (uCursor1.isNull(i) && uCursor1.isNull(7))) {
                   oiw1 = null;
                }else if(uCursor1.isNull(i1)){
                   str = null;
                }else {
                   str = uCursor1.getString(i1);
                }
                str1 = (uCursor1.isNull(i))? null: uCursor1.getString(i);
                i = 7;
                String str7 = (uCursor1.isNull(i))? null: uCursor1.getString(i);
                oiw1 = iw.a(str, str1, str7);
                obj1 = (!uCursor1.isNull(0))? opk1.getOrDefault(uCursor1.getString(0), null): null;
                if (obj1 == null) {
                   obj1 = new ArrayList();
                }
                obj1 = xu.a(ozu1, oiw1, obj1);
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
       eh5 tb = this.b;
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
