package p.qo5;
import p.tf3;
import p.r16;
import p.co;
import java.lang.Object;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import p.b60;
import android.location.LocationManager;
import p.z97;
import java.util.ArrayList;
import p.dj7;
import p.aj7;
import p.i01;
import java.lang.String;
import p.co5;
import p.ce2;
import p.h01;
import p.ej7;
import p.bo2;
import p.xy5;
import p.m91;
import p.nr7;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Number;
import p.zy5;
import android.database.Cursor;
import p.vv7;
import p.ej4;
import p.po5;
import java.util.concurrent.TimeUnit;
import java.lang.System;
import p.rn1;
import p.uy;
import p.uw6;
import p.sw6;
import android.os.Handler;
import p.do;
import java.lang.Runnable;
import p.u16;
import p.fw;
import p.dt;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import p.et;
import java.lang.Integer;
import java.lang.Long;
import android.content.ContentValues;
import p.kk5;
import p.nk5;
import android.util.Base64;
import p.tl1;
import p.xl1;
import java.lang.Boolean;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;
import p.ls;
import p.kg4;
import java.lang.IllegalStateException;
import p.at;
import java.lang.NullPointerException;
import java.lang.Class;
import p.vi7;
import java.lang.IllegalArgumentException;
import java.util.LinkedHashMap;
import p.cj7;
import p.me4;
import p.fv1;

public final class qo5 implements tf3, r16, co	// class@0023e4 from classes.dex
{
    public Object a;
    public Object b;
    public Object c;
    public static qo5 t;

