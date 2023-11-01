package p.vp7;
import p.uv1;
import p.pp7;
import p.xp7;
import java.lang.Object;
import android.view.View;
import p.pc1;
import p.aa3;
import p.yo4;
import java.lang.Boolean;

public class vp7	// class@002a40 from classes.dex
{
    public final xp7 a;
    public static final xp7 b;

    static {
       vp7.b = new uv1(6).b.b().a.a().a.b().a.c();
    }
    public void vp7(xp7 p0){
       super();
       this.a = p0;
    }
    public xp7 a(){
       return this.a;
    }
    public xp7 b(){
       return this.a;
    }
    public xp7 c(){
       return this.a;
    }
    public void d(View p0){
    }
    public pc1 e(){
       return null;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof vp7) {
          return false;
       }
       if (this.n() != p0.n() || (this.m() != p0.m() || (!yo4.a(this.j(), p0.j()) || (!yo4.a(this.h(), p0.h()) || !yo4.a(this.e(), p0.e()))))) {
          b = false;
       }
       return b;
    }
    public aa3 f(int p0){
       return aa3.e;
    }
    public aa3 g(){
       return this.j();
    }
    public aa3 h(){
       return aa3.e;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{Boolean.valueOf(this.n()),Boolean.valueOf(this.m()),this.j(),this.h(),this.e()};
       return yo4.b(objArray);
    }
    public aa3 i(){
       return this.j();
    }
    public aa3 j(){
       return aa3.e;
    }
    public aa3 k(){
       return this.j();
    }
    public xp7 l(int p0,int p1,int p2,int p3){
       return vp7.b;
    }
    public boolean m(){
       return false;
    }
    public boolean n(){
       return false;
    }
    public void o(aa3[] p0){
    }
    public void p(xp7 p0){
    }
    public void q(aa3 p0){
    }
}
