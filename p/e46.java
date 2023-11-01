package p.e46;
import p.n46;
import p.ie5;
import java.lang.String;
import java.util.List;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import p.k5;
import p.sl6;
import java.lang.Integer;
import java.lang.Object;
import p.co5;
import java.util.ArrayList;
import java.lang.Class;
import p.tp2;
import p.kg4;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.util.Iterator;
import android.os.Parcelable;
import p.je5;
import java.lang.Enum;

public final class e46 implements n46	// class@001419 from classes.dex
{
    public final sl6 A;
    public final boolean B;
    public final Integer C;
    public final String a;
    public final String b;
    public final List c;
    public final SearchConfiguration t;
    public final k5 v;
    public final k5 w;
    public final int x;
    public final List y;
    public final List z;
    public static final Parcelable$Creator CREATOR;

    static {
       e46.CREATOR = new ie5(1);
    }
    public void e46(String p0,String p1,List p2,SearchConfiguration p3,k5 p4,k5 p5,int p6,List p7,List p8,sl6 p9,boolean p10,Integer p11){
       co5.o(p0, "step");
       co5.o(p1, "pageTitle");
       co5.o(p7, "pickerTags");
       co5.o(p8, "selectedItemsTags");
       co5.o(p9, "skipType");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
       this.y = p7;
       this.z = p8;
       this.A = p9;
       this.B = p10;
       this.C = p11;
    }
    public static e46 a(e46 p0,ArrayList p1,List p2,List p3,Integer p4,int p5){
       e46 uoe46 = p0;
       int i = p5;
       int i1 = 0;
       e46 uoe461 = ((i & 0x01))? uoe46.a: i1;
       e46 uoe462 = ((i & 0x02))? uoe46.b: i1;
       e46 uoe463 = ((i & 0x04))? uoe46.c: p1;
       e46 uoe464 = ((i & 0x08))? uoe46.t: i1;
       e46 uoe465 = ((i & 0x10))? uoe46.v: i1;
       e46 uoe466 = ((i & 0x20))? uoe46.w: i1;
       e46 uoe467 = ((i & 0x40))? uoe46.x: 0;
       e46 uoe468 = ((i & 0x0080))? uoe46.y: p2;
       e46 uoe469 = ((i & 0x0100))? uoe46.z: p3;
       if ((i & 0x0200)) {
          i1 = uoe46.A;
       }
       e46 uoe4610 = i1;
       e46 uoe4611 = ((i & 0x0400))? uoe46.B: false;
       e46 uoe4612 = ((i & 0x0800))? uoe46.C: p4;
       p0.getClass();
       co5.o(uoe461, "step");
       co5.o(uoe462, "pageTitle");
       co5.o(uoe463, "items");
       co5.o(uoe468, "pickerTags");
       co5.o(uoe469, "selectedItemsTags");
       co5.o(uoe4610, "skipType");
       uoe46 = new e46(uoe461, uoe462, uoe463, uoe464, uoe465, uoe466, uoe467, uoe468, uoe469, uoe4610, uoe4611, uoe4612);
       return uoe46;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof e46) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (!co5.c(this.t, p0.t)) {
          return false;
       }
       if (!co5.c(this.v, p0.v)) {
          return false;
       }
       if (!co5.c(this.w, p0.w)) {
          return false;
       }
       if (this.x != p0.x) {
          return false;
       }
       if (!co5.c(this.y, p0.y)) {
          return false;
       }
       if (!co5.c(this.z, p0.z)) {
          return false;
       }
       if (this.A != p0.A) {
          return false;
       }
       if (this.B != p0.B) {
          return false;
       }
       if (!co5.c(this.C, p0.C)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       e46 tt;
       e46 tB;
       int i = kg4.j(this.c, tp2.g(this.b, (this.a.hashCode() * 31), 31), 31);
       int i1 = 0;
       int i2 = ((tt = this.t) == null)? 0: tt.hashCode();
       i = (i + i2) * 31;
       i2 = ((tt = this.v) == null)? 0: tt.hashCode();
       i = (i + i2) * 31;
       i2 = ((tt = this.w) == null)? 0: tt.hashCode();
       i2 = (this.A.hashCode() + kg4.j(this.z, kg4.j(this.y, ((((i + i2) * 31) + this.x) * 31), 31), 31)) * 31;
       if ((tB = this.B) != null) {
          tB = 1;
       }
       i2 = (i2 + tB) * 31;
       if ((tB = this.C) != null) {
          i1 = tB.hashCode();
       }
       return (i2 + i1);
    }
    public final String toString(){
       return "ContentPicker\(step="+this.a+", pageTitle="+this.b+", items="+this.c+", search="+this.t+", primaryActionButton="+this.v+", secondaryActionButton="+this.w+", minSelection="+this.x+", pickerTags="+this.y+", selectedItemsTags="+this.z+", skipType="+this.A+", showFooterToEncourageSelection="+this.B+", scrollToPosition="+this.C+')';
    }
    public final void writeToParcel(Parcel p0,int p1){
       e46 tt;
       e46 tC;
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeString(this.b);
       e46 tc = this.c;
       p0.writeInt(tc.size());
       Iterator iterator = tc.iterator();
       while (iterator.hasNext()) {
          p0.writeParcelable(iterator.next(), p1);
       }
       if ((tt = this.t) == null) {
          p0.writeInt(0);
       }else {
          p0.writeInt(1);
          tt.writeToParcel(p0, p1);
       }
       if ((tt = this.v) == null) {
          p0.writeInt(0);
       }else {
          p0.writeInt(1);
          tt.writeToParcel(p0, p1);
       }
       if ((tt = this.w) == null) {
          p0.writeInt(0);
       }else {
          p0.writeInt(1);
          tt.writeToParcel(p0, p1);
       }
       p0.writeInt(this.x);
       tt = this.y;
       p0.writeInt(tt.size());
       Iterator iterator1 = tt.iterator();
       while (iterator1.hasNext()) {
          iterator1.next().writeToParcel(p0, p1);
       }
       p0.writeStringList(this.z);
       p0.writeString(this.A.name());
       p0.writeInt(this.B);
       if ((tC = this.C) == null) {
          p0.writeInt(0);
       }else {
          p0.writeInt(1);
          p0.writeInt(tC.intValue());
       }
       return;
    }
}
