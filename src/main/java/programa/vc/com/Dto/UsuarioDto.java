package programa.vc.com.Dto;

public class UsuarioDto { 

    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private ImgDto imgDto;

   
    public UsuarioDto() {}

    
    public UsuarioDto(Long id, String nome, String email, String cpf, ImgDto imgDto) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.imgDto = imgDto;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ImgDto getImgDto() {
        return imgDto;
    }

    public void setImgDto(ImgDto imgDto) {
        this.imgDto = imgDto;
    }

    
    @Override
    public String toString() {
        return "UsuarioDto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", imgDto=" + imgDto +
                '}';
    }
}
