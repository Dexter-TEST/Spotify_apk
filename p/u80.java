package p.u80;
import p.xc2;
import p.nn6;
import p.v80;
import p.xb1;

public final class u80 extends xc2	// class@00285d from classes.dex
{
    public final v80 b;

    public void u80(nn6 p0,v80 p1){
       this.b = p1;
       super(p0);
    }
    public final void close(){
       this.b.b.close();
       super.close();
    }
}
