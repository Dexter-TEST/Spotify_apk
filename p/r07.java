package p.r07;
import p.u07;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.util.ArrayList;
import p.zb1;
import p.i07;
import p.we7;
import java.util.logging.Level;
import java.util.logging.Logger;
import p.is7;
import java.util.concurrent.RejectedExecutionException;
import java.lang.Class;
import java.lang.System;
import java.util.Iterator;
import java.lang.IllegalStateException;

public final class r07	// class@000316 from classes2.dex
{
    public final u07 a;
    public final String b;
    public boolean c;
    public i07 d;
    public final ArrayList e;
    public boolean f;

    public void r07(u07 p0,String p1){
       co5.o(p0, "taskRunner");
       co5.o(p1, "name");
       super();
       this.a = p0;
       this.b = p1;
       this.e = new ArrayList();
    }
    public static void d(r07 p0,zb1 p1){
       p0.c(p1, 0);
    }
    public final void a(){
       r07 ta = this.a;
       _monitor_enter(ta);
       if (this.b()) {
          this.a.e(this);
       }
       _monitor_exit(ta);
       return;
    }
    public final boolean b(){
       r07 td;
       if ((td = this.d) != null && td.b != null) {
          this.f = true;
       }
       td = this.e;
       int i = td.size() - true;
       boolean b = false;
       if (i >= 0) {
          while (true) {
             int i1 = i - 1;
             if (td.get(i).b != null) {
                i07 oi07 = td.get(i);
                if (u07.i.isLoggable(Level.FINE)) {
                   is7.c(oi07, this, "canceled");
                }
                td.remove(i);
                b = true;
                break ;
             }else if(i1 < 0){
                i = i1;
             }
          }
       }
       return b;
    }
    public final void c(i07 p0,long p1){
       co5.o(p0, "task");
       r07 ta = this.a;
       _monitor_enter(ta);
       if (this.c != null) {
          if (p0.b != null) {
             if (u07.i.isLoggable(Level.FINE)) {
                is7.c(p0, this, "schedule canceled \(queue is shutdown\)");
             }
             _monitor_exit(ta);
             return;
          }else if(u07.i.isLoggable(Level.FINE)){
             is7.c(p0, this, "schedule failed \(queue is shutdown\)");
          }
          throw new RejectedExecutionException();
       }else if(this.e(p0, p1, false)){
          this.a.e(this);
       }
       _monitor_exit(ta);
       return;
    }
    public final boolean e(i07 p0,long p1,boolean p2){
       r07 e;
       int i;
       r07 or07 = this;
       i07 oi07 = p0;
       co5.o(p0, "task");
       i07 c = oi07.c;
       boolean b = true;
       if (c == or07) {
       }else if(c == null){
          e = 1;
       }else {
          e = 0;
       }
       if (e) {
          oi07.c = or07;
       }else {
          throw new IllegalStateException("task is in multiple queues".toString());
       }
       or07.a.a.getClass();
       long l = System.nanoTime();
       long l1 = l + p1;
       e = or07.e;
       if ((i = e.indexOf(p0)) != -1) {
          if ((oi07.d - l1) <= 0) {
             if (u07.i.isLoggable(Level.FINE)) {
                is7.c(p0, this, "already scheduled");
             }
             return false;
          }else {
             e.remove(i);
          }
       }
       oi07.d = l1;
       if (u07.i.isLoggable(Level.FINE)) {
          String str = (p2)? co5.K(is7.m((l1 - l)), "run again after "): co5.K(is7.m((l1 - l)), "scheduled after ");
          is7.c(p0, this, str);
       }
       Iterator iterator = e.iterator();
       int i1 = 0;
       while (true) {
          if (iterator.hasNext()) {
             long l2 = iterator.next().d - l;
             i = ((l2 - p1) > 0)? 1: 0;
             if (i) {
             label_0090 :
                if (i1 == -1) {
                   i1 = e.size();
                }
                e.add(i1, p0);
                if (i1) {
                   b = false;
                   break ;
                }
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             i1 = -1;
             goto label_0090 ;
          }
       }
       return b;
    }
    public final void f(){
       r07 ta = this.a;
       _monitor_enter(ta);
       this.c = true;
       if (this.b()) {
          this.a.e(this);
       }
       _monitor_exit(ta);
       return;
    }
    public final String toString(){
       return this.b;
    }
}
