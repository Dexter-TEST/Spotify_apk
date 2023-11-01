package p.c80;
import p.d80;
import p.i80;

public final class c80 extends d80	// class@0011b4 from classes.dex
{
    public int a;
    public final int b;
    public final i80 c;

    public void c80(i80 p0){
       this.c = p0;
       super();
       this.a = 0;
       this.b = p0.size();
    }
    public final boolean hasNext(){
       boolean b = (this.a < this.b)? true: false;
       return b;
    }
}
