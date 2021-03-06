package cars;
/**
 * Lotus is the abstract bases class for all Lotus cars created
 * Extends from Car() class;
 * Calculates the fuel consumption and pollution /100km 
 * implements 2 abstract methods: calculateFuelConsumptionAlgorithm() and getCo2Emissions(); 
 */
public abstract class Lotus extends Car {
/**
 * Constructor for the Lotus clas;
 * @param fuelTankSize
 * @param fuelType
 * @param maxNumberOfGears
 * @param availableFuel
 */
	public Lotus(float fuelTankSize, String fuelType, int maxNumberOfGears, float availableFuel) {
		super(fuelTankSize, fuelType, maxNumberOfGears, availableFuel);
	}

	/**
	 * Calculates the fuel consumed/100km this trip;
	 */
	@Override
	protected float calculateFuelConsumption(float tripLength, int gear) {
		float fuelConsumed = calculateFuelConsumptionAlgorithm(gear)/100 * tripLength;
		return fuelConsumed;
	}
	
	protected abstract float calculateFuelConsumptionAlgorithm(int gear);
	/**
	 * Calculates the average pollution/100km created this trip;
	 */
	protected float calculatePollution(float tripLength,float fuelConsumed){
		float avarageFuelConsumptionPer100KmThisTrip = fuelConsumed / tripLength *100;
		return getCo2Emissions(avarageFuelConsumptionPer100KmThisTrip);
	}
	
	protected abstract float getCo2Emissions(float currentFuelConsumption);

}
