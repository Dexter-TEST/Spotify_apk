package p.dt0;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import p.h25;
import java.lang.Object;
import p.ct0;
import p.bt0;
import p.zs0;
import p.ys0;
import p.xs0;
import java.lang.String;
import p.ws0;
import p.at0;
import p.co5;
import java.lang.StringBuilder;

public final class dt0	// class@0013ae from classes.dex
{
    public final int a;
    public final CharSequence b;
    public final Drawable c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final Drawable h;
    public final boolean i;
    public final h25 j;

    public void dt0(int p0,CharSequence p1,Drawable p2,boolean p3,boolean p4,boolean p5,Drawable p6,boolean p7,h25 p8){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = false;
       this.h = p6;
       this.i = p7;
       this.j = p8;
    }
    public final ct0 a(){
       bt0 a;
       dt0 tc;
       ws0 ows01;
       ct0 ows01;
       if (this.d != null) {
          a = bt0.A;
       }else if(this.g != null){
          a = zs0.B;
       }else if(this.f != null){
          a = ys0.A;
       }else {
          a = zs0.A;
       }
       bt0 uobt0 = a;
       dt0 ta = this.a;
       xs0 oxs0 = new xs0(String.valueOf(this.b));
       a = 0;
       ws0 ows0 = ((tc = this.c) != null)? new ws0(tc): a;
       dt0 te = this.e;
       if ((tc = this.h) != null) {
          ows01 = new ws0(tc);
       }
       ows01 = new ct0(ta, oxs0, ows0, uobt0, te, ows01, this.i);
       return ows01;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof dt0) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (this.e != p0.e) {
          return false;
       }
       if (this.f != p0.f) {
          return false;
       }
       if (this.g != p0.g) {
          return false;
       }
       if (!co5.c(this.h, p0.h)) {
          return false;
       }
       if (this.i != p0.i) {
          return false;
       }
       if (!co5.c(this.j, p0.j)) {
          return false;
       }
       if (!co5.c(null, null)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       dt0 tb;
       dt0 td;
       int i2;
       int i = this.a * 31;
       int i1 = ((tb = this.b) == null)? 0: tb.hashCode();
       i = (i + i1) * 31;
       i1 = ((tb = this.c) == null)? 0: tb.hashCode();
       i = (i + i1) * 31;
       i1 = 1;
       if ((td = this.d) != null) {
          td = 1;
       }
       i = (i + td) * 31;
       if ((td = this.e) != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       if ((td = this.f) != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       if ((td = this.g) != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       i2 = ((td = this.h) == null)? 0: td.hashCode();
       i = (i + i2) * 31;
       if ((td = this.i) == null) {
          tb = td;
       }
       i = (i + i1) * 31;
       i1 = ((tb = this.j) == null)? 0: tb.hashCode();
       return (((i + i1) * 31) + 0);
    }
    public final String toString(){
       return "ContextMenuItemCompatImpl\(itemId="+this.a+", title="+this.b+", icon="+this.c+", isChecked="+this.d+", isEnabled="+this.e+", isActivated="+this.f+", isDestructive="+this.g+", accessoryIcon="+this.h+", shouldCloseMenuWhenClicked="+this.i+", onMenuItemClickListener="+this.j+", ubiEventGenerator=null\)";
    }
}
