package p.nb2;
import android.content.ContentResolver;
import android.net.Uri;
import java.lang.String;
import java.lang.Object;
import android.database.Cursor;
import android.os.CancellationSignal;

public abstract class nb2	// class@001fa3 from classes.dex
{

    public static Cursor a(ContentResolver p0,Uri p1,String[] p2,String p3,String[] p4,String p5,Object p6){
       return p0.query(p1, p2, p3, p4, p5, p6);
    }
}
