package p.fa6;
import p.v96;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p.ea6;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;

public final class fa6 extends v96	// class@00158f from classes.dex
{
    public final AtomicReferenceArray e;

    public void fa6(long p0,fa6 p1,int p2){
       super(p0, p1, p2);
       this.e = new AtomicReferenceArray(ea6.f);
    }
    public final int f(){
       return ea6.f;
    }
    public final String toString(){
       return "SemaphoreSegment[id="+this.c+", hashCode="+this.hashCode()+']';
    }
}
