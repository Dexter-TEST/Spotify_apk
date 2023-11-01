package p.vx5;
import p.j45;
import p.r16;
import p.f10;
import java.lang.Object;
import p.ne4;
import p.pc6;
import p.lv1;
import android.graphics.Rect;
import android.content.Context;
import java.util.HashMap;
import p.os5;
import p.eb4;
import p.jb7;
import p.kb7;
import p.lb7;
import java.lang.String;
import java.lang.Integer;
import java.util.ArrayList;
import p.fb4;
import p.uv1;
import p.c26;
import p.mm0;
import android.view.View;
import java.lang.Class;
import p.zk2;
import p.eo5;
import p.u16;
import p.fw;
import android.database.sqlite.SQLiteDatabase;
import java.lang.Long;
import p.et;
import android.database.Cursor;
import p.aw1;
import java.util.List;
import java.lang.StringBuilder;
import p.ku;
import p.m06;
import java.util.Map;
import java.util.ListIterator;
import p.i77;
import p.dt;
import java.util.Set;
import java.util.Iterator;
import p.s16;
import p.xr;
import java.lang.IllegalStateException;
import android.content.SharedPreferences;
import p.ma7;
import p.lo4;
import p.tp2;
import java.lang.reflect.Constructor;
import java.lang.reflect.AccessibleObject;
import p.kf6;
import java.util.Collection;
import java.util.SortedSet;
import p.b7;
import java.util.EnumSet;
import p.oe7;
import p.ir2;
import java.util.Queue;
import p.cr0;
import p.dr0;
import java.util.concurrent.ConcurrentNavigableMap;
import p.er0;
import java.util.concurrent.ConcurrentMap;
import java.util.SortedMap;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p.j8;
import p.i45;
import p.g45;
import java.lang.Throwable;
import p.ow7;
import p.l08;
import java.util.HashSet;

public final class vx5 implements j45, r16, f10	// class@000393 from classes2.dex
{
    public final int a;
    public Object b;
    public Object c;

