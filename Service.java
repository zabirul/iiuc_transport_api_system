package Service_layer;

import Model_layer.Bus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusService
 {
    private List<Bus> busList = new ArrayList<>();
    private Long nextId = 100L;

    // Add kora jabe
    public Bus add(Bus bus) 
    {
        bus.setId(nextId++);
        busList.add(bus);
        return bus;
    }
    // Get All (full list)
    public List<Bus> getAll() 
    {
        return busList;
    }
    // Get By Id (check kora jabe)
    public Bus getById(Long id) 
    {
        for (Bus bus : busList) 
            {
            if (bus.getId().equals(id)) 
            {
                return bus;
            }
        }
        return null;
    }
    // Update korba
    public String update(Long id, Bus updatedBus) 
    {
        for (Bus bus : busList) 
            {
            if (bus.getId().equals(id))
            {
                bus.setBusName(updatedBus.getBusName());
                bus.setRouteName(updatedBus.getRouteName());
                bus.setCapacity(updatedBus.getCapacity());
                return "Bus Updated Successfully";
            }
        }
        return "Bus Not Found";
    }
    // Delete kora jabe
    public String delete(Long id)
     {
        for (int i = 0; i < busList.size(); i++)
            {
            if (busList.get(i).getId().equals(id)) 
            {
                busList.remove(i);
                return "Bus Deleted Successfully";
            }
        }
        return "Bus Not Found";
    }
}
