package p.tb1;
import java.lang.Object;
import p.sk;
import java.util.HashMap;
import p.lk5;
import p.dc1;
import p.vb1;
import java.lang.String;
import p.co5;
import p.ec1;
import p.wb1;
import java.lang.Class;
import java.lang.IllegalStateException;
import p.m95;
import java.util.ArrayList;
import p.c42;
import p.el6;
import p.ac1;
import java.io.Closeable;
import p.r;
import p.i20;
import java.io.File;
import p.b42;
import p.nn;
import p.p02;
import p.vf4;
import p.zf2;

public final class tb1	// class@002737 from classes.dex
{
    public final int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public void tb1(){
       this.a = 1;
       super();
       this.b = false;
       this.c = new sk(false);
       this.d = new HashMap();
       this.e = new lk5(2, this);
    }
    public void tb1(dc1 p0,vb1 p1){
       this.a = 2;
       co5.o(p0, "this$0");
       this.e = p0;
       super();
       this.c = p1;
       boolean[] uobooleanArr = (p1.e != null)? null: new boolean[p0.t];
       this.d = uobooleanArr;
       return;
    }
    public void tb1(ec1 p0,wb1 p1){
       this.a = 0;
       this.e = p0;
       super();
       this.c = p1;
       p0.getClass();
       boolean[] uobooleanArr = new boolean[2];
       this.d = uobooleanArr;
    }
    public final void a(){
       boolean b = false;
       switch (this.a){
           case 0:
           default:
             tb1 te = this.e;
             _monitor_enter(te);
             if (!((this.b ^ 1))) {
                throw new IllegalStateException("Check failed.".toString());
             }
             if (co5.c(this.c.g, this)) {
                te.f(this, b);
             }
             this.b = true;
             _monitor_exit(te);
             return;
       }
       this.c(b);
       return;
    }
    public final void b(){
       boolean b = true;
       switch (this.a){
           case 0:
           default:
             tb1 te = this.e;
             _monitor_enter(te);
             if (!((this.b ^ b))) {
                throw new IllegalStateException("Check failed.".toString());
             }
             if (co5.c(this.c.g, this)) {
                te.f(this, b);
             }
             this.b = b;
             _monitor_exit(te);
             return;
       }
       this.c(b);
       return;
    }
    public final void c(boolean p0){
       tb1 te = this.e;
       tb1 otb1 = te;
       _monitor_enter(otb1);
       if (!((this.b ^ 1))) {
          throw new IllegalStateException("editor is closed".toString());
       }
       if (co5.c(this.c.g, this)) {
          ec1.b(te, this, p0);
       }
       this.b = true;
       _monitor_exit(otb1);
       return;
    }
    public final void d(){
       tb1 tc = this.c;
       if (co5.c(tc.g, this)) {
          tb1 te = this.e;
          if (te.E != null) {
             te.f(this, false);
          }else {
             tc.f = true;
          }
       }
       return;
    }
    public final m95 e(int p0){
       tb1 te = this.e;
       _monitor_enter(te);
       int i = 1;
       if (!((this.b ^ i))) {
          throw new IllegalStateException("editor is closed".toString());
       }
       this.d[p0] = i;
       Object obj = this.c.d.get(p0);
       ec1 g = te.G;
       Object obj1 = obj;
       if (!g.f(obj1)) {
          r.a(g.k(obj1));
       }
       _monitor_exit(te);
       return obj;
    }
    public final el6 f(int p0){
       tb1 te = this.e;
       _monitor_enter(te);
       if (!((this.b ^ 1))) {
          throw new IllegalStateException("Check failed.".toString());
       }
       if (!co5.c(this.c.g, this)) {
          _monitor_exit(te);
          return new i20();
       }else if(this.c.e == null){
          tb1 td = this.d;
          co5.i(td);
          td[p0] = 1;
       }
       File uFile = this.c.d.get(p0);
       try{
          _monitor_exit(te);
          return new p02(te.a.e(uFile), new vf4(te, 5, this), 1);
       }catch(java.io.FileNotFoundException e0){
          _monitor_exit(e0);
          return new i20();
       }
    }
}
