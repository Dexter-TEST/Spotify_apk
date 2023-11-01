package p.er0;
import p.lo4;
import java.lang.Object;
import p.dl3;
import java.util.concurrent.ConcurrentSkipListMap;

public final class er0 implements lo4	// class@0014df from classes.dex
{
    public final int a;

    public void er0(int p0){
       this.a = p0;
       super();
    }
    public final Object k(){
       switch (this.a){
           case 0:
           default:
             return new ConcurrentSkipListMap();
       }
       return new dl3();
    }
}
