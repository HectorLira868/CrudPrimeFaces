package org.controller.report;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.dao.report.DaoReport;
import org.modelo.report.Report;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class ControllerReport implements Serializable {
	private List<Report> listReports;
	private Report report;
	
	//SUPER CLASS
	public ControllerReport() {
		super();
		// TODO Auto-generated constructor stub
	}

	//GETTERS AND SETTERS DE listReports
	public List<Report> getListReports() {
		DaoReport dao = new DaoReport();
		listReports = dao.ListReport();
		return listReports;
	}

	public void setListReports(List<Report> listReports) {
		this.listReports = listReports;
	}
	
	//GETTERS AND SETTERS DE report
	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}
		
	//METHODS REPORT
	public void limpiarReport() {
		report = new Report();
	}
	
	public String agregarReport() {
		DaoReport dao = new DaoReport();
		dao.addReport(report);
		return "/index.xhtml?faces-redirect=true";
	}
	
	public String modificarReport() {
		DaoReport dao = new DaoReport();
		dao.updateReport(report);
		return "/index.xhtml?faces-redirect=true";
	}
	
	public String eliminarReport() {
		DaoReport dao = new DaoReport();
		dao.deleteReport(report);
		return "/index.xhtml?faces-redirect=true";
	}
}
