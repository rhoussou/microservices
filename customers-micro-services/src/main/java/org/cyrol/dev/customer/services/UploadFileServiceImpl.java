package org.cyrol.dev.customer.services;

import java.io.BufferedOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Service
public class UploadFileServiceImpl implements UploadFileService  {

	@Override
	public void SingleFileUpload(MultipartHttpServletRequest request,String id, String UPLOADED_FOLDER) 
			throws IOException {
		
		 Iterator<String> itr = request.getFileNames();
	      MultipartFile file = request.getFile(itr.next());
	      String extension = FilenameUtils.getExtension(file.getOriginalFilename());
	      String fileName = id +"."+ extension;
	      System.out.println("sdfzezefzefzcrfzcfzffzefffzfze" +fileName);
	      File dir = new File(UPLOADED_FOLDER);
	      if (dir.isDirectory()) {
	        File serverFile = new File(dir, fileName);
	        BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
	        stream.write(file.getBytes());
	        stream.close();
	      }
	}

}