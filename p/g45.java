package p.g45;
import p.lv1;
import java.lang.Throwable;
import java.lang.String;
import java.lang.StringBuilder;

public final class g45 extends lv1	// class@00169b from classes.dex
{
    public final Throwable P;

    public void g45(Throwable p0){
       super();
       this.P = p0;
    }
    public final String toString(){
       return "FAILURE \("+this.P.getMessage()+"\)";
    }
}
