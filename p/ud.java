package p.ud;
import p.yd;
import p.rd;
import java.lang.Object;
import p.qy;
import p.po6;
import p.z52;
import java.util.List;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import p.a27;

public final class ud implements yd	// class@002891 from classes.dex
{
    public final rd a;
    public final rd b;

    public void ud(rd p0,rd p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final qy a(){
       return new po6(this.a.a(), this.b.a());
    }
    public final List b(){
       throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
    public final boolean c(){
       boolean b = (this.a.c() && this.b.c())? true: false;
       return b;
    }
}
