package org.cyrol.dev.customer.services;

import java.io.IOException;
import org.springframework.web.multipart.MultipartHttpServletRequest;


public interface UploadFileService {
	
	public void SingleFileUpload(MultipartHttpServletRequest request,String id, String uploadpath ) throws IOException;
	
}
