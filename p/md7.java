package p.md7;
import android.content.Context;
import p.y84;
import p.wv1;
import p.fr7;
import java.util.concurrent.Executor;
import p.zx6;
import p.ah0;
import java.lang.Object;
import p.fw;
import java.lang.String;
import p.r87;
import p.oe7;
import p.u16;
import p.yx6;
import java.lang.Iterable;
import java.util.Iterator;
import p.ye7;
import p.mr;
import java.util.ArrayList;
import p.ku;
import p.si4;
import p.vx7;
import java.util.HashMap;
import p.dt;
import java.util.List;
import java.util.Set;
import java.util.Map$Entry;
import p.t67;
import p.d28;
import p.od7;
import java.lang.Long;
import p.xq7;
import p.h18;
import p.ej5;
import java.lang.Integer;
import p.sy7;
import p.d08;
import p.zv7;
import p.tl1;
import p.xl1;
import java.nio.charset.Charset;
import java.util.Map;
import p.zk;
import p.v18;
import android.util.SparseArray;
import p.u18;
import p.c18;
import p.kg4;
import p.m08;
import p.z18;
import java.lang.IllegalStateException;
import p.s08;
import p.k18;
import p.kz7;
import p.s80;
import java.net.URL;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import p.mx7;
import p.g18;
import p.u44;
import java.lang.Class;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import p.g54;
import java.util.zip.DeflaterOutputStream;
import p.nx7;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import p.x08;
import android.util.Log;
import p.ld7;

public final class md7	// class@001e76 from classes.dex
{
    public final Context a;
    public final y84 b;
    public final wv1 c;
    public final fr7 d;
    public final Executor e;
    public final zx6 f;
    public final ah0 g;

