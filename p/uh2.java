package p.uh2;
import p.v50;
import android.content.Context;
import p.ty6;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.util.concurrent.CountDownLatch;
import java.lang.Thread;
import p.ha1;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import java.lang.Throwable;
import java.lang.Void;
import android.os.AsyncTask;
import p.t50;

public final class uh2 extends v50	// class@0028ad from classes.dex
{
    public final int a;
    public final WeakReference b;
    public final ty6 c;

    public void uh2(Context p0,ty6 p1,int p2){
       this.a = p2;
       if (p2 != 1) {
          super();
          this.b = new WeakReference(p0);
          this.c = p1;
          return;
       }else {
          super();
          this.b = new WeakReference(p0);
          this.c = p1;
          return;
       }
    }
    public final void a(){
       CountDownLatch uCountDownLa;
       int i = 1;
       switch (this.a){
           case 0:
             break;
           default:
             uCountDownLa = new CountDownLatch(i);
             Thread thread1 = new Thread(new ha1(this, 2, uCountDownLa));
             try{
                thread1.start();
                uCountDownLa.await(1500, TimeUnit.MILLISECONDS);
             }catch(java.lang.InterruptedException e0){
                e0.printStackTrace();
             }
             return;
       }
       uCountDownLa = new CountDownLatch(i);
       Thread thread = new Thread(new ha1(this, i, uCountDownLa));
       try{
          thread.start();
          uCountDownLa.await(1500, TimeUnit.MILLISECONDS);
       }catch(java.lang.InterruptedException e0){
          e0.printStackTrace();
       }
       return;
    }
    public final void b(Void p0){
       uh2 tc = this.c;
       switch (this.a){
           case 0:
             super.onPostExecute(p0);
             if (tc != null) {
                tc.m();
             }
             break;
           default:
             super.onPostExecute(p0);
             if (tc != null) {
                tc.m();
             }
             return;
       }
       return;
    }
    public final Object doInBackground(Object[] p0){
       switch (this.a){
           case 0:
           default:
             this.a();
             return null;
       }
       this.a();
       return null;
    }
    public final void onPostExecute(Object p0){
       switch (this.a){
           case 0:
           default:
             this.b(p0);
             return;
       }
       this.b(p0);
       return;
    }
}
