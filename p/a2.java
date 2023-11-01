package p.a2;
import p.lo5;
import java.util.Random;

public abstract class a2 extends lo5	// class@000f02 from classes.dex
{

    public void a2(){
       super();
    }
    public final int a(int p0){
       return (((- p0) >> 31) & (this.e().nextInt() >> (p0 - 32)));
    }
    public final int b(){
       return this.e().nextInt();
    }
    public final int c(int p0){
       return this.e().nextInt(p0);
    }
    public abstract Random e();
}
