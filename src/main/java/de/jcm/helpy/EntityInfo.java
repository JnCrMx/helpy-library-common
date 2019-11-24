package de.jcm.helpy;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.UUID;

public class EntityInfo
{
	public UUID uuid;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public String role;
}
