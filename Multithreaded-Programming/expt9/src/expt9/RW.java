
import java.util.logging.Level;
import java.util.logging.Logger;

class Database
{
    private int readers;
    public Database() { this.readers=0; }
    public void read(int number)
    {
        synchronized(this)
        {
            this.readers++;
            System.out.println(" Reader "+number+" starts reading");
        }
        final int DELAY=5000;
        try{
            Thread.sleep((int)(Math.random()*DELAY));
        }
        catch(InterruptedException e) {}
        synchronized(this)
        {
            System.out.println(" Reader "+number+" stops reading");
            this.readers--;
            if(this.readers==0)
                this.notifyAll();
        }
    }
    public synchronized void write(int number) throws InterruptedException
    {
        while(this.readers!=0)
            this.wait();
        System.out.println(" Writer "+number+" starts writing");
        final int DELAY=5000;
        try{
            Thread.sleep((int)(Math.random()*DELAY));
        }
        catch(InterruptedException e){
            this.notifyAll();
        }
    }
}
class Reader extends Thread
{
    private static int readers=0;
    private int number;
    private Database db;
    public Reader(Database db){
        this.db=db;
        this.number=Reader.readers++;
    }
    @Override
    public void run()
    {
        while(true)
        {
            final int DELAY=5000;
            try{
                Thread.sleep((int)(Math.random()*DELAY));
            }
            catch(InterruptedException e){
                this.notifyAll();
            }
            this.db.read(this.number);
        }
    }
}
class Writer extends Thread
{
    private static int writers=0;
    private int number;
    private Database db;
    public Writer(Database db){
        this.db=db;
        this.number=Writer.writers++;
    }
    @Override
    public void run()
    {
        while(true)
        {
            try{
                final int DELAY=5000;
                try{
                    Thread.sleep((int)(Math.random()*DELAY));
                }
                catch(InterruptedException e){
                    this.notifyAll();
                }
                this.db.write(this.number);
            }
            catch(InterruptedException ex){
                Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
/*public class ReadersWriters {
	public static void main(String args[])
	{
		new Database();
	}
}*/