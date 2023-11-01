package p.qb7;
import java.lang.Exception;
import p.bx5;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class qb7 extends Exception	// class@00236f from classes.dex
{
    public final bx5 a;

    public void qb7(bx5 p0){
       co5.o(p0, "response");
       super("UCS request failed!");
       this.a = p0;
    }
}
