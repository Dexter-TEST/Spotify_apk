package p.aw1;
import p.nh4;
import p.r16;
import p.sn5;
import java.lang.Object;
import p.c0;
import java.util.List;
import java.util.ArrayList;
import p.w14;
import p.md6;
import p.a27;
import p.qy;
import p.qd;
import p.ek3;
import java.lang.String;
import p.co5;
import p.fk3;
import android.os.Handler;
import p.lg4;
import androidx.fragment.app.o;
import p.cc1;
import p.xa;
import p.je2;
import p.li5;
import p.kb7;
import p.jb7;
import p.lb7;
import java.lang.Integer;
import p.lv1;
import p.g54;
import p.vs;
import p.xy5;
import p.m91;
import java.util.AbstractCollection;
import java.lang.Class;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Long;
import p.uv1;
import p.i70;
import p.hs3;
import p.pu1;
import p.fu1;
import java.lang.Boolean;
import p.kf2;
import com.spotify.eventsender.FragmentsContainer;
import p.bd2;
import com.spotify.eventsender.Fragment;
import p.i80;
import p.h80;
import p.u37;
import com.spotify.contexts.Time;
import java.lang.System;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.s74;
import java.lang.Iterable;
import p.ab2;
import p.rp;
import p.jg2;
import p.pg0;
import com.spotify.contexts.ClientContextId;
import java.util.Locale;
import com.google.protobuf.a;
import p.rn1;
import p.uw6;
import p.uy;
import p.r45;
import java.lang.IllegalStateException;
import p.en6;
import p.jj5;
import p.kv1;
import p.rn5;
import java.io.InputStream;
import p.u16;
import p.fw;
import android.database.Cursor;
import p.i77;
import java.util.HashMap;
import p.tl1;
import p.xl1;
import android.database.sqlite.SQLiteDatabase;
import p.dt;
import p.ku;
import java.lang.NullPointerException;
import java.util.LinkedList;
import java.lang.StringBuilder;
import p.mi;
import p.sw6;
import p.zy5;
import p.vv7;
import p.ej4;
import p.kj3;
import p.ub6;
import java.lang.Runnable;

public final class aw1 implements nh4, r16, sn5	// class@001003 from classes.dex
{
    public Object a;
    public Object b;
    public Object c;

