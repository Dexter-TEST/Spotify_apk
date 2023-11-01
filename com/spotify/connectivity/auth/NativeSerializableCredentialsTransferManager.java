package com.spotify.connectivity.auth.NativeSerializableCredentialsTransferManager;
import com.spotify.connectivity.auth.SerializableCredentialsTransferManager;
import java.lang.Object;
import com.spotify.connectivity.auth.SerializableCredentials;
import java.lang.String;

public final class NativeSerializableCredentialsTransferManager implements SerializableCredentialsTransferManager	// class@000600 from classes.dex
{

    public void NativeSerializableCredentialsTransferManager(){
       super();
    }
    public native SerializableCredentials transferCredentialsForDeviceId(SerializableCredentials p0,String p1);
}
