package CloudVendorAPI.RestAPI.service;

import CloudVendorAPI.RestAPI.model.CloudVendor;
import CloudVendorAPI.RestAPI.repository.CloudVendorRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{
    CloudVendorRepo cloudVendorRepo;

    public CloudVendorServiceImpl(CloudVendorRepo cloudVendorRepo) {
        this.cloudVendorRepo = cloudVendorRepo;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepo.save(cloudVendor);
        return "Success!";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepo.save(cloudVendor);
        return "Updated!";
    }

    @Override
    public String deleteCloudVendor(String VendorId) {
        cloudVendorRepo.deleteById(VendorId);
        return "Deleted";
    }

    @Override
    public CloudVendor getCloudVendor(String VendorId) {
        return cloudVendorRepo.findById(VendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepo.findAll();
    }
}
