package p.hc7;
import java.lang.RuntimeException;
import java.lang.String;

public final class hc7 extends RuntimeException	// class@001827 from classes.dex
{

    public void hc7(){
       super("Message was missing required fields.  \(Lite runtime could not determine which fields were missing\).");
    }
}
