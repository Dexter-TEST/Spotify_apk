package p.ll7;
import java.lang.RuntimeException;
import androidx.fragment.app.Fragment;
import java.lang.String;
import java.lang.Object;
import p.co5;

public abstract class ll7 extends RuntimeException	// class@001d7a from classes.dex
{
    public final Fragment a;

    public void ll7(Fragment p0,String p1){
       co5.o(p0, "fragment");
       super(p1);
       this.a = p0;
    }
}
