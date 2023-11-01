package p.fn6;
import java.lang.Comparable;
import java.lang.Object;
import p.rk;
import java.util.Arrays;
import p.vk3;
import java.lang.String;
import java.lang.StringBuilder;

public final class fn6 implements Comparable	// class@001601 from classes.dex
{
    public rk[] A;
    public int B;
    public int C;
    public boolean a;
    public int b;
    public int c;
    public int t;
    public float v;
    public boolean w;
    public final float[] x;
    public final float[] y;
    public int z;

    public void fn6(int p0){
       super();
       this.b = -1;
       this.c = -1;
       this.t = 0;
       this.w = false;
       float[] uofloatArray = new float[9];
       this.x = uofloatArray;
       float[] uofloatArray1 = new float[9];
       this.y = uofloatArray1;
       rk[] orkArray = new rk[16];
       this.A = orkArray;
       this.B = 0;
       this.C = 0;
       this.z = p0;
    }
    public final void a(rk p0){
       fn6 tB;
       int i = 0;
       while (true) {
          tB = this.B;
          if (i < tB) {
             if (this.A[i] == p0) {
                return;
             }else {
                i = i + 1;
             }
          }else {
             fn6 tA = this.A;
             if (tB >= tA.length) {
                this.A = Arrays.copyOf(tA, (tA.length * 2));
                break ;
             }
             break ;
          }
       }
       tB = this.B;
       this.A[tB] = p0;
       this.B = tB + 1;
       return;
    }
    public final void b(rk p0){
       fn6 tB = this.B;
       int i = 0;
       while (true) {
          if (i >= tB) {
             return;
          }
          if (this.A[i] == p0) {
             while (true) {
                int i1 = tB - 1;
                if (i < i1) {
                   fn6 tA = this.A;
                   int i2 = i + 1;
                   tA[i] = tA[i2];
                   i = i2;
                }else {
                   break ;
                }
             }
             this.B = this.B - 1;
             return;
          }else {
             i = i + 1;
          }
       }
    }
    public final void c(){
       this.z = 5;
       int i = 0;
       this.t = i;
       this.b = -1;
       this.c = -1;
       this.v = 0;
       this.w = i;
       fn6 tB = this.B;
       for (int i1 = 0; i1 < tB; i1 = i1 + 1) {
          this.A[i1] = null;
       }
       this.B = i;
       this.C = i;
       this.a = i;
       Arrays.fill(this.y, 0);
       return;
    }
    public final int compareTo(Object p0){
       return (this.b - p0.b);
    }
    public final void d(vk3 p0,float p1){
       this.v = p1;
       this.w = true;
       fn6 tB = this.B;
       this.c = -1;
       for (int i = 0; i < tB; i = i + 1) {
          this.A[i].h(p0, this, false);
       }
       this.B = 0;
       return;
    }
    public final void e(vk3 p0,rk p1){
       fn6 tB = this.B;
       for (int i = 0; i < tB; i = i + 1) {
          this.A[i].i(p0, p1, false);
       }
       this.B = 0;
       return;
    }
    public final String toString(){
       return this.b;
    }
}
