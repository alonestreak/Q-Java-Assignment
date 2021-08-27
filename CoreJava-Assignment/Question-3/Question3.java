class FetchData extends Thread {
	public void run() {
		try {
            System.out.println("started FetchData thread");
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e);
		}
        System.out.println("Thread FetchData completed execution");
	}
}

class ProcessData implements Runnable{  
    public void run(){ 
        try{
            System.out.println("started ProcessData thread");
        }
        catch(Exception e){
            System.out.println(e);     
        }  
        System.out.println("Thread ProcessData completed execution");
    }  
}

 class Main {
    static long startTime = System.currentTimeMillis();
    public static void main(String args[]){  
        try{
            Thread fetchData= new FetchData();
            ProcessData p1= new ProcessData();
            Thread processData= new Thread(p1);

            processData.setPriority(Thread.MIN_PRIORITY);  
            fetchData.setPriority(Thread.MAX_PRIORITY);


            fetchData.start();
            fetchData.join(10000);
            processData.start();
        }catch(Exception e){
            System.out.println(e);
        }
    }  
}

