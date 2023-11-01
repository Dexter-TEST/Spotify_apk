package p.gd2;
import p.s15;
import p.o25;
import p.i25;
import p.j25;
import p.ej7;
import p.p15;
import p.l7;
import p.v26;
import p.fe2;
import p.g64;
import p.nd2;
import androidx.fragment.app.k;
import androidx.activity.b;
import androidx.activity.a;
import androidx.fragment.app.o;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import java.lang.Object;
import android.view.View;
import android.app.Activity;
import android.view.Window;
import p.qd2;
import p.vj3;
import p.t26;
import p.u26;
import p.dj7;
import p.td2;
import androidx.activity.result.a;
import p.jr0;

public final class gd2 extends nd2 implements s15, o25, i25, j25, ej7, p15, l7, v26, fe2, g64	// class@0016e7 from classes.dex
{
    public final k v;

    public void gd2(k p0){
       this.v = p0;
       super(p0);
    }
    public final b a(){
       return this.v.x;
    }
    public final void b(o p0,Fragment p1){
       this.v.getClass();
    }
    public final View c(int p0){
       return this.v.findViewById(p0);
    }
    public final boolean d(){
       Window window;
       boolean b = ((window = this.v.getWindow()) != null && window.peekDecorView() != null)? true: false;
       return b;
    }
    public final void g(qd2 p0){
       this.v.g(p0);
    }
    public final vj3 getLifecycle(){
       return this.v.K;
    }
    public final t26 getSavedStateRegistry(){
       return this.v.v.b;
    }
    public final dj7 getViewModelStore(){
       return this.v.getViewModelStore();
    }
    public final void i(td2 p0){
       this.v.i(p0);
    }
    public final void j(td2 p0){
       this.v.j(p0);
    }
    public final void k(qd2 p0){
       this.v.k(p0);
    }
    public final void l(qd2 p0){
       this.v.l(p0);
    }
    public final void m(qd2 p0){
       this.v.m(p0);
    }
    public final void n(qd2 p0){
       this.v.n(p0);
    }
    public final void o(qd2 p0){
       this.v.o(p0);
    }
    public final a q(){
       return this.v.B;
    }
    public final void r(qd2 p0){
       this.v.r(p0);
    }
    public final void u(jr0 p0){
       this.v.u(p0);
    }
}
