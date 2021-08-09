package com.example.accessingdatamysql;

import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="zip_search_results")
public class Zipresults {
  
  private String zip;
  @Id
  @Column(name="agid")
  private String agid;
 

  @OneToOne
  @NotFound(action = NotFoundAction.IGNORE)
  @JoinColumn(name="agid", referencedColumnName="agency_code", insertable = false, updatable = false, foreignKey = @javax.persistence.ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
  private Agencydetails agencyDetails;  
  
  @OneToOne
  @NotFound(action = NotFoundAction.IGNORE)
  @JoinColumn(name="agid", referencedColumnName="agency_code", insertable = false, updatable = false, foreignKey = @javax.persistence.ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
  private Taxdetails taxdetails;
	
	public Agencydetails getAgencyDetails() {
		return agencyDetails;
	}
	
	public void setAgencyDetails(Agencydetails agencyDetails) {
		this.agencyDetails = agencyDetails;
	}

	public String getZip() {
	    return zip;
	  }
	
	  public void setZip(String zip) {
	    this.zip = zip;
	  }
	
	  public String getAgid() {
	    return agid;
	  }
	
	  public void setAgid(String agid) {
	    this.agid = agid;
	  }

	public Taxdetails getTaxdetails() {
		return taxdetails;
	}

	public void setTaxdetails(Taxdetails taxdetails) {
		this.taxdetails = taxdetails;
	}

}