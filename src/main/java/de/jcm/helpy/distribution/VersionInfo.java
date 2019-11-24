package de.jcm.helpy.distribution;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VersionInfo
{
	public String branch;

	public int majorVersion;
	public int minorVersion;

	@JsonIgnore
	public LocalDate releaseDate;

	public String filename;
	public String hash;

	@JsonIgnore
	public File directory;

	@JsonSetter(value="releaseDate")
	public void setReleaseDate(String date)
	{
		releaseDate = LocalDate.from(DateTimeFormatter.ISO_DATE.parse(date));
	}

	@JsonGetter(value="releaseDate")
	public String getReleaseDate()
	{
		return DateTimeFormatter.ISO_DATE.format(releaseDate);
	}
}