    public void vx5(int p0){
       this.a = p0;
       if (p0 != 4) {
          if (p0 != 6) {
             if (p0 != 8) {
                super();
                this.b = new ne4();
                this.c = new pc6();
                this.e(j45.q);
                return;
             }else {
                super();
                return;
             }
          }else {
             super();
             return;
          }
       }else {
          super();
          this.b = new Rect();
          this.c = new Rect();
          return;
       }
    }
    public void vx5(Context p0){
       this.a = 9;
       super();
       this.c = p0;
    }
    public void vx5(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public void vx5(HashMap p0){
       this.a = 7;
       super();
       this.c = os5.a;
       this.b = p0;
    }
    public void vx5(eb4 p0){
       this.a = 12;
       this.c = p0;
       super();
       jb7 ojb7 = p0.b.b();
       lb7 v6 = new lb7("contextual_audio_negative_button", null, null, null, null);
       ojb7.i.add(v6);
       ojb7.j = true;
       this.b = ojb7.a();
    }
    public void vx5(fb4 p0){
       this.a = 13;
       this.c = p0;
       super();
       jb7 ojb7 = p0.b.b();
       lb7 v6 = new lb7("back_button", null, null, null, null);
       ojb7.i.add(v6);
       ojb7.j = false;
       this.b = ojb7.a();
    }
    public void vx5(uv1 p0,c26 p1){
       this.a = 10;
       this.c = p0;
       this.b = p1;
       super();
    }
    public final void a(Object p0,mm0 p1){
       this.c.a(eo5.M(p0, this.b), p1);
    }
    public final Object apply(Object p0){
       String[] stringArray;
       vx5 ovx5 = this;
       vx5 b = ovx5.b;
       vx5 c = ovx5.c;
       SQLiteDatabase sQLiteDataba = p0;
       b.getClass();
       ArrayList uArrayList = new ArrayList();
       Long longx = u16.f(sQLiteDataba, c);
       int i = 0;
       if (longx == null) {
       }else {
          stringArray = new String[]{"_id","transport_name","timestamp_ms","uptime_ms","payload_encoding","payload","code","inline"};
          String[] stringArray1 = new String[]{longx.toString()};
          u16.T(sQLiteDataba.query("events", stringArray, "context_id = ?", stringArray1, null, null, null, String.valueOf(b.t.b)), new aw1(b, uArrayList, c));
       }
       HashMap hashMap = new HashMap();
       String str = "event_id IN \(";
       while (i < uArrayList.size()) {
          str = str.append(uArrayList.get(i).a);
          int i1 = uArrayList.size() - 1;
          if (i < i1) {
             str = str.append(',');
          }
          i = i + 1;
       }
       stringArray = new String[]{"event_id","name","value"};
       u16.T(sQLiteDataba.query("event_metadata", stringArray, str+')', null, null, null, null), new m06(hashMap));
       ListIterator listIterator = uArrayList.listIterator();
       while (listIterator.hasNext()) {
          ku oku = listIterator.next();
          if (!hashMap.containsKey(Long.valueOf(oku.a))) {
          }else {
             i77 oi77 = oku.c.c();
             ku a = oku.a;
             Iterator iterator = hashMap.get(Long.valueOf(a)).iterator();
             while (iterator.hasNext()) {
                s16 os16 = iterator.next();
                oi77.e(os16.a, os16.b);
             }
             listIterator.set(new ku(a, oku.b, oi77.i()));
          }
       }
       return uArrayList;
    }
    public final xr b(){
       String str = (this.b == null)? " key": "";
       if (this.c == null) {
          str = str.concat(" value");
       }
       if (str.isEmpty()) {
          return new xr(this.b, this.c);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final SharedPreferences c(){
       if (this.b == null) {
          this.b = this.c.getSharedPreferences("com.spotify.eventsender.shared.prefs", 0);
       }
       return this.b;
    }
    public final lo4 d(ma7 p0){
       int i;
       kf6 okf6;
       ma7 b = p0.b;
       tp2.v(this.b.get(b));
       p0 = p0.a;
       tp2.v(this.b.get(p0));
       lo4 olo4 = null;
       try{
          i = 0;
          Class[] uClassArray = new Class[i];
          Constructor declaredCons = p0.getDeclaredConstructor(uClassArray);
          if (!declaredCons.isAccessible()) {
             this.c.a(declaredCons);
          }
          okf6 = new kf6(this, declaredCons);
       }catch(java.lang.NoSuchMethodException e0){
          okf6 = olo4;
       }
       if (okf6 != null) {
          return okf6;
       }else if(Collection.class.isAssignableFrom(p0)){
          if (SortedSet.class.isAssignableFrom(p0)) {
             olo4 = new b7(19, this);
          }else if(EnumSet.class.isAssignableFrom(p0)){
             olo4 = new oe7(this, e0);
          }else if(Set.class.isAssignableFrom(p0)){
             olo4 = new ir2(1);
          }else if(Queue.class.isAssignableFrom(p0)){
             olo4 = new cr0(1);
          }else {
             olo4 = new dr0(1);
          }
       }else if(Map.class.isAssignableFrom(p0)){
          if (ConcurrentNavigableMap.class.isAssignableFrom(p0)) {
             olo4 = new er0(1);
          }else if(ConcurrentMap.class.isAssignableFrom(p0)){
             olo4 = new ir2(i);
          }else if(SortedMap.class.isAssignableFrom(p0)){
             olo4 = new cr0(i);
          }else if(e0 instanceof ParameterizedType && !String.class.isAssignableFrom(new ma7(e0.getActualTypeArguments()[i]).a)){
             olo4 = new dr0(i);
          }else {
             olo4 = new er0(i);
          }
       }
       if (olo4 != null) {
          return olo4;
       }else {
          return new j8(this, p0, e0);
       }
    }
    public final void e(lv1 p0){
       this.b.l(p0);
       if (p0 instanceof i45) {
          this.c.i(p0);
       }else if(p0 instanceof g45){
          this.c.j(p0.P);
       }
       return;
    }
    public final void f(){
       vx5 tb = this.b;
       ow7 f = tb.f;
       _monitor_enter(f);
       tb.e.remove(this.c);
       _monitor_exit(f);
    }
    public final String toString(){
       switch (this.a){
           case 7:
           default:
             return super.toString();
       }
       return this.b.toString();
    }
}
