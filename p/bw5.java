package p.bw5;
import java.lang.Exception;
import java.lang.String;
import p.bx5;
import java.lang.Object;
import p.co5;

public final class bw5 extends Exception	// class@00114c from classes.dex
{
    public final bx5 a;

    public void bw5(String p0,bx5 p1){
       co5.o(p0, "msg");
       co5.o(p1, "response");
       super(p0);
       this.a = p1;
    }
}
