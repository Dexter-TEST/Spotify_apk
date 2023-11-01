package p.ox;
import p.nx;
import java.util.Set;
import java.util.Collections;

public abstract class ox	// class@0021b0 from classes.dex
{
    public static final byte[] a;
    public static final Set b;

    static {
       ox.a = new byte[62]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
       ox.b = Collections.unmodifiableSet(new nx());
    }
    public static int a(byte[] p0,int p1){
       return ((p0[(p1 + 3)] & 0x00ff) | ((((p0[p1] & 0x00ff) << 24) | ((p0[(p1 + 1)] & 0x00ff) << 16)) | ((p0[(p1 + 2)] & 0x00ff) << 8)));
    }
}
