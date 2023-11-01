package p.y23;
import p.a43;
import p.z23;
import java.lang.String;
import p.k23;
import com.google.common.collect.c;
import p.a23;
import java.lang.Object;
import p.co5;
import java.util.List;
import p.x23;
import p.ju2;
import p.uk;
import java.io.Serializable;
import p.eb3;
import p.zt2;
import p.au2;
import java.util.Set;
import java.util.Collection;
import p.oi;
import p.io2;
import p.ys5;
import java.util.Arrays;
import java.util.AbstractCollection;
import java.lang.Iterable;
import p.il3;

public final class y23 extends a43	// class@002d36 from classes.dex
{
    public final String a;
    public final String b;
    public final k23 c;
    public final c d;
    public final c e;
    public final String f;
    public final a23 g;
    public final z23 h;

    public void y23(z23 p0,String p1,String p2,k23 p3,c p4,c p5,String p6,a23 p7){
       co5.o(p4, "body");
       co5.o(p5, "overlays");
       co5.o(p7, "custom");
       this.h = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = p7;
    }
    public final a43 a(List p0){
       a43 uoa43;
       co5.o(p0, "components");
       if (p0.isEmpty()) {
          uoa43 = this;
       }else {
          uoa43 = new x23(this);
          uoa43.a(p0);
       }
       return uoa43;
    }
    public final a43 b(ju2[] p0){
       a43 uoa43;
       int i = (!p0.length)? 1: 0;
       if (i) {
          uoa43 = this;
       }else {
          uoa43 = new x23(this);
          uoa43.a(uk.h0(p0));
       }
       return uoa43;
    }
    public final a43 c(String p0,Serializable p1){
       a43 uoa43;
       if (eb3.g(this.g, p0, p1)) {
          uoa43 = this;
       }else {
          uoa43 = new x23(this);
          uoa43.g = uoa43.g.q(p0, p1);
       }
       return uoa43;
    }
    public final a43 d(au2 p0){
       a43 uoa43;
       co5.o(p0, "custom");
       if (p0.keySet().isEmpty()) {
          uoa43 = this;
       }else {
          uoa43 = new x23(this);
          uoa43.d(p0);
       }
       return uoa43;
    }
    public final a43 e(List p0){
       a43 uoa43;
       if (oi.j(this.d, p0)) {
          uoa43 = this;
       }else {
          uoa43 = new x23(this);
          uoa43.e(p0);
       }
       return uoa43;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof y23) {
          return false;
       }
       if (!io2.j(this.a, p0.a) || (!io2.j(this.b, p0.b) || (!io2.j(this.c, p0.c) || (!io2.j(this.d, p0.d) || (!io2.j(this.e, p0.e) || (!io2.j(this.f, p0.f) || !io2.j(this.g, p0.g))))))) {
          b = false;
       }
       return b;
    }
    public final a43 f(ju2[] p0){
       a43 uoa43;
       int i = (!p0.length)? 1: 0;
       if (i) {
          uoa43 = this.e(ys5.v);
       }else {
          x23 ox23 = new x23(this);
          ox23.e(uk.h0(p0));
          uoa43 = ox23;
       }
       return uoa43;
    }
    public final z23 g(){
       return this.h;
    }
    public final a43 h(au2 p0){
       a43 uoa43;
       if (oi.k(this.g, p0)) {
          uoa43 = this;
       }else {
          uoa43 = new x23(this);
          uoa43.h(p0);
       }
       return uoa43;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b,this.c,this.d,this.e,this.f,this.g};
       return Arrays.hashCode(objArray);
    }
    public final a43 i(ju2 p0){
       a43 uoa43;
       if (oi.f(this.c, p0)) {
          uoa43 = this;
       }else {
          uoa43 = new x23(this);
          uoa43.i(p0);
       }
       return uoa43;
    }
    public final a43 j(String p0){
       a43 uoa43;
       if (io2.j(this.a, p0)) {
          uoa43 = this;
       }else {
          uoa43 = new x23(this);
          uoa43.a = p0;
       }
       return uoa43;
    }
    public final a43 k(ju2[] p0){
       a43 uoa43;
       int i = (!p0.length)? 1: 0;
       Iterable iterable = null;
       if (i) {
          ys5 v = ys5.v;
          if (oi.j(this.e, v)) {
             uoa43 = this;
          }else {
             uoa43 = new x23(this);
             if (v != null && !v.isEmpty()) {
                iterable = oi.a(v);
             }
             uoa43.e.b(iterable);
          }
       }else {
          uoa43 = new x23(this);
          List list = uk.h0(p0);
          if (!list.isEmpty()) {
             iterable = oi.a(list);
          }
          uoa43.e.b(iterable);
       }
       return uoa43;
    }
    public final a43 l(String p0){
       a43 uoa43;
       if (io2.j(this.b, p0)) {
          uoa43 = this;
       }else {
          uoa43 = new x23(this);
          uoa43.b = p0;
       }
       return uoa43;
    }
}
