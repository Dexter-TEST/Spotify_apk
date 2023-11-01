package p.nz5;
import java.lang.RuntimeException;
import java.io.IOException;
import java.lang.Throwable;

public final class nz5 extends RuntimeException	// class@0002dd from classes2.dex
{
    public final IOException a;
    public IOException b;

    public void nz5(IOException p0){
       super(p0);
       this.a = p0;
       this.b = p0;
    }
}
