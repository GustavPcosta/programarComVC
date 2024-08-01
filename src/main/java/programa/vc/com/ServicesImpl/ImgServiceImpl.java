package programa.vc.com.ServicesImpl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.google.cloud.storage.Blob;
import com.google.cloud.storage.Bucket;
import com.google.firebase.cloud.StorageClient;

import programa.vc.com.Dto.ImgDto;
import programa.vc.com.Repository.ImgRepository;
import programa.vc.com.Repository.UsuarioRepository;
import programa.vc.com.Services.ImgServices;
import programa.vc.com.model.Img;
import programa.vc.com.model.Usuario;

@Service
public class ImgServiceImpl implements ImgServices {

    @Autowired
    private ImgRepository imgRepository;

    @Autowired
    private UsuarioRepository userRepository;

    @Override
    public String uploadImage(MultipartFile fileImg, ImgDto imageUploadDto) throws IOException {
        
        Usuario user = userRepository.findById(imageUploadDto.getId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        
        String fileName = fileImg.getOriginalFilename();
        Bucket bucket = StorageClient.getInstance().bucket();
        Blob blob = bucket.create(fileName, fileImg.getBytes(), fileImg.getContentType());

        
        Img image = new Img();
        image.setImagePath(blob.getMediaLink());
        image.setData(imageUploadDto.getData());
        image.setDescricao(imageUploadDto.getDescricao());
        image.setUsuario(user);
        imgRepository.save(image);

        return blob.getMediaLink();
    }

    @Override
    public void save(Img image) {
        imgRepository.save(image);
    }
}

