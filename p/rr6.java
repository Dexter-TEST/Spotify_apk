package p.rr6;
import p.fe1;
import p.sr6;
import android.content.res.Resources;
import p.ge1;

public abstract class rr6 extends fe1	// class@002545 from classes.dex
{
    public int[][] H;

    public void rr6(rr6 p0,sr6 p1,Resources p2){
       super(p0, p1, p2);
       if (p0 != null) {
          this.H = p0.H;
       }else {
          int[][] ointArray = new int[][this.g.length];
          this.H = ointArray;
       }
       return;
    }
}
