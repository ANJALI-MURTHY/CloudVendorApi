package CloudVendorAPI.RestAPI.service;

import CloudVendorAPI.RestAPI.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String VendorId);
    public  CloudVendor getCloudVendor(String VendorId);
    public List<CloudVendor> getAllCloudVendor();
}
