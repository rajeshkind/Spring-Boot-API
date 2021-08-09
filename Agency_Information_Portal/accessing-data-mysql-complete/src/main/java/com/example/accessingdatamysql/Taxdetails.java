package com.example.accessingdatamysql;

import lombok.Getter;
import lombok.Setter;

import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="agency_details")
public class Taxdetails {
	@Getter @Setter private String taxercode, controlled_agency, curr_tax_yr, sale_date, tax_yr_start_month, redemption_per, last_updated, auc_date, last_verified, for_tax_yr;
	@Getter @Setter private String third_party_lien, num_inst, num_bills, due_date, bill_rel_date, disc_date, bill_req_date, post_mark, dup_bill_fee, home_auth_req, validations;
	@Getter @Setter private String print_pattern, assessor_name, assessor_code, contact_name, contact_method, contact_title, office_hrs, assessor_mail_add, assessor_loca_add, assessor_phone, assessor_email, assessor_fax, assessor_website;
	@Id
	  @Column(name = "agency_code")
	  private String agency_code;
	
	public String getAgencycode() {
		return agency_code;
	}
	public void setAgencycode(String agency_code) {
		this.agency_code = agency_code;
	}
}
