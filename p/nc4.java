package p.nc4;
import java.util.concurrent.Callable;
import java.lang.Object;
import p.ln;
import java.util.ArrayList;
import p.lq5;
import p.xy5;
import p.zy5;
import android.database.Cursor;
import p.vv7;
import java.lang.String;
import p.ej4;
import p.jq5;
import java.lang.Long;
import p.nq5;
import p.mq5;
import p.a28;
import p.iy0;
import p.ly0;
import java.lang.Class;
import android.util.Log;
import p.b7;
import p.g54;
import java.io.File;
import java.util.LinkedList;
import p.cc6;
import java.util.Map;
import java.util.Collections;
import p.hf4;
import java.util.List;
import java.lang.Boolean;
import p.xx0;
import java.io.FilenameFilter;
import java.util.Iterator;
import p.ru5;
import p.i77;
import p.tz0;
import p.m07;
import p.i51;
import p.wx0;
import p.hy0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import p.pv6;
import p.j07;
import java.lang.IllegalStateException;
import p.ny0;
import p.vc6;
import p.oe7;
import p.c84;
import p.b84;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.io.Writer;
import java.lang.Throwable;
import java.io.Closeable;
import p.xj0;
import java.lang.Runnable;
import p.kg4;
import org.json.JSONObject;
import p.j56;
import p.nl1;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Process;
import java.lang.Void;
import p.mn;
import android.os.Binder;
import p.ce7;
import p.je7;

public final class nc4 implements Callable	// class@001fae from classes.dex
{
    public final int a;
    public Object b;
    public final Object c;

