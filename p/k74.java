package p.k74;
import p.g0;
import java.security.MessageDigest;
import p.fo2;
import java.lang.String;
import p.ap5;
import p.co2;
import java.util.Arrays;

public final class k74 extends g0	// class@001bbd from classes.dex
{
    public final MessageDigest E;
    public final int F;
    public boolean G;

    public void k74(MessageDigest p0,int p1){
       super();
       this.E = p0;
       this.F = p1;
    }
    public final fo2 B(){
       k74 tF;
       ap5.j("Cannot re-use a Hasher after calling hash\(\) on it", (this.G ^ 1));
       this.G = true;
       k74 tE = this.E;
       co2 uoco2 = ((tF = this.F) == tE.getDigestLength())? new co2(tE.digest()): new co2(Arrays.copyOf(tE.digest(), tF));
       return uoco2;
    }
    public final void Y(byte[] p0,int p1){
       ap5.j("Cannot re-use a Hasher after calling hash\(\) on it", (this.G ^ 0x01));
       this.E.update(p0, 0, p1);
    }
}
