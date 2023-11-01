package p.kc6;
import p.by5;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class kc6 extends by5	// class@001beb from classes.dex
{

    public void kc6(Fragment p0,Fragment p1,int p2){
       co5.o(p0, "fragment");
       co5.o(p1, "targetFragment");
       super(1, p0, "Attempting to set target fragment "+p1+" with request code "+p2+" for fragment "+p0);
    }
}
