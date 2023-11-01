package p.xe5;
import p.a2;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class xe5 extends a2	// class@002c60 from classes.dex
{

    public void xe5(){
       super();
    }
    public final int d(int p0,int p1){
       return ThreadLocalRandom.current().nextInt(p0, p1);
    }
    public final Random e(){
       ThreadLocalRandom threadLocalR = ThreadLocalRandom.current();
       co5.l(threadLocalR, "current\(\)");
       return threadLocalR;
    }
}
