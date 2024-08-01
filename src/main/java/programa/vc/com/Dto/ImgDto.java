package programa.vc.com.Dto;

import java.time.LocalDate;

public class ImgDto{ 

    private Long id;
    private String imagePath;
    private LocalDate data;
    private String descricao;
    
    public LocalDate getData() {
		return data;
	}


	

	


	public void setData(LocalDate data) {
		this.data = data;
	}




	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public ImgDto() {}

  

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    
    @Override
    public String toString() {
        return "ImgDto{" +
                "id=" + id +
                ", imagePath='" + imagePath + '\'' +
                '}';
    }




}

