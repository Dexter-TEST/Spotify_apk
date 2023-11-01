package p.mf3;
import java.io.IOException;
import java.lang.String;
import java.lang.IndexOutOfBoundsException;
import java.lang.Throwable;
import p.en6;

public class mf3 extends IOException	// class@001e84 from classes.dex
{

    public void mf3(){
       super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
    public void mf3(IndexOutOfBoundsException p0){
       super("CodedOutputStream was writing to a flat byte array and ran out of space.", p0);
    }
    public void mf3(String p0){
       super(p0);
    }
    public void mf3(String p0,IndexOutOfBoundsException p1){
       super(en6.n("CodedOutputStream was writing to a flat byte array and ran out of space.: ", p0), p1);
    }
}
