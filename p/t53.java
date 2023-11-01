package p.t53;
import java.util.concurrent.Callable;
import p.uv1;
import java.lang.Object;
import java.lang.String;
import p.co5;
import androidx.work.impl.WorkDatabase;
import p.ej4;
import p.li5;
import p.ki5;
import java.lang.Long;
import java.lang.Integer;

public final class t53 implements Callable	// class@002702 from classes.dex
{
    public final uv1 a;
    public final int b;
    public final int c;

    public void t53(uv1 p0,int p1){
       super();
       this.a = p0;
       this.b = 0;
       this.c = p1;
    }
    public final Object call(){
       t53 tb;
       t53 ta = this.a;
       co5.o(ta, "this$0");
       int i = ej4.b(ta.b, "next_job_scheduler_id");
       int i1 = ((tb = this.b) <= i && i <= this.c)? 1: 0;
       if (!i1) {
          ta.b.u().g(new ki5("next_job_scheduler_id", Long.valueOf((long)(tb + 1))));
          i = tb;
       }
       return Integer.valueOf(i);
    }
}
