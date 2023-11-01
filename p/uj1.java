package p.uj1;
import p.q94;
import java.lang.Object;
import android.util.SparseArray;
import p.e94;
import p.tj1;
import p.oz6;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class uj1	// class@0028bd from classes.dex
{
    public int a;
    public final q94 b;
    public q94 c;
    public q94 d;
    public int e;
    public int f;
    public final boolean g;
    public final int[] h;

    public void uj1(q94 p0,boolean p1,int[] p2){
       super();
       this.a = 1;
       this.b = p0;
       this.c = p0;
       this.g = p1;
       this.h = p2;
    }
    public final int a(int p0){
       q94 a = ((a = this.c.a) == null)? null: a.get(p0);
       int i = 2;
       if (this.a != i) {
          if (a == null) {
             this.b();
          label_0069 :
             i = 1;
          }else {
             this.a = i;
             this.c = a;
             this.f = 1;
          }
       }else if(a != null){
          this.c = a;
          this.f = this.f + 1;
       }else {
          int i1 = 0;
          a = (p0 == 0xfe0e)? 1: 0;
          if (a) {
             this.b();
             goto label_0069 ;
          }else if(p0 == 0xfe0f){
             i1 = 1;
          }
          if (!i1) {
             uj1 tc = this.c;
             if (tc.b != null) {
                if (this.f == 1) {
                   if (this.c()) {
                      this.d = this.c;
                      this.b();
                   }else {
                      this.b();
                      goto label_0069 ;
                   }
                }else {
                   this.d = tc;
                   this.b();
                }
                i = 3;
             }else {
                this.b();
                goto label_0069 ;
             }
          }
       }
       this.e = p0;
       return i;
    }
    public final void b(){
       this.a = 1;
       this.c = this.b;
       this.f = 0;
    }
    public final boolean c(){
       int i;
       uj1 th;
       e94 uoe94 = this.c.b.d();
       uoe94 = ((i = uoe94.a(6)) && uoe94.b.get((i + uoe94.a)))? 1: 0;
       if (uoe94) {
          return true;
       }else if(this.e == 0xfe0f){
          uoe94 = 1;
       }else {
          th = 0;
       }
       if (uoe94) {
          return true;
       }else if(this.g != null){
          if ((th = this.h) == null) {
             return true;
          }else if(Arrays.binarySearch(th, this.c.b.a(0)) < 0){
             return true;
          }
       }
       return 0;
    }
}