    public void md7(Context p0,y84 p1,wv1 p2,fr7 p3,Executor p4,zx6 p5,ah0 p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public final void a(fw p0,int p1){
       mr omr;
       mr omr1;
       dt uodt;
       Iterator iterator5;
       t67 ot671;
       String str3;
       dt b2;
       s80 b3;
       mx7 c2;
       GZIPOutputStream gZIPOutputSt;
       u44 ou441;
       URL uRL;
       nx7 onx7;
       URL uRL1;
       nx7 b6;
       md7 omd7 = this;
       fw uofw = p0;
       r87 or87 = omd7.b.a(uofw.a);
       int i = 0;
       md7 omd71 = omd7.f;
       Object obj = omd71.y(new oe7(omd7, uofw, i));
       if (!obj.iterator().hasNext()) {
          return;
       }
       try{
          long l = -1;
          int i1 = 3;
          if (or87 == null) {
             ye7.r("Uploader", "Unknown backend for %s, deleting event batch for it...", uofw);
             omr = new mr(i1, l);
          }else {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = obj.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().c);
             }
             si4 iterator1 = new si4(i1);
             iterator1.a = uArrayList;
             fw b = uofw.b;
             iterator1.b = b;
             HashMap hashMap = new HashMap();
             Iterator iterator2 = uArrayList.iterator();
             while (iterator2.hasNext()) {
                uodt = iterator2.next();
                dt a = uodt.a;
                if (!hashMap.containsKey(a)) {
                   ArrayList uArrayList1 = new ArrayList();
                   uArrayList1.add(uodt);
                   hashMap.put(a, uArrayList1);
                }else {
                   hashMap.get(a).add(uodt);
                }
             }
             uArrayList = new ArrayList();
             iterator = hashMap.entrySet().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   dt sy7 uodt1 = uEntry.getValue().get(i);
                   t67 ot67 = new t67(i1);
                   ot67.y = d28.a;
                   ot67.b = Long.valueOf(or87.e.a());
                   ot67.c = Long.valueOf(or87.d.a());
                   xq7 oxq7 = new xq7();
                   oxq7.b = h18.a;
                   ej5 uoej5 = new ej5(i1);
                   uoej5.b = Integer.valueOf(uodt1.b("sdk-version"));
                   uoej5.a = uodt1.a("model");
                   uoej5.c = uodt1.a("hardware");
                   uoej5.d = uodt1.a("device");
                   uoej5.e = uodt1.a("product");
                   uoej5.f = uodt1.a("os-uild");
                   uoej5.g = uodt1.a("manufacturer");
                   String str = uodt1.a("fingerprint");
                   uoej5.h = str;
                   ej5 uoej51 = uoej5.c;
                   uodt1 = new sy7(uoej5.b, uoej5.a, uoej51, uoej5.d, uoej5.e, uoej5.f, uoej5.g, str);
                   oxq7.c = uodt1;
                   d08 uod08 = new d08(oxq7.b, uodt1);
                   try{
                      ot67.t = uod08;
                      ot67.v = Integer.valueOf(Integer.parseInt(uEntry.getKey()));
                   }catch(java.lang.NumberFormatException e0){
                      ot67.w = uEntry.getKey();
                   }
                   s08 ArrayList uArrayList2 = new ArrayList();
                   Iterator iterator3 = uEntry.getValue().iterator();
                   while (true) {
                      String str1 = "Missing required properties:";
                      String str2 = "";
                      if (iterator3.hasNext()) {
                         uodt = iterator3.next();
                         dt c = uodt.c;
                         Iterator iterator4 = iterator3;
                         tl1 a1 = c.a;
                         iterator5 = iterator;
                         tl1 b1 = c.b;
                         if (a1.equals(new xl1("proto"))) {
                            ot671 = new t67(2);
                            ot671.v = b1;
                         }else if(a1.equals(new xl1("json"))){
                            t67 ot672 = new t67(2);
                            ot672.w = new String(b1, Charset.forName("UTF-8"));
                            ot671 = ot672;
                         }else {
                            ye7.C("CctTransportBackend");
                            Object[] objArray = new Object[]{a1};
                            String.format("Received event of unsupported encoding %s. Skipping...", objArray);
                         label_02cd :
                            iterator3 = iterator4;
                            iterator = iterator5;
                         }
                         ot671.b = Long.valueOf(uodt.d);
                         ot671.t = Long.valueOf(uodt.e);
                         long zk l1 = ((str3 = uodt.f.get("tz-offset")) == null)? 0: Long.valueOf(str3).longValue();
                         ot671.x = Long.valueOf(l1);
                         l1 = new zk();
                         l1.a = uoej51.a.get(uodt.b("net-type"));
                         u18 ou18 = u18.a.get(uodt.b("mobile-subtype"));
                         l1.b = ou18;
                         ot671.y = new c18(l1.a, ou18);
                         if ((b2 = uodt.b) != null) {
                            ot671.c = b2;
                         }
                         if (ot671.b == null) {
                            str2 = " eventTimeMs";
                         }
                         if (ot671.t == null) {
                            str2 = str2.concat(" eventUptimeMs");
                         }
                         if (ot671.x == null) {
                            str2 = kg4.l(str2, " timezoneOffsetSeconds");
                         }
                         if (str2.isEmpty()) {
                            uoej51 = new m08(ot671.b.longValue(), ot671.c, ot671.t.longValue(), ot671.v, ot671.w, ot671.x.longValue(), ot671.y);
                            uArrayList2.add(b2);
                            goto label_02cd ;
                         }else {
                            throw new IllegalStateException(str1.concat(str2));
                         }
                      }else {
                         iterator5 = iterator;
                         ot67.x = uArrayList2;
                         if (ot67.b == null) {
                            str2 = " requestTimeMs";
                         }
                         if (ot67.c == null) {
                            str2 = str2.concat(" requestUptimeMs");
                         }
                         if (str2.isEmpty()) {
                            uArrayList2 = new s08(ot67.b.longValue(), ot67.c.longValue(), ot67.t, ot67.v, ot67.w, ot67.x, ot67.y);
                            uArrayList.add(uArrayList2);
                            i1 = 3;
                            i = 0;
                            iterator = iterator5;
                         }else {
                            throw new IllegalStateException(str1.concat(str2));
                         }
                      }
                   }
                   ld7 omr2 = new ld7(this, omr1, obj, p0, p1);
                   omd71.y(omr);
                   return;
                }else {
                   kz7 okz7 = new kz7(uArrayList);
                   vx7 c1 = or87.c;
                   if (b != null) {
                      s80 os80 = s80.a(b);
                      if ((b3 = os80.b) == null) {
                         b3 = null;
                      }
                      if ((os80 = os80.a) != null) {
                         try{
                            c1 = new URL(os80);
                         }catch(java.net.MalformedURLException e0){
                            throw new IllegalArgumentException("Invalid url: "+os80, e0);
                         }
                      }
                   }else {
                      b3 = null;
                   }
                   mx7 omx7 = new mx7(c1, okz7, b3);
                   u44 ou44 = new u44(13, or87);
                   i = 5;
                   while (true) {
                      mx7 b4 = omx7.b;
                      mx7 a2 = omx7.a;
                      u44 b5 = ou44.b;
                      b5.getClass();
                      ye7.r("CctTransportBackend", "Making request to: %s", a2);
                      HttpURLConnection httpURLConne = a2.openConnection();
                      httpURLConne.setConnectTimeout(0x7530);
                      httpURLConne.setReadTimeout(b5.f);
                      httpURLConne.setDoOutput(true);
                      httpURLConne.setInstanceFollowRedirects(false);
                      httpURLConne.setRequestMethod("POST");
                      Object[] objArray1 = new Object[true];
                      objArray1[0] = "2.3.1";
                      httpURLConne.setRequestProperty("User-Agent", String.format("datatransport/%s android/", objArray1));
                      String str4 = "Content-Encoding";
                      String str5 = "gzip";
                      httpURLConne.setRequestProperty(str4, str5);
                      String str6 = "Content-Type";
                      httpURLConne.setRequestProperty(str6, "application/json");
                      httpURLConne.setRequestProperty("Accept-Encoding", str5);
                      if ((c2 = omx7.c) != null) {
                         httpURLConne.setRequestProperty("X-Goog-Api-Key", c2);
                         break ;
                      }else {
                      }
                   }
                   try{
                      OutputStream outputStream = httpURLConne.getOutputStream();
                      gZIPOutputSt = new GZIPOutputStream(outputStream);
                      ou441 = ou44;
                      b5.a.n(b4, new BufferedWriter(new OutputStreamWriter(gZIPOutputSt)));
                      gZIPOutputSt.close();
                      if (outputStream != null) {
                         try{
                            outputStream.close();
                         label_0405 :
                            i1 = httpURLConne.getResponseCode();
                            ye7.C("CctTransportBackend");
                            httpURLConne.getHeaderField(str6);
                            ye7.C("CctTransportBackend");
                            httpURLConne.getHeaderField(str4);
                            ye7.C("CctTransportBackend");
                            if (i1 != 302 && (i1 != 301 && i1 != 307)) {
                               if (i1 != 200) {
                                  onx7 = new nx7(i1, null, 0);
                               }else {
                                  InputStream inputStream = httpURLConne.getInputStream();
                                  GZIPInputStream gZIPInputStr = (str5.equals(httpURLConne.getHeaderField(str4)))? new GZIPInputStream(inputStream): inputStream;
                                  onx7 = new nx7(i1, null, x08.a(new BufferedReader(new InputStreamReader(gZIPInputStr))).a);
                                  if (gZIPInputStr != null) {
                                     gZIPInputStr.close();
                                  }
                                  if (inputStream != null) {
                                     inputStream.close();
                                  }
                               }
                            }else {
                               onx7 = new nx7(i1, new URL(httpURLConne.getHeaderField("Location")), 0);
                            }
                         }catch(java.net.ConnectException e0){
                         }catch(java.net.UnknownHostException e0){
                         }catch(p.yl1 e0){
                         }catch(java.io.IOException e0){
                         }
                      }else {
                         goto label_0405 ;
                      }
                      nx7 a3 = 0;
                      if ((b6 = onx7.b) != null) {
                         ye7.r("CctTransportBackend", "Following redirect to: %s", b6);
                         uRL1 = new mx7(b6, b4, omx7.c);
                      }
                      if ((omx7 = uRL1) != null && (i = i - 1) >= 1) {
                         ou44 = ou441;
                      }else if((a3 = onx7.a) == 200){
                         omr1 = new mr(1, onx7.c);
                      }else if(a3 < 500 && a3 != 404){
                         omr = new mr(3, -1);
                      }else {
                         omr = new mr(2, -1);
                      }
                   }catch(java.net.ConnectException e0){
                   }catch(java.net.UnknownHostException e0){
                   }catch(p.yl1 e0){
                   }catch(java.io.IOException e0){
                   }
                   ou441 = new OutputStreamWriter(gZIPOutputSt);
                   Log.e(ye7.C("CctTransportBackend"), "Couldn\'t encode request, returning with 400", e0);
                   onx7 = new nx7(400, null, 0);
                }
             }
          }
       }catch(java.lang.IllegalArgumentException e0){
          omr = new mr(3, -1);
       }catch(java.io.IOException e0){
          Log.e(ye7.C("CctTransportBackend"), "Could not make request to the backend", e0);
          omr = new mr(2, -1);
       }
       omr1 = omr;
    }
}