    public void aw1(){
       super();
    }
    public void aw1(int p0){
       c0 a = c0.a;
       if (p0 != 12) {
          super();
          this.a = a;
          this.c = a;
          return;
       }else {
          super();
          this.a = a;
          this.b = a;
          this.c = a;
          return;
       }
    }
    public void aw1(Object p0,Object p1,Object p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void aw1(Object p0,List p1,Object p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void aw1(List p0){
       super();
       this.c = p0;
       this.a = new ArrayList(p0.size());
       this.b = new ArrayList(p0.size());
       for (int i = 0; i < p0.size(); i = i + 1) {
          this.a.add(new md6(p0.get(i).b.b));
          this.b.add(p0.get(i).c.a());
       }
       return;
    }
    public void aw1(ek3 p0){
       co5.o(p0, "provider");
       super();
       this.a = new fk3(p0);
       this.b = new Handler();
    }
    public void aw1(ek3 p0,lg4 p1,o p2,cc1 p3){
       co5.o(p0, "lifecycleOwner");
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
       p2.a0("ALLBOARDING_SCREEN_RESPONSE", p0, new xa(this));
    }
    public void aw1(li5 p0){
       this.c = p0;
       super();
       this.a = "";
       jb7 ojb7 = p0.b.b();
       lb7 v0 = new lb7("empty_state_view", null, null, null, this.a);
       ojb7.i.add(v0);
       ojb7.j = true;
       this.b = ojb7.a();
    }
    public void aw1(lv1 p0,g54 p1){
       super();
       this.c = null;
       this.a = p0;
       this.b = p1;
    }
    public void aw1(vs p0){
       super();
       this.a = Integer.valueOf(p0.a);
       this.b = Integer.valueOf(p0.b);
       this.c = p0.c;
    }
    public void aw1(xy5 p0){
       super();
       this.a = c0.a;
       this.b = p0;
       this.c = new m91(this, p0, 8);
    }
    public static void b(aw1 p0,AbstractCollection p1){
       p0.getClass();
       if (p1.size() <= 999) {
          p0.g(p1);
       }else {
          ArrayList uArrayList = new ArrayList(999);
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next());
             if (uArrayList.size() == 999) {
                p0.g(uArrayList);
                uArrayList.clear();
             }
          }
          if (uArrayList.size() > 0) {
             p0.g(uArrayList);
          }
       }
       return;
    }
    public static void c(aw1 p0,String p1,byte[] p2,lv1 p3,byte[] p4,uv1 p5,i70 p6,hs3 p7,boolean p8,String p9,String p10,long p11,String p12){
       aw1 uoaw1 = p0;
       String str = p1;
       byte[] uobyteArray = p2;
       lv1 olv1 = p3;
       byte[] uobyteArray1 = p4;
       String str1 = p12;
       p0.getClass();
       fu1 uofu1 = new fu1();
       uofu1.c = str;
       uofu1.g = pu1.a(p9);
       uofu1.b = Boolean.valueOf(p8);
       uofu1.d = uobyteArray1;
       uofu1.h = p10;
       kf2 okf2 = FragmentsContainer.j();
       bd2 uobd2 = Fragment.i();
       uobd2.d("message");
       uobd2.c(i80.c(uobyteArray, 0, uobyteArray.length));
       okf2.e(uobd2);
       bd2 uobd21 = Fragment.i();
       uobd21.d("context_time");
       u37 ou37 = Time.g();
       int i = 0;
       long l = ((p11 - i) > 0)? p11: System.currentTimeMillis();
       ou37.c(l);
       c uoc = ou37.build();
       co5.l(uoc, "newBuilder\(\).setTimestam…imeMillis\(\)\n    \).build\(\)");
       uobd21.c(uoc.toByteString());
       okf2.d(uobd21.build());
       p5.getClass();
       okf2.c(ab2.b(new ArrayList(p5.b)).m(new rp(8)).m(new rp(9)));
       if (str1) {
          uobd21 = Fragment.i();
          p6.getClass();
          uobd21.d("context_client_context_id");
          pg0 opg0 = ClientContextId.g();
          str1 = str1.toLowerCase(Locale.ROOT);
          co5.l(str1, "this as java.lang.String\).toLowerCase\(Locale.ROOT\)");
          opg0.c(str1);
          c uoc1 = opg0.build();
          co5.l(uoc1, "newBuilder\(\)\n           … \"\"\)\n            .build\(\)");
          uobd21.c(uoc1.toByteString());
          okf2.d(uobd21.build());
       }
       uofu1.f = okf2.build().toByteArray();
       long l1 = olv1.p(str, uobyteArray1);
       l = 1;
       if (!(l1 - i)) {
          l1 = l;
       }
       uofu1.e = l1;
       uoaw1.b.b();
       uoaw1.b.c();
       aw1 c = uoaw1.c;
       uw6 ouw6 = c.c();
       c.g(ouw6, uofu1);
       long l2 = ouw6.Z();
       c.f(ouw6);
       uoaw1.b.r();
       uoaw1.b.m();
       if (uoaw1.a.c() && (uoaw1.a.b().longValue() - l2) >= 0) {
          throw new IllegalStateException(en6.n("DB is overriding saved events for event ", str));
       }else {
          uoaw1.a = r45.d(Long.valueOf(l2));
          olv1.s(new kv1(uofu1.c, (l1 + l), uobyteArray1));
          long l3 = olv1.p(str, uobyteArray1);
          if (l3) {
             l = l3;
          }
          if (l - l1) {
             Object[] objArray = new Object[]{Long.valueOf(l2),str,Long.valueOf(l1)};
             p7.a(String.format(Locale.US, "Event persisted: %d, Name: %s, Sequence No: %d", objArray));
             return;
          }else {
             throw new IllegalStateException(en6.n("DB is overriding saved sequence numbers for event ", str));
          }
       }
    }
    public final void a(int p0,rn5 p1){
       p1.read(this.a, this.b[0], p0);
       aw1 tb = this.b;
       tb[0] = tb[0] + p0;
       p1.close();
    }
    public final Object apply(Object p0){
       String str;
       String str1;
       aw1 uoaw11;
       String str2;
       xl1 v2;
       aw1 uoaw1 = this;
       aw1 a = uoaw1.a;
       aw1 b = uoaw1.b;
       aw1 c = uoaw1.c;
       Cursor uCursor = p0;
       xl1 v = u16.v;
       while (true) {
          if (!uCursor.moveToNext()) {
             return null;
          }
          int i = 0;
          long longx = uCursor.getLong(i);
          int i1 = 1;
          int i2 = (uCursor.getInt(7))? 1: 0;
          int i3 = 4;
          i77 oi77 = new i77(i3);
          oi77.f = new HashMap();
          if ((str = uCursor.getString(i1)) != null) {
             oi77.a = str;
             oi77.d = Long.valueOf(uCursor.getLong(2));
             oi77.e = Long.valueOf(uCursor.getLong(3));
             if (i2) {
                xl1 v1 = ((str1 = uCursor.getString(i3)) == null)? u16.v: new xl1(str1);
                oi77.z(new tl1(v1, uCursor.getBlob(5)));
                uoaw11 = a;
             }else if((str2 = uCursor.getString(i3)) == null){
                v2 = u16.v;
             }else {
                v2 = new xl1(str2);
             }
             String[] stringArray = new String[]{"bytes"};
             String[] stringArray1 = new String[i1];
             stringArray1[i] = String.valueOf(longx);
             Cursor uCursor1 = a.b().query("event_payloads", stringArray, "event_id = ?", stringArray1, null, null, "sequence_num");
             ArrayList uArrayList = new ArrayList();
             int i5 = 0;
             while (uCursor1.moveToNext()) {
                byte[] blob = uCursor1.getBlob(i);
                uArrayList.add(blob);
                i5 = i5 + blob.length;
             }
             byte[] uobyteArray = new byte[i5];
             int i6 = 0;
             int i7 = 0;
             while (i6 < uArrayList.size()) {
                byte[] uobyteArray1 = uArrayList.get(i6);
                System.arraycopy(uobyteArray1, 0, uobyteArray, i7, uobyteArray1.length);
                i7 = i7 + uobyteArray1.length;
                i6 = i6 + 1;
                a = a;
             }
             uoaw11 = a;
             uCursor1.close();
             oi77.z(new tl1(v2, uobyteArray));
             int i4 = 6;
             if (!uCursor.isNull(i4)) {
                oi77.b = Integer.valueOf(uCursor.getInt(i4));
             }
             b.add(new ku(longx, c, oi77.i()));
             a = uoaw11;
          }else {
             break ;
          }
       }
       throw new NullPointerException("Null transportName");
    }
    public final vs d(){
       String str = (this.a == null)? " from": "";
       if (this.b == null) {
          str = str.concat(" to");
       }
       if (str.isEmpty()) {
          return new vs(this.a.intValue(), this.b.intValue(), this.c);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final void e(LinkedList p0,LinkedList p1,lv1 p2){
       this.b.c();
       this.f(p0);
       p2.j(p1);
       this.b.r();
       this.b.m();
    }
    public final void f(AbstractCollection p0){
       this.b.c();
       aw1.b(this, p0);
       this.b.r();
       this.b.m();
    }
    public final void g(AbstractCollection p0){
       Long longx;
       this.b.b();
       StringBuilder str = "DELETE FROM Events WHERE id IN \(";
       mi.c(p0.size(), str);
       uw6 ouw6 = this.b.e(str+"\)");
       Iterator iterator = p0.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          if ((longx = iterator.next()) == null) {
             ouw6.z(i);
          }else {
             ouw6.P(i, longx.longValue());
          }
          i = i + 1;
       }
       this.b.c();
       ouw6.u();
       this.b.r();
       this.b.m();
       return;
    }
    public final ArrayList h(String p0){
       Boolean uBoolean;
       aw1 uoaw1 = this;
       String str = p0;
       boolean i = 1;
       zy5 ozy5 = zy5.x(i, "SELECT * FROM Events WHERE deviceId IS NULL OR deviceId <> ? ORDER BY id ASC");
       if (!str) {
          ozy5.z(i);
       }else {
          ozy5.s(i, str);
       }
       uoaw1.b.b();
       Cursor uCursor = vv7.J(uoaw1.b, ozy5, false);
       int i1 = ej4.z(uCursor, "id");
       int i2 = ej4.z(uCursor, "authenticated");
       int i3 = ej4.z(uCursor, "eventName");
       int i4 = ej4.z(uCursor, "sequenceId");
       int i5 = ej4.z(uCursor, "sequenceNumber");
       int i6 = ej4.z(uCursor, "fragments");
       int i7 = ej4.z(uCursor, "owner");
       int i8 = ej4.z(uCursor, "deviceId");
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          fu1 uofu1 = new fu1();
          uofu1.a = uCursor.getLong(i1);
          String str1 = null;
          Integer integer = (uCursor.isNull(i2))? str1: Integer.valueOf(uCursor.getInt(i2));
          if (integer == null) {
             uBoolean = str1;
          }else if(integer.intValue()){
             i = true;
          }else {
             i = false;
          }
          uBoolean = Boolean.valueOf(i);
          uofu1.b = uBoolean;
          uofu1.c = (uCursor.isNull(i3))? str1: uCursor.getString(i3);
          uofu1.d = (uCursor.isNull(i4))? str1: uCursor.getBlob(i4);
          i = i1;
          uofu1.e = uCursor.getLong(i5);
          uofu1.f = (uCursor.isNull(i6))? str1: uCursor.getBlob(i6);
          uofu1.g = (uCursor.isNull(i7))? str1: uCursor.getString(i7);
          uofu1.h = (uCursor.isNull(i8))? str1: uCursor.getString(i8);
          uArrayList.add(uofu1);
          i1 = i;
          str1 = 0;
       }
       uCursor.close();
       ozy5.y();
       return uArrayList;
    }
    public final void i(kj3 p0){
       aw1 tc;
       if ((tc = this.c) != null) {
          tc.run();
       }
       ub6 oub6 = new ub6(this.a, p0);
       this.c = oub6;
       this.b.postAtFrontOfQueue(oub6);
       return;
    }
    public final void j(String p0,byte[] p1,lv1 p2,byte[] p3,uv1 p4,i70 p5,hs3 p6,boolean p7,String p8,String p9,long p10,String p11){
       this.b.c();
       aw1.c(this, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
       this.b.r();
       this.b.m();
    }
}
