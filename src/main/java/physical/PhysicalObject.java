package physical;

import lib.Location;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import people.Human;

@Getter
@Setter
@AllArgsConstructor
public abstract class PhysicalObject {
    private Human owner;
    private Location location;
}
