package com.spotify.connectivity.connectiontype.ConnectivityListener;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import com.spotify.connectivity.connectiontype.ConnectionType;
import com.spotify.connectivity.connectiontype.ConnectivityObserver;
import java.util.List;

public abstract class ConnectivityListener	// class@000693 from classes.dex
{
    protected final List mConnectivityObservers;

    public void ConnectivityListener(){
       super();
       this.mConnectivityObservers = new CopyOnWriteArrayList();
    }
    public abstract void destroy();
    public abstract ConnectionType getConnectionType();
    public abstract void notifyObservers();
    public void registerConnectivityObserver(ConnectivityObserver p0){
       ConnectivityListener tmConnectivi = this.mConnectivityObservers;
       _monitor_enter(tmConnectivi);
       if (this.mConnectivityObservers.isEmpty()) {
          this.setup();
       }
       this.mConnectivityObservers.add(p0);
       _monitor_exit(tmConnectivi);
       return;
    }
    public abstract void setup();
    public void unregisterConnectivityObserver(ConnectivityObserver p0){
       ConnectivityListener tmConnectivi = this.mConnectivityObservers;
       _monitor_enter(tmConnectivi);
       this.mConnectivityObservers.remove(p0);
       if (this.mConnectivityObservers.isEmpty()) {
          this.destroy();
       }
       _monitor_exit(tmConnectivi);
       return;
    }
}
