package p.ix1;
import java.io.FileDescriptor;
import android.system.Os;

public abstract class ix1	// class@001a1f from classes.dex
{

    public static void a(FileDescriptor p0){
       Os.close(p0);
    }
    public static FileDescriptor b(FileDescriptor p0){
       return Os.dup(p0);
    }
    public static long c(FileDescriptor p0,long p1,int p2){
       return Os.lseek(p0, p1, p2);
    }
}
