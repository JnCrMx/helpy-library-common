package de.jcm.helpy;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.jcm.helpy.distribution.VersionInfo;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class JsonTests
{
	@Test
	public void versionInfoTest() throws IOException
	{
		VersionInfo info = new VersionInfo();
		info.releaseDate = LocalDate.now();
		info.majorVersion = info.releaseDate.get(ChronoField.YEAR);
		info.minorVersion = info.releaseDate.get(ChronoField.MONTH_OF_YEAR)*10
				+ info.releaseDate.get(ChronoField.DAY_OF_MONTH);
		info.branch = "test";
		info.filename = "abc.xyz";
		info.hash = "";

		ObjectMapper mapper = new ObjectMapper();
		String string = mapper.writeValueAsString(info);

		VersionInfo info2 = mapper.readValue(string, VersionInfo.class);

		Assert.assertEquals(info.branch, info2.branch);
		Assert.assertEquals(info.filename, info2.filename);
		Assert.assertEquals(info.hash, info2.hash);
		Assert.assertEquals(info.majorVersion, info2.majorVersion);
		Assert.assertEquals(info.minorVersion, info2.minorVersion);
		Assert.assertEquals(info.releaseDate, info2.releaseDate);
	}
}
