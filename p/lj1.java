package p.lj1;
import java.lang.Runnable;
import java.lang.Object;
import p.x67;
import java.lang.String;
import p.w67;
import p.hj1;

public final class lj1 implements Runnable	// class@001d63 from classes.dex
{
    public final int a;

    public void lj1(int p0){
       this.a = p0;
       super();
    }
    public final void run(){
       switch (this.a){
           case 0:
             w67.a("EmojiCompat.EmojiCompatInitializer.run");
             int i = (hj1.j != null)? 1: 0;
             if (i) {
                hj1.a().c();
             }
             break;
           default:
             return;
       }
       w67.b();
       return;
    }
    public final String toString(){
       switch (this.a){
           case 1:
           default:
             return super.toString();
       }
       return "EmptyRunnable";
    }
}
