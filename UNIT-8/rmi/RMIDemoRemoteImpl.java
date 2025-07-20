import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIDemoRemoteImpl extends UnicastRemoteObject implements RMIDemoRemoteInterface {
    protected RMIDemoRemoteImpl() throws RemoteException {
        super();
    }

    @Override
    public String sendMessage() throws RemoteException {
        return "Hello, BSc. CSIT 7th!!!";
    }

    @Override
    public int sum(int a, int b) throws RemoteException {
        return a+b;
    }
}
