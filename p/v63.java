package p.v63;
import java.io.Serializable;
import com.google.common.collect.f;
import java.lang.Object;
import com.google.common.collect.c;
import com.google.common.collect.b;

public final class v63 implements Serializable	// class@00298e from classes.dex
{
    public final b a;

    public void v63(f p0){
       super();
       this.a = p0;
    }
    public Object readResolve(){
       return this.a.a();
    }
}
