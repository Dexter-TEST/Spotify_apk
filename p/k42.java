package p.k42;
import p.la6;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.kg4;
import java.util.Iterator;
import p.i42;

public final class k42 implements la6	// class@001ba2 from classes.dex
{
    public final File a;
    public final int b;
    public final int c;

    public void k42(File p0,int p1){
       co5.o(p0, "start");
       kg4.t(p1, "direction");
       super();
       this.a = p0;
       this.b = p1;
       this.c = Integer.MAX_VALUE;
    }
    public final Iterator iterator(){
       return new i42(this);
    }
}
