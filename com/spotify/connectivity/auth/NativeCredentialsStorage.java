package com.spotify.connectivity.auth.NativeCredentialsStorage;
import com.spotify.connectivity.auth.CredentialsStorage;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.spotify.connectivity.auth.CredentialsStorage$StoredCredentialsAndUsername;
import com.spotify.connectivity.auth.SerializableCredentials;

public final class NativeCredentialsStorage implements CredentialsStorage	// class@0005fc from classes.dex
{
    private long nThis;

    private void NativeCredentialsStorage(){
       super();
    }
    public native void deleteStoredCredentials();
    public native final void destroy();
    public native void forgetRememberMe(String p0);
    public native boolean getRememberMeMode();
    public native List getSavedUsernames();
    public native CredentialsStorage$StoredCredentialsAndUsername getStoredCredentials();
    public native SerializableCredentials getStoredCredentialsForUser(String p0);
    public native void saveLoginDetails(SerializableCredentials p0,String p1,boolean p2);
    public native void setRememberMeMode(String p0,boolean p1);
}
