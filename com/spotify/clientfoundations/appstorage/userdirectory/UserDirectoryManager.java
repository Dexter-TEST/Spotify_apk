package com.spotify.clientfoundations.appstorage.userdirectory.UserDirectoryManager;
import java.lang.String;

public interface abstract UserDirectoryManager	// class@000549 from classes.dex
{

    String getCachePath();
    String getSettingsPath();
    String makeCachePath(String p0);
    String makeSettingsPath(String p0);
}
