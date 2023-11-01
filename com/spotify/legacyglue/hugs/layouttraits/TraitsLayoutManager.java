package com.spotify.legacyglue.hugs.layouttraits.TraitsLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import p.ri3;
import p.u44;
import java.lang.Object;
import p.j77;
import java.lang.Class;
import p.yq5;
import p.qi3;
import androidx.recyclerview.widget.RecyclerView;
import p.hn2;
import p.gn2;
import p.er5;
import p.en2;

public class TraitsLayoutManager extends GridLayoutManager	// class@0008fd from classes.dex
{
    public final u44 e0;
    public final j77 f0;
    public final ri3 g0;
    public qi3 h0;

    public void TraitsLayoutManager(ri3 p0,int p1){
       super(p1);
       this.e0 = new u44(27, this);
       this.f0 = new j77(0, this);
       p0.getClass();
       this.g0 = p0;
    }
    public final void D1(int p0){
       TraitsLayoutManager tg0;
       if ((tg0 = this.g0) != null && p0 != this.X) {
          tg0.a();
       }
       super.D1(p0);
       return;
    }
    public final void c0(yq5 p0){
       this.h0 = (p0 != null)? new qi3(this, p0): null;
       return;
    }
    public final void d0(RecyclerView p0){
       yq5 adapter;
       hn2 ohn2 = new hn2(this, p0);
       ohn2.c = true;
       this.c0 = ohn2;
       p0.h(this.f0, -1);
       this.h0 = ((adapter = p0.getAdapter()) != null)? new qi3(this, adapter): null;
       return;
    }
    public final void e0(RecyclerView p0){
       yq5 adapter;
       this.c0 = new en2();
       p0.b0(this.f0);
       this.h0 = ((adapter = p0.getAdapter()) != null)? new qi3(this, adapter): null;
       return;
    }
    public final void k0(RecyclerView p0,int p1,int p2){
       super.k0(p0, p1, p2);
       this.g0.a();
    }
    public final void l0(RecyclerView p0){
       super.l0(p0);
       this.g0.a();
    }
    public final void m0(RecyclerView p0,int p1,int p2){
       super.m0(p0, p1, p2);
       this.g0.a();
    }
    public final void n0(RecyclerView p0,int p1,int p2){
       super.n0(p0, p1, p2);
       this.g0.a();
    }
    public final void p0(RecyclerView p0,int p1,int p2,Object p3){
       super.p0(p0, p1, p2, p3);
       this.g0.a();
    }
}
