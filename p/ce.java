package p.ce;
import p.xe7;
import android.graphics.drawable.AnimationDrawable;
import p.de;
import java.lang.Object;
import java.lang.String;
import android.animation.ObjectAnimator;
import p.gk0;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import android.animation.ValueAnimator;

public final class ce extends xe7	// class@0011f3 from classes.dex
{
    public final ObjectAnimator F;
    public final boolean G;

    public void ce(AnimationDrawable p0,boolean p1,boolean p2){
       int i = 0;
       super(i);
       int numberOfFram = p0.getNumberOfFrames();
       int i1 = (p1)? numberOfFram - 1: 0;
       numberOfFram = (p1)? 0: numberOfFram - 1;
       de uode = new de(p0, p1);
       int[] ointArray = new int[]{i1,numberOfFram};
       ObjectAnimator objectAnimat = ObjectAnimator.ofInt(p0, "currentIndex", ointArray);
       gk0.a(objectAnimat, 1);
       objectAnimat.setDuration((long)uode.c);
       objectAnimat.setInterpolator(uode);
       this.G = p2;
       this.F = objectAnimat;
       return;
    }
    public final void Y(){
       this.F.reverse();
    }
    public final void f0(){
       this.F.start();
    }
    public final boolean g(){
       return this.G;
    }
    public final void g0(){
       this.F.cancel();
    }
}
