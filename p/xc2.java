package p.xc2;
import p.nn6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.b57;
import p.e70;
import java.lang.StringBuilder;
import java.lang.Class;

public abstract class xc2 implements nn6	// class@0003bb from classes2.dex
{
    public final nn6 a;

    public void xc2(nn6 p0){
       co5.o(p0, "delegate");
       super();
       this.a = p0;
    }
    public void close(){
       this.a.close();
    }
    public final b57 e(){
       return this.a.e();
    }
    public long o(e70 p0,long p1){
       co5.o(p0, "sink");
       return this.a.o(p0, p1);
    }
    public final String toString(){
       return this.getClass().getSimpleName()+'('+this.a+')';
    }
}
