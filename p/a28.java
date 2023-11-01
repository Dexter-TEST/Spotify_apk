package p.a28;
import p.j07;
import java.lang.Object;
import p.l18;
import java.util.concurrent.Executor;
import p.q15;
import p.sx7;
import p.p18;
import p.f25;
import p.n25;
import java.lang.Exception;
import java.lang.String;
import p.w51;
import p.k06;
import java.util.concurrent.CancellationException;
import p.pv6;
import p.qy7;
import p.bu0;
import java.lang.NullPointerException;
import p.qf1;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;

public final class a28 extends j07	// class@000f01 from classes.dex
{
    public final Object a;
    public final l18 b;
    public boolean c;
    public boolean d;
    public Object e;
    public Exception f;

    public void a28(){
       super();
       this.a = new Object();
       this.b = new l18(0);
    }
    public final a28 a(Executor p0,q15 p1){
       this.b.c(new sx7(p0, p1));
       this.m();
       return this;
    }
    public final a28 b(Executor p0,f25 p1){
       this.b.c(new sx7(p0, p1));
       this.m();
       return this;
    }
    public final a28 c(Executor p0,n25 p1){
       this.b.c(new sx7(p0, p1));
       this.m();
       return this;
    }
    public final Exception d(){
       a28 ta = this.a;
       _monitor_enter(ta);
       _monitor_exit(ta);
       return this.f;
    }
    public final Object e(){
       a28 ta = this.a;
       _monitor_enter(ta);
       w51.m("Task is not yet complete", this.c);
       if (this.d != null) {
          throw new CancellationException("Task is already canceled.");
       }
       if (this.f != null) {
          throw new k06(this.f);
       }
       _monitor_exit(ta);
       return this.e;
    }
    public final boolean f(){
       a28 ta = this.a;
       _monitor_enter(ta);
       boolean b = (this.c != null && (this.d == null && this.f == null))? true: false;
       _monitor_exit(ta);
       return b;
    }
    public final a28 g(Executor p0,pv6 p1){
       a28 uoa28 = new a28();
       this.b.c(new qy7(p0, p1, uoa28, 1));
       this.m();
       return uoa28;
    }
    public final a28 h(Executor p0,bu0 p1){
       a28 uoa28 = new a28();
       this.b.c(new sx7(p0, p1, uoa28));
       this.m();
       return uoa28;
    }
    public final void i(){
       a28 ta = this.a;
       _monitor_enter(ta);
       if (this.c != null) {
          _monitor_exit(ta);
          return;
       }else {
          this.c = true;
          this.d = true;
          _monitor_exit(ta);
          this.b.a(this);
          return;
       }
    }
    public final void j(Exception p0){
       String str = "Exception must not be null";
       if (p0 == null) {
          throw new NullPointerException(str);
       }
       a28 ta = this.a;
       _monitor_enter(ta);
       this.l();
       this.c = true;
       this.f = p0;
       _monitor_exit(ta);
       this.b.a(this);
       return;
    }
    public final void k(Object p0){
       a28 ta = this.a;
       _monitor_enter(ta);
       this.l();
       this.c = true;
       this.e = p0;
       _monitor_exit(ta);
       this.b.a(this);
    }
    public final void l(){
       Exception uException;
       String str;
       qf1 oqf1;
       if (this.c == null) {
          return;
       }
       a28 ta = this.a;
       _monitor_enter(ta);
       _monitor_exit(ta);
       if (this.c != null) {
          if ((uException = this.d()) != null) {
             str = "failure";
          }else if(this.f()){
             str = String.valueOf(this.e());
             str = new StringBuilder((str.length() + 7))+"result "+str;
          }else if(this.d != null){
             str = "cancellation";
          }else {
             str = "unknown issue";
          }
          str = String.valueOf(str);
          str = (str.length())? "Complete with: ".concat(str): "Complete with: ";
          oqf1 = new qf1(str, uException);
       }else {
          oqf1 = new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
       }
       throw oqf1;
    }
    public final void m(){
       a28 ta = this.a;
       _monitor_enter(ta);
       if (this.c == null) {
          _monitor_exit(ta);
          return;
       }else {
          _monitor_exit(ta);
          this.b.a(this);
          return;
       }
    }
}
