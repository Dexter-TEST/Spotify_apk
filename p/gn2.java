package p.gn2;
import java.lang.Object;
import android.util.SparseIntArray;

public abstract class gn2	// class@00173f from classes.dex
{
    public final SparseIntArray a;
    public final SparseIntArray b;
    public boolean c;

    public void gn2(){
       super();
       this.a = new SparseIntArray();
       this.b = new SparseIntArray();
       this.c = false;
    }
    public final int a(int p0,int p1){
       int i = this.c(p0);
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (i1 < p0) {
          int i4 = this.c(i1);
          if ((i2 = i2 + i4) == p1) {
             i3 = i3 + 1;
             i2 = 0;
          }else if(i2 > p1){
             i3 = i3 + 1;
             i2 = i4;
          }
          i1 = i1 + 1;
       }
       if (((i2 + i)) > p1) {
          i3 = i3 + 1;
       }
       return i3;
    }
    public int b(int p0,int p1){
       int i;
       int i1;
       int i5;
       gn2 ogn2;
       if ((i = this.c(p0)) == p1) {
          return 0;
       }
       if (this.c != null) {
          gn2 ta = this.a;
          i1 = -1;
          int i2 = ta.size() + i1;
          int i3 = 0;
          while (i3 <= i2) {
             int i4 = i3 + i2;
             i4 = i4 >> 1;
             if (ta.keyAt(i4) < p0) {
                i3 = i4 + 1;
             }else {
                i2 = i4 - 1;
             }
          }
          if ((i3 = i3 + i1) >= 0 && i3 < ta.size()) {
             i1 = ta.keyAt(i3);
          }
          if (i1 >= 0) {
             i5 = this.c(i1) + ta.get(i1);
             ogn2 = this;
          label_0053 :
             i1 = i1 + 1;
          label_0045 :
             if (i1 < p0) {
                i3 = ogn2.c(i1);
                if ((i5 = i5 + i3) == p1) {
                   i5 = 0;
                   goto label_0053 ;
                }else if(i5 > p1){
                   i5 = i3;
                   goto label_0053 ;
                }else {
                   goto label_0053 ;
                }
             }else if(((i + i5)) <= p1){
                return i5;
             }else {
                return 0;
             }
          }
       }
       ogn2 = this;
       i5 = 0;
       i1 = 0;
       goto label_0045 ;
    }
    public abstract int c(int p0);
    public final void d(){
       this.a.clear();
    }
}
