package p.sg1;
import android.view.inputmethod.InputContentInfo;
import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.EditorInfo;
import java.lang.String;

public abstract class sg1	// class@002620 from classes.dex
{

    public static ClipDescription a(InputContentInfo p0){
       return p0.getDescription();
    }
    public static Uri b(InputContentInfo p0){
       return p0.getLinkUri();
    }
    public static void c(EditorInfo p0,String[] p1){
       p0.contentMimeTypes = p1;
    }
    public static void d(InputContentInfo p0){
       p0.requestPermission();
    }
    public static String[] e(EditorInfo p0){
       return p0.contentMimeTypes;
    }
    public static Uri f(InputContentInfo p0){
       return p0.getContentUri();
    }
}
