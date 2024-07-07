package CloudVendorAPI.RestAPI.repository;

import CloudVendorAPI.RestAPI.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepo extends JpaRepository<CloudVendor,String> {
}
