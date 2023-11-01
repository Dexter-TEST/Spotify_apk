package p.e73;
import p.d1;
import com.google.common.collect.c;
import java.util.AbstractCollection;
import java.lang.Object;
import java.util.List;

public final class e73 extends d1	// class@001431 from classes.dex
{
    public final c c;

    public void e73(c p0,int p1){
       super(p0.size(), p1);
       this.c = p0;
    }
    public final Object b(int p0){
       return this.c.get(p0);
    }
}
