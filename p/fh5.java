package p.fh5;
import p.wy7;
import p.pv6;
import java.lang.Object;
import p.c0;
import android.content.Context;
import android.view.View;
import p.w51;
import java.util.ArrayList;
import p.b52;
import java.io.File;
import java.lang.StringBuilder;
import java.lang.String;
import p.db4;
import p.jb7;
import p.kb7;
import p.lb7;
import java.lang.Integer;
import p.ds3;
import p.fb4;
import p.gy0;
import java.util.concurrent.ExecutorService;
import p.xy5;
import p.m91;
import p.pk;
import java.util.Set;
import p.mk;
import p.wh6;
import p.en6;
import p.mi;
import p.zy5;
import java.util.Iterator;
import p.b93;
import android.database.Cursor;
import p.vv7;
import p.ej4;
import p.lt;
import java.util.List;
import p.xy7;
import java.lang.Class;
import java.util.HashMap;
import java.util.Collection;
import p.uy7;
import p.ty7;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.Map;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import android.content.pm.ServiceInfo;
import java.util.Collections;
import android.os.BaseBundle;
import java.lang.reflect.Constructor;
import p.nb7;
import p.mb7;
import p.fb7;
import p.eb4;
import p.gb7;
import p.lu;
import org.json.JSONObject;
import java.lang.Enum;
import java.io.FileOutputStream;
import java.io.IOException;
import p.zu;
import p.rn1;
import p.li5;
import p.aw1;
import p.j07;
import p.vj;
import p.a28;
import p.ly0;
import p.xu5;
import p.uv1;
import p.cc6;
import p.ky0;
import p.nc4;
import java.util.concurrent.Callable;
import p.wx0;
import java.util.concurrent.Executor;
import p.et0;
import p.i77;
import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import p.t67;
import java.lang.Long;
import p.la5;

public final class fh5 implements wy7, pv6	// class@0015cb from classes.dex
{
    public final int a;
    public Object b;
    public Object c;

