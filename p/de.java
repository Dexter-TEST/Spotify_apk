package p.de;
import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;
import java.lang.Object;

public final class de implements TimeInterpolator	// class@001332 from classes.dex
{
    public int[] a;
    public int b;
    public int c;

    public void de(AnimationDrawable p0,boolean p1){
       de ta;
       int i2;
       super();
       int numberOfFram = p0.getNumberOfFrames();
       this.b = numberOfFram;
       if ((ta = this.a) == null || ta.length < numberOfFram) {
          int[] ointArray = new int[numberOfFram];
          this.a = ointArray;
       }
       ta = this.a;
       int i1 = 0;
       for (int i = 0; i < numberOfFram; i = i + 1) {
          if (p1) {
             i2 = numberOfFram - i;
             i2 = i2 - 1;
          }else {
             i2 = i;
          }
          i2 = p0.getDuration(i2);
          ta[i] = i2;
          i1 = i1 + i2;
       }
       this.c = i1;
       return;
    }
    public final float getInterpolation(float p0){
       int i = (int)((p0 * (float)this.c) + 0x3f000000);
       de tb = this.b;
       de ta = this.a;
       for (int i1 = 0; i1 < tb; i1 = i1 + 1) {
          int i2 = ta[i1];
          if (i >= i2) {
             i = i - i2;
          }else if(i1 < tb){
             i = (float)i / (float)this.c;
          }else {
             i = 0;
          }
          return (((float)i1 / (float)tb) + i);
       }
    }
}
