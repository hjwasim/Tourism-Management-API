package in.hjwasim.tourismdb.models;

/**
 * @author Hjwasim
 */
public enum PlacesEnums {
    ANDAMAN("Andaman"),
    THAILAND("Thailand"),
    DUBAI("Dubai"),
    SINGAPORE("Singapore"),
    MALAYSIA("Malaysia");

    private final String places;
    PlacesEnums(String places){
        this.places = places;
    }
}
