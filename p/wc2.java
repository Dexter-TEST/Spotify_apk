package p.wc2;
import p.el6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.e70;
import p.b57;
import java.lang.StringBuilder;
import java.lang.Class;

public abstract class wc2 implements el6	// class@0003a1 from classes2.dex
{
    private final el6 a;

    public void wc2(el6 p0){
       co5.o(p0, "delegate");
       super();
       this.a = p0;
    }
    public void I(e70 p0,long p1){
       co5.o(p0, "source");
       this.a.I(p0, p1);
    }
    public void close(){
       this.a.close();
    }
    public b57 e(){
       return this.a.e();
    }
    public void flush(){
       this.a.flush();
    }
    public String toString(){
       return this.getClass().getSimpleName()+'('+this.a+')';
    }
}
