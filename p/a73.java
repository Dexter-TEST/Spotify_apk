package p.a73;
import p.do5;
import java.lang.String;
import p.w51;
import java.lang.Object;
import java.lang.Class;
import java.util.Arrays;

public abstract class a73 extends do5	// class@000f28 from classes.dex
{
    public Object[] F;
    public int G;
    public boolean H;

    public void a73(int p0){
       super();
       w51.h(p0, "initialCapacity");
       Object[] objArray = new Object[p0];
       this.F = objArray;
       this.G = 0;
    }
    public final void D0(Object p0){
       p0.getClass();
       this.E0((this.G + 1));
       a73 tG = this.G;
       this.G = tG + 1;
       this.F[tG] = p0;
    }
    public final void E0(int p0){
       a73 tF = this.F;
       if (tF.length < p0) {
          this.F = Arrays.copyOf(tF, do5.t(tF.length, p0));
          this.H = false;
       }else if(this.H != null){
          this.F = tF.clone();
          this.H = false;
       }
       return;
    }
}
