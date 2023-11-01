package p.rk;
import p.oy6;
import java.lang.Object;
import java.util.ArrayList;
import p.hk;
import p.vk3;
import p.fn6;
import p.qk;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;
import p.en6;

public class rk	// class@002509 from classes.dex
{
    public fn6 a;
    public float b;
    public final ArrayList c;
    public qk d;
    public boolean e;

    public void rk(oy6 p0){
       super();
       this.a = null;
       this.b = 0;
       this.c = new ArrayList();
       this.e = false;
       this.d = new hk(this, p0);
    }
    public final void a(vk3 p0,int p1){
       this.d.d(p0.j(p1), 0x3f800000);
       this.d.d(p0.j(p1), 0xbf800000);
    }
    public final void b(fn6 p0,fn6 p1,fn6 p2,int p3){
       int i = 0;
       if (p3) {
          if (p3 < 0) {
             p3 = p3 * -1;
             i = 1;
          }
          this.b = (float)p3;
       }
       if (!i) {
          this.d.d(p0, 0xbf800000);
          this.d.d(p1, 0x3f800000);
          this.d.d(p2, 0x3f800000);
       }else {
          this.d.d(p0, 0x3f800000);
          this.d.d(p1, 0xbf800000);
          this.d.d(p2, 0xbf800000);
       }
       return;
    }
    public final void c(fn6 p0,fn6 p1,fn6 p2,int p3){
       int i = 0;
       if (p3) {
          if (p3 < 0) {
             p3 = p3 * -1;
             i = 1;
          }
          this.b = (float)p3;
       }
       if (!i) {
          this.d.d(p0, 0xbf800000);
          this.d.d(p1, 0x3f800000);
          this.d.d(p2, 0xbf800000);
       }else {
          this.d.d(p0, 0x3f800000);
          this.d.d(p1, 0xbf800000);
          this.d.d(p2, 0x3f800000);
       }
       return;
    }
    public fn6 d(boolean[] p0){
       return this.f(p0, null);
    }
    public boolean e(){
       boolean b = (this.a == null && (!(0 - this.b) && !this.d.g()))? true: false;
       return b;
    }
    public final fn6 f(boolean[] p0,fn6 p1){
       fn6 z;
       int i = this.d.g();
       fn6 uofn6 = null;
       int i1 = 0;
       int i2 = 0;
       while (i1 < i) {
          float f = this.d.a(i1);
          if ((f) < 0) {
             fn6 uofn61 = this.d.h(i1);
             if (p0 == null || (!p0[uofn61.b] && (uofn61 != p1 && ((z = uofn61.z) == 3 || (z == 4 && (f - i2) < 0))))) {
                i2 = f;
                uofn6 = uofn61;
             }
          }
          i1 = i1 + 1;
       }
       return uofn6;
    }
    public final void g(fn6 p0){
       rk ta;
       if ((ta = this.a) != null) {
          this.d.d(ta, 0xbf800000);
          this.a.c = -1;
          this.a = null;
       }
       float f = this.d.c(p0, true) * 0xbf800000;
       this.a = p0;
       if (!(0x3f800000 - f)) {
          return;
       }else {
          this.b = this.b / f;
          this.d.j(f);
          return;
       }
    }
    public final void h(vk3 p0,fn6 p1,boolean p2){
       if (p1 != null && p1.w != null) {
          this.b = (p1.v * this.d.i(p1)) + this.b;
          this.d.c(p1, p2);
          if (p2) {
             p1.b(this);
          }
          if (!this.d.g()) {
             this.e = true;
             p0.a = true;
          }
       }
       return;
    }
    public void i(vk3 p0,rk p1,boolean p2){
       this.b = (p1.b * this.d.b(p1, p2)) + this.b;
       if (p2) {
          p1.a.b(this);
       }
       if (this.a != null && !this.d.g()) {
          this.e = true;
          p0.a = true;
       }
       return;
    }
    public String toString(){
       int i1;
       fn6 uofn6;
       String str = (this.a == null)? "0": this.a;
       str = kg4.l(str, " = ");
       int i = 0;
       if (0 - this.b) {
          str = en6.r(str)+this.b;
          i1 = 1;
       }else {
          i1 = 0;
       }
       int i2 = this.d.g();
       while (i < i2) {
          if ((uofn6 = this.d.h(i)) != null) {
             float f = this.d.a(i);
             if (v7 = 0 - f) {
                String str1 = uofn6.toString();
                if (!i1) {
                   if ((f) < 0) {
                      str = kg4.l(str, "- ");
                   label_0071 :
                      f = f * 0xbf800000;
                   }
                }else if(v7 > 0){
                   str = kg4.l(str, " + ");
                }else {
                   str = kg4.l(str, " - ");
                   goto label_0071 ;
                }
                str = (!(0x3f800000 - f))? kg4.l(str, str1): "".append(str).append(f).append(" ").append(str1).toString();
                i1 = 1;
             }
          }
          i = i + 1;
       }
       if (!i1) {
          str = kg4.l(str, "0.0");
       }
       return str;
    }
}
