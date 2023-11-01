package p.i91;
import p.la6;
import java.lang.CharSequence;
import p.zu6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.Iterator;
import p.h91;

public final class i91 implements la6	// class@00194a from classes.dex
{
    public final CharSequence a;
    public final int b;
    public final int c;
    public final ng2 d;

    public void i91(CharSequence p0,int p1,int p2,zu6 p3){
       co5.o(p0, "input");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final Iterator iterator(){
       return new h91(this);
    }
}
