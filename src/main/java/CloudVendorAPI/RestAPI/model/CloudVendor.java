package CloudVendorAPI.RestAPI.model;

import jakarta.persistence.*;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {
    @Id
    @Column(name = "vendor_id")
    private String vendor_id;
    @Column(name = "vendor_name")
    private String vendor_name;
    @Column(name = "vendor_address")
    private String vendor_address;
    @Column(name = "vendor_contact")
    private String vendor_contact;

    public CloudVendor() {
    }

    public CloudVendor(String vendorId, String vendor_name, String vendor_address, String vendor_contact) {
        this.vendor_id = vendorId;
        this.vendor_name = vendor_name;
        this.vendor_address = vendor_address;
        this.vendor_contact = vendor_contact;
    }

    public String getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(String vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getVendor_address() {
        return vendor_address;
    }

    public void setVendor_address(String vendor_address) {
        this.vendor_address = vendor_address;
    }

    public String getVendor_contact() {
        return vendor_contact;
    }

    public void setVendor_contact(String vendor_contact) {
        this.vendor_contact = vendor_contact;
    }
}


