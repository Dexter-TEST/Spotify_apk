package p.vr6;
import java.lang.Exception;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;

public final class vr6 extends Exception	// class@002a50 from classes.dex
{

    public void vr6(Exception p0){
       super("Error thrown initializing StaticLayout "+p0.getMessage(), p0);
    }
}
