package programa.vc.com.Services;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import programa.vc.com.Dto.ImgDto;

import programa.vc.com.model.Img;
public interface ImgServices {
	    void save(Img image);
	    String uploadImage(MultipartFile fileImg, ImgDto imageUploadDto) throws IOException;
	}

