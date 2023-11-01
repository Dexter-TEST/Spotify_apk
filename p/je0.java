package p.je0;
import java.lang.Iterable;
import p.ch3;
import java.lang.Object;
import p.io2;
import java.util.Iterator;
import p.ke0;

public abstract class je0 implements Iterable, ch3	// class@001aba from classes.dex
{
    public final char a;
    public final char b;
    public final int c;

    public void je0(char p0,char p1){
       super();
       this.a = p0;
       this.b = (char)io2.m(p0, p1, 1);
       this.c = 1;
    }
    public final Iterator iterator(){
       return new ke0(this.a, this.b, this.c);
    }
}
