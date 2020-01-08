package de.jcm.helpy;

public class GeoLocation
{
	public double latitude;
	public double longitude;

	private String toDegreeString(double d)
	{
		double degrees = Math.floor(d);
		double minutes = Math.floor(60.0*(d-degrees));
		double seconds = 3600.0 * (d-degrees) - 60 * minutes;

		return degrees +"° "+minutes+"' "+seconds+"''";
	}

	@Override
	public String toString()
	{
		char lat = latitude<0?'S':'N';
		char lon = latitude<0?'E':'W';

		return toDegreeString(latitude)+" "+lat+", "+toDegreeString(longitude)+" "+lon;
	}
}
