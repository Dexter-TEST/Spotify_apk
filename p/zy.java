package p.zy;
import java.io.Serializable;
import java.lang.String;
import java.util.TimeZone;

public abstract class zy implements Serializable	// class@002f92 from classes.dex
{
    public static final TimeZone a;

    static {
       zy.a = TimeZone.getTimeZone("UTC");
    }
}
