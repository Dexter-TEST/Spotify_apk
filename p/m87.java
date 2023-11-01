package p.m87;
import p.h87;
import java.util.ArrayList;
import android.view.ViewGroup;
import java.lang.Object;
import p.l87;
import java.util.Iterator;
import p.g87;
import p.b02;
import p.xe7;
import android.animation.TimeInterpolator;
import p.qf2;
import java.lang.String;
import java.lang.StringBuilder;
import p.en6;
import android.view.View;
import p.o87;
import p.oy6;

public class m87 extends h87	// class@001e48 from classes.dex
{
    public ArrayList O;
    public boolean P;
    public int Q;
    public boolean R;
    public int S;

    public void m87(){
       super();
       this.O = new ArrayList();
       this.P = true;
       this.R = false;
       this.S = 0;
    }
    public final void A(ViewGroup p0){
       super.A(p0);
       int i = this.O.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.O.get(i1).A(p0);
       }
       return;
    }
    public final void B(){
       h87 oh871;
       if (this.O.isEmpty()) {
          this.I();
          this.n();
          return;
       }else {
          l87 ol87 = new l87(this);
          Iterator iterator = this.O.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(ol87);
          }
          this.Q = this.O.size();
          if (this.P == null) {
             for (int i = 1; i < this.O.size(); i = i + 1) {
                int i1 = i - 1;
                h87 oh87 = this.O.get(i1);
                oh87.a(new b02(this, 2, this.O.get(i)));
             }
             if ((oh871 = this.O.get(0)) != null) {
                oh871.B();
             }
          }else {
             Iterator iterator1 = this.O.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().B();
             }
          }
          return;
       }
    }
    public final void C(long p0){
       m87 tO;
       this.c = p0;
       if ((p0) >= 0 && (tO = this.O) != null) {
          int i = tO.size();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             this.O.get(i1).C(p0);
          }
       }
       return;
    }
    public final void D(xe7 p0){
       this.J = p0;
       this.S = this.S | 0x08;
       int i = this.O.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.O.get(i1).D(p0);
       }
       return;
    }
    public final void E(TimeInterpolator p0){
       m87 tO;
       this.S = this.S | 0x01;
       if ((tO = this.O) != null) {
          int i = tO.size();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             this.O.get(i1).E(p0);
          }
       }
       this.t = p0;
       return;
    }
    public final void F(qf2 p0){
       super.F(p0);
       this.S = this.S | 0x04;
       if (this.O != null) {
          for (int i = 0; i < this.O.size(); i = i + 1) {
             this.O.get(i).F(p0);
          }
       }
       return;
    }
    public final void G(){
       this.S = this.S | 0x02;
       int i = this.O.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.O.get(i1).G();
       }
       return;
    }
    public final void H(long p0){
       this.b = p0;
    }
    public final String K(String p0){
       String str = super.K(p0);
       for (int i = 0; i < this.O.size(); i = i + 1) {
          str = en6.s(str, "\n").append(this.O.get(i).K("".append(p0).append("  ").toString())).toString();
       }
       return str;
    }
    public final void L(h87 p0){
       this.O.add(p0);
       p0.z = this;
       h87 tc = this.c;
       if ((tc) >= 0) {
          p0.C(tc);
       }
       if ((this.S & 0x01)) {
          p0.E(this.t);
       }
       if ((this.S & 0x02)) {
          p0.G();
       }
       if ((this.S & 0x04)) {
          p0.F(this.K);
       }
       if ((this.S & 0x08)) {
          p0.D(this.J);
       }
       return;
    }
    public final void a(g87 p0){
       super.a(p0);
    }
    public final void c(View p0){
       for (int i = 0; i < this.O.size(); i = i + 1) {
          this.O.get(i).c(p0);
       }
       this.w.add(p0);
       return;
    }
    public final void cancel(){
       super.cancel();
       int i = this.O.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.O.get(i1).cancel();
       }
       return;
    }
    public final Object clone(){
       return this.k();
    }
    public final void e(o87 p0){
       o87 b = p0.b;
       if (this.t(b)) {
          Iterator iterator = this.O.iterator();
          while (iterator.hasNext()) {
             h87 oh87 = iterator.next();
             if (oh87.t(b)) {
                oh87.e(p0);
                p0.c.add(oh87);
             }
          }
       }
       return;
    }
    public final void g(o87 p0){
       int i = this.O.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.O.get(i1).g(p0);
       }
       return;
    }
    public final void h(o87 p0){
       o87 b = p0.b;
       if (this.t(b)) {
          Iterator iterator = this.O.iterator();
          while (iterator.hasNext()) {
             h87 oh87 = iterator.next();
             if (oh87.t(b)) {
                oh87.h(p0);
                p0.c.add(oh87);
             }
          }
       }
       return;
    }
    public final h87 k(){
       m87 om87 = super.k();
       om87.O = new ArrayList();
       int i = this.O.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          h87 oh87 = this.O.get(i1).k();
          om87.O.add(oh87);
          oh87.z = om87;
       }
       return om87;
    }
    public final void m(ViewGroup p0,oy6 p1,oy6 p2,ArrayList p3,ArrayList p4){
       h87 oh87 = this;
       h87 b = oh87.b;
       int i = oh87.O.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          Object obj = oh87.O.get(i1);
          int i2 = 0;
          if ((b - i2) > 0 && (oh87.P != null && i1)) {
             h87 b1 = obj.b;
             if ((b1 - i2) > 0) {
                long l = b1 + b;
                obj.H(l);
             }else {
                obj.H(b);
             }
          }
          obj.m(p0, p1, p2, p3, p4);
       }
       return;
    }
    public final void v(View p0){
       super.v(p0);
       int i = this.O.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.O.get(i1).v(p0);
       }
       return;
    }
    public final void w(g87 p0){
       super.w(p0);
    }
    public final void z(View p0){
       for (int i = 0; i < this.O.size(); i = i + 1) {
          this.O.get(i).z(p0);
       }
       this.w.remove(p0);
       return;
    }
}
