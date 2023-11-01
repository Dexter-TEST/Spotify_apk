package p.q08;
import java.lang.String;
import android.net.Uri;
import android.net.Uri$Builder;

public abstract class q08	// class@00230b from classes.dex
{
    public static final int a;

    static {
       Uri.parse("https://plus.google.com/").buildUpon().appendPath("circles").appendPath("find").build();
    }
}
