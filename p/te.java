package p.te;
import java.lang.Object;
import android.content.Context;
import java.io.File;
import java.lang.String;
import p.co5;

public final class te	// class@002759 from classes.dex
{
    public static final te a;

    static {
       te.a = new te();
    }
    public void te(){
       super();
    }
    public final File a(Context p0){
       co5.o(p0, "context");
       File noBackupFile = p0.getNoBackupFilesDir();
       co5.l(noBackupFile, "context.noBackupFilesDir");
       return noBackupFile;
    }
}
