package p.k23;
import p.ju2;
import android.os.Parcelable;
import p.h23;
import p.fu2;
import p.tu2;
import p.hu2;
import p.au2;
import p.p33;
import java.lang.String;
import java.util.Map;
import java.util.List;
import p.t33;
import p.c23;
import p.o23;
import p.g23;
import p.a23;
import p.v23;
import p.m73;
import com.google.common.collect.c;
import java.lang.Object;
import p.co5;
import p.j23;
import p.o26;
import p.ay6;
import p.wf2;
import p.iu2;
import java.lang.Class;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.ArrayList;
import java.util.Collection;
import p.io2;
import p.ui3;
import java.lang.Number;
import android.os.Parcel;
import p.eo5;
import p.oi;
import p.ry7;
import p.pc;

public class k23 implements ju2, Parcelable	// class@001b91 from classes.dex
{
    private final j23 a;
    private final ui3 b;
    public static final Parcelable$Creator CREATOR;
    public static final h23 c;
    private static final k23 t;

    static {
       k23.c = new h23();
       k23.t = h23.a(null, null, null, null, null, null, null, null, null, null, null);
       k23.CREATOR = new t33(5);
    }
    public void k23(c23 p0,o23 p1,g23 p2,a23 p3,a23 p4,a23 p5,v23 p6,String p7,String p8,m73 p9,c p10){
       int i = this;
       Object obj = p0;
       co5.o(obj, "componentId");
       Object obj1 = p1;
       co5.o(obj1, "text");
       Object obj2 = p2;
       co5.o(obj2, "images");
       Object obj3 = p3;
       co5.o(obj3, "metadata");
       Object obj4 = p4;
       co5.o(obj4, "logging");
       Object obj5 = p5;
       co5.o(obj5, "custom");
       Object obj6 = p9;
       co5.o(obj6, "events");
       Object obj7 = p10;
       co5.o(obj7, "children");
       super();
       j23 v14 = new j23(this, obj, obj1, obj2, obj3, obj4, obj5, p6, p7, p8, obj6, obj7);
       i.a = v14;
       i.b = new ay6(new o26(15, this));
    }
    public static final k23 L(){
       return k23.t;
    }
    public static final j23 M(k23 p0){
       return p0.a;
    }
    public static final iu2 N(){
       k23.c.getClass();
       return k23.L().a();
    }
    public static final k23 P(fu2 p0,tu2 p1,hu2 p2,au2 p3,au2 p4,au2 p5,p33 p6,String p7,String p8,Map p9,List p10){
       k23.c.getClass();
       return h23.a(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
    }
    public static final k23 R(){
       k23.c.getClass();
       return k23.L();
    }
    public static final k23 U(ju2 p0){
       k23.c.getClass();
       return h23.b(p0);
    }
    public au2 C(){
       return this.V();
    }
    public p33 D(){
       return this.X();
    }
    public c23 O(){
       return this.a.a;
    }
    public a23 Q(){
       return this.a.f;
    }
    public ju2 S(String p0){
       ju2 oju2;
       Iterator iterator = this.j().iterator();
       do {
          if (iterator.hasNext()) {
          }else {
             oju2 = null;
             break ;
          }
          oju2 = iterator.next();
       } while (co5.c(oju2.c(), p0));
       return oju2;
    }
    public g23 T(){
       return this.a.c;
    }
    public a23 V(){
       return this.a.e;
    }
    public a23 W(){
       return this.a.d;
    }
    public v23 X(){
       return this.a.g;
    }
    public o23 Y(){
       return this.a.b;
    }
    public iu2 a(){
       return this.a;
    }
    public au2 b(){
       return this.Q();
    }
    public String c(){
       return this.a.h;
    }
    public au2 d(){
       return this.W();
    }
    public int describeContents(){
       return 0;
    }
    public List e(String p0){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.j().iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (co5.c(obj.group(), p0)) {
             uArrayList.add(obj);
          }
       }
       return uArrayList;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof k23) {
          return false;
       }
       return io2.j(this.a, p0.a);
    }
    public String group(){
       return this.a.i;
    }
    public int hashCode(){
       return this.b.getValue().intValue();
    }
    public List j(){
       return this.a.k;
    }
    public Map m(){
       return this.a.j;
    }
    public fu2 q(){
       return this.O();
    }
    public hu2 u(){
       return this.T();
    }
    public void writeToParcel(Parcel p0,int p1){
       boolean b;
       co5.o(p0, "dest");
       j23 a = this.a.a;
       int i = 1;
       if (a == null) {
          a = 1;
       }else {
          c23.t.getClass();
          b = co5.c(a, c23.e());
       }
       au2 uoau2 = null;
       Parcelable parcelable = (a)? uoau2: this.a.a;
       eo5.d0(p1, p0, parcelable);
       if ((a = this.a.b) == null) {
          parcelable = 1;
       }else {
          o23.c.getClass();
          b = co5.c(a, o23.b());
       }
       parcelable = (parcelable)? uoau2: this.a.b;
       eo5.d0(p1, p0, parcelable);
       if ((a = this.a.c) != null) {
          g23.c.getClass();
          i = co5.c(a, g23.j());
       }
       parcelable = (i)? uoau2: this.a.c;
       eo5.d0(p1, p0, parcelable);
       au2 uoau21 = (oi.k(this.a.d, uoau2))? uoau2: this.a.d;
       eo5.d0(p1, p0, uoau21);
       uoau21 = (oi.k(this.a.e, uoau2))? uoau2: this.a.e;
       eo5.d0(p1, p0, uoau21);
       if (!oi.k(this.a.f, uoau2)) {
          uoau2 = this.a.f;
       }
       eo5.d0(p1, p0, uoau2);
       eo5.d0(p1, p0, this.a.g);
       p0.writeString(this.a.h);
       p0.writeString(this.a.i);
       eo5.Z(p0, this.a.j, ry7.F, 0);
       oi.o(p0, this.a.k);
       return;
    }
    public tu2 y(){
       return this.Y();
    }
}
