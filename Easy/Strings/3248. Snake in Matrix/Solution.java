class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {

        int next = 0;

        for(String command : commands){
            
            switch(command){

                case "UP": 
                    next -=n;
                    break;
                
                case "DOWN":
                    next += n;
                    break;
                
                case "LEFT":
                    next--;
                    break;

                case "RIGHT":
                    next++;
                    break;
            }
        }

        return next;
    }
}
