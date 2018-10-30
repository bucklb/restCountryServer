package bucklb.soapserver;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import hello.wsdl.Country;
import hello.wsdl.Currency;


@Component
public class CountryRepository {
    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country japan = new Country();
        japan.setName("Japan");
        japan.setCapital("Tokyo");
        japan.setCurrency(Currency.EUR);
        japan.setPopulation(46704314);

        countries.put(japan.getName(), japan);

        Country australia = new Country();
        australia.setName("Australia");
        australia.setCapital("Canberra");
        australia.setCurrency(Currency.EUR);
        australia.setPopulation(38186860);

        countries.put(australia.getName(), australia);

        Country italy = new Country();
        italy.setName("Italy");
        italy.setCapital("Rome");
        italy.setCurrency(Currency.GBP);
        italy.setPopulation(63705000);

        countries.put(italy.getName(), italy);
    }

    public Country findCountry(String name) {
        Assert.notNull(name, "The country's name must not be null");
        return countries.get(name);
    }

}
