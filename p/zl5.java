package p.zl5;
import android.view.animation.Animation;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.lang.Math;
import android.view.animation.LinearInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import java.lang.String;
import p.ce7;
import java.lang.CharSequence;

public final class zl5 extends Animation	// class@002f1e from classes.dex
{
    public final ProgressBar a;
    public final TextView b;
    public final int c;
    public final int t;

    public void zl5(ProgressBar p0,TextView p1,int p2,int p3,float p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = Math.max(0, p2);
       int i = (int)Math.max(0, ((float)(p3 - p2) * p4));
       this.t = i;
       this.setInterpolator(new LinearInterpolator());
       this.setDuration((long)i);
    }
    public final void applyTransformation(float p0,Transformation p1){
       zl5 tb;
       int i = this.c + (int)((float)this.t * p0);
       this.a.setProgress(i);
       if ((tb = this.b) != null) {
          tb.setText(ce7.l((long)i));
       }
       return;
    }
    public final boolean willChangeBounds(){
       return false;
    }
    public final boolean willChangeTransformationMatrix(){
       return false;
    }
}
