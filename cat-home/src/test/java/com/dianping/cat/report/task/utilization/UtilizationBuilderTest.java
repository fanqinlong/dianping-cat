package com.dianping.cat.report.task.utilization;

import java.text.SimpleDateFormat;

import org.junit.Test;
import org.unidal.lookup.ComponentTestCase;

import com.dianping.cat.Cat;
import com.dianping.cat.Constants;
import com.dianping.cat.DomainManager;

public class UtilizationBuilderTest extends ComponentTestCase{
	
	@Test
	public void testHourlyReport() throws Exception{
		Cat.initialize("192.168.7.43");
		UtilizationReportBuilder builder = lookup(UtilizationReportBuilder.class);
		DomainManager manager = lookup(DomainManager.class);
		
		manager.initialize();
		builder.buildHourlyTask(Constants.REPORT_UTILIZATION,Constants.CAT, new SimpleDateFormat("yyyyMMddHH").parse("2013082617"));
	}
	
	@Test
	public void testDailyReport() throws Exception{
		UtilizationReportBuilder builder = lookup(UtilizationReportBuilder.class);
		DomainManager manager = lookup(DomainManager.class);
		
		manager.initialize();
		builder.buildDailyTask(Constants.REPORT_UTILIZATION, Constants.CAT, new SimpleDateFormat("yyyyMMdd").parse("20130826"));
	}

	@Test
	public void testWeeklyReport() throws Exception{
		UtilizationReportBuilder builder = lookup(UtilizationReportBuilder.class);
		DomainManager manager = lookup(DomainManager.class);
		
		manager.initialize();
		builder.buildWeeklyTask(Constants.REPORT_UTILIZATION, Constants.CAT, new SimpleDateFormat("yyyyMMdd").parse("20130717"));
	}
	
	@Test
	public void testMonthlyReport() throws Exception{
		UtilizationReportBuilder builder = lookup(UtilizationReportBuilder.class);
		DomainManager manager = lookup(DomainManager.class);
		
		manager.initialize();
		builder.buildMonthlyTask(Constants.REPORT_UTILIZATION, Constants.CAT, new SimpleDateFormat("yyyyMMdd").parse("20130701"));
	}

	
	
}
