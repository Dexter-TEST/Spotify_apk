package p.qk2;
import android.animation.AnimatorListenerAdapter;
import p.rk2;
import android.animation.Animator;
import p.up0;
import com.spotify.legacyglue.contextmenu.glue.GlueContextMenuLayout;

public final class qk2 extends AnimatorListenerAdapter	// class@0023ba from classes.dex
{
    public final int a;
    public final rk2 b;

    public void qk2(rk2 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onAnimationEnd(Animator p0){
       qk2 tb = this.b;
       switch (this.a){
           case 0:
           default:
             super.onAnimationEnd(p0);
             tb.d.setProgressBarVisibility(8);
             return;
       }
       tb.a.e();
       return;
    }
}
