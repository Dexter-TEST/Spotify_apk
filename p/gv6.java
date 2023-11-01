package p.gv6;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.StringBuilder;

public final class gv6	// class@00178a from classes.dex
{
    public long a;
    public final ArrayList b;

    public void gv6(){
       super();
       this.b = new ArrayList();
    }
    public final String toString(){
       gv6 tb = this.b;
       StringBuilder str = "SampleEntry{sampleDelta="+this.a+", subsampleCount="+tb.size()+", subsampleEntries="+tb;
       return str+'}';
    }
}
