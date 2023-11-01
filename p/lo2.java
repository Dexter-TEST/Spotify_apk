package p.lo2;
import p.mo2;
import java.lang.String;
import java.lang.Object;
import java.util.zip.Adler32;

public final class lo2 extends mo2	// class@001d8f from classes.dex
{

    public void lo2(){
       super("ADLER_32", 1, "Hashing.adler32\(\)");
    }
    public final Object get(){
       return new Adler32();
    }
}
