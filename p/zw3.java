package p.zw3;
import p.vh6;
import p.wf2;
import android.animation.Animator;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class zw3 extends vh6	// class@002f7b from classes.dex
{
    public final int a;
    public final wf2 b;

    public void zw3(wf2 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onAnimationEnd(Animator p0){
       switch (this.a){
           case 0:
           default:
             co5.o(p0, "animation");
             return;
       }
       co5.o(p0, "animation");
       this.b.invoke();
       return;
    }
    public final void onAnimationStart(Animator p0){
       switch (this.a){
           case 1:
           default:
             co5.o(p0, "animation");
             return;
       }
       co5.o(p0, "animation");
       this.b.invoke();
       return;
    }
}
