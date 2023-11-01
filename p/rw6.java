package p.rw6;
import java.io.Closeable;
import p.nw6;
import java.lang.String;

public interface abstract rw6 implements Closeable	// class@002572 from classes.dex
{

    nw6 Y();
    void close();
    String getDatabaseName();
    void setWriteAheadLoggingEnabled(boolean p0);
}
