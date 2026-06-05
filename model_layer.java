package com.iiuc.transport.model;

public class TransportSchedule {

    // bus er information store kora
    private Long id;
    private String busNumber;
    private String routeName;
    private String driverName;
    private Integer capacity;
    private String schedule;     
    private String semester;      
   //parameter charai object create korar jonno, eita na thakle object create kora jabe na error dekhabe entity object create korar jonno ei no argument constructor ta lage
    public TransportSchedule() {}
   //parameterized constructor sob man initialize korar jonno
    public TransportSchedule(Long id, String busNumber, String routeName,String driverName, Integer capacity,String schedule, String semester) {
       //object er bitor data boshano hoi
        this.id = id;
        this.busNumber = busNumber;
        this.routeName = routeName;
        this.driverName = driverName;
        this.capacity = capacity;
        this.schedule = schedule;
        this.semester = semester;
    }
   //bair theke paoa read ba access korar jonno ekhane get ba id er value access korbe
    public Long getId() {
         return id; 
        }
    public void setId(Long id) { 
        this.id = id;
     }

    public String getBusNumber() { 
        return busNumber; 
    }
    public void setBusNumber(String busNumber) { 
        this.busNumber = busNumber;
    }

    public String getRouteName() { 
        return routeName; 
    }
    public void setRouteName(String routeName) { 
        this.routeName = routeName;
    }

    public String getDriverName() {
         return driverName; 
        }
    public void setDriverName(String driverName) {
         this.driverName = driverName; 
        }

    public Integer getCapacity() {
         return capacity; 
        }
    public void setCapacity(Integer capacity) {
         this.capacity = capacity; 
        }

    public String getSchedule() { 
        return schedule; 
    }
    public void setSchedule(String schedule) { 
        this.schedule = schedule;
    }

    public String getSemester() { 
        return semester; 
    }
    public void setSemester(String semester) { 
        this.semester = semester;
     }
}
