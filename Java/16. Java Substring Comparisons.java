

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        String newString = s.substring(0,k);
        
        smallest = newString;
        largest = newString;
        
        for(int i=0; i<s.length()-k+1; i++){
            if(s.substring(i,i+k).compareTo(smallest) < 0) smallest = s.substring(i,i+k);
            if(s.substring(i,i+k).compareTo(largest) > 0) largest = s.substring(i,i+k);
        }
        
        return smallest + "\n" + largest;
    }
