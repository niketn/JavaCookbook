class Store{
    private int products;
    Store(){
        products=0;
    }
    public void produce(int number){
        System.out.println("Production started by producer "+number);
        final int DELAY=5000;
        try{
            Thread.sleep((int)(Math.random()*DELAY));
        }
        catch(InterruptedException e){}
        synchronized(this){
            this.products++;
            System.out.println("Produced product by producer "+number);
            this.notifyAll();
        }
    }
    public void consume(int number){
        synchronized(this){
            System.out.println("Consumption demand by consumer "+number);
            while(this.products==0){
            try{
                    this.wait();
            }
            catch(InterruptedException e){}
            }
            this.products--;
            System.out.println("Consumed product by consumer "+number);
        }
        final int DELAY=5000;
        try{
            Thread.sleep((int)(Math.random()*DELAY));
        }
        catch(InterruptedException e){}
    }
}
class Producer extends Thread{
    static int producers=0;
    int number;
    Store store;
    Producer(Store s){
        this.number=Producer.producers++;
        this.store=s;
    }
    @Override
    public void run(){
        while(true){
            final int DELAY=5000;
            try{
                Thread.sleep((int)(Math.random()*DELAY));
            }
            catch(InterruptedException e){}
            this.store.produce(number);
        }
    }
}
class Consumer extends Thread{
    static int consumers=0;
    int number;
    Store store;
    Consumer(Store s){
        this.number=Consumer.consumers++;
        this.store=s;
    }
    @Override
    public void run(){
        while(true){
            final int DELAY=5000;
            try{
                Thread.sleep((int)(Math.random()*DELAY));
            }
            catch(InterruptedException e){}
            this.store.consume(number);
        }
    }
}






public class ProducersAndConsumers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 Store store=new Store();
	        Producer p[]=new Producer[3];
	        Consumer c[]=new Consumer[3];
	        for(int i=0;i<3;i++)
	        {
	            c[i]=new Consumer(store);
	            c[i].start();
	            p[i]=new Producer(store);
	            p[i].start();
	        }
		
	}

}
