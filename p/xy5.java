package p.xy5;
import java.lang.Object;
import p.vc3;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.lang.ThreadLocal;
import java.util.Map;
import java.util.Collections;
import java.lang.String;
import p.co5;
import java.lang.Class;
import p.rw6;
import p.g91;
import android.os.Looper;
import java.lang.Thread;
import java.lang.IllegalStateException;
import p.nw6;
import p.uw6;
import p.o51;
import java.util.List;
import p.ll1;
import java.util.Set;
import p.pl1;
import p.ml1;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import android.util.Log;
import p.tw6;
import android.os.CancellationSignal;
import android.database.Cursor;
import java.util.concurrent.Callable;

public abstract class xy5	// class@002d12 from classes.dex
{
    public nw6 a;
    public Executor b;
    public jj c;
    public rw6 d;
    public final vc3 e;
    public boolean f;
    public List g;
    public final LinkedHashMap h;
    public final ReentrantReadWriteLock i;
    public final ThreadLocal j;
    public final LinkedHashMap k;

    public void xy5(){
       super();
       this.e = this.f();
       this.h = new LinkedHashMap();
       this.i = new ReentrantReadWriteLock();
       this.j = new ThreadLocal();
       co5.l(Collections.synchronizedMap(new LinkedHashMap()), "synchronizedMap\(mutableMapOf\(\)\)");
       this.k = new LinkedHashMap();
    }
    public static Object s(Class p0,rw6 p1){
       if (p0.isInstance(p1)) {
          return p1;
       }
       p0 = (p1 instanceof g91)? xy5.s(p0, p1.b()): null;
       return p0;
    }
    public final void a(){
       if (this.f != null) {
          return;
       }
       int i = (Looper.getMainLooper().getThread() == Thread.currentThread())? 1: 0;
       if ((i ^ 1)) {
          return;
       }else {
          throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
       }
    }
    public final void b(){
       int i = (!this.i().Y().G() && this.j.get() != null)? 0: 1;
       if (i) {
          return;
       }else {
          throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
       }
    }
    public final void c(){
       this.a();
       this.l();
    }
    public abstract void d();
    public final uw6 e(String p0){
       co5.o(p0, "sql");
       this.a();
       this.b();
       return this.i().Y().w(p0);
    }
    public abstract vc3 f();
    public abstract rw6 g(o51 p0);
    public List h(LinkedHashMap p0){
       co5.o(p0, "autoMigrationSpecs");
       return ll1.a;
    }
    public final rw6 i(){
       xy5 td;
       if ((td = this.d) != null) {
          return td;
       }
       co5.N("internalOpenHelper");
       throw null;
    }
    public Set j(){
       return pl1.a;
    }
    public Map k(){
       return ml1.a;
    }
    public final void l(){
       this.a();
       nw6 onw6 = this.i().Y();
       this.e.e(onw6);
       if (onw6.M()) {
          onw6.S();
       }else {
          onw6.h();
       }
       return;
    }
    public final void m(){
       xy5 b;
       this.i().Y().g();
       if (!this.i().Y().G()) {
          xy5 te = this.e;
          if (te.f.compareAndSet(false, true)) {
             if ((b = te.a.b) != null) {
                b.execute(te.m);
             }else {
                co5.N("internalQueryExecutor");
                throw null;
             }
          }
       }
       return;
    }
    public final void n(nw6 p0){
       co5.o(p0, "db");
       xy5 te = this.e;
       te.getClass();
       vc3 l = te.l;
       _monitor_enter(l);
       if (te.g != null) {
          Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
          _monitor_exit(l);
       }else {
          p0.r("PRAGMA temp_store = MEMORY;");
          p0.r("PRAGMA recursive_triggers=\'ON\';");
          p0.r("CREATE TEMP TABLE room_table_modification_log \(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0\)");
          te.e(p0);
          te.h = p0.w("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
          te.g = true;
          _monitor_exit(l);
       }
       return;
    }
    public final Cursor o(tw6 p0,CancellationSignal p1){
       co5.o(p0, "query");
       this.a();
       this.b();
       Cursor uCursor = (p1 != null)? this.i().Y().i(p0, p1): this.i().Y().f0(p0);
       return uCursor;
    }
    public final Object p(Callable p0){
       this.c();
       this.r();
       this.m();
       return p0.call();
    }
    public final void q(Runnable p0){
       this.c();
       p0.run();
       this.r();
       this.m();
    }
    public final void r(){
       this.i().Y().Q();
    }
}
