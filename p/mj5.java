package p.mj5;
import p.nj5;
import android.view.View;
import java.lang.Object;
import java.util.ArrayList;
import p.ht5;
import p.id4;
import p.kd4;
import p.gd4;
import p.lj5;
import android.animation.StateListAnimator;
import android.animation.Animator;

public final class mj5 implements nj5	// class@001eaa from classes.dex
{
    public final float a;
    public final View b;
    public final ArrayList c;
    public final ArrayList d;
    public final boolean e;
    public static final int[] f;
    public static final int[] g;

    static {
       int[] ointArray = new int[]{0x10100a7};
       mj5.f = ointArray;
       ointArray = new int[0];
       mj5.g = ointArray;
    }
    public void mj5(View p0,float p1){
       super();
       this.c = new ArrayList();
       this.d = new ArrayList();
       this.e = true;
       this.b = p0;
       this.a = p1;
    }
    public final void a(){
       StateListAnimator stateListAni = new StateListAnimator();
       stateListAni.addState(mj5.f, gd4.a(new lj5(this)));
       stateListAni.addState(mj5.g, gd4.a(new ht5(this)));
       this.b.setStateListAnimator(stateListAni);
    }
}
