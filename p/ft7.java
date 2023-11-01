package p.ft7;
import java.util.Comparator;
import java.lang.Object;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.lang.String;

public final class ft7 implements Comparator	// class@001637 from classes.dex
{
    public static final ft7 a;

    static {
       ft7.a = new ft7();
    }
    public void ft7(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return p0.b.compareTo(p1.b);
    }
}
