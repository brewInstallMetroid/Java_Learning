public class HasPrecipitation implements WeatherFilter {
	public Boolean check(Weather w) {
		return (w.getPrecipitation() > 0);
	}
}

