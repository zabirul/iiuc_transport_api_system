package Controller_layer;
import Model_layer.Bus;
import Service_layer.BusService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController

@RequestMapping("/api/buses")
public class BusController {
private final BusService busService;

// Constructor Injection
public BusController(BusService busService) {
    this.busService = busService;
}

// create Bus
@PostMapping
public Bus addBus(@RequestBody Bus bus) {
    return busService.add(bus);
}

// all bus
@GetMapping
public List<Bus> getAllBuses() {
    return busService.getAll();
}

// bus by id
@GetMapping("/{id}")
public Bus getBusById(@PathVariable Long id) {
    return busService.getById(id);
}

// update Bus
@PutMapping("/{id}")
public String updateBus(@PathVariable Long id,
                        @RequestBody Bus updatedBus) {
    return busService.update(id, updatedBus);
}

// delete Bus
@DeleteMapping("/{id}")
public String deleteBus(@PathVariable Long id) {
    return busService.delete(id);
}
}
