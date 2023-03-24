import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTest {
    @Test
    public void GeoServiceImplTest() {
        Location expected = new Location("Moscow", Country.RUSSIA, "Lenina", 15);
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location result = geoService.byIp("172.0.32.11");
        Assertions.assertEquals(expected.getCountry(), result.getCountry());
    }
}
