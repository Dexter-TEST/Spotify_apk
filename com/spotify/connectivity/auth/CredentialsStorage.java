package com.spotify.connectivity.auth.CredentialsStorage;
import java.lang.String;
import java.util.List;
import com.spotify.connectivity.auth.CredentialsStorage$StoredCredentialsAndUsername;
import com.spotify.connectivity.auth.SerializableCredentials;

public interface abstract CredentialsStorage	// class@0005f2 from classes.dex
{

    void deleteStoredCredentials();
    void forgetRememberMe(String p0);
    boolean getRememberMeMode();
    List getSavedUsernames();
    CredentialsStorage$StoredCredentialsAndUsername getStoredCredentials();
    SerializableCredentials getStoredCredentialsForUser(String p0);
    void saveLoginDetails(SerializableCredentials p0,String p1,boolean p2);
    void setRememberMeMode(String p0,boolean p1);
}
