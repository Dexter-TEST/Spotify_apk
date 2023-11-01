package p.bw7;
import java.lang.Runnable;
import java.lang.Object;
import p.l08;
import java.lang.Exception;

public abstract class bw7 implements Runnable	// class@00114e from classes.dex
{
    public final l08 a;

    public void bw7(){
       this.a = null;
    }
    public void bw7(l08 p0){
       this.a = p0;
    }
    public abstract void a();
    public final void run(){
       bw7 ta;
       try{
          this.a();
          return;
       }catch(java.lang.Exception e0){
          if ((ta = this.a) != null) {
             ta.a(e0);
          }
          return;
       }
    }
}
