package p.l74;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import p.m74;

public final class l74 implements Serializable	// class@001cfa from classes.dex
{
    public final String a;
    public final int b;
    public final String c;

    public void l74(String p0,int p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    private Object readResolve(){
       return new m74(this.a, this.b, this.c);
    }
}
