package com.spotify.connectivity.ApplicationScope;
import com.spotify.connectivity.auth.SerializableCredentialsTransferManager;

public interface abstract ApplicationScope	// class@0005a8 from classes.dex
{

    SerializableCredentialsTransferManager getSerializableCredentialsTransferManager();
    void prepareForShutdown();
}
