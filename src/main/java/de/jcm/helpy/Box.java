package de.jcm.helpy;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Box extends EntityInfo
{
	public GeoLocation location;
	public UUID operator;
	public BoxEquipment[] equipment;

	public static class BoxEquipment
	{
		public String name;
	}
}
