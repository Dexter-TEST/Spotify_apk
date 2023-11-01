package p.ss5;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import p.ts5;
import java.util.regex.Pattern;
import p.co5;

public final class ss5 implements Serializable	// class@00268f from classes.dex
{
    public final String a;
    public final int b;

    public void ss5(String p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    private final Object readResolve(){
       Pattern pattern = Pattern.compile(this.a, this.b);
       co5.l(pattern, "compile\(pattern, flags\)");
       return new ts5(pattern);
    }
}
