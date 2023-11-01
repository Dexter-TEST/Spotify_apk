package p.wa7;
import android.content.ContentResolver;
import android.net.Uri;
import java.lang.String;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;

public abstract class wa7	// class@002afd from classes.dex
{

    public static ParcelFileDescriptor a(ContentResolver p0,Uri p1,String p2,CancellationSignal p3){
       return p0.openFileDescriptor(p1, p2, p3);
    }
}
