package com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlobOrBuilder;
import p.u74;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob$BlobCase;
import p.s74;
import com.spotify.connectivity.auth.common.esperanto.proto.EsEncryptedStoredCredentials$EncryptedStoredCredentials;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials;

public interface abstract EsAuthBlob$AuthBlobOrBuilder implements u74	// class@00061a from classes.dex
{

    EsAuthBlob$AuthBlob$BlobCase getBlobCase();
    s74 getDefaultInstanceForType();
    EsEncryptedStoredCredentials$EncryptedStoredCredentials getStoredCredentials();
    EsUnencryptedStoredCredentials$UnencryptedStoredCredentials getUnencryptedStoredCredentials();
    boolean hasStoredCredentials();
    boolean hasUnencryptedStoredCredentials();
    boolean isInitialized();
}
