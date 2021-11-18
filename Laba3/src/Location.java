import java.util.*;
/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }
    public boolean equals(Object O) {
        if (this == O) return true;
        if (getClass() != O.getClass()) return false;
        Location location = (Location) O;
        return xCoord == location.xCoord && yCoord == location.yCoord;
    }
    public int hashCode()
    {
        int result = 29; // Простое число

// используется другое простое число для перемножения
        result = 31 * result + xCoord* 29;
        result = 31 * result + yCoord;
        return result;
    }
}

