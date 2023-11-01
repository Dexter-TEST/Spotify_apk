package p.pd2;
import p.dh2;
import androidx.fragment.app.Fragment;
import androidx.activity.result.a;
import java.lang.Object;
import androidx.fragment.app.o;
import java.util.concurrent.CopyOnWriteArrayList;
import android.os.Bundle;
import java.util.Iterator;
import p.od2;
import p.ej4;
import p.nd2;
import android.view.View;

public final class pd2 implements dh2	// class@00223c from classes.dex
{
    public final Object a;
    public final Object b;

    public void pd2(Fragment p0,a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void pd2(o p0){
       super();
       this.a = new CopyOnWriteArrayList();
       this.b = p0;
    }
    public final void a(Fragment p0,Bundle p1,boolean p2){
       o w;
       if ((w = this.b.w) != null) {
          w.getParentFragmentManager().m.a(p0, p1, true);
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          od2 ood2 = iterator.next();
          if (p2 && ood2.b == null) {
             continue ;
          }
          ood2.a.j0(p0);
       }
       return;
    }
    public final Object apply(Object p0){
       return this.a;
    }
    public final void b(Fragment p0,boolean p1){
       o w;
       pd2 tb = this.b;
       if ((w = tb.w) != null) {
          w.getParentFragmentManager().m.b(p0, true);
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          od2 ood2 = iterator.next();
          if (p1 && ood2.b == null) {
             continue ;
          }
          ood2.a.k0(p0);
       }
       return;
    }
    public final void c(Fragment p0,Bundle p1,boolean p2){
       o w;
       if ((w = this.b.w) != null) {
          w.getParentFragmentManager().m.c(p0, p1, true);
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          od2 ood2 = iterator.next();
          if (p2 && ood2.b == null) {
             continue ;
          }
          ood2.a.l0(p0);
       }
       return;
    }
    public final void d(Fragment p0,boolean p1){
       o w;
       if ((w = this.b.w) != null) {
          w.getParentFragmentManager().m.d(p0, true);
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          od2 ood2 = iterator.next();
          if (p1 && ood2.b == null) {
             continue ;
          }
          ood2.a.m0(p0);
       }
       return;
    }
    public final void e(Fragment p0,boolean p1){
       o w;
       if ((w = this.b.w) != null) {
          w.getParentFragmentManager().m.e(p0, true);
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          od2 ood2 = iterator.next();
          if (p1 && ood2.b == null) {
             continue ;
          }
          ood2.a.n0(p0);
       }
       return;
    }
    public final void f(Fragment p0,boolean p1){
       o w;
       if ((w = this.b.w) != null) {
          w.getParentFragmentManager().m.f(p0, true);
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          od2 ood2 = iterator.next();
          if (p1 && ood2.b == null) {
             continue ;
          }
          ood2.a.o0(p0);
       }
       return;
    }
    public final void g(Fragment p0,boolean p1){
       o w;
       pd2 tb = this.b;
       if ((w = tb.w) != null) {
          w.getParentFragmentManager().m.g(p0, true);
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          od2 ood2 = iterator.next();
          if (p1 && ood2.b == null) {
             continue ;
          }
          ood2.a.p0(p0);
       }
       return;
    }
    public final void h(Fragment p0,Bundle p1,boolean p2){
       o w;
       if ((w = this.b.w) != null) {
          w.getParentFragmentManager().m.h(p0, p1, true);
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          od2 ood2 = iterator.next();
          if (p2 && ood2.b == null) {
             continue ;
          }
          ood2.a.q0(p0);
       }
       return;
    }
    public final void i(Fragment p0,boolean p1){
       o w;
       if ((w = this.b.w) != null) {
          w.getParentFragmentManager().m.i(p0, true);
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          od2 ood2 = iterator.next();
          if (p1 && ood2.b == null) {
             continue ;
          }
          ood2.a.r0(p0);
       }
       return;
    }
    public final void j(Fragment p0,Bundle p1,boolean p2){
       o w;
       if ((w = this.b.w) != null) {
          w.getParentFragmentManager().m.j(p0, p1, true);
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          od2 ood2 = iterator.next();
          if (p2 && ood2.b == null) {
             continue ;
          }
          ood2.a.s0(p0);
       }
       return;
    }
    public final void k(Fragment p0,boolean p1){
       o w;
       if ((w = this.b.w) != null) {
          w.getParentFragmentManager().m.k(p0, true);
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          od2 ood2 = iterator.next();
          if (p1 && ood2.b == null) {
             continue ;
          }
          ood2.a.t0(p0);
       }
       return;
    }
    public final void l(Fragment p0,boolean p1){
       o w;
       if ((w = this.b.w) != null) {
          w.getParentFragmentManager().m.l(p0, true);
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          od2 ood2 = iterator.next();
          if (p1 && ood2.b == null) {
             continue ;
          }
          ood2.a.u0(p0);
       }
       return;
    }
    public final void m(Fragment p0,View p1,Bundle p2,boolean p3){
       o w;
       pd2 tb = this.b;
       if ((w = tb.w) != null) {
          w.getParentFragmentManager().m.m(p0, p1, p2, true);
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          od2 ood2 = iterator.next();
          if (p3 && ood2.b == null) {
             continue ;
          }
          ood2.a.v0(tb, p0, p1);
       }
       return;
    }
    public final void n(Fragment p0,boolean p1){
       o w;
       if ((w = this.b.w) != null) {
          w.getParentFragmentManager().m.n(p0, true);
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          od2 ood2 = iterator.next();
          if (p1 && ood2.b == null) {
             continue ;
          }
          ood2.a.w0(p0);
       }
       return;
    }
}
