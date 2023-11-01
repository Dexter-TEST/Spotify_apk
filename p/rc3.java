package p.rc3;
import java.io.IOException;
import java.lang.String;
import java.lang.Throwable;
import p.qc3;

public class rc3 extends IOException	// class@0024bc from classes.dex
{
    public boolean a;
    public static final int b;

    public void rc3(IOException p0){
       super(p0.getMessage(), p0);
    }
    public void rc3(String p0){
       super(p0);
    }
    public static rc3 a(){
       return new rc3("Protocol message contained an invalid tag \(zero\).");
    }
    public static rc3 b(){
       return new rc3("Protocol message had invalid UTF-8.");
    }
    public static qc3 c(){
       return new qc3();
    }
    public static rc3 d(){
       return new rc3("CodedInputStream encountered a malformed varint.");
    }
    public static rc3 e(){
       return new rc3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
    public static rc3 f(){
       return new rc3("Failed to parse the message.");
    }
    public static rc3 g(){
       return new rc3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
