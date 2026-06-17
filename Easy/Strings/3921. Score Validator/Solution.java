class Solution {
    public int[] scoreValidator(String[] events) {
        int score = 0;
        int counter = 0;

        for(String event : events){

            if(counter == 10)
                break;

            switch(event) {
                case "0" :
                case "1" :
                case "2" :
                case "3" :
                case "4" :
                case "6" :
                    score += Integer.parseInt(event);
                    break;

                case "W" : counter++;
                    break;

                case "WD" : 
                case "NB" :
                    score++;
                    break;
            }
        }

        return new int[] {score, counter};
    }
}
