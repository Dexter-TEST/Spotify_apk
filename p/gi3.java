package p.gi3;
import p.fh2;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import p.ns5;
import java.lang.Class;
import p.ps5;
import p.co5;

public abstract class gi3 implements fh2, Serializable	// class@001713 from classes.dex
{
    private final int arity;

    public void gi3(int p0){
       this.arity = p0;
    }
    public int getArity(){
       return this.arity;
    }
    public String toString(){
       ns5.a.getClass();
       String str = ps5.a(this);
       co5.l(str, "renderLambdaToString\(this\)");
       return str;
    }
}
