package p.sg3;
import p.wg3;
import p.rg3;
import p.gg3;
import java.lang.String;
import java.io.Writer;
import java.util.ArrayList;
import p.ag3;
import p.jf3;
import p.af3;
import java.lang.Object;
import java.lang.IllegalStateException;
import p.bg3;
import java.io.IOException;
import java.lang.NullPointerException;
import java.lang.Long;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;
import p.dl3;

public final class sg3 extends wg3	// class@002622 from classes.dex
{
    public String A;
    public jf3 B;
    public final ArrayList z;
    public static final rg3 C;
    public static final gg3 D;

    static {
       sg3.C = new rg3();
       sg3.D = new gg3("closed");
    }
    public void sg3(){
       super(sg3.C);
       this.z = new ArrayList();
       this.B = ag3.a;
    }
    public final void J(){
       sg3 tz = this.z;
       if (tz.isEmpty() || this.A != null) {
          throw new IllegalStateException();
       }
       if (!this.q0() instanceof af3) {
          throw new IllegalStateException();
       }
       tz.remove((tz.size() - 1));
       return;
    }
    public final void T(){
       sg3 tz = this.z;
       if (tz.isEmpty() || this.A != null) {
          throw new IllegalStateException();
       }
       if (!this.q0() instanceof bg3) {
          throw new IllegalStateException();
       }
       tz.remove((tz.size() - 1));
       return;
    }
    public final void close(){
       sg3 tz = this.z;
       if (!tz.isEmpty()) {
          throw new IOException("Incomplete document");
       }
       tz.add(sg3.D);
       return;
    }
    public final void f(){
       af3 uoaf3 = new af3();
       this.r0(uoaf3);
       this.z.add(uoaf3);
    }
    public final void flush(){
    }
    public final void g0(String p0){
       if (p0 == null) {
          throw new NullPointerException("name == null");
       }
       if (this.z.isEmpty() || this.A != null) {
          throw new IllegalStateException();
       }
       if (!this.q0() instanceof bg3) {
          throw new IllegalStateException();
       }
       this.A = p0;
       return;
    }
    public final wg3 h0(){
       this.r0(ag3.a);
       return this;
    }
    public final void k0(long p0){
       this.r0(new gg3(Long.valueOf(p0)));
    }
    public final void l0(Boolean p0){
       if (p0 == null) {
          this.r0(ag3.a);
          return;
       }else {
          this.r0(new gg3(p0));
          return;
       }
    }
    public final void m0(Number p0){
       if (p0 == null) {
          this.r0(ag3.a);
          return;
       }else if(this.v == null){
          double d = p0.doubleValue();
          if (Double.isNaN(d) || Double.isInfinite(d)) {
             throw new IllegalArgumentException("JSON forbids NaN and infinities: "+p0);
          }
       }
       this.r0(new gg3(p0));
       return;
    }
    public final void n0(String p0){
       if (p0 == null) {
          this.r0(ag3.a);
          return;
       }else {
          this.r0(new gg3(p0));
          return;
       }
    }
    public final void o0(boolean p0){
       this.r0(new gg3(Boolean.valueOf(p0)));
    }
    public final jf3 q0(){
       sg3 tz = this.z;
       return tz.get((tz.size() - 1));
    }
    public final void r0(jf3 p0){
       if (this.A != null) {
          if (!p0 instanceof ag3 || this.x != null) {
             bg3 uobg3 = this.q0();
             uobg3.getClass();
             uobg3.a.put(this.A, p0);
          }
          this.A = null;
       }else if(this.z.isEmpty()){
          this.B = p0;
       }else {
          jf3 ojf3 = this.q0();
          if (ojf3 instanceof af3) {
             ojf3.getClass();
             ojf3.a.add(p0);
          }else {
             throw new IllegalStateException();
          }
       }
       return;
    }
    public final void x(){
       bg3 uobg3 = new bg3();
       this.r0(uobg3);
       this.z.add(uobg3);
    }
}
