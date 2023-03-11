package com.example.firstdynamic.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.example.firstdynamic.Repo.repodetails1;
import com.example.firstdynamic.payload.logindetails;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import com.example.firstdynamic.Entity.ZohoInvoice;
@Service
public class reportservice  {

	@Autowired
	private repodetails1 repo2;
	
	public String exportreport(String reportformat) throws FileNotFoundException, JRException
	{
		List<ZohoInvoice> zohoinvoice = repo2.findAll();
		String path = "C:\\Users\\shanawaz\\Desktop";
		
		File file = ResourceUtils.getFile("classpath:reports\\invoice1.jrxml");
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(zohoinvoice);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("createdby", "zoho");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		/*if(reportformat.equalsIgnoreCase("html"))
		{
			JasperExportManager.exportReportToHtmlFile(jasperPrint, path+"\\invoice1.html");
		}
		if(reportformat.equalsIgnoreCase("pdf"))
		{*/
			JasperExportManager.exportReportToPdfFile(jasperPrint,path+"\\invoice1.pdf");	


       return "report generated in : "+path;
		
	}

	public logindetails getUserByUserId(String userid) {
		// TODO Auto-generated method stub
		return null;
	}
}
