package p.bs2;
import java.lang.RuntimeException;
import p.bx5;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.StringBuilder;
import p.cx5;

public class bs2 extends RuntimeException	// class@000184 from classes2.dex
{
    public final int a;
    public final bx5 b;

    public void bs2(bx5 p0){
       Objects.requireNonNull(p0, "response == null");
       bx5 a = p0.a;
       super("HTTP "+a.t+" "+a.c);
       bx5 a1 = p0.a;
       this.a = a1.t;
       this.b = p0;
    }
}
