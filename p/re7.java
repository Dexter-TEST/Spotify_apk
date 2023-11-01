package p.re7;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class re7 extends IllegalArgumentException	// class@0024d2 from classes.dex
{

    public void re7(int p0,int p1){
       super("Unpaired surrogate at index "+p0+" of "+p1);
    }
}
