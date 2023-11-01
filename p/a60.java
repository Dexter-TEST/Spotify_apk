package p.a60;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;

public final class a60	// class@000f1c from classes.dex
{
    public final ConcurrentHashMap a;

    static {
       Pattern.compile("\\p{XDigit}+");
    }
    public void a60(){
       super();
       this.a = new ConcurrentHashMap();
    }
}
