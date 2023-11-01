package p.xs5;
import p.z63;
import java.lang.Object;
import com.google.common.collect.d;
import p.dt5;
import p.j73;
import java.lang.IllegalArgumentException;
import p.at5;
import p.m73;
import p.bt5;
import p.ct5;

public final class xs5 extends z63	// class@002cdc from classes.dex
{
    public final Object t;
    public final Object[] v;
    public final int w;
    public final int x;
    public final xs5 y;
    public static final xs5 z;

    static {
       xs5.z = new xs5();
    }
    public void xs5(){
       super();
       this.t = null;
       Object[] objArray = new Object[0];
       this.v = objArray;
       this.w = 0;
       this.x = 0;
       this.y = this;
    }
    public void xs5(int p0,Object[] p1){
       super();
       this.v = p1;
       this.x = p0;
       int i = 0;
       this.w = i;
       int i1 = 2;
       int i2 = (p0 >= i1)? d.m(p0): 0;
       Object obj = dt5.l(p1, p0, i2, i);
       if (!obj instanceof Object[]) {
          this.t = obj;
          obj = dt5.l(p1, p0, i2, 1);
          if (!obj instanceof Object[]) {
             this.y = new xs5(obj, p1, p0, this);
             return;
          }else {
             throw obj[i1].a();
          }
       }else {
          throw obj[i1].a();
       }
    }
    public void xs5(Object p0,Object[] p1,int p2,xs5 p3){
       super();
       this.t = p0;
       this.v = p1;
       this.w = 1;
       this.x = p2;
       this.y = p3;
    }
    public final at5 c(){
       return new at5(this, this.v, this.w, this.x);
    }
    public final bt5 d(){
       return new bt5(this, new ct5(this.w, this.x, this.v));
    }
    public final void g(){
    }
    public final Object get(Object p0){
       if ((p0 = dt5.m(this.t, this.v, this.x, this.w, p0)) == null) {
          p0 = null;
       }
       return p0;
    }
    public final int size(){
       return this.x;
    }
}
