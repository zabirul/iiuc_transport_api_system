package Model_layer;

public class Bus {
  // bus er information store kora
     private Long id;
     private String busNumber;
     private String busDriverName;
     private String routeName;
     private String busSchedule;
     private int capacity;

 // Default Constructor
      public Bus() {
 }   // Parameterized Constructor
   //parameter charai object create korar jonno, eita na thakle object create kora jabe na error dekhabe entity object create korar jonno ei no argument constructor ta lage
 public Bus(Long id, String busNumber, String busDriverName,
       String routeName, String busSchedule, int capacity) {
       //parameterized constructor sob man initialize korar jonno
     this.id = id;
     this.busNumber = busNumber;
     this.busDriverName = busDriverName;
     this.routeName = routeName;
     this.busSchedule = busSchedule;
     this.capacity = capacity;
 }

 // Getter and Setter ID
   //bair theke paoa read ba access korar jonno ekhane get ba id er value access korbe
    public Long getId() {
        return id;
    }
//get korar por set korar jonno
    public void setId(Long id) {
        this.id = id;
    }

    // Get and Set Bus Number
     public String getBusNumber() {
       return busNumber;
    }

    public void setBusNumber(String busNumber) {
      this.busNumber = busNumber;
    }

    // Getter and Setter BusDriver Name
    public String getBusDriverName() {
        return busDriverName;
      }
    public void setBusDriverName(String busDriverName) {
     this.busDriverName = busDriverName;
    }

    // Getter and Setter Route Name
     public String getRouteName(){
      return routeName;
     }

    public void setRouteName(String routeName){
     this.routeName = routeName;
     }
// Getter and Setter Bus Schedule
     public String getBusSchedule()  {
      return busSchedule;
     }

    public void setBusSchedule(String busSchedule){
      this.busSchedule = busSchedule;
     }
// Getter and Setter for Capacity
     public int getCapacity(){
      return capacity;
     }
    public void setCapacity(int capacity){
      this.capacity = capacity;
     }
}
