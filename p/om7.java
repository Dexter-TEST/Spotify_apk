package p.om7;
import android.os.AsyncTask;
import p.m60;
import p.ob2;
import android.content.Context;
import p.l60;
import p.rm7;
import java.lang.String;
import android.os.Bundle;
import java.lang.Object;
import p.co5;
import java.lang.Exception;
import java.lang.Void;
import android.os.BaseBundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ConcurrentLinkedQueue;
import p.a3;
import p.az5;
import java.util.Iterator;
import p.um2;
import android.net.Uri;
import p.av6;
import p.nm7;
import p.tm2;
import p.do5;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.Boolean;
import android.app.Dialog;
import p.ny1;
import java.util.List;
import p.uk;
import org.json.JSONArray;
import java.util.Collection;
import java.lang.Double;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Long;
import p.eb3;
import java.lang.StringBuilder;
import p.sz1;
import p.ej4;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.IllegalStateException;
import p.t50;

public final class om7 extends AsyncTask	// class@00214f from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;

    public void om7(m60 p0,ob2 p1,Context p2,l60 p3){
       this.a = 1;
       this.e = p0;
       super();
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void om7(rm7 p0,String p1,Bundle p2){
       this.a = 0;
       co5.o(p0, "this$0");
       co5.o(p1, "action");
       this.e = p0;
       super();
       this.b = p1;
       this.c = p2;
       Exception[] uExceptionAr = new Exception[0];
       this.d = uExceptionAr;
    }
    public final Object doInBackground(Object[] p0){
       String[] stringArray;
       String[] stringArray1;
       ConcurrentLinkedQueue uConcurrentL;
       int i2;
       Iterator iterator;
       int i3;
       Uri uri;
       int i4;
       int responseCode;
       int i = -1;
       int i1 = 0;
       switch (this.a){
           case 0:
             try{
                co5.o(p0, "p0");
                if ((stringArray = this.c.getStringArray("media")) != null) {
                   stringArray1 = new String[stringArray.length];
                   Exception[] uExceptionAr = new Exception[stringArray.length];
                   this.d = uExceptionAr;
                   CountDownLatch uCountDownLa = new CountDownLatch(stringArray.length);
                   uConcurrentL = new ConcurrentLinkedQueue();
                   a3 uoa3 = az5.D();
                   if ((i2 = stringArray.length + i) >= 0) {
                      i = 0;
                      while (true) {
                         i3 = i + 1;
                         if (this.isCancelled()) {
                            iterator = uConcurrentL.iterator();
                            while (iterator.hasNext()) {
                               iterator.next().cancel(true);
                            }
                         }else if((uri = Uri.parse(stringArray[i])) != null && (av6.i0("http", uri.getScheme(), true) && (!av6.i0("https", uri.getScheme(), true) && !av6.i0("fbstaging", uri.getScheme(), true)))){
                            i4 = 1;
                         }else {
                            i4 = 0;
                         }
                         if (i4) {
                            stringArray1[i] = uri.toString();
                            uCountDownLa.countDown();
                         }else {
                            co5.l(uri, "uri");
                            uConcurrentL.add(do5.O(uoa3, uri, new nm7(stringArray1, i, this, uCountDownLa)).d());
                         }
                         if (i3 <= i2) {
                            i = i3;
                         }
                      }
                   }
                   uCountDownLa.await();
                }
             }catch(java.lang.Exception e0){
                iterator = uConcurrentL.iterator();
             label_00b6 :
                if (iterator.hasNext()) {
                   iterator.next().cancel(true);
                   goto label_00b6 ;
                }
             }
             stringArray1 = null;
             break;
           default:
             om7 tb = this.b;
             stringArray1 = 200;
             try{
                HttpURLConnection httpURLConne = new URL(tb.v).openConnection();
                httpURLConne.setRequestMethod("GET");
                httpURLConne.connect();
                if ((responseCode = httpURLConne.getResponseCode()) == stringArray1) {
                   try{
                      ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
                      InputStream inputStream = httpURLConne.getInputStream();
                      byte[] uobyteArray = new byte[1024];
                      while ((i3 = inputStream.read(uobyteArray)) != i) {
                         uByteArrayOu.write(uobyteArray, i1, i3);
                      }
                      tb.w = uByteArrayOu.toString("UTF-8");
                      uByteArrayOu.close();
                      inputStream.close();
                   }catch(java.lang.Exception e0){
                      i = responseCode;
                   }
                   responseCode = i;
                }
                if (responseCode == e0) {
                   i1 = true;
                }
                return Boolean.valueOf(i1);
             }catch(java.lang.Exception e0){
             }
       }
       return stringArray1;
    }
    public final void onPostExecute(Object p0){
       rm7 v;
       om7 tb = this.b;
       om7 tc = this.c;
       int i = 0;
       om7 te = this.e;
       switch (this.a){
           case 0:
             if ((v = te.v) != null) {
                v.dismiss();
             }
             om7 td = this.d;
             int len = td.length;
             while (true) {
                if (i < len) {
                   object oobject = td[i];
                   i = i + 1;
                   if (oobject != null) {
                      te.e(oobject);
                      break ;
                   }
                }else {
                   String str = "Failed to stage photos for web dialog";
                   if (p0 == null) {
                      te.e(new ny1(str));
                      break ;
                   }else {
                      p0 = uk.h0(p0);
                      if (p0.contains(null)) {
                         te.e(new ny1(str));
                         break ;
                      }else {
                         JSONArray jSONArray = new JSONArray(p0);
                         co5.o(tc, "bundle");
                         String str1 = "media";
                         if (jSONArray instanceof Boolean) {
                            tc.putBoolean(str1, jSONArray.booleanValue());
                         }else if(jSONArray instanceof boolean[]){
                            tc.putBooleanArray(str1, jSONArray);
                         }else if(jSONArray instanceof Double){
                            tc.putDouble(str1, jSONArray.doubleValue());
                         }else if(jSONArray instanceof double[]){
                            tc.putDoubleArray(str1, jSONArray);
                         }else if(jSONArray instanceof Integer){
                            tc.putInt(str1, jSONArray.intValue());
                         }else if(jSONArray instanceof int[]){
                            tc.putIntArray(str1, jSONArray);
                         }else if(jSONArray instanceof Long){
                            tc.putLong(str1, jSONArray.longValue());
                         }else if(jSONArray instanceof long[]){
                            tc.putLongArray(str1, jSONArray);
                         }else if(jSONArray instanceof String){
                            tc.putString(str1, jSONArray);
                         }else {
                            tc.putString(str1, jSONArray.toString());
                         }
                         te.a = ej4.e(tc, eb3.l(), sz1.d()+"/dialog/"+tb).toString();
                         if ((p0 = te.w) != null) {
                            te.f(((p0.getDrawable().getIntrinsicWidth() / 2) + 1));
                            break ;
                         }else {
                            throw new IllegalStateException("Required value was null.".toString());
                         }
                      }
                   }
                }
             }
             break;
           default:
             super.onPostExecute(p0);
             if (p0.booleanValue()) {
                te.a(tb, tc, this.d);
             }else if((p0 = this.d) != null){
                p0.n(tb.t);
             }
             te.d = i;
             return;
       }
       return;
    }
}
