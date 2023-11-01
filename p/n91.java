package p.n91;
import p.r16;
import p.kc3;
import java.lang.Object;
import p.vh0;
import p.th0;
import java.util.LinkedHashMap;
import java.io.File;
import p.n42;
import com.google.common.collect.d;
import p.eb4;
import p.jb7;
import p.kb7;
import p.lb7;
import java.lang.String;
import java.lang.Integer;
import java.util.ArrayList;
import p.li5;
import p.t14;
import p.vm7;
import p.xy5;
import p.m91;
import p.yr;
import p.i73;
import java.lang.IllegalStateException;
import p.u16;
import p.fw;
import android.database.sqlite.SQLiteDatabase;
import java.lang.Class;
import java.lang.Long;
import java.lang.Boolean;
import android.database.Cursor;
import p.qq7;
import java.util.Map;
import android.net.Uri;
import android.webkit.ValueCallback;
import p.zy5;
import p.vv7;
import java.util.List;
import p.co5;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.AbstractMap;
import java.lang.Iterable;
import java.util.Collection;
import p.dj0;
import p.xq6;
import java.util.Locale;
import java.lang.StringBuilder;

public final class n91 implements r16, kc3	// class@001f8f from classes.dex
{
    public final int a;
    public Object b;
    public Object c;

    public void n91(int p0){
       this.a = 8;
       super();
       byte[] uobyteArray = new byte[p0];
       this.c = uobyteArray;
       this.b = new th0(uobyteArray, p0);
    }
    public void n91(int p0,int p1){
       this.a = 8;
       super(p0);
    }
    public void n91(int p0,Object p1){
       this.a = p0;
       if (p0 != 5) {
          if (p0 != 7) {
             if (p0 != 12) {
                super();
                this.b = new Object();
                this.c = new LinkedHashMap();
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
          return;
       }
    }
    public void n91(File p0,n42[] p1){
       this.a = 6;
       super();
       this.b = p0;
       this.c = d.p(p1);
    }
    public void n91(File p0,n42[] p1,int p2){
       this.a = 6;
       super(p0, p1);
    }
    public void n91(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public void n91(eb4 p0){
       this.a = 13;
       this.c = p0;
       super();
       jb7 ojb7 = p0.b.b();
       lb7 v6 = new lb7("contextual_audio_positive_button", null, null, null, null);
       ojb7.i.add(v6);
       ojb7.j = true;
       this.b = ojb7.a();
    }
    public void n91(li5 p0){
       this.a = 14;
       this.c = p0;
       super();
       jb7 ojb7 = p0.b.b();
       lb7 v6 = new lb7("results", null, null, null, null);
       ojb7.i.add(v6);
       ojb7.j = true;
       this.b = ojb7.a();
    }
    public void n91(t14 p0,t14 p1){
       this.a = 11;
       this.c = p0;
       this.b = p1;
       super();
    }
    public void n91(vm7 p0){
       this.a = 9;
       super();
       this.b = p0;
    }
    public void n91(xy5 p0){
       this.a = 0;
       super();
       this.b = p0;
       this.c = new m91(this, p0, 0);
    }
    public final yr a(){
       String str = (this.b == null)? " files": "";
       if (str.isEmpty()) {
          return new yr(this.b, this.c);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final Object apply(Object p0){
       n91 tb = this.b;
       tb.getClass();
       if ((p0 = u16.f(p0, this.c)) == null) {
          p0 = Boolean.FALSE;
       }else {
          String[] stringArray = new String[]{p0.toString()};
          p0 = tb.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", stringArray);
          p0.close();
          p0 = Boolean.valueOf(p0.moveToNext());
       }
       return p0;
    }
    public final boolean b(qq7 p0){
       n91 tb = this.b;
       _monitor_enter(tb);
       _monitor_exit(tb);
       return this.c.containsKey(p0);
    }
    public final void c(Uri[] p0){
       n91 tc;
       if ((tc = this.c) != null) {
          tc.onReceiveValue(p0);
          this.c = null;
       }
       return;
    }
    public final float d(float p0,float p1,float p2){
       n91 tc = this.c;
       return this.b.t.d(tc.b, tc.c, tc.t.d(p0, p1, p2));
    }
    public final ArrayList e(String p0){
       int i = 1;
       zy5 ozy5 = zy5.x(i, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
       if (p0 == null) {
          ozy5.z(i);
       }else {
          ozy5.s(i, p0);
       }
       this.b.b();
       Cursor uCursor = vv7.J(this.b, ozy5, false);
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          String str = (uCursor.isNull(false))? null: uCursor.getString(false);
          uArrayList.add(str);
       }
       uCursor.close();
       ozy5.y();
       return uArrayList;
    }
    public final boolean f(String p0){
       int i = 1;
       zy5 ozy5 = zy5.x(i, "SELECT COUNT\(*\)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN \(SELECT id FROM workspec WHERE state!=2\)");
       if (p0 == null) {
          ozy5.z(i);
       }else {
          ozy5.s(i, p0);
       }
       this.b.b();
       boolean b = false;
       Cursor uCursor = vv7.J(this.b, ozy5, b);
       if (uCursor.moveToFirst()) {
          if (!uCursor.getInt(b)) {
             i = 0;
          }
          b = i;
       }
       uCursor.close();
       ozy5.y();
       return b;
    }
    public final List g(String p0){
       co5.o(p0, "workSpecId");
       n91 tb = this.b;
       _monitor_enter(tb);
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = this.c.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (co5.c(uEntry.getKey().a, p0)) {
             linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       Iterator iterator1 = linkedHashMa.keySet().iterator();
       while (iterator1.hasNext()) {
          this.c.remove(iterator1.next());
       }
       _monitor_exit(tb);
       return dj0.B0(linkedHashMa.values());
    }
    public final xq6 h(qq7 p0){
       co5.o(p0, "id");
       n91 tb = this.b;
       _monitor_enter(tb);
       _monitor_exit(tb);
       return this.c.remove(p0);
    }
    public final xq6 i(qq7 p0){
       xq6 oxq6;
       n91 tb = this.b;
       _monitor_enter(tb);
       n91 tc = this.c;
       if ((oxq6 = tc.get(p0)) == null) {
          oxq6 = new xq6(p0);
          tc.put(p0, oxq6);
       }
       _monitor_exit(tb);
       return oxq6;
    }
    public final String toString(){
       switch (this.a){
           case 6:
             return "Files.asByteSink\("+this.b+", "+this.c+"\)";
           case 11:
             Object[] objArray = new Object[]{this.c.t,this.b.t};
             return String.format(Locale.US, "%s -> %s", objArray);
           default:
             return super.toString();
       }
    }
}
