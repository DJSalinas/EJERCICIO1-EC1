package pe.edu.idat.dsw1soapJ19;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Dias;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class DiasRepository {
    
    private static final Map<String, Dias> dias = new HashMap<>();

	@PostConstruct
	public void initData() {
		Dias monday = new Dias();
		monday.setName("Monday");
		monday.setTraduction("Lunes");

		dias.put(monday.getName(), monday);

		Dias tuesday = new Dias();
		tuesday.setName("Thuesday");
		tuesday.setTraduction("Martes");

		dias.put(tuesday.getName(), tuesday);

		Dias wednesday = new Dias();
		wednesday.setName("Wednesday");
		wednesday.setTraduction("Miercoles");

		dias.put(wednesday.getName(), wednesday);

		Dias thursday = new Dias();
		thursday.setName("Thursday");
		thursday.setTraduction("Jueves");

		dias.put(thursday.getName(), thursday);

		Dias friday = new Dias();
		friday.setName("Friday");
		friday.setTraduction("Viernes");

		dias.put(friday.getName(), friday);

		Dias saturday = new Dias();
		saturday.setName("Saturday");
		saturday.setTraduction("Sabado");

		dias.put(saturday.getName(), saturday);

		Dias sunday = new Dias();
		sunday.setName("Sunday");
		sunday.setTraduction("Domingo");

		dias.put(sunday.getName(), sunday);
		}

	public Dias findDia(String name) {
		Assert.notNull(name, "El dia no existe");
		return dias.get(name);
	}


}
