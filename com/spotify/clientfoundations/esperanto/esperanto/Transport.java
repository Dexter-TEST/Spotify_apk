package com.spotify.clientfoundations.esperanto.esperanto.Transport;
import java.lang.String;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Observable;

public interface abstract Transport	// class@00057d from classes.dex
{

    Single callSingle(String p0,String p1,byte[] p2);
    Observable callStream(String p0,String p1,byte[] p2);
    byte[] callSync(String p0,String p1,byte[] p2);
}
