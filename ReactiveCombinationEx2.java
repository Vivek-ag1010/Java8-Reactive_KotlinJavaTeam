/*Using Project Reactor, implement a reactive pipeline to process a stream of sensor readings. Assume a SensorReading class with a sensor ID and a value. 
The goal is to filter readings with values greater than 10, transform the values by squaring them, and then print the results.*/

package reactiveStreams;

import java.util.*;

import reactor.core.publisher.Flux;

class SensorReading {
	String sensorId;
	int value;

	public SensorReading(String sensorId, int value) {
		super();
		this.sensorId = sensorId;
		this.value = value;
	}

	public String getSensorId() {
		return sensorId;
	}

	public void setSensorId(String sensorId) {
		this.sensorId = sensorId;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "SensorReading [sensorId=" + sensorId + ", value=" + value + "]";
	}

}
public class ReactiveCombinationEx2 {

	public static void main(String[] args) {
		Flux<SensorReading> sensorFlux = Flux.just(new SensorReading("s101", 3), new SensorReading("s105", 12),
				new SensorReading("p104", 6), new SensorReading("s109", 15), new SensorReading("s11-", 16));
		sensorFlux.filter(val -> val.getValue() > 10).map(val -> val.getValue() * val.getValue())
				.subscribe(System.out::println);
		
		

	}

}
