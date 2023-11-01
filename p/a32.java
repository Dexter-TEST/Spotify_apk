package p.a32;
import java.io.File;
import java.lang.String;

public abstract class a32 extends File	// class@000f05 from classes.dex
{

    public void a32(String p0){
       super(p0);
    }
    public abstract a32[] a();
    public abstract boolean canRead();
    public abstract boolean canWrite();
    public abstract boolean createNewFile();
    public abstract boolean delete();
    public abstract boolean exists();
    public abstract String getAbsolutePath();
    public abstract String getCanonicalPath();
    public abstract String getName();
    public abstract String getPath();
    public abstract boolean isDirectory();
    public abstract boolean isFile();
    public abstract long lastModified();
    public abstract long length();
    public File[] listFiles(){
       return this.a();
    }
    public abstract boolean mkdir();
    public abstract boolean setLastModified(long p0);
}