    public void qo5(int p0){
       super();
    }
    public void qo5(Context p0){
       super();
       this.c = new ConcurrentHashMap();
       this.b = p0;
       this.a = new b60(this);
    }
    public void qo5(Context p0,LocationManager p1){
       super();
       this.c = new z97();
       this.a = p0;
       this.b = p1;
    }
    public void qo5(Object p0,Object p1,Object p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void qo5(ArrayList p0,ArrayList p1,ArrayList p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void qo5(dj7 p0,aj7 p1,i01 p2){
       co5.o(p0, "store");
       co5.o(p1, "factory");
       co5.o(p2, "defaultCreationExtras");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void qo5(dj7 p0,ce2 p1){
       super(p0, p1, h01.b);
    }
    public void qo5(dj7 p0,ce2 p1,int p2){
       co5.o(p0, "store");
       super(p0, p1);
    }
    public void qo5(ej7 p0,aj7 p1){
       co5.o(p0, "owner");
       co5.o(p1, "factory");
       dj7 viewModelSto = p0.getViewModelStore();
       i01 defaultViewM = (p0 instanceof bo2)? p0.getDefaultViewModelCreationExtras(): h01.b;
       super(viewModelSto, p1, defaultViewM);
       return;
    }
    public void qo5(xy5 p0){
       super();
       this.a = p0;
       this.b = new m91(this, p0, 9);
       this.c = new nr7(this, p0, 1);
    }
    public static void a(qo5 p0,Map p1){
       co5.o(p1, "report");
       Iterator iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          int i = uEntry.getValue().intValue();
          int i1 = 1;
          zy5 ozy5 = zy5.x(i1, "\n            SELECT *\n            FROM RateLimitedEvents\n            WHERE eventName = ?\n        ");
          if (key == null) {
             ozy5.z(i1);
          }else {
             ozy5.s(i1, key);
          }
          p0.a.b();
          Cursor uCursor = vv7.J(p0.a, ozy5, false);
          int i2 = ej4.z(uCursor, "eventName");
          int i3 = ej4.z(uCursor, "count");
          int i4 = ej4.z(uCursor, "timestamp");
          String str = null;
          if (uCursor.moveToFirst()) {
             if (!uCursor.isNull(i2)) {
                str = uCursor.getString(i2);
             }
             str = new po5(uCursor.getInt(i3), uCursor.getLong(i4), str);
          }
          uCursor.close();
          ozy5.y();
          if (str == null) {
             p0.a.b();
             p0.a.c();
             p0.b.h(new po5(i, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()), key));
             p0.a.r();
             p0.a.m();
          }else if(str.b != i){
             p0.a.b();
             uw6 ouw6 = p0.c.c();
             ouw6.P(i1, (long)i);
             ouw6.P(2, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
             i = 3;
             if (key == null) {
                ouw6.z(i);
             }else {
                ouw6.s(i, key);
             }
             p0.a.c();
             ouw6.u();
             p0.a.r();
             p0.a.m();
             p0.c.f(ouw6);
          }
       }
       return;
    }
    public final void abandonAudioFocus(){
       this.c.post(new do(this, 0));
    }
    public final Object apply(Object p0){
       Long longx;
       long l;
       fw b1;
       qo5 ta = this.a;
       qo5 tb = this.b;
       qo5 tc = this.c;
       u16 t = ta.t;
       int i = 0;
       Integer integer = Integer.valueOf(i);
       int i1 = 1;
       boolean i2 = (((ta.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * ta.b().compileStatement("PRAGMA page_count").simpleQueryForLong()) - t.a) >= 0)? 1: 0;
       if (i2) {
          p0 = Long.valueOf(-1);
       }else if((longx = u16.f(p0, tb)) != null){
          l = longx.longValue();
       }else {
          ContentValues uContentValu2 = new ContentValues();
          uContentValu2.put("backend_name", tb.a);
          uContentValu2.put("priority", Integer.valueOf(nk5.a(tb.c)));
          uContentValu2.put("next_request_ms", integer);
          if ((b1 = tb.b) != null) {
             uContentValu2.put("extras", Base64.encodeToString(b1, i));
          }
          l = p0.insert("transport_contexts", null, uContentValu2);
       }
       tl1 b = tc.c.b;
       et e = t.e;
       i2 = (b.length <= e)? true: false;
       ContentValues uContentValu = new ContentValues();
       uContentValu.put("context_id", Long.valueOf(l));
       uContentValu.put("transport_name", tc.a);
       uContentValu.put("timestamp_ms", Long.valueOf(tc.d));
       uContentValu.put("uptime_ms", Long.valueOf(tc.e));
       uContentValu.put("payload_encoding", tc.c.a.a);
       uContentValu.put("code", tc.b);
       uContentValu.put("num_attempts", integer);
       uContentValu.put("inline", Boolean.valueOf(i2));
       tl1 otl1 = (i2)? b: new byte[i];
       uContentValu.put("payload", otl1);
       l = p0.insert("events", null, uContentValu);
       if (!i2) {
          i2 = (int)Math.ceil(((double)b.length / (double)e));
          for (; i1 <= i2; i1 = i1 + 1) {
             int i3 = i1 - 1;
             i3 = i3 * e;
             int i4 = i1 * e;
             uContentValu = new ContentValues();
             uContentValu.put("event_id", Long.valueOf(l));
             uContentValu.put("sequence_num", Integer.valueOf(i1));
             uContentValu.put("bytes", Arrays.copyOfRange(b, i3, Math.min(i4, b.length)));
             p0.insert("event_payloads", null, uContentValu);
          }
       }
       Iterator iterator = Collections.unmodifiableMap(tc.f).entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          ContentValues uContentValu1 = new ContentValues();
          uContentValu1.put("event_id", Long.valueOf(l));
          uContentValu1.put("name", uEntry.getKey());
          uContentValu1.put("value", uEntry.getValue());
          p0.insert("event_metadata", null, uContentValu1);
       }
       p0 = Long.valueOf(l);
       return p0;
    }
    public final ls b(){
       String str = (this.a == null)? " name": "";
       if (this.b == null) {
          str = str.concat(" code");
       }
       if (this.c == null) {
          str = kg4.l(str, " address");
       }
       if (str.isEmpty()) {
          return new ls(this.a, this.b, this.c.longValue());
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final at c(){
       String str = (this.a == null)? " episodeUri": "";
       if (this.b == null) {
          str = str.concat(" position");
       }
       if (this.c == null) {
          str = kg4.l(str, " fullyPlayed");
       }
       if (str.isEmpty()) {
          return new at(this.a, this.b.intValue(), this.c.booleanValue());
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final void d(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null episodeUri");
       }
       this.a = p0;
       return;
    }
    public final void e(){
       this.c.post(new do(this, 1));
    }
    public final void f(boolean p0){
       this.c = Boolean.valueOf(p0);
    }
    public final vi7 g(Class p0){
       String canonicalNam;
       if ((canonicalNam = p0.getCanonicalName()) != null) {
          return this.h(p0, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalNam));
       }
       throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
    public final vi7 h(Class p0,String p1){
       vi7 ovi71;
       vi7 ovi72;
       co5.o(p1, "key");
       qo5 ta = this.a;
       ta.getClass();
       vi7 ovi7 = ta.a.get(p1);
       if (p0.isInstance(ovi7)) {
          qo5 tb = this.b;
          if (tb instanceof cj7) {
          }else {
             tb = null;
          }
          if (tb != null) {
             co5.i(ovi7);
             tb.c(ovi7);
          }
          co5.j(ovi7, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
          return ovi7;
       }else {
          me4 ome4 = new me4(this.c);
          fv1 a = fv1.A;
          i01 a1 = ome4.a;
          try{
             a1.put(a, p1);
             ovi71 = this.b.b(p0, ome4);
          }catch(java.lang.AbstractMethodError e0){
             ovi71 = this.b.a(ovi71);
          }
          ta = this.a;
          ta.getClass();
          co5.o(ovi71, "viewModel");
          if ((ovi72 = ta.a.put(p1, ovi71)) != null) {
             ovi72.b();
          }
          return ovi71;
       }
    }
    public final void i(int p0){
       this.b = Integer.valueOf(p0);
    }
}
