package programa.vc.com.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;

import programa.vc.com.Dto.ImgDto;
import programa.vc.com.Services.ImgServices;

@RestController
@RequestMapping("/img")
public class ImgController {

    @Autowired
    private ImgServices imgServices;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadImage(@RequestPart("fileImg") MultipartFile fileImg,
                                              @RequestPart("imgDto") String imgDtoString) throws IOException {
        // Converter JSON String para ImgDto
        ObjectMapper objectMapper = new ObjectMapper();
        ImgDto imgDto = objectMapper.readValue(imgDtoString, ImgDto.class);

        String imgUrl = imgServices.uploadImage(fileImg, imgDto);
        return ResponseEntity.ok(imgUrl);
    }
}



