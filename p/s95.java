package p.s95;
import android.view.animation.PathInterpolator;
import android.graphics.Path;

public abstract class s95	// class@0025e5 from classes.dex
{

    public static PathInterpolator a(float p0,float p1){
       return new PathInterpolator(p0, p1);
    }
    public static PathInterpolator b(float p0,float p1,float p2,float p3){
       return new PathInterpolator(p0, p1, p2, p3);
    }
    public static PathInterpolator c(Path p0){
       return new PathInterpolator(p0);
    }
}