    public void nc4(Object p0,int p1,Object p2){
       this.a = p1;
       this.c = p0;
       this.b = p2;
       super();
    }
    public void nc4(ln p0){
       this.a = 0;
       this.c = p0;
       super();
    }
    public final ArrayList a(){
       Cursor uCursor;
       int i;
       int i1;
       int i2;
       int i3;
       int i4;
       int i5;
       ArrayList uArrayList;
       Long longx;
       String str6;
       String str = "label";
       String str1 = "title";
       String str2 = "image_uri";
       String str3 = "uri";
       String str4 = "timestamp";
       String str5 = "id";
       int b = false;
       nc4 tc = this.c;
       switch (this.a){
           case 6:
             break;
           default:
             uCursor = vv7.J(tc.a, this.b, b);
             i = ej4.z(uCursor, str5);
             i1 = ej4.z(uCursor, str4);
             i2 = ej4.z(uCursor, str3);
             i3 = ej4.z(uCursor, str2);
             i4 = ej4.z(uCursor, str1);
             b = ej4.z(uCursor, "subtitle");
             i5 = ej4.z(uCursor, str);
             uArrayList = new ArrayList(uCursor.getCount());
             while (uCursor.moveToNext()) {
                mq5 omq5 = new mq5();
                longx = (uCursor.isNull(i))? null: Long.valueOf(uCursor.getLong(i));
                omq5.a = longx;
                longx = (uCursor.isNull(i1))? null: Long.valueOf(uCursor.getLong(i1));
                omq5.b = longx;
                str6 = (uCursor.isNull(i2))? null: uCursor.getString(i2);
                omq5.c = str6;
                str6 = (uCursor.isNull(i3))? null: uCursor.getString(i3);
                omq5.d = str6;
                str6 = (uCursor.isNull(i4))? null: uCursor.getString(i4);
                omq5.e = str6;
                str6 = (uCursor.isNull(b))? null: uCursor.getString(b);
                omq5.f = str6;
                str6 = (uCursor.isNull(i5))? null: uCursor.getString(i5);
                omq5.g = str6;
                uArrayList.add(omq5);
             }
             uCursor.close();
             return uArrayList;
       }
       uCursor = vv7.J(tc.b, this.b, b);
       i = ej4.z(uCursor, str5);
       i1 = ej4.z(uCursor, str4);
       i2 = ej4.z(uCursor, str3);
       i3 = ej4.z(uCursor, str2);
       i4 = ej4.z(uCursor, str1);
       b = ej4.z(uCursor, "context_uri");
       i5 = ej4.z(uCursor, str);
       uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          jq5 ojq5 = new jq5();
          longx = (uCursor.isNull(i))? null: Long.valueOf(uCursor.getLong(i));
          ojq5.a = longx;
          longx = (uCursor.isNull(i1))? null: Long.valueOf(uCursor.getLong(i1));
          ojq5.b = longx;
          str6 = (uCursor.isNull(i2))? null: uCursor.getString(i2);
          ojq5.c = str6;
          str6 = (uCursor.isNull(i3))? null: uCursor.getString(i3);
          ojq5.d = str6;
          str6 = (uCursor.isNull(i4))? null: uCursor.getString(i4);
          ojq5.e = str6;
          str6 = (uCursor.isNull(b))? null: uCursor.getString(b);
          ojq5.f = str6;
          str6 = (uCursor.isNull(i5))? null: uCursor.getString(i5);
          ojq5.g = str6;
          uArrayList.add(ojq5);
       }
       uCursor.close();
       return uArrayList;
    }
    public final a28 b(){
       int len;
       a28 uoa28;
       nc4 tc = this.c;
       switch (this.a){
           case 4:
             break;
           default:
             return ny0.a(tc, this.b);
       }
       ly0 n = tc.c.n;
       n.getClass();
       String str = "FirebaseCrashlytics";
       int i = 3;
       Log.isLoggable(str, i);
       File[] uFileArray = n.b.a.k();
       g54 a = n.b.a;
       a.getClass();
       File[] uFileArray1 = new File(a.h(), "native-sessions").listFiles();
       int i1 = 0;
       if (uFileArray1 == null) {
          uFileArray1 = new File[i1];
       }
       LinkedList linkedList = new LinkedList();
       if (uFileArray != null) {
          len = uFileArray.length;
          for (int i2 = 0; i2 < len; i2 = i2 + 1) {
             object oobject = uFileArray[i2];
             oobject.getPath();
             Log.isLoggable(str, i);
             linkedList.add(new cc6(oobject, Collections.emptyMap()));
          }
       }
       int len1 = uFileArray1.length;
       for (len = 0; len < len1; len = len + 1) {
          linkedList.add(new hf4(uFileArray1[len]));
       }
       if (linkedList.isEmpty()) {
          Log.isLoggable(str, i);
       }
       iy0 c = tc.c;
       if (!this.b.booleanValue()) {
          Log.isLoggable(str, i);
          uFileArray1 = c.l(xx0.a);
          int len2 = uFileArray1.length;
          for (; i1 < len2; i1 = i1 + 1) {
             uFileArray1[i1].delete();
          }
          c.n.getClass();
          Iterator iterator = linkedList.iterator();
          while (iterator.hasNext()) {
             iterator.next().remove();
          }
          iterator = c.t.b.c().iterator();
          while (iterator.hasNext()) {
             iterator.next().delete();
          }
          c.x.b(null);
          uoa28 = vv7.t(null);
       }else {
          Log.isLoggable(str, i);
          boolean b = this.b.booleanValue();
          ly0 c1 = c.c;
          if (b) {
             c1.h.b(null);
             wx0 a1 = c.f.a;
             uoa28 = tc.a.g(a1, new hy0(this, linkedList, b, a1));
          }else {
             c1.getClass();
             throw new IllegalStateException("An invalid data collection token was used.");
          }
       }
       return uoa28;
    }
    public final void c(){
       Closeable uCloseable;
       BufferedWriter f1;
       int i1;
       oe7 a;
       Closeable uCloseable1;
       nc4 tc = this.c;
       switch (this.a){
           case 1:
           case 2:
             ly0 t = tc.t;
             i77 f = t.f;
             int i = 3;
             if (f == null) {
                Log.isLoggable("FirebaseCrashlytics", i);
             }else if((a = t.e.a) == null){
                Log.isLoggable("FirebaseCrashlytics", i);
             }else {
                i77 b = t.b;
                b.getClass();
                tz0 b1 = b.b;
                try{
                   File uFile1 = new File(b1, f);
                   tz0.i(new File(uFile1, "user"), a);
                }catch(java.io.IOException e0){
                   Log.isLoggable("FirebaseCrashlytics", i);
                }
             }
             tc = this.b;
             File uFile = new c84(tc.h()).a(tc.g());
             try{
                String str = new b84(tc).toString();
                OutputStreamWriter outputStream = new OutputStreamWriter(new FileOutputStream(uFile), c84.b);
                try{
                   f1 = new BufferedWriter(outputStream);
                   f1.write(str);
                   f1.flush();
                label_008b :
                   xj0.l(uCloseable, "Failed to close user metadata file.");
                   return;
                }catch(java.lang.Exception e0){
                   i1 = f1;
                }
                Log.e("FirebaseCrashlytics", "Error serializing user metadata.", e0);
                uCloseable = null;
                goto label_008b ;
             }catch(java.lang.Exception e0){
             }
             break;
           default:
             BufferedWriter File uFile2 = tc.h();
             nc4 tb = this.b;
             String str1 = kg4.l(tc.g(), "keys.meta");
             try{
                File uFile3 = new File(uFile2, str1);
                str1 = new JSONObject(tb).toString();
                OutputStreamWriter outputStream1 = new OutputStreamWriter(new FileOutputStream(uFile3), c84.b);
                try{
                   uFile2 = new BufferedWriter(outputStream1);
                   uFile2.write(str1);
                   uFile2.flush();
                label_00ea :
                   xj0.l(uCloseable1, "Failed to close key/value metadata file.");
                   return;
                }catch(java.lang.Exception e0){
                   i1 = uFile2;
                }
                Log.e("FirebaseCrashlytics", "Error serializing key/value metadata.", e0);
                uCloseable1 = null;
                goto label_00ea ;
             }catch(java.lang.Exception e0){
             }
       }
       this.b.run();
       return;
    }
    public final Object call(){
       int b = false;
       nc4 tc = this.c;
       Long longx = null;
       switch (this.a){
           case 0:
             nc4 onc4 = tc;
             onc4.v.set(true);
             Process.setThreadPriority(10);
             nc4 onc41 = tc;
             onc41.getClass();
             onc41.x.c();
             Binder.flushPendingCommands();
             onc4.a(longx);
             return longx;
           case 1:
             this.c();
             return longx;
           case 2:
             this.c();
             return longx;
           case 3:
             this.c();
             return longx;
           case 4:
             return this.b();
           case 5:
             return this.b();
           case 6:
             return this.a();
           case 7:
             return this.a();
           case 8:
             String str = "Query returned empty result set: ";
             Cursor uCursor = vv7.J(tc.c, this.b, b);
             if (uCursor.moveToFirst() && !uCursor.isNull(b)) {
                longx = Long.valueOf(uCursor.getLong(b));
             }
             if (longx != null) {
                uCursor.close();
                return longx;
             }else {
                throw new nl1(str.concat(this.b.f()));
             }
             break;
           default:
             Cursor uCursor1 = vv7.J(tc.a, this.b, b);
             b = ej4.z(uCursor1, "id");
             int i = ej4.z(uCursor1, "birth_date");
             int i1 = ej4.z(uCursor1, "country");
             int i2 = ej4.z(uCursor1, "display_name");
             int i3 = ej4.z(uCursor1, "email");
             int i4 = ej4.z(uCursor1, "href");
             int i5 = ej4.z(uCursor1, "uri");
             int i6 = ej4.z(uCursor1, "product");
             if (uCursor1.moveToFirst()) {
                je7 oje7 = new je7();
                String str1 = (uCursor1.isNull(b))? longx: uCursor1.getString(b);
                oje7.a = str1;
                str1 = (uCursor1.isNull(i))? longx: uCursor1.getString(i);
                oje7.b = str1;
                str1 = (uCursor1.isNull(i1))? longx: uCursor1.getString(i1);
                oje7.c = str1;
                str1 = (uCursor1.isNull(i2))? longx: uCursor1.getString(i2);
                oje7.d = str1;
                str1 = (uCursor1.isNull(i3))? longx: uCursor1.getString(i3);
                oje7.e = str1;
                str1 = (uCursor1.isNull(i4))? longx: uCursor1.getString(i4);
                oje7.f = str1;
                str1 = (uCursor1.isNull(i5))? longx: uCursor1.getString(i5);
                oje7.g = str1;
                if (!uCursor1.isNull(i6)) {
                   longx = uCursor1.getString(i6);
                }
                oje7.h = longx;
                longx = oje7;
             }
             uCursor1.close();
             return longx;
       }
    }
    public final void finalize(){
       switch (this.a){
           case 6:
             this.b.y();
             return;
           case 7:
             this.b.y();
             return;
           case 8:
             this.b.y();
             return;
           case 9:
             this.b.y();
             return;
           default:
             super.finalize();
             return;
       }
    }
}
