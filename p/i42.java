package p.i42;
import java.util.Iterator;
import p.ch3;
import p.dc1;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.lang.String;
import p.co5;
import p.k42;
import p.jr6;
import java.util.ArrayDeque;
import java.io.File;
import p.e42;
import p.g42;
import p.en6;
import p.f42;
import p.cd2;
import p.h42;
import java.lang.Enum;
import p.j42;
import java.lang.IllegalArgumentException;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;
import p.xb1;
import p.vb1;
import java.lang.IllegalStateException;

public final class i42 implements Iterator, ch3	// class@00191f from classes.dex
{
    public final int a;
    public Object b;
    public Object c;
    public Object t;
    public final Object v;

    public void i42(dc1 p0){
       this.a = 1;
       this.v = p0;
       super();
       Iterator iterator = new ArrayList(p0.B.values()).iterator();
       co5.l(iterator, "ArrayList\(lruEntries.values\).iterator\(\)");
       this.b = iterator;
    }
    public void i42(k42 p0){
       this.a = 0;
       this.v = p0;
       super();
       this.b = jr6.b;
       this.t = new ArrayDeque();
       p0 = p0.a;
       if (p0.a.isDirectory()) {
          this.t.push(this.a(p0));
       }else if(p0.isFile()){
          this.t.push(new g42(p0));
       }else {
          this.b = jr6.c;
       }
       return;
    }
    public final e42 a(File p0){
       int i;
       f42 uof42;
       if (i = en6.A(this.v.b)) {
          if (i == 1) {
             uof42 = new f42(this, p0);
          }else {
             throw new cd2(10);
          }
       }else {
          uof42 = new h42(this, p0);
       }
       return uof42;
    }
    public final boolean b(){
       int i1;
       j42 oj42;
       File uFile;
       File uFile1;
       i42 tb = this.b;
       jr6 t = jr6.t;
       boolean b = true;
       int i = (tb != t)? 1: 0;
       if (i) {
          if (i1 = tb.ordinal()) {
             if (i1 != 2) {
                this.b = t;
                while (true) {
                   if ((oj42 = this.t.peek()) == null) {
                      uFile = null;
                      break ;
                   }else if((uFile1 = oj42.a()) == null){
                      this.t.pop();
                   }else if(!co5.c(uFile1, oj42.a) && (uFile1.isDirectory() && this.t.size() < this.v.c)){
                      this.t.push(this.a(uFile1));
                   }else {
                      uFile = uFile1;
                      break ;
                   }
                }
                jr6 a = jr6.a;
                if (uFile != null) {
                   this.c = uFile;
                   this.b = a;
                }else {
                   this.b = jr6.c;
                }
                if (this.b != a) {
                   b = false;
                }
             }else {
             }
          }
          return b;
       }else {
          throw new IllegalArgumentException("Failed requirement.".toString());
       }
    }
    public final Object c(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       this.b = jr6.b;
       return this.c;
    }
    public final void d(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final boolean hasNext(){
       boolean b;
       vb1 ovb1;
       switch (this.a){
           case 0:
           default:
             if (this.c == null) {
                i42 tv = this.v;
                _monitor_enter(tv);
                if (tv.G != null) {
                   _monitor_exit(tv);
                }else if(this.b.hasNext()){
                   xb1 oxb1 = ((ovb1 = this.b.next()) == null)? null: ovb1.a();
                   if (oxb1 == null) {
                      continue ;
                   }else {
                      this.c = oxb1;
                      _monitor_exit(tv);
                   }
                }else {
                   _monitor_exit(tv);
                }
                b = false;
             }
             b = true;
       }
       return this.b();
    }
    public final Object next(){
       switch (this.a){
           case 0:
           default:
             if (!this.hasNext()) {
                throw new NoSuchElementException();
             }
             i42 tc = this.c;
             this.t = tc;
             this.c = null;
             co5.i(tc);
             return tc;
       }
       return this.c();
    }
    public final void remove(){
       i42 tt;
       void ovoid = null;
       switch (this.a){
           case 0:
           default:
             if ((tt = this.t) == null) {
                throw new IllegalStateException("remove\(\) before next\(\)".toString());
             }
             try{
                this.v.l0(tt.a);
                this.t = ovoid;
                return;
             }catch(java.io.IOException e0){
             }
       }
       this.d();
       throw ovoid;
    }
}
