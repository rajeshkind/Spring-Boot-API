package com.example.accessingdatamysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="agency_details")
public class Agencydetails{
  @Getter @Setter private String statecd, agency_name, type, payee_title, mailing_add, location_add, phone, fax, email, website;
 
  @Id
  @Column(name = "agency_code")
  private String agency_code;
  
  public void setAgencycode(String agency_code) {
    this.agency_code = agency_code;
  }

  public String getAgencycode() {
    return agency_code;
  }
  
}