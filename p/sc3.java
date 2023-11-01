package p.sc3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.Arrays;

public final class sc3	// class@0025ff from classes.dex
{
    public final long[] a;
    public final boolean[] b;
    public final int[] c;
    public boolean d;

    public void sc3(int p0){
       super();
       long[] olongArray = new long[p0];
       this.a = olongArray;
       boolean[] uobooleanArr = new boolean[p0];
       this.b = uobooleanArr;
       int[] ointArray = new int[p0];
       this.c = ointArray;
    }
    public final int[] a(){
       _monitor_enter(this);
       if (this.d == null) {
          _monitor_exit(this);
          return null;
       }else {
          sc3 ta = this.a;
          int len = ta.length;
          int i = 0;
          int i1 = 0;
          while (i < len) {
             int i2 = i1 + 1;
             int i3 = 1;
             boolean b = ((ta[i]) > 0)? true: false;
             sc3 tb = this.b;
             if (b != tb[i1]) {
                sc3 tc = this.c;
                if (!b) {
                   i3 = 2;
                }
                tc[i1] = i3;
             }else {
                this.c[i1] = 0;
             }
             tb[i1] = b;
             i = i + 1;
             i1 = i2;
          }
          this.d = false;
          _monitor_exit(this);
          return this.c.clone();
       }
    }
    public final boolean b(int[] p0){
       co5.o(p0, "tableIds");
       _monitor_enter(this);
       int len = p0.length;
       int i = 0;
       boolean b = false;
       while (i < len) {
          int i1 = p0[i];
          sc3 ta = this.a;
          long l = ta[i1];
          long l1 = 1 + l;
          ta[i1] = l1;
          if (!(l)) {
             b = true;
             this.d = b;
          }
          i = i + 1;
       }
       _monitor_exit(this);
       return b;
    }
    public final boolean c(int[] p0){
       co5.o(p0, "tableIds");
       _monitor_enter(this);
       int len = p0.length;
       int i = 0;
       boolean b = false;
       while (i < len) {
          int i1 = p0[i];
          sc3 ta = this.a;
          long l = ta[i1];
          long l1 = l - 1;
          ta[i1] = l1;
          if (!(l - 1)) {
             b = true;
             this.d = b;
          }
          i = i + 1;
       }
       _monitor_exit(this);
       return b;
    }
    public final void d(){
       _monitor_enter(this);
       Arrays.fill(this.b, false);
       this.d = true;
       _monitor_exit(this);
    }
}
