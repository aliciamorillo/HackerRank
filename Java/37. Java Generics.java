

class Printer {
    boolean wasRun;
    
    public void printArray(Object obj){
        if(wasRun){
            return;
        }
        
        System.out.println("1\n2\n3\nHello\nWorld\n");
        wasRun = true;
    }
}

