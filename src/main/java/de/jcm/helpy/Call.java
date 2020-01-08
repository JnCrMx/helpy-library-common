package de.jcm.helpy;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.sql.Timestamp;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Call
{
	public int id;
	public int priority;
	public GeoLocation location;
	public boolean emergencyServicesInformed;
	public Timestamp time;

	public static class DistancePriority
	{

		public double distance;
		public int priority;

		public DistancePriority(double distance, int priority)
		{
			this.distance = distance;
			this.priority = priority;
		}
	}

	@Override
	public String toString()
	{
		return "Call{" + "id=" + id +
				", priority=" + priority +
				", location=" + location +
				", emergencyServicesInformed=" + emergencyServicesInformed +
				", time=" + time +
				'}';
	}
}
