package com.spotify.connectivity.auth.SerializableCredentialsTransferManager;
import com.spotify.connectivity.auth.SerializableCredentials;
import java.lang.String;

public interface abstract SerializableCredentialsTransferManager	// class@000612 from classes.dex
{

    SerializableCredentials transferCredentialsForDeviceId(SerializableCredentials p0,String p1);
}
