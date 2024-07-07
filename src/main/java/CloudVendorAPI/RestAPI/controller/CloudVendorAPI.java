package CloudVendorAPI.RestAPI.controller;

import CloudVendorAPI.RestAPI.model.CloudVendor;
import CloudVendorAPI.RestAPI.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPI {

    CloudVendorService cloudVendorService;

    public CloudVendorAPI(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    // To get a record by VendorId
    @GetMapping("{vendor_id}")
    public CloudVendor getCloudVendor(@PathVariable("vendor_id") String VendorId) {
        return cloudVendorService.getCloudVendor(VendorId);
    }

    @GetMapping
    public List<CloudVendor> getCloudVendor() {
        return cloudVendorService.getAllCloudVendor();
    }

    // To add a new record
    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor added successfully!";
    }

    // To update existing records
    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor) {
       cloudVendorService.updateCloudVendor(cloudVendor);
        return "Updated the vendor successfully!";
    }

    // To delete a record by VendorId
    @DeleteMapping("{vendor_id}")
    public String deleteCloudVendor(@PathVariable("vendor_id") String VendorId) {
        cloudVendorService.deleteCloudVendor(VendorId);
        return "Deleted Vendor!!";
    }
}
