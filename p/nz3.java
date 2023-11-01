package p.nz3;
import p.tx;
import p.nn0;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.t63;
import p.ci3;
import java.util.zip.ZipFile;
import java.util.zip.ZipEntry;
import java.io.InputStream;

public final class nz3 extends tx	// class@00207b from classes.dex
{

    public void nz3(nn0 p0){
       co5.o(p0, "fileFactory");
       super(p0);
    }
    public final ci3 b(t63 p0){
       t63 b;
       InputStream inputStream = ((b = p0.b) != null)? b.getInputStream(p0.c): null;
       return new ci3(inputStream);
    }
}
