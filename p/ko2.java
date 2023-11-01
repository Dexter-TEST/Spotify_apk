package p.ko2;
import p.mo2;
import java.lang.String;
import java.lang.Object;
import java.util.zip.CRC32;

public final class ko2 extends mo2	// class@001c50 from classes.dex
{

    public void ko2(){
       super("CRC_32", 0, "Hashing.crc32\(\)");
    }
    public final Object get(){
       return new CRC32();
    }
}
