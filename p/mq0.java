package p.mq0;
import java.lang.Object;
import java.lang.String;
import java.util.Arrays;

public final class mq0	// class@001ee2 from classes.dex
{
    public int[] a;
    public int[] b;
    public int c;
    public int[] d;
    public float[] e;
    public int f;
    public int[] g;
    public String[] h;
    public int i;
    public int[] j;
    public boolean[] k;
    public int l;

    public void mq0(){
       super();
       int[] ointArray = new int[10];
       this.a = ointArray;
       ointArray = new int[10];
       this.b = ointArray;
       this.c = 0;
       int[] ointArray1 = new int[10];
       this.d = ointArray1;
       float[] uofloatArray = new float[10];
       this.e = uofloatArray;
       this.f = 0;
       ointArray1 = new int[5];
       this.g = ointArray1;
       String[] stringArray = new String[5];
       this.h = stringArray;
       this.i = 0;
       ointArray1 = new int[4];
       this.j = ointArray1;
       boolean[] uobooleanArr = new boolean[4];
       this.k = uobooleanArr;
       this.l = 0;
    }
    public final void a(float p0,int p1){
       mq0 td = this.d;
       if (this.f >= td.length) {
          this.d = Arrays.copyOf(td, (td.length * 2));
          mq0 te = this.e;
          this.e = Arrays.copyOf(te, (te.length * 2));
       }
       td = this.f;
       this.d[td] = p1;
       this.f = td + 1;
       p1[td] = p0;
       return;
    }
    public final void b(int p0,int p1){
       mq0 ta = this.a;
       if (this.c >= ta.length) {
          this.a = Arrays.copyOf(ta, (ta.length * 2));
          mq0 tb = this.b;
          this.b = Arrays.copyOf(tb, (tb.length * 2));
       }
       ta = this.c;
       this.a[ta] = p0;
       this.c = ta + 1;
       p0[ta] = p1;
       return;
    }
    public final void c(int p0,String p1){
       mq0 tg = this.g;
       if (this.i >= tg.length) {
          this.g = Arrays.copyOf(tg, (tg.length * 2));
          mq0 th = this.h;
          this.h = Arrays.copyOf(th, (th.length * 2));
       }
       tg = this.i;
       this.g[tg] = p0;
       this.i = tg + 1;
       p0[tg] = p1;
       return;
    }
    public final void d(int p0,boolean p1){
       mq0 tj = this.j;
       if (this.l >= tj.length) {
          this.j = Arrays.copyOf(tj, (tj.length * 2));
          mq0 tk = this.k;
          this.k = Arrays.copyOf(tk, (tk.length * 2));
       }
       tj = this.l;
       this.j[tj] = p0;
       this.l = tj + 1;
       p0[tj] = p1;
       return;
    }
}
