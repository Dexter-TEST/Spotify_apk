package p.a08;
import p.oy7;
import java.util.Arrays;

public final class a08 extends oy7	// class@000eed from classes.dex
{
    public final byte[] b;

    public void a08(byte[] p0){
       super(Arrays.copyOfRange(p0, 0, 25));
       this.b = p0;
    }
    public final byte[] k(){
       return this.b;
    }
}