    public void fh5(){
       this.a = 12;
       super();
       c0 a = c0.a;
       this.b = a;
       this.c = a;
    }
    public void fh5(Context p0){
       this.a = 3;
       super();
       this.c = null;
       this.b = p0;
    }
    public void fh5(View p0){
       this.a = 11;
       super();
       this.b = p0;
    }
    public void fh5(Object p0){
       this.a = 4;
       super();
       w51.k(p0);
       this.c = p0;
       this.b = new ArrayList();
    }
    public void fh5(Object p0,int p1){
       this.a = 4;
       super(p0);
    }
    public void fh5(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public void fh5(b52 p0){
       this.a = 7;
       super();
       p0.a();
       this.b = new File(p0.a.getFilesDir(), "PersistedInstallation."+p0.c()+".json");
       this.c = p0;
    }
    public void fh5(db4 p0){
       this.a = 13;
       this.c = p0;
       super();
       jb7 ojb7 = p0.a.b();
       lb7 v6 = new lb7("abort_skip_button", null, null, null, null);
       ojb7.i.add(v6);
       ojb7.j = true;
       this.b = ojb7.a();
    }
    public void fh5(ds3 p0,fb4 p1){
       this.a = 8;
       super();
       this.b = p0;
       this.c = p1;
    }
    public void fh5(fb4 p0){
       this.a = 14;
       this.c = p0;
       super();
       jb7 ojb7 = p0.b.b();
       lb7 v6 = new lb7("skeleton_view", null, null, null, null);
       ojb7.i.add(v6);
       ojb7.j = true;
       this.b = ojb7.a();
    }
    public void fh5(gy0 p0,ExecutorService p1){
       this.a = 6;
       this.c = p0;
       this.b = p1;
       super();
    }
    public void fh5(xy5 p0){
       this.a = 0;
       super();
       this.b = p0;
       this.c = new m91(this, p0, 13);
    }
    public final void a(pk p0){
       int i2;
       String str1;
       int i3;
       ArrayList orDefault;
       mk omk = p0.keySet();
       if (omk.isEmpty()) {
          return;
       }
       int i = 0;
       int i1 = 999;
       if (p0.c > i1) {
          pk opk = new pk(i1);
          wh6 c = p0.c;
          i = 0;
          while (true) {
             i2 = 0;
             break ;
          }
          while (true) {
             if (i < c) {
                opk.put(p0.h(i), p0.j(i));
                i = i + 1;
                if ((i2 = i2 + 1) == i1) {
                   this.a(opk);
                   opk = new pk(i1);
                }
             }else if(i2 > 0){
                this.a(opk);
                break ;
             }
             break ;
          }
          return;
       }else {
          StringBuilder str = en6.r("SELECT `url`,`width`,`height`,`parent_uri` FROM `images` WHERE `parent_uri` IN \(");
          wh6 c1 = omk.a.c;
          mi.c(c1, str);
          zy5 ozy5 = zy5.x((c1 + i), str+"\)");
          Iterator iterator = omk.iterator();
          i2 = 1;
          while (true) {
             Iterator iterator1 = iterator;
             if (iterator1.hasNext()) {
                if ((str1 = iterator1.next()) == null) {
                   ozy5.z(i2);
                }else {
                   ozy5.s(i2, str1);
                }
                i2 = i2 + 1;
             }else {
                break ;
             }
          }
          Cursor uCursor = vv7.J(this.b, ozy5, i);
          if ((i3 = ej4.y(uCursor, "parent_uri")) == -1) {
             uCursor.close();
             return;
          }else {
             while (uCursor.moveToNext()) {
                if (!uCursor.isNull(i3)) {
                   Integer integer = null;
                   if ((orDefault = p0.getOrDefault(uCursor.getString(i3), integer)) != null) {
                      String str2 = (uCursor.isNull(i))? integer: uCursor.getString(i);
                      Integer integer1 = (uCursor.isNull(1))? integer: Integer.valueOf(uCursor.getInt(1));
                      if (!uCursor.isNull(2)) {
                         integer = Integer.valueOf(uCursor.getInt(2));
                      }
                      orDefault.add(lt.a(integer1, integer, str2));
                   }
                }
             }
             uCursor.close();
             return;
          }
       }
    }
    public final void b(Object p0,String p1){
       p0 = String.valueOf(p0);
       this.b.add(new StringBuilder((p0.length() + (p1.length() + 1)))+p1+"="+p0);
    }
    public final Object c(){
       fh5 tb = this.b;
       fh5 tc = this.c;
       tb.getClass();
       HashMap hashMap = new HashMap();
       Iterator iterator = tb.d.values().iterator();
       while (iterator.hasNext()) {
          uy7 ouy7 = iterator.next();
          ty7 a = ouy7.c.a;
          if (tc.contains(a)) {
             uy7 ouy71 = ((ouy71 = hashMap.get(a)) == null)? -1: ouy71.a;
             if (ouy71 < ouy7.a) {
                hashMap.put(a, ouy7);
             }
          }
       }
       return hashMap;
    }
    public final CctBackendFactory d(String p0){
       PackageManager packageManag;
       ServiceInfo serviceInfo;
       Map map;
       String str = "Could not instantiate %s";
       if (this.c == null) {
          fh5 tb = this.b;
          try{
             if ((packageManag = tb.getPackageManager()) != null && (serviceInfo = packageManag.getServiceInfo(new ComponentName(tb, TransportBackendDiscovery.class), 128)) != null) {
                serviceInfo = serviceInfo.metaData;
             label_002c :
                if (serviceInfo == null) {
                   map = Collections.emptyMap();
                }else {
                   HashMap hashMap = new HashMap();
                   Iterator iterator = serviceInfo.keySet().iterator();
                   while (iterator.hasNext()) {
                      String str1 = iterator.next();
                      String[] obj = serviceInfo.get(str1);
                      if (obj instanceof String && str1.startsWith("backend:")) {
                         obj = obj.split(",", -1);
                         int len = obj.length;
                         int i = 0;
                         while (i < len) {
                            String str2 = obj[i].trim();
                            if (!str2.isEmpty()) {
                               hashMap.put(str2, str1.substring(8));
                            }
                            i = i + 1;
                         }
                      }
                   }
                   map = hashMap;
                }
                this.c = map;
             }
          }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          }
          serviceInfo = null;
          goto label_002c ;
       }
       if ((p0 = this.c.get(p0)) == null) {
          return null;
       }else {
          map = 1;
          try{
             Class[] uClassArray = new Class[0];
             Object[] objArray = new Object[0];
             return Class.forName(p0).asSubclass(CctBackendFactory.class).getDeclaredConstructor(uClassArray).newInstance(objArray);
          }catch(java.lang.ClassNotFoundException e0){
             Object[] objArray1 = new Object[map];
             objArray1[v4] = p0;
             String.format("Class %s is not found.", objArray1);
          }catch(java.lang.IllegalAccessException e0){
             objArray1 = new Object[map];
             objArray1[v4] = p0;
             String.format(v1, objArray1);
          }catch(java.lang.InstantiationException e0){
             objArray1 = new Object[map];
             objArray1[v4] = p0;
             String.format(v1, objArray1);
          }catch(java.lang.NoSuchMethodException e0){
             Object[] objArray2 = new Object[map];
             objArray2[v4] = p0;
             String.format(e0, objArray2);
          }catch(java.lang.reflect.InvocationTargetException e0){
             objArray2 = new Object[map];
             objArray2[v4] = p0;
             String.format(e0, objArray2);
          }
          return v3;
       }
    }
    public final nb7 e(){
       mb7 omb7;
       switch (this.a){
           case 13:
           default:
             omb7 = new mb7();
             omb7.c(this.b);
             omb7.b = this.c.a;
             return omb7.a();
       }
       omb7 = new mb7();
       omb7.c(this.b);
       omb7.b = this.c.b.a;
       return omb7.a();
    }
    public final void f(lu p0){
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("Fid", p0.a);
          jSONObject.put("Status", p0.b.ordinal());
          jSONObject.put("AuthToken", p0.c);
          jSONObject.put("RefreshToken", p0.d);
          jSONObject.put("TokenCreationEpochInSecs", p0.f);
          jSONObject.put("ExpiresInSecs", p0.e);
          jSONObject.put("FisError", p0.g);
          fh5 tc = this.c;
          tc.a();
          File uFile = File.createTempFile("PersistedInstallation", "tmp", tc.a.getFilesDir());
          FileOutputStream uFileOutputS = new FileOutputStream(uFile);
          uFileOutputS.write(jSONObject.toString().getBytes("UTF-8"));
          uFileOutputS.close();
          if (!uFile.renameTo(this.b)) {
             throw new IOException("unable to rename the tmpfile to PersistedInstallation");
          }
          return;
       }catch(org.json.JSONException e0){
       }catch(java.io.IOException e0){
       }
    }
    public final void g(zu p0){
       this.b.b();
       this.b.c();
       this.c.h(p0);
       this.b.r();
       this.b.m();
    }
    public final void h(){
       fh5 tc = this.c;
       tc.getClass();
       li5 oli5 = new li5(tc);
       aw1 tc1 = new aw1(oli5);
       mb7 omb7 = new mb7();
       omb7.c(tc1.b);
       omb7.b = tc1.c.c.a;
       this.b.a(omb7.a());
    }
    public final j07 i(Object p0){
       if (p0 == null) {
          p0 = vv7.t(null);
       }else {
          gy0 v = this.c.v;
          xu5 oxu5 = v.k.f(p0);
          File[] uFileArray = v.k();
          int len = uFileArray.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = uFileArray[i];
             ly0.c(oobject, p0.e);
             cc6 uocc6 = new cc6(oobject, ly0.E);
             ky0 oky0 = new ky0(v.b, uocc6, oxu5);
             ly0 f = v.f;
             f.getClass();
             f.a(new nc4(f, 1, oky0));
          }
          j07[] oj07Array = new j07[]{ly0.a(this.c.v),this.c.v.t.y(this.b, et0.c(p0))};
          p0 = vv7.Y(Arrays.asList(oj07Array));
       }
       return p0;
    }
    public final lu j(){
       int i1;
       JSONObject jSONObject;
       int i2;
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       int i = 0x4000;
       byte[] uobyteArray = new byte[i];
       try{
          i1 = 0;
          FileInputStream uFileInputSt = new FileInputStream(this.b);
          while ((i2 = uFileInputSt.read(uobyteArray, i1, i)) >= 0) {
             uByteArrayOu.write(uobyteArray, i1, i2);
          }
          jSONObject = new JSONObject(uByteArrayOu.toString());
          uFileInputSt.close();
       }catch(java.io.IOException e0){
          jSONObject = new JSONObject();
       }catch(org.json.JSONException e0){
       }
       t67 ot67 = new t67(5);
       ot67.x = Long.valueOf(0);
       ot67.g(la5.a);
       ot67.w = Long.valueOf(0);
       ot67.b = jSONObject.optString("Fid", null);
       ot67.g(la5.values()[jSONObject.optInt("Status", i1)]);
       ot67.t = jSONObject.optString("AuthToken", null);
       ot67.v = jSONObject.optString("RefreshToken", null);
       ot67.x = Long.valueOf(jSONObject.optLong("TokenCreationEpochInSecs", 0));
       ot67.w = Long.valueOf(jSONObject.optLong("ExpiresInSecs", 0));
       ot67.y = jSONObject.optString("FisError", null);
       return ot67.d();
    }
    public final String toString(){
       switch (this.a){
           case 4:
             StringBuilder str = new StringBuilder(100)+this.c.getClass().getSimpleName()+'{';
             int i = this.b.size();
             int i1 = 0;
             while (i1 < i) {
                str = str.append(this.b.get(i1));
                int i2 = i - 1;
                if (i1 < i2) {
                   str = str.append(", ");
                }
                i1 = i1 + 1;
             }
             return str+'}';
             break;
       }
       return super.toString();
    }
}
