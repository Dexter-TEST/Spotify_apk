package p.vc3;
import java.lang.String;
import p.xy5;
import java.util.HashMap;
import java.lang.Object;
import p.co5;
import java.util.concurrent.atomic.AtomicBoolean;
import p.sc3;
import p.kf6;
import p.a26;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.lang.Integer;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.NoSuchElementException;
import java.lang.StringBuilder;
import p.em0;
import p.tc3;
import p.ec6;
import java.util.Collection;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.lang.IllegalArgumentException;
import p.dj0;
import p.uc3;
import java.util.Arrays;
import p.nw6;
import p.rw6;
import android.util.Log;
import p.ir2;
import java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.lang.Throwable;

public final class vc3	// class@0029c5 from classes.dex
{
    public final xy5 a;
    public final Map b;
    public final Map c;
    public final LinkedHashMap d;
    public final String[] e;
    public final AtomicBoolean f;
    public boolean g;
    public uw6 h;
    public final sc3 i;
    public final a26 j;
    public final Object k;
    public final Object l;
    public final em0 m;
    public static final String[] n;

    static {
       String[] stringArray = new String[]{"UPDATE","DELETE","INSERT"};
       vc3.n = stringArray;
    }
    public void vc3(xy5 p0,HashMap p1,HashMap p2,String[] p3){
       String str;
       String str1;
       String str2;
       Object obj;
       co5.o(p0, "database");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       boolean b = false;
       this.f = new AtomicBoolean(b);
       this.i = new sc3(p3.length);
       kf6 okf6 = new kf6(p0, 1);
       this.j = new a26();
       this.k = new Object();
       this.l = new Object();
       this.d = new LinkedHashMap();
       int len = p3.length;
       String[] stringArray = new String[len];
       while (true) {
          str = "US";
          if (b < len) {
             Locale uS = Locale.US;
             co5.l(uS, str);
             str = p3[b].toLowerCase(uS);
             co5.l(str, "this as java.lang.String\).toLowerCase\(locale\)");
             this.d.put(str, Integer.valueOf(b));
             if ((str1 = this.b.get(p3[b])) != null) {
                str1 = str1.toLowerCase(uS);
                co5.l(str1, "this as java.lang.String\).toLowerCase\(locale\)");
             }else {
                str1 = null;
             }
             if (str1 != null) {
                str = str1;
             }
             stringArray[b] = str;
             b++;
          }else {
             break ;
          }
       }
       this.e = stringArray;
       Iterator iterator = this.b.entrySet().iterator();
       while (true) {
          if (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             Locale uS1 = Locale.US;
             co5.l(uS1, str);
             str2 = uEntry.getValue().toLowerCase(uS1);
             co5.l(str2, "this as java.lang.String\).toLowerCase\(locale\)");
             if (this.d.containsKey(str2)) {
                String str3 = uEntry.getKey().toLowerCase(uS1);
                co5.l(str3, "this as java.lang.String\).toLowerCase\(locale\)");
                vc3 td = this.d;
                co5.o(td, "<this>");
                if ((obj = td.get(str2)) == null && !td.containsKey(str2)) {
                   break ;
                }else {
                   td.put(str3, obj);
                }
             }
          }else {
             this.m = new em0(8, this);
             return;
          }
       }
       throw new NoSuchElementException("Key "+str2+" is missing in the map.");
    }
    public final void a(tc3 p0){
       object oobject;
       String str;
       Integer integer;
       xy5 a1;
       tc3 a = p0.a;
       ec6 uoec6 = new ec6();
       int len = a.length;
       int i = 0;
       int i1 = 0;
       while (i1 < len) {
          oobject = a[i1];
          Locale uS = Locale.US;
          co5.l(uS, "US");
          str = oobject.toLowerCase(uS);
          String str1 = "this as java.lang.String\).toLowerCase\(locale\)";
          co5.l(str, str1);
          vc3 tc = this.c;
          if (tc.containsKey(str)) {
             String str2 = oobject.toLowerCase(uS);
             co5.l(str2, str1);
             Object obj = tc.get(str2);
             co5.i(obj);
             uoec6.addAll(obj);
          }else {
             uoec6.add(oobject);
          }
          i1 = i1 + 1;
       }
       co5.f(uoec6);
       String[] stringArray = new String[i];
       Object[] objArray = uoec6.toArray(stringArray);
       co5.j(objArray, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
       ArrayList uArrayList = new ArrayList(objArray.length);
       len = objArray.length;
       i1 = 0;
       while (true) {
          if (i1 < len) {
             oobject = objArray[i1];
             Locale uS1 = Locale.US;
             co5.l(uS1, "US");
             str = oobject.toLowerCase(uS1);
             co5.l(str, "this as java.lang.String\).toLowerCase\(locale\)");
             if ((integer = this.d.get(str)) != null) {
                uArrayList.add(Integer.valueOf(integer.intValue()));
                i1 = i1 + 1;
             }else {
                throw new IllegalArgumentException("There is no table with name ".concat(oobject));
             }
          }else {
             int[] ointArray = dj0.A0(uArrayList);
             vc3 tj = this.j;
             _monitor_enter(tj);
             _monitor_exit(tj);
             if (this.j.b(p0, new uc3(p0, ointArray, objArray)) == null && this.i.b(Arrays.copyOf(ointArray, ointArray.length))) {
                vc3 ta = this.a;
                if ((a1 = ta.a) != null && a1.isOpen() == true) {
                   i = 1;
                }
                if (i) {
                   this.e(ta.i().Y());
                   break ;
                }
             }
             break ;
          }
       }
       return;
    }
    public final boolean b(){
       xy5 a = this.a.a;
       boolean b = true;
       a = (a != null && a.isOpen() == b)? 1: 0;
       if (!a) {
          return false;
       }else if(this.g == null){
          this.a.i().Y();
       }
       if (this.g == null) {
          Log.e("ROOM", "database is not initialized even though it is open");
          return false;
       }else {
          return b;
       }
    }
    public final void c(tc3 p0){
       xy5 a;
       int i;
       co5.o(p0, "observer");
       vc3 tj = this.j;
       _monitor_enter(tj);
       uc3 ouc3 = this.j.c(p0);
       _monitor_exit(tj);
       if (ouc3 != null && (ouc3 = ouc3.b)) {
          vc3 ta = this.a;
          if ((a = ta.a) != null) {
             i = 1;
             if (a.isOpen() == i) {
             label_0031 :
                if (i) {
                   this.e(ta.i().Y());
                }
             }
          }
          i = 0;
          goto label_0031 ;
       }
       return;
    }
    public final void d(nw6 p0,int p1){
       p0.r("INSERT OR IGNORE INTO room_table_modification_log VALUES\("+p1+", 0\)");
       object oobject = this.e[p1];
       String[] n = vc3.n;
       for (int i = 0; i < 3; i = i + 1) {
          object oobject1 = n[i];
          StringBuilder str = "CREATE TEMP TRIGGER IF NOT EXISTS ".append(ir2.A(oobject, oobject1)).append(" AFTER ").append(oobject1);
          String str1 = str.append(" ON `").append(oobject).append("` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ").append(p1).append(" AND invalidated = 0; END").toString();
          co5.l(str1, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
          p0.r(str1);
       }
       return;
    }
    public final void e(nw6 p0){
       int[] ointArray;
       co5.o(p0, "database");
       if (p0.G()) {
          return;
       }
       try{
          ReentrantReadWriteLock$ReadLock readLock = this.a.i.readLock();
          co5.l(readLock, "readWriteLock.readLock\(\)");
          readLock.lock();
          vc3 tk = this.k;
          _monitor_enter(tk);
          if ((ointArray = this.i.a()) == null) {
             _monitor_exit(tk);
             readLock.unlock();
             return;
          }else if(p0.M()){
             p0.S();
          }else {
             p0.h();
          }
          int len = ointArray.length;
          int i = 0;
          int i1 = 0;
          while (i < len) {
             int i2 = ointArray[i];
             int i3 = i1 + 1;
             if (i2 != 1) {
                if (i2 == 2) {
                   object oobject = this.e[i1];
                   String[] n = vc3.n;
                   for (int i4 = 0; i4 < 3; i4 = i4 + 1) {
                      String str = "DROP TRIGGER IF EXISTS ".append(ir2.A(oobject, n[i4])).toString();
                      co5.l(str, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
                      p0.r(str);
                   }
                }
             }else {
                this.d(p0, i1);
             }
             i = i + 1;
             i1 = i3;
          }
          p0.Q();
          p0.g();
          try{
             _monitor_exit(tk);
             readLock.unlock();
          }catch(java.lang.IllegalStateException e14){
             Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e14);
          }catch(android.database.sqlite.SQLiteException e14){
             Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e14);
          }
          return;
       }catch(java.lang.IllegalStateException e14){
       }catch(android.database.sqlite.SQLiteException e14){
       }
    }
}
