public class Lasagna {
    
        public int expectedMinutesInOven() {
            int EXPECTED_MINUTES_IN_OVEN = 40;
                return EXPECTED_MINUTES_IN_OVEN;
        } 
       
    
        public int remainingMinutesInOven(int x) {

            int REMAINING_MINUTES_IN_OVEN = 40 - x;
            return REMAINING_MINUTES_IN_OVEN ;
        }
    
       public int preparationTimeInMinutes(int x) {
           return  x * 2;
       }

    
    public int totalTimeInMinutes(int x, int y) {
        return (x * 2) + y;
    }

}
