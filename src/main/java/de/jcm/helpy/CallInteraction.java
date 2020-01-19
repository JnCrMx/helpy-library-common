package de.jcm.helpy;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.sql.Timestamp;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CallInteraction
{
	public int id;
	public String language;
	public String contentPath;
	public int chosenOption;
	public int callId;
	public UUID submitter;
	public Timestamp time;
}
