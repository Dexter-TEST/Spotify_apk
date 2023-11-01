package p.xw2;
import p.fv2;
import p.n96;
import p.m96;
import p.k96;
import java.lang.Class;
import p.zk2;
import p.ju2;
import p.uu2;
import p.bt2;
import android.content.Context;
import android.view.ViewGroup;
import p.l96;
import p.tu2;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.TextView;
import p.o96;
import java.lang.Object;
import android.view.LayoutInflater;
import android.view.View;
import p.eo5;

public final class xw2 extends fv2	// class@002cfd from classes.dex
{
    public final int e;

    public void xw2(int p0){
       this.e = p0;
       switch (p0){
           case 1:
             super(m96.class);
             return;
           case 2:
             super(n96.class);
             return;
           case 3:
             super(k96.class);
             return;
           case 4:
             super(k96.class);
             return;
           case 5:
             super(k96.class);
             return;
           case 6:
             super(k96.class);
             return;
           case 7:
             super(k96.class);
             return;
           case 8:
             super(k96.class);
             return;
           case 9:
             super(n96.class);
             return;
           case 10:
             super(m96.class);
             return;
           default:
             super(k96.class);
             return;
       }
    }
    public final void e(zk2 p0,ju2 p1,uu2 p2,bt2 p3){
       switch (this.e){
           case 1:
             this.n(p0, p1, p2, p3);
             return;
           case 2:
             this.o(p0, p1, p2, p3);
             return;
           case 6:
             super.k(p0, p1, p2, p3);
             return;
           case 7:
             super.k(p0, p1, p2, p3);
             return;
           case 8:
             super.k(p0, p1, p2, p3);
             return;
           case 9:
             this.o(p0, p1, p2, p3);
             return;
           case 10:
             this.n(p0, p1, p2, p3);
             return;
           default:
             this.k(p0, p1, p2, p3);
             return;
       }
    }
    public final zk2 f(Context p0,ViewGroup p1,uu2 p2){
       switch (this.e){
           case 0:
             return this.p(p0, p1);
           case 1:
             return this.q(p0, p1);
           case 2:
             return this.r(p0, p1);
           case 3:
             return this.p(p0, p1);
           case 4:
             return this.p(p0, p1);
           case 5:
             return this.p(p0, p1);
           case 6:
             return this.p(p0, p1);
           case 7:
             return this.p(p0, p1);
           case 8:
             return this.p(p0, p1);
           case 9:
             return this.r(p0, p1);
           default:
             return this.q(p0, p1);
       }
    }
    public final void k(k96 p0,ju2 p1,uu2 p2,bt2 p3){
       switch (this.e){
           case 1:
             this.n(p0, p1, p2, p3);
             return;
           case 2:
             this.o(p0, p1, p2, p3);
             return;
           case 9:
             this.o(p0, p1, p2, p3);
             return;
           case 10:
             this.n(p0, p1, p2, p3);
             return;
           default:
             super.k(p0, p1, p2, p3);
             return;
       }
    }
    public final void n(m96 p0,ju2 p1,uu2 p2,bt2 p3){
       m96 w = p0.w;
       switch (this.e){
           case 1:
           default:
             super.k(p0, p1, p2, p3);
             w.setText(p1.y().m());
             return;
       }
       super.k(p0, p1, p2, p3);
       w.setText(p1.y().m());
       return;
    }
    public final void o(n96 p0,ju2 p1,uu2 p2,bt2 p3){
       n96 w = p0.w;
       switch (this.e){
           case 2:
           default:
             super.k(p0, p1, p2, p3);
             w.setText(p1.y().e());
             return;
       }
       super.k(p0, p1, p2, p3);
       w.setText(p1.y().m());
       return;
    }
    public final l96 p(Context p0,ViewGroup p1){
       l96 ol96;
       int i = 0x7f0d0161;
       int i1 = 0x7f0d0160;
       fv2 td = this.d;
       switch (this.e){
           case 0:
             td.b.getClass();
             ol96 = new l96(LayoutInflater.from(p0).inflate(R.layout.solar_sectionheader, p1, false));
             eo5.P(ol96);
             return ol96;
           case 3:
             td.b.getClass();
             ol96 = new l96(LayoutInflater.from(p0).inflate(R.layout.solar_sectionheader_extra_small, p1, false));
             eo5.P(ol96);
             return ol96;
           case 4:
             td.b.getClass();
             ol96 = new l96(LayoutInflater.from(p0).inflate(i1, p1, false));
             eo5.P(ol96);
             return ol96;
           case 5:
             td.b.getClass();
             ol96 = new l96(LayoutInflater.from(p0).inflate(i, p1, false));
             eo5.P(ol96);
             return ol96;
           case 6:
             td.b.getClass();
             ol96 = new l96(LayoutInflater.from(p0).inflate(i1, p1, false));
             eo5.P(ol96);
             return ol96;
           case 7:
             td.b.getClass();
             ol96 = new l96(LayoutInflater.from(p0).inflate(i, p1, false));
             eo5.P(ol96);
             return ol96;
           default:
             td.b.getClass();
             ol96 = new l96(LayoutInflater.from(p0).inflate(R.layout.solar_sectionheader, p1, false));
             eo5.P(ol96);
             return ol96;
       }
    }
    public final m96 q(Context p0,ViewGroup p1){
       m96 om96;
       fv2 td = this.d;
       switch (this.e){
           case 1:
           default:
             td.b.getClass();
             om96 = new m96(LayoutInflater.from(p0).inflate(R.layout.solar_sectionheader_with_metadata, p1, false));
             eo5.P(om96);
             return om96;
       }
       td.b.getClass();
       om96 = new m96(LayoutInflater.from(p0).inflate(R.layout.solar_sectionheader_with_metadata, p1, false));
       eo5.P(om96);
       return om96;
    }
    public final n96 r(Context p0,ViewGroup p1){
       n96 on96;
       fv2 td = this.d;
       switch (this.e){
           case 2:
           default:
             td.b.getClass();
             on96 = new n96(LayoutInflater.from(p0).inflate(R.layout.solar_sectionheader_with_subtitle, p1, false));
             eo5.P(on96);
             return on96;
       }
       td.b.getClass();
       on96 = new n96(LayoutInflater.from(p0).inflate(R.layout.solar_sectionheader_with_subtitle, p1, false));
       eo5.P(on96);
       return on96;
    }
}
