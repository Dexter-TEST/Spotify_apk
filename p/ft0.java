package p.ft0;
import p.vs0;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import android.graphics.drawable.Drawable;
import p.h25;
import p.dt0;
import java.lang.CharSequence;
import java.util.List;
import p.lp6;
import p.co5;
import p.en6;
import java.lang.StringBuilder;
import p.et0;
import p.kg4;

public final class ft0	// class@001630 from classes.dex
{
    public final vs0 a;
    public String b;
    public int c;
    public final boolean d;
    public boolean e;
    public final List f;

    public void ft0(){
       super(0);
    }
    public void ft0(int p0){
       super();
       this.a = new vs0();
       this.b = null;
       this.c = 1;
       this.d = false;
       this.e = false;
       this.f = new ArrayList();
    }
    public final dt0 a(int p0,String p1,Drawable p2,boolean p3,boolean p4,boolean p5,boolean p6,h25 p7,Drawable p8){
       dt0 v10 = new dt0(p0, p1, p2, p4, p5, p3, p8, p6, p7);
       this.f.add(v10);
       return v10;
    }
    public final void b(int p0,String p1,lp6 p2,h25 p3){
       this.a(p0, p1, p2, false, false, true, true, p3, null);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ft0) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (this.e != p0.e) {
          return false;
       }
       if (!co5.c(this.f, p0.f)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       ft0 td;
       int i = this.a.hashCode() * 31;
       ft0 tb = this.b;
       int i1 = 0;
       int i2 = (tb == null)? 0: tb.hashCode();
       i = (i + i2) * 31;
       if ((tb = this.c) != null) {
          i1 = en6.A(tb);
       }
       i = (i + i1) * 31;
       i2 = 1;
       if ((td = this.d) != null) {
          td = 1;
       }
       i = (i + td) * 31;
       if ((td = this.e) == null) {
          tb = td;
       }
       return (this.f.hashCode() + ((i + i2) * 31));
    }
    public final String toString(){
       return kg4.o("ContextMenuViewModel\(header="+this.a+", metadata="+this.b+", headerViewType="+et0.t(this.c)+", isOnline="+this.d+", isLoading="+this.e+", contextMenuItems=", this.f, ')');
    }
}
