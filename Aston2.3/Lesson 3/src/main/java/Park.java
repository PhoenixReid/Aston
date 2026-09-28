public class Park {
    private String namePark;
    private Attraction[] attractions;
    public Park(String name, Attraction[] attraction){
        this.namePark = name;
        this.attractions = attraction;
    }

    public static  class Attraction{
        private String name;
        private String workingHours;
        private String price;

        public Attraction(String name, String workingHours, String price){
          this.name = name;
          this.workingHours = workingHours;
          this.price = price;
        }
    }
}
