package p.do1;
import java.lang.Object;
import android.content.Intent;
import com.spotify.allboarding.entrypoint.EntryPoint;
import java.lang.String;
import p.co5;
import java.lang.Enum;

public final class do1	// class@001383 from classes.dex
{

    public void do1(){
       super();
    }
    public static EntryPoint a(Intent p0){
       co5.o(p0, "intent");
       EntryPoint[] uEntryPointA = EntryPoint.values();
       EntryPoint dEFAULT = EntryPoint.DEFAULT;
       int intExtra = p0.getIntExtra("entry-point", dEFAULT.ordinal());
       co5.o(uEntryPointA, "<this>");
       object oobject = (intExtra >= 0 && intExtra <= (uEntryPointA.length - 1))? uEntryPointA[intExtra]: null;
       if (oobject != null) {
          dEFAULT = oobject;
       }
       return dEFAULT;
    }
}
