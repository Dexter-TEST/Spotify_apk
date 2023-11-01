package p.j23;
import p.iu2;
import p.k23;
import p.c23;
import p.o23;
import p.g23;
import p.a23;
import p.v23;
import java.lang.String;
import p.m73;
import com.google.common.collect.c;
import java.lang.Object;
import p.co5;
import p.ju2;
import p.i23;
import java.util.List;
import p.uk;
import java.lang.Iterable;
import p.oi;
import p.il3;
import java.io.Serializable;
import p.eb3;
import p.zt2;
import p.au2;
import java.util.Set;
import p.tt2;
import java.util.Map;
import p.io2;
import java.util.Collection;
import java.util.Arrays;
import p.ys5;
import java.lang.Class;
import p.b23;
import p.fu2;
import java.util.HashMap;
import p.hu2;
import p.tu2;

public final class j23 extends iu2	// class@001a50 from classes.dex
{
    public final c23 a;
    public final o23 b;
    public final g23 c;
    public final a23 d;
    public final a23 e;
    public final a23 f;
    public final v23 g;
    public final String h;
    public final String i;
    public final m73 j;
    public final c k;
    public final k23 l;

    public void j23(k23 p0,c23 p1,o23 p2,g23 p3,a23 p4,a23 p5,a23 p6,v23 p7,String p8,String p9,m73 p10,c p11){
       co5.o(p1, "componentId");
       co5.o(p2, "text");
       co5.o(p3, "images");
       co5.o(p4, "metadata");
       co5.o(p5, "logging");
       co5.o(p6, "custom");
       co5.o(p10, "events");
       co5.o(p11, "children");
       this.l = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = p7;
       this.h = p8;
       this.i = p9;
       this.j = p10;
       this.k = p11;
    }
    public final iu2 a(ju2[] p0){
       iu2 oiu2;
       int i = (!p0.length)? 1: 0;
       if (i) {
          oiu2 = this;
       }else {
          oiu2 = new i23(this);
          oiu2.k.a(oi.a(uk.h0(p0)));
       }
       return oiu2;
    }
    public final iu2 b(String p0,Serializable p1){
       iu2 oiu2;
       if (eb3.g(this.f, p0, p1)) {
          oiu2 = this;
       }else {
          oiu2 = new i23(this);
          oiu2.f = oiu2.f.q(p0, p1);
       }
       return oiu2;
    }
    public final iu2 c(au2 p0){
       iu2 oiu2;
       co5.o(p0, "custom");
       if (p0.keySet().isEmpty()) {
          oiu2 = this;
       }else {
          oiu2 = new i23(this);
          oiu2.c(p0);
       }
       return oiu2;
    }
    public final iu2 e(String p0,tt2 p1){
       iu2 oiu2;
       co5.o(p1, "command");
       j23 tj = this.j;
       co5.o(tj, "map");
       if (io2.j(p1, tj.get(p0))) {
          oiu2 = this;
       }else {
          oiu2 = new i23(this);
          oiu2.e(p0, p1);
       }
       return oiu2;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof j23) {
          return false;
       }
       if (!io2.j(this.a, p0.a) || (!io2.j(this.b, p0.b) || (!io2.j(this.c, p0.c) || (!io2.j(this.d, p0.d) || (!io2.j(this.e, p0.e) || (!io2.j(this.f, p0.f) || (!io2.j(this.g, p0.g) || (!io2.j(this.h, p0.h) || (!io2.j(this.i, p0.i) || (!io2.j(this.j, p0.j) || !io2.j(this.k, p0.k))))))))))) {
          b = false;
       }
       return b;
    }
    public final iu2 f(String p0,Serializable p1){
       iu2 oiu2;
       if (eb3.g(this.d, p0, p1)) {
          oiu2 = this;
       }else {
          oiu2 = new i23(this);
          oiu2.d = oiu2.d.q(p0, p1);
       }
       return oiu2;
    }
    public final k23 g(){
       return this.l;
    }
    public final iu2 h(List p0){
       iu2 oiu2;
       if (oi.j(this.k, p0)) {
          oiu2 = this;
       }else {
          oiu2 = new i23(this);
          oiu2.h(p0);
       }
       return oiu2;
    }
    public final int hashCode(){
       Object[] objArray = new Object[11];
       objArray[0] = this.a;
       objArray[1] = this.b;
       objArray[2] = this.c;
       objArray[3] = this.d;
       objArray[4] = this.e;
       objArray[5] = this.f;
       objArray[6] = this.g;
       objArray[7] = this.h;
       objArray[8] = this.i;
       objArray[9] = this.j;
       objArray[10] = this.k;
       return Arrays.hashCode(objArray);
    }
    public final iu2 i(ju2[] p0){
       iu2 oiu2;
       int i = (!p0.length)? 1: 0;
       if (i) {
          oiu2 = this.h(ys5.v);
       }else {
          i23 oi23 = new i23(this);
          oi23.h(uk.h0(p0));
          oiu2 = oi23;
       }
       return oiu2;
    }
    public final iu2 j(String p0,String p1){
       co5.o(p1, "category");
       c23.t.getClass();
       return this.k(b23.a(p0, p1));
    }
    public final iu2 k(fu2 p0){
       j23 ta;
       iu2 oiu2;
       co5.o(p0, "componentId");
       if ((ta = this.a) == p0) {
          ta = 1;
       }else if(ta == null){
          c23.t.getClass();
          ta = c23.e();
       }
       boolean b = co5.c(ta, p0);
       if (ta) {
          oiu2 = this;
       }else {
          oiu2 = new i23(this);
          oiu2.a = p0;
       }
       return oiu2;
    }
    public final iu2 l(au2 p0){
       iu2 oiu2;
       if (oi.k(this.f, p0)) {
          oiu2 = this;
       }else {
          oiu2 = new i23(this);
          oiu2.l(p0);
       }
       return oiu2;
    }
    public final iu2 m(HashMap p0){
       j23 tj;
       iu2 oiu2;
       int i = 1;
       if ((tj = this.j) != p0) {
          tj = (tj != null && !tj.isEmpty())? 0: 1;
          if (tj) {
             tj = (p0.isEmpty())? 1: 0;
             if (!tj) {
             label_0020 :
                oiu2 = 0;
             }
          }else {
             goto label_0020 ;
          }
       }
       if (i) {
          oiu2 = this;
       }else {
          oiu2 = new i23(this);
          oiu2.m(p0);
       }
       return oiu2;
    }
    public final iu2 n(String p0){
       iu2 oiu2;
       if (io2.j(this.i, p0)) {
          oiu2 = this;
       }else {
          oiu2 = new i23(this);
          oiu2.i = p0;
       }
       return oiu2;
    }
    public final iu2 o(String p0){
       iu2 oiu2;
       if (io2.j(this.h, p0)) {
          oiu2 = this;
       }else {
          oiu2 = new i23(this);
          oiu2.h = p0;
       }
       return oiu2;
    }
    public final iu2 q(hu2 p0){
       j23 tc;
       iu2 oiu2;
       g23 og23;
       if ((tc = this.c) == p0) {
          tc = 1;
       }else if(tc == null){
          g23.c.getClass();
          tc = g23.j();
       }
       if (p0 == null) {
          g23.c.getClass();
          og23 = g23.j();
       }else {
          og23 = p0;
       }
       boolean b = co5.c(tc, og23);
       if (tc) {
          oiu2 = this;
       }else {
          oiu2 = new i23(this);
          oiu2.q(p0);
       }
       return oiu2;
    }
    public final iu2 r(){
       iu2 oiu2;
       if (io2.j(this.g, null)) {
          oiu2 = this;
       }else {
          oiu2 = new i23(this);
          oiu2.g = null;
       }
       return oiu2;
    }
    public final iu2 t(tu2 p0){
       j23 tb;
       iu2 oiu2;
       o23 oo23;
       if ((tb = this.b) == p0) {
          tb = 1;
       }else if(tb == null){
          o23.c.getClass();
          tb = o23.b();
       }
       if (p0 == null) {
          o23.c.getClass();
          oo23 = o23.b();
       }else {
          oo23 = p0;
       }
       boolean b = co5.c(tb, oo23);
       if (tb) {
          oiu2 = this;
       }else {
          oiu2 = new i23(this);
          oiu2.t(p0);
       }
       return oiu2;
    }
}
