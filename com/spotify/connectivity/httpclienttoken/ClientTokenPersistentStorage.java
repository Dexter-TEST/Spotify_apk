package com.spotify.connectivity.httpclienttoken.ClientTokenPersistentStorage;
import java.lang.String;

public interface abstract ClientTokenPersistentStorage	// class@000737 from classes.dex
{

    void clearClientToken();
    String getEncryptedClientToken();
    void storeEncryptedClientToken(String p0);
}
