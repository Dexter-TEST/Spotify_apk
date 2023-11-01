package p.m5;
import p.ls5;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.concurrent.atomic.AtomicReference;

public final class m5 extends ls5	// class@001e2f from classes.dex
{
    public final int a;

    public void m5(int p0,Object p1){
       this.a = p0;
       super(p1);
    }
    public final String toString(){
       String str = ", ";
       switch (this.a){
           case 0:
           default:
             return "RunnableDisposable\(disposed="+this.isDisposed()+str+this.get()+"\)";
       }
       return "ActionDisposable\(disposed="+this.isDisposed()+str+this.get()+"\)";
    }
}
