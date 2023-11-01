package com.spotify.connectivity.http.ContentAccessRefreshTokenPersistentStorage;
import com.spotify.connectivity.http.ContentAccessRefreshTokenChangeListener;
import java.lang.String;

public interface abstract ContentAccessRefreshTokenPersistentStorage	// class@000729 from classes.dex
{

    void addContentAccessRefreshTokenChangeListener(ContentAccessRefreshTokenChangeListener p0);
    void clearContentAccessRefreshToken();
    String getContentAccessRefreshToken();
    boolean hasContentAccessRefreshToken();
    void removeContentAccessRefreshTokenChangeListener(ContentAccessRefreshTokenChangeListener p0);
    void storeContentAccessRefreshToken(String p0);
}
