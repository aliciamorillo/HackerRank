
    
    Difference(int[] elements){
        this.elements = elements;
    }
    
    void computeDifference(){
        int max = Arrays.stream(elements).max().getAsInt();
        int min = Arrays.stream(elements).min().getAsInt();     
        maximumDifference = max - min ;
    }

